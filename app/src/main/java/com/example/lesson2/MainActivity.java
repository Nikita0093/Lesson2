package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int DisplayCounterOne = 0;
    int DisplayCounterTwo = 0;
    int DisplaySymbol = 0;
    TextView DisplayInfo;
    Button buttonBackspace;
    Button buttonOne;
    Button buttonTwo;
    Button buttonHooks;
    Button buttonPercent;
    Button buttonDelete;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonMultiplication;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSubtraction;
    Button buttonThree;
    Button buttonPlus;
    Button buttonPlus_minus;
    Button buttonZero;
    Button buttonDot;
    Button buttonEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initialization();
        SetListener();
        Calculating();


    }

    private void SetListener() {
        buttonZero.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonBackspace.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonMultiplication.setOnClickListener(this);
        buttonSubtraction.setOnClickListener(this);
        buttonDelete.setOnClickListener(this);

    }


    public void Initialization() {
        DisplayInfo = findViewById(R.id.DisplayInfo);
        buttonBackspace = findViewById(R.id.buttonBackspace);
        buttonHooks = findViewById(R.id.buttonHooks);
        buttonPercent = findViewById(R.id.buttonPercent);
        buttonDelete = findViewById(R.id.buttonDelete);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonMultiplication = findViewById(R.id.buttonMultiplication);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSubtraction = findViewById(R.id.buttonSubtraction);
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus_minus = findViewById(R.id.buttonPlus_minus);
        buttonZero = findViewById(R.id.buttonZero);
        buttonDot = findViewById(R.id.buttonDot);
        buttonEqual = findViewById(R.id.buttonEqual);
    }

    public void Calculating() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.buttonZero): {
                DisplayInfo.append("0");
                break;
            }
            case (R.id.buttonOne): {
                DisplayInfo.append("1");
                break;
            }
            case (R.id.buttonTwo): {
                DisplayInfo.append("2");
                break;
            }
            case (R.id.buttonThree): {
                DisplayInfo.append("3");
                break;
            }
            case (R.id.buttonFour): {
                DisplayInfo.append("4");
                break;
            }
            case (R.id.buttonFive): {
                DisplayInfo.append("5");
                break;
            }
            case (R.id.buttonSix): {
                DisplayInfo.append("6");
                break;
            }
            case (R.id.buttonSeven): {
                DisplayInfo.append("7");
                break;
            }
            case (R.id.buttonEight): {
                DisplayInfo.append("8");
                break;
            }
            case (R.id.buttonNine): {
                DisplayInfo.append("9");
                break;
            }
            case (R.id.buttonDot): {
                DisplayInfo.append(".");
                break;
            }
            case (R.id.buttonBackspace): {
                DisplayInfo.setText(null);
                break;
            }
            case (R.id.buttonPlus): {
                DisplaySymbol = 1;
                try {
                    DisplayCounterOne = Integer.parseInt(DisplayInfo.getText().toString());
                } catch (NumberFormatException e) {
                    System.out.println("Could not parse " + e);
                }
                DisplayInfo.setText(null);
                break;
            }
            case (R.id.buttonSubtraction): {
                DisplaySymbol = 2;
                try {
                    DisplayCounterOne = Integer.parseInt(DisplayInfo.getText().toString());
                } catch (NumberFormatException e) {
                    System.out.println("Could not parse " + e);
                }
                DisplayInfo.setText(null);
                break;
            }
            case (R.id.buttonMultiplication): {
                DisplaySymbol = 3;
                try {
                    DisplayCounterOne = Integer.parseInt(DisplayInfo.getText().toString());
                } catch (NumberFormatException e) {
                    System.out.println("Could not parse " + e);
                }
                DisplayInfo.setText(null);
                break;
            }
            case (R.id.buttonDelete): {
                DisplaySymbol = 4;
                try {
                    DisplayCounterOne = Integer.parseInt(DisplayInfo.getText().toString());
                } catch (NumberFormatException e) {
                    System.out.println("Could not parse " + e);
                }
                DisplayInfo.setText(null);
                break;
            }
            case (R.id.buttonEqual): {
                if (DisplaySymbol == 1) {
                    try {
                        DisplayCounterTwo = Integer.parseInt(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    int a = DisplayCounterOne + DisplayCounterTwo;
                    DisplayInfo.setText(" " + a);
                    break;
                } else if (DisplaySymbol == 2) {
                    try {
                        DisplayCounterTwo = Integer.parseInt(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    int a = DisplayCounterOne - DisplayCounterTwo;
                    DisplayInfo.setText(" " + a);
                    break;

                } else if (DisplaySymbol == 3) {
                    try {
                        DisplayCounterTwo = Integer.parseInt(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    int a = DisplayCounterOne * DisplayCounterTwo;
                    DisplayInfo.setText(" " + a);
                    break;
                } else if (DisplaySymbol == 4) {
                    try {
                        DisplayCounterTwo = Integer.parseInt(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    int a = DisplayCounterOne / DisplayCounterTwo;
                    DisplayInfo.setText(" " + a);
                    break;

                }
            }
        }
    }
}




