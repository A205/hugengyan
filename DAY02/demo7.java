
public class BubbleSort {
    public static void main(String[] agre) {
    	int[] arr  = {1,9,6,4,3};
    	int temp = 0;
		for(int i = 4;i >= 0; i--){
			for(int j = 0;j < i;j++){
				if(arr[i]<arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0;i<5;i++){
			System.out.println(arr[i]);
		}
	}
}
