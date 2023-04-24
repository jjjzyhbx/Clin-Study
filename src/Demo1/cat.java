package Demo1;

public class cat extends animal{
    @Override
    public void eat() {
        System.out.println(this.getColor()+"猫猫吃东西");
    }

    public cat() {
    }
}
