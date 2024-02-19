import java.util.*;

public class Hash {
    public static void main(String[] args) {

        Hashtable<String, String> table = new Hashtable<>(21);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squid ward");
        table.put("777", "Garry");

        for (String key : table.keySet()) {
            System.out.println(key.hashCode()% 21 + "\t" + key + "\t" + table.get(key));
        }


        Queue<Double> myQ = new LinkedList<>();

        myQ.offer(1.5);
        myQ.offer(2.0);
        myQ.offer(3.0);
        while (!myQ.isEmpty()){
            System.out.println(myQ.poll());
        }
    }
}
