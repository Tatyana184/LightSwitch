
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Painting extends JFrame {
public void paint(Graphics g){
    g.setColor(Color.GRAY);
    g.fillRoundRect(100,80,80,190,30,30);

    int x[]={90,60,90};
    int y[]={130,100,100};
    g.fillPolygon(x,y,3);

    int x1[]={90,60,90};
    int y1[]={180,150,150};
    g.fillPolygon(x1,y1,3);

    int x2[]={90,60,90};
    int y2[]={230,200,200};
    g.fillPolygon(x2,y2,3);

    int x3[]={190,220,190};
    int y3[]={130,100,100};
    g.fillPolygon(x3,y3,3);

    int x4[]={190,220,190};
    int y4[]={180,150,150};
    g.fillPolygon(x4,y4,3);

    int x5[]={190,220,190};
    int y5[]={230,200,200};
    g.fillPolygon(x5,y5,3);

    g.fillRoundRect(130,280,25,45,7,7);

    g.setColor(Color.RED);
    g.fillOval(120,100,40,40);
    g.setColor(Color.YELLOW);
    g.fillOval(120,160,40,40);

    g.setColor(Color.GREEN);
    g.fillOval(120,220,40,40);
    Graphics2D g2D = (Graphics2D) g;
    g2D.setColor(Color.WHITE);
    Area area = new Area(new Ellipse2D.Double(120, 90, 40, 40));
    Area temp = new Area(new Ellipse2D.Double(115, 95, 50, 50));
    area.subtract(temp);

    Area area1 = new Area(new Ellipse2D.Double(120, 150, 40, 40));
    Area temp1 = new Area(new Ellipse2D.Double(115, 155, 50, 50));
    area1.subtract(temp1);

    Area area2 = new Area(new Ellipse2D.Double(120, 210, 40, 40));
    Area temp2 = new Area(new Ellipse2D.Double(115, 215, 50, 50));
    area2.subtract(temp2);


    g2D.fill(area);
    g2D.fill(area1);
    g2D.fill(area2);

    g.setColor(Color.GRAY);
    Area area3 = new Area(new Ellipse2D.Double(115, 60, 50, 50));
    Area temp3 = new Area(new Rectangle2D.Double(115,70,70,50));
    area3.subtract(temp3);
    g2D.fill(area3);
}
}
