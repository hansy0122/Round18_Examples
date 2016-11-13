import java.awt.*;

class Ex19_sub extends Frame{
	
	Label lb1=new Label("좌측정렬",Label.LEFT);
	Label lb2=new Label("중앙정렬",Label.CENTER);
	Label lb3=new Label("우측정렬",Label.RIGHT);
	BorderLayout bl=new BorderLayout();
	
	public Ex19_sub(String title){
		super(title); // 객체는 어디에 ?
		super.setSize(300,200);
		

		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();

		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setVisible(true);
		super.setResizable(false);
		this.setLayout(bl);
		
		this.add("Center",lb1);
		 try{Thread.sleep(1000);}catch(InterruptedException ee){}
		 
		this.add("Center",lb2);
		 super.setVisible(true);
		
		 try{Thread.sleep(1000);}catch(InterruptedException ee){}
		this.remove(lb1);
		this.add("Center",lb3);
		

		
	}
	
		
	
	
}

public class Ex19 {
	public static void main(String ar[]){
		Ex19_sub ex=new Ex19_sub("제목");
	}

}