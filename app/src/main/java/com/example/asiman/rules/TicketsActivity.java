package com.example.asiman.rules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Asiman on 21.06.2015.
 */
public class TicketsActivity extends Activity{

    private int btnId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tickets_layout);
    }



    public void goToTestActivity(View view){
        Intent intent = new Intent(this, TestActivity.class);

        switch (view.getId()) {
            case R.id.ticket1:
                btnId = 1;
                break;
            case R.id.ticket2:
                btnId = 2;
                break;
            case R.id.ticket3:
                btnId = 3;
                break;
        }

        intent.putExtra("numberWallet", btnId);
        startActivity(intent);
    }


}
