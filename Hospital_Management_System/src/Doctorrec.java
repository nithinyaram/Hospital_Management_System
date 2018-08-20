import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Doctorrec {

	   String dname,dgender,dspecial;
	   int dage,dphonenumber,sdid,did;
	   public int r[]=new int[100];
	    String str2="";
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    public void displaydrecord() {
	        System.out.println("\t #####Doctor Details#####");
	        System.out.print("I.D. Number:"+did);
	        System.out.print("\tName:"+dname);
	        System.out.print("\tAge:"+dage);
	        System.out.print("\tGender:"+dgender);
	        System.out.print("\tBlood Group:"+dspecial);
	        System.out.print("\tPhone Number:"+dphonenumber);
	        System.out.println("\n");

	    }
	    public void dim() throws IOException {
	int b,l,y;
	boolean flag2=true;
	while(flag2)
	    { 
	        System.out.println("1. Write Record ");
	        System.out.println("2. Update Record ");
	        System.out.println("3. Search");
	        System.out.println("4. Display Record");
	        System.out.println("5. Quit");
	        System.out.print("Enter your choice: ");
	        b= Integer.parseInt(br.readLine());
	    switch(b)
	    {
	                case 1: // Creation of Doctor file 
	                    FileWriter fout1 = new FileWriter("doctor.txt");
	                    System.out.println("How many Doctors?\t");
	                        y= Integer.parseInt(br.readLine()); 
	                 for(l=0;l<y;l++)
	                        {
	                            System.out.print("Enter Doctor Name:");
	                            dname=br.readLine();
	                            System.out.print("Enter Phone Number:");
	                            dphonenumber= Integer.parseInt(br.readLine());
	                            System.out.print("Enter Age:");
	                            dage =Integer.parseInt(br.readLine());
	                            System.out.print("Enter Gender:");
	                            dgender=br.readLine();
	                            System.out.print("Enter Specialisation:");
	                            dspecial=br.readLine();
	                            System.out.print("Enter I.D. Number:");
	                            did=Integer.parseInt(br.readLine());
	                            
	                         // Written to Doctor file   
	                            fout1.write(dphonenumber+"  \n");
	                            fout1.write(dname+"  \n");
	                            fout1.write(dage+"  \n");
	                            fout1.write(dgender+"  \n");
	                            fout1.write(dspecial+"  \n");
	                            fout1.write(did+"  \n\n");
	                        }
	                        fout1.write("EOF");
	                        fout1.close(); 
	                        System.out.println("\nFile is created\n");
	                        break;
	                case 2: // Updation of Doctor file 
	                    FileWriter fout2 = new FileWriter("doctor.txt",true);
	                    System.out.println("How many Doctors?\t");
	                        y= Integer.parseInt(br.readLine()); 
	                 for(l=0;l<y;l++)
	                        {
	                            System.out.print("Enter Doctor Name:");
	                            dname=br.readLine();
	                            System.out.print("Enter Phone Number:");
	                            dphonenumber= Integer.parseInt(br.readLine());
	                            System.out.print("Enter Age:");
	                            dage =Integer.parseInt(br.readLine());
	                            System.out.print("Enter Gender:");
	                            dgender=br.readLine();
	                            System.out.print("Enter Specialisation:");
	                            dspecial=br.readLine();
	                            System.out.print("Enter I.D. Number:");
	                            did=Integer.parseInt(br.readLine());
	                            
	                         // Written to Doctor file   
	                            fout2.write(dphonenumber+"  \n");
	                            fout2.write(dname+"  \n");
	                            fout2.write(dage+"  \n");
	                            fout2.write(dgender+"  \n");
	                            fout2.write(dspecial+"  \n");
	                            fout2.write(did+"  \n\n");
	                        }
	                        fout2.write("EOF");
	                        fout2.close(); 
	                        System.out.println("\nFile is updated\n");
	                        break;
	                case 3: System.out.print("Enter Doctor I.D. Number:");
	                       sdid = Integer.parseInt(br.readLine());
	                case 4: FileReader fin = new FileReader("doctor.txt");
	                        Scanner sc = new Scanner(fin);
	                        while(sc.hasNextInt()) 
	                        {
	                            //Read data from file
	                            dphonenumber = sc.nextInt();
	                            dname = sc.next(); 
	                            dage = sc.nextInt();
	                            dgender = sc.next();
	                            dspecial = sc.next();
	                            did = sc.nextInt();
	                            int i=0;    
	                            r[i]=did;i++;
	                            if(b==4)
	                            displaydrecord();
	                          else if(b==3){
	                                if(sdid == did)
	                                displaydrecord();
	                                else
	                                System.out.println("Record not found");
	                            }
	                        }   
	                        str2 = sc.next();
	                    if (str2.equals("EOF")) {
	                        System.out.println("End of file");
	                    } else {
	                        System.out.println("File format error.");
	                    }
	                    fin.close();
	                    break;
	                case 5: flag2=false;
	                        break;
	                default:System.out.println("Wrong Choice!!");
	            flag2=false;
	                break;
	        }    
	}
	}

}
