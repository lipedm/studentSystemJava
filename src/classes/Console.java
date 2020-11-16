package classes;

import java.util.Scanner;

public class Console {

    public Console mainMenu(Console console) {
        System.out.println("Bem vindo ao Sistema de Notas: felipeNotes_1.0 xD");
        
        Scanner insert = new Scanner(System.in);

        int selection = 0;

        do {
            System.out.println("[1] Alunos");
            System.out.println("[2] Disciplinas");
            System.out.println("[3] Avaliações");
            System.out.println("[4] Calcular Médias");
            System.out.println("[5] Listar Resultados");
            System.out.println("[6] Sair");

            System.out.print("Seleciona uma opção: ");
            selection = insert.nextInt();
            switch (selection) {
            case 1: return console.studentMenu(console);
            case 2: return console.studentMenu(console);
            case 3: return console.studentMenu(console);
            case 4: return console.studentMenu(console);
            case 5: return console.studentMenu(console);
            case 6: return console;
            default:
                System.out.println("Selecione uma opção válida! (:");
            }
        } while (selection != 6);
        insert.close();
        return console;
    }

    public Console studentMenu(Console console) {
        System.out.println("Adicionar Alunos");

        int selection = 0;

        Scanner insert = new Scanner(System.in);
        do {
            System.out.println("[1] Inserir Aluno");
            System.out.println("[2] Voltar");
            System.out.println("[3] Sair");
            System.out.print("Seleciona uma opção: ");
            selection = insert.nextInt();

            switch (selection) {
            case 1: return console;
            case 2: return console.mainMenu(console);
            case 3: return console;
            default:
                System.out.println("Selecione uma opção válida! (:");
            }
        } while (selection != 3);
        insert.close();
        return console;
    }
}