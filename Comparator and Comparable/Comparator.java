import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    Student(String name,int age){
        this.age=age;
        this.name=name;
    }

    public String toString(){
        return "[ Name="+name+", Age="+age+" ]";
    }
}

class Comp {
    public static void main(String[] args){

        List<Student> std = new ArrayList<>();

        Comparator<Student> b = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                return (i.age % 10) - (j.age % 10);
            }
        };

        std.add(new Student("Apple",30));
        std.add(new Student("Ram",21));
        std.add(new Student("Car",73));
        std.add(new Student("Game",54));

        std.sort(b);

        for(Student i : std){
            System.out.println(i);
        }
    }
}
