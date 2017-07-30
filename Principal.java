import javax.swing.JOptionPane;
public class Principal{

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("","","","");
		
		String name=JOptionPane.showInputDialog("ingresa tu nombre");
		user1.setNombre(name);
		String direcc=JOptionPane.showInputDialog("ingresa tu direccion");
		user1.setDireccion(direcc);
		String phone=JOptionPane.showInputDialog("ingresa tu numero telefonico");
		user1.setTelefono(phone);
		String cur=JOptionPane.showInputDialog("ingresa tu CURP");
		user1.setCurp(cur);
		JOptionPane.showMessageDialog(null,"tus datos son: "+ user1.toString());}
	
		
		
		

}
