package Ch19;


//----------------------------
//자바 메모리구조
//---------------------------
//1) Stack
//   {} 내에서 선언되어지는 변수, {} 벗어나면 소멸//지역 변수
//2) Heap  
//   ---> 객체 저장용 공간 // new 예약어 생성+참조변수 , 참조변수연결 해제시 GC에의해 소멸
//3) Class(==Method)
//  ---> 공유 메모리 영역 // 생성자함수가 저장되는공간 ,일반함수/static함수/static변수 이러한것들이 공유메모리에 존재하게된다.
//


class Simple{
	static int x; //공유 메모리영역에 적재된다.
	int y;
	
	void ShowXY() {
		System.out.println("X="+x+",Y="+y);
	}
	
	
}


public class C01StaticMain {

	public static void main(String[] args) {
		
       // static 멤버는 클레스 명으로 접근가능 
		Simple.x=123;
		
		Simple ob1 = new Simple();
//		ob1.x=10;
//		ob1.y=20;
		Simple ob2 = new Simple();
//		ob2.ShowXY();
//		ob2.x=100;
//		ob1.ShowXY();
		
		ob1.ShowXY();
		ob2.ShowXY();
		
		
	}

}
