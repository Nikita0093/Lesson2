package com.example.lesson2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    double DisplayCounterOne = 0;
    double DisplayCounterTwo = 0;
    double DisplayCounterThree = 0;
    double DisplayEqual = 0;
    int DotState = 0;
    int PlusState = 0;
    int SubtractionState = 0;
    int MultiplicationState = 0;
    int DeleteState = 0;
    int DisplaySymbol = 0;
    TextView DisplayInfo;
    TextView DisplayInfo_Visible;
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
    Button Settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(ThemeApp.CurrentTheme);
        setContentView(R.layout.activity_main);
        Initialization();
        SetListener();


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("DisplayInfo", DisplayInfo.getText().toString());
        outState.putString("DisplayInfo_Visible", DisplayInfo_Visible.getText().toString());
        outState.putDouble("DisplayCounterOne", DisplayCounterOne);
        outState.putDouble("DisplayCounterTwo", DisplayCounterTwo);
        outState.putInt("DisplaySymbol", DisplaySymbol);
        outState.putInt("DotState", DotState);

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        DisplaySymbol = savedInstanceState.getInt("DisplaySymbol");
        DisplayCounterOne = savedInstanceState.getDouble("DisplayCounterOne");
        DisplayCounterTwo = savedInstanceState.getDouble("DisplayCounterTwo");
        DisplayInfo.setText(savedInstanceState.getString("DisplayInfo"));
        DisplayInfo_Visible.setText(savedInstanceState.getString("DisplayInfo_Visible"));
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
        Settings.setOnClickListener(this);

    }

    public void Initialization() {
        DisplayInfo = findViewById(R.id.DisplayInfo);
        DisplayInfo_Visible = findViewById(R.id.DisplayInfo_Visible);
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
        Settings = findViewById(R.id.Settings);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.buttonZero): {
                DisplayInfo.append("0");
                DisplayInfo_Visible.append("0");
                PlusState = 0;
                SubtractionState = 0;
                MultiplicationState = 0;
                DeleteState = 0;
                break;
            }
            case (R.id.buttonOne): {
                DisplayInfo.append("1");
                DisplayInfo_Visible.append("1");
                PlusState = 0;
                SubtractionState = 0;
                MultiplicationState = 0;
                DeleteState = 0;
                break;
            }
            case (R.id.buttonTwo): {
                DisplayInfo.append("2");
                DisplayInfo_Visible.append("2");
                PlusState = 0;
                SubtractionState = 0;
                MultiplicationState = 0;
                DeleteState = 0;
                break;
            }
            case (R.id.buttonThree): {
                DisplayInfo.append("3");
                DisplayInfo_Visible.append("3");
                PlusState = 0;
                SubtractionState = 0;
                MultiplicationState = 0;
                DeleteState = 0;
                break;
            }
            case (R.id.buttonFour): {
                DisplayInfo.append("4");
                DisplayInfo_Visible.append("4");
                PlusState = 0;
                SubtractionState = 0;
                MultiplicationState = 0;
                DeleteState = 0;
                break;
            }
            case (R.id.buttonFive): {
                DisplayInfo.append("5");
                DisplayInfo_Visible.append("5");
                PlusState = 0;
                SubtractionState = 0;
                MultiplicationState = 0;
                DeleteState = 0;
                break;
            }
            case (R.id.buttonSix): {
                DisplayInfo.append("6");
                DisplayInfo_Visible.append("6");
                PlusState = 0;
                SubtractionState = 0;
                MultiplicationState = 0;
                DeleteState = 0;
                break;
            }
            case (R.id.buttonSeven): {
                DisplayInfo.append("7");
                DisplayInfo_Visible.append("7");
                PlusState = 0;
                SubtractionState = 0;
                MultiplicationState = 0;
                DeleteState = 0;
                break;
            }
            case (R.id.buttonEight): {
                DisplayInfo.append("8");
                DisplayInfo_Visible.append("8");
                PlusState = 0;
                SubtractionState = 0;
                MultiplicationState = 0;
                DeleteState = 0;
                break;
            }
            case (R.id.buttonNine): {
                DisplayInfo.append("9");
                DisplayInfo_Visible.append("9");
                PlusState = 0;
                SubtractionState = 0;
                MultiplicationState = 0;
                DeleteState = 0;
                break;
            }
            case (R.id.buttonDot): {
                if (DotState == 0) {
                    DisplayInfo.append(".");
                    DisplayInfo_Visible.append(".");
                    DotState++;
                } else {

                    System.out.println("Ошибка");
                }
                break;
            }
            case (R.id.buttonBackspace): {
                DotState = 0;
                PlusState = 0;
                SubtractionState = 0;
                MultiplicationState = 0;
                DeleteState = 0;
                DisplayCounterOne = 0;
                DisplayCounterTwo = 0;
                DisplayCounterThree = 0;
                DisplayEqual = 0;
                DisplayInfo.setText(null);
                DisplayInfo_Visible.setText(null);
                break;
            }
            case (R.id.buttonPlus): {
                DisplaySymbol = 1;
                DotState = 0;
                if (PlusState == 0) {
                    try {
                        DisplayCounterOne = Double.parseDouble(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    DisplayCounterThree = DisplayCounterThree + DisplayCounterOne;
                    DisplayCounterOne = 0;
                    PlusState = 1;
                    SubtractionState = 1;
                    MultiplicationState = 1;
                    DeleteState = 1;
                    DisplayInfo_Visible.append("+");
                    DisplayInfo.setText(null);
                    break;
                } else {

                    System.out.println("Ошибка");
                    break;
                }
            }
            case (R.id.buttonSubtraction): {
                DisplaySymbol = 2;
                DotState = 0;
                if (SubtractionState == 0) {
                    try {
                        DisplayCounterOne = Double.parseDouble(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    if (DisplayCounterThree == 0) {
                        DisplayCounterThree = DisplayCounterThree + DisplayCounterOne;
                    } else {
                        DisplayCounterThree = DisplayCounterThree - DisplayCounterOne;
                    }
                    DisplayCounterOne = 0;
                    DisplayInfo.setText(null);
                    DisplayInfo_Visible.append("-");
                    PlusState = 1;
                    SubtractionState = 1;
                    MultiplicationState = 1;
                    DeleteState = 1;
                    break;
                } else {
                    System.out.println("Ошибка");
                    break;
                }
            }
            case (R.id.buttonMultiplication): {
                DisplaySymbol = 3;
                DotState = 0;
                if (MultiplicationState == 0) {
                    try {
                        DisplayCounterOne = Double.parseDouble(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    if (DisplayCounterThree == 0) {
                        DisplayCounterThree = DisplayCounterThree + DisplayCounterOne;
                    } else {
                        DisplayCounterThree = DisplayCounterThree * DisplayCounterOne;
                    }
                    DisplayCounterOne = 0;
                    DisplayInfo.setText(null);
                    DisplayInfo_Visible.append("*");
                    PlusState = 1;
                    SubtractionState = 1;
                    MultiplicationState = 1;
                    DeleteState = 1;
                    break;
                } else {
                    System.out.println("Ошибка");
                    break;
                }
            }
            case (R.id.buttonDelete): {
                DisplaySymbol = 4;
                DotState = 0;
                if (DeleteState == 0) {
                    try {
                        DisplayCounterOne = Double.parseDouble(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    if (DisplayCounterThree == 0) {
                        DisplayCounterThree = DisplayCounterThree + DisplayCounterOne;
                    } else {
                        DisplayCounterThree = DisplayCounterThree / DisplayCounterOne;
                    }
                    DisplayCounterOne = 0;
                    DisplayInfo.setText(null);
                    DisplayInfo_Visible.append("/");
                    PlusState = 1;
                    SubtractionState = 1;
                    MultiplicationState = 1;
                    DeleteState = 1;
                    break;

                } else {
                    System.out.println("Ошибка");
                    break;
                }
            }
            case (R.id.buttonEqual): {
                if (DisplaySymbol == 1) {
                    try {
                        DisplayCounterTwo = Double.parseDouble(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    DisplayEqual = DisplayCounterThree + DisplayCounterTwo;
                    DisplayCounterThree = 0;
                    DisplayCounterTwo = 0;

                    DisplayInfo.setText(" " + DisplayEqual);
                    DisplayInfo_Visible.append("=" + DisplayEqual);
                    break;
                } else if (DisplaySymbol == 2) {
                    try {
                        DisplayCounterTwo = Double.parseDouble(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    DisplayEqual = DisplayCounterThree - DisplayCounterTwo;
                    DisplayCounterThree = 0;
                    DisplayCounterTwo = 0;
                    DisplayInfo.setText(" " + DisplayEqual);
                    DisplayInfo_Visible.append("=" + DisplayEqual);
                    break;
                } else if (DisplaySymbol == 3) {
                    try {
                        DisplayCounterTwo = Double.parseDouble(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    DisplayEqual = DisplayCounterThree * DisplayCounterTwo;
                    DisplayCounterThree = 0;
                    DisplayCounterTwo = 0;
                    DisplayInfo.setText(" " + DisplayEqual);
                    DisplayInfo_Visible.append("=" + DisplayEqual);
                    break;
                } else if (DisplaySymbol == 4) {
                    try {
                        DisplayCounterTwo = Double.parseDouble(DisplayInfo.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("Could not parse " + e);
                    }
                    DisplayEqual = DisplayCounterThree / DisplayCounterTwo;
                    DisplayCounterThree = 0;
                    DisplayCounterTwo = 0;
                    DisplayInfo.setText(" " + DisplayEqual);
                    DisplayInfo_Visible.append("=" + DisplayEqual);
                    break;
                }
            }
            case (R.id.Settings): {
                Intent intent = new Intent(MainActivity.this, com.example.lesson2.Settings.class);
                startActivity(intent);
            }

        }
    }
}








