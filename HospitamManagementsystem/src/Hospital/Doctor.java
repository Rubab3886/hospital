package Hospital;
import javax.swing.JOptionPane;
public class Doctor {
	private String name;
	private String cnic, phone_no;
	private String gender; 
	private String department; 
	private String specialization;
	public Doctor(){
		name=" ";
		cnic=" ";
		gender=" ";
		department=" ";
		specialization=" ";
		phone_no=" ";
	}
	public Doctor(String n,String c,String g,String d,String s,String p){
		name=n;
		cnic=c;
		gender=g;
		department=d;
		specialization=s;
		phone_no=p;
	}
	public void input() {
		String name=JOptionPane.showInputDialog(" Enter doctor name :");
		String cnic=JOptionPane.showInputDialog(" Enter doctor cnic :");
		String gender=JOptionPane.showInputDialog(" Enter doctor gender m/f :");
		String department=JOptionPane.showInputDialog(" Enter doctor dep :");
		String specialization=JOptionPane.showInputDialog(" Enter doctor specialization :");
		String Phone_no=JOptionPane.showInputDialog(" Enter doctor phone_no :");
	}
	String ToString() {
		return ("name of doctor: "+name+"cnic is :"+cnic+" gender :"+gender+"department is"
				+ " :"+department+" specialization is :"+specialization+" phone no:"+phone_no);
	}
	public void setname(String n) {
		name=n;
	}
	public String getname() {
		return name;
	}
	public void setcnic(String c) {
		cnic=c;
	}
	public String getcnic() {
		return cnic;
	}
	public void setgender(String g) {
		gender=g;
	}
	public String getgender() {
		return gender;
	}
	public void setdep(String d) {
		department=d;
	}
	public String getdep() {
		return department;
	}
	
	public void setsp(String s) {
		specialization=s;
	}
	
	public String getsep() {
		return specialization;
	}
	public void setpno(String p) {
		phone_no=p;
	}
	
	public String getpno() {
		return phone_no;
	}
}
