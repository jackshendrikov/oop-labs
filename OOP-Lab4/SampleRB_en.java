import java.util.ListResourceBundle;

public class SampleRB_en extends ListResourceBundle {
    protected Object[][] getContents(){
        Object[][] resources = new Object[42][2];
        resources[0][0] = "title";
        resources[0][1] = "CLASS STUDENT";

        resources[1][0] = "addStudent";
        resources[1][1] = "Add new student";

        resources[2][0] = "removeStudent";
        resources[2][1] = "Remove student info";

        resources[3][0] = "showListStudent";
        resources[3][1] = "Display the list of students";

        resources[4][0] = "sortFull";
        resources[4][1] = "Complete sorting";

        resources[5][0] = "sortName";
        resources[5][1] = "Sort by name ";

        resources[6][0] = "sortLastName";
        resources[6][1] = "Sort by last name";

        resources[7][0] = "sortAge";
        resources[7][1] = "Sort by age ";

        resources[8][0] = "sortCourse";
        resources[8][1] = "Sort by course ";

        resources[9][0] = "sortGroup";
        resources[9][1] = "Sort by group ";

        resources[10][0] = "zeroValue";
        resources[10][1] = "Exit";

        resources[11][0] = "addQuestion";
        resources[11][1] = "How much students you want to add? ";

        resources[12][0] = "addName";
        resources[12][1] = "Enter a name (at least 2 letters) - ";

        resources[13][0] = "addLastName";
        resources[13][1] = "Enter a surname (at least 2 letters) - ";

        resources[14][0] = "addAge";
        resources[14][1] = "Enter age (0-100) - ";

        resources[15][0] = "addCourse";
        resources[15][1] = "Enter course (1-6) - ";

        resources[16][0] = "addGroup";
        resources[16][1] = "Enter group (format - XX-99) - ";

        resources[17][0] = "addNameException";
        resources[17][1] = "\tThe name is not in the correct format!";

        resources[18][0] = "addLastNameException";
        resources[18][1] = "\tThe surname is not in the correct format!";

        resources[19][0] = "addAgeException";
        resources[19][1] = "\tAge is not in the correct format!";

        resources[20][0] = "addCourseException";
        resources[20][1] = "\tCourse is not in the correct format!";

        resources[21][0] = "addGroupException";
        resources[21][1] = "\tThe group is not in the correct format!";

        resources[22][0] = "addNameRegex";
        resources[22][1] = "[A-Z][a-zA-Z]*";

        resources[23][0] = "addLastNameRegex";
        resources[23][1] = "[a-zA-z]+([ '-][a-zA-Z]+)*";

        resources[24][0] = "addAgeRegex";
        resources[24][1] = "^(100|[1-9][0-9]?)$";

        resources[25][0] = "addCourseRegex";
        resources[25][1] = "^([1-6])$";

        resources[26][0] = "addGroupRegex";
        resources[26][1] = "[A-Z]{2}-\\d{2}";

        resources[27][0] = "removeStatement";
        resources[27][1] = "Keep in mind here the register is taken into account!";

        resources[28][0] = "removeName";
        resources[28][1] = "Enter the name of the student whose information you want to delete: ";

        resources[29][0] = "removeLastName";
        resources[29][1] = "Enter the last name of the student whose information you want to delete: ";

        resources[30][0] = "removeGroup";
        resources[30][1] = "Enter the student group whose information you want to delete: ";

        resources[31][0] = "refreshList";
        resources[31][1] = "NEW LIST";

        resources[32][0] = "sortDescending";
        resources[32][1] = "(descending)";

        resources[33][0] = "sortAscending";
        resources[33][1] = "(ascending)";

        resources[34][0] = "nameVal";
        resources[34][1] = "Name";

        resources[35][0] = "lastNameVal";
        resources[35][1] = "Surname";

        resources[36][0] = "ageVal";
        resources[36][1] = "Age";

        resources[37][0] = "courseVal";
        resources[37][1] = "Course";

        resources[38][0] = "groupVal";
        resources[38][1] = "Group";

        resources[39][0] = "studentList";
        resources[39][1] = "STUDENT`S LIST";

        resources[40][0] = "chooseOption";
        resources[40][1] = "\n\tTo continue, select an option: ";

        resources[41][0] = "validate";
        resources[41][1] = "Please enter a valid value!";


        return resources;
    }
}
