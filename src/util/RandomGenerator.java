package util;

public class RandomGenerator {
	public static int getRandomNum(int a , int b){
		int max=0,min=0;
		if(a>b){
			max=a;
			min=b;
		}else{
			max=b;
			min=a;
		}
		/*int randomNum=(int)(Math.random()*(max-min+1)+min);*/
	/*	return randomNum;*/
			return (int)(Math.random()*(max-min+1)+min);
	}
}
/*return(a>b)?(int)(math.random()*(a-b+1)+b):(int)(math.random()*(b-a+1)+a);    <--상항연산자 */