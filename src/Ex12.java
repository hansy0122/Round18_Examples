import java.awt.*;

class Ex12_sub extends Frame{
	
	
	private Dialog dlg=new Dialog(this, "warning!",false); //dialog는 어디인가에 귀속되어야하므로 this 그뒤는 제목 그뒤는모달속성
	private Label msg_lb=new Label("warning!!!",Label.CENTER);
	private Button ok_bt=new Button("OK");
	
	private BorderLayout bl=new BorderLayout();
	private Panel p=new Panel();
	private GridBagLayout gbl=new GridBagLayout(); // 중앙배치
	
	public Ex12_sub(String title){
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
		dlg.setSize(100, 100);
		dlg.setLocation(500,500 );
		dlg.setVisible(true);
		
	}
	public void init(){
	dlg.setLayout(bl);
	
	dlg.add("Center",msg_lb);
	
	p.setLayout(gbl);
	p.add(ok_bt);
	dlg.add("South", p);

	}
}

public class Ex12 {
	public static void main(String ar[]){
		Ex12_sub ex=new Ex12_sub("제목");
	}

}