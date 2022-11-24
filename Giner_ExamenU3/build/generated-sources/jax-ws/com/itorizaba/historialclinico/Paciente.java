
package com.itorizaba.historialclinico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paciente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paciente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numExpediente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="medico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="areaEspecialidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="consultorio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="piso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="visita" type="{http://www.itorizaba.com/historialClinico.xsd1}arregloVisita"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paciente", propOrder = {
    "nombre",
    "apellido",
    "numExpediente",
    "medico",
    "areaEspecialidad",
    "consultorio",
    "piso",
    "visita"
})
public class Paciente {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String apellido;
    @XmlElement(required = true)
    protected String numExpediente;
    @XmlElement(required = true)
    protected String medico;
    @XmlElement(required = true)
    protected String areaEspecialidad;
    @XmlElement(required = true)
    protected String consultorio;
    @XmlElement(required = true)
    protected String piso;
    @XmlElement(required = true)
    protected ArregloVisita visita;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad numExpediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumExpediente() {
        return numExpediente;
    }

    /**
     * Define el valor de la propiedad numExpediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumExpediente(String value) {
        this.numExpediente = value;
    }

    /**
     * Obtiene el valor de la propiedad medico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedico() {
        return medico;
    }

    /**
     * Define el valor de la propiedad medico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedico(String value) {
        this.medico = value;
    }

    /**
     * Obtiene el valor de la propiedad areaEspecialidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaEspecialidad() {
        return areaEspecialidad;
    }

    /**
     * Define el valor de la propiedad areaEspecialidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaEspecialidad(String value) {
        this.areaEspecialidad = value;
    }

    /**
     * Obtiene el valor de la propiedad consultorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultorio() {
        return consultorio;
    }

    /**
     * Define el valor de la propiedad consultorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultorio(String value) {
        this.consultorio = value;
    }

    /**
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
    }

    /**
     * Obtiene el valor de la propiedad visita.
     * 
     * @return
     *     possible object is
     *     {@link ArregloVisita }
     *     
     */
    public ArregloVisita getVisita() {
        return visita;
    }

    /**
     * Define el valor de la propiedad visita.
     * 
     * @param value
     *     allowed object is
     *     {@link ArregloVisita }
     *     
     */
    public void setVisita(ArregloVisita value) {
        this.visita = value;
    }

}
