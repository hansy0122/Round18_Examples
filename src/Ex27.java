import java.awt.*;

class Ex27_sub extends Frame{
	FileDialog fdlg=new FileDialog(this,"내파일열기",FileDialog.LOAD);
	FileDialog fdlg1=new FileDialog(this,"내파일저장",FileDialog.SAVE);
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gc=new GridBagConstraints();
	Label lb1=new Label("file"); 
	Label lb2=new Label("Directory");
	public Ex27_sub(String title){
		super(title); 
		super.setSize(300,200);
		lb1.setBackground(Color.red);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		this.setLayout(gbl);
		gc.fill=gc.HORIZONTAL; //요구되는 크기보다 나머지가 더 클떄 사용
		gc.gridwidth=gc.REMAINDER; // 행에는 이거밖에없어요
		gc.weightx=1; //비율설정
		add(lb1,gc);
		this.add(lb2,gc);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		fdlg.setVisible(true);
		lb1.setText(lb1.getText()+fdlg.getFile());
		lb2.setText(lb2.getText()+fdlg.getDirectory());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		fdlg1.setFile(this.getName());
		fdlg1.setVisible(true);
		
	}
}

public class Ex27 {
	public static void main(String ar[]){
		Ex27_sub ex=new Ex27_sub("제목");
	}

}
