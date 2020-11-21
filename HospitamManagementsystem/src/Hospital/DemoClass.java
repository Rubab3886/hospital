package Hospital;
import javax.swing.JOptionPane;
public class DemoClass {
public static void main(String args[]) {
	String number=JOptionPane.showInputDialog("Enter number of doctors ");
	int n=Integer.parseInt(number);
	Doctor d[]=new Doctor[n];
	for(int i=0;i<n;i++)
	{
		d[i]=new Doctor();
		d[i].input();
	}
	String num=JOptionPane.showInputDialog(" enter number of patients:");
	int y=Integer.parseInt(num);
	Patient p[]=new Patient[y];
	int f =0;
	int doc;
	for(int j=0;j<y;j++)
	{
		System.out.println(" 1: press 1 for indoorpatient::");
		System.out.println(" 2: press 2 for outdoorpatient::");
		String choice=JOptionPane.showInputDialog(" enter your choice ");
		int c=Integer.parseInt(choice);
		if(c==1) {
			p[j]=new IndoorPatient();
			f=0;
			doc=0;
			p[j].input();
		
		while(f==0) 
		{
			String docname=JOptionPane.showInputDialog(" enter doctor name for this patient");
			for(int i=0;i<n;i++) {
				if(d[i].getname().equalsIgnoreCase(docname)) {
					f=1;
					doc=1;
					break;
				}
			}
			if(f==0) {
				System.out.println(" the doctor is not found");
			}
		}
		if(f==1) {
			p[j].input2(d[doc]);
		}
		}
		else if(c==2) {
			p[j]=new OutdoorPatient();
			f=0;
			doc=0;
			p[j].input();
			while(f==0) 
			{
				String docname=JOptionPane.showInputDialog(" enter doctor name for this patient");
				for(int i=0;i<n;i++) {
					if(d[i].getname().equalsIgnoreCase(docname)) {
						f=1;
						doc=1;
						break;
					}
				}
				if(f==0) {
					System.out.println(" the doctor is not found");
				}
			}
			
			if(f==1) {
				p[j].input2(d[doc]);
			}
		}
		else {
			System.out.println(" enter valid choice ");
		}
	}
	char choice='y';
	int ch;
	do {
		System.out.println("1: see the list of all Doctors ");
		System.out.println("2:Search a doctor by name or department ");
		System.out.println("3: See the list of all indoor patients ");
		System.out.println("4:See the list of all appointments on a certain day ");
		System.out.println("5:See the list of appointments of a certain doctor ");
		System.out.println("6:Change the date or time of appointment of a certain patient. ");
		String choice2=JOptionPane.showInputDialog(" enter your choice :");
		ch=Integer.parseInt(choice2);
		if(ch==1) {
			for(int i=0;i<n;i++) {
				JOptionPane.showMessageDialog(null,"Doctor :"+d[i].ToString()," doctor details :",JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(ch==2) {
			System.out.println("1: search by name ");
			System.out.println("2: serach by department ");
			String choice3=JOptionPane.showInputDialog(" enter your choice ");
			int option=Integer.parseInt(choice3);
			if(option==1) {
				f=0;
				String dname=JOptionPane.showInputDialog(" enter the name of the doctor to be searched ");
				for(int i=0;i<n;i++) {
					if(dname.equalsIgnoreCase(d[i].getname())) {
						JOptionPane.showMessageDialog(null,"  name found "+d[i].ToString(),"searching",JOptionPane.WARNING_MESSAGE);
						f=1;
					}
				}
				if(f==0) {
					System.out.println(" doctor not found ");
				}
			}
			else if(option==2) {
				f=0;
				String dp=JOptionPane.showInputDialog(" enter the name of the department to be searched ");
				for(int i=0;i<n;i++)
				{
					if(dp.equalsIgnoreCase(d[i].getdep()))
					{
						JOptionPane.showMessageDialog(null," department name found "+d[i].ToString(),"searching",JOptionPane.WARNING_MESSAGE);
						f=1;
					}
			}
				if(f==0) {
					System.out.println(" department not found ");
				}
				
		}
			else System.out.println(" invalid option");
	}
		else if(ch==3) {
			f=0;
			for(int i=0;i<y;i++) {
				if(p[i] instanceof IndoorPatient) {
					JOptionPane.showMessageDialog(null," indoor patient "+p[i].ToString(),"Indoor patient ",JOptionPane.WARNING_MESSAGE);
					f=1;
				}
			}
			if(f==0) {
				System.out.println(" there is no indoor patient ");
			}
		}
		else if(ch==4) {
			f=0;
			String apd=JOptionPane.showInputDialog(" enter the day to list appointments ");
			int pday=Integer.parseInt(apd);
			for(int i=0;i<y;i++) {
				if(p[i] instanceof OutdoorPatient) {
					if(pday==p[i].getday()) {
						JOptionPane.showMessageDialog(null," appointment  "+p[i].ToString(),"APPOINTMENT ",JOptionPane.WARNING_MESSAGE);
						f=1;
					}
				}
			}
			if(f==0) {
				System.out.println(" there is no appointment on this day ");
			}
		}
		else if(ch==5) {
			f=0;
			String docn=JOptionPane.showInputDialog(" enter the doctor name  ");
			for(int i=0;i<y;i++) {
				if(p[i] instanceof OutdoorPatient) {
					if(docn.equalsIgnoreCase(p[i].getdocname())) {
						JOptionPane.showMessageDialog(null, "appointment "+p[i].ToString(),"APPOINTMENT",JOptionPane.WARNING_MESSAGE);
						f=1;
					}
				}
			}
			if(f==0) {
				System.out.println(" there is no doctor  appointment on this day ");
			}
		}
		else if(ch==6) {
			System.out.println("1: to search appointment by date");
			System.out.println("2:Search appointment y time ");
			String op=JOptionPane.showInputDialog(" enter your choice ");
			int opo=Integer.parseInt(op);
			if(opo==1) {
				f=0;
				String pname=JOptionPane.showInputDialog(" enter the name of patient to change date of appointment ");
				for(int i=0;i<y;i++) {
					if(p[i] instanceof OutdoorPatient) {
						if(pname.equalsIgnoreCase(p[i].getname())) {
							p[i].changedate();
							f=1;
							JOptionPane.showMessageDialog(null, "patient "+p[i].ToString(),"update date ",JOptionPane.WARNING_MESSAGE);
						}
					}
				}
				if(f==0) {
					System.out.println(" not found  ");
				}
			}
			else if(opo==2) {
				String pname=JOptionPane.showInputDialog(" enter the name of patient to change date of appointment ");
				for(int i=0;i<y;i++) {
					if(p[i] instanceof OutdoorPatient) {
						if(pname.equalsIgnoreCase(p[i].getname())) {
							p[i].changetime();
							f=1;
							JOptionPane.showMessageDialog(null, "patient "+p[i].ToString(),"update time  ",JOptionPane.WARNING_MESSAGE);
						}
						}
						}
				if(f==0) {
					System.out.println(" not found  ");
				}
			}
			else System.out.println(" INVALID CHOICE :::");
		}
		else  System.out.println(" INVALID CHOICE :::");
		System.out.println(" press y for continue or n for not ");
}while(choice=='y');
}
}
