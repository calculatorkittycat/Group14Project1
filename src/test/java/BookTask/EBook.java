package BookTask;

public class EBook {

    private String size;
    private final int pages;

    public EBook(String size, int pages) {
        this.size = size;
        this.pages = pages;
    }

    /*
    //______constructor_____________________________________
    public EBook(String size, int pages) {
        setSize(size);
        this.pages = pages;
    }
     */

    //____getters_and_setters_______________________________
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }


    //_____methods___________________________________________
    public void readBook(){
        //System.out.println("book is being read");???
        return;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
