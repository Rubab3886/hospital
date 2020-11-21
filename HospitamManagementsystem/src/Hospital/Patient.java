package Hospital;
import javax.swing.JOptionPane;

import General.Date;
import General.Time;
public class Patient {
	private String Name;
	private String CNIC, Phoneno;
	private String Gender; 
	private String age,address; 
	Doctor d=new Doctor();
	Date da=new Date();
	Time t=new Time();
		public Patient(){
		Name=" ";
		CNIC=" ";
		Gender=" ";
		Phoneno=" ";
		address=" ";
		age=" ";
		

		
	}
	public Patient(String n,String c,String g,String p,String a,String add){
		Name=n;
		CNIC=c;
		Gender=g;
		Phoneno=p;
		address=add;
		age=a;}
	public void input() {
	String Name=JOptionPane.showInputDialog(" Enter patient name :");
	String CNIC=JOptionPane.showInputDialog(" Enter patient cnic :");
	String Gender=JOptionPane.showInputDialog(" Enter patient gender m/f :");
	String Phoneno=JOptionPane.showInputDialog(" Enter patient phone no :");
	String address=JOptionPane.showInputDialog(" Enter patient address :");
	String age=JOptionPane.showInputDialog(" Enter patient age :");
}
	String ToString() {
		return  ("name of patient: "+Name+"cnic is :"+CNIC+" gender :"+Gender+"address is:"
			+address+" age is :"+age+" phone no:"+Phoneno);
	}
	public void setname(String n) {
		Name=n;
	}
	public String getname() {
		return Name;
	}
	public void setcnic(String c) {
		CNIC=c;
	}
	public String getcnic() {
		return CNIC;
	}
	public void setgender(String g) {
		Gender=g;
	}
	public String getgender() {
		return Gender;
	}
	public void setaddress(String ad) {
		address=ad;
	}
	public String getaddress() {
		return address;
	}
	
	public void setage(String a) {
		age=a;
	}
	
	public String getage() {
		return age;
	}
	public void setpno(String p) {
		Phoneno=p;
	}
	
	public String getpno() {
		return Phoneno;
	}
	public void input2(Doctor d2) {
	d.input();
		
	}
	public int getday() {
		return da.getday();
	}
	public String getdocname() {
		return d.getname();
	}

public void changedate() {
	da.input();
}
public void changetime() {
	t.input();
}
	
}
