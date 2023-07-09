package com.studyabroad.roadtogermany;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.studyabroad.roadtogermany.adapter.MainMenuItemAdapter;
import com.studyabroad.roadtogermany.pojo.MainMenuItems;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4; //The main Buttons in the home page to navigate through portals.
    MainMenuItems item1, item2, item3, item4, item5, item6, item7,item8,item9, item10,item11,item12,item13,item14,item15,item16,item17,item18,item19,item20,item21,item23,item24,item22;
    MainMenuItemAdapter mainMenuItemAdapter;
    int black, green;
    private RecyclerView recyclerView;
    private List<MainMenuItems> mainMenuItemsList;
    int status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        status =2;
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);

        black = getResources().getColor(R.color.colorBlack);
        green = getResources().getColor(R.color.colorDarkGreen);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels/4;
        btn1.setWidth(width);
        btn2.setWidth(width);
        btn3.setWidth(width);
        btn4.setWidth(width);


            btn1.setBackgroundColor(green);
            btn2.setBackgroundColor(black);
            btn3.setBackgroundColor(black);
            btn4.setBackgroundColor(black);




        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btn1.setBackgroundColor(green);
                btn2.setBackgroundColor(black);
                btn3.setBackgroundColor(black);
                btn4.setBackgroundColor(black);

               status = 1;
                mainMenuItemsList.clear();
                mainMenuItemsList.add(item1);
                mainMenuItemsList.add(item2);
                mainMenuItemsList.add(item3);
                mainMenuItemsList.add(item4);
                mainMenuItemsList.add(item5);
                mainMenuItemsList.add(item6);

                recyclerView.setAdapter(mainMenuItemAdapter);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btn1.setBackgroundColor(black);
                btn2.setBackgroundColor(green);
                btn3.setBackgroundColor(black);
                btn4.setBackgroundColor(black);
                status = 2;
                mainMenuItemsList.clear();
                mainMenuItemsList.add(item7);
                mainMenuItemsList.add(item8);
                mainMenuItemsList.add(item9);
                mainMenuItemsList.add(item10);
                mainMenuItemsList.add(item11);
                mainMenuItemsList.add(item12);

                recyclerView.setAdapter(mainMenuItemAdapter);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btn1.setBackgroundColor(black);
                btn2.setBackgroundColor(black);
                btn3.setBackgroundColor(green);
                btn4.setBackgroundColor(black);
                status = 3;
                mainMenuItemsList.clear();
                mainMenuItemsList.add(item13);
                mainMenuItemsList.add(item14);
                mainMenuItemsList.add(item15);
                mainMenuItemsList.add(item16);
                mainMenuItemsList.add(item17);
                mainMenuItemsList.add(item18);

                recyclerView.setAdapter(mainMenuItemAdapter);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                btn1.setBackgroundColor(black);
                btn2.setBackgroundColor(black);
                btn3.setBackgroundColor(black);
                btn4.setBackgroundColor(green);
                status = 4;

                mainMenuItemsList.clear();
                mainMenuItemsList.add(item19);
                mainMenuItemsList.add(item20);
                mainMenuItemsList.add(item21);
                mainMenuItemsList.add(item22);
                mainMenuItemsList.add(item23);
                mainMenuItemsList.add(item24);

                recyclerView.setAdapter(mainMenuItemAdapter);
            }
        });
        mainMenuItemsList = new ArrayList<>();



        mainMenuItemAdapter = new MainMenuItemAdapter(this,mainMenuItemsList);

        item1 = new MainMenuItems("Overview","something");
        item2 = new MainMenuItems("Discover German Cities","something");
        item3 = new MainMenuItems("DAAD","something");
        item4 = new MainMenuItems("Application Management","something");
        item5 = new MainMenuItems("Find a Dormitory/ WG","something");
        item6 = new MainMenuItems("Find a Mentor","something");
        item7 = new MainMenuItems("First Time in Germany?","Dont Miss a bus or Train");
        item8 = new MainMenuItems("Travel Apps Tipps","something");
        item9 = new MainMenuItems("Stuck Somewhere?","Find a youth hostel");
        item10 = new MainMenuItems("Corona Alert","something");
        item11 = new MainMenuItems("Weather Tips","something");
        item12 = new MainMenuItems("Need Help?","Emergency Numbers");
        item13 = new MainMenuItems("Find a Townhall","Address Registration");
        item14 = new MainMenuItems("Find a Health Insurance","Its Essential");
        item15 = new MainMenuItems("Enrolment","Congratulations");
        item16 = new MainMenuItems("Hungry?","Find a mensa");
        item17 = new MainMenuItems("Need a bank account?","Find a Bank");
        item18 = new MainMenuItems("Shopping Tips","something");
        item19 = new MainMenuItems("Manage Class Routine","something");
        item20 = new MainMenuItems("Manage Your Study","something something");
        item21 = new MainMenuItems("Find a Language School","something something");
        item22 = new MainMenuItems("Visa Extention","Work Permit");
        item23 = new MainMenuItems("Find a Part Time Job","Minijob");
        item24 = new MainMenuItems("Attention","Things to know");

        //  Employee employee2 = new Employee("MD Abdus Salam","Senior Principal Officer","A-7777","01716452549","01-01-2007");
        //  Employee employee3 = new Employee("S.M. Saquib Rahman","Assistant Programmer","S-4705","01709651194","25-09-2017");
        //  Employee employee4 = new Employee("K. M. Nuruddin Sarawar","Senior System Analyst","N-1638","01819444378","01-01-2014");
        //  Employee employee5 = new Employee("Md. Farid Hasan","Senior System Analyst","F-708","01907163639","01-01-2014");



            mainMenuItemsList.add(item1);
            mainMenuItemsList.add(item2);
            mainMenuItemsList.add(item3);
            mainMenuItemsList.add(item4);
            mainMenuItemsList.add(item5);
            mainMenuItemsList.add(item6);




        recyclerView =(RecyclerView) findViewById(R.id.mainMenuItems_RV);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerView.setAdapter(mainMenuItemAdapter);


    }
}
