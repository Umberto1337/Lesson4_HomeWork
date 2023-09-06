public class Program {
    public static void main(String[] args) {
        // Создаем коробки с фруктами
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        
        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        
        // Вес коробок
        System.out.println("Вес коробки с яблоками 1: " + appleBox1.getWeight());
        System.out.println("Вес коробки с апельсинами 1: " + orangeBox1.getWeight());
        System.out.println("Вес коробки с яблоками 2: " + appleBox2.getWeight());
        
        // Сравнение коробок
        System.out.println("Сравнение коробок с яблоками 1 и апельсинами 1: " + appleBox1.compare(orangeBox1));
        System.out.println("Сравнение коробок с апельсинами 2 и яблоками 2: " + orangeBox2.compare(appleBox2));
        
        // Пересыпаем Яблоки
        appleBox1.transferFruitsTo(appleBox2);
        
        System.out.println("Вес коробки с яблоками 1 после пересыпки: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками 2 после пересыпки: " + appleBox2.getWeight());

        // Пересыпаем Апельсины
        orangeBox1.transferFruitsTo(orangeBox2);
        
        System.out.println("Вес коробки с яблоками 1 после пересыпки: " + orangeBox1.getWeight());
        System.out.println("Вес коробки с яблоками 2 после пересыпки: " + orangeBox2.getWeight());
    }
}
