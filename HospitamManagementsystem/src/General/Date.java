package General;
import javax.swing.JOptionPane;
public class Date {
private int  day;
private int month;
private int year;
 public Date(){
	day=0;
	month=0;
	year=0;
}
 public Date(int day,int month,int year){
	this.day=day;
	this.month=month;
	this.year=year;
}
public void setday(int d) {
	day=d;
}
public int getday() {
	return day;
}
public void setmonth(int m) {
	month=m;
}
public int getmonth() {
	return month;
}
public void setyear(int y) {
	year=y;
}
public int getyear() {
	return year;
}
public void input() {
	String day=JOptionPane.showInputDialog(" Enter day :");
	int d=Integer.parseInt(day);
	String month=JOptionPane.showInputDialog(" Enter month :");
	int m=Integer.parseInt(month);
	String year=JOptionPane.showInputDialog(" Enter year :");
	int y=Integer.parseInt(year);
}
String ToString() {
	return (day+"/"+month+"/"+year);
}
}
