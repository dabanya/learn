import java.awt.Insets;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {


	public static void main(String[] args) {
		
		System.out.println("��ӭ����~\n�밴��������ʾ���в���!\n��ѯ������1 ����������2 �޸�������3 ɾ��������4 ���������5 �˳�������0");
		
		Scanner insert = new Scanner(System.in);
		int in = insert.nextInt();
		
		while (in != 0) {
			
			System.out.println("��ѯ������1   ����������2  �޸�������3   ɾ��������4   ���������5   �˳�������0");
			
			Scanner sc = new Scanner(System.in);
			String nu = sc.next();	
//			ArrayList list = new ArrayList(); 
			ArrayList list = new ArrayList(); list.add("anan"); list.add("����");

			if ("1".equals(nu)) {
				
					for (int i = 0; i < list.size(); i++) {
					String result = (String)list.get(i);
					System.out.println(result +"   "+ i);				
				}
				
			} else if ("2".equals(nu)) {
				
				Scanner add = new Scanner(System.in);
				System.out.println("�������û�����");
				String name = add.next();

				list.add(name);				

			}else if ("3".equals(nu)) {
				
				Scanner set = new Scanner(System.in);
				System.out.println("������Ҫ�޸ĵ��û���ID��");
				int setID = set.nextInt();
				System.out.println("�������µ��û�����");
				String newname = set.next();
				
				list.set(setID, newname);
				
				
			}else if ("4".equals(nu)) {
				
				Scanner del = new Scanner(System.in);
				System.out.println("������Ҫɾ�����û���ID��");
				String delID = del.next();
				
				list.remove(delID);
				
				
			}else if ("5".equals(nu)) {
				
				list.clear();
				System.out.println("Clear successful~");
				
			}
			
			
			
		}
	

	}

}
