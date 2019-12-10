package FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ClassroomImpl {

    final static String dir = "data";
    final static String fileName = "classroom.txt";

    public static void main(String[] args) {

        Path path =  Paths.get(dir, fileName);

        if(!Files.exists(path)){
            try {
                Files.createDirectories(path);
//                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<String> instructors = new ArrayList<>();
        instructors.add("Fer");
        instructors.add("Sophie");
        instructors.add("Vivian");

        try {
            Files.write(path, instructors);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            List<String> lines = Files.readAllLines(path);

            for(String line : lines){
                line = 1+line;
                System.out.println("line.toUpperCase() = " + line.toUpperCase());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
