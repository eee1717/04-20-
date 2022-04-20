package Ch17;

public class C04ArrayMain {

	public static void main(String[] args) {
		// 이차원 배열 
		
//		int [] [] arr1 = new int [2][3];
//		arr1[0][0] =10;  //행열 에대한 좌표를 통해서 10이라는값이 입력된다.  10이 행 0 열 0인곳에 10이라는값이 입력된다.
//		arr1[0][1] =20;
//		arr1[0][2] =30;
//		arr1[1][0] =40;
//		arr1[1][1] =50;
//		arr1[1][2] =60;
//		
//		
//		System.out.println("행의 길이 :"+ arr1.length); //행길이   는 2가  나와야한다.
//		System.out.println("1행의 길이 :"+ arr1[0].length);  //1행의 열길이는 2가나와야함
//		System.out.println("2행의 길이 :"+ arr1[1].length);  // 2행의 열길이는 3이나와야함.  
//		
//		
//		for(int i=0;i<arr1.length;i++)   //행길이 반복
//		{
//			for(int j=0;j<arr1[i].length;j++) //열길이 반복
//			{
//				System.out.print(arr1[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		int [][] arr2 =
			{
					{10,20,30}, //0번째행
					{40,50,60}, //1번째행
					{70,80,90}, //2번째행
					{100,110,1120} //3번째행
			};
		
		System.out.println("전체 행길이 :"+arr2.length);
		System.out.println("0번째 행길이 :"+arr2[0].length);
		System.out.println("1번쨰 행길이 :"+arr2[1].length);
		System.out.println("2번쨰 행길이 :"+arr2[2].length);
		System.out.println("3번쨰 행길이 :"+arr2[3].length);
		
		
		
		
		
		
		
		
		
	}

	
}
