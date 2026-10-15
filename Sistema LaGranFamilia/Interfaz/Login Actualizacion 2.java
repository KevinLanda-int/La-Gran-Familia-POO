
package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import BD.Conexion;

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

        // Título
        JLabel titulo = new JLabel(
            "LA GRAN FAMILIA",
            SwingConstants.CENTER
        );
        titulo.setFont(new Font("Serif", Font.BOLD, 24));
        titulo.setBounds(40, 25, 320, 35);
        panel.add(titulo);

        // Campo de usuario
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Arial", Font.PLAIN, 16));
        lblUsuario.setBounds(40, 90, 100, 25);
        panel.add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(150, 90, 220, 30);
        panel.add(txtUsuario);

        // Campo de contraseña
        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setFont(new Font("Arial", Font.PLAIN, 16));
        lblContrasena.setBounds(40, 135, 105, 25);
        panel.add(lblContrasena);

        txtContrasena = new JPasswordField();
        txtContrasena.setBounds(150, 135, 220, 30);
        panel.add(txtContrasena);

        // Botón de inicio de sesión
        JButton btnIngresar = new JButton("Iniciar sesión");
        btnIngresar.setBounds(110, 195, 200, 35);
        btnIngresar.setBackground(new Color(204, 204, 0));
        panel.add(btnIngresar);

        // Acción del botón
        btnIngresar.addActionListener(e -> iniciarSesion());

        // Permitir iniciar sesión pulsando Enter
        getRootPane().setDefaultButton(btnIngresar);

        add(panel);
    }

    private void iniciarSesion() {

        String usuario = txtUsuario.getText().trim();
        String contrasena =
            new String(txtContrasena.getPassword());

        // Validar campos vacíos
        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Ingresa tu usuario y contraseña.",
                "Datos incompletos",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // Consulta a MySQL
        String sql =
            "SELECT id FROM usuarios_login "
            + "WHERE usuario = ? AND contrasena = ?";

        try (
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, usuario);
            ps.setString(2, contrasena);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    JOptionPane.showMessageDialog(
                        this,
                        "¡Bienvenido a La Gran Familia!"
                    );

                    // Abrir la interfaz de productos
                    InterfazProducto ventana =
                        new InterfazProducto();

                    ventana.setVisible(true);

                    // Cerrar el login
                    dispose();

                } else {

                    JOptionPane.showMessageDialog(
                        this,
                        "Usuario o contraseña incorrectos.",
                        "Acceso denegado",
                        JOptionPane.ERROR_MESSAGE
                    );

                    txtContrasena.setText("");
                    txtContrasena.requestFocus();
                }
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                this,
                "No se pudo conectar con la base de datos.\n"
                + "Detalle: " + e.getMessage(),
                "Error de conexión",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Login ventana = new Login();
            ventana.setVisible(true);
        });
    }
}
