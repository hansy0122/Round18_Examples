import java.awt.*;

class Ex09_sub extends Frame{
	
	private Label lb=new Label("prefer fruit");
	private Checkbox a_cb=new Checkbox("메론");
	private Checkbox b_cb=new Checkbox("수박");
	private Checkbox c_cb=new Checkbox("파인애플");
	private Label lbs=new Label("당신의  성별은?");
	GridLayout gl=new GridLayout(4,1);
	Panel p1=new Panel();
	GridLayout gl1=new GridLayout(1,3);
	Panel p2=new Panel();
	GridLayout gl2=new GridLayout(1,2);
	
	
	private CheckboxGroup cg=new CheckboxGroup();
	private Checkbox man_cb=new Checkbox("man",cg,true);
	private Checkbox wman_cb=new Checkbox("woman",cg,false);
	
	public Ex09_sub(String title){
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
		this.setLayout(gl);
		this.add(lb);
		
		p1.setLayout(gl1);
		p1.add(a_cb);
		p1.add(b_cb);
		p1.add(c_cb);
		
		this.add(p1);
		this.add(lbs);
		
		p2.setLayout(gl2);
		p2.add(man_cb);
		p2.add(wman_cb);
		
		this.add(p2);
		
		
		
	}
}

public class Ex09 {
	public static void main(String ar[]){
		Ex09_sub ex=new Ex09_sub("제목");
	}

}