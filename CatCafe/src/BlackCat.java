//继承Cat
public class BlackCat extends Cat{
    //父类构造
    public BlackCat() {
        super();
    }
    //含参方法
    public BlackCat(String name, int age, boolean isMale) {
        super(name, age, isMale);
        this.price = 350;
    }
    //抽象方法重写
    @Override
    public String toString() {
        return  name +
                "被狠狠的rua了{" +
                "姓名：" + name +
                ", 年龄：" + age + "岁" +
                ", 是不是雄性：" + isMale +
                '}';
    }
}
