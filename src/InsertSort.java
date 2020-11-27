import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            for (;j >= 0 && list[j] > temp; j--) {
               list[j + 1] = list[j];
            }
            list[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] list = {7,5,2,1};
        insertSort(list);
        System.out.println(Arrays.toString(list) + "");
    }
}
