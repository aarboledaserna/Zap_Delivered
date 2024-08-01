package org.example.helpers.mensajes;

public enum MensajesVehiculo {
    ID_VEHICULO_ERRONEO("Revisa, no aceptamos id negativos"),
    ID_VEHICULO_NO_EXISTE("Revisa el id no existe"),

    KILOMETRAJE ("Solo se aceptan números positivos y menosres de 100000"),

    ID_VEHICULO_NOEXISTE ("Id no existe");

    private String mensajeError;

    MensajesVehiculo(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
}
