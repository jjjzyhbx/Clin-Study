package Swing.userData;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 这是一个从本地文件导入学生信息的工具类
 * 方法1，提供打开文件方法
 * 方法2，提供读取文件内容，按行读取
 * 方法3，提供将json文件转换成类的功能，自己设计的
 * 方法4....
 */
public class utils {
    /**
     * 打开文件
     * @param filePath 文件路径
     * @return 文件对象
     */
    public static File openFile(String filePath) {
        File file = new File(filePath);
        return file;
    }

    /**
     * 读取文件内容，按行读取
     *
     * @param file 文件对象
     * @return 文件内容的字符串列表
     * @throws IOException
     */
    //未解决栈溢出问题
    public static List<String> readFile(File file) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        return lines;
    }

//    /**
//     * 将json字符串转换成类的功能
//     *
//     * @param jsonStr json字符串
//     * @param clazz   目标类
//     * @param <T>     泛型,表示目标类的类型
//     * @return 目标类对象
//     */
//    public static <T> T jsonToClass(String jsonStr, Class<T> clazz) {
//        try {
//            T obj = clazz.newInstance();
//            String[] jsonArray = jsonStr.split(",");
//            for (String jsonElement : jsonArray) {
//                String[] entry = jsonElement.split(":");
//                String key = entry[0].trim();
//                String value = entry[1].trim();
//
//                Field field = clazz.getDeclaredField(key);
//                field.setAccessible(true);
//
//                String type = field.getType().getSimpleName();
//                if ("String".equals(type)) {
//                    field.set(obj, value);
//                } else if ("int".equals(type)) {
//                    field.setInt(obj, Integer.parseInt(value));
//                } else if ("double".equals(type)) {
//                    field.setDouble(obj, Double.parseDouble(value));
//                }
//            }
//            return obj;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    /**
     * 将json字符串转换成类的功能
     *
     * @param jsonStr json字符串
     * @param clazz   目标类
     * @return 目标类对象
     */
    public static Object jsonToClass(String jsonStr, Class<?> clazz) {
        try {
            Object obj = clazz.newInstance();
            String[] jsonArray = jsonStr.split(",");
            for (String jsonElement : jsonArray) {
                String[] entry = jsonElement.split(":");
                String key = entry[0].trim();
                String value = entry[1].trim();

                Field field = clazz.getDeclaredField(key);
                field.setAccessible(true);

                Class<?> fieldType = field.getType();
                if (fieldType == String.class) {
                    field.set(obj, value);
                } else if (fieldType == int.class || fieldType == Integer.class) {
                    field.setInt(obj, Integer.parseInt(value));
                } else if (fieldType == double.class || fieldType == Double.class) {
                    field.setDouble(obj, Double.parseDouble(value));
                } else if (fieldType == float.class || fieldType == Float.class) {
                    field.setFloat(obj, Float.parseFloat(value));
                } else if (fieldType == boolean.class || fieldType == Boolean.class) {
                    field.setBoolean(obj, Boolean.parseBoolean(value));
                } else if (fieldType == long.class || fieldType == Long.class) {
                    field.setLong(obj, Long.parseLong(value));
                } else if (fieldType == short.class || fieldType == Short.class) {
                    field.setShort(obj, Short.parseShort(value));
                } else if (fieldType == byte.class || fieldType == Byte.class) {
                    field.setByte(obj, Byte.parseByte(value));
                } else {
                    Object fieldObj = jsonToClass(value, fieldType);
                    field.set(obj, fieldObj);
                }
            }
            return clazz.cast(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 将对象转换为json字符串
     *
     * @param obj 任意对象
     * @return json字符串
     */
    public static String objectToJson(Object obj) {
        StringBuilder json = new StringBuilder();
        Class<?> clazz = obj.getClass();
        json.append("{");

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            String value = null;

            try {
                Object fieldValue = field.get(obj);
                if (fieldValue != null) {
                    Class<?> type = fieldValue.getClass();
                    if (type == String.class) {
                        value = "\"" + fieldValue + "\"";
                    } else if (type == int.class || type == double.class || type == float.class) {
                        value = fieldValue.toString();
                    } else {
                        value = objectToJson(fieldValue);
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            if (value != null) {
                json.append("\"").append(name).append("\":").append(value).append(",");
            }
        }
        json.deleteCharAt(json.length() - 1);
        json.append("}");

        return json.toString();
    }
}