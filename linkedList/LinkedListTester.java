package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {		
		LinkedList busRoute = new LinkedListImpl();
        busRoute.addItem("station a");
        busRoute.addItem("station b");
        busRoute.addItem("staton c ");
        busRoute.addItem("station d");

        System.out.println("current bus route:");
        busRoute.listItems();

        System.out.println("checking if sation b is in the list: " + busRoute.isItemInList("station b"));
        System.out.println("checking if station x is in th elist : " + busRoute.isItemInList("station x"));
        
		
		System.out.println("removing station c");
        busRoute.deleteItem("sattion c");

        System.out.println("updated bus route:");
        busRoute.listItems();

        System.out.println("adding station x before b");
        busRoute.insertBefore("station x", "station b");

        System.out.println("updated bs route:");
        busRoute.listItems();

        System.out.println("adding station y before station b");
        busRoute.insertAfter("station y", "station b");

        System.out.println("final bus route:");
        busRoute.listItems();














	}

}
