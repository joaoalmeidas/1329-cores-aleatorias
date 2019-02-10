import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class FormaPanel extends JPanel {
	
	private String forma;
	
	private final SecureRandom aleatorio = new SecureRandom();
	
	public FormaPanel(String forma) {
		
		this.forma = forma;
		
	}
	
	public void paintComponent(Graphics g) {
		
		for(int i = 0; i < 20; i++) {
		
		int x = aleatorio.nextInt(getWidth());
		int y = aleatorio.nextInt(getHeight());
		int largura = aleatorio.nextInt(getWidth() - x);
		int altura = aleatorio.nextInt(getHeight() - y);
	
			if(forma.equals("Circulo")) {
				
				g.drawOval(x, y, largura, altura);
				
			}else if(forma.equals("Retangulo")) {
				
				g.drawRect(x, y, largura, altura);
				
			}else if(forma.equals("Linha")) {
				
				g.drawLine(x, y, altura, largura);
				
			}else if(forma.equals("Arco")) {
				
				g.drawArc(x, x, largura, altura, aleatorio.nextInt(360), aleatorio.nextInt(360));
			
			}
			
		}
		

		
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
	
}
