package Hospital;
import javax.swing.JOptionPane;

import General.Date;
import General.Time;
public class IndoorPatient extends Patient {
	private int wardno, Roomno, bedno,fee;
	Date date;
	Doctor doctor;
	Time atime;
	public IndoorPatient(){
		wardno=0;
		Roomno=0;
		bedno=0;
		fee=0;
		date=new Date();
		date.getday();
		date.getmonth();
		date.getyear();
		atime=new Time();
		atime.gethours();
		atime.getminutes();
		atime.getampm();
		doctor=new Doctor();
		doctor.getname();
		doctor.getcnic();
		doctor.getdep();
		doctor.getgender();
		doctor.getsep();
		doctor.getpno();
	}
	public IndoorPatient(int w,int r,int b,int f) {
		wardno=w;
		Roomno=r;
		bedno=b;
		fee=f;
	}
	public void  setwardno(int w) {
		wardno=w;
	}
	public int getwardno() {
		return wardno;
	}
	public void setroomno(int r) {
		Roomno=r;
	}
	public int getroomno() {
		return Roomno;
	}
	public void setbedno(int b) {
		bedno=b;
	}
	public int getbedno() {
		return bedno;
	}
	public void setfee(int f) {
		fee=f;
	}
	public int getfee() {
		return fee;
	}
	String ToString() {
		return ("Pward No :"+wardno+" Proom No:"+Roomno+" Pbed No:"+bedno+" fee:"+fee);
	}
	public int getday() {
		return date.getday();
	}
	public void input() {
		super.input();
		String wardNo = JOptionPane.showInputDialog("Enter ward no : ");
		wardno =Integer.parseInt(wardNo); 
		String roomNo = JOptionPane.showInputDialog("Enter room no : ");
		Roomno =Integer.parseInt(roomNo); 
		String bedNo = JOptionPane.showInputDialog("Enter bed no : ");
		bedno =Integer.parseInt(bedNo);
		String Fee = JOptionPane.showInputDialog("Enter doctor fee : ");
		fee =Integer.parseInt(Fee); 
	}

}
