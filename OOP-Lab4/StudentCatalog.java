import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Class Student
 *
 * @version 1.0 14/02/19
 *
 * @author Jack Shendrikov
 */


public class StudentCatalog {
    static class Student {
        private String firstname;
        private String lastname;
        private int age;
        private int course;
        private String group;

        /**
         * @param firstname student`s firstname
         * @param lastname student`s lastname
         * @param age student`s age
         * @param course number of course
         * @param group number of group
         */

        Student(String firstname, String lastname, int age, int course, String group) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.course = course;
            this.group = group;
        }
    }

    /**
     * @return sorted list of students by name
     */

    static class SortName implements Comparator < Student > {
        public int compare(Student s1, Student s2) {
            int ret = s1.firstname.compareToIgnoreCase(s2.firstname);
            if (ret == 0) {
                return s1.lastname.compareToIgnoreCase(s2.lastname);
            }
            return ret;
        }
    }

    /**
     * @return sorted list of students by lastname
     */
    static class SortLastName implements Comparator < Student > {
        public int compare(Student s1, Student s2) {
            int ret = s1.lastname.compareToIgnoreCase(s2.lastname);
            if (ret == 0) {
                return s1.firstname.compareToIgnoreCase(s2.firstname);
            }
            return ret;
        }
    }

    /**
     * @return sorted list of students by group
     */
    static class SortGroup implements Comparator < Student > {
        public int compare(Student s1, Student s2) {
            int ret = s1.group.compareToIgnoreCase(s2.group);
            if (ret == 0) {
                return s1.group.compareToIgnoreCase(s2.group);
            }
            return ret;
        }
    }

    /**
     * @return sorted list of students by age
     */
    static class SortAge implements Comparator < Student > {
        public int compare(Student s1, Student s2) {
            return s1.age - s2.age;
        }
    }

    /**
     * @return sorted list of students by course
     */
    static class SortCourse implements Comparator < Student > {
        public int compare(Student s1, Student s2) {
            return s1.course - s2.course;
        }
    }

    static class AddStudent {
        AddStudent(LinkedList < Student > student, ResourceBundle rd) {
            Scanner in = new Scanner(System.in);
            System.out.print(rd.getString("addQuestion"));
            int m = in .nextInt();

            for (int i = 0; i < m; i++) {
                System.out.print(rd.getString("addName"));
                Pattern namePattern = Pattern.compile(rd.getString("addNameRegex"));
                String name = in .next();
                if (!namePattern.matcher(name).matches()) {
                    System.out.println(rd.getString("addNameException"));
                    break;
                }

                System.out.print(rd.getString("addLastName"));
                Pattern lastNamePattern = Pattern.compile(rd.getString("addLastNameRegex"));
                String last = in .next();
                if (!lastNamePattern.matcher(last).matches()) {
                    System.out.println(rd.getString("addLastNameException"));
                    break;
                }

                System.out.print(rd.getString("addAge"));
                Pattern agePattern = Pattern.compile(rd.getString("addAgeRegex"));
                int age = in .nextInt();
                if (!agePattern.matcher(String.valueOf(age)).matches()) {
                    System.out.println(rd.getString("addAgeException"));
                    break;
                }

                System.out.print(rd.getString("addCourse"));
                Pattern coursePattern = Pattern.compile(rd.getString("addCourseRegex"));
                int course = in .nextInt();
                if (!coursePattern.matcher(String.valueOf(course)).matches()) {
                    System.out.println(rd.getString("addCourseException"));
                    break;
                }

                System.out.print(rd.getString("addGroup"));
                Pattern groupPattern = Pattern.compile(rd.getString("addGroupRegex"));
                String group = in .next();
                if (!groupPattern.matcher(group).matches()) {
                    System.out.println("addGroupException");
                }
                System.out.println();
                student.add(new Student(name, last, age, course, group));
            }
        }
    }

    /**
     * Read StudentsList Info
     */
    static class ReadStudentsList{
        ReadStudentsList(LinkedList <Student> students, String path){
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(path));
                String line = reader.readLine();
                while (line != null) {
                    String[] studentsInfo = line.split(",");
                    students.add(new Student(studentsInfo[0], studentsInfo[1], Integer.parseInt(studentsInfo[2]), Integer.parseInt(studentsInfo[3]), studentsInfo[4]));
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("\nError while reading file!\n");
            }
        }
    }

    /**
     * Displays sorted data in a stylized form in the console
     */
    static class Output {
        Output(LinkedList <Student> student, ResourceBundle rd) {
            System.out.println(new String(new char[53]).replace("\0", "—"));
            System.out.printf("%-10s%-11s%-5s%-8s%-14s%-10s%-11s%-5s%-8s%-15s\n",
                    rd.getString("nameVal"),
                    rd.getString("lastNameVal"),
                    rd.getString("ageVal"),
                    rd.getString("courseVal"),
                    rd.getString("groupVal") + "    ⎜",

                    rd.getString("nameVal"),
                    rd.getString("lastNameVal"),
                    rd.getString("ageVal"),
                    rd.getString("courseVal"),
                    rd.getString("groupVal") + "  ⎜");

            for (int i = student.size(); i > 0; i--) {
                System.out.printf("%-10s%-11s%-5d%-8d%-14s%-10s%-11s%-5d%-8d%-15s\n",
                        student.get(i - 1).firstname,
                        student.get(i - 1).lastname,
                        student.get(i - 1).age,
                        student.get(i - 1).course,
                        student.get(i - 1).group + "    ⎜",

                        student.get(student.size() - i).firstname,
                        student.get(student.size() - i).lastname,
                        student.get(student.size() - i).age,
                        student.get(student.size() - i).course,
                        student.get(student.size() - i).group + "  ⎜");
            }
            System.out.println(new String(new char[53]).replace("\0", "—"));
        }
    }

    /**
     * Displays a list of students in the console
     */
    static class StudentsList {
        StudentsList(LinkedList <Student> student, ResourceBundle rd) {
            System.out.printf("\n%28s\n", rd.getString("studentList"));
            System.out.println(new String(new char[28]).replace("\0", "—"));
            System.out.printf("%-13s%-13s%-5s%-7s %-15s\n", "⎜  " +
                    rd.getString("nameVal"),
                    rd.getString("lastNameVal"),
                    rd.getString("ageVal"),
                    rd.getString("courseVal"),
                    rd.getString("groupVal")+"   ⎜");

            for (int i = student.size(); i > 0; i--) {
                System.out.printf("%-13s%-13s%-5d%-7d%-15s\n", "⎜  " +
                        student.get(i - 1).firstname,
                        student.get(i - 1).lastname,
                        student.get(i - 1).age,
                        student.get(i - 1).course,
                        student.get(i - 1).group + "   ⎜");
            }
            System.out.println(new String(new char[28]).replace("\0", "—"));
        }
    }

    /**
     * General interface settings
     */
    static class Interface {
        Interface(ResourceBundle rd) {
            System.out.println();
            System.out.printf("%64s\n", rd.getString("title"));
            System.out.println(new String(new char[66]).replace("\0", "—"));
            System.out.printf("%s%-6s%-33s%s%-6s%-27s%s%-6s%-21s%s\n", "⎜   ",
                    "[1]", rd.getString("addStudent"), "⎜   ",
                    "[4]", rd.getString("sortFull"), "⎜   ",
                    "[7]", rd.getString("sortAge"), "⎜");

            System.out.printf("%s%-6s%-33s%s%-6s%-27s%s%-6s%-21s%s\n", "⎜   ",
                    "[2]", rd.getString("removeStudent"), "⎜   ",
                    "[5]", rd.getString("sortName"), "⎜   ",
                    "[8]", rd.getString("sortCourse"), "⎜");

            System.out.printf("%s%-6s%-33s%s%-6s%-27s%s%-6s%-21s%s\n", "⎜   ",
                    "[3]", rd.getString("showListStudent"), "⎜   ",
                    "[6]", rd.getString("sortLastName"), "⎜   ",
                    "[9]", rd.getString("sortGroup"), "⎜");

            System.out.printf("%s%-6s%-33s%68s\n", "⎜   ", "[0]", rd.getString("zeroValue"), "⎜");
            System.out.println(new String(new char[66]).replace("\0", "—"));
        }
    }


    public static void main(String[] args) {
        LinkedList < Student > students = new LinkedList < > ();
        int option;
        ResourceBundle rd;
        System.out.println("Оберіть мову / Choose language: ");
        System.out.println("\t1 - українська");
        System.out.println("\t2 - english");
        System.out.print("Ваш вибір / Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        if (a.equals("1")) {
            Locale ukrainian = new Locale("ua", "UA");
            rd = ResourceBundle.getBundle(SampleRB_ua.class.getName(), ukrainian);
            String pathToStudentList =  System.getProperty("user.dir") + "studentsUA.txt";
            new ReadStudentsList(students, pathToStudentList);
        } else {
            rd = ResourceBundle.getBundle(SampleRB_en.class.getName(), Locale.ENGLISH);
            String pathToStudentList = System.getProperty("user.dir") + "studentsEN.txt";
            new ReadStudentsList(students, pathToStudentList);
        }


        new Interface(rd);

        while (true) {
            Scanner in = new Scanner(System.in);
            try {
                System.out.print(rd.getString("chooseOption"));
                option = in .nextInt();
            } catch (InputMismatchException e) {
                throw new InputMismatchException(rd.getString("validate"));
            }

            switch (option) {
                case 1:
                    new AddStudent(students, rd);
                    new Interface(rd);

                    break;
                case 2:
                    String stName, stLastName, stGroup;
                    System.out.println(rd.getString("removeStatement"));

                    System.out.println(rd.getString("removeName"));
                    stName = in .next();

                    System.out.println(rd.getString("removeLastName"));
                    stLastName = in .next();

                    System.out.println(rd.getString("removeGroup"));
                    stGroup = in .next();

                    students.removeIf(data -> (data.firstname.equals(stName) &&
                            data.lastname.equals(stLastName) &&
                            data.group.equals(stGroup)));

                    System.out.printf("\n%50s\n", rd.getString("refreshList"));
                    new Output(students, rd);
                    new Interface(rd);

                    break;
                case 3:
                    new StudentsList(students, rd);
                    new Interface(rd);
                    break;
                case 4:
                    students.sort(new SortName());
                    System.out.println(new String(new char[53]).replace("\0", "—"));
                    System.out.printf("  %-41s%-5s%-41s%s\n",
                            rd.getString("sortName") + rd.getString("sortDescending"), "⎜",
                            rd.getString("sortName") + rd.getString("sortAscending"), "⎜");
                    new Output(students, rd);

                    students.sort(new SortLastName());
                    System.out.printf("  %-41s%-5s%-41s%s\n",
                            rd.getString("sortLastName") + rd.getString("sortDescending"), "⎜",
                            rd.getString("sortLastName") + rd.getString("sortAscending"), "⎜");
                    new Output(students, rd);

                    students.sort(new SortAge());
                    System.out.printf("  %-41s%-5s%-41s%s\n",
                            rd.getString("sortAge") + rd.getString("sortDescending"), "⎜",
                            rd.getString("sortAge") + rd.getString("sortAscending"), "⎜");
                    new Output(students, rd);

                    students.sort(new SortCourse());
                    System.out.printf("  %-41s%-5s%-41s%s\n",
                            rd.getString("sortCourse") + rd.getString("sortDescending"), "⎜",
                            rd.getString("sortCourse") + rd.getString("sortAscending"), "⎜");
                    new Output(students, rd);

                    students.sort(new SortGroup());
                    System.out.printf("  %-41s%-5s%-41s%s\n",
                            rd.getString("sortGroup") + rd.getString("sortDescending"), "⎜",
                            rd.getString("sortGroup") + rd.getString("sortAscending"), "⎜");
                    new Output(students, rd);
                    new Interface(rd);
                    break;
                case 5:
                    students.sort(new SortName());
                    System.out.println(new String(new char[51]).replace("\0", "—"));
                    System.out.printf("  %-41s%-5s%-41s%s\n",
                            rd.getString("sortName") + rd.getString("sortDescending"), "⎜",
                            rd.getString("sortName") + rd.getString("sortAscending"), "⎜");
                    new Output(students, rd);
                    new Interface(rd);
                    break;
                case 6:
                    students.sort(new SortLastName());
                    System.out.println(new String(new char[53]).replace("\0", "—"));
                    System.out.printf("  %-41s%-5s%-41s%s\n",
                            rd.getString("sortLastName") + rd.getString("sortDescending"), "⎜",
                            rd.getString("sortLastName") + rd.getString("sortAscending"), "⎜");
                    new Output(students, rd);
                    new Interface(rd);
                    break;
                case 7:
                    students.sort(new SortAge());
                    System.out.println(new String(new char[53]).replace("\0", "—"));
                    System.out.printf("  %-41s%-5s%-41s%s\n",
                            rd.getString("sortAge") + rd.getString("sortDescending"), "⎜",
                            rd.getString("sortAge") + rd.getString("sortAscending"), "⎜");
                    new Output(students, rd);
                    new Interface(rd);
                    break;
                case 8:
                    students.sort(new SortCourse());
                    System.out.println(new String(new char[53]).replace("\0", "—"));
                    System.out.printf("  %-41s%-5s%-41s%s\n",
                            rd.getString("sortCourse") + rd.getString("sortDescending"), "⎜",
                            rd.getString("sortCourse") + rd.getString("sortAscending"), "⎜");
                    new Output(students, rd);
                    new Interface(rd);
                    break;
                case 9:
                    students.sort(new SortGroup());
                    System.out.println(new String(new char[53]).replace("\0", "—"));
                    System.out.printf("  %-41s%-5s%-41s%s\n",
                            rd.getString("sortGroup") + rd.getString("sortDescending"), "⎜",
                            rd.getString("sortGroup") + rd.getString("sortAscending"), "⎜");
                    new Output(students, rd);
                    new Interface(rd);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
