
import java.util.Scanner;
class ZodiacGuesser
{
  public static void main(String[] args) 
  {

    int intMonth, days, signInt;
    String dude, stringMonthFromIntMonth;
    Scanner scan = new Scanner(System.in);
    Dates Months = new Dates();
    Months.addMonthClass(new MonthClass("January", 1 ,"Capricorn","Aquarius",31));
    Months.addMonthClass(new MonthClass("February", 2,"Aquarius","Pisces",29));  
    Months.addMonthClass(new MonthClass("March", 3,"Pisces","Aries",31));
    Months.addMonthClass(new MonthClass("April", 4,"Aries","Taurus",30));
    Months.addMonthClass(new MonthClass("May", 5,"Taurus","Gemini",31));
    Months.addMonthClass(new MonthClass("June", 6,"Gemini","Cancer",30));
    Months.addMonthClass(new MonthClass("July", 7,"Cancer","Leo",31));
    Months.addMonthClass(new MonthClass("August", 8,"Leo","Virgo",31));
    Months.addMonthClass(new MonthClass("September", 9,"Virgo","Libra",30));
    Months.addMonthClass(new MonthClass("October", 10,"Libra","Scropio",31));
    Months.addMonthClass(new MonthClass("November", 11,"Scropio","Sagittarius",30));
    Months.addMonthClass(new MonthClass("December", 12,"Sagittarius","Capricorn",31));


      System.out.println(Months);
      System.out.println("Please input your Birth Month: ");

      if(scan.hasNextInt()){ 
        intMonth = scan.nextInt();
        while (intMonth > 12 || intMonth <= 0)
          {
            System.err.println("Invalid entry!");
            System.out.println("Please input your Birth Month: ");
            
            while (!scan.hasNextDouble()) 
            {
              String stringMonth = scan.next();
              stringMonth = stringMonth.toLowerCase();
              
              switch(stringMonth)
              {
                case "jan" : case "january" :
                  stringMonth = "January";
  
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForJanuary(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're wonderfully fun, enthusiastically lively, and honest!");
                  System.out.println("You get along with Scropios");
                  System.out.println("Show off how fun you are on a date with a Scropio");
                  break;
        
                case "feb" : case "february" :
                  stringMonth = "February";
    
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForFebruary(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're strongly ambitious, faithfully modest, and proficiently industrious!");
                  System.out.println("You get along with Scropios");
                  System.out.println("You should totaly make it an ambition to date a Scropio!");
                  break;
                  
                case "march" :
                  stringMonth = "March";
    
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForMarch(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're cheerfully charming, beautiful, and well-balanced!");
                  System.out.println("You get along with Scropios");
                  System.out.println("You should totaly charm a Scropio!");
                  break;
                  
                case "april" :
                  stringMonth = "April";
    
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForApril(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're instinctively determined, assertive, diligent, and decisive");
                  System.out.println("You get along with Scropios");
                  System.out.println("You should be determined to date a Scropio");
                  break;
                  
                case "may" :
                  stringMonth = "May";
    
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForMay(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're beyond smart, assertive, and compassionate");
                  System.out.println("You get along with Scropios");
                  System.out.println("A smart move would be to date a Scropio!");
                  break;
                  
                case "june" : case "jun" :
                  stringMonth = "June";
    
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForJune(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're logically serious, very goal oriented, with high standards");
                  System.out.println("You get along with Scropios");
                  System.out.println("You should seriously date a Scropio!");
                  break;
                  
                case "july" :
                  stringMonth = "July";
     
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForJuly(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're natrually funny, sensitive, compassionate!");
                  System.out.println("You get along with Scropios");
                  System.out.println("Share your funny side by dating a Scropio!");
                  break;
                  
                case "aug" : case "august" :
                  stringMonth = "August";
      
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForAugust(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're openly curious, naturally confident and super playful!");
                  System.out.println("You get along with Scropios");
                  System.out.println("Satisfy your curiousity by dating a Scropio!");
                  break;

                case "sept" : case "september" :
                  stringMonth = "September";
      
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForSeptember(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're fiercely loyal, down-to-earth, and absolutely tenacious!");
                  System.out.println("You get along with Scropios");
                  System.out.println("You should be loyal to a Scropio!");
                  break;
                  
                case "oct" : case "october" :
                  stringMonth = "October";
     
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForOctober(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're naturally bold, strong, and will take on any challenge!");
                  System.out.println("You get along with Virgos and Leos");
                  System.out.println("Be bold and date a Virgo or Leo!");
                  break;
                  
                case "nov" : case "november" :
                  stringMonth = "November";
      
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForNovember(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're highly imaginative, creative, in tune with your feelings!");
                  System.out.println("You get along with Scropios");
                  System.out.println("You imagine dating Scropio!");
                  break;
                  
                case "dec" : case "december" :
                  stringMonth = "December";
     
                  days = Months.getDaysInMonth(stringMonth);
                  signInt = System(days, stringMonth);
                  dude = Months.getZodiacForDecember(signInt, stringMonth);
                  System.out.println(dude);
                  System.out.println("You're a quick thinker, hardworking, and enterprising!");
                  System.out.println("You get along with Scropios");
                  System.out.println("You should quickly think about dating a Scropio!");
                  break;
        
                default:
                  System.out.println("Invalid entry.");
                  System.out.println("Please input your Birth Month: ");
                  break;
              }
              //end of switch

            }
            intMonth = scan.nextInt();
        
          }
          

        switch(intMonth)
        {
          case 1: //January
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForJanuary(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're wonderfully fun, enthusiastically lively, and honest!");
            System.out.println("You get along with Scropios");
            System.out.println("Show off how fun you are on a date with a Scropio");
            break;

          case 2: //February
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForFebruary(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're strongly ambitious, faithfully modest, and proficiently industrious!");
            System.out.println("You get along with Scropios");
            System.out.println("You should totaly make it an ambition to date a Scropio!");
            break;

          case 3: //March
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForMarch(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're cheerfully charming, beautiful, and well-balanced!");
            System.out.println("You get along with Scropios");
            System.out.println("You should totaly charm a Scropio!");
            break;

          case 4: //April
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForApril(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're instinctively determined, assertive, diligent, and decisive");
            System.out.println("You get along with Scropios");
            System.out.println("You should be determined to date a Scropio");
            break;

          case 5: //May
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForMay(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're beyond smart, assertive, and compassionate");
            System.out.println("You get along with Scropios");
            System.out.println("A smart move would be to date a Scropio!");
            break;

          case 6: //June
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForJune(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're logically serious, very goal oriented, with high standards");
            System.out.println("You get along with Scropios");
            System.out.println("You should seriously date a Scropio!");
            break;

          case 7: //July
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForJuly(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're natrually funny, sensitive, compassionate!");
            System.out.println("You get along with Scropios");
            System.out.println("Share your funny side by dating a Scropio!");
            break;

          case 8: //August
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForAugust(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're openly curious, naturally confident and super playful!");
            System.out.println("You get along with Scropios");
            System.out.println("Satisfy your curiousity by dating a Scropio!");
            break;

          case 9: //September
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForSeptember(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're fiercely loyal, down-to-earth, and absolutely tenacious!");
            System.out.println("You get along with Scropios");
            System.out.println("You should be loyal to a Scropio!");
            break;

          case 10: //October
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForOctober(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're naturally bold, strong, and will take on any challenge!");
            System.out.println("You get along with Virgos and Leos");
            System.out.println("Be bold and date a Virgo or Leo!");
            break;

          case 11: //November
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForNovember(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're highly imaginative, creative, in tune with your feelings!");
            System.out.println("You get along with Scropios");
            System.out.println("You imagine dating Scropio!");
            break;
          
          case 12: //December
            days = Months.getDaysInMonthInt(intMonth);
            stringMonthFromIntMonth = Months.getStringMonthfromIntInput(intMonth);
            signInt = System(days, stringMonthFromIntMonth);
            dude = Months.getZodiacForDecember(signInt, stringMonthFromIntMonth);
            System.out.println(dude);
            System.out.println("You're a quick thinker, hardworking, and enterprising!");
            System.out.println("You get along with Scropios");
            System.out.println("You should quickly think about dating a Scropio!");
            break;

        } 
        }
        else if(scan.hasNext()){ 
        String stringMonth = scan.nextLine();
        stringMonth = stringMonth.toLowerCase();
  
        switch(stringMonth)
        {
          case "jan" : case "january" :
            stringMonth = "January";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForJanuary(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're a quick thinker, hardworking, and enterprising!");
            System.out.println("You get along with Scropios");
            System.out.println("You should quickly think about dating a Scropio!");
            break;
  
          case "feb" : case "february" :
            stringMonth = "February";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForFebruary(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're highly imaginative, creative, in tune with your feelings!");
            System.out.println("You get along with Scropios");
            System.out.println("You imagine dating Scropio!");
            break;
            
          case "march" :
            stringMonth = "March";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForMarch(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're bold, strong, and will take on any challenge!");
            System.out.println("You get along with Scropios");
            System.out.println("Be bold and date a Scropio!");
            break;
            
          case "april" :
            stringMonth = "April";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForApril(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're fiercely loyal, down-to-earth, and tenacious!");
            System.out.println("You get along with Scropios");
            System.out.println("You should be loyal to a Scropio!");
            break;
            
          case "may" :
            stringMonth = "May";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForMay(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're openly curious, naturally confident and super playful!");
            System.out.println("You get along with Scropios");
            System.out.println("Satisfy your curiousity by dating a Scropio!");
            break;
            
          case "june" : case "jun" :
            stringMonth = "June";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForJune(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're natrually funny, sensitive, compassionate!");
            System.out.println("You get along with Scropios");
            System.out.println("Share your funny side by dating a Scropio!");
            break;
            
          case "july" :
            stringMonth = "July";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForJuly(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're wonderfully fun, enthusiastically lively, and honest!");
            System.out.println("You get along with Scropios");
            System.out.println("Show off how fun you are on a date with a Scropio");
            break;
            
          case "aug" : case "august" :
            stringMonth = "August";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForAugust(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're strongly ambitious, faithfully modest, and proficiently industrious!");
            System.out.println("You get along with Scropios");
            System.out.println("You should totaly make it an ambition to date a Scropio!");
            break;
            
          case "sept" : case "september" :
            stringMonth = "September";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForSeptember(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're cheerfully charming, beautiful, and well-balanced!");
            System.out.println("You get along with Scropios");
            System.out.println("You should totaly charm a Scropio!");
            break;
            
          case "oct" : case "october" :
            stringMonth = "October";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForOctober(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're determined, assertive, diligent, and decisive");
            System.out.println("You get along with Leos and Virgos");
            System.out.println("You should be determined to date a Leo or Virgo!");
            break;
            
          case "nov" : case "november" :
            stringMonth = "November";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForNovember(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're beyond smart, assertive, and compassionate");
            System.out.println("You get along with Scropios");
            System.out.println("A smart move would be to date a Scropio!");
            break;
            
          case "dec" : case "december" :
            stringMonth = "December";
            days = Months.getDaysInMonth(stringMonth);
            signInt = System(days, stringMonth);
            dude = Months.getZodiacForDecember(signInt, stringMonth);
            System.out.println(dude);
            System.out.println("You're logically serious, very goal oriented, with high standards");
            System.out.println("You get along with Scropios");
            System.out.println("You should seriously date a Scropio!");
            break;
  
          default:
            System.out.println("Invalid entry.");
        }
        //end of switch
        } 

  }//end of main method




    public static int System(int daysFromMain, String month)
    {
      Scanner scan = new Scanner(System.in);
      int birthDay = 0;

      System.out.println("Please input the day of your Birth: ");
      while (!scan.hasNextDouble()) 
      {
        String word = scan.next();
        System.err.println('"' + word+  '"' + " is an invalid entry.");
        System.out.print("Please input the day of your Birth: ");
      }
      birthDay = scan.nextInt();

      while (birthDay > daysFromMain)
      {
        System.err.println("There are only " + daysFromMain + " days in " + month + ".");
        System.out.print("Please input the CORRECT day of your Birth: ");

        while (!scan.hasNextDouble()) {
          String word = scan.next();
          System.err.println('"' + word+  '"' + " is an invalid entry.");
          System.out.print("Please input the day of your Birth: ");
        }
        birthDay = scan.nextInt();
      }

      return (birthDay);
      

    } //end of System method
    
}


