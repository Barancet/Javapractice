package datastructures.array;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 9};
        int size = nums.length;
        //System.out.println(size);

        for (int i = 0; i < nums.length; i++) {
            //System.out.println(nums[i]);
        }
        int copyArr[] = new int[nums.length];

        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = nums[0];
            System.out.print(copyArr[i]);
        }
    }

    public void rotate(int[] nums, int k) {

        //usuing extra array
        //time 0n space 0n
        //1,2,3,4,5,6,7
        int size = nums.length;
        int[] copyArr = new int[size];
        for(int i=0; i < size; i++){
            copyArr[(i+k) % size] = nums[i];
        }
        for(int i = 0; i < size; i++){
            nums[i] = copyArr[i];
        }
    }

    public void rotateV2(int[] nums, int k){
        int size = nums.length;
        k %= size;
        reverse(nums, 0 , size-1  );
        reverse(nums, 0, k-1);
        reverse(nums, k, size-1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end ){
            int tempPos  = nums[start];
            nums[start] = nums[end];
            nums[end] = tempPos;
            start++;
            end--;
        }
    }

}
