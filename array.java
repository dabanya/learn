
/*
1.2�����򷽷�
2.����
3.��ȡ��ֵ
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


	//ð������
	public static void bubbleSort(int[] arr){
			//-1 ���һ���Ǳ�Ԫ�ز��ñȽ�
			for(int x=0;x<arr.length-1;x++){
				//-x ���ٱȽϵĴ�����-1 ����Ǳ�Խ��
				for(int y=0;y<arr.length-x-1;y++){
					if(arr[y]>arr[y+1]){
						int temp=arr[y];
						arr[y]=arr[y+1];
						arr[y+1]=temp;
					}
				}
			}
	}
	
	//ѡ������
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

	//����
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

	//��ȡ��ֵ
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