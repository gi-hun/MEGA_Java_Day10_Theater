/*
 * # ��ȭ�� �¼�����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */
//03:10-03:38

package day_10;

import java.util.Scanner;

public class ArrayEx09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seat[] = {0,0,0,0,0,0,0};
		int count = 0;
		
		while(true)
		{
			System.out.print("seat =");
			for(int i=0;i<7;i++)
			{
				System.out.print(seat[i] + " ");
			}
			System.out.println("");
			
			System.out.println("�޴� ����");
			System.out.println("[1]�ڸ� ����");
			System.out.println("[2]���");
			System.out.println("[0]����");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.println("���� �ڸ� ����");
				int choice = sc.nextInt();
				
				if(seat[choice] == 0)
				{
					seat[choice] = 1;
					count++;
				}
				else
				{
					System.out.println("�̹� ���ŵ� �ڸ��Դϴ�.");
				}
			
				
			}
			if(select == 2)
			{
				System.out.println("��ȭ ��:" + count*12000);
			}
			if(select == 0)
			{
				System.out.println("���� ���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}
