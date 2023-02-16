import java.util.*;
public class MainClass {
	static Scanner in= new Scanner(System.in);
	public static void main(String[] args) 
	{
		somma_sottrazione();
		inversione();
		inversione_lettere();


		}
		public static void somma_sottrazione()
		{
			System.out.println("quanti numeri scrivere?");
			int n_scelti = Integer.parseInt(in.nextLine());
			int numeri2 = 0;
			int sottrazione_disp = 0;
			int[] numeri = new int[n_scelti];
			for (int i = 0; i < n_scelti; i++)
			{
				System.out.println("scrivi il numero alla " + (i+1) + "° posizione");
				numeri[i] = Integer.parseInt(in.nextLine());
				if (i % 2 == 0)
				{
					numeri2 = numeri[i] + numeri2;
				}
				else 
				{
				sottrazione_disp =- sottrazione_disp - numeri[i];
				}
				

	}
			System.out.println("la somma dei numeri pari è " + numeri2);
			System.out.println("la differenza dei numeri dispari è " + sottrazione_disp);
}
		public static void inversione()
		{
			
			System.out.println("quanti numeri scrivere?");
			int n_scelti = Integer.parseInt(in.nextLine());		
			int[] numeri2 = new int[n_scelti];
			int[] numeri = new int[n_scelti];
			for (int i = 0; i < n_scelti; i++)
			{
				System.out.println("scrivi il numero alla " + (i+1) + "° posizione");
				numeri[i] = Integer.parseInt(in.nextLine());
				numeri2[n_scelti -1 - i] = numeri[i];
			}
			for (int i = 0; i < n_scelti; i++)
			System.out.print(numeri2[i] + " ");		
		}
		public static void inversione_lettere()
		{
			System.out.println(" \nquante lettere vuoi scrivere?");
			int l_scelta = Integer.parseInt(in.nextLine());
			String[] lettere = new String[l_scelta];
			String[] lettere2 = new String[l_scelta];
			for (int i = 0; i < l_scelta; i++)
			{
				System.out.println("scrivi il numero alla " + (i+1) + "° posizione");
				lettere[i] = in.nextLine();
				lettere2[l_scelta -1 - i] = lettere[i];
			}
			for (int i = 0; i < l_scelta; i++)
			System.out.print(lettere2[i] + " ");		
		}

}