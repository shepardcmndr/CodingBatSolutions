public class Recursion2 {
    public static void main(String[] args) {

    }

    public boolean split53(int[] nums) {
        return ftSplitterHelper(0, 0, 0, nums);
    }

    public boolean ftSplitterHelper(int start, int gr1, int gr2, int[] nums) {
        if (start >= nums.length) {
            return gr1 == gr2;
        }
        if (nums[start] % 5 == 0) {
            if (ftSplitterHelper(start + 1, gr1 + nums[start], gr2, nums)) {
                return true;
            }
        } else if (nums[start] % 3 == 0) {
            if (ftSplitterHelper(start + 1, gr1, gr2 + nums[start], nums)) {
                return true;
            }
        } else if (ftSplitterHelper(start + 1, gr1 + nums[start], gr2, nums)) {
            return true;
        } else if (ftSplitterHelper(start + 1, gr1, gr2 + nums[start], nums)) {
            return true;
        }

        return false;
    }

    public boolean splitOdd10(int[] nums) {
        return oddSplitterHelper(0, 0, 0, nums);
    }

    public boolean oddSplitterHelper(int start, int gr1, int gr2, int[] nums) {
        if (start >= nums.length) {
            if ((gr1 % 10  == 0 && gr2 % 2 == 1) || (gr2 % 10 == 0 && gr1 % 2 == 1)) {
                return true;
            } else {
                return false;
            }
        }


        if (oddSplitterHelper(start + 1, gr1 + nums[start], gr2, nums)) {
            return true;
        }
        if (oddSplitterHelper(start + 1, gr1, gr2 + nums[start], nums)) {
            return true;
        }

        return false;
    }

    public boolean splitArray(int[] nums) {
        return arraySplitterHelper(0, 0, 0, nums);
    }

    public boolean arraySplitterHelper(int start, int gr1, int gr2, int[] nums) {
        if (start >= nums.length) {
            return gr1 == gr2;
        }


        if (arraySplitterHelper(start + 1, gr1 + nums[start], gr2, nums)) {
            return true;
        }
        if (arraySplitterHelper(start + 1, gr1, gr2 + nums[start], nums)) {
            return true;
        }

        return false;
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }

        int endOfTheLine = start;
        int sum = 0;
        while (endOfTheLine < nums.length && nums[start] == nums[endOfTheLine]) {
            endOfTheLine++;
            sum += nums[start];
        }
        if (groupSumClump(endOfTheLine, nums, target - sum)) return true;
        if (groupSumClump(endOfTheLine, nums, target)) return true;

        return false;
    }
}
