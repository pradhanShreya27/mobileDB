package com.example.mobiledb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity3 extends AppCompatActivity {

    EditText username;
    EditText dob;
    EditText age;
    EditText address;
    EditText educational_qualification;
    EditText sslc;
    EditText hsc;
    EditText ug;
    EditText pg;
    EditText sslct;
    Button sslcper;
    TextView viewsslcper;
    EditText hsct;
    Button hscper;
    TextView viewhscper;
    EditText ugt;
    Button ugper;
    TextView viewugper;
    EditText pgt;
    Button pgper;
    TextView viewpgper;
    Button save;
    DBhelper DB;

    DatePickerDialog.OnDateSetListener date;
    Calendar myCalendar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        DB=new DBhelper(this);

        username=findViewById(R.id.username);
        dob=findViewById(R.id.dob);
        age=findViewById(R.id.age);
        address=findViewById(R.id.address);
        educational_qualification=findViewById(R.id.educationalqualification);
        sslcper=findViewById(R.id.sslcper);
        hscper=findViewById(R.id.hscper);
        ugper=findViewById(R.id.ugper);
        pgper=findViewById(R.id.pgper);
        save=findViewById(R.id.save);

        sslc=findViewById(R.id.sslc);
        sslct=findViewById(R.id.sslct);
        viewsslcper=findViewById(R.id.viewsslcper);

        hsc=findViewById(R.id.hsc);
        hsct=findViewById(R.id.hsct);
        viewhscper=findViewById(R.id.viewhscper);

        ug=findViewById(R.id.ug);
        ugt=findViewById(R.id.ugt);
        viewugper=findViewById(R.id.viewugper);

        pg=findViewById(R.id.pg);
        pgt=findViewById(R.id.pgt);
        viewpgper=findViewById(R.id.viewpgper);

        myCalendar = Calendar.getInstance();


        date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }
        };

        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(MainActivity3.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


        sslcper.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Double s1, s2,x;
                try {
                    s1 = Double.parseDouble(sslc.getText().toString());
                    s2 = Double.parseDouble(sslct.getText().toString());
                    x = (s1/s2)*10;
                    if(x <= 10 && x >= 9) {
                        viewsslcper.setText("A+");
                    }
                    else if(x < 9 && x >= 8)
                    {
                        viewsslcper.setText("A");
                    }
                    else if(x < 8 && x >= 7)
                    {
                        viewsslcper.setText("B");
                    }
                    else
                    {
                        viewsslcper.setText("RA");
                    }

                }
                catch (Exception e) {

                    Toast.makeText(MainActivity3.this,"Invalid Input...",LENGTH_SHORT).show();
                }

            }

        });

        hscper.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Double s1, s2,x;
                try {
                    s1 = Double.parseDouble(hsc.getText().toString());
                    s2 = Double.parseDouble(hsct.getText().toString());
                    x = (s1/s2)*10;
                    if(x <= 10 && x >= 9) {
                        viewhscper.setText("A+");
                    }
                    else if(x < 9 && x >= 8)
                    {
                        viewhscper.setText("A");
                    }
                    else if(x < 8 && x >= 7)
                    {
                        viewhscper.setText("B");
                    }
                    else
                    {
                        viewhscper.setText("RA");
                    }

                }


                catch (Exception e) {

                    Toast.makeText(MainActivity3.this,"Invalid Input...",LENGTH_SHORT).show();
                }

            }

        });



        ugper.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Double s1 ,x, s2;

                try {
                    s1 = Double.parseDouble(ug.getText().toString());
                    s2 = Double.parseDouble(ugt.getText().toString());
                    x = (s1/s2)*10;
                    if(x <= 10 && x >= 9) {
                        viewugper.setText("A+");
                    }
                    else if(x < 9 && x >= 8)
                    {
                        viewugper.setText("A");
                    }
                    else if(x < 8 && x >= 7)
                    {
                        viewugper.setText("B");
                    }
                    else
                    {
                        viewugper.setText("RA");
                    }

                }

                catch (Exception e) {

                    Toast.makeText(MainActivity3.this,"Invalid Input...",LENGTH_SHORT).show();
                }

            }

        });


        pgper.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Double s1, s2,x;
                try {
                    s1 = Double.parseDouble(pg.getText().toString());
                    s2 = Double.parseDouble(pgt.getText().toString());
                    x = (s1/s2)*10;
                    if(x <= 10 && x >= 9) {
                        viewpgper.setText("A+");
                    }
                    else if(x < 9 && x >= 8)
                    {
                        viewpgper.setText("A");
                    }
                    else if(x < 8 && x >= 7)
                    {
                        viewpgper.setText("B");
                    }
                    else
                    {
                        viewpgper.setText("RA");
                    }


                }
                catch (Exception e) {

                    Toast.makeText(MainActivity3.this,"Invalid Input...",LENGTH_SHORT).show();
                }

            }

        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String dobv=dob.getText().toString();
                String agev=age.getText().toString();
                String addr=address.getText().toString();
                String eduq=educational_qualification.getText().toString();
                String sslcm=viewsslcper.getText().toString();
                String hscm=viewhscper.getText().toString();
                String ugm=viewugper.getText().toString();
                String pgm=viewpgper.getText().toString();

                if(user.equals("")||dobv.equals("")||agev.equals("")||addr.equals("")||eduq.equals("")||sslcm.equals("")||hscm.equals("")||ugm.equals("")||pgm.equals("")){
                    Toast.makeText(MainActivity3.this, "Enter Profile Information", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(DB.checkusername(user)){
                        DB.insertprofile(user,dobv,agev,addr,eduq,sslcm,hscm,ugm,pgm);
                        Toast.makeText(MainActivity3.this, "Profile saved successfully", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(MainActivity3.this, "User not yet registered", Toast.LENGTH_SHORT).show();
                    }

                }
                Intent intent = new Intent(MainActivity3.this, MainActivity3.class);
                startActivity(intent);

                Intent i = new Intent(MainActivity3.this,MainActivity5.class);
                startActivity(i);
            }
        });
    }
    private void updateLabel() {
        String myFormat = "dd-MM-yyyy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        dob.setText(sdf.format(myCalendar.getTime()));
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = myCalendar.getTime();
        long millis = date.getTime();
        int re=calculateAge(millis);
        //Log.d("dob",re+"");
        age.setText(re+"");
    }

    int calculateAge(long date){
        Calendar dob = Calendar.getInstance();
        dob.setTimeInMillis(date);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if(today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)){
            age--;
        }
        return age;
    }
}















