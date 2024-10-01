import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int arr[]={10,4,3,6,5,7,100,99};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j-1]> arr[j]){
                   int temp= arr[j];
                   arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }

        }
    }
}
