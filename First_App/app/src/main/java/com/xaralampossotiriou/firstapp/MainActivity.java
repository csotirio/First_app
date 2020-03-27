package com.xaralampossotiriou.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Message string for knock-knock joke
    static final String QUESTION1 = "Knock, knock...";
    static final String ANSWER1 = "Who's there?";
    static final String QUESTION2 = "Boo.";
    static final String ANSWER2 = "Boo, who?";
    static final String QUESTION3 = "Why are you crying?";
    static final String ANSWER3 = "Start over";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add the button behavior
        final Button theButton = findViewById(R.id.theButton);
        final TextView txtMessage = findViewById(R.id.txtMessage);

        //Set up starting text
        txtMessage.setText(QUESTION1);
        theButton.setText(ANSWER1);

        theButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Modify the text of the question and the button every time the button is clicked
                if(txtMessage.getText() == QUESTION1)
                {
                    txtMessage.setText(QUESTION2);
                    theButton.setText(ANSWER2);
                }
                else if (txtMessage.getText() == QUESTION2)
                {
                    txtMessage.setText(QUESTION3);
                    theButton.setText(ANSWER3);
                }
                else
                {
                    txtMessage.setText(QUESTION1);
                    theButton.setText(ANSWER1);
                }
            }
        });
    }
}
