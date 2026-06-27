import java.util.*;
public class PVR
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String title="******************WELCOME TO PVR CINEMA*****************";
        String list[]=new String[19];//for Storing Movie names.
        list[0]="EXTRACTION 2";list[1]="ZARA HATKE ZARA BACHKE";list[2]="THE FLASH";list[3]="THE KERALA STORY";list[4]="ELEMENTAL";list[5]="MAIDAAN";
        list[6]="1920";list[7]="ADIPURUSH";list[8]="SUPER MARIO BROS";list[9]="GADAR 2";list[10]="THE LITTLE MERMAID";list[11]="TRANSFORMERS";
        list[12]="IB71";list[13]="MALLI PELLI";list[14]="AGGRASENA";list[15]="KISI KA BHAI KISI JAAN";list[16]="SHEHZADA";
        list[17]="SPIDERMAN";list[18]="KATHAL";
        String city[]=new String[6];//for Storing City names.
        city[0]="BANGALORE";city[1]="CHANDIGARH";city[2]="DELHI";city[3]="HYDERABAD";city[4]="MUMBAI";city[5]="KOLKATA";
        String cityN,movie,size, date, restart, seat_no;//declaration of String variables
        String ans="Q";String ans1="Q";
        int flag=0,flag1=0,flag2=0,flag3=0,flag4=0,catg,quantity,bvrg,tot_bvrg,snck,tot_snck,fd;
        int tot_fd=1,tot_d,d,ch;//declaration of Integer variables
        Date current_Date = new Date();
        do
        {
            do
            {
                System.out.println();   
                System.out.println(title);
                System.out.println("*********************************************************");
                System.out.println();
                System.out.println("<<< SELECT YOUR CURRENT CITY >>>");
                do
                {
                    if(flag>0)
                        System.out.println("** INVALID INPUT ! TRY AGAIN **");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("** BANGALORE CHANDIGARH DELHI HYDERABAD MUMBAI KOLKATA **");
                    System.out.println();
                    System.out.print("ENTER THE CORRECT CITY NAME FOR YOUR CHOICE :");
                    cityN=sc.nextLine();
                    for(int i=0;i<6;i++)
                    {
                        if(city[i].equalsIgnoreCase(cityN))
                        {
                            flag=0;
                            break;
                        }
                        else
                            flag++;
                    }
                }while(flag!=0);
                System.out.println("*********************************************************");
                System.out.println("<<< SELECT YOUR CATEGORY TO WATCH THE MOVIE >>>");
                do
                {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("** 1.PVR "+cityN+" CLASSIC CINEMAS **");
                    System.out.println("** 2.PVR "+cityN+" SUPER CLASSIC CINEMAS **");
                    System.out.println();
                    System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE :");
                    catg=Integer.parseInt(sc.nextLine());
                    if((catg==1)||(catg==2))
                        flag1=0;
                    else
                    {
                        System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                        flag1++;
                    }
                }
                while(flag1!=0);
                System.out.println("*********************************************************");
                System.out.println("*********************************************************");
                System.out.println();
                System.out.println();
                System.out.println("<<< ENTER YOUR DATE IN NUMBERS FOR THE MOVIE >>>");
                date=String.valueOf(sc.nextLine());//entering the date of the movie
                System.out.println("*********************************************************");
                if(catg==1)
                {
                    System.out.println("<<< MOVIE SELECTION >>>");
                    do
                    {
                        if(flag3>0)
                            System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                        System.out.println("************************** NOW SHOWING ***************************");
                        System.out.println("MOVIE NAME                    RATING      LANGUAGE    SHOW TIMINGS");
                        System.out.println();
                        System.out.println("EXTRACTION 2                   U/A        HINDI       01:00pm,9:15pm");
                        System.out.println("ZARA HATKE ZARA BACHKE         U/A        ENGLISH     06:15pm");
                        System.out.println("THE FLASH                      U          ENGLISH     03:20pm");
                        System.out.println("THE KERALA STORY               A          HINDI       06:15pm,9:20pm");
                        System.out.println("ELEMENTAL                      U/A        ENGLISH     12:45pm,1:05pm,3:20pm,9:05pm");
                        System.out.println("MAIDAAN                        U          HINDI       10:30am,12:45pm,1:05pm");
                        System.out.println("1920                           A          TELUGU      12:15pm,9:45pm");
                        System.out.println("ADIPURUSH                      U          HINDI       10:00am,12:15pm");
                        System.out.println("SUPER MARIO BROS               U          ENGLISH     01:00pm,4:05pm");
                        System.out.println("GADAR 2                        U          HINDI       01:20pm");
                        System.out.println("THE LITTLE MERMAID             U          ENGLISH     01:20pm");
                        System.out.println("TRANSFORMERS                   U          ENGLISH     06:15pm");
                        System.out.println("IB71                           U/A        HINDI       11:00am");
                        System.out.println("MALLI PELLI                    U          TELUGU      03:40pm");
                        System.out.println("AGGRASENA                      U          KANNADA     01:20pm");
                        System.out.println("KISI KA BHAI KISI JAAN         U          HINDI       10:00 am");
                        System.out.println("SHEHZADA                       U          HINDI       04:00 pm");
                        System.out.println("SPIDERMAN                      U/A        ENGLISH     03:20pm");
                        System.out.println("KATHAL                         U/A        KANNADA     09:00pm");
                        System.out.println();//displaying the list of movies with their show timings
                        System.out.print("ENTER THE NAME OF YOUR SELECTED MOVIE :");
                        movie=sc.nextLine();//inputting the name of the movie
                        for(int i=0;i<19;i++)
                        {
                            if(list[i].equalsIgnoreCase(movie))
                            {
                                flag3=0;   
                                break;
                            }
                            else
                                flag3++;
                        }
                    }while(flag3!=0);
                    System.out.println();
                    System.out.println("<<< PLEASE ENTER THE NUMBER OF TICKETS >>>");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print("ENTER THE NUMBER OF TICKETS :");
                    quantity=Integer.parseInt(sc.nextLine());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Movie Selected :"+movie);
                    System.out.println("The Total Cost is Rs. "+(quantity*110));/*
                    calculating the cost of movie tickets for classic cinema*/
                    System.out.print("Your Seat Number/s is/ are ");
                    for(int i=1;i<=quantity;i++)
                    {
                        System.out.print(17+i+" ");
                    }
                    System.out.println();
                }
                if(catg==2)
                {
                    System.out.println("<<< MOVIE SELECTION >>>");
                    do
                    {
                        if(flag3>0)
                            System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                        System.out.println("************************** NOW SHOWING ***************************");
                        System.out.println("MOVIE NAME                    RATING      LANGUAGE    SHOW TIMINGS");
                        System.out.println();
                        System.out.println("EXTRACTION 2                   U/A        ENGLISH  I  01:00pm,9:15pm");
                        System.out.println("ZARA HATKE ZARA BACHKE         U/A        HINDI       06:15pm");
                        System.out.println("THE FLASH                      U/A        ENGLISH     06:15pm,9:20pm");
                        System.out.println("THE KERALA STORY               A          HINDI       12:45pm,1:05pm,3:20pm,9:05pm");
                        System.out.println("ELEMENTAL                      U          ENGLISH     10:30am,12:45pm,1:05pm");
                        System.out.println("MAIDAAN                        U          HINDI       12:15pm,9:45pm");
                        System.out.println("1920                           A          TELUGU      10:00am,12:15pm");
                        System.out.println("ADIPURUSH                      U          HINDI       01:00pm,4:05pm");
                        System.out.println("SUPER MARIO BROS               U          ENGLISH     01:20pm");
                        System.out.println("GADAR 2                        U          HINDI       06:15pm");
                        System.out.println("THE LITTLE MERMAID             U          ENGLISH     03:40pm");
                        System.out.println("TRANSFORMERS                   U          ENGLISH     01:20pm");
                        System.out.println("IB71                           U          HINDI       10:00 am");
                        System.out.println("MALLI PELLI                    U          TELUGU      03:20pm");
                        System.out.println("AGGRASENA                      U/A        KANNADA     09:00pm");
                        System.out.println("KISI KA BHAI KISI JAAN         U/A        HINDI       09:00pm");
                        System.out.println("SHEHZADA                       U/A        HINDI       09:00pm");
                        System.out.println("SPIDERMAN                      U/A        ENGLISH     09:00pm");
                        System.out.println("KATHAL                         U/A        KANNADA     09:00pm");
                        System.out.println();//displaying the list of movies with their show timings
                        System.out.print("ENTER THE NAME OF YOUR SELECTED MOVIE :");
                        movie=sc.nextLine();//inputting the name of the movie
                        for(int i=0;i<19;i++)
                        {
                            if((i==2)||(i==9)||(i==12)||(i==16))
                                i++;
                            if(list[i].equalsIgnoreCase(movie))
                            {
                                flag3=0;
                                break;
                            }
                            else
                                flag3++;
                        }
                    }while(flag3!=0);
                    System.out.println();
                    System.out.println("<<< PLEASE ENTER THE NUMBER OF TICKETS >>>");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print("ENTER THE NUMBER OF TICKETS :");
                    quantity=Integer.parseInt(sc.nextLine());
                    System.out.println("NUMBER OF TICKETS: "+quantity);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Movie Selected :"+movie);
                    System.out.println("The Total Cost is Rs. "+(quantity*150));/*
                    calculating the cost of movie tickets for super classic cinema*/
                    System.out.print("Your Seat Number/s is/ are ");
                    for(int i=1;i<=quantity;i++)
                    {
                        System.out.print(135+i+" ");
                    }
                    System.out.println();
                }
                System.out.println("*********************************************************");
                System.out.println("************ THANK YOU FOR BUYING TICKETS ***************");
                System.out.println();
                System.out.println("*****************UPCOMMING RELEASES********************");
                System.out.println("DREAM GIRL 2                HINDI");
                System.out.println("DUNKI                       HINDI");
                System.out.println("JAWAAN                      HINDI");
                System.out.println("SALAAR                      HINDI");
                System.out.println("THE MARVELS                 ENGLISH");
                System.out.println("TIGER                       HINDI");
                System.out.println("DREAM GIRL 2                HINDI");
                System.out.println("OPPENHEIMER                 ENGLISH");
                System.out.println("MISSION IMPOSSIPBLE         ENGLISH");
                System.out.println("BLUE BEETLE                 ENGLISH");
                System.out.println("YODHA                       HINDI");
                System.out.println("FUKREY 3                    HINDI");//displaying all the upcoming movies
                System.out.println("********************************************************");
                System.out.println();
                System.out.println("TO QUIT BUYING TICKETS ENTER 'Q'");
                ans=sc.nextLine();
                System.out.println("*********************************************************");
                do
                {
                    System.out.println("*********** WELCOME TO THE SNACK BAR OF PVR ************");
                    System.out.println();
                    System.out.println("<<< STALL 1 >>>");//displaying the items in stall 1
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("********** SECTION : CHILLED BEVERAGES **********");
                    System.out.println();
                    System.out.println("1. COCA COLA            2. SPRITE");
                    System.out.println("3. FRUITI               4. SEVEN UP");
                    System.out.println("5. DIET PEPSI           6. COLD COFEE");
                    System.out.println("7. ICE TEA              8. CHOCOLATE KRUSHERS");
                    System.out.println("9. BLACKBERRY KRUSHERS  10.LEMON N ICETEA");
                    System.out.println();
                    System.out.println("********** SECTION : PIPING HOT DRINKS **********");
                    System.out.println();
                    System.out.println("11. TEA REGULAR         12. HOT LEMON TEA");
                    System.out.println("13. ESPRESSO            14. CAFEMACHO");
                    System.out.println("15. CAPPUCINO           16. CAFE LATTE");
                    System.out.println("17. IRISH COFEE");
                    System.out.println();
                    String flagC1=new String();    
                    System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
                    flagC1=sc.nextLine();
                    System.out.println();
                    if(flagC1.equalsIgnoreCase("Y"))
                    {
                        System.out.print("CHOOSE YOUR BEVERAGE BY ENTERING THE NUMBER :");
                        bvrg=Integer.parseInt(sc.nextLine());
                        System.out.print("ENTER THE TOTAL NUMBER OF BEVERAGE YOU WANT TO BUY :");
                        tot_bvrg=Integer.parseInt(sc.nextLine());
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println();
                        System.out.println("<<< STALL 1 BILL >>>");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        if(bvrg>=1 && bvrg<=7)
                            System.out.println("TOTAL COST IS RS."+(tot_bvrg*45));
                        else if (bvrg>=8 && bvrg<=10)
                            System.out.println("THE TOTAL COST IN Rs"+(tot_bvrg*55));
                        else if (bvrg>=11 && bvrg<=12)
                            System.out.println("THE TOTAL COST IN Rs"+(tot_bvrg*65));
                        else if (bvrg>=13 && bvrg<=17)
                            System.out.println("THE TOTAL COST IN Rs"+(tot_bvrg*75));//calculating the cost of beverages
                        System.out.println();
                    }
                    else
                        System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("<<< STALL 2 >>>");//displaying the items in stall 2
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("************* SECTION : QUICK BITES *************");
                    System.out.println();
                    System.out.println();
                    System.out.println("18. POP CORN[REGULAR]             19. POP CORN[CHEESE]");
                    System.out.println("20. POP CORN[CARAMEL]             21. POP CORN[TANGY TOMATO]");
                    System.out.println("22. VEG SAMOSA                    23. VEG PUFF");
                    System.out.println("24. VEG QUICHE                    25. VEG PIZZA");
                    System.out.println("26. VEG CROISSANT                 27. VEG BURGER");
                    System.out.println("28. FRENCH FRIES                  29. CHICKEN PUFF ROLL");
                    System.out.println("30. MULTI GRAIN CHICKEN SANDWICH  31. FOCCACCIA CHICKEN SANDWICH");
                    System.out.println("32. CHICKEN SUBMARINE");
                    String flagC2=new String();
                    System.out.println();
                    System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
                    flagC2=sc.nextLine();
                    System.out.println();
                    if(flagC2.equalsIgnoreCase("Y"))
                    {
                        System.out.println("CHOOSE YOUR SNACK BY ENTERING THE NUMBER");
                        snck=Integer.parseInt(sc.nextLine());
                        System.out.println();
                        System.out.println("ENTER THE TOTAL NUMBER OF SNACKS YOU WANT TO BUY");
                        tot_snck=Integer.parseInt(sc.nextLine());
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println();
                        System.out.println("<<< STALL 2 BILL >>>");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        if(snck>=18 && snck<=21)
                        {
                            System.out.println("ENTER 'S' FOR SMALL,'M' FOR MEDIUM,'L' FOR LARGE");
                            size=sc.nextLine();
                            if(size.equalsIgnoreCase("S"))
                                System.out.println("TOTAL COST IS RS."+tot_snck*45);
                            else if(size.equalsIgnoreCase("M"))
                                System.out.println("TOTAL COST IS RS."+tot_snck*55);
                            else if(size.equalsIgnoreCase("L"))
                                System.out.println("TOTAL COST IS RS."+tot_snck*65);
                        }
                        else if(snck>=22 && snck <=23)
                            System.out.println("TOTAL COST IS RS."+tot_snck*40);
                        else if(snck>=24 && snck <=25)
                            System.out.println("TOTAL COST IS RS."+tot_snck*65);
                        else if(snck>=26 && snck <=27)
                            System.out.println("TOTAL COST IS RS."+tot_snck*75);
                        else if(snck==28)
                            System.out.println("TOTAL COST IS RS."+tot_snck*35);
                        else if(snck>=29 && snck <=31)
                            System.out.println("TOTAL COST IS RS."+tot_snck*95);
                        else if(snck==32)
                            System.out.println("TOTAL COST IS RS."+tot_snck*105);//calculating the cost of quick bites section
                    }

                    else
                        System.out.println();
                    System.out.println("<<< STALL 3 >>>");//displaying the items in stall 3
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("************* SECTION : MAIN COURSE *************");
                    System.out.println();
                    System.out.println("33. PAV BHAJI               34. CHANNA BHATURA");
                    System.out.println("35. SCHEZWAN FRIED RICE     36. CHICKEN BIRYANI"); 
                    System.out.println("37. CHICKEN NOODLES");
                    System.out.println();
                    String flagC3=new String();
                    System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
                    flagC3=sc.nextLine();
                    System.out.println();
                    if(flagC3.equalsIgnoreCase("Y"))
                    {
                        System.out.println("CHOOSE YOUR MAIN COURSE BY ENTERING THE NUMBER :");
                        fd=Integer.parseInt(sc.nextLine());
                        if(fd==33 || fd==34)
                            System.out.println("TOTAL COST IS RS."+tot_fd*46);
                        else if(fd==35)
                            System.out.println("TOTAL COST IN RS."+tot_fd*60);
                        else if(fd==36 || fd==37)
                            System.out.println("TOTAL COST IN RS."+tot_fd*86);//calculating the cost of the main course section
                    }
                    System.out.println("<<< STALL 4 >>>");//displaying the items in stall 4
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("*** SECTION : DESERTS ***");
                    System.out.println();
                    System.out.println("38. BANANA CHOCOLATE MOUSSE     39. BANANA CARAMEL PIE");
                    System.out.println("40. CHOCOLATE/WALNUT BROWNIE    41. CHOCOLATE DOUGHNUT");
                    System.out.println("42. MARBEL CAKE                 43. MOCHA MAGIC");
                    System.out.println("44. BLACK FOREST GATEAUX");
                    String flagC4=new String();
                    System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
                    flagC4=sc.nextLine();
                    System.out.println();
                    if(flagC4.equalsIgnoreCase("Y"))
                    {
                        System.out.println("CHOOSE YOUR DESSERT BY ENTERING THE NUMBER");
                        d=Integer.parseInt(sc.nextLine());
                        System.out.println("ENTER THE TOTAL NUMBER OF ITEMS YOU WANT TO BUY");
                        tot_d=Integer.parseInt(sc.nextLine());
                        if(d==38 || d==39)
                            System.out.println("TOTAL COST IN RS."+tot_d*55);
                        else if(d==40 || d==41)
                            System.out.println("TOTAL COST IN RS."+tot_d*45);
                        else if(d==42)
                            System.out.println("TOTAL COST IN RS."+tot_d*60);
                        else if(d==43 || d==44)
                            System.out.println("TOTAL COST IN RS."+tot_d*65);//calculating the cost of the deserts section
                    }
                    else
                        System.out.println();
                    System.out.println("TO QUIT BUYING FOOD ENTER 'Q'");
                    ans1=sc.nextLine();
                }while((ans1.equalsIgnoreCase("Q"))!=true);
                System.out.println("*********************************************************");
                System.out.println();
                System.out.println("<<< CANCELLATION OF TICKETS >>>");
                do
                {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("1. TO CANCEL TICKET");
                    System.out.println("2. TO SKIP PROCESS");
                    System.out.print("ENTER YOUR CHOICE NUMBER :");
                    ch=Integer.parseInt(sc.nextLine());
                    if(ch==1)//cancelling the tickets if the user entered 1
                    {
                        System.out.println("YOU HAVE CHOOSEN TO CANCEL THE TICKETS");
                        flag4=0;
                        {
                            System.out.println("*** TODAYS DATE AND TIME:  "+current_Date);//displaying the current date and time
                            System.out.println("**************************************************************");
                            System.out.println("YOU CANNOT CANCEL YOUR TICKETS FOR ANY SHOW BEFORE THIS DATE");
                            System.out.println("<<< SELECT YOUR CATEGORY TO CANCEL TICKETS >>>");
                            do
                            {
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("** 1.PVR CLASSIC CINEMAS **");
                                System.out.println("** 2.PVR SUPER CLASSIC CINEMAS **");
                                System.out.println();
                                System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE :");
                                catg=Integer.parseInt(sc.nextLine());
                                if((catg==1)||(catg==2))
                                    flag1=0;
                                else
                                {
                                    System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                                    flag1++;
                                }
                            }while(flag1!=0);
                            switch(catg)
                            {
                                case 1:
                                    System.out.println("***************** PVR CLASSIC CINEMAS *********************");
                                    System.out.println();//taking the first case if the user selects PVR classic cinema
                                    System.out.println("<<< SELECT YOUR DATE FOR CANCELLATION >>>");
                                    date=String.valueOf(sc.nextLine());
                                    System.out.println("PLEASE ENTER THE NAME OF THE MOVIE YOU WOULD LIKE TO CANCEL");
                                    movie=sc.nextLine();
                                    System.out.println("PLEASE ENTER THE SHOW TIMINGS");
                                    String shw_time=sc.nextLine();
                                    System.out.println("PLEASE ENTER THE QUANTITY OF TICKETS");
                                    quantity=Integer.parseInt(sc.nextLine());
                                    System.out.println("PLEASE ENTER THE SEAT NUMBER");
                                    seat_no=String.valueOf(sc.nextLine());
                                    System.out.println();
                                    System.out.println("YOUR TICKETS HAVE BEEN SUCCESSFULLY CANCELLED");
                                    break;
                                case 2:
                                    System.out.println("**************** PVR SUPER CLASSIC CINEMAS *****************");
                                    System.out.println();//taking the second case if the user selects PVR super classic cinema
                                    System.out.println("<<< SELECT YOUR DATE FOR CANCELLATION >>>");
                                    date=String.valueOf(sc.nextLine());
                                    System.out.println("PLEASE ENTER THE NAME OF THE MOVIE YOU LIKE TO CANCEL");
                                    movie=sc.nextLine();
                                    System.out.println("PLEASE ENTER THE SHOW TIMINGS");
                                    shw_time=sc.nextLine();
                                    System.out.println("PLEASE ENTER THE QUANTITY OF TICKETS");
                                    quantity=Integer.parseInt(sc.nextLine());
                                    System.out.println("PLEASE ENTER THE SEAT NUMBER");
                                    seat_no=String.valueOf(sc.nextLine());
                                    System.out.println();
                                    System.out.println("YOUR TICKETS HAVE BEEN SUCCESSFULLY CANCELLED");
                                    break;
                            }
                        }
                    }
                    if(ch==2)//continuing if the user chose not to cancel the tickets
                    {
                        System.out.println("** YOU HAVE CHOOSEN NOT TO CANCEL THE TICKETS **");
                        System.out.println("               ** THANK YOU **");
                        flag4=0;
                    }
                    else
                    {
                        System.out.println(" ### INVALID CHOICE ###");
                        flag4++;
                        break;
                    }
                }while(flag4!=0);
            }
            while(ans1.equalsIgnoreCase("Q")!=true);
            System.out.println("WOULD YOU LIKE TO BOOK A TICKET AGAIN ? (Y/N)");
            restart=sc.nextLine();
        }while(restart.equalsIgnoreCase("Y"));//restarting the loop if the user enters 'Y' 
        System.out.println("THANK YOU FOR BOOKING TICKETS");
        System.out.println("HOPE YOU HAVE A GREAT DAY");
    }
}    