import java.util.ListResourceBundle;

public class SampleRB_ua extends ListResourceBundle {
    protected Object[][] getContents(){
        Object[][] resources = new Object[42][2];
        resources[0][0] = "title";
        resources[0][1] = "КЛАС СТУДЕНТ";

        resources[1][0] = "addStudent";
        resources[1][1] = "Додати нового студента";

        resources[2][0] = "removeStudent";
        resources[2][1] = "Видалити інформацію про студента";

        resources[3][0] = "showListStudent";
        resources[3][1] = "Вевести список студентів";

        resources[4][0] = "sortFull";
        resources[4][1] = "Провести повне сортування";

        resources[5][0] = "sortName";
        resources[5][1] = "Сортування за ім'ям";

        resources[6][0] = "sortLastName";
        resources[6][1] = "Сортування за прізвищем";

        resources[7][0] = "sortAge";
        resources[7][1] = "Сортування за віком";

        resources[8][0] = "sortCourse";
        resources[8][1] = "Сортування за курсом";

        resources[9][0] = "sortGroup";
        resources[9][1] = "Сортування за групою";

        resources[10][0] = "zeroValue";
        resources[10][1] = "Вихід";

        resources[11][0] = "addQuestion";
        resources[11][1] = "Скільки студентів бажаєте додати? ";

        resources[12][0] = "addName";
        resources[12][1] = "Введіть ім'я (мінімум 2 літери) - ";

        resources[13][0] = "addLastName";
        resources[13][1] = "Введіть прізвище (мінімум 2 літери) - ";

        resources[14][0] = "addAge";
        resources[14][1] = "Введіть вік (0-100) - ";

        resources[15][0] = "addCourse";
        resources[15][1] = "Введіть курс (1-6) - ";

        resources[16][0] = "addGroup";
        resources[16][1] = "Введіть групу (формат - XX-99) - ";

        resources[17][0] = "addNameException";
        resources[17][1] = "\tІм'я не в правильному форматі!";

        resources[18][0] = "addLastNameException";
        resources[18][1] = "\tПрізвище не в правильному форматі!";

        resources[19][0] = "addAgeException";
        resources[19][1] = "\tВік не в правильному форматі!";

        resources[20][0] = "addCourseException";
        resources[20][1] = "\tКурс не в правильному форматі!";

        resources[21][0] = "addGroupException";
        resources[21][1] = "\tГрупа не в правильному форматі!";

        resources[22][0] = "addNameRegex";
        resources[22][1] = "[А-Яа-яЇїІіЄє']{2,15}";

        resources[23][0] = "addLastNameRegex";
        resources[23][1] = "[А-Яа-яЇїІіЄє']{2,10}";

        resources[24][0] = "addAgeRegex";
        resources[24][1] = "^(100|[1-9][0-9]?)$";

        resources[25][0] = "addCourseRegex";
        resources[25][1] = "^([1-6])$";

        resources[26][0] = "addGroupRegex";
        resources[26][1] = "[А-ЯЇІЄҐ]{2}-\\d{2}";

        resources[27][0] = "removeStatement";
        resources[27][1] = "Майте на увазі, тут регістр враховується!";

        resources[28][0] = "removeName";
        resources[28][1] = "Введіть ім'я студента, інформацію про якого бажаєте видалити: ";

        resources[29][0] = "removeLastName";
        resources[29][1] = "Введіть прізвище студента, інформацію про якого бажаєте видалити: ";

        resources[30][0] = "removeGroup";
        resources[30][1] = "Введіть групу студента, інформацію про якого бажаєте видалити: ";

        resources[31][0] = "refreshList";
        resources[31][1] = "НОВИЙ СПИСОК";

        resources[32][0] = "sortDescending";
        resources[32][1] = " (за спаданням)";

        resources[33][0] = "sortAscending";
        resources[33][1] = " (за зростанням)";

        resources[34][0] = "nameVal";
        resources[34][1] = "Ім'я";

        resources[35][0] = "lastNameVal";
        resources[35][1] = "Прізвище";

        resources[36][0] = "ageVal";
        resources[36][1] = "Вік";

        resources[37][0] = "courseVal";
        resources[37][1] = "Курс";

        resources[38][0] = "groupVal";
        resources[38][1] = "Група";

        resources[39][0] = "studentList";
        resources[39][1] = "СПИСОК СТУДЕНТІВ";

        resources[40][0] = "chooseOption";
        resources[40][1] = "\n\tДля продовження оберіть опцію: ";

        resources[41][0] = "validate";
        resources[41][1] = "Введіть валідне значення!";


        return resources;
    }
}
