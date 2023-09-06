import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruct> {
    private List<T> fruits = new ArrayList<>();
    
    // Добавление фрукта в коробку
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    
    // Получение веса коробки
    public float getWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }
    
    // Сравнение коробок по весу
    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }
    
    // Пересыпать фрукты в другую коробку
    public void transferFruitsTo(Box<T> otherBox) {
        if (this == otherBox) {
            return; // Нельзя пересыпать фрукты из коробки в саму себя
        }
        
        for (T fruit : fruits) {
            otherBox.addFruit(fruit);
        }
        
        fruits.clear();
    }
}
