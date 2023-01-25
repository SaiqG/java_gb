import org.json.JSONArray;
import org.json.JSONObject;

public class ParseString {
    public static void main(String[] args) {
        String input = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] result = parseAndBuild(input);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String[] parseAndBuild(String input) {
        JSONArray jsonArray = new JSONArray(input);
        String[] result = new String[jsonArray.length()];
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String surname = jsonObject.getString("фамилия");
            String grade = jsonObject.getString("оценка");
            String subject = jsonObject.getString("предмет");
            StringBuilder sb = new StringBuilder();
            sb.append("Студент ").append(surname).append(" получил ").append(grade).append(" по предмету ").append(subject).append(".");
            result[i] = sb.toString();
        }
        return result;
    }
}
