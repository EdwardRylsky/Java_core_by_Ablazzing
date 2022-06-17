package Homework2;

/*
// Дано:
boolean hasFuel = true;
boolean hasElectricsProblem = false;
boolean hasMotorProblem = false;
boolean hasTransmissionProblem = true;
boolean hasWheelsProblem = true;
// В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
// Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
// Если у машины проблема с двигателем, то чинят и берут 10 000.
// Если у машины проблема с электрикой, то чинят и берут 5000.
// Если у машины проблема с коробкой передач, то чинят и берут 4000.
// Если у машины проблема с колесами, то чинят и берут 2000.
// Если две детали сломаны, то на общий счет идет скидка 10%.
// Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
// Если нет бензина и что-то сломано, то за консультацию денег не берут.
// Ситуации, что бензин есть и ничего не сломано - быть не может.
// Ожидаемый результат: выведен на экран счет клиенту.
 */

public class Task3Advanced {
    public static void main(String[] args) {
        boolean hasFuel = true;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = false;

        final double FIX_MOTOR_PROBLEM_PRICE = 10_000;
        final double FIX_ELECTRICS_PROBLEM_PRICE = 5_000;
        final double FIX_TRANSMISSION_PROBLEM_PRICE = 4_000;
        final double FIX_WHEELS_PROBLEM_PRICE = 2_000;

        int problemCounter = 0;
        double totalFixPrice = 0.0;
        double discount = 1.0;

        if (hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem) {
            if (hasMotorProblem) {
                totalFixPrice += FIX_MOTOR_PROBLEM_PRICE;
                problemCounter++;
            }
            if (hasElectricsProblem) {
                totalFixPrice += FIX_ELECTRICS_PROBLEM_PRICE;
                problemCounter++;
            }
            if (hasTransmissionProblem) {
                totalFixPrice += FIX_TRANSMISSION_PROBLEM_PRICE;
                problemCounter++;
            }
            if (hasWheelsProblem) {
                totalFixPrice += FIX_WHEELS_PROBLEM_PRICE;
                problemCounter++;
            }
            if (problemCounter > 1) {
                discount -= .1;
            }

            if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
                discount -= .2;
            }

            totalFixPrice *= discount;

            System.out.printf("С вас %.2f рублей за работу", totalFixPrice);

        } else if (!hasFuel) {
            System.out.println("С вас 1000 рублей за консультацию");
        } else {
            System.out.println("Это невозможно!");
        }
    }
}
