package Ch17;

import java.util.Scanner;

public class C05ArrayMain {


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
		
		
		// 1 학생 총점 : ?  평균 ?
		// 2 학생 총점 : ?  평균 ?
		// 3 학생 총점 : ?  평균 ?
		// 4 학생 총점 : ?  평균 ?
		// 5 학생 총점 : ?  평균 ?		
		
//		
//		
//		Scanner input= new Scanner(System.in);
////		
//		int [][] score = new int [5] [3];//  score 는5개의행과 3개의열의 크기를 가지고있다  행은 가로 열은 세로로 세는것
//		String str[] = {"국어","수학","영어"}; // str라는 틀에 국어 수학 영어라는 문자가 들어가있다.
//		
//		int sum=0; int ave=0;
//		
//		for(int i=0;i<score.length;i++) //행 반복문 score.length는 앞에서설정한 int[5][3]에서 5로 설정되어있기때문에 최대값이5
//		{
//			System.out.println((i+1)+"번쨰 학생의 성적입력(국/영/수)");
//			for(int j=0;j<score[i].length;j++) //열반복문 <score[i].length는 열의길이를보여준다. ex)score[0].length의 의미는 score[0]이라는틀안에서 지정된열의길이를보여주는것이다.
//			{
//				score[i][j] = input.nextInt();
//			}
//			System.out.println();
//			for(int j=0;j<score[i].length;j++) //열반복문 총점계산
//			{
//				sum+=score[i][j];
//			}
//			System.out.println((i+1)+"번쨰 학생의 총점은"+sum+"입니다.평균은"+sum/score[i].length);
//			sum=0; //초기화
//		}
//
//		//// 국어 총점 : ?  평균 ?
//		// 영어 총점 : ?  평균 ?
//		// 수학 총점 : ?  평균 ? 
//		//출력하기.
//		for(int i=0;i<str.length;i++)
//		{
//			for(int j=0;j<score.length;j++)
//			{
//                   sum+=score[j][i];
//			}
//		  System.out.println(str[i]+"총점"+ave+"평균"+ave/score.length);
//		  ave=0;
//		}
//	
//		

		//과목별 총점 만들기
		
		Scanner input= new Scanner(System.in);
//		
		int [][] score = new int [5] [3];
		
		
		//과목총점 /평균
		int subjects[] = new int[3]; //과목별 총점 저장 (0:국어 ,1:영어,2:수학)
		
		for(int i=0;i<score.length;i++) 
		{
			for(int j=0;j<score[i].length;j++)
			{
				subjects[0]+=score[i][0];
				subjects[1]+=score[i][1];
				subjects[2]+=score[i][2];
			}
			
			
		}
		
		
		
		
		
		
	}

}
