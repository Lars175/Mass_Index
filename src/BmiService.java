public class BmiService {
        public double calculate(int Weight, int Height) {
            double BMI = Weight/((Height/100)^2);
        return BMI;
    }

}


