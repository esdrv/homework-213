package com.msaggik.homework213;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // создание объекта сущности железнодорожного билета
    Railwayticket railwayTicket = new Railwayticket("Вологда", "Санкт-Петербург",
            "10.00 1 февраля", "12 часов", 125);

    // вывод на экран полученных значений
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView railwayticketOut = findViewById(R.id.railwayTicketOut);

        // запонение экрана
        railwayticketOut.setText(railwayTicket.toString());
    }
}