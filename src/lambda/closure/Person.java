package lambda.closure;

public class Person {
	public static void main(String[] args) {  
        //��һ��ţ��  
        Milk m = new Milk();  
          
        Active haveMeals = m.HaveMeals();  
          
        //û�º�һƿ  
        haveMeals.drink();  
        //���º�һƿ  
        haveMeals.drink();  
        
        //������ʣ���٣�  
        m.currentNum();  
        
        m = null;
        haveMeals.drink();  
        //������ʣ���٣�  
        //m.currentNum(); 
    }
}
