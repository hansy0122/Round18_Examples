import java.awt.*;

class Ex03_sub extends Frame{
	
	Panel pl1=new Panel();
	Panel pl2=new Panel();
	Button bt1=new Button("성공");
	Button bt2=new Button("실패1");
	Button bt3=new Button("실패2");
	
	private BorderLayout bl=new BorderLayout();
	private GridLayout gl=new GridLayout(1,2);
	
	public Ex03_sub(String title){
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
		this.setLayout(bl);
		pl1.setLayout(gl);
		pl2.setLayout(gl);
		
		
		this.add(pl1, "South");
		pl1.add(bt1);
		pl1.add(pl2);
		pl2.add(bt2);
		pl2.add(bt3);
	}
}

public class Ex03 {
	public static void main(String ar[]){
		Ex03_sub ex=new Ex03_sub("제목");
	}

}

