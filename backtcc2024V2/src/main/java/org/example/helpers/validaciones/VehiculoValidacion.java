package org.example.helpers.validaciones;

import org.example.helpers.generals.RegexValidator;
import org.example.helpers.mensajes.MensajesVehiculo;
import org.example.helpers.mensajes.RegexExpresiones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VehiculoValidacion {

    //INYECTO AL DEPEDENCIA A LA LA CLASE REGEXVALIDATOR
    RegexValidator regexValidator= new RegexValidator();

    public boolean validarId(Integer id)throws Exception{

        if(id<0){
            throw new Exception(MensajesVehiculo.ID_VEHICULO_ERRONEO.getMensajeError());
        }

        return true;
    }
    public boolean validarMarca(String marca)throws Exception{
        if(!regexValidator.validarRegex(marca, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())){
           throw new Exception("error en el formato del nombre de la marca");
        }
        if(marca.length()>50){
            throw new Exception("error en el tamaño de caracteres de la marca");
        }
        return true;

    }

    public boolean validarKilometraje(Double kilometraje) throws Exception{

        if (kilometraje < 0 || kilometraje > 100000) {
            throw new Exception(MensajesVehiculo.KILOMETRAJE.getMensajeError());
        }
        return true;

    }

    public boolean validarColor(String color) throws Exception {
        if (!regexValidator.validarRegex(color,RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())) {
            throw new Exception("error en el formato del nombre de la marca");
        }
        if (color.length()>20) {
            throw new Exception("Error en el tamaño de caracteres del color");
        }

        return true;
    }

    public boolean validarDescripcion(String descripcion) throws Exception {
        if (descripcion.length()>100) {
            throw new Exception("Superaste el numero de caracteres, solo se permiten un maximo de 100");
        }
        return true;
    }

    public boolean validarTipo(String tipo) throws Exception {
        if (!regexValidator.validarRegex(tipo,RegexExpresiones.VALIDAR_SOLO_LETRAS_SIN_ESPACIOS.getExpresionRegular())) {
            throw new Exception("Solo se permiten letras sin espacios");
        }
        return true;
    }

    public boolean validarAutonomia(Integer autonomia) throws Exception {
        if (autonomia < 0 || autonomia > 72) {
            throw new Exception("EL rango debe ser entre 0 y 72");
        }
        return true;
    }

    public boolean validarCapacidadCarga(Double capacidadCarga) throws Exception {
        if (capacidadCarga < 0 || capacidadCarga > 1000) {
            throw new Exception("EL rango debe ser entre 0 y 1000");
        }
        return true;
    }

    public boolean validarAvaluo(Integer avaluo)throws Exception{

        if(avaluo<0){
            throw new Exception("Solo se permiten numeros mayores a 0");
        }

        return true;
    }


    public boolean validarModelo(String fechaModelo)throws Exception{return true;}

    public boolean validatorFunc(String data_to_validate, String regEx, String screen_text) throws Exception {
        if(!regexValidator.validarRegex(data_to_validate, regEx)){
            throw new Exception(screen_text);
        }
        return true;
    }


}
