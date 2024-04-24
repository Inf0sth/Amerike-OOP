/**
 * 
 */
import java.util.Date;
import java.util.Random;
public class Ticket {

	String ticket_id;
	String flight_id;
	String userInfor;
	Date date;
	Double ticketPrice;
	/**
	 * 
	 */
	public Ticket() {
		this.ticket_id = "RE-" +""+ticket_randomid();
 
	}
	
	private int ticket_randomid() {
		Random numAleatorio = new Random();
		int n = numAleatorio.nextInt(9999-1000+1) + 1000;
		return n;
	}
	
	

}
