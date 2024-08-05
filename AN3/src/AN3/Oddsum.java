package AN3;

public class Oddsum {
	public int sum(int n, int arr[]) {
		int sum = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				sum = sum+arr[i];
			}
		}
		return sum;
	}
}
