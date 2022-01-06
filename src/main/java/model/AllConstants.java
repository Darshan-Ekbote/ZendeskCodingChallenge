/**
 * 
 */
package model;

/**
 * Class that contains all the Constants used in the classes
 *
 * @author Darshan Ekbote
 */
public class AllConstants {

	/** Zendesk API for requesting tickets for this account */
	static final String TICKETS_API = "https://zcczendeskcodingchallenge8388.zendesk.com/api/v2/tickets";
	/** Tickets page size */
	static final int PAGE_SIZE = 25;
	/** Authorization */
	static final String AUTH = "Authorization";
	/** Basic */
	static final String BASIC = "Basic ";
	/** Accept */
	static final String ACCEPT = "Accept";
	/** Content type application/json */
	static final String CONTENT_TYPE = "application/json";
	/** Ticket id */
	public static final String TICKET_ID = "Ticket ID:";
	/** When ticket was created */
	public static final String CREATED_AT = "   Created at: ";
	/** Ticket requester id */
	public static final String REQUESTED_ID = "   Requester ID: ";
	/** Ticket assignee id */
	public static final String ASSIGNEE_ID = "   Assignee ID: ";
	/** Ticket subject */
	public static final String SUBJECT = "   Subject: ";
	/** Ticket tags */
	public static final String TAGS = "   Tags: ";
	/** Ticket description */
	public static final String DESCRIPTION = "   Description: ";

	/** Welcome message */
	public static final String WELCOME_MESSAGE = "*** WELCOME TO TICKET VIEWER APP! ***";
	/**Invalid option */
	public static final String INVALID_OPTION = "** ATTENTION: Please enter valid option ! **";
	/** Connection Failed*/
	public static final String CONNECTION_FAILED = "** ATTENTION: Failed to connect to Zendesk API . Check your connection. **";
	/** Invalid Ticket ID */
	public static final String INVALID_TICKED_ID = "** ATTENTION: Invalid id. Id needs to be a positive integer (so space allowed). Returning to main menu. **";
	/** Thanks Message */
	public static final String THANKS_MESSAGE = "*** THANKS FOR USING TICKETS VIEWER! ***";
	/** Ticket not found */
	public static final String TICKET_NOT_FOUND = "** ATTENTION: Didn't find a ticket with the provided id. Returning to main menu. **";

	/**Main Menu */
	public static final String MAIN_MENU = "** MAIN MENU **";
	/** Continue option */
	public static final String ENTER_OPTION = "Enter an option number to continue:";
	/** View all tickets */
	public static final String VIEW_ALL_TICKETS = "1. View all tickets";
	/**  View a ticket by id */
	public static final String TICKET_BY_ID = "2. View a ticket by id";
	/** Quit */
	public static final String QUIT = "3. Quit";
	/** String choice */
	public static final String CHOICE = "Your choice: ";
	/** Content type application/json */
	public static final String RETURN_MAIN_MENU = "1. Return to main menu";
	/** Return to main menu */
	public static final String PREVIOUS_PAGE = "2. Previous page";
	/** Next page */
	public static final String NEXT_PAGE = "3. Next page";
	/** Enter ticket id */
	public static final String ENTER_TICKET_ID = "Enter ticket id: ";

}
