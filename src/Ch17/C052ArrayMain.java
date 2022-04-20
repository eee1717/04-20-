package Ch17;

import java.util.Scanner;

public class C052ArrayMain {

	public static void main(String[] args) {
		// 문제 배열을이용해서 학생의국어수학영어 넣어서 평균과 총점을 출력. 
		// 5명의 학생의 국/영/수학 점수를 입력받아 출력합니다.
		// 2차원 배열을 사용해서 한다.
		// int score[] [] = new int [5] [3]
		// 학생별 총점과 평균
		// 국/영/수학별 총점과 평균도 함꼐출력
		// [출력예]
		// 1 학생 점수입력 (국/영/수 순서) :100 70 60
		// 2 학생 점수입력 (국/영/수 순서) :99 88 77
		// 3 학생 점수입력 (국/영/수 순서) :10 20 30
		// 4 학생 점수입력 (국/영/수 순서) :100 55 66
		// 5 학생 점수입력 (국/영/수 순서) :88 77 66  전부 출력안해도됨.
		
		
		int[][] score = new int [5][3];
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<score.length;i++)
		{
			System.out.printf("%d 학생점수입력(국/영/수) :", (i+1));
			
			score[i][0] =sc.nextInt(); //i번쨰 학생의 국어점수입력
			score[i][1] =sc.nextInt(); //i번쨰 학생의 영어점수입력
			score[i][2] =sc.nextInt(); //i번쨰 학생의 수학점수입력
			
		}
		
		//score 결과 출력시작------------------------------
		
		
		System.out.println("\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<score[i].length;i++) {
		
			for(int j=0;j<score[i].length;j++) 
			{
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
	
		// score 출력끝 --------------------------------
		

		
		
		
		
		// 1 학생 총점 : ?  평균 ?
		// 2 학생 총점 : ?  평균 ?
		// 3 학생 총점 : ?  평균 ?
		// 4 학생 총점 : ?  평균 ?
		// 5 학생 총점 : ?  평균 ?	
	
	
	 //여기서설정할때 행열 밑으로갈때는 i 오른쪽으로갈떄는 j라고 생각하면된다.
	
	// 학생별 총점/평균
	int [] students = new int[5];//학생별(국영수점수 총점저장)   그림으로그려서 하면 보기편함
	double avg= 0.0;
	
	
	for(int i=0;i<score.length;i++) //행이동   score.length의길이(행)만큼 행이동 
	{
		for(int j=0;j<score[i].length;j++) //열이동
		{
			students[i]+=score[i][j]; // 학생별 국영수 총점 넣기
		}
	}
	
	//score 결과 출력시작------------------------------
	
	System.out.println("\t국어\t영어\t수학\t총점\t평균");
	for(int i=0;i<score[i].length;i++) {
	
		for(int j=0;j<score[i].length;j++) 
		{
			System.out.print(score[i][j]+"\t");
		}
		System.out.println(students[i]+"\t"+(double)students[i]/3);
	
	}
	
	 
		// score 출력끝 --------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
