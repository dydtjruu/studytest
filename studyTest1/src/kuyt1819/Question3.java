package kuyt1819;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singer singer = new Singer("������", 35, "����", "�������");
		
		HashMap<String, String> famousSongs = new HashMap<>();	
		famousSongs.put("first", "���˾ƿ�");
		famousSongs.put("second", "�Ͽ���");
		famousSongs.put("third", "�����̵���");
		//d
		//Ű�� �̾Ƽ� ���ͷ����� ������ ����ϴ°� �˰ڴµ�.. ��Ծ���� ..�Ф�
		Set<String> famousSongs2 = famousSongs.keySet();
		/*famousSongs2.iterator();
			System.out.println(famousSongs2.);
		
			
		*/
		//���
		//Iterator<E>
		/*for (int i = 0; i < famousSongs.size(); i++) {
			
			System.out.println(famousSongs.get("first"));
			
		}*/
		
	}

}
