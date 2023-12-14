package java8;

import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        countMoves(Arrays.asList(5,6,8,8,5));
    }
    public static long countMoves(List<Integer> numbers) {
        int count = 0;

        boolean eq = Collections.frequency(numbers, numbers.get(0)) == numbers.size();
        if (eq == true) {
            return 0;
        }

        List<Integer> nlst = numbers;
        System.out.println(nlst);
        System.out.println("  **** "+ Collections.frequency(nlst, nlst.get(0)) == nlst.size()+"");
        boolean eqcheck = Collections.frequency(nlst, nlst.get(0)) == nlst.size();
        if (!eqcheck) {
            nlst= new ArrayList<>(nlst.size());
            for (int num : numbers) {
                int max = !numbers.isEmpty() ? numbers.stream().mapToInt(n -> n).max().orElseThrow(NoSuchElementException::new):0;
                if (max != num) {
                    numbers.add(num++);
                    count++;
                }
            }

        }
        return count;
    }
}
