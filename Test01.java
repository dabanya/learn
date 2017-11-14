import java.awt.Insets;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {


	public static void main(String[] args) {
		
		System.out.println("欢迎光临~\n请按照以下提示进行操作!\n查询请输入1 插入请输入2 修改请输入3 删除请输入4 清空请输入5 退出请输入0");
		
		Scanner insert = new Scanner(System.in);
		int in = insert.nextInt();
		
		while (in != 0) {
			
			System.out.println("查询请输入1   插入请输入2  修改请输入3   删除请输入4   清空请输入5   退出请输入0");
			
			Scanner sc = new Scanner(System.in);
			String nu = sc.next();	
//			ArrayList list = new ArrayList(); 
			ArrayList list = new ArrayList(); list.add("anan"); list.add("安安");

			if ("1".equals(nu)) {
				
					for (int i = 0; i < list.size(); i++) {
					String result = (String)list.get(i);
					System.out.println(result +"   "+ i);				
				}
				
			} else if ("2".equals(nu)) {
				
				Scanner add = new Scanner(System.in);
				System.out.println("请输入用户名：");
				String name = add.next();

				list.add(name);				

			}else if ("3".equals(nu)) {
				
				Scanner set = new Scanner(System.in);
				System.out.println("请输入要修改的用户名ID：");
				int setID = set.nextInt();
				System.out.println("请输入新的用户名：");
				String newname = set.next();
				
				list.set(setID, newname);
				
				
			}else if ("4".equals(nu)) {
				
				Scanner del = new Scanner(System.in);
				System.out.println("请输入要删除的用户名ID：");
				String delID = del.next();
				
				list.remove(delID);
				
				
			}else if ("5".equals(nu)) {
				
				list.clear();
				System.out.println("Clear successful~");
				
			}
			
			
			
		}
	

	}

}
