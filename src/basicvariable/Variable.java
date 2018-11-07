package basicvariable;

public class Variable {
	public static void main(String[] args) {
		int year = 1949;
		System.out.println(year);//指代某个数据的标识符
		
		//整型数据
		byte b = 1;//8位   -128~127
		short s = 200;//16位   
		int i = 300; //32位
		long l = 400; //64位
		
		
		//字符型
		char c = '中';//char 只能存放一个字符，超过一个字符就会产生编译错误
		
	     
		//浮点型
		double d = 123.45;//64位  1.7E-308~1.7E+308
	    float f2 = 54.321f;//32位    因为默认是double 所以后边添加个f   3.4E-038~3.4E+038
	    
	    //布尔型
	    
	    boolean b1 = true;
        boolean b2 = false;
        
        
        
       }
}