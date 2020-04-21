import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        SortedDate212List sortedDate212List = new sortedDate212List();
        UnSortedDate212List unsortedDate212List = new unsortedDate212List();

        File file = new File("dates.txt");
        try {
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                String[] data = fileScanner.nextLine().trim().split(",");

                int year = Integer.parseInt(data[0]);

                int month = Integer.parseInt(data[1]);

                int day = Integer.parseInt(data[2]);

                Date212 Date212 = new Date212(year, month, day);

                sortedDate212List.add(Date212);

                unsortedDate212List.add(Date212);

            }
            fileScanner.close();

            new Date212Gui(sortedDate212List, unsortedDate212List);

        } catch (FileNotFoundException e) {

            System.out.println("File not found!");

        } catch (Exception e) {

            System.out.println("Invalid file format!");

        }

    }
}