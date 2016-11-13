import java.awt.*;

class Ex05_sub extends Frame{
	
	private Cursor cur1=new Cursor(Cursor.HAND_CURSOR);
	private Cursor cur2=new Cursor(Cursor.TEXT_CURSOR);
	private Button bt=new Button("실패");
	private GridBagLayout gbl=new GridBagLayout();
	
	public Ex05_sub(String title){
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
		this.setLayout(gbl);
		this.setCursor(cur2);
		bt.setCursor(cur1);
		this.add(bt);
	}
}

public class Ex05 {
	public static void main(String ar[]){
		Ex05_sub ex=new Ex05_sub("제목");
	}

}
