package uz.gita.kitoblarhaqida.bookdata;

import java.io.Serializable;

public class BookData implements Serializable {
    private final int image;
    private final int authorImage;
    private final int bookName;
    private final int bookAuthorName;
    private final int bookAuthorInfo;
    private final int bookDescription;

    public BookData(int image, int authorImage, int bookName, int bookAuthorName, int bookAuthorInfo, int bookDescription) {
        this.image = image;
        this.authorImage = authorImage;
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookAuthorInfo = bookAuthorInfo;
        this.bookDescription = bookDescription;
    }

    // Getters
    public int getImage() {
        return image;
    }

    public int getAuthorImage() {
        return authorImage;
    }

    public int getBookName() {
        return bookName;
    }

    public int getBookAuthorName() {
        return bookAuthorName;
    }

    public int getBookDescription() {
        return bookDescription;
    }

    public int getBookAuthorInfo() {
        return bookAuthorInfo;
    }
}
