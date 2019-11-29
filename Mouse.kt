
/**
 * El raton del computador
 */
data class Mouse (
    // constructor
    var tipo: String = "usb"){
        // atributo de clase fuera del constructor
        var color: String = "negro"
        // bloque que se ejecuta al crear el objeto
        init {
            println("Iniciando...")
            // añadimos algo al atributo al crearlo
            tipo = tipo + "!"
        }
}
