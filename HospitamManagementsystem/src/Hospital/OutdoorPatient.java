package Hospital;
import javax.swing.JOptionPane;
import General.Date;
import General.Time;
public class OutdoorPatient extends Patient {
Date d;
Time t;
Doctor doc;
IndoorPatient dfee;
public OutdoorPatient() {

	d= new Date();
	d.getday();
	d.getmonth();
	d.getyear();
	t=new Time();
	t.gethours();
	t.getminutes();
	t.getampm();
	doc=new Doctor();
	doc.getname();
	doc.getcnic();
	doc.getdep();
	doc.getgender();
	doc.getpno();
	doc.getsep();
	dfee=new IndoorPatient();
	dfee.getfee();
}
public void AddoutdoorPatient() {
	super.input();
}
public int getday() {
	return d.getday();
}
}
