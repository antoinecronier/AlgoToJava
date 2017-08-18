package imiepoecjava2017.views.customrenders;

import imiepoecjava2017.entities.User;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class ListCellUserRender extends DefaultListCellRenderer {
	public Component getListCellRendererComponent(JList<?> list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		super.getListCellRendererComponent(list, value, index, isSelected,
				cellHasFocus);
		if (value instanceof User) {
			User item = (User) value;
			setText(item.getId() + " " + item.getLastname() + " " + item.getFirstname());
			setToolTipText(item.getRole().toString());
			// setIcon(ingredient.getIcon());
		}
		return this;
	}
}
