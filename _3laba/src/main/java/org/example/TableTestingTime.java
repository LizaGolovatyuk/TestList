package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.LinkedList;

public class TableTestingTime {

    private ListTestingTime list1;
    private ListTestingTime list2;

    /**
     * Конструктор, инициализирующий поля list1 и list2
     */
    public TableTestingTime(){
        this.list1=new ListTestingTime(new LinkedList<>());
        this.list2=new ListTestingTime(new ArrayList<>());
    }

    /**
     * Метод, создающий текстовый файл с таблицей, в которой приведены результаты тестированиия методов LinkedList и ArrayList
     */
    public void CreateTable()
    {   String fileName="table.txt";
        try(BufferedWriter writer = Files.newBufferedWriter(Path.of(fileName), StandardOpenOption.TRUNCATE_EXISTING))
        {
            String str,str_count=" "+Integer.toString(this.list1.testingCount);
            Long time;
            while(str_count.length()<29) str_count+=" ";

            writer.write("_______________________________________________________________________________"+'\n');
            writer.write("|   МЕТОД   |  КОЛИЧЕСТВО ВЫЗОВОВ МЕТОДА  |  ВРЕМЯ ВЫПОЛНЕНИЯ В НАНОСЕКУНДАХ  |"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');
            writer.write("|                                   LinkedList                                |"+'\n');
            writer.write("|_____________________________________________________________________________|"+'\n');

            time= list1.AddTestingTime();
            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|    Add    |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');

            time= list1.SetTestingTime();
            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|    Set    |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');

            time= list1.IndexOfTestingTime();
            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|  IndexOf  |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');

            time=list1.GetTestingTime();
            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|    Get    |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');

            time=list1.ContainsTestingTime();
            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|  Contains |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');

            time=list1.RemoveTestingTime();
            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|   Remove  |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');
            writer.write("|                                   ArrayList                                 |"+'\n');
            writer.write("|_____________________________________________________________________________|"+'\n');

            time=list2.AddTestingTime();
            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|    Add    |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');

            time=list2.SetTestingTime();
            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|    Set    |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');

            time=list2.IndexOfTestingTime();
            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|  IndexOf  |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');

            time=list2.GetTestingTime();
            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|    Get    |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');

            time=list2.ContainsTestingTime();
            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|  Contains |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');

            time=list2.RemoveTestingTime();

            str=" "+Long.toString(time);
            while(str.length()<35) str+=" ";

            writer.write("|   Remove  |"+str_count+"|"+str+"|"+'\n');
            writer.write("|___________|_____________________________|___________________________________|"+'\n');
        }
        catch(IOException ex){
          ex.printStackTrace();
        }
    }
}
