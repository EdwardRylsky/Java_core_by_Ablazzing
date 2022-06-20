package Homework3.Task3;

// 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
// 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
// 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
// 4. Записать в файл "report.txt" данные из объекта класса.
// Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы 300

import java.io.FileWriter;

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
                ", расходы = " + outcomes +
                '}';
    }

    public static void main(String[] args) throws Exception {
        final FinancialRecord financialRecord = new FinancialRecord(500, 300);

        try (FileWriter fileWriter = new FileWriter("C:\\Users\\Edward\\IdeaProjects\\Java_core_by_Ablazzing\\resource\\report.txt")){
            fileWriter.write(financialRecord.toString());
        }
    }
}