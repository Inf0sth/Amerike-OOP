/**
You and your friends decide to open the page BookYourFlight.com, a service to buying plane tcikets online.
Your application must work as follows:

- A user login to your webSite and is able to:
	a) Sell all flight available at least 10 destinations
	b) Buy a ticket to a given destination, by providing its personal details
	c) Retrieve the flight information by providing the ticket-id

Instructions: 
	a) Create a class call Ticket that holds the ticket information as well as the user information
		@param Ticket-Id the id of the ticket, it must in the format "RE-xxxx" where xxxx is a random int
		@param Flight-Id the id of the flight @see Flight
		@param UserInfor holds the user infomation such as: FullName, PhoneNumber, Email, Country
		@param Date the date of the flight, with date, time and gate of departure @see Flight
		@param TicketPrice the price at which the ticket was selled, this is a decimal number
		
	b) Create a class called "Flight", that represnts a plane Flight. This class must have:
		@param Id - the id of the flight must in the format: [ORIGIN][DESTINATION]-XXXX EX: MXUK-5674
			all posible destinations for orign and destinations must be stored in a Enum called "Destinations".
		@param numberSits  the number of sits in the plane should be 40 
		@param ticketPrice Must be a random value between 1000 and 2000 USD
		@param date and time the date and time of departure. Use java.util.time
		@param gate the departure gate in the format: O-X where O is a random letter from A-B and X is a random number from 1-9
		@param selledTickets Each Flight must keep a record of the selled Ticket.
		This information is stored into a hash map that stores the information as: 
			{ Key: ticket.id, Value: Ticket class }
		@method getPlaneMap this method returns the plane map. Showing 
		with 'X' the ocuppied sits and 'O' por empty sits.
			The plane map should look as follows:
			A |XOO| |XXX|
			B |OOO| |OOO|
			C |OXO| |XXO|
			...
			o  123   456
			Showing A-B for the rows and 1-6 for the columns. At the sit plane mat must have a random distribution at time 0.
			
		@method getTicket returns the ticket information given the ticket-Id 
		@method buyTicket sells a tickets providing:
			a) the user information: FullName, PhoneNumber, Email, Country
			b) the sit sellection. In the format row-sit ex: A-03
			This method creats a new ticket and store it
	c) Create a Class called flightManager that:
		1. Displays a flight dashboard with the following info 
			| FLIGHT-ID | ORIGIN | DESTINATION | PRICE |
			... Must show at least 10 diferent flights to diferent locations
		2. Allow the user to select and buy a ticket
			1) The user is show the flight dashboard
			2) the user decides to buy a ticket for flight ORDS-XXX
			3) the user provides the flight_id
			4) the user is shown the flight_map
			5) the user selects the sit by providing the sit numnber. Ex: A-05
			6) the user is asked for is details: FullName, PhoneNumber, Email, Country
			7) the user is given its tickets id: RE-XXXX
		3. Allow the user to retrieve it's flight details given the ticket-Id:
			1) the user gives the flight id: ORDS-XXXX
			2) the website returns the fligh information all the information in the Ticket class @Ticket

	***
		Remember best practices:
		1) Comments and documentation
		2) Clear function and variable names
		3) Use private and public 
		4) Use interfaces
		
		When finish upload your code to your git repo
	***
	
	d) EXTRA POINTS (15ps): Create a class called Internet, that simulates users buying from the internet. The class must:
		a) At random time intervals buy a ticket from a random flight
*/