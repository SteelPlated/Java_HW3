
import java.util.ArrayList;

public class MinMax {
    public static void main(String[] args) {
        Integer sum = 0;
        int min = 9999;
        int max = -9999;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.round((Math.random() * 50) - 25));
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i)+" | ");
            sum += list.get(i);
            if (min>list.get(i)) {
                min=list.get(i);
            }
            if (max<list.get(i)) {
                max=list.get(i);
            }
        }
        
        double total = sum.doubleValue() / list.size();
        
        System.out.println();
        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println("среднее арифметическое: " + total); 
    }
}  

