import java.awt.*;

class Ex17_sub extends Frame{
	Font f=new Font("SamsSerif",Font.BOLD,30);
	FlowLayout fl=new FlowLayout();
	Label lb=new Label("TEST");
	public Ex17_sub(String title){
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
		lb.setFont(f);
	}
}

public class Ex17 {
	public static void main(String ar[]){
		Ex17_sub ex=new Ex17_sub("제목");
		
		
	}

}