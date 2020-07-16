/*
Created by: shepardcmndr
Date: 24.06.2020
Comments:
*/

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
    }

    public int[] front11(int[] a, int[] b) {
        int[] res = new int[0];
        if (a != null && a.length > 0) {
            res = new int[1];
            res[0] = a[0];
        }
        if (b != null && b.length > 0)
            if (res.length == 1)
                res = new int[]{res[0], b[0]};
            else
                res = new int[]{b[0]};
        return res;
    }

    public int[] make2(int[] a, int[] b) {
        if (a.length > 1)
            return new int[] {a[0], a[1]};
        else if (a.length == 1)
            return new int[] {a[0], b[0]};
        else
        return new int[] {b[0], b[1]};
    }

    public boolean unlucky1(int[] nums) {
        if (nums == null || nums.length < 2)
            return false;
        return (nums[0] == 1 && nums[1] == 3) || ((nums[1] == 1 && nums[2] == 3)) ||
                ((nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3));
    }

    public int[] frontPiece(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;
        if (nums.length <= 2)
            return nums;
        return new int[] {nums[0], nums[1]};
    }

    public int maxTriple(int[] nums) {
        int mid = nums.length / 2;
        return Math.max(nums[0], Math.max(nums[mid], nums[nums.length - 1]));
    }

    public int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[] {nums[mid - 1], nums[mid], nums[mid + 1]};
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] res = new int[4];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
            res[i + 2] = b[i];
        }
        return res;
    }

    public int[] makeMiddle(int[] nums) {
        int middle = nums.length / 2;
        return new int[] {nums[middle - 1], nums[middle]};
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0, sumB = 0;
        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sumB += b[i];
        }
        if (sumA >= sumB)
            return a;
        else return b;
    }

    public int start1(int[] a, int[] b) {
        int counter = 0;
        if (a != null && a.length > 0) {
            if (a[0] == 1) {
                counter++;
            }
        }
        if (b != null && b.length > 0) {
            if (b[0] == 1) {
                counter++;
            }
        }
        return counter;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (i < nums.length - 1 && nums[i + 1] == 3)
                    nums[i + 1] = 0;
            }
        }
        return nums;
    }

    public boolean double23(int[] nums) {
        if (nums == null || nums.length < 2)
            return false;
        int counter2 = 0;
        int counter3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2)
                counter2++;
            else if (nums[i] == 3)
                counter3++;

            if (counter2 == 2 || counter3 == 2)
                return true;
        }
        return false;
    }

    public int[] makeLast(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int[] res = new int[nums.length * 2];
        res[res.length - 1] = nums[nums.length - 1];
        return res;
    }

    public boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 2 || nums[i] == 3)
                return false;
        }
        return true;
    }

    public boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3)
                return true;
        }
        return false;
    }

    public int[] makeEnds(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        return new int[] {nums[0], nums[nums.length - 1]};
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }

    public int sum2(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1) return nums[0];
        return nums[0] + nums[1];
    }

    public int[] maxEnd3(int[] nums) {
        if (nums == null || nums.length < 2)
            return nums;
        int max = Math.max(nums[0], nums[nums.length - 1]);
        Arrays.fill(nums, max);
        return nums;
    }

    public int[] reverse3(int[] nums) {
        if (nums == null || nums.length < 2)
            return nums;
        int[] reverse = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            reverse[reverse.length - 1 - i] = nums[i];
        }
        return reverse;
    }

    public int[] rotateLeft3(int[] nums) {
        int buff = nums[0];
        System.arraycopy(nums, 1, nums, 0, nums.length - 1);
        nums[nums.length - 1] = buff;
        return nums;
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] +  nums[2];
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int[] makePi() {
        return new int[] {3, 1, 4};
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length < 1) return false;
        return nums[0] == nums[nums.length - 1];
    }

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
