
public class BinarySearch{
	public static void binarySearch(int[] a,int low,int high,int x) {
		System.out.println("given list in sorted order is: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int mid=(low+high)/2;
		boolean b=true;
		while(low<=high) {
			if(a[mid]==x) {
				b=false;
				System.out.println("searching element is found and its position is :"+(mid+1));
				break;
			}
			else if(a[mid]>x) {
				high=mid-1;
			}
			else if(a[mid]<x) {
				low=mid+1;
			}
			mid=(low+high)/2;
		}
		if(b)
			System.out.println("Searching element is not found");
	}
	public static void main(String[] args) {
		int[] a= {9,4,7,1,3,6,10,8};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		int low=0,high=a.length-1;
		int search=9;
		binarySearch(a,low,high,search);
	}

}
