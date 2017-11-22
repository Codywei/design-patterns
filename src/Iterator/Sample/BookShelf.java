package Iterator.Sample;
/**
 * 具体的集合
 * */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }//这里在带入参数后数组大小无法变化
    public Book getBookAt(int index) {
        return books[index];
    }
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    public int getLength() {
        return last;
    }

    public Iterator iterator() {//用于返回具体的迭代器实例（将迭代器的实现与集合（角色）分离），方便实现所中迭代器
        return new BookShelfIterator(this);
    }
}
