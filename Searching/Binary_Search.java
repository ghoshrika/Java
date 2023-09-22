public class Binary_Search{
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while(first <= last){
            if(arr[mid] < key){
                first = mid+1;
            }
            else if(arr[mid] == key){
                System.out.println("Element is found at: " +mid);
                break;
            }
            else{
                last = mid-1;
            }
            mid = (first + last)/2;
        }
        if(first > last){
            System.out.println("Element not found!");
        }
    }
    public static void main(String[] args) {
        int arr[] = {20,40,60,80,100};
        int key = 10;
        int last = arr.length - 1;
        binarySearch(arr, 0, last, key);
    }
}