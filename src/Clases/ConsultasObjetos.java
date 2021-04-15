/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Objetos.Licenciatura;
import Objetos.Profesor;
import Objetos.Usuario;
import Objetos.periodoEscolar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JParra
 */
public class ConsultasObjetos {

    public static PreparedStatement ps;
    public static ResultSet rs;
    public static Statement sentencia;
    public static int nivel = 0;

    public static int validaEntrar(String usuario, String contrasenia, Connection con) {
        String sql = "SELECT * FROM usuarios WHERE usuario='" + usuario + "'";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            int niv = 0;
            String pass = "", nombr_us = "";

            if (rs.next()) {
                nombr_us = rs.getString("usuario");
                pass = rs.getString("Contrasenia");
                niv = Integer.parseInt(rs.getString("nivel"));

                if (contrasenia.equals(pass)) {
                    System.out.println("datos correctos");
                    nivel = niv;
                    if (nivel == 1) {
                        return 1;
                    } else if (nivel == 2) {
                        return 2;
                    }
                } else {
                    System.out.println("Contrasenia incorrecta");
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public static Object consultaUnica(String tabla, String campo, String valor, Connection con) {
        try {
            if (campo == null) {
                ps = con.prepareStatement("SELECT * FROM " + tabla); //traer un dato
            } else {
                ps = con.prepareStatement("SELECT * FROM " + tabla + " WHERE " + campo + " = ?"); //traer un dato
                ps.setString(1, valor);
            }
            switch (tabla) {
                case "usuarios":
                    Usuario usuario = null;
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        usuario = new Usuario();
                        usuario.setIdUsuario(rs.getString("id_usuario"));
                        usuario.setUsuario(rs.getString("usuario"));
                        usuario.setContra(rs.getString("contrasenia"));
                        usuario.setPreguntaSeguridad(rs.getString("pregunta_seguridad"));
                        usuario.setRespuestaSeguridad(rs.getString("respuesta_seguridad"));
                        usuario.setRfc(rs.getString("rfc"));
                    } else {
                        System.out.println("No se encontro el usuario");
                        //JOptionPane.showMessageDialog(null, "No se encontro el usuario");
                    }
                    return usuario;
                case "profesores":
                    Profesor profe = null;
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        profe = new Profesor();
                        profe.setRfc(rs.getString("rfc"));
                        profe.setNombres(rs.getString("nombres"));
                        profe.setApellidoP(rs.getString("apellido_paterno"));
                        profe.setApellidoM(rs.getString("apellido_materno"));
                        profe.setGradoAcademico(rs.getString("grado_academico"));
                        profe.setCorreo(rs.getString("correo"));
                        profe.setTelefono(rs.getString("telefono"));
                    } else {
                        System.out.println("No se encontro el usuario");
                        //JOptionPane.showMessageDialog(null, "No se encontro el profesor");
                    }
                    return profe;
                case "licenciatura":
                    Licenciatura licen = null;
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        licen = new Licenciatura();
                        licen.setIdLicenciatura(rs.getString("id_licenciatura"));
                        licen.setLicenciatura(rs.getString("licenciatura"));
                        licen.setRfcCordinador(rs.getString("rfc_coordinador"));
                    } else {
                        System.out.println("No se encontro el usuario");
                        //JOptionPane.showMessageDialog(null, "No se encontro la Licenciatura");
                    }
                    return licen;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public static boolean inserta(Object obj, Connection con, String tabla) {
        try {
            int res = -1;
            switch (tabla) {
                case "usuarios":
                    Usuario emp = (Usuario) obj;
                    ps = con.prepareStatement("INSERT INTO usuarios(id_usuario,rfc,usuario, contrasenia,pregunta_seguridad,respuesta_seguridad) VALUES (?,?,?,?,?,?)");//por seguridad
                    ps.setString(1, emp.getIdUsuario());
                    ps.setString(2, emp.getRfc());
                    ps.setString(3, emp.getUsuario());
                    ps.setString(4, emp.getContra());
                    ps.setString(5, emp.getPreguntaSeguridad());
                    ps.setString(6, emp.getRespuestaSeguridad());
                    //ps.setDate(6, (java.sql.Date) emp.getFecha_alta());  // agregar un registro
                    res = ps.executeUpdate();

                    break;
                case "profesores":
                    Profesor prof = (Profesor) obj;
                    ps = con.prepareStatement("INSERT INTO profesores(rfc,apellido_paterno,apellido_materno,nombres,grado_academico,correo,telefono) VALUES (?,?,?,?,?,?,?)");
                    ps.setString(1, prof.getRfc());
                    ps.setString(2, prof.getApellidoP());
                    ps.setString(3, prof.getApellidoM());
                    ps.setString(4, prof.getNombres());
                    ps.setString(5, prof.getGradoAcademico());
                    ps.setString(6, prof.getCorreo());
                    ps.setString(7, prof.getTelefono());
                    res = ps.executeUpdate();
                    break;
                case "licenciatura":
                    Licenciatura licen = (Licenciatura) obj;
                    ps = con.prepareStatement("INSERT INTO licenciatura(id_licenciatura,nombre,rfc_coordinador) VALUES (?,?,?)");
                    ps.setString(1, licen.getIdLicenciatura());
                    ps.setString(2, licen.getLicenciatura());
                    ps.setString(3, licen.getRfcCordinador());
                    res = ps.executeUpdate();
                    break;
                case "periodo_escolar":
                    periodoEscolar periodo = (periodoEscolar) obj;
                    ps = con.prepareStatement("INSERT INTO periodo_escolar(id_periodo, periodo) VALUES (?,?)");
                    ps.setInt(1, periodo.getId_periodo());
                    ps.setString(2, periodo.getPeriodo());
                    res = ps.executeUpdate();
                    break;
            }
            return (res > 0) ? true : false;

//            if (res > 0) {
//                return true;
//                //JOptionPane.showMessageDialog(null, "Se registro exitosamente");
//            } else {
//                return false;
//                //JOptionPane.showMessageDialog(null, "ERROR");
//            }
        } catch (Exception e) {
            System.out.println("ConsultaObjetos: error al hacer la insercion");
            //JOptionPane.showMessageDialog(null, "Error al hacer la insercion");
            System.out.println(e.toString());
            return false;
        }
    }

    public static ArrayList<Object> consultaMuchos(String tabla, String campo, String valor, Connection con) {
        try {
            if (campo == null) {
                ps = con.prepareStatement("SELECT * FROM " + tabla); //traer un dato
            } else {
                ps = con.prepareStatement("SELECT * FROM " + tabla + " WHERE " + campo + " =?" + valor); //traer un dato
                ps.setString(1, valor);
            }

            ArrayList<Object> objetos = new ArrayList();

            switch (tabla) {
                case "usuarios":

                    rs = ps.executeQuery();
                    if (rs.next()) {
                        do {
                            Usuario usuario = new Usuario();
                            System.out.println(usuario.getUsuario());
                            usuario.setIdUsuario(rs.getString("id_usuario"));
                            usuario.setRfc(rs.getString("rfc"));
                            usuario.setUsuario(rs.getString("usuario"));
                            usuario.setContra(rs.getString("contrasenia"));
                            usuario.setPreguntaSeguridad(rs.getString("pregunta_seguridad"));
                            usuario.setRespuestaSeguridad(rs.getString("respuesta_seguridad"));
                            //usuario.setRespuestaSeguridad(rs.getString("nivel"));
                            objetos.add(usuario);
                        } while (rs.next());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el usuario");
                    }
                    return objetos;
                case "profesores":
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        do {
                            Profesor profe = new Profesor();
                            profe.setRfc(rs.getString("rfc"));
                            profe.setNombres(rs.getString("nombres"));
                            profe.setApellidoP(rs.getString("apellido_paterno"));
                            profe.setApellidoM(rs.getString("apellido_materno"));
                            profe.setGradoAcademico(rs.getString("grado_academico"));
                            profe.setCorreo(rs.getString("correo"));
                            profe.setTelefono(rs.getString("telefono"));
                            objetos.add(profe);
                        } while (rs.next());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el profesor");
                    }
                    return objetos;
                case "licenciatura":
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        do {
                            System.out.println("entro");
                            Licenciatura licen = new Licenciatura();
                            licen.setIdLicenciatura(rs.getString("id_licenciatura"));
                            licen.setLicenciatura(rs.getString("nombre"));
                            licen.setRfcCordinador(rs.getString("rfc_coordinador"));
                            objetos.add(licen);
                        } while (rs.next());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro la licenciatura");
                    }
                    return objetos;
                case "periodo_escolar":
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        do {
                            System.out.println("Entre a periodos");
                            periodoEscolar perio = new periodoEscolar();
                            perio.setId_periodo(((Integer.parseInt(rs.getString("id_periodo")))));
                            perio.setPeriodo(rs.getString("periodo"));
                            objetos.add(perio);
                        } while (rs.next());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontraron periodos");
                    }
                    return objetos;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public static boolean elimina(String tabla, String campo, String id2, int id, Connection con) {
        try {
            if (id2 == null) {
                ps = con.prepareStatement("DELETE FROM " + tabla + " WHERE " + campo + " = ?");
                ps.setInt(1, id);
            } else {
                ps = con.prepareStatement("DELETE FROM " + tabla + " WHERE " + campo + " = ?");
                ps.setString(1, id2);
            }
            int res = ps.executeUpdate();
            return (res > 0) ? true : false;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public static boolean Modifica(Object obj, Connection con, String tabla, String id) {
        try {
            int res = -1;
            switch (tabla) {
                case "usuarios":
                    Usuario emp = (Usuario) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET  rfc=?,usuario=?,contrasenia=?,pregunta_seguridad=?,respuesta_seguridad=? WHERE id_usuario =?");//por seguridad
                    ps.setString(1, emp.getRfc());
                    ps.setString(2, emp.getUsuario());
                    ps.setString(3, emp.getContra());
                    ps.setString(4, emp.getPreguntaSeguridad());
                    ps.setString(5, emp.getRespuestaSeguridad());
                    ps.setString(6, emp.getIdUsuario());
                    res = ps.executeUpdate();
                    break;
                case "profesores":
                    Profesor prof = (Profesor) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET apellido_paterno=?,apellido_materno=?,nombres=?,grado_academico=?,correo=?,telefono=?  WHERE rfc =?");
                    ps.setString(1, prof.getApellidoP());
                    ps.setString(2, prof.getApellidoM());
                    ps.setString(3, prof.getNombres());
                    ps.setString(4, prof.getGradoAcademico());
                    ps.setString(5, prof.getCorreo());
                    ps.setString(6, prof.getTelefono());
                    ps.setString(7, id);
                    res = ps.executeUpdate();
                    break;
                case "licenciatura":
                    Licenciatura lic = (Licenciatura) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET id_licenciatura=?,nombre=?,rfc_coordinador=? WHERE id_licenciatura=?");
                    //System.out.println("Update" + tabla + "id_licenciatura ="+ lic.getIdLicenciatura() "nombre = "+ lic.getRfcCordinador() + "where id_licenciatura = "+id.);
                    ps.setString(1, lic.getIdLicenciatura());
                    ps.setString(2, lic.getLicenciatura());
                    ps.setString(3, lic.getRfcCordinador());
                    ps.setString(4, id);
                    res = ps.executeUpdate();
                    break;
                case "periodo_escolar":
                    periodoEscolar periodo = (periodoEscolar) obj;
                    ps = con.prepareStatement("UPDATE " + tabla + " SET id_periodo =? ,periodo=? WHERE id_periodo=?");
                    //System.out.println("Update" + tabla + "id_licenciatura ="+ lic.getIdLicenciatura() "nombre = "+ lic.getRfcCordinador() + "where id_licenciatura = "+id.);
                    ps.setInt(1, periodo.getId_periodo());
                    ps.setString(2, periodo.getPeriodo());
                    ps.setInt(3, Integer.parseInt(id));
                    res = ps.executeUpdate();
                    break;
            }
            return (res > 0) ? true : false;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public static ArrayList<String> llenaCombo(String tabla, String campo, Connection con) {
        ArrayList<String> lista = new ArrayList<String>();

        try {
            String consulta = "SELECT * FROM " + tabla;

            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();

            lista.add("Seleccione una opcion");

            while (rs.next()) {
                lista.add(rs.getString(campo));
            }
        } catch (Exception e) {
            e.toString();
        }
        System.out.println(lista);
        return lista;
    }

    public static int obtieneID(String tabla, String campo, Connection con) {
        int id = 1;
        try {
            ps = con.prepareStatement("SELECT  MAX(id_periodo) FROM periodo_escolar");
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt((1) + 1);
                System.out.println(id);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return id;
    }
}
