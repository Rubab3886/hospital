package General;
import javax.swing.JOptionPane;
public class Time {
	private int  hours;
	private int minutes;
	private String ampm;
	public Time(){
		hours=0;
		minutes=0;
		ampm=" ";
	}
	public Time(int hours,int minutes,String ampm){
		this.hours=hours;
		this.minutes=minutes;
		this.ampm=ampm;
	}
	public void sethours(int h) {
		hours=h;
	}
	public int gethours() {
		return hours;
	}
	public void setminutes(int m) {
		minutes=m;
	}
	public int getminutes() {
		return minutes;
	}
	public String getampm() {
		return ampm;
	}
	public void setampm(String ampm) {
		this.ampm=ampm;
	}
	public void input() {
		String hours=JOptionPane.showInputDialog(" Enter hours :");
		int h=Integer.parseInt(hours);
		String minutes=JOptionPane.showInputDialog(" Enter minutes :");
		int m=Integer.parseInt(minutes);
		String ampm=JOptionPane.showInputDialog(" Enter am/pm :");
	}
	String ToString() {
		return (hours+":"+minutes+":"+ampm);
	}
}
