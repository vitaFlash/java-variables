public class AboutMe {
    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) para cada uno de los siguentes datos:
        // nombre, edad, país, lenguaje de programación, horas, pasatiempo, lugar y reemplaza en el texto de impresión, la variable que corresponda.
        String nombre = "Vitaliia";
        int edad = 30;
        String pais = "Ucrania";
        String lenguajeDeProgramacion = "Java";
        int horas = 8;
        String pasatiempo = "caminar";
        String lugar = "park";
        //Reemplaza <name> y <age> concatenando el String con las variables creadas.
        System.out.println("Mi nombre es "+nombre+", tengo "+edad+" años y soy de "+pais+".");

        //Reemplaza <programmingLanguage> y <hours> concatenando el String con las variables creadas. 
        System.out.println("Estoy estudiando "+lenguajeDeProgramacion+" y practico "+horas+" horas al día.");

        //Reemplaza <hobby> y <place> concatenando el String con las variables creadas.
        System.out.println("Mi pasatiempo favorito es "+pasatiempo+" y lo practico en "+lugar+".");
    }
}
