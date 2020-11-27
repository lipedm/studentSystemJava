package views;

import java.util.Scanner;
import classes.Scan;
import classes.Student;
import classes.Subject;
import classes.ListStudent;
import classes.ListSubject;
import classes.Rating;
import classes.Course;

public class Console {

    public Console mainMenu(Console console) {
        System.out.println("Bem vindo ao Sistema de Notas: felipeNotes_1.0 xD");

        Scanner insert = new Scanner(System.in);
        ListStudent liststud = new ListStudent();
        ListSubject listsub = new ListSubject();
        Course course = new Course();

        int selection = 0;

        do {

            System.out.println("[1] Alunos");
            System.out.println("[2] Disciplinas");
            System.out.println("[3] Avaliações");
            System.out.println("[4] Listar Resultados");
            System.out.println("[5] Sair");

            System.out.print("Seleciona uma opção: ");
            selection = insert.nextInt();
            switch (selection) {
                case 1:
                    return console.studentMenu(console, liststud);
                case 2:
                    return console.subjectMenu(console, listsub);
                case 3:
                    return console.ratingMenu(console, liststud, listsub, course);
                case 4:
                    liststud.toString();
                    return console.mainMenu(console);
                case 5:
                    return console;
                default:
                    System.out.println("Selecione uma opção válida! (:");
            }
        } while (selection != 5);
        insert.close();
        return console;
    }

    public Console studentMenu(Console console, ListStudent liststud) {
        System.out.println("Adicionar Alunos");

        int selection = 0;

        Scanner insert = new Scanner(System.in);
        do {
            System.out.println("[1] Inserir Aluno");
            System.out.println("[2] Listar Alunos");
            System.out.println("[3] Voltar");
            System.out.println("[4] Sair");
            System.out.print("Seleciona uma opção: ");
            selection = insert.nextInt();

            switch (selection) {
                case 1:
                    addStudent(liststud);
                    return console.studentMenu(console, liststud);
                case 2:
                    liststud.printStudents();
                    return console.mainMenu(console);
                case 3:
                    return console.mainMenu(console);
                case 4:
                    return console;
                default:
                    System.out.println("Selecione uma opção válida! (:");
            }
        } while (selection != 4);
        insert.close();
        return console;
    }

    public Console subjectMenu(Console console, ListSubject listsub) {
        System.out.println("Adicionar Disciplinas");

        int selection = 0;

        Scanner insert = new Scanner(System.in);
        do {
            System.out.println("[1] Inserir Disciplina");
            System.out.println("[2] Listar Disciplinas");
            System.out.println("[3] Voltar");
            System.out.println("[4] Sair");
            System.out.print("Seleciona uma opção: ");
            selection = insert.nextInt();

            switch (selection) {
                case 1:
                    addSubject(listsub);
                    return console.subjectMenu(console, listsub);
                case 2:
                    listsub.printSubjects();
                    return console.mainMenu(console);
                case 3:
                    return console.mainMenu(console);
                case 4:
                    return console;
                default:
                    System.out.println("Selecione uma opção válida! (:");
            }
        } while (selection != 4);
        insert.close();
        return console;
    }

    public Console ratingMenu(Console console, ListStudent liststud, ListSubject listsub, Course course) {
        System.out.println("Adicionar Notas");

        int selection = 0;

        Scanner insert = new Scanner(System.in);
        do {
            System.out.println("[1] Inserir Nota");
            System.out.println("[2] Listar Notas");
            System.out.println("[3] Voltar");
            System.out.println("[4] Sair");
            System.out.print("Seleciona uma opção: ");
            selection = insert.nextInt();

            switch (selection) {
                case 1:
                    addRating(liststud, listsub, course);
                    return console.ratingMenu(console, liststud, listsub, course);
                case 2:
                    course.getRatings();
                    return console.ratingMenu(console, liststud, listsub, course);
                case 3:
                    return console.mainMenu(console);
                case 4:
                    return console;
                default:
                    System.out.println("Selecione uma opção válida! (:");
            }
        } while (selection != 3);
        insert.close();
        return console;
    }

    public void addStudent(ListStudent l) {
        Scan scan = new Scan();
        Student student = new Student(scan.inInt("Insira o Código do Aluno:"),
                scan.inString("Insira o nome do Aluno:"));
        l.setStudent(student);
    }

    public void addSubject(ListSubject l) {
        Scan scan = new Scan();
        Subject subject = new Subject(scan.inInt("Insira o Código da Disciplina:"),
                scan.inString("Insira o nome da Disciplina:"));
        l.setSubject(subject);
    }

    public void addRating(ListStudent l1, ListSubject l2, Course c) {
        Scan scan = new Scan();
        Rating rating = new Rating(scan.inFloat("Digite a primeira nota"), scan.inFloat("Digite a segunda nota"),
                l1.getStudent(scan.inInt("Insira o Código do Aluno:")),
                l2.getSubject(scan.inInt("Insira o Código da Disciplina:")));
        c.setRating(rating);
    }
}