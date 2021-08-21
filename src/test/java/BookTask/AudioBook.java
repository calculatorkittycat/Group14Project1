package BookTask;

public class AudioBook extends Book {

    private int length;
    private final String narrator;

    //__________constructor______________
    public AudioBook(String title, String type, String author, int length, String narrator) {
        super(title, type, author);
        this.length = length;
        this.narrator = narrator;
    }

    /*
    //__________constructor______________
    public AudioBook(int length, String narrator) {
        setLength(length);
        this.narrator = narrator;
    }
     */

    //_________getters_and_setters_______

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    //_________methods____________

    public void listen(){
        //System.out.println("audio book is playing");??
        return;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
