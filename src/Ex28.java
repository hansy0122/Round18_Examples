import java.awt.*;

class Ex28_sub extends Frame{
	Button bt[]=new Button[50];
	BorderLayout bl=new BorderLayout();
	Panel p=new Panel();
	GridLayout gl=new GridLayout(5,10,2,2); 
	ScrollPane sp=new ScrollPane();
	public Ex28_sub(String title){
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
		p.setLayout(gl);
		for(int i=0;i<bt.length;i++){
			bt[i]=new Button("test"+i);
			p.add(bt[i]);
		}
		sp.add(p);
		this.add("Center", sp);
	}
	
	
}

public class Ex28 {
	public static void main(String ar[]){
		Ex28_sub ex=new Ex28_sub("제목");
	}

}