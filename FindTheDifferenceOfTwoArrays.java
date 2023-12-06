public class FindTheDifferenceOfTwoArrays {
    class Solution {
        public List<List<Integer>> findDifference(int[] num1, int[] num2) {
            HashSet<Integer>set1 = new HashSet<>();
            HashSet<Integer>set2 = new HashSet<>();
            for(int i=0;i<num1.length;i++){
                set1.add(num1[i]);
            }
            for(int i=0;i<num2.length;i++){
                set2.add(num2[i]);
            }
            List<Integer>list1 = new ArrayList<>();
            List<Integer>list2 = new ArrayList<>();

            for (int num : set1) {
                if (!set2.contains(num)) {
                    list1.add(num);
                }
            }
            for (int num : set2) {
                if (!set1.contains(num)) {
                    list2.add(num);
                }
            }

            List<List<Integer>> list = new ArrayList<>();
            list.add(list1);
            list.add(list2);
            return list;
        }
    }
}
