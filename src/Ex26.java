import java.awt.*;

class Ex26_sub extends Frame{
	

	public Ex26_sub(String title) {
		super(title); // 객체는 어디에 ?
		super.setSize(300, 200);

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = super.getSize();

		int xpos = (int) (screen.getWidth() / 2 - frm.getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2 - frm.getHeight() / 2);
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		super.setVisible(true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		Dialog dlg1 = new Dialog(this, "subordinate 1", true);
		Label lb1=new Label("sb1");
		dlg1.setSize(200, 200);
		Dimension d1 = dlg1.getSize();

		int xpos1 = (int) (screen.getWidth() / 2 - d1.getWidth() / 2);
		int ypos1 = (int) (screen.getHeight() / 2 - d1.getHeight() / 2);
		dlg1.setLocation(xpos1, ypos1);
		dlg1.setResizable(false);
		dlg1.add(lb1);
		dlg1.setVisible(true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		Dialog dlg2 = new Dialog(this, "subordinate 2", false);
		Label lb2=new Label("sb2");
		dlg2.setSize(200, 200);
		Dimension d2 = dlg1.getSize();

		int xpos2 = (int) (screen.getWidth() / 2 - d2.getWidth() / 2);
		int ypos2 = (int) (screen.getHeight() / 2 - d2.getHeight() / 2);
		dlg2.setLocation(xpos2, ypos2);
		dlg2.setResizable(false);
		dlg2.add(lb2);
		dlg1.setVisible(false);
		dlg2.setVisible(true);
	}

}

public class Ex26 {
	public static void main(String ar[]) {
		Ex26_sub ex = new Ex26_sub("제목");
	}
}
