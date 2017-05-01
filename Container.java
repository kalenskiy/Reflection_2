package Task2;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

@SaveTo(path = "C:\\1.txt")
public class Container {
    private String text;

    public Container(String text){
        this.text = text;
    }
    @Saver
    public void save(String path) throws IOException {
        try(RandomAccessFile raf = new RandomAccessFile(path, "rw")){
            raf.writeUTF(text);
        }
    }
}
