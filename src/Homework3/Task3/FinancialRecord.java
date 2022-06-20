package Homework3.Task3;

// 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
// 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
// 3. Создать 10 отчетов, с разными доходами и расходами (Смотри класс new Random(1).nextInt() )
// 4. Записать в файл "report.txt" все данные из отчетов.
// 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
// Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FinancialRecord {
    private double incomes;
    private double outcomes;

    public FinancialRecord(double incomes, double outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public double getIncomes() {
        return incomes;
    }

    public void setIncomes(double incomes) {
        this.incomes = incomes;
    }

    public double getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(double outcomes) {
        this.outcomes = outcomes;
    }

    @Override
    public String toString() {
        return  "доходы = " + incomes +
                ", расходы = " + outcomes;
    }


    public static void main(String[] args) throws Exception {
        final String FILE_PATH = "C:\\Users\\Edward\\IdeaProjects\\Java_core_by_Ablazzing\\resource\\report.txt";

        //пишем 10 рандомных отчетов в файл
        writeReportsToFile(FILE_PATH, 10);

        //читаем созданные отчеты из файла в список
        List<String> reportsList = new ArrayList<>();
        readFile(FILE_PATH, reportsList);

        //считаем итоги
        calculateTotalAmount(reportsList);
    }

    public static void writeToFile(String filePath, FinancialRecord financialRecord) throws Exception {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(financialRecord.toString());
            fileWriter.write("\n");
        }
    }

    public static void readFile(String filePath, List<String> list) throws Exception{
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            while (reader.ready()) {
                list.add(reader.readLine());
            }
        }
    }

    public static void writeReportsToFile(String filePath, int numberReports) throws Exception {
        for (int i = 0; i < numberReports; i++) {
            writeToFile(filePath, new FinancialRecord(Math.round(Math.random() * 10_000 * 100) / 100.0, Math.round(Math.random() * 10_000 * 100) / 100.0));
        }
    }

    public static void calculateTotalAmount(List<String> reportsList) {
        double totalIncomes = 0;
        double totalOutcomes = 0;

        for (String report : reportsList) {
            String results = report.replaceAll("[^0-9.,]", "");
            String[] resultsSplit = results.split(",");

            totalIncomes += Double.parseDouble(resultsSplit[0]);
            totalOutcomes += Double.parseDouble(resultsSplit[1]);
        }

        System.out.printf("общие доходы — %.2f, общие расходы — %.2f", totalIncomes, totalOutcomes);
    }
}