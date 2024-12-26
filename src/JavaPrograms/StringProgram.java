package JavaPrograms;

public class StringProgram {
//String str = "welcome to Synechron Interview";
// o/p1=Interview Synechron to welcome
// o/p2 = welcome Interview to Synechron
// o/p3 = to welcome Interview Synechron	
	public static void main(String[] args) {
		String str = "welcome to Synechron Interview";
		reverse(str);
		Pyramid(5);
	}

	public static String reverse(String str) {
		String[] arr = str.split(" ");
		System.out.println(arr[3]+" "+arr[2]+" "+arr[1]+" "+arr[0]);
		System.out.println(arr[0]+" "+arr[3]+" "+arr[1]+" "+arr[2]);
		System.out.println(arr[1]+" "+arr[0]+" "+arr[3]+" "+arr[2]);
		return str;
	}
	
	public static int Pyramid(int number) {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		return number;
	}
	
	
}
