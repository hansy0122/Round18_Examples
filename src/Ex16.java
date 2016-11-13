import java.awt.*;

class Ex16_sub extends Frame{
	
	Label lb=new Label("Test");
	FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
	
	
	public Ex16_sub(String title){
		super(title); // 객체는 어디에 ?
		super.setSize(300,200);
		
		this.init();

		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		
	}
	public void init(){
		this.setLayout(fl);
		this.add(lb);
		this.setBackground(Color.RED);
		lb.setBackground(Color.blue);
		lb.setForeground(Color.WHITE);
		this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		lb.setCursor(new Cursor(Cursor.E_RESIZE_CURSOR));
	}
}

public class Ex16 {
	public static void main(String ar[]){
		Ex16_sub ex=new Ex16_sub("제목");
	}

}