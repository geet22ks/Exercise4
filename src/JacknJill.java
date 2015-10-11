import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JacknJill {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number between 1 to 10");
		BufferedReader buffer3= new BufferedReader(new InputStreamReader(System.in));
		String inputString3=buffer3.readLine();
		int c=Integer.parseInt(inputString3);
		switch(c)
		{
		case 1:System.out.println("Card-1");
		break;
		case 2:System.out.println("Card-2");
		break;
		case 3:System.out.println("Card-3");
		break;
		case 4:System.out.println("Card-4");
		break;
		case 5:System.out.println("Card-5");
		break;
		case 6:System.out.println("Card-6");
		break;
		case 7:System.out.println("Card-7");
		break;
		case 8:System.out.println("Card-8");
		break;
		case 9:System.out.println("Card-9");
		break;
		case 10:System.out.println("Card-10");
		break;
		}
		// TODO Auto-generated method stub

	}

}
