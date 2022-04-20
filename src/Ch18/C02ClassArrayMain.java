package Ch18; //이건 아직 덜한것 

import java.util.Scanner;

class BookStore
{
	//속성
	String BookCode;
	String Bookname;
	String Publisher;
	int Amount;
	
	
	 public String getBookName()
	    {
	        return Bookname;
	    }
	
	 void BookAdd(String BookCode, String Bookname, String Publisher, int Amount)
	    {
	        this.BookCode = BookCode;
	        this.Bookname = Bookname;
	        this.Publisher = Publisher;
	        this.Amount = Amount;
	    } 
	 void BookInfo()
	    {
	        System.out.println("코드: " + BookCode);
	        System.out.println("제목: " + Bookname);
	        System.out.println("출판사: " + Publisher);
	        System.out.println("수량: " + Amount);
	    }
	
	
}


public class C02ClassArrayMain {

	public static void main(String[] args) {
		//배열만들기
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int bookCount = 0;
	    BookStore[] book = new BookStore[100];
		while(true) {
			System.out.println("---------------BOOKSTORE--------");
			System.out.println("1.도서 등록");
			System.out.println("2.도서 검색");
			System.out.println("3.전체 도서 확인");
			System.out.println("4.종료");
			System.out.println("---------------BOOKSTORE--------");
			System.out.println("번호 :");
		    num=sc.nextInt();
		    switch(num)
		    {
		    case 1:
		    	// 도서등록
		   
		  		
		    	
		    	
		        break;
		    case 2:	
		   // 도서검색
		    	
		    	
		    	
		    	
		    	
		    	
	        break;
		  
		    
		    
		    case 3:
		    	// 전체 도서 확인
		    	
		    	
		    	
	          break;
		    case 4:
		    	System.exit(-1);
	            break;
		    }
		
		
		
		
		
		}
		

	}

}
