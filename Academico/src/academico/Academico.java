/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

/**
 *
 * @author novousuario
 */
public class Academico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alunos a1 = new Alunos();
        a1.setMatricula(20221678);
        a1.setNome("Pedro Nonato");
        a1.setNomeResponsavel("Maria Rita");
        System.out.println("Matricula:" + a1.getMatricula());
        System.out.println("Nome:" + a1.getNome());
        System.out.println("Responsavel:" + a1.getNomeResponsavel());
        Professores p1 = new Professores();
        p1.setMatricula(12222);
        p1.setNome("renner");
        p1.setTitulacao("Especialista");
        
        
    }
    
}
