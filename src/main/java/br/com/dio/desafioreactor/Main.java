package br.com.dio.desafioreactor;

import java.util.List;

public class Main {

    public static void main(String [] args) {
        var question1 = new Question1();
        question1.inc(List.of(1L, 2L, 3L, 4L)).subscribe(System.out::println);

        var question2 = new Question2();
        User user1NotAdmin = new User(123L, "Jaime", "Jaime@gmail.com", "12345", false);
        User user2Admin = new User(124L, "Alonso", "Alonso@gmail.com", "54321", true);
        question2.countAdmins(List.of(user1NotAdmin,user2Admin)).subscribe(System.out::println);

        var question3 = new Question3();
        User user = new User(001L, "Phelipe", "phelipe@gmail.com", "000000000", true);
        question3.userIsValid(user).subscribe(System.out::println);
    }

}
