import java.util.*;
public class Day1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(80);

        System.out.println(list.get(2));

        for(int x:list){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(list.contains(5));
        System.out.println(list.contains(20));

        System.out.println("using for loop");

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.remove(1);
        System.out.println(list);
        list.set(1,51);
        System.out.println(list);



    }


}
