import java.awt.*;

class Ex18_sub extends Frame{
	
	Label lb1=new Label("좌측정렬",Label.LEFT);
	Label lb2=new Label("중앙정렬",Label.CENTER);
	Label lb3=new Label("우측정렬",Label.RIGHT);
	BorderLayout bl=new BorderLayout();
	
	public Ex18_sub(String title){
		super(title); // 객체는 어디에 ?
		super.setSize(300,200);
		

		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();

		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setVisible(true);
		super.setResizable(false);
		this.setLayout(bl);
		this.add("Center",lb1);
		try{Thread.sleep(1000);}catch(InterruptedException ee){}
		lb1.setText(lb2.getText());
		lb1.setAlignment(lb2.getAlignment());
		try{Thread.sleep(1000);}catch(InterruptedException ee){}
		lb1.setText(lb3.getText());
		lb1.setAlignment(lb3.getAlignment());
		

		
	}
	
		
	
	
}

public class Ex18 {
	public static void main(String ar[]){
		Ex18_sub ex=new Ex18_sub("제목");
	}

}