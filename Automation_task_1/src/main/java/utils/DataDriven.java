package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class DataDriven {

    // Method to read the entire "users" array from your JSON
    public static JSONArray getUsers() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("src/test/java/json/testData.json"));
        return (JSONArray) jsonObject.get("users");
    }

    // Method to get a specific field from a user at given index
    public static String getValue(int index, String field) throws IOException, ParseException {
        JSONArray dataArray = getUsers();
        JSONObject user = (JSONObject) dataArray.get(index);
        return (String) user.get(field);
    }
}