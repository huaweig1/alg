public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        boolean isOver = false;
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (hMap.get(numbers[i]) != null) {
                if (2*numbers[i] == target) {
                    result[0] = hMap.get(numbers[i]);
                    result[1] = i + 1;
                    isOver = true;
                }
            } else {
                hMap.put(numbers[i], i+1);
            }
        }
        if (!isOver) {
            for (Map.Entry<Integer, Integer> entry: hMap.entrySet()) {
                Integer key = entry.getKey();
                if (hMap.get(target-key) != null) {
                    result[0] = hMap.get(key);
                    result[1] = hMap.get(target-key);
                }
            }
        }
        
        if (result[0] > result[1]) {
            int tmp = result[0];
            result[0] = result[1];
            result[1] = tmp;
        }
        return result;
    }
}

