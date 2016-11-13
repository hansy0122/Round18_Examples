import java.awt.*;

class Ex21_sub extends Frame{
	BorderLayout bl=new BorderLayout();
	GridLayout gl=new GridLayout(2,2);
	FlowLayout fl=new FlowLayout();
	Panel p1=new Panel();
	Panel p2=new Panel();
	Label lb=new Label("choose what you like");
	CheckboxGroup cg=new CheckboxGroup();
	Checkbox cb1=new Checkbox("apple",false,cg);
	Checkbox cb2=new Checkbox("strawberry",false,cg);
	Checkbox cb3=new Checkbox("kiwi",false,cg);
	Checkbox cb4=new Checkbox("grape",true,cg);
	Button bt1=new Button("ok");
	Button bt2=new Button("no");
	
	
	public Ex21_sub(String title){
		super("선택"); // 객체는 어디에 ?
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
		this.add("North", lb);
		p1.setLayout(gl);
		p1.add(cb1);	p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		this.add("Center",p1);
		fl.setAlignment(FlowLayout.RIGHT);
		p2.setLayout(fl);
		p2.add(bt1);
		p2.add(bt2);
		this.add("South", p2);
	}
}

public class Ex21 {
	public static void main(String ar[]){
		Ex21_sub ex=new Ex21_sub("제목");
	}

}