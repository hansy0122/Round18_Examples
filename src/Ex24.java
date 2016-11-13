import java.awt.*;

class Ex24_sub extends Frame{
	TextField tf=new TextField(3);
	
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gc=new GridBagConstraints();
	Label lb=new Label("문자열 입력:",Label.RIGHT);
	public Ex24_sub(String title){
		
		super("문자열"); // 객체는 어디에 ?
		super.setSize(300,200);

		
		this.init();
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		
		super.setVisible(true);
		
		
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){}
		tf.setEchoChar((char) 0);
	}
	public void init(){
		this.setLayout(gbl);
		gc.fill=GridBagConstraints.HORIZONTAL;
		gc.weightx=4;
		gbl.setConstraints(lb,gc);
		this.add(lb,gc);
		
	
		gc.weightx=10;
		gbl.setConstraints(tf,gc);
		this.add(tf,gc);
		tf.setEchoChar('*');
		
	}
}

public class Ex24 {
	public static void main(String ar[]){
		Ex24_sub ex=new Ex24_sub("제목");
	}

}