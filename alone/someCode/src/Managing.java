import java.io.IOException;

public interface Managing {
    abstract void chooseHeadOfGroup(int ammountStudents);
    abstract void makeGroup() throws IOException;
    abstract void addStudent() throws IOException;
    abstract void removeStudent() throws IOException;
    abstract String getHead();
}
