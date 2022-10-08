package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.database.Model.Expenses;
import com.example.database.Model.Trip;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHelper ob=new DatabaseHelper(this);
        Trip trip=new Trip(1,"Nam","Hao","2022/09/21","2022/09/22",1,"descriptio",1);
        Expenses expense=new Expenses(1,1,3.2f,"2022/02/06","20:01:06","comment","location","images",3);
//        ob.addTrip();
//        ob.addType();
//          ob.addExpense(expense);
//          System.out.println("size"+ob.getExpensesByTripId(3));

//        System.out.println("size"+ob.getListTrip().toString());
//        System.out.println(ob.searchTripById(1));

//        ob.updateTrip(trip,2);
//        System.out.println(ob.searchTripByName("am"));
//        ob.deleteTripById(1);
//        ob.getListType();
//        System.out.println("expense "+ob.getListExpense().toString());
//         System.out.println(ob.searchTypeById(1).toString());
//         System.out.println(ob.searchExpenseById(1).toString());
//        System.out.println("total "+ob.getTotalExpenses());
//        System.out.println(ob.getListExpense().toString());
//        ob.deleteExpensesById(4);
//        System.out.println("      ");
//        System.out.println(ob.getListExpense().toString());
          ob.deleteAllTrip();
    }
}