import java.awt.*;
import java.util.*;

class Ex22_sub extends Frame {
	Label lb1=new Label("year");
	Label lb2=new Label("month");
	Label lb3=new Label("day");
	Calendar now=Calendar.getInstance();
	BorderLayout bl=new BorderLayout();
	Panel p=new Panel();
	Choice cy=new Choice();
	
	Choice cm=new Choice();
	Choice cd=new Choice();
	public Ex22_sub(String title) {
		super(title); // 객체는 어디에 ?
		super.setSize(300, 200);
		this.init();

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = super.getSize();

		int xpos = (int) (screen.getWidth() / 2 - frm.getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2 - frm.getHeight() / 2);
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		super.setVisible(true);
		
		cm.requestFocus();
	}
	public void init(){
		this.setLayout(bl);
		for(int i=0;i<=now.get(Calendar.YEAR);i++){cy.add(String.valueOf(i));}
		for(int i=1;i<=12;i++){cm.add(String.valueOf(i));}
		for(int i=1;i<=31;i++){cd.add(String.valueOf(i));}
		p.add(lb1);
		p.add(cy);
		p.add(lb2);
		p.add(cm);
		p.add(lb3);
		p.add(cd);
		this.add("Center",p);
		
		
	}
}

public class Ex22 {
	public static void main(String ar[]) {
		Ex22_sub ex = new Ex22_sub("제목");
	}

}