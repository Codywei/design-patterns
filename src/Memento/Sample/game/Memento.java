package Memento.Sample.game;
import java.util.*;
/**
 * 纪念品，快照
 * */
public class Memento {
    int money;                              // 所持金钱
    ArrayList fruits;                       // 当前获得的水果
    public int getMoney() {                 // 获取当前所持金钱（narrow interface），提供给Main有限的信息
        return money;
    }
    Memento(int money) {                    // 构造函数(wide interface)，提供给Gamer详细的内部信息
        this.money = money;
        this.fruits = new ArrayList();
    }
    void addFruit(String fruit) {           // 添加水果(wide interface)
        fruits.add(fruit);
    }
    List getFruits() {                      // 获取当前所持所有水果（wide interface）
         return (List)fruits.clone();
    }
}
