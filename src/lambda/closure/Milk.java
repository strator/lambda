package lambda.closure;

public class Milk {
	public final static String name = "��ţ��";//����  
    
    private static int num = 16;//����  
      
    public Milk()  
    {  
        System.out.println(name+"��16/ÿ��");  
    }  
      
    /** 
     * �հ� 
     * @return ����һ����ţ�̵Ķ��� 
     */  
    public Active HaveMeals()  
    {  
        return new Active()  
                {  
                    public void drink()  
                    {  
                        if(num == 0)  
                        {  
                            System.out.println("ľ���ˣ�������Ѿ������.");  
                            return;  
                        }  
                        num--;  
                        System.out.println("�ȵ�һƿţ�� "+num);  
                    }  
                };  
    }  
      
    /** 
     * ��ȡʣ������ 
     */  
    public void currentNum()  
    {  
        System.out.println(name+"ʣ�ࣺ"+num);  
    }  
}
