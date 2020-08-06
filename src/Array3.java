/*
Created by: shepardcmndr
Date: 04.08.2020
Comments:
*/

import java.util.ArrayList;
import java.util.List;

public class Array3 {
    public static void main(String[] args) {
    }

    public int countClumps(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1;) {
            int temp;
            if (nums[i] == nums[i + 1]) {
                temp = nums[i];
                do {
                    i++;
                } while (i < nums.length && temp == nums[i]);
                counter++;
            } else {
                i++;
            }
        }
        return counter;
    }

    public int maxMirror(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return 0;
        int maxCount = 1;
        boolean flag = false;

        for (int i = 0; i < len; i++)
        {
            int tempCount = 1;
            int count = i;

            for (int j = len - 1; j >= 0 && (count < len); j--)
            {
                if (nums[count] == nums[j] && !flag)
                {
                    flag = true;
                    count++;
                    continue;
                }
                if (nums[count] == nums[j] && flag)
                {
                    tempCount++;
                    count++;
                    maxCount = Math.max(tempCount, maxCount);
                    continue;
                }
                if (nums[i] != nums[j] && flag)
                {
                    flag = false;
                    count = i;
                    tempCount = 1;
                    continue;
                }
                if (j == count || (j-count) == 1)
                {
                    flag = false;
                    break;
                }

            }
        }
        return maxCount;
    }

    public int[] seriesUp(int n) {
        int[] result = new int[n * (n  + 1) / 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                result[index] = j;
                index++;
            }
        }
        return result;
    }

    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - (n - i); j++) {
                result[(i * n) - j] = j;
            }
        }
        return result;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true;
        }
        int counter = 0;
        for (int i = 0 ; i < outer.length; i++) {
            if (outer[i] == inner[counter]) {
                counter++;
            }
            if (counter == inner.length) {
                return true;
            }
        }
        return counter == inner.length;
    }

    public boolean canBalance(int[] nums) {
        int beginning = nums[0];
        int end = 0;
        for (int i = 1; i < nums.length; i++) {
            end += nums[i];
        }
        if (beginning == end) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            beginning += nums[i];
            end -= nums[i];
            if (beginning == end) {
                return true;
            }
        }
        return false;
    }

    public int[] fix45(int[] nums) {
        List<Integer> fours = new ArrayList<>();
        List<Integer> fifths = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                if (nums[i + 1] != 5) {
                    fours.add(i);
                } else {
                    i++;
                }
            } else if (nums[i] == 5) {
                fifths.add(i);
            }
        }

        for (int i = 0; i < fours.size(); i++) {
            int temp = nums[fours.get(i) + 1];
            nums[fours.get(i) + 1] = nums[fifths.get(i)];
            nums[fifths.get(i)] = temp;
        }

        return nums;
    }

    public int[] fix34(int[] nums) {
        List<Integer> threes = new ArrayList<>();
        List<Integer> fours = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                threes.add(i);
            } else if (nums[i] == 4) {
                fours.add(i);
            }
        }

        for (int i = 0; i < threes.size(); i++) {
            int temp = nums[threes.get(i) + 1];
            nums[threes.get(i) + 1] = nums[fours.get(i)];
            nums[fours.get(i)] = temp;
        }

        return nums;
    }

    public int maxSpan(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxSpan = 0;
        List<Integer> checked = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!checked.contains(nums[i])) {
                checked.add(nums[i]);
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == nums[i] && maxSpan < (j - i)) {
                        maxSpan = j - i;
                    }
                }
            }
        }

        return maxSpan + 1;
    }
}
