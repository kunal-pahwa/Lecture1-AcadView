
public class SecondLarget {
	void find(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
		int second=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]!=second) {
				second=arr[i];
				break;
			}
		}
		System.out.println(second);
	}
}
