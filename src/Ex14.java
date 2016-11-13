import java.awt.*;

class Ex14_sub extends Frame{
	
	private MenuBar mb=new MenuBar();
	
	private Menu file=new Menu("FILE");
	private MenuItem fnew=new MenuItem("NEW");
	private MenuItem fopen=new MenuItem("OPEN");
	private MenuItem fsave=new MenuItem("SAVE");
	private MenuItem fexit=new MenuItem("EXIT");
	
	private Menu edit=new Menu("EDIT");
	private Menu ecolor=new Menu("COLOR");
	private  CheckboxMenuItem green_cb=new CheckboxMenuItem("GREEN");
	private CheckboxMenuItem blue_cb=new CheckboxMenuItem("BLUE");private CheckboxMenuItem red_cb=new CheckboxMenuItem("RED");
	private Menu esize=new Menu("SIZE");
	
	private Menu help=new Menu("HELP");
	private MenuItem hver=new MenuItem("VERSION");
	
	public Ex14_sub(String title){
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
		file.add(fnew);
		file.addSeparator();
		file.add(fopen);
		file.add(fsave);
		file.addSeparator();
		file.add(fexit);
		mb.add(file);
		
		edit.add(ecolor);
		ecolor.add(red_cb);
		ecolor.add(green_cb);
		ecolor.add(blue_cb);
		edit.addSeparator();
		edit.add(esize);
		mb.add(edit);
		
		help.add(hver);
		mb.add(help);
		this.setMenuBar(mb);
		
		
		
		
	}
	
}

public class Ex14 {
	public static void main(String ar[]){
		Ex14_sub ex=new Ex14_sub("제목");
	}

}