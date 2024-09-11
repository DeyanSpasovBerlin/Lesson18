import java.util.Arrays;

public class Lesson18Main {
    public static void main(String[] args) {
        Lesson18Helper5 help5_1 = new Lesson18Helper5("BMV", 4.0);
        Lesson18Helper5 help5_2 = new Lesson18Helper5("Mercedes", 6.0);
        Lesson18Helper5 help5_3 = new Lesson18Helper5("AUDI", 3.0);
        Lesson18Helper5 help5_4 = new Lesson18Helper5("Porshe", 3.8);
        Lesson18Helper5 help5_5 = new Lesson18Helper5("Jaguar", 5.0);
        System.out.println("InitialArroy:");
        Lesson18Helper5[] carModelPrice = {help5_1, help5_2, help5_3,
                help5_4, help5_5};
        System.out.println(Arrays.toString(carModelPrice));
        System.out.println("******************");
        boolean sorted = false;
        Lesson18Helper5 temp = new Lesson18Helper5();
        Lesson18Helper5[] priceArr = Arrays.copyOf(carModelPrice,carModelPrice.length);
      while (!sorted) {
         sorted = true;
          for (int i = 0; i < priceArr.length - 1; i++) {
              if (priceArr[i].getPrice() > priceArr[i + 1].getPrice()) {
                  temp = priceArr[i];
                  priceArr[i] = priceArr[i + 1];
                  priceArr[i + 1] = temp;
                  sorted = false;
              }
          }
      }
        System.out.println("Final Arroy:");
        System.out.println(Arrays.toString(priceArr));
        System.out.println("***************");
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < carModelPrice.length - 1; i++) {
                if ((carModelPrice[i].getModel()).charAt(0) > (carModelPrice[i + 1].getModel()).charAt(0)) {
                    temp = carModelPrice[i];
                    carModelPrice[i] = carModelPrice[i + 1];
                    carModelPrice[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("Final Arroy:");
        System.out.println(Arrays.toString(carModelPrice));
    }
}
