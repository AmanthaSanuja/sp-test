import java.util.*;
class p2{

    static void combineLists(List<String> list1, List<Integer> list2){
        List<String> combinedList = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++){
            combinedList.add(list1.get(i) );
            combinedList.add(String.valueOf(list2.get(i)));
        }
        System.out.println(combinedList);
    }

    public static void main(String args[]){
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        combineLists(list1, list2);

    }
}
