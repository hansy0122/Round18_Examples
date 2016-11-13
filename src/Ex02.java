import java.awt.*;

class Ex02_sub extends Frame{
	
	private Button bt1=new Button("확인");
	private Button bt2=new Button("취소");
	private GridLayout gl=new GridLayout(1,2);
	
	
	public Ex02_sub(String title){
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
		this.add(bt1);
		this.add(bt2);	
	}
}

public class Ex02 {
	public static void main(String ar[]){
		Ex02_sub ex=new Ex02_sub("제목");
	}

}
