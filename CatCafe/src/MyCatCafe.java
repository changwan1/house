//导入数组，随机数
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
//接口实现类
public class MyCatCafe implements CatCafe {
    //定义猫咖内的变量
    private double money;
    double cost = 15;
    double earn = 0;
    //方法重载
    OrangeCat orangeCat = new OrangeCat();
    BlackCat blackCat = new BlackCat();
    WhiteCat whiteCat = new WhiteCat();
    Customer customer = new Customer();
    //定义列表
    ArrayList<Cat> catList;
    ArrayList<Customer> customerList;
    //set方法设定初始金额
    public void setMoney(double money) {
        this.money = money;
    }
    //buyCat方法的重写
    @Override
    public void buyCat(String variety, String name0, int age0, boolean isMale0) {
        //猫种类的判断(没有输出price，因为我觉得这不应该是猫猫信息(可以输出))
        if(Objects.equals(variety, "橘猫")) {
            orangeCat.name = name0;
            orangeCat.age = age0;
            orangeCat.isMale = isMale0;
            catList.add(new OrangeCat(orangeCat.name, orangeCat.age, orangeCat.isMale));
            money = money - 200;
        }

        if(Objects.equals(variety, "黑猫")) {
            blackCat.name = name0;
            blackCat.age = age0;
            blackCat.isMale = isMale0;
            catList.add(new BlackCat(blackCat.name, blackCat.age ,blackCat.isMale));
            money = money - 350;
        }

        if(Objects.equals(variety, "白猫")) {
            whiteCat.name = name0;
            whiteCat.age = age0;
            whiteCat.isMale = isMale0;
            catList.add(new WhiteCat(whiteCat.name, whiteCat.age, whiteCat.isMale));
            money = money - 400;
        }
        //对异常抛出的判断
        if (money<0){
            try {
                throw new InsufficientBalanceException();
            } catch (InsufficientBalanceException e) {
                System.out.println("InsufficientBalanceException=>"+e);
            }
        }
    }
    //opening接待顾客方法的重写
    @Override
    public void opening(String name0, int times0, LocalDate date) {
        //对异常抛出的判断
        if (catList.size()<1){
            try {
                throw new CatNotFoundException();
            } catch (CatNotFoundException e) {
                System.out.println("CatNotFoundException=>"+e);
            }
        }
        //顾客信息
        customer.name = name0;
        customer.times = times0;
        customer.date = date;
        customerList.add(new Customer(customer.name, customer.times, customer.date));
        //随机rua猫猫
        for(int i = 1; i <= times0; i++) {
            Random rua = new Random();
            int n = rua.nextInt(catList.size());
            System.out.println(catList.get(n));
        }
        System.out.println("===========================================================================================");
        //将利润加到店内总金额，避免倒闭
        money += times0 * cost;
        //计算当天利润
        if (Objects.equals(customer.date, LocalDate.now())) {
            earn += times0 * cost;
        }
    }
    //close 关门歇业方法的重写
    @Override
    public void close() {
        System.out.println("夜深了，关门了......" + '\n' + "===========================================================================================");
        System.out.println("今天光顾的顾客有：");
        for (Customer value : customerList) {
            //对顾客到店时间的判断
            if (Objects.equals(value.date, LocalDate.now())) {
                System.out.println(value);
            }
        }
        System.out.println("今天的利润为:" + earn + "元");
    }
}
