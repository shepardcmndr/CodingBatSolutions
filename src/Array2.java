/*
Created by: shepardcmndr
Date: 13.07.2020
Comments:
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2 {
    public static void main(String[] args) {
    }

    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];

        for (int i = start; i < end; i++) {
            int pointer = i - start;
            if (i % 3 == 0) {
                result[pointer] = "Fizz";
                if (i % 5 == 0) {
                    result[pointer] += "Buzz";
                }
            } else if (i % 5 == 0) {
                result[pointer] = "Buzz";
            } else {
                result[pointer] = String.valueOf(i);
            }
        }

        return result;
    }

    public int[] evenOdd(int[] nums) {
        List<Integer> sorted = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sorted.add(0, nums[i]);
            } else {
                sorted.add(nums[i]);
            }
        }

        return sorted.stream().mapToInt(i -> i).toArray();
    }

    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {

                int maxToTheRight = 0;
                if (i < nums.length - 1) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] > maxToTheRight && nums[j] % 2 == 1) {
                            maxToTheRight = nums[j];
                        }
                    }
                }

                nums[i] = maxToTheRight;
            }
        }
        return nums;
    }

    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                result[point] = nums[i];
                point++;
            }
        }
        Arrays.fill(result, point, nums.length, 0);
        return result;
    }

    public int[] zeroFront(int[] nums) {
        int val = 0;
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (nums[i] > 0){
                    Arrays.sort(nums);
                    return nums;
                } else {
                    point++;
                    val = nums[i];
                }
            }
        }
        Arrays.fill(nums, 0);
        Arrays.fill(nums, nums.length - point, nums.length, val);

        return nums;
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val) {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    nums[i] = Math.max(nums[i - 1], nums[i + 1]);
                }
            }
        }
        return nums;
    }

    public int[] post4(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int point = nums.length;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                point = i;
                break;
            }
        }
        if (point >= nums.length - 1) {
            return new int[0];
        }
        return Arrays.copyOfRange(nums, point + 1, nums.length);
    }

    public int[] pre4(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int point = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                point = i;
                break;
            }
        }
        return Arrays.copyOf(nums, point);
    }

    public int[] tenRun(int[] nums) {
        int fill;
        for (int i = 0; i < nums.length;) {
            if (nums[i] % 10 == 0) {
                fill = nums[i];
                do {
                    nums[i] = fill;
                    i++;
                } while (i < nums.length && nums[i] % 10 != 0);
            } else {
                i++;
            }
        }
        return nums;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return new int[0];
        }
        int[] result = new int[nums.length];
        result[result.length - 1] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            result[i] = nums[i + 1];
        }
        return result;
    }

    public int[] fizzArray3(int start, int end) {
        int[] array = new int[end - start];
        for (int i = 0; i < end - start; i ++) {
            array[i] = start + i;
        }
        return array;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 2] - nums[i + 1] == 1 && nums[i + 1] - nums[i] == 1) {
                return true;
            }
        }
        return false;
    }


    public boolean sameEnds(int[] nums, int len) {
        if (len == nums.length) {
            return true;
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public boolean twoTwo(int[] nums) {
        boolean next2 = false;
        boolean prev2 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (i + 1 < nums.length && nums[i + 1] == 2) {
                    next2 = true;
                }
                if (i > 0 && nums[i - 1] == 2) {
                    prev2 = true;
                }
                if (!(next2 || prev2)) {
                    return false;
                } else {
                    next2 = false;
                    prev2 = false;
                }
            }
        }
        return true;
    }

    public boolean haveThree(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                counter++;
                if (i + 1 < nums.length && nums[i + 1] == 3) {
                    return false;
                }
            }
        }
        return counter == 3;
    }

    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            } else if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7) {
                if (nums[i + 1] == 7) {
                    return true;
                } else if (i + 2 < nums.length && nums[i + 2] == 7) {
                    return true;
                }
            }
        }
        return false;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int counter = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
                counter++;
            }
        }
        return counter;
    }

    public boolean either24(int[] nums) {
        boolean two = false;
        boolean four = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                two = true;
            } else if (nums[i] == 4 && nums[i + 1] == 4) {
                four = true;
            }
        }
        return two ^ four;
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    public boolean no14(int[] nums) {
        boolean contains1 = false;
        boolean contains4 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                contains1 = true;
            }
            if (nums[i] == 4) {
                contains4 = true;
            }
        }
        return !contains1 || !contains4;
    }


    public String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }

    public int[] fizzArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = i;
        }
        return res;
    }

    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;
            } else if (nums[i] == 4) {
                count4++;
            }
        }
        return count1 > count4;
    }

    public boolean sum28(int[] nums) {
        int sm = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sm += 2;
            }
        }
        return sm == 8;
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length  - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public int sum67(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                do {
                    i++;
                } while (nums[i] != 7);
                sum -= 7;
            }
            sum += nums[i];
        }
        return sum;
    }

    public int sum13(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
            sum += nums[i];
        }

        return (sum - max - min) / (nums.length - 2);
    }

    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }

        return max - min;
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
