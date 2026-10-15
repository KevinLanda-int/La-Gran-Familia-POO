package Interfaz;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;

	public Login() {
	    setTitle("Inicio de sesión - La Gran Familia");
	    setSize(420, 320);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setResizable(false);

	    // Panel principal
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(255, 193, 7));
	    panel.setLayout(null);

	    JLabel titulo = new JLabel("LA GRAN FAMILIA", SwingConstants.CENTER);
	    titulo.setFont(new Font("Serif", Font.BOLD, 24));
	    titulo.setBounds(40, 25, 320, 35);
	    panel.add(titulo);

	    JLabel lblUsuario = new JLabel("Usuario:");
	    lblUsuario.setFont(new Font("Arial", Font.PLAIN, 16));
	    lblUsuario.setBounds(40, 90, 100, 25);
	    panel.add(lblUsuario);

	    txtUsuario = new JTextField();
	    txtUsuario.setBounds(150, 90, 220, 30);
	    panel.add(txtUsuario);

	    JLabel lblContrasena = new JLabel("Contraseña:");
	    lblContrasena.setFont(new Font("Arial", Font.PLAIN, 16));
	    lblContrasena.setBounds(40, 135, 100, 25);
	    panel.add(lblContrasena);

	    txtContrasena = new JPasswordField();
	    txtContrasena.setBounds(150, 135, 220, 30);
	    panel.add(txtContrasena);

	    JButton btnIngresar = new JButton("Iniciar sesión");
	    btnIngresar.setBounds(110, 195, 200, 35);
	    btnIngresar.setBackground(new Color(204, 204, 0));
	    panel.add(btnIngresar);

	    // Validar al hacer clic
	    btnIngresar.addActionListener(e -> iniciarSesion());

	    // También permite ingresar pulsando Enter
	    getRootPane().setDefaultButton(btnIngresar);

	    add(panel);
	}

	private void iniciarSesion() {
	    String usuario = txtUsuario.getText().trim();
	    String contrasena = new String(txtContrasena.getPassword());

	    // Credenciales de prueba
	    if (usuario.equals("admin") && contrasena.equals("1234")) {

	        JOptionPane.showMessageDialog(
	            this,
	            "¡Bienvenido a La Gran Familia!"
	        );

	        InterfazProducto ventana = new InterfazProducto();
	        ventana.setVisible(true);

	        dispose();

	    } else {
	        JOptionPane.showMessageDialog(
	            this,
	            "Usuario o contraseña incorrectos.",
	            "Error de acceso",
	            JOptionPane.ERROR_MESSAGE
	        );

	        txtContrasena.setText("");
	        txtContrasena.requestFocus();
	    }
	}

	public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
	        new Login().setVisible(true);
	    });
	}

	
}