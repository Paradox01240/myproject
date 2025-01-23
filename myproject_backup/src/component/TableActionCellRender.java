
package component;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import panel.TablePanel;


public class TableActionCellRender extends DefaultTableCellRenderer{
   
    @Override
    public Component getTableCellRendererComponent(JTable jtable,Object o, boolean isSeleted, boolean bln1,int i ,int column){
        Component com = super.getTableCellRendererComponent(jtable, o,isSeleted,bln1,i,column);
        
        
        TablePanel action = new TablePanel();
        if (isSeleted == false && i % 2 == 0) {
            action.setBackground(Color.WHITE);
          
        }else{
        action.setBackground(com.getBackground());
         
    }
        return action;
        
    }
}
