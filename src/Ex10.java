import java.awt.*;

class Ex10_sub extends Frame{
	private Label blood_lb=new Label("blood type?");
	private Choice blood_ch=new Choice();
	
	private Label birth_lb=new Label("birth day?");
	private Choice year_ch=new Choice();
	private Label year_lb=new Label("year ");
	private Choice month_ch=new Choice();
	private Label month_lb=new Label("month ");
	private Choice day_ch=new Choice();
	private Label day_lb=new Label("day ");
	
	
	private Label alpah_lb=new Label("alphabet list!",Label.CENTER);
	private List alpah_li=new List(3,true); // ture false는 복수선택여부
	
	
	
	private BorderLayout bl=new BorderLayout();
	
	Panel p=new Panel();
	private GridLayout gl=new GridLayout(4,1);
	
	private Panel p1=new Panel();
	private GridBagLayout gbl=new GridBagLayout();
	
	private Panel p2=new Panel();
	private BorderLayout bl1=new BorderLayout();
			
			
			
			
			
			
	public Ex10_sub(String title){
		super(title); // 객체는 어디에 ?
		super.setSize(600,300);		
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
		alpah_li.setPreferredSize(new Dimension(100,200));
		
		//Data setting 
		blood_ch.add("A");
		blood_ch.add("B");
		blood_ch.add("O");
		blood_ch.add("AB");
		
		for(int i=2017;i>=1990;i--){
			year_ch.add(String.valueOf(i));
		}
		
		for(int i=1;i<=12;i++){
			month_ch.add(String.valueOf(i));
		}
		for(int i=1;i<=31;i++){
			day_ch.add(String.valueOf(i));
		}
		
		for(char i='A';i<='Z';i++){
			String s=""+i+i+i;
			alpah_li.add(s);
		}
		
		
		p1.setLayout(gbl);
		p.setLayout(gl);
		p1.add(year_ch); p1.add(year_lb);
		p1.add(month_ch);p1.add(month_lb);
		p1.add(day_ch);p1.add(day_lb);
		
		
		p.add(blood_lb);
		p.add(blood_ch);
		p.add(birth_lb);
		p.add(p1);
		
		p2.setLayout(bl1);
		p2.add("North", alpah_lb);
		p2.add("Center", alpah_li);
		
		this.add("Center",p);
		this.add("East", p2);
		
	}
}

public class Ex10 {
	public static void main(String ar[]){
		Ex10_sub ex=new Ex10_sub("제목");
	}

}
