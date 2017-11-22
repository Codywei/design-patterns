package Iterator.Sample;
/**
 * 具体的迭代器
 * */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    public boolean hasNext() {//判断当前元素是否为空（确认能否使用next方法）
        if (index < bookShelf.getLength()) {//判断index是否小于数组长度
            return true;
        } else {
            return false;
        }
    }
    public Object next() {//该方法作用是返回当前元素，并指向下一个元素
        Book book = bookShelf.getBookAt(index);//如果Bookshelf的getBookAt方法改变，那这个next方法也要修改
        index++;
        return book;
    }
}
