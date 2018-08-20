import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Treatmentrec {
	String dateofjoining, treatment, diagnoseddisease, prescription, dischargedate, result;
	int tid, stid, spid, sdid, t1, t2;
	boolean f = true;
	String str3 = "";
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Patientrec p1 = new Patientrec();
	Doctorrec d1 = new Doctorrec();

	void displaytrecord() throws IOException {
		System.out.print("Treament I.D. Number:" + tid);
		System.out.print("Date of Joining:" + dateofjoining);
		System.out.print("Patient's I.D. Number:" + spid);
		System.out.print("Doctor's I.D. Number:" + sdid);
		System.out.print("Treament:" + treatment);
		System.out.print("Disease Diagnosed with:" + diagnoseddisease);
		System.out.print("Medicines Prescription:" + prescription);
		System.out.print("Date of Discharge:" + dischargedate);
		System.out.print("RESULT:" + result);
		System.out.println("\n");

	}

	public void tim() throws IOException {
		int c, m, z;
		boolean flag3 = true;

		while (flag3) {
			System.out.println("1. Write Record ");
			System.out.println("2. Update Record ");
			System.out.println("3. Search");
			System.out.println("4. Display Record");
			System.out.println("5. Quit");
			System.out.print("Enter your choice: ");
			c = Integer.parseInt(br.readLine());
			switch (c) {
			case 1:
				FileWriter fout3 = new FileWriter("treatment.txt");
				System.out.print("How many Treatment Records? ");
				z = Integer.parseInt(br.readLine());
				for (m = 0; m < z; m++) {
					System.out.print("Enter Date of Joining:");
					dateofjoining = br.readLine();
					System.out.print("Enter Patient's I.D. Number:");
					t1 = Integer.parseInt(br.readLine());
					int k = 0;
					if (p1.q.length != 0) {
						if (t1 == p1.q[k])
							System.out.println("Patient I.D number not found");
						else {
							t1 = 1;
							spid = t1;
							k++;
							System.out.println("Patient I.D number found");
						}
					}
					System.out.print("Enter Doctor's I.D. Number:");
					t2 = Integer.parseInt(br.readLine());
					int l = 0;
					if (d1.r.length != 0) {
						if (d1.r[l] == t2)
							System.out.println("Doctor I.D number not found");
						else {
							t2 = 2;
							l++;
							sdid = t2;
							System.out.println("Doctor I.D number found");
						}
					}
					System.out.print("Enter Treament:");
					treatment = br.readLine();
					System.out.print("Enter Disease Diagnosed with:");
					diagnoseddisease = br.readLine();
					System.out.print("Enter Medicines Prescribed:");
					prescription = br.readLine();
					System.out.print("Enter Date of Discharge:");
					dischargedate = br.readLine();
					System.out.print("Enter RESULT:");
					result = br.readLine();
					System.out.print("Enter Treatment I.D. Number:");
					tid = Integer.parseInt(br.readLine());
					// Write to file.
					fout3.write(tid + "  \n");
					fout3.write(dateofjoining + "  \n");
					fout3.write(treatment + "  \n");
					fout3.write(diagnoseddisease + "  \n");
					fout3.write(prescription + "  \n");
					fout3.write(dischargedate + "  \n");
					fout3.write(result + "  \n");
					fout3.write(sdid + "  \n\n");

				}
				fout3.write("EOF");
				fout3.close();
				System.out.println("File is created");
				break;
			case 2:
				FileWriter fout4 = new FileWriter("treatment.txt");
				System.out.print("How many Treatment Records? ");
				z = Integer.parseInt(br.readLine());
				for (m = 0; m < z; m++) {
					System.out.print("Enter Date of Joining:");
					dateofjoining = br.readLine();
					System.out.print("Enter Patient's I.D. Number:");
					t1 = Integer.parseInt(br.readLine());
					int k = 0;
					if (p1.q.length != 0) {
						if (t1 == p1.q[k])
							System.out.println("Patient I.D number not found");
						else {
							t1 = 1;
							spid = t1;
							k++;
							System.out.println("Patient I.D number found");
						}
					}
					System.out.print("Enter Doctor's I.D. Number:");
					t2 = Integer.parseInt(br.readLine());
					int l = 0;
					if (d1.r.length != 0) {
						if (d1.r[l] == t2)
							System.out.println("Doctor I.D number not found");
						else {
							t2 = 2;
							l++;
							sdid = t2;
							System.out.println("Doctor I.D number found");
						}
					}
					System.out.print("Enter Treament:");
					treatment = br.readLine();
					System.out.print("Enter Disease Diagnosed with:");
					diagnoseddisease = br.readLine();
					System.out.print("Enter Medicines Prescribed:");
					prescription = br.readLine();
					System.out.print("Enter Date of Discharge:");
					dischargedate = br.readLine();
					System.out.print("Enter RESULT:");
					result = br.readLine();
					System.out.print("Enter Treatment I.D. Number:");
					tid = Integer.parseInt(br.readLine());
					// Write to file.
					fout4.write(tid + "  \n");
					fout4.write(dateofjoining + "  \n");
					fout4.write(treatment + "  \n");
					fout4.write(diagnoseddisease + "  \n");
					fout4.write(prescription + "  \n");
					fout4.write(dischargedate + "  \n");
					fout4.write(result + "  \n");
					fout4.write(sdid + "  \n\n");

				}
				fout4.write("EOF");
				fout4.close();
				System.out.println("File is created");
				break;
			case 3:
				System.out.print("Enter Treatment I.D. Number : ");
				stid = Integer.parseInt(br.readLine());
			case 4:
				FileReader fin = new FileReader("treatment.txt");
				Scanner sc = new Scanner(fin);
				while (sc.hasNextInt()) {
					// Read data from file
					tid = sc.nextInt();
					dateofjoining = sc.next();
					treatment = sc.next();
					diagnoseddisease = sc.next();
					prescription = sc.next();
					dischargedate = sc.next();
					result = sc.next();
					spid = sc.nextInt();
					sdid = sc.nextInt();

					if (c == 3) {
						displaytrecord();
					}
					if (c == 2) {

						if (spid == p1.pid && sdid == d1.did && stid == tid) {
							displaytrecord();

						}
					}
				}
				str3 = sc.next();
				if (str3.equals("EOF")) {
					System.out.println("\nEnd of file");
				} else {
					System.out.println("File format error.");
				}
				fin.close();
				break;
			case 5:
				flag3 = false;
				break;
			default:
				System.out.println("Wrong Choice!!");
			}
		}
	}

}
