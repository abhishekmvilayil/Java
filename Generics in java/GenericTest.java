import java.util.ArrayList;
class Car<T>{
    ArrayList<T> ab=new ArrayList<>();

    public void add(T value){
        ab.add(value);
    }

}

public class GenericsTest {
    public static void main(String[] args){
        Car <String>c=new Car();
        c.add("a");
        Car <Integer>i=new Car();
        System.out.println(c.ab);
        i.add(1);
        i.add(5);
        i.add(12);
        System.out.println(i.ab);
    }
}
