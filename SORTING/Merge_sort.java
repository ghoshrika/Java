 
public class Merge_sort {
    public static void conquer(int arr[], int start, int mid, int end){
        int merged [] = new int[end - start + 1];
        int index1 = start;
        int index2 = mid+1;
        int x = 0;

        while(index1 <= mid && index2 <= end){
            if(arr[index1] <= arr[index2]){
                merged[x] = arr[index1];
                x++;
                index1++;
            }
            else{
                merged[x] = arr[index2];
                x++;
                index2++;
            }
        }

        while(index1 <= mid){
            merged[x] = arr[index1];
            x++;
            index1++;
        }

        while(index2 <= end){
            merged[x] = arr[index2];
            x++;
            index2++;
        }

        for(int i=0,j=start; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        // (start + end)/2 ----> also work
        int mid = start + (end - start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr,start,mid,end);
    }
    public static void main(String[] args) {
        int arr[] = {3,1,10,8,5};
        int l = arr.length;

        divide(arr, 0, l-1);
        //print
        for(int i=0; i<l; i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }
}
