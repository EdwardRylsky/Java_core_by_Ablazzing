package Module1.Homework3;

/*
Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц, 2012 - год
Внутри файла следующий формат:
pyterochka;122300.20;100312.10;20/01/2012
pyterochka;299922.00;323333.02;21/01/2012
perekrestok;9920.20;28200.01;21/01/2012
Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции
Читать файлы нужно через
String path = Module1.Homework3.class.getClassLoader().getResource("report_03_2012.txt").getPath();
        URI path1 = Module1.Homework3.class.getClassLoader().getResource("").toURI();
        Files.walk(Path.of(path1)).forEach(e -> System.out.println(e.toString()));


Задача №1
Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
Формат ожидаемого результат:
Прибыль по магазину pyterochka по месяцам
01.2012: 20000.00
02.2012: -100332.00
и тд


Задача №2
Необходим составить отчет о расходах всех магазинов за весь период по магазинам (т.е. прочитать все файлы внутри папки)
Формат ожидаемого результат:
Расходы pyterochka за весь период: 20032220.00
Расходы perekrestok за весь период: 1734220.00
.. и тд
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TasksExpert {
    public static void main(String[] args) throws Exception{
        final String DIRECTORY_PATH = "C:\\Users\\Edward\\IdeaProjects\\Java_core_by_Ablazzing\\resource\\";
        final String FILE_MASK = "report_\\d{2}_\\d{4}.txt";
        final String STORE_NAME = "pyterochka";

        //получаем список подходящих файлов
        List<File> needFilesList = readFilesFromDirByMask(DIRECTORY_PATH, FILE_MASK);

        //Task 1 рассчитываем прибыль по месяцам по магазину pyterochka
        calculateStoreProfitByAllReports(needFilesList, STORE_NAME);

        //Task 2 рассчитываем расходы каждого магазина за весь период
        calculateAllStoreLostByReports(needFilesList);
    }

    private static void calculateAllStoreLostByReports(List<File> needFileNamesList) throws Exception{
        Map<String, Double> storeLost = new HashMap<>();
        for (File file : needFileNamesList) {

            List<String> operationsList = readOperations(file);

            for (String operation : operationsList) {
                String[] resultsSplit = operation.split(";");

                String storeName = resultsSplit[0];
                double outcomes = Double.parseDouble(resultsSplit[2]);

                if (storeLost.containsKey(storeName)) {
                    storeLost.put(storeName, storeLost.get(storeName) + outcomes);
                } else storeLost.put(storeName, outcomes);
            }
        }

        for (String store : storeLost.keySet()) {
            System.out.printf("Расходы %s за весь период: %.2f руб.", store, storeLost.get(store));
            System.out.println();
        }
    }

    private static void calculateStoreProfitByAllReports(List<File> files, String store_name) throws Exception{
        System.out.printf("Прибыль по магазину %s по месяцам:", store_name);
        System.out.println();
        for (File file : files) {
            calculateStoreProfitByReport(file, store_name);
        }
    }

    //pyterochka;299922.00;323333.02;21/01/2012
    private static void calculateStoreProfitByReport(File file, String store_name) throws Exception {
        double totalIncomes = 0;
        double totalOutcomes = 0;
        String currentMonth =  file.getName().substring(7, 14).replace('_', '.');

        List<String> storeOperationsList = readStoreOperations(file, store_name);

        for (String operation : storeOperationsList) {
                String[] resultsSplit = operation.split(";");

                totalIncomes += Double.parseDouble(resultsSplit[1]);
                totalOutcomes += Double.parseDouble(resultsSplit[2]);
        }

        System.out.printf("%s : %.2f", currentMonth, (totalIncomes - totalOutcomes));
        System.out.println();
    }

    private static List<String> readOperations(File file) throws Exception {
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String newLine = reader.readLine();

                if (!newLine.startsWith("магазин;")) {
                    result.add(newLine);
                }
            }
        }

        return result;
    }

    private static List<String> readStoreOperations(File file, String store_name) throws Exception {
        List<String> resultsTemp = readOperations(file);

        List<String> result = new ArrayList<>();

        for (String resultTemp : resultsTemp) {
            if (resultTemp.startsWith(store_name)) {
                result.add(resultTemp);
            }
        }
        return result;
    }

    private static List<File> readFilesFromDirByMask(String directoryPath, String regex) {
        List<File> result = new ArrayList<>();

        File directory = Paths.get(directoryPath).toFile();

        for (final File fileEntry : directory.listFiles()) {
            if (!fileEntry.isDirectory()) {
                if (fileEntry.getName().matches(regex)) {
                    result.add(fileEntry);
                }
            }
        }
        return result;
    }
}
