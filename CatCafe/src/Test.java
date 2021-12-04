//导入DayOfWeek来对顾客到店进行判断
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Test {

    //已测试两个异常的抛出

    public static void main(String[] args) {
        MyCatCafe myCatCafe = new MyCatCafe();
        myCatCafe.setMoney(1000);
        myCatCafe.catList = new ArrayList<>();
        myCatCafe.customerList = new ArrayList<>();
        //店里本来就有的猫猫
        myCatCafe.catList.add(new WhiteCat("白白", 5, true));
        myCatCafe.catList.add(new OrangeCat("小橘", 2, false));
        myCatCafe.catList.add(new BlackCat("大黑", 4, false));
        //新买进的猫猫
        myCatCafe.opening("晓", 4, LocalDate.now().with(DayOfWeek.MONDAY));
        myCatCafe.buyCat("橘猫", "小黄", 2, true);
        myCatCafe.opening("森", 7, LocalDate.now().with(DayOfWeek.FRIDAY));
        myCatCafe.buyCat("黑猫", "小黑", 3, false);
        myCatCafe.buyCat("白猫", "小白", 5, true);
        myCatCafe.opening("宇", 10, LocalDate.now());
        myCatCafe.buyCat("白猫", "大白", 4, true);
        myCatCafe.opening("文", 2, LocalDate.now());
        myCatCafe.close();
    }
}