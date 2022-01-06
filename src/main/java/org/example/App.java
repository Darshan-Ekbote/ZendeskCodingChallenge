package org.example;

import java.io.IOException;
import java.net.ConnectException;
import java.util.Base64;
import java.util.Scanner;

import model.AllConstants;
import model.TicketViewer;
import model.AllConstants;

/**
 * This is a Ticket Viewer program that connects with Zendesk API and display
 * tickets information with pagination feature
 *
 * @author Darshan Ekbote
 */
public class App {

	private static final String USER = "darshan.ekbote444@gmail.com";
	private static final String TOKEN = "/token:";
	private static final String APIKEY = "wgfCIjasv0BMHUjwf7Sv4sFRx00DHT3Ay2e8JL0J";

	public static void main(String[] args) throws IOException, InterruptedException {

		Scanner scanner = new Scanner(System.in);
		String userChoice;
		TicketViewer ticketViewer;

		System.out.println("\n \n");
		System.out.println(AllConstants.WELCOME_MESSAGE);

		while (true) {
			System.out.println();
			System.out.println(AllConstants.MAIN_MENU);
			System.out.println(AllConstants.ENTER_OPTION);
			System.out.println(AllConstants.VIEW_ALL_TICKETS);
			System.out.println(AllConstants.TICKET_BY_ID);
			System.out.println(AllConstants.QUIT);
			System.out.print(AllConstants.CHOICE);
			userChoice = scanner.nextLine(); // could trim input if want to
			System.out.println();

			if (userChoice.equals("1")) {
				try {
					ticketViewer = TicketViewer.getAllTickets();
					// get all the fields of tickets
					System.out.println(ticketViewer);

					while (true) {
						System.out.println();
						System.out.println(AllConstants.ENTER_OPTION);
						System.out.println(AllConstants.RETURN_MAIN_MENU);
						System.out.println(AllConstants.PREVIOUS_PAGE);
						System.out.println(AllConstants.NEXT_PAGE);
						System.out.print(AllConstants.CHOICE);
						userChoice = scanner.nextLine();
						System.out.println();

						if (userChoice.equals("1")) {
							break;
						} else if (userChoice.equals("2")) {
							ticketViewer = ticketViewer.getPreviousPage();
							System.out.println(ticketViewer);

						} else if (userChoice.equals("3")) {
							ticketViewer = ticketViewer.getNextPage();
							System.out.println(ticketViewer);
						} else {
							System.out.println(AllConstants.INVALID_OPTION);
						}
					}
				} catch (ConnectException e) {
					System.out.println(AllConstants.CONNECTION_FAILED);
				}

			} else if (userChoice.equals("2")) {
				try {
					System.out.print(AllConstants.ENTER_TICKET_ID);
					userChoice = scanner.nextLine();
					ticketViewer = TicketViewer.getTicketById(Integer.parseInt(userChoice));

					if (ticketViewer.tickets.length == 0) {
						throw new IOException();
					}

					System.out.println(ticketViewer.toStringIndividual());
				} catch (NumberFormatException e) {
					System.out.println(AllConstants.INVALID_TICKED_ID);
				} catch (IOException e) {
					System.out.println(AllConstants.TICKET_NOT_FOUND);
				}
			} else if (userChoice.equals("3")) {
				System.out.println(AllConstants.THANKS_MESSAGE);
				break;
			} else {
				System.out.println(AllConstants.INVALID_OPTION);
			}
		}
	}

	/**
	 * + Method to get information for API authorization
	 *
	 * @return a string of encoded credential for darshan.ekbote444@gmail.com
	 *         Zendesk trial account
	 */
	public static String getEncodedCredential() {
		String apiTokenCredentials = USER + TOKEN + APIKEY;
		String encodedCredential = new String(Base64.getEncoder().encode(apiTokenCredentials.getBytes()));
		return encodedCredential;
	}
}
