
	import java.awt.*;

	class Ex01_sub extends Frame{
		
		private Button bt= new Button("check");
		private BorderLayout bl=new BorderLayout();
		
		public Ex01_sub(String title){
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
				this.add("South", bt);
			}
	}

	public class Ex01 {
		public static void main(String ar[]){
			Ex01_sub ex=new Ex01_sub("제목");
		}

	}


