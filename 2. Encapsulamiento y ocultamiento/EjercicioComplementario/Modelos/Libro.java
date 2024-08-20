package EjercicioComplementario.Modelos;

public class Libro {
    /*
     * 1. La clase "Libro" debe tener tres atributos privados: "titulo", "autor" y
     * "paginas".
     */
    private String titulo;
    private String autor;
    private int paginas;

    /*
     * 2. Debes proporcionar metodos publicos para establecer y obtener el titulo y
     * el autor.
     */
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /*
     * 3. Crea un metodo para establecer el numero de paginas, teniendo en cuenta
     * que este numero surge del calculo entre un numero ingresado por el usuario
     * multiplicado por 7. Ej: Si el usuario ingresa 20, la cantidad de paginas que
     * tendra ese libro es 140 (7*20).
     */
    public void calcularNumeroDePaginas(int numero) {
        setPaginas(numero * 7);
    }

    /*
     * 4. Ademas, la clase debe tener un metodo publico llamado "imprimirDetalles"
     * que imprime por consola todos los detalles del libro, incluyendo el titulo,
     * el autor y el numero de paginas.
     */
    public void imprimirDetalles() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Paginas: " + getPaginas());
    }
}
