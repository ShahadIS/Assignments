public class Q7 {
    public static void main(String[] args) {
        Student [] students=new Student[2];
        students[0]=new Student("Jake",1);
        students[1]=new Student("Jone",2);

        for (int s = 0; s <students.length ; s++) {
            System.out.println(students[s]);
        }


    }
}
