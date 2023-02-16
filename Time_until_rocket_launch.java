/*

Tony Wu
Programming Assignment 3: Writing Methods 
CS 111B Java
-------------
Program description:
- Asks the user if they wish to launch a rocket today with a yes or no prompt.
- If user input is "no", program ends.46ye
- If user input is "yes", program asks question the user to input an interger value of how many hours until launch.
- Program will proceed to count down from days, to hours, to minutes, to seconds.

*/




import java.util.Scanner;
class Time_until_rocket_launch {

    //Main method.
    
    //Asks the user to input a yes or no.
    public static void main(String[] args) {   
        String yes_or_no_to_launch_question;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to The NASA Space Program.");
        System.out.println("Should we launch a rocket? \nYes or no?");
        while (scan.hasNextDouble()) {
            int num = scan.nextInt();
            System.err.println(num + " is not yes or no");
            System.out.println("Please enter: yes or no");
            yes_or_no_to_launch_question = scan.nextLine();
        }
        yes_or_no_to_launch_question = scan.nextLine();
        yes_or_no_prompt(yes_or_no_to_launch_question);
    }

    //This method takes a interger input from user.
    public static void launch_time() {
        int countdown_in_hours;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many hours until launch? ");

        while (!scan.hasNextDouble()) {
            String word = scan.next();
            System.err.println(word + " is not a number");
            System.out.print("Enter a number: ");
        }
        countdown_in_hours = scan.nextInt();

        while (countdown_in_hours <= 0 ) {
            System.out.println("Please enter a time higher than 0.");

            while (!scan.hasNextDouble()) {
                String word = scan.next();
                System.err.println(word + " is not a number");
                System.out.print("Enter a number: ");
            }
            countdown_in_hours = scan.nextInt();
        }
        if (countdown_in_hours < 24) {
            count_hours_til_launch(countdown_in_hours);
        } else {
            how_many_days(convert_hours_into_days(countdown_in_hours));
        }

    }

    //This method counts remaining hours > 23 decrementally, and prints.
    public static void count_hours_til_launch(int h1) {
        
        while (h1 > 1) {
                System.out.println("T-minus " +h1+ " hours!");
                h1--;
            } 
            System.out.println("T-minus 1 hour!");
        seconds_til_launch();
    }

    //This method counts down remaining days incrementally, then prints.
    public static void how_many_days(int d1) {
        System.out.println();
        while (d1 > 1) {   
            System.out.println("T-minus " +d1+ " days!");
            d1--;
        }
        System.out.println("T-minus 1 day!");

        t_minus_launch();
    }

    //This method converts user's integer input, from hours into days+hours.
    //Returns calcuations.
    public static int convert_hours_into_days(int total_hours) {
        int remaining_hours, days;
        days = total_hours / 24;
        remaining_hours = total_hours % 24;
        if (days >= 1) {
            days_remaining(days);
        }
        if (remaining_hours > 0) {
            hours_remaining(remaining_hours);
        }
        return(days);
    }

    //This method prints the amount of days, based on the user input.
    public static void days_remaining(int d1) {
        System.out.print("we launch in T-minus "+d1+" days and ");
    }

    //This method prints the amount of hours remaining.
    public static void hours_remaining(int h1) {
        if (h1>1){
            System.out.print(h1+" hours ");
        } else {
            System.out.print("1 hour ");
        }
    }

    //This method counts down the hours remaining incrementally, then prints.
    public static void t_minus_launch() {
        int hours = 23;
        while (hours > 1)
            {
                System.out.println("T-minus " +hours+ " hours!");
                hours--;
            } 
            System.out.println("T-minus 1 hour!");


        seconds_til_launch();

    }

    //This method counts down the minutes and seconds remaining incrementally, then prints.
    public static void seconds_til_launch() {   
        int min = 50;

        for (int i = 1 ; i < min; min-=10) {   
            System.out.println("T-minus "+ min +" mins!");
        }
        int less_than_10_mins = 9;

        for (int i = 1; i < less_than_10_mins; less_than_10_mins--) {
            System.out.println("T-minus "+ less_than_10_mins +" mins!");
        }
        System.out.println("T-minus 1 min!");
        int sec = 10;

        for (int i = 0 ; i < sec; sec--) {   
            System.out.println(sec);
        }
        System.out.println("Launch!");
    }

    //This method determiness if the user's input between Yes and No.
    //Uses switch
    public static void yes_or_no_prompt (String answer_1) {
        switch (answer_1) {
                case "yeS":
                    launch_time();
                case "YEs":
                    launch_time();
                case "yEs":
                    launch_time();
                case "YeS":
                    launch_time();
                case "yES":
                    launch_time();
                case "Yes":
                    launch_time();
                    break;
                case "Y":
                    launch_time();
                    break;
                case "yes":
                    launch_time();
                    break;
                case "y":
                    launch_time();
                    break;
                case "No":
                    System.out.println("Another time then.");
                    break;
                case "no":
                    System.out.println("Another time then.");
                    break;
                case "n":
                    System.out.println("Another time then.");
                    break;
                case "N":
                    System.out.println("Another time then.");
                    break;
                case "NO":
                    System.out.println("Another time then.");
                    break;
                case "nO":
                    System.out.println("Another time then.");
                    break;
                default:
                    String yes_or_no_to_launch_question;
                    Scanner scan = new Scanner(System.in);
                    
                    System.out.println('"'+answer_1+'"' + " is not a yes or no.");
                    System.out.println("Should we launch a rocket? \nYes or no?");
                    while (scan.hasNextDouble()) {
                        int num = scan.nextInt();
                        System.err.println(num + " is not yes or no");
                        System.out.println("Please enter: yes or no");
                        yes_or_no_to_launch_question = scan.nextLine();
                    }
                    yes_or_no_to_launch_question = scan.nextLine();
                    yes_or_no_prompt(yes_or_no_to_launch_question);
                        break;
                    
            }
    }

}

/*
----------------
Sample Output #1
----------------
Welcome to The NASA Space Program.
Should we launch a rocket? 
Yes or no?
no
Another time then.

----------------
Sample Output #2
----------------
Welcome to The NASA Space Program.
Should we launch a rocket? 
Yes or no?
yes
How many hours until launch? 3
T-minus 3 hours!
T-minus 2 hours!
T-minus 1 hour!
T-minus 50 mins!
T-minus 40 mins!
T-minus 30 mins!
T-minus 20 mins!
T-minus 10 mins!
T-minus 9 mins!
T-minus 8 mins!
T-minus 7 mins!
T-minus 6 mins!
T-minus 5 mins!
T-minus 4 mins!
T-minus 3 mins!
T-minus 2 mins!
T-minus 1 min!
10
9
8
7
6
5
4
3
2
1
Launch!

----------------
Sample Output #3
----------------
Welcome to The NASA Space Program.
Should we launch a rocket? 
Yes or no?
yes
How many hours until launch? 25
we launch in T-minus 1 days and 1 hour 
T-minus 1 day!
T-minus 23 hours!
T-minus 22 hours!
T-minus 21 hours!
T-minus 20 hours!
T-minus 19 hours!
T-minus 18 hours!
T-minus 17 hours!
T-minus 16 hours!
T-minus 15 hours!
T-minus 14 hours!
T-minus 13 hours!
T-minus 12 hours!
T-minus 11 hours!
T-minus 10 hours!
T-minus 9 hours!
T-minus 8 hours!
T-minus 7 hours!
T-minus 6 hours!
T-minus 5 hours!
T-minus 4 hours!
T-minus 3 hours!
T-minus 2 hours!
T-minus 1 hour!
T-minus 50 mins!
T-minus 40 mins!
T-minus 30 mins!
T-minus 20 mins!
T-minus 10 mins!
T-minus 9 mins!
T-minus 8 mins!
T-minus 7 mins!
T-minus 6 mins!
T-minus 5 mins!
T-minus 4 mins!
T-minus 3 mins!
T-minus 2 mins!
T-minus 1 min!
10
9
8
7
6
5
4
3
2
1
Launch!

 */