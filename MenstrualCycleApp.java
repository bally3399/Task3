package MenstrualCycleApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class MenstrualCycleApp {
    Scanner scanner = new Scanner(System.in);
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private int cycleLength;

    public static void main(String[] args){
        MenstrualCycleApp menstrualCycleApp = new MenstrualCycleApp();
        menstrualCycleApp.displayMenu();
        menstrualCycleApp.MenstrualCycle();
    }
    private void displayMenu(){
        while (true){
        System.out.println("Menstrual Period Tracking App: ");
        System.out.println("1.Record Menstrual Cycle\n2. Track Ovulation Cycle\n3.Predict Next Period\n4.Predict Fertile Days\n5.Exit");
        System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    recordMenstrualCycle();
                    break;
                case 2:
                    trackOvulationCycle();
                    break;
                case 3:
                    predictNextPeriod();
                    break;
                case 4:
                    predictFertileDays();
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Enter your choice: ");
            }
        }
    }

    private void recordMenstrualCycle() {
        System.out.print("Enter the date of your last menstrual period (yyyy-MM-dd): ");
        LocalDate lastPeriodDate = LocalDate.parse(scanner.next());

        System.out.print("Enter the average length of your menstrual cycle (usually 28 days): ");
        cycleLength = scanner.nextInt();

        System.out.println("=======================================");
        System.out.println("Last period date is: " + lastPeriodDate);
        System.out.println("Your cycle length is: " + cycleLength);
        System.out.println("Menstrual cycle recorded successfully!");
        System.out.println("========================================");
        System.out.println();

    }

    private void trackOvulationCycle() {
        System.out.print("Enter the date of your last menstrual period (yyyy-MM-dd): ");
        LocalDate lastPeriodDate = LocalDate.parse(scanner.next(), dateFormatter);

        System.out.println("Enter your circle length");
        cycleLength = scanner.nextInt();

        LocalDate ovulationDate = lastPeriodDate.plusDays(cycleLength / 2);

        System.out.println("Ovulation is predicted to occur around: " + ovulationDate);
    }
    private void predictNextPeriod() {
        System.out.print("Enter the date of your last menstrual period (yyyy-MM-dd): ");
        LocalDate lastPeriodDate = LocalDate.parse(scanner.next(), dateFormatter);

        System.out.println("Enter your circle length: ");
        LocalDate nextPeriodDate = lastPeriodDate.plusDays(cycleLength);

        System.out.println("======================================================");
        System.out.println("Predicted next period date: " + nextPeriodDate);
        System.out.println("Your cycle length is: " + cycleLength);
        System.out.println("======================================================");

    }

    private void predictFertileDays() {
        System.out.print("Enter the date of your last menstrual period (yyyy-MM-dd): ");
        LocalDate lastPeriodDate = LocalDate.parse(scanner.next());

        System.out.print("Enter the average length of your menstrual cycle (usually 28 days): ");
        cycleLength = scanner.nextInt();

        LocalDate ovulationDate = lastPeriodDate.plusDays(cycleLength / 2);
        LocalDate fertileStartDate = ovulationDate.minusDays(4);
        LocalDate fertileEndDate = ovulationDate.plusDays(3);

        System.out.println("Predicted fertile days: " + fertileStartDate + " to " + fertileEndDate);
    }
    public void MenstrualCycle(){
        System.out.println("Did you want to know about Menstrual Cycle");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Yes")){
            System.out.println("The menstrual cycle is a term to describe the sequence of events that occur in your body" +
                    "as it prepares for the possibility of pregnancy each month.\n " +
                    "Your menstrual cycle is the time from the first day of your menstrual period until the first day of your next menstrual period.\n " +
                    "Every person’s cycle is slightly different, but the process is the same." +
                    "The average length of a menstrual cycle is 28 days.\n " +
                    "However, a cycle can range in length from 21 days to about 35 days and still be normal.\n" +
                    "The days between periods is your menstrual cycle length.\n " +
                    "The average menstrual cycle lasts 28 days. However, cycles lasting as little as 21 days or as long as 35 days can be normal.\n" +
                    "A period is normal if it’s anywhere between three and seven days. While on the shorter end of the range, some people have a menstrual period for three days. This is OK.\n" +
                    "PHASES OF MENSTRUAL CYCLE\n" +
                    "1.The menses phase: This phase begins on the first day of your period.\n" +
                    "It's when the lining of your uterus sheds through your vagina if pregnancy hasn’t occurred.\n" +
                    "Most people bleed for three to five days, but a period lasting only three days to as many as seven days is usually not a cause for worry.\n" +
                    "2.The follicular phase: This phase begins on the day you get your period and ends at ovulation (it overlaps with the menses phase and ends when you ovulate).\n" +
                    "It’s part of an ongoing process in your body during your reproductive years when hormones activate changes in your body that make it possible for you to become pregnant.\n" +
                    " During days 10 to 14, one of the developing follicles will form a fully mature egg (ovum).\n" +
                    "3.Ovulation: This phase occurs roughly at about day 14 in a 28-day menstrual cycle. A sudden increase in another hormone — luteinizing hormone (LH) — causes your ovary to release its egg. This event is ovulation.\n" +
                    "4.The luteal phase: This phase lasts from about day 15 to day 28. Your egg leaves your ovary and begins to travel through your fallopian tubes to your uterus. \n" +
                    "The level of the hormone progesterone rises to help prepare your uterine lining for pregnancy. If the egg becomes fertilized by sperm and attaches itself to your uterine wall (implantation), you become pregnant.\n" +
                    "If pregnancy doesn’t occur, estrogen and progesterone levels drop and the thick lining of your uterus sheds during your period.\n");
                    System.out.println("SYMPTOMS OF GETTING PERIOD\n" +
                    "1.Mood changes.\n" +
                    "2.Trouble sleeping.\n" +
                    "3.Headache.\n" +
                    "4.Food cravings.\n" +
                    "5.Bloating." +
                    "6.Breast tenderness.\n" +
                    "7.Acne.");


        }
        else{
            System.out.println("THANKS FOR USING THIS APP");
        }

    }

}

