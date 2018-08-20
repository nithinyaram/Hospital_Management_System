import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hospital {
	public static void main(String[] args) throws IOException {
		int choice;
		boolean flag = true;
		final int LIMIT = 3;
		int count = 0;
		String username1 = "mechanical";
		String password1 = "123";
		String username2, password2;
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Patientrec pr = new Patientrec();
		Doctorrec dr = new Doctorrec();
		Treatmentrec tr = new Treatmentrec();

		while (flag) {
			System.out.print("Enter Username: ");
			username2 = scan.nextLine();

			if (username1.equals(username2)) {
				while (count < LIMIT) {
					System.out.print("Enter Password: ");
					password2 = scan.nextLine();
					if (password2.equals(password1)) {
						System.out.println("Welcome!");
						System.out.println("\tMenu");
						System.out.println("1. Patient Information Management ");
						System.out.println("2. Doctor Information Management");
						System.out.println("3. Treatment Information Management");
						System.out.println("4. Quit");
						System.out.print("Enter your choice: ");
						choice = Integer.parseInt(br.readLine());
						switch (choice) {
						case 1:
							pr.pim();
							break;
						case 2:
							dr.dim();
							break;
						case 3:
							tr.tim();
							break;
						case 4:
							System.out.println("Quit");
							System.exit(0);
						default:
							System.out.println("Wrong Choice!!");
						}
					} else {
						System.out.println("Incorrect entry. Please try again.");
						count++;
					}
				}
				System.out.println("Your 3 tries are up!");
				System.out.println("Wiping hard drive!");
				System.exit(0);
			}
		}
	}

}
