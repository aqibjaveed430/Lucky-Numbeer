package com.tritechteal.luckynumber;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner select_month;
    EditText date;
    EditText year;
    Button next;
    TextView mTv;
    Button mbtn;
    Button name;
    Calendar c;
    DatePickerDialog dpd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv = (TextView)findViewById(R.id.textView);
        mbtn = (Button) findViewById(R.id.next_buton);
        name = (Button) findViewById(R.id.select_name);

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Result.class);
                startActivity(intent);
            }
        });


        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = Calendar.getInstance();
                int day =c.get(Calendar.DAY_OF_MONTH);
                int month =c.get(Calendar.MONTH);
                int year =c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        mTv.setText(dayOfMonth + "-" + (month+1) + "-" + year);
                    }
                },  day,month,year);
                dpd.show();
            }
        });


      /*  date = (EditText) findViewById(R.id.date_textView);
        year = (EditText) findViewById(R.id.year_textView);
        next = (Button) findViewById(R.id.next_buton);

       next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Result.class);
                startActivity(intent);
            }
        });




        select_month = (Spinner) findViewById(R.id.select_month);

        List<String> selec_month_list = new ArrayList<String>();
        selec_month_list.add("Select Month");
        selec_month_list.add("January");
        selec_month_list.add("Feburary");
        selec_month_list.add("March");
        selec_month_list.add("April");
        selec_month_list.add("May");
        selec_month_list.add("June");
        selec_month_list.add("July");
        selec_month_list.add("August");
        selec_month_list.add("September");
        selec_month_list.add("October");
        selec_month_list.add("November");
        selec_month_list.add("December");

        ArrayAdapter<String> arrayAdapter_date = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, selec_month_list);
        arrayAdapter_date.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        select_month.setAdapter(arrayAdapter_date);


        select_month.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                select_month.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });*/



    }
}