import java.util.*;
public class massiv {
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(16);
        numbers.add(45);
        numbers.add(12);
        numbers.add(35);
        numbers.add(42);
        
        System.out.println("Начальный массив: " + numbers);
        
        for (int i = 0; i <= numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println("Этот номер удален: " + numbers.get(i));
                numbers.remove(i);
            }
        }
        
        System.out.println("Итог: " + numbers);
    }
    }

