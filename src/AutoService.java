import java.io.*;
import java.util.*;


public class AutoService {
    public static void main(String[] args) throws IOException {
        File file =new File("customerBase");
        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        try {
            pw = new PrintWriter(new FileWriter(file, true));
            }catch(FileNotFoundException e)
        {
             file = new File("C://Auto Service","customerBase.txt");
        }
        Scanner in = new Scanner(System.in);
        BMV bmv = new BMV();
        Mercedes mercedes = new Mercedes();
        Audi audi = new Audi();
        //Заполняем данные клиента
        Client client = new Client();
        System.out.println("Please enter your personal data: ");
        System.out.print("Name: ");
        client.name = in.next();
        pw.println("Name: "+client.name);
        System.out.print("Phone number: ");
        client.phoneNumber = in.nextInt();
        pw.println("Phone number: "+client.phoneNumber);
        System.out.print("Brand of Car: ");
        client.BrandOfCar = in.next();
        pw.println("Brand of car: "+client.BrandOfCar);
        /*########################################*/
        //Пишем прайс услуг под марку авто для клиента + выбор работ
        String typeOfWorks = new String();
        pw.println("Type of works: ");
        switch (client.BrandOfCar) {
            case "BMV": {
                System.out.print("TO: ");
                System.out.println(bmv.TO());
                System.out.print("Diagnostic: ");
                System.out.println(bmv.Diagnostic());
                System.out.print("Stage: ");
                System.out.println(bmv.Stage());
                System.out.println("Choice what type of work you want please(if you ended, please enter: exit)");
                ArrayList<Integer> typeOfWorksForClientBMV = new ArrayList();
                for (int i = 0; i < 3; i++) {
                    typeOfWorks=in.next();
                    if(typeOfWorks.equals("exit"))
                    {   if(i==0) {
                        pw.println("Don't entered any type of works");
                    }
                        break;
                    }
                    else if(typeOfWorks.equals("TO"))
                    {
                        pw.println("TO");
                        typeOfWorksForClientBMV.add(bmv.TO());
                    }
                    else if(typeOfWorks.equals("Diagnostic"))
                    {   pw.println("Diagnostic");
                        typeOfWorksForClientBMV.add(bmv.Diagnostic());
                    }
                    else if(typeOfWorks.equals("Stage"))
                    {   pw.println("Stage");
                        typeOfWorksForClientBMV.add(bmv.Stage());
                    }
                }
                Integer totalSum=0;
                for(Integer i:typeOfWorksForClientBMV)
                {

                    totalSum+=i;

                }
                if(totalSum!=0) {
                    System.out.println("total sum for works:");
                    pw.println("Total sum  for work: " + totalSum);
                    pw.println("-----------------------------------------------------------------");
                    System.out.println(totalSum);
                }
                break;

            }
            case "Mercedes": {
                System.out.print("TO: ");
                System.out.println(mercedes.TO());
                System.out.print("Diagnostic: ");
                System.out.println(mercedes.Diagnostic());
                System.out.print("Stage: ");
                System.out.println(mercedes.Stage());
                System.out.println("Choice what type of work you want please(if you ended, please enter: exit)");
                ArrayList<Integer> typeOfWorksForClientMercedes = new ArrayList();
                for (int i = 0; i < 3; i++) {
                    typeOfWorks=in.next();
                    if(typeOfWorks.equals("exit"))
                    {   if(i==0) {
                        pw.println("Don't entered any type of works");
                    }
                        break;
                    }
                    else if(typeOfWorks.equals("TO"))
                    {
                        pw.println("TO");
                        typeOfWorksForClientMercedes.add(mercedes.TO());
                    }
                    else if(typeOfWorks.equals("Diagnostic"))
                    {   pw.println("Diagnostic");
                        typeOfWorksForClientMercedes.add(mercedes.Diagnostic());
                    }
                    else if(typeOfWorks.equals("Stage"))
                    {   pw.println("Stage");
                        typeOfWorksForClientMercedes.add(mercedes.Stage());
                    }
                }
                Integer totalSum=0;
                for(Integer i:typeOfWorksForClientMercedes)
                {

                    totalSum+=i;

                }
                if(totalSum!=0) {
                    System.out.println("total sum for works:");
                    pw.println("Total sum  for work: " + totalSum);
                    pw.println("-----------------------------------------------------------------");
                    System.out.println(totalSum);
                }
                break;
            }
            case "Audi": {

                System.out.print("TO: ");
                System.out.println(audi.TO());
                System.out.print("Diagnostic: ");
                System.out.println(audi.Diagnostic());
                System.out.print("Stage: ");
                System.out.println(audi.Stage());
                System.out.println("Choice what type of work you want please(if you ended, please enter: exit)");
                ArrayList<Integer> typeOfWorksForClientAudi = new ArrayList();
                for (int i = 0; i < 3; i++) {
                    typeOfWorks=in.next();
                    if(typeOfWorks.equals("exit"))
                    {   if(i==0) {
                        pw.println("Don't entered any type of works");
                    }
                        break;
                    }
                    else if(typeOfWorks.equals("TO"))
                    {
                        pw.println("TO");
                        typeOfWorksForClientAudi.add(audi.TO());
                    }
                    else if(typeOfWorks.equals("Diagnostic"))
                    {   pw.println("Diagnostic");
                        typeOfWorksForClientAudi.add(audi.Diagnostic());
                    }
                    else if(typeOfWorks.equals("Stage"))
                    {   pw.println("Stage");
                        typeOfWorksForClientAudi.add(audi.Stage());
                    }
                }
                Integer totalSum=0;
                for(Integer i:typeOfWorksForClientAudi)
                {

                    totalSum+=i;

                }
                if(totalSum!=0) {
                    System.out.println("total sum for works:");
                    pw.println("Total sum  for work: " + totalSum);
                    pw.println("-----------------------------------------------------------------");
                    System.out.println(totalSum);
                }
                break;
            }
            default:
                System.out.println("Sorry , but that with that mark we don't work.");
                System.out.println("Anyway, we can repair your auto if it is next brads :BMV , Mercedes, Audi ");
        }

        pw.close();

    }
}

