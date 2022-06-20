package Homework3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task2 {
    public static void main(String[] args) throws Exception{

        StringBuilder result = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Edward\\IdeaProjects\\Java_core_by_Ablazzing\\resource\\my_first_file.txt"))){
            while (reader.ready()) {
                result.append(reader.readLine()).append(" ");
            }
        }
        System.out.println(result);
    }
}
