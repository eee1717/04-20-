package Ch18;

// 클래스 자료형을 요소로하는 배열객체를 생성하는경우
// 각 요소는 객체의 위치값을 담는 참조변수 로 사용된다.
// 각 요소마다 객체생성이후 위치값을 저장 해야 데이터를 저장하거나 기능을 사용할수있다.

class C01Person
{
	String name;
	String addr;
	C01Person(String name,String addr)
	{
		this.name = name;
		this.addr = addr;
	}
	
}



public class C01ClassArrayMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		C01Person[] list = new C01Person[3];
		System.out.println("길이: " + list.length);
		
		
		list[0] = new C01Person("홍길동","대구"); //이렇게   객체를 연결해주지않으면 제대로 작동하지않는다.  중요
		//list[0].name="홍길동";
		//list[0].addr="대구";
		
		list[1] = new C01Person("정우균","마산"); //이렇게   객체를 연결해주지않으면 제대로 작동하지않는다.  중요
//		list[1].name="정우균";
//		list[1].addr="마산";
		
		list[2] = new C01Person("이태수","울산"); //이렇게   객체를 연결해주지않으면 제대로 작동하지않는다.  중요
//		list[2].name="이태수";
//		list[2].addr="울산";  //문제없어보이나 이렇게하면 문제가생긴다. 
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
