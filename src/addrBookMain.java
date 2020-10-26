package book.src;

public class addrBookMain {

	public static void main(String[] args) {
		
		BookManagerImp bm = new BookManagerImp();
		System.out.println("1. Create New Address Book");
		System.out.println("2. Open Address Book");
		System.out.println("3. Save Address Book");
		System.out.println("4. Save As Address Book");
		System.out.println("5. Close Address Book");
		System.out.println("6. Quit");
		AddrBookImp ab = new AddrBookImp();

	}

}
