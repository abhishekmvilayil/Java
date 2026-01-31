import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>{
    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }

    int age;
    String name;
    public Person(String name,int age){
        this.age=age;
        this.name=name;

    }

  public String toString(){
        return "[Name="+name+", Age="+age+"]";
   }
}
 public class Comparablee {
public static void main(String[] args){
    List<Person> pr=new ArrayList<>();
    pr.add(new Person("Ram",25));
    pr.add(new Person("John",30));
    pr.add(new Person("Bk",11));
    pr.add(new Person("Aj",9));
    Collections.sort(pr);
    for(Person s:pr)
        System.out.println(s);

}
}
