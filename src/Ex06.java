import java.awt.*;

class Ex06_sub extends Frame{
	GridBagLayout gbl=new GridBagLayout();
	Button bt=new Button("Ȯ��");
	Font f=new Font("�޸տ�ü",Font.BOLD,20);
	
	public Ex06_sub(String title){
		super(title); // ��ü�� ��� ?
		super.setSize(300,200);
		this.init();
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		Dimension a=new Dimension(100,200);
		
		System.out.println(screen.getHeight());
		System.out.println(screen.getWidth());
		System.out.println(frm.getHeight());
		System.out.println(frm.getWidth());
		System.out.println(a.getHeight());
		System.out.println(a.getWidth());
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		
	}
	public void init(){
		this.setLayout(gbl);
		this.add(bt);
		bt.setFont(f);
	}
}

public class Ex06 {
	public static void main(String ar[]){
		Ex06_sub ex=new Ex06_sub("����");
	}

}
