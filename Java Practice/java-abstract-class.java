import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}
//Write MyBook class here

//If the subclass has a method with the same name as the parent’s method,
//then the subclass’ method overwrites the parent
//If we want to use the parent class’s method instead, we can use the super keyword
class MyBook extends Book{       
    void setTitle(String s){
        title = s;
    }
}
public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}