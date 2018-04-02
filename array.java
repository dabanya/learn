
/*
1.2种排序方法
2.遍历
3.获取最值
*/

public class array{

	public static void main(String[] args){
		int[] array = {9,4,56,3,0,1};
		printArray(array);
		//bubbleSort(array);
		arraySort(array);
		printArray(array);
		printMax(array);
	}


	//冒泡排序
	public static void bubbleSort(int[] arr){
			//-1 最后一个角标元素不用比较
			for(int x=0;x<arr.length-1;x++){
				//-x 减少比较的次数，-1 避免角标越界
				for(int y=0;y<arr.length-x-1;y++){
					if(arr[y]>arr[y+1]){
						int temp=arr[y];
						arr[y]=arr[y+1];
						arr[y+1]=temp;
					}
				}
			}
	}
	
	//选择排序
	public static void arraySort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[x]>arr[y]){
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}

	//遍历
	public static void printArray(int[] array){
		System.out.print("{");
		for(int x=0;x<array.length;x++){
			if(x != array.length-1){
				System.out.print(array[x]+",");
			}else{
			System.out.println(array[x]+"}");
			}
			
		}
	}

	//获取最值
	public static void printMax(int[] arr){
		for(int x=0;x<arr.length;x++){
			if(arr[0]<arr[x]){
				int temp = arr[0];
				arr[0]=arr[x];
				arr[x]=temp;
			}
		}
		System.out.print(arr[0]);
	}
	
}