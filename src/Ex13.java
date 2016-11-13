import java.awt.*;

class Ex13_sub extends Frame{
	
	private FileDialog fdlg=new FileDialog(this,"save",FileDialog.SAVE);
														//FileDialog.Load						
	public Ex13_sub(String title){
		super(title); // 객체는 어디에 ?
		super.setSize(300,200);

		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		
		
		fdlg.setVisible(true);
		fdlg.setLocation(300,300);
	}
}

public class Ex13 {
	public static void main(String ar[]){
		Ex13_sub ex=new Ex13_sub("제목");
	}

}