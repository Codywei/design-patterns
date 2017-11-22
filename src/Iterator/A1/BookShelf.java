package Iterator.A1;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList books;   
    public BookShelf(int initialsize) {         
        this.books = new ArrayList(initialsize);  //这里的数组长度是可以变化的
    }                                           
    public Book getBookAt(int index) {
        return (Book)books.get(index);          
    }
    public void appendBook(Book book) {
        books.add(book);                        
    }
    public int getLength() {
        return books.size();   //可以方便的直接获取长度
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
