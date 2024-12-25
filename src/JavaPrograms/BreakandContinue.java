package JavaPrograms;

public class BreakandContinue {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i == 8) {
				continue;
			}else if(i==10) {
				break;
			}
			System.out.print("Deepak : " + i);
			System.out.println();
		}

	}

}
