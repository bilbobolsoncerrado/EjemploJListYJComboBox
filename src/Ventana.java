import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//Lista
		
		ArrayList<String> misHoteles=new ArrayList();
		misHoteles.add("Carlton");
		misHoteles.add("Villa de Bilbao");

		JList list = new JList();
		MiListModelHoteles miModel=new MiListModelHoteles();
		miModel.rellenarModel();
		list.setModel(miModel);
		
		list.setBounds(10, 170, 264, 42);
		contentPane.add(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//ComboBox
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 72, 424, 29);
		//comboBox.setModel(
		//		new DefaultComboBoxModel(new String[] {"Hotel 1", "hotel 2"}));
		comboBox.setModel(miModel);
		contentPane.add(comboBox);
		
		JLabel lblJcombobox = new JLabel("JComboBox");
		lblJcombobox.setBounds(10, 46, 98, 14);
		contentPane.add(lblJcombobox);
		
		JLabel lblNewLabel = new JLabel("JList");
		lblNewLabel.setBounds(10, 145, 85, 14);
		contentPane.add(lblNewLabel);
		
		
	}
}
