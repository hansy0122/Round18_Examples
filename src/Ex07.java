import java.awt.*;

class Ex07_sub extends Frame{
	public Ex07_sub(String title){
		super(title); // 객체는 어디에 ?
		super.setSize(300,200);

		
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image img=tk.getImage("aaa.jpg");
		this.setIconImage(img);
		
		
		
		
		
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		
	}
}

public class Ex07 {
	public static void main(String ar[]){
		Ex07_sub ex=new Ex07_sub("제목");
	}

}