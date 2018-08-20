import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Patientrec {
	String pname, pgender, pbloodgroup;
	int page, pphonenumber, spid, pid;
	public int q[] = new int[100];
	String str1 = "";
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void displayprecord() {
		System.out.println("\t #####Patient Details#####");
		System.out.print("I.D. Number:" + pid);
		System.out.print("\tName:" + pname);
		System.out.print("\tAge:" + page);
		System.out.print("\tGender:" + pgender);
		System.out.print("\tBlood Group:" + pbloodgroup);
		System.out.print("\tPhone Number:" + pphonenumber);
		System.out.println("\n");
	}

	public void pim() throws IOException {
		int a, k, x, i = 0;
		boolean flag1 = true;
		while (flag1) {
			System.out.println("1. Write Record ");
			System.out.println("2. Update Record ");
			System.out.println("3. Search");
			System.out.println("4. Display Record");
			System.out.println("5. Quit");
			System.out.print("Enter your choice: ");
			a = Integer.parseInt(br.readLine());
			switch (a) {
			case 1: // Creation of Patient file
				FileWriter fout1 = new FileWriter("patient.txt");
				// Read data from Keyboard
				System.out.println("How many Patients?");
				x = Integer.parseInt(br.readLine());
				for (k = 0; k < x; k++) {
					System.out.print("Enter Patient Name:");
					pname = br.readLine();
					System.out.print("Enter Phone Number:");
					pphonenumber = Integer.parseInt(br.readLine());
					System.out.print("Enter Age:");
					page = Integer.parseInt(br.readLine());
					System.out.print("Enter Gender:");
					pgender = br.readLine();
					System.out.print("Enter Bloodgroup:");
					pbloodgroup = br.readLine();
					System.out.print("Enter I.D. Number:");
					pid = Integer.parseInt(br.readLine());
					q[i] = pid;
					i++;

					// Written to Patient file
					fout1.write(pphonenumber + "  \n");
					fout1.write(pname + "  \n");
					fout1.write(page + "  \n");
					fout1.write(pgender + "  \n");
					fout1.write(pbloodgroup + "  \n");
					fout1.write(pid + "  \n\n");
				}
				fout1.write("EOF");
				fout1.close();
				System.out.println("\nFile is created\n");
				break;
			case 2: // Updation of Patient file
				FileWriter fout2 = new FileWriter("patient.txt", true);
				// Read data from Keyboard
				System.out.println("How many Patients?");
				x = Integer.parseInt(br.readLine());
				for (k = 0; k < x; k++) {
					System.out.print("Enter Patient Name:");
					pname = br.readLine();
					System.out.print("Enter Phone Number:");
					pphonenumber = Integer.parseInt(br.readLine());
					System.out.print("Enter Age:");
					page = Integer.parseInt(br.readLine());
					System.out.print("Enter Gender:");
					pgender = br.readLine();
					System.out.print("Enter Bloodgroup:");
					pbloodgroup = br.readLine();
					System.out.print("Enter I.D. Number:");
					pid = Integer.parseInt(br.readLine());
					q[i] = pid;
					i++;

					// Written to Patient file
					fout2.write(pphonenumber + "  \n");
					fout2.write(pname + "  \n");
					fout2.write(page + "  \n");
					fout2.write(pgender + "  \n");
					fout2.write(pbloodgroup + "  \n");
					fout2.write(pid + "  \n\n");
				}
				fout2.write("EOF");
				fout2.close();
				System.out.println("\nFile is updated\n");
				break;
			case 3:
				System.out.print("Enter Patient I.D. Number:");
				spid = Integer.parseInt(br.readLine());
			case 4:
				FileReader fin = new FileReader("patient.txt");
				Scanner sc = new Scanner(fin);
				while (sc.hasNextInt()) {
					// Read data from file
					pphonenumber = sc.nextInt();
					pname = sc.next();
					page = sc.nextInt();
					pgender = sc.next();
					pbloodgroup = sc.next();
					pid = sc.nextInt();
					q[i] = pid;
					if (a == 4)
						displayprecord();
					else if (a == 3) {
						if (spid == q[i])
							displayprecord();
						else
							System.out.println("Record not found");
					}
				}
				str1 = sc.next();
				if (str1.equals("EOF")) {
					System.out.println("End of file");
				} else {
					System.out.println("File format error.");
				}
				fin.close();
				break;
			case 5:
				flag1 = false;
				break;
			default:
				System.out.println("Wrong Choice!!");
				flag1 = false;
			}
		}
	}

}
