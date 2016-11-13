import java.awt.*;

class Ex04_sub extends Frame{
	
	private Color cc=new Color(125,78,234);
	private Button bt=new Button("Yes");
	private GridBagLayout gbl=new GridBagLayout();
	
	
	
	public Ex04_sub(String title){
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
		this.setBackground(cc);
		this.setLayout(gbl);
		this.add(bt);
		bt.setBackground(Color.BLACK);
		bt.setForeground(Color.white);
	}
}

public class Ex04 {
	public static void main(String ar[]){
		Ex04_sub ex=new Ex04_sub("제목");
	
		
	}

}
