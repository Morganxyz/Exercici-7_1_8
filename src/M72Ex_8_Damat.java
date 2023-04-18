import java.util.Scanner;

public class M72Ex_8_Damat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num0 = 0;
		int num1 = 1;
		int sumaIni = 0;
		int cantNum = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix un nombre:");
		cantNum = entrada.nextInt();
		
		for(int i = 0; i < cantNum; i++) {
			System.out.print(num0 + ",");
			sumaIni = num0 + num1;
			num0 = num1;
			num1 = sumaIni;
		
			}
	}
}



