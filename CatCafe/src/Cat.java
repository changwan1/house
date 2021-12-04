//定义抽象类
public abstract class Cat {
    //变量
    public String name;
    public int age;
    public boolean isMale;
    public double price;
    //全参构造
    public Cat(String name,int age,boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    //构造器
    public Cat() {
    }

    //toString
    @Override
    public abstract String toString();
}