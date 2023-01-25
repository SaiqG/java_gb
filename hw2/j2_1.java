public class j2_1 {
    public static void main(String[] args) {
        String input = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        input = input.replaceAll("\\{|\\}|\"","");
        String[] parts = input.split(",");
        StringBuilder query = new StringBuilder("SELECT * FROM students WHERE ");
        for (String part : parts) {
            String[] prop = part.split(":");
            String key = prop[0].trim();
            String value = prop[1].trim();
            if (!value.equals("null")) {
                query.append(key).append(" = '").append(value).append("' AND ");
            }
        }
        // remove the last "AND "
        if(query.lastIndexOf("AND")>-1)
            query.setLength(query.lastIndexOf("AND"));

        System.out.println(query.toString());
    }
}
