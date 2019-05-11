import java . util . Scanner ;

public class Salute {
	public static void main ( String [] args ) {
		
		Scanner input = new Scanner ( System .in );
		
		double temperatura;
		int battito;
		boolean febbreNo , febbreBassa , febbreAlta ;
		boolean battitoOK , battitoAccelerato ;		
		
		System.out.println("Inserire temperatura corporea:");
		temperatura = input.nextDouble();
		System.out.println("Inserire battiti cardiaci al minuto:");
		battito = input.nextInt();
		
		febbreNo = temperatura < 37.0;
		febbreBassa = (temperatura >= 37) && (temperatura < 38);
		febbreAlta = temperatura >= 38;
		battitoOK = battito < 80;
		battitoAccelerato = battito >= 80;
	
		if (febbreNo && battitoOK)
			System.out.println(" Tutto OK");
		else if ((febbreBassa && battitoAccelerato) || (febbreAlta))
			System.out.println("Stato febbrile");
		else
			System.out.println("Stato febbrile lieve");
	
		input.close();
	}
}