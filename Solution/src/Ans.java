import java.io.File;

public class Ans {
		public static void main(String[] args) {
		    String path = "C:\\Test\\a\\b\\c\\d";
		    deleteFolder(path);
		}
		
		public static void deleteFolder(String path) {
			
		    File folder = new File(path);
		    try {
			if(folder.exists()){
	                File[] folder_list = folder.listFiles(); //���ϸ���Ʈ ������
					
			for (int i = 0; i < folder_list.length; i++) {
			    if(folder_list[i].isFile()) {
				folder_list[i].delete();
				System.out.println("������ �����Ǿ����ϴ�.");
			    }else {
				deleteFolder(folder_list[i].getPath()); //����Լ�ȣ��
				System.out.println("������ �����Ǿ����ϴ�.");
			    }
			    folder_list[i].delete();
			 }
			 folder.delete(); //���� ����
		       }
		   } catch (Exception e) {
			e.getStackTrace();
		  }
	  }
}