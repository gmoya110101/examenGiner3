/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.servicio.paciente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;

/**
 *
 * @author Alan Velasco
 */
@WebService(serviceName = "paciente", portName = "pacientePort", endpointInterface = "com.itorizaba.paciente.PacientePortType", targetNamespace = "http://itorizaba.com/paciente.wsdl", wsdlLocation = "WEB-INF/wsdl/paciente/paciente.wsdl")
public class paciente {
    
    
        Connection conn = null;
    Statement stat = null;
    ResultSet rs = null;

    public boolean conectar() {
        boolean b = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); //driver ruta de bd
            b = true;
            //Class.forName("com.mysql.jdbc:derby://localhost:1527/sample [app en APP]").newInstance();
        } catch (Exception ex) {
            b = false;
            System.out.println("Fallo driver: " + ex);
        }
        return b;
    }

    public com.itorizaba.paciente.ArregloPaciente obetenerPaciente(java.lang.String ciudad) {
        
        com.itorizaba.paciente.ArregloPaciente ar=new com.itorizaba.paciente.ArregloPaciente();
        
        if (conectar() == true) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            } catch (SQLException se) {
                System.out.println("Error: " + se.getErrorCode());
            }

            try {
                stat = conn.createStatement();
                rs = stat.executeQuery("SELECT * FROM paciente WHERE ciudad='"+ciudad+"'");

                while (rs.next()) {
                    com.itorizaba.paciente.Paciente p=new com.itorizaba.paciente.Paciente();
                    p.setNumExpediente(rs.getString("numExpediente"));
                    p.setNombre(rs.getString("nombre"));
                    p.setApellido(rs.getString("apellido"));
                    p.setDireccion(rs.getString("direccion"));
                    p.setTelefono(rs.getString("telefono"));
                    p.setCiudad(rs.getString("ciudad"));
               
                    
                    ar.getItem().add(p);
                }

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        } else {
            System.out.println("no hay conexion pa");
        }
        return ar;
    }
    
}
