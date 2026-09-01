import java.util.*;
import java.util.stream.*;

class p4 {

    static void formedNumber(List<Integer> list2) {

        List<Integer> list = new ArrayList<>();
        String formedNumber;

        System.out.println("The array before splitting the elements is: ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < list2.size(); i++) {
            // check the if the current element have multiple digits
            if (list2.get(i) > 9) {
                int temp = list2.get(i);
                int j = 0;
                while (temp > 0) {
                    list.add(temp % 10);
                    temp = temp / 10;
                    j++;
                }
            } else {
                list.add(list2.get(i));
            }
        }

        // sorted array in descending order
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        formedNumber = list.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println("The formed number is: " + formedNumber);

    }

    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(50, 2, 1, 9);
        formedNumber(list);
    }

}