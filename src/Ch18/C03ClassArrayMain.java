package Ch18;

public class C03ClassArrayMain {

	public static void main(String[] args) {
		
		int arr1[] = {10,20,30};
		
	    int arr2[];
	    // 얕은복사(주소값복사) 주소값을 복사한거라서 정확히내용을복사한게아님
	    arr2 = arr1;
	    
	    
	    //깊은복사 (값자체복사)
	    arr2=new int[3];
	    for(int i=0;i<arr2.length;i++) {
	    	arr2[i]=arr1[i];
	    }
	    
	    for(int i=0;i<arr2.length;i++) {
	    	System.out.printf("arr2[%d]=%d\n",i, arr2[i]);
	    }
	    
		arr1[0]=100;
		arr1[1]=200;
		arr1[2]=300;
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
			System.out.printf("arr2[%d]=%d\n",i, arr2[i]);
		}
		
		
	}

}
