import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static void main(String[]args){
        Map<String,Integer> b=new HashMap<>();
        b.put("A",1);
        b.put("B",2);
        b.put("C",3);
        b.put("D",4);
        b.put("E",5);

        System.out.println(b.values());
        System.out.println();
        System.out.println(b);

        for(Map.Entry<String, Integer> e:b.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println();

        for(String j:b.keySet()){
            System.out.println(b.get(j));
        }

        System.out.println();
        System.out.println(b.size());
        System.out.println(b.containsKey("B"));
        System.out.println(b.remove("B"));
        System.out.println(b);
    }
}
