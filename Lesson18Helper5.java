public class Lesson18Helper5 {
    private double price;
    private String model;

    public Lesson18Helper5(String model,double price) {
        this.model = model;
        this.price = price;
    }

    public Lesson18Helper5() {
    }
    public String toString(){
        return "Car:"+this.model+" and price: "+this.price;
    }
    public String getModel(){
        this.model = model;
        return model;
    }
    public double getPrice(){
        this.price = price;
        return price;
    }
}


/*
Создайте 5 объектов типа Car
Объект Car должен содержать поля
private double price;
private String model;
и конструктор с этими полями
Сохраните объекты в массив
Распечатайте результат
Результат печати одного авто должен выглядеть: 
Car - BMW, price = 2.3
Применив метод “сортировка пузырьком” отсортируйте массив по стоимости
Распечатайте результат
Применив метод “сортировка пузырьком” отсортируйте массив по модели (первая буква из модели)
Распечатайте результат
 */