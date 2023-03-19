import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * FindTheCommonElementsInArrays
 */
public class FindTheCommonElementsInArrays {

    public int[] findTheCommonElementsInArrays(int[] arr1,int[] arr2){
        int arr1Max = Arrays.stream(arr1).max().getAsInt();
        int arr2Max = Arrays.stream(arr2).max().getAsInt();
        int[] temparr1 = new int[arr1Max+1];
        int[] temparr2 = new int[arr2Max+1];
        for (int i : arr1) {
            temparr1[i]++;
        }
        for (int i : arr2) {
            temparr2[i]++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < temparr1.length; i++) {
            if(temparr1[i]>0 && temparr2[i]>0){
                int min = Math.min(temparr1[i],temparr2[i]);
                for (int j = 0; j < min; j++) {
                    res.add(i);
                }
            }
        }
        int[] intRes = res.stream().mapToInt(c->c).toArray();
        Arrays.sort(intRes);
        return intRes;
    }
    public int[] findTheCommonElementsInArraysByLooping(int[] arr1,int[] arr2){
        int arr1Max = Arrays.stream(arr1).max().getAsInt();
        int arr2Max = Arrays.stream(arr2).max().getAsInt();
        int[] temparr1 = new int[arr1Max+1];
        int[] temparr2 = new int[arr2Max+1];
        for (int i : arr1) {
            temparr1[i]++;
        }
        for (int i : arr2) {
            temparr2[i]++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < temparr1.length; i++) {
            if(temparr1[i]>0 && temparr2[i]>0){
                int min = Math.min(temparr1[i],temparr2[i]);
                for (int j = 0; j < min; j++) {
                    res.add(i);
                }
            }
        }
        int[] intRes = res.stream().mapToInt(c->c).toArray();
        Arrays.sort(intRes);
        return intRes;
    }
    public static void main(String[] args){
        for (int a : new FindTheCommonElementsInArrays().findTheCommonElementsInArrays(new int[]{1, 2, 3,3, 5, 6, 7}, new int[]{3,3, 6, 7, 8, 20})) {
        System.out.print(a+" ");
            
        }
        System.out.println();
    }
}