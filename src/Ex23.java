import java.awt.*;

class Ex23_sub extends Frame{
	GridBagLayout gbl=new GridBagLayout();
	GridLayout gl=new GridLayout(2,1,0,15);
	GridBagConstraints gc=new GridBagConstraints();
	Panel p=new Panel();
	Button bt1=new Button("-->");
	Button bt2=new Button("<--");
	List l1=new List(10,true);
	List l2=new List(10,true);
	public Ex23_sub(String title){
		super(title); // 객체는 어디에 ?
		super.setSize(500,300);
		this.init();

		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		
		try{
		Thread.sleep(1000);
		}catch(InterruptedException ee){}
		l1.select(2);
		l1.select(4);
		l1.select(6);
		l1.select(8);
		

		try{
		Thread.sleep(1000);
		}catch(InterruptedException ee){}
		String str[]=l1.getSelectedItems();
		for(int i=0;i<str.length;i++){
		l2.add(str[i]);
		}

		try{
		Thread.sleep(1000);
		}catch(InterruptedException ee){}
		l1.deselect(2);
		l1.deselect(4);
		l1.deselect(6);
		l1.deselect(8);
		
	}
	public void init(){
		this.setLayout(gbl);
		for(int i=1;i<15;i++){
		l1.add("TEST"+i);
		}
		gc.gridx=1;
		gc.gridy=1;
		gc.insets=new Insets(0,0,0,10);
		this.add(l1,gc);
		
		p.setLayout(gl);
		p.add(bt1);
		p.add(bt2);
		gc.gridx=2;
		gc.gridy=1;
	
		this.add(p,gc);
		gc.insets=new Insets(0,10,0,0);
		gc.gridx=3;
		gc.gridy=1;
	this.add(l2,gc);
}
}

public class Ex23 {
	public static void main(String ar[]){
		Ex23_sub ex=new Ex23_sub("제목");
	}

}