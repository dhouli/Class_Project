package com.example.danhoui.myapplication;

/**
 * Created by danhoui on 3/21/16.
 * I am not sure if I am going to use this seperate class yet.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import android.widget.CheckBox;
import android.widget.Button;


public class SelectedItems {
    // If all three tasks are selected then the child receives a star
    // create an array to get the selections
    ArrayList<String> completedTask = new ArrayList<String>();


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

}
