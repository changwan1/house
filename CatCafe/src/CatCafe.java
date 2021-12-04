import java.time.LocalDate;

//接口
public interface CatCafe {
    //抽象方法
    void buyCat(String variety, String name0, int age0, boolean isMale0);
    void opening(String name, int times, LocalDate date);
    void close();
}
