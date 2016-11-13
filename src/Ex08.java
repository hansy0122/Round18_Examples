import java.awt.*;

class Ex08_sub extends Frame{
	private Label lb=new Label("call",Label.CENTER);
	private Button[] bt=new Button[12];
	private String str[]=new String[]{"*","0","#"};
	
	private BorderLayout bl=new BorderLayout(10,10);
	private Panel p=new Panel();
	private GridLayout gl=new GridLayout(4,3,5,5);
	
	
	public Ex08_sub(String title){
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
		this.setLayout(bl);
		this.add("North",lb);
		
		p.setLayout(gl);
		for(int i=0;i<bt.length;i++){
			if(i>=9){
				bt[i]=new Button(str[i-9]);
			}
			else{bt[i]=new Button(String.valueOf(i+1));}
			
			p.add(bt[i]);
		}
		
		this.add("Center",p);
		
		}
	}

public class Ex08 {
	public static void main(String ar[]){
		Ex08_sub ex=new Ex08_sub("제목");
	}

}