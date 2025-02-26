package linkedList;

public class LinkedListImpl implements LinkedList {
	private ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		// TODO Auto-generated method stub
		ListItem current = head;
		while (current != null) {
			if (current.data.equals(thisItem)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public Boolean addItem(String thisItem) {
		if (isItemInList(thisItem)) {
			return false;
		}
		ListItem newItem = new ListItem(thisItem);
		if (head == null) {
			head = newItem;
		} else {
			ListItem current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newItem;
		}
		return true;
	}

	@Override
	public Integer itemCount() {
		// TODO Auto-generated method stub
		int count = 0;
		ListItem current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	@Override
	public void listItems() {
		// TODO Auto-generated method stub
		ListItem current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		// TODO Auto-generated method stub
		if (head == null) {
			return false;
		}
		if (head.data.equals(thisItem)) {
			head = head.next;
			return true;
		}
		ListItem current = head;
		while (current.next != null) {
			if (current.next.data.equals(thisItem)) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		// TODO Auto-generated method stub
		if (head == null || !isItemInList(itemToInsertBefore)) {
			return false;
		}
		ListItem newNode = new ListItem(newItem);
		if (head.data.equals(itemToInsertBefore)) {
			newNode.next = head;
			head = newNode;
			return true;
		}
		ListItem current = head;
		while (current.next != null) {
			if (current.next.data.equals(itemToInsertBefore)) {
				newNode.next = current.next;
				current.next = newNode;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		// TODO Auto-generated method stub
		ListItem current = head;
		while (current != null) {
			if (current.data.equals(itemToInsertAfter)) {
				ListItem newNode = new ListItem(newItem);
				newNode.next = current.next;
				current.next = newNode;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		// useing a standard bubble sort algo

		//fix
		if (head == null || head.next == null) {
			return;
		}
		boolean swapped;
		do {
			swapped = false;
			ListItem current = head;
			ListItem prev = null;
			ListItem nextNode;

			while (current != null && current.next != null) {
				nextNode = current.next;
				if (current.data.compareTo(nextNode.data) > 0) {
					current.next = nextNode.next;
					nextNode.next = current;
					//tbhsi is the main problem
					if (prev == null) {
						head = nextNode;
					} else {
						prev.next = nextNode;
					}
					prev = nextNode;
					swapped = true;
				} else {
					prev = current;
					current = current.next;
				}
			}
		} while (swapped);
	}
	
}
