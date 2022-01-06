
ZENDESK CODING CHALLENGE 

This is a Ticket Viewer CLI program written in Java for the coding challenge for Zendesk Software internship process. The program connects with Zendesk API to request tickets information and display tickets that exist in the account. Tickets are either displayed in a list or individually with more details. When more than 25 tickets are returned, the program pages through the tickets.

TO RUN THIS PROGRAM:

Download the code the project to your local working directory
Make sure you have an appropriate up-to-date version of JDK (JRE version is 11)  that is compatible with the project downloaded and installed
Open the project in an IDE of your preference (IntelliJ IDEA, Visual Studio Code, Eclipse, etc.)
Go to src → main → java → org → example → App.java,
Use your IDE feature to run "App.java" to run the program
The program will run and display information in your console/terminal, in which you can type in your input to interact with the program.

APPLICATION DATA:

Application uses tickets.json ( available at the ZendeskCodingChallenge folder at the src level folder.) which are POSTed to zendesk demo account.

EXTERNAL LIBRARIES:

Jackson core
Jackson Databind
Jackson Annotations
Junit4