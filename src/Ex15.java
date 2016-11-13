import java.awt.*;

class Ex15_sub extends Frame{
	private Label lb1=new Label("Test1");
	private Label lb2=new Label("Test2");
	private Label lb3=new Label("Test3");
	BorderLayout bl=new BorderLayout();
	
	
	Panel p=new Panel();
	Panel p1=new Panel();
	GridLayout gl=new GridLayout(1,2);
	GridLayout gl1=new GridLayout(2,1);
	
	
	public Ex15_sub(String title){
		super(title); // 객체는 어디에 ?
		super.setSize(300,200);
		this.init();

		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(true);
		super.setVisible(true);
		
	}
	public void init(){
		this.setLayout(bl);
		
		p.setLayout(gl);
		p.add(lb1);
		p.add(p1);
		p1.setLayout(gl1);
		p1.add(lb2);
		p1.add(lb3);
		lb3.setBackground(Color.red);
		
		this.add("South", p);
		
		
	}
}

public class Ex15 {
	public static void main(String ar[]){
		Ex15_sub ex=new Ex15_sub("제목");
	}

}