package java_week_9;

import java.util.Scanner;

/**
 * /**
 *  * Write a java program to input student Name, roll No, and three subjects Math, Science and
 *  * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 *  * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 *  * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 *  * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 *  * _______________________________
 *  * | |
 *  * | Mark Sheet |
 *  * |_______________________________|
 *  * | Name : Jay |
 *  * | Roll No: 08 |
 *  * |_______________________________|
 *  * | Subjects : Marks |
 *  * |_______________________________|
 *  * | Math : 98 |
 *  * | Science : 90 |
 *  * | English : 85 |
 *  * |_______________________________|
 *  * | Total : 273 |
 *  * |_______________________________|
 *  * | Percentage : 91.0 |
 *  * | Result : Pass |
 *  * | Grade : A+ |
 *  * |_______________________________|
 *  */

public class Programme_2_MarkSheet {

    // main method
    public static void main(String[] args) {
    // using scanner
    Scanner scanner = new Scanner(System.in);

    System.out.println("---------------------------");
    System.out.println("|                         |");
    System.out.println("|     Mark Sheet          |");
    System.out.println("---------------------------");

    while (true) {
        System.out.println("| Name :");
        String name = scanner.next();

        System.out.println("|Roll No: ");
        int rollNo = scanner.nextInt();

        System.out.println("|------------------------|");
        System.out.println("| Subject : Marks        |");
        System.out.println("|------------------------|");

        System.out.println("| Math :");
        int mathMark = scanner.nextInt();
        if (mathMark < 0 || mathMark > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            continue;
        }
        System.out.println("| Science :");
        int scienceMark = scanner.nextInt();
        if (scienceMark < 0 || scienceMark > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            continue;

        }
        System.out.println("| English  :");
        int englishMark = scanner.nextInt();
        if (englishMark < 0 || englishMark > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            continue;
        }
        int totalMarks = mathMark  + scienceMark + englishMark ;
        double percentage = (totalMarks / 300) * 100;

        System.out.println("|-------------------------|");
        System.out.println("|Total : " + totalMarks +"|");
        System.out.println("|--------------------------|");
        System.out.println("|Percentage:" + percentage+"|");

        String result = (percentage >= 35) ? " Pass " : " Fail ";
        System.out.println("| Result: " + result + " | ");

        String grade = " ";
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade ="A";
        } else if (percentage >= 50) {
            grade ="B";
        } else if (percentage >= 35) {
            grade ="C";
        }
        System.out.println("| Grade: "+ grade + " |");
        System.out.println("|-----------------------|");
        System.out.print("Enter marks for another student? (yes/no)");
        String choice = scanner.next().toLowerCase();
        if(!choice.equals("yse")){
            break;
        }
    }
    scanner.close();
}
}
