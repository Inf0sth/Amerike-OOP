
/**
 * 
 */
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Random;
public class Flight {

	String id;
	int sits;
	Double ticketPrice;
	LocalDate date;
	String gate;
	boolean selledTickets;
	
	
	public enum Destination {
		MX,
		UK,
		USA,
		CA,
		ARG,
		BA;
	}
	/**
	 * 
	 */
	public Flight(Destination val, Destination val2) {
		this.id = ""+val+val2+"-"+randomid();
		this.sits = 70;
		this.ticketPrice = 2000.00;
		this.date = LocalDate.now();
		this.gate = "1-A";
		HashMap<String,Ticket> information = new HashMap<String,Ticket>();
		//information.put(,);
		
	}
	
	private int randomid() {
		Random numAleatorio = new Random();
		int n = numAleatorio.nextInt(9999-1000+1) + 1000;
		return n;
		}

}
