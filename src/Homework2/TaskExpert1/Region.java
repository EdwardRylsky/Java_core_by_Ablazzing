package Homework2.TaskExpert1;

/*
Входящие данные
 Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
 out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
 { 1 : {
      "out" : ["К474СЕ178"],
      "input": ["А222РТ178"]
    },
   2 : {
        "out" : ["К722АВ12", "А222РТ178"],
        "input" : ["М001АВ01", "А023РВ73"],
   }
 ..
  }
Составить топ-5 популярных регионов (куда больше всего въехали).
Сделать аналитическую раскладку: машины какого региона больше всего въезжали в этот топ-5.
Ожидаемый результат:
ТОП-5: 98, 178, 01, 22, 33
98 - больше всего въехало с номерами 178: 23 машины
178 - больше всего въехало с номера 98: 50 машин
01 - больше всего въехало с номера 178: 11 машин
22 - больше всего въехало с номера 01: 30 машин
33 - больше всего въехало с номера 12: 100 машин
 */

import java.util.*;

public class Region {

    final private int regionNumber;
    final private String[] inputCarsArray;

    public Region(int regionNumber, String[] inputCarsArray) {
        this.regionNumber = regionNumber;
        this.inputCarsArray = inputCarsArray;
    }

    public String[] getInputCarsArray() {
        return inputCarsArray;
    }

    //больше всего въехало машин numberCars с номерами numberRegion
    public static String findTopInputRegion(Region region) {
        StringBuilder result = new StringBuilder("больше всего въехало машин ");

        Map<Integer, Integer> inputCarsByRegionCounter = new HashMap<>();
        String[] inputCarsArray = region.getInputCarsArray();
        int maxCarAmount = 0;
        int regionWithMaxCarAmount = 0;

        //собираю мапу вида регион : количество въехавших машин из этого региона
        for (int i = 0; i < region.inputCarsArray.length; i++) {
            int regionInputCar = Integer.parseInt(inputCarsArray[i].substring(6));
            if (inputCarsByRegionCounter.containsKey(regionInputCar)) {
                inputCarsByRegionCounter.put(regionInputCar, inputCarsByRegionCounter.get(regionInputCar) + 1);
            } else {
                inputCarsByRegionCounter.put(regionInputCar, 1);
            }
        }

        //ищу топ1 регион из которого, больше всего въехало машин
        for (int inputCarsByRegionCount : inputCarsByRegionCounter.keySet()) {
            if (inputCarsByRegionCounter.get(inputCarsByRegionCount) > maxCarAmount) {
                maxCarAmount = inputCarsByRegionCounter.get(inputCarsByRegionCount);
                regionWithMaxCarAmount = inputCarsByRegionCount;
            }
        }

        result.append(maxCarAmount).append(" с номерами ").append(regionWithMaxCarAmount);

        return result.toString();
    }

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("ТОП-5: ");

        Map<Integer, Map<String, String[]>> statisticsRegions = GeneratorExpertHomework.getData();
        List<Region> regionList = new ArrayList<>();


        for (Integer regionNumber : statisticsRegions.keySet()) {
            regionList.add(new Region(regionNumber, statisticsRegions.get(regionNumber).get("input")));
        }

        //сортируем список регионов по убыванию
        regionList.sort(new Comparator<>() {
            @Override
            public int compare(Region o1, Region o2) {
                return o2.inputCarsArray.length - o1.inputCarsArray.length;
            }
        });

        //формируем первую строку результата
        for (int i = 0; i < 5; i++) {
            result.append(regionList.get(i).regionNumber);
            if (i != 4) {
                result.append(", ");
            }
        }
        result.append("\n");

        //формируем строки вида: "98 - больше всего въехало машин 23 с номерами 178"
        for (int i = 0; i < 5; i++) {
            result.append(regionList.get(i).regionNumber).append(" - ").append(findTopInputRegion(regionList.get(i))).append("\n");
        }

        System.out.println(result);
    }
}
