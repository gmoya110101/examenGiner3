<%-- 
    Document   : invocahistorialclinico
    Created on : 22/11/2022, 11:22:54 PM
    Author     : Alan Velasco
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="Start your development with LeadMark landing page.">
        <meta name="author" content="Devcrud">
        <title>ISSSTE-ORIZABA</title>

        <script src="jquery/jquery-3.4.1.js"></script>
        <script src="bootstrap/bootstrap.bundle.js"></script>

        <!-- bootstrap 3 affix -->
        <script src="bootstrap/bootstrap.affix.js"></script>

        <!-- Isotope -->
        <script src="isotope/isotope.pkgd.js"></script>

        <!-- Libraries Stylesheet -->
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/style3.css" rel="stylesheet">

        <!-- LeadMark js -->
        <script src="js/leadmark.js"></script>
        <!-- font icons -->
        <link rel="stylesheet" href="css/themify-icons.css">
        <!-- Bootstrap + LeadMark main styles -->
        <link rel="stylesheet" href="css/leadmark.css">
    </head>
    <body>
        <h1>Historial Clinico</h1>
        
        
                <div class="container-fluid bg-dark py-3 mb-3">
            <div class="container">
                <div class="row align-items-center bg-dark">
                    <div class="col-12">
                        <div class="d-flex justify-content-between">
                            <div class="bg-primary text-dark text-center font-weight-medium py-2" style="width: 170px;">AVISO:</div>
                            <div class="owl-carousel tranding-carousel position-relative d-inline-flex align-items-center ml-3"
                                 style="width: calc(100% - 170px); padding-right: 90px;">
                                <div class="text-truncate"><a class="text-white text-uppercase font-weight-semi-bold" href="">No olvides vacunarte contra la influencia estacionaria.</a></div>
                                <div class="text-truncate"><a class="text-white text-uppercase font-weight-semi-bold" href="">Recuerda hacer chequeo general cada 6 meses.</a></div>
                                <div class="text-truncate"><a class="text-white text-uppercase font-weight-semi-bold" href="">Participa en nuestras sesiones de joga.</a></div>
                                <div class="text-truncate"><a class="text-white text-uppercase font-weight-semi-bold" href="">Come frutas y verduras.</a></div>


                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        

        <%
            String c = request.getParameter("exp");
            out.println("Valor :" + c);
        %>

        <%-- start web service invocation --%><hr/>
        <%
            try {
                www.cliente.historialclinicopaciente.HistorialClinico service = new www.cliente.historialclinicopaciente.HistorialClinico();
                www.cliente.historialclinicopaciente.HistorialClinicoPortType port = service.getHistorialClinicoPort();
                // TODO initialize WS operation arguments here
                java.lang.String numExpediente = c;
                // TODO process result here
                www.cliente.historialclinicopaciente.Paciente result = port.historialClinicoOperation(numExpediente);
                out.println("Result = " + result);

                out.println("<table border=1>");
                out.println("<th> No.Expediente </th>");
                out.println("<th> Nombre Completo </th>");
                out.println("<th> Consultorio </th>");
                out.println("<th> Piso </th>");
                out.println("<th> Medico </th>");
                out.println("<th> AreaEspecialidad </th>");

                //for(int i=0;i<result.getItem().size();i++){
                out.println("<tr>");
                out.println("<td>" + result.getNumExpediente() + "</td>");
                out.println("<td>" + result.getNombre() + " " + result.getApellido() + "</td>");
                out.println("<td>" + result.getConsultorio() + "</td>");
                out.println("<td>" + result.getPiso() + "</td>");
                out.println("<td>" + result.getMedico() + "</td>");
                out.println("<td>" + result.getAreaEspecialidad() + "</td>");

                out.println("</tr>");

                out.println("</table>");

                out.println("<table border=1>");
                out.println("<th> FechaConsulta </th>");
                out.println("<th> Observaciones </th>");

                for (int i = 0; i <=3; i++) {
                    out.println("<tr>");
                    out.println("<td>" + result.getVisita().getItem().get(i).getFechaConsulta() + "</td>");
                    out.println("<td>" + result.getVisita().getItem().get(i).getObservaciones() + "</td>");

                }
                

                out.println("</tr>");

                out.println("</table>");


            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>


    </body>
</html>
