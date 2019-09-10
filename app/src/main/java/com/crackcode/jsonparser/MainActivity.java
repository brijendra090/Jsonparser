package com.crackcode.jsonparser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    public static final String JSON_STRINGH ="{\"employee\":{\"name\":\"john wick\",\"salary\":50000}}";

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView1);

        try {
            JSONObject emp = (new JSONObject(JSON_STRINGH)).getJSONObject("employee");
            String empname = emp.getString("name");
            int emosalary = emp.getInt("salary");

            String str ="Employee Name: "+empname+"\n" + "Employee Salary: "+emosalary;
            textView.setText(str);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
