// leetcode Quesion 268. Missing number
// https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int ans = sort(arr);
        System.out.println(ans);
    }
    public static int sort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] < arr.length && arr[index] != arr[arr[index]]) {
                swap(arr,index,arr[index]);
            }
            else {
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr,int first,int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
