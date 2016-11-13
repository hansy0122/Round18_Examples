import java.awt.*;

class Ex11_sub extends Frame{
	
	private Label title_lb=new Label("title: ", Label.RIGHT);
	private TextField title_tf=new TextField();
	private TextArea contents_ta=new TextArea();
	private Button register_bt=new Button("regist");
	private BorderLayout bl=new BorderLayout(10,10);
	private Panel p=new Panel();
	private BorderLayout bl1=new BorderLayout();
	private Panel p1=new Panel();
	private FlowLayout fl=new FlowLayout(FlowLayout.RIGHT);//우측정렬
	
	public Ex11_sub(String title){
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
		
		p.setLayout(bl1);
		p.add("West", title_lb);
		p.add("Center", title_tf);
		
		this.add("North", p);
		this.add("Center",contents_ta);
		
		p1.setLayout(fl);
		p1.add(register_bt);
		this.add("South", p1);
	}
}

public class Ex11 {
	public static void main(String ar[]){
		Ex11_sub ex=new Ex11_sub("제목");
	}

}