package David.nota;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class NotaVista {

    Nota nota;
    boolean modoGrafico;
    private Object Quiz;
    Scanner s = new Scanner(System.in);

    public NotaVista(Nota notaInstanciada, boolean modoGrafico) {
        this.nota = notaInstanciada;
        this.modoGrafico = modoGrafico;
    }

    public void leaNota() {
        int notaDigitada = 0;
        
        if (modoGrafico) {
            // fathers info
            String pName = JOptionPane.showInputDialog("Enter the Fathers name:");
            String pLastName =JOptionPane.showInputDialog("Enter the Parents last name:");
            Parent father = new Parent(pName, pLastName);

            //mothers info
            pName = JOptionPane.showInputDialog("Enter the Mothers name:");
            pLastName = JOptionPane.showInputDialog("Enter the Mothers last name:");
            Parent mother = new Parent(pName, pLastName);

            // student info
            String name = JOptionPane.showInputDialog("Enter the students name:");
            String lastName = JOptionPane.showInputDialog("Enter the students last name:");
            double id = Double.parseDouble(JOptionPane.showInputDialog("Enter the students id number:"));
            Student student = new Student(name, lastName,   id, father, mother); // creates student

            //quiz info
            String nameClass = JOptionPane.showInputDialog("Enter the name of the class");
            double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter the grade:"));
            double totalPoints = Double.parseDouble(JOptionPane.showInputDialog("Enter the total amount of points possible"));
            double pointsObtained = Double.parseDouble(JOptionPane.showInputDialog("Enter points obtained:"));
            Quiz test = new Quiz(student, grade, nameClass, totalPoints, pointsObtained);


        } else {
            // fathers info
            System.out.println("Enter the Fathers name:");
            String pName = s.next();
            System.out.println("Enter the Parents last name:");
            String pLastName = s.next();
            Parent father = new Parent(pName, pLastName);

            //mothers info
            System.out.println("Enter the Mothers name:");
            pName = s.next();
            System.out.println("Enter the Parents last name:");
            pLastName = s.next();
            Parent mother = new Parent(pName, pLastName);

            // student info
            System.out.println("Enter the students name:");
            String name = s.next();
            System.out.println("Enter the students last name:");
            String lastName = s.next();
            System.out.println("Enter the students id number:");
            int id = s.nextInt();
            Student student = new Student(name, lastName,   id, father, mother); // creates student

            //test info
            System.out.println("Enter the name of the class");
            String nameClass = s.next();
            System.out.println("Enter the grade:");
            int grade = s.nextInt();
            System.out.println("Enter the total amount of points possible");
            int totalPoints = s.nextInt();
            System.out.println("Enter points obtained:");
            int pointsObtained = s.nextInt();
            Quiz t = new Quiz(student, grade, nameClass, totalPoints, pointsObtained);

        }
        //nota.agregarNota(notaDigitada);
    }

    public void muestreNotas() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < 3; i++) {
            jt.append(toString(test.toString()));
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nota\n2. Mostrar Notas\n3.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}
