package transform;

public class Transform{
	  
    public static void main(String[] args) {
  
        byte b = 5;
        int i1 = 10;
        int i2 = 300;
          
        b = (byte) i1;
        //��Ϊi1��ֵ����byte��Χ֮�ڣ����Լ������ǿ��ת��
        //���õ���ֵ��Ҳ��10
        System.out.println(b);
          
        //��Ϊi2��ֵ����byte��Χ֮�⣬���Ծͻᰴ��byte�ĳ��Ƚ��н�ȡ
        //i2��ֵ��300�����Ӧ�Ķ��������� 100101100
        //����byte�ĳ���8λ���н�ȡ����ֵΪ 00101100 ��44
        b =(byte) i2;
        System.out.println(b);
         
        //�鿴һ��������Ӧ�Ķ����Ƶķ�����
        System.out.println(Integer.toBinaryString(i2));
         
    }
}