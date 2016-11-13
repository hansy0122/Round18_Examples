import java.awt.*;

class Ex20_sub extends Frame{
	
	private GridLayout gl=new GridLayout(4,3,5,5);
	private Button bt[]=new Button[12];
	public Ex20_sub(String title){
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
		for(int i=0;i<=8;i++){
			bt[i]=new Button(String.valueOf(i+1));
			}
		bt[9]=new Button("*");
		bt[10]=new Button("0");
		bt[11]=new Button("#");
		for(int i=0;i<bt.length;i++){
			this.add(bt[i]);
			}
	
		
	}
}

public class Ex20 {
	public static void main(String ar[]){
		Ex20_sub ex=new Ex20_sub("제목");
	}

}