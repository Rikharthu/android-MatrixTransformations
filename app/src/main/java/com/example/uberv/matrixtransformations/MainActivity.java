package com.example.uberv.matrixtransformations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<int[][]> matrixs=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[][] matrix1={
            {1,0,0,0},
            {0,1,0,0},
            {0,0,1,0},
            {0,0,0,1}
        };
        int[][] matrix2={
                {0,0,0,3},
                {0,5,0,0},
                {2,0,1,0},
                {0,2,0,0}
        };
        int[][] result=new int[4][4];

        for (int i = 0; i < 4; i++) { // aRow
            for (int j = 0; j < 4; j++) { // bColumn
                for (int k = 0; k < 4; k++) { // aColumn
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < 4; i++) { // aRow
            String str="";
            for (int j = 0; j < 4; j++) { // bColumn
                for (int k = 0; k < 4; k++) { // aColumn
//                    str+=result[i][j]+"";
                }
                str+=result[i][j]+"";
            }
            Log.d("Matrix",str);
        }

    }
}
