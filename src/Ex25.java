	import java.awt.*;
	
	class Ex25_sub extends Frame{
		BorderLayout bl=new BorderLayout(5,5);
		FlowLayout fl=new FlowLayout();
		
		TextArea ta=new TextArea("asdfghjklpo \niuytr \newq\n",15,15);
		TextField tf=new TextField(15);
		Panel p=new Panel();
		Label lb2=new Label("celected text");
		public Ex25_sub(String title){
			super(title); 
			super.setSize(300,300);
			this.init();
	
			Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
			Dimension frm=super.getSize();
			
			
			int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
			int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
			super.setLocation(xpos,ypos);
			super.setResizable(false);
			super.setVisible(true);
			
			
			try{Thread.sleep(3000);}catch(InterruptedException e){
			} 
			String gs=ta.getSelectedText();
			int s=ta.getSelectionStart();
			int e=ta.getSelectionEnd();
				tf.setText(gs);
				
			try{Thread.sleep(3000);}catch(InterruptedException ee){
			} ta.replaceRange("", s, e);

			try{Thread.sleep(3000);}catch(InterruptedException eee){
			}
			ta.setCaretPosition(ta.getText().trim().length());
			ta.append(gs);
			
			
		}
		
		public void init(){
			Label lb=new Label("decide range in 5 seconds");
			this.setLayout(bl);
			this.add("North", lb);
			this.add("Center",ta);
			p.setLayout(fl);
			p.add(lb2);
			p.add(tf);
			this.add("South", p);
		}
	}
	
	public class Ex25 {
		public static void main(String ar[]){
			Ex25_sub ex=new Ex25_sub("Á¦¸ñ");
		}
	
	}
