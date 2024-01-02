public class Student {
    String Name;
    int ID;

    public Student(String name, int id) {
        this.Name = name;
        this.ID = id;
    }

    @Override
    public String toString() {
        return "" +
                "Name='" + Name + '\'' +
                ", ID=" + ID
                ;
    }

    public String getName() {
        return Name;

    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

