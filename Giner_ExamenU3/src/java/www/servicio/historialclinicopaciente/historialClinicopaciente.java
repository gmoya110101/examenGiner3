/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.servicio.historialclinicopaciente;

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
@WebService(serviceName = "historialClinico", portName = "historialClinicoPort", endpointInterface = "com.itorizaba.historialclinico.HistorialClinicoPortType", targetNamespace = "http://www.itorizaba.com/historialClinico.wsdl", wsdlLocation = "WEB-INF/wsdl/historialClinicopaciente/obtenerhistorialclinico.wsdl")
public class historialClinicopaciente {
Connection conn = null;
    Statement stat = null;
    ResultSet rs = null;
    Connection conn2 = null;
    Statement stat2 = null;
    ResultSet rs2 = null;

    public boolean conectar() {
        boolean b = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); //driver ruta de bd
            b = true;
            System.out.println("sí entró");
            //Class.forName("com.mysql.jdbc:derby://localhost:1527/sample [app en APP]").newInstance();
        } catch (Exception ex) {
            b = false;
            System.out.println("Fallo driver: " + ex);
        }
        return b;
    }
    
    public com.itorizaba.historialclinico.Paciente historialClinicoOperation(java.lang.String numExpediente) {
               com.itorizaba.historialclinico.Paciente p=new com.itorizaba.historialclinico.Paciente();
       com.itorizaba.historialclinico.ArregloVisita ar=new com.itorizaba.historialclinico.ArregloVisita();
        
        if (conectar() == true) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            } catch (SQLException se) {
                System.out.println("Error: " + se.getErrorCode());
            }

            try {
                stat = conn.createStatement();
                rs = stat.executeQuery("SELECT * FROM hospital.paciente WHERE numExpediente='"+numExpediente+"'");

                if (rs.next()) {
                    stat2 = conn.createStatement();
                    rs2 = stat2.executeQuery("SELECT * FROM hospital.visitas WHERE numExpediente='"+numExpediente+"'");
                    while(rs2.next()){
                        com.itorizaba.historialclinico.Visitas v=new com.itorizaba.historialclinico.Visitas();
                        v.setFechaConsulta(rs2.getString("fechaConsulta"));
                        v.setObservaciones(rs2.getString("observaciones"));
                        ar.getItem().add(v);
                    }
                    p.setVisita(ar);
                    p.setNombre(rs.getString("nombre"));
                    p.setApellido(rs.getString("apellido"));
                    p.setAreaEspecialidad(rs.getString("areaEspecialidad"));
                    p.setConsultorio(rs.getString("consultorio"));
                    p.setMedico(rs.getString("medico"));
                    p.setPiso(rs.getString("piso"));
                    p.setNumExpediente(rs.getString("numExpediente"));
     
                }

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        } else {
            System.out.println("no hay conexion pa");
        }
        return p;
    }
    
}
