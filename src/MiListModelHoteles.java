import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;




public class MiListModelHoteles implements ListModel,ComboBoxModel{
	private ArrayList<String> misNombreHoteles = new ArrayList<String>();
	@Override
	public void addListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}
	public void rellenarModel() {
		ArrayList<Hoteles> Hotel = new ArrayList<Hoteles>();
		Hoteles Hotel1 = new Hoteles();
		//Forma 1
		Hotel1.setNombre("Carlton");
		Hotel1.setUbicacion("Bilbao");
		Hotel.add(Hotel1);
		//Forma2
		Hotel.add(new Hoteles("Villa de Bilbao","Bilbao"));
		for (int index = 0; index < Hotel.size(); index++) {
			//makeObj(misParadas.get(index).getNombre());
			misNombreHoteles.add(Hotel.get(index).getNombre());
		}
	}

	@Override
	public Object getElementAt(int arg0) {
		// TODO Auto-generated method stub
		return misNombreHoteles.get(arg0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return misNombreHoteles.size();
	}

	@Override
	public void removeListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setSelectedItem(Object arg0) {
		// TODO Auto-generated method stub
		
	}

}
