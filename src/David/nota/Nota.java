package David.nota;


public class Nota {

    Quiz quiz[];
    int indice;
    String ejemplo;

    public Nota(Quiz[] quiz, int indice, String ejemplo) {
        this.quiz = quiz;
        this.indice = indice;
        this.ejemplo = ejemplo;
    }

    public void agregarNota(Quiz notaEstudiante) {
        try {
        
            try {
                quiz[indice++] = notaEstudiante;
               

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de quices");
                indice--;
            } 
        }
        catch(Exception e){
                System.out.println("error mas general");
        } 
    }

    public int getIndex() {
        return indice;
    }

    public Quiz getNota(int i) {
        return quiz[i];
    }

}