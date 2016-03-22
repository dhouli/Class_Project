package com.example.danhoui.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    //Adding Log tagging
    private static final String TAG = "stateChange";

    // If all three tasks are selected then the child receives a star
    // create an array to get the selections
    ArrayList<String> completedTask = new ArrayList<String>();
    //*****
    TextView final_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //****
        final_text = (TextView)findViewById(R.id.final_result);
        final_text.setEnabled(false);

        //adding log tagging
        Log.i(TAG, "onCreate");
    }



    //initialize the star
    public double star;
    // Write the star to another array to hold the value
    // either 1 or 0 or .5 will be written
    // 1 will be written if all 3 activities are complete
    // .5 will be written if 2 of the 3 activities are complete
    // 0 will be written if 1 or 0 of the activities are completed
    // Once the total equals 30 the goal is achieved


    //The three check boxes need to either be selected or not then submitted
    //Need to create two methods, 1. Keep track of checkbox 2. keep track of submission
    //Need to declare the selected methods
    public void selectItem(View v){
        //Boolean to confirm it is checked
        boolean selected =((CheckBox) v).isChecked();

        //Need to find which checkbox is selected
        //use switch to find this
        switch(v.getId()){
            //locating the id for brush_teeth
            case R.id.brush_teeth:
                if(selected){
                    completedTask.add("teeth_brushed");
                }
                else{
                    completedTask.remove("teeth_brushed");
                }
                break;
            case R.id.pajamas:
                if(selected){
                    completedTask.add("pajamas_on");
                }
                else{
                    completedTask.remove("pajamas_on");
                }
                break;
            case R.id.story_time:
                if(selected){
                    completedTask.add("story_time");
                }
                else{
                    completedTask.remove("story_time");
                }
                break;

        }



        //Need to add code to check array to confirm all three have been checked


    }


    public void finalSelection(View v){
        String goodNight = "";
        for(String Selections : completedTask){
            //goodNight = goodNight + Selections + "\n";
            if (completedTask.size() == 3){
                star = 1;
                //write to an array holding the amount
                goodNight = "You gained " + star + " star";

            }else if(completedTask.size() == 2){
                star = 0.5;
                //write to an array holding the amount
                goodNight = "You gained " + star + " star";
            }

            else {
                star = 0;
                //write to an array holding the amount
                goodNight = "You gained " + star + " star";
            }
//***********Next action need to write goodnight to DB
        }
        final_text.setText(goodNight);
        final_text.setEnabled(true);

    }

    //Log tagging
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");

    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }


}
