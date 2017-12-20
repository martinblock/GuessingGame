package com.example.lopez.MemoryMatch;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class SecondActivity extends AppCompatActivity {

    TextView tvPlayer1, tvPlayer2;

    ImageView box1, box2, box3, box4,box21, box22, box23, box24,box31, box32, box33, box34;

    //This is an array for the images ill be using
    Integer[] cardsArray = {101,102,103,104,105,106,201,202,203,204,205,206};

    // these are the actual images
    int image101, image102, image103, image104, image105,image106,
            image201, image202, image203, image204, image205,image206;

    int firstCard,secondCard;
    int clickedFirst,clickedSecond;
    int cardNumber = 1;

    int turn = 1;

    int playerPoints = 0, cpuPoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvPlayer1 = findViewById(R.id.tvPlayer1);
        tvPlayer2 = findViewById(R.id.tvPlayer2);

        box1 = findViewById(R.id.box1);
        box2 = findViewById(R.id.box2);
        box3 = findViewById(R.id.box3);
        box4 = findViewById(R.id.box4);
        box21 = findViewById(R.id.box21);
        box22 = findViewById(R.id.box22);
        box23 = findViewById(R.id.box23);
        box24 = findViewById(R.id.box24);
        box31 = findViewById(R.id.box31);
        box32 = findViewById(R.id.box32);
        box33 = findViewById(R.id.box33);
        box34 = findViewById(R.id.box34);

        box1.setTag("0");
        box2.setTag("1");
        box3.setTag("2");
        box4.setTag("3");
        box21.setTag("4");
        box22.setTag("5");
        box23.setTag("6");
        box24.setTag("7");
        box31.setTag("8");
        box32.setTag("9");
        box33.setTag("10");
        box34.setTag("11");

        //this is where i load the cards in
        loadImages();

        // this is will shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));

        //this changes the color of the second player while he/she are inactive
        tvPlayer2.setTextColor(Color.GRAY);

        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box1,theCard);

            }
        });
        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box2,theCard);

            }
        });
        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box3,theCard);

            }
        });
        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box4,theCard);

            }
        });
        box21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box21,theCard);

            }
        });
        box22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box22,theCard);

            }
        });
        box23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box23,theCard);

            }
        });
        box24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box24,theCard);

            }
        });
        box31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box31,theCard);

            }
        });
        box32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box32,theCard);

            }
        });
        box33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box33,theCard);

            }
        });
        box34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(box34,theCard);

            }
        });
    }

    private void doStuff(ImageView iv, int card){

        // set the correct image to the imageview
        if(cardsArray[card] == 101){
            iv.setImageResource(image101);
        }else  if(cardsArray[card] == 102){
            iv.setImageResource(image102);
        }else  if(cardsArray[card] == 103){
            iv.setImageResource(image103);
        }else  if(cardsArray[card] == 104){
            iv.setImageResource(image104);
        }else  if(cardsArray[card] == 105){
            iv.setImageResource(image105);
        }else  if(cardsArray[card] == 106){
            iv.setImageResource(image106);
        }else  if(cardsArray[card] == 201){
            iv.setImageResource(image201);
        }else  if(cardsArray[card] == 202){
            iv.setImageResource(image202);
        }else  if(cardsArray[card] == 203){
            iv.setImageResource(image203);
        }else  if(cardsArray[card] == 204){
            iv.setImageResource(image204);
        }else  if(cardsArray[card] == 205){
            iv.setImageResource(image205);
        }else  if(cardsArray[card] == 206){
            iv.setImageResource(image206);
        }


        //this checks which value was chosen by user and saves it in a temp value
        if(cardNumber == 1){
            firstCard = cardsArray[card];
            if(firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }else if(cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            box1.setEnabled(false);
            box2.setEnabled(false);
            box3.setEnabled(false);
            box4.setEnabled(false);
            box21.setEnabled(false);
            box22.setEnabled(false);
            box23.setEnabled(false);
            box24.setEnabled(false);
            box31.setEnabled(false);
            box32.setEnabled(false);
            box33.setEnabled(false);
            box34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //this checks if the images chosen by player are the same
                    calculate();

                }
            },1000);
        }
    }

    private void calculate(){
        // if the images are the same im going to remove them and add points
        if(firstCard == secondCard){
            if(clickedFirst == 0){
                box1.setVisibility(View.INVISIBLE);
            } else  if(clickedFirst == 1){
                box2.setVisibility(View.INVISIBLE);
            }else  if(clickedFirst == 2){
                box3.setVisibility(View.INVISIBLE);
            }else  if(clickedFirst == 3){
                box4.setVisibility(View.INVISIBLE);
            }else  if(clickedFirst == 4){
                box21.setVisibility(View.INVISIBLE);
            }else  if(clickedFirst == 5){
                box22.setVisibility(View.INVISIBLE);
            }else  if(clickedFirst == 6){
                box23.setVisibility(View.INVISIBLE);
            }else  if(clickedFirst == 7){
                box24.setVisibility(View.INVISIBLE);
            }else  if(clickedFirst == 8){
                box31.setVisibility(View.INVISIBLE);
            }else  if(clickedFirst == 9){
                box32.setVisibility(View.INVISIBLE);
            }else  if(clickedFirst == 10){
                box33.setVisibility(View.INVISIBLE);
            }else  if(clickedFirst == 11){
                box34.setVisibility(View.INVISIBLE);
            }

            if(clickedSecond == 0){
                box1.setVisibility(View.INVISIBLE);
            } else  if(clickedSecond == 1){
                box2.setVisibility(View.INVISIBLE);
            }else  if(clickedSecond == 2){
                box3.setVisibility(View.INVISIBLE);
            }else  if(clickedSecond == 3){
                box4.setVisibility(View.INVISIBLE);
            }else  if(clickedSecond == 4){
                box21.setVisibility(View.INVISIBLE);
            }else  if(clickedSecond == 5){
                box22.setVisibility(View.INVISIBLE);
            }else  if(clickedSecond == 6){
                box23.setVisibility(View.INVISIBLE);
            }else  if(clickedSecond == 7){
                box24.setVisibility(View.INVISIBLE);
            }else  if(clickedSecond == 8){
                box31.setVisibility(View.INVISIBLE);
            }else  if(clickedSecond == 9){
                box32.setVisibility(View.INVISIBLE);
            }else  if(clickedSecond == 10){
                box33.setVisibility(View.INVISIBLE);
            }else  if(clickedSecond == 11){
                box34.setVisibility(View.INVISIBLE);
            }

            //this adds the points to the corresponding player
            if (turn == 1) {

                playerPoints++;
                tvPlayer1.setText("Player 1:" + playerPoints);
            } else   if (turn == 2) {

                cpuPoints++;
                tvPlayer2.setText("Player 2:" + cpuPoints);
            }
        } else {
            box1.setImageResource(R.drawable.question);
            box2.setImageResource(R.drawable.question);
            box3.setImageResource(R.drawable.question);
            box4.setImageResource(R.drawable.question);
            box21.setImageResource(R.drawable.question);
            box22.setImageResource(R.drawable.question);
            box23.setImageResource(R.drawable.question);
            box24.setImageResource(R.drawable.question);
            box31.setImageResource(R.drawable.question);
            box32.setImageResource(R.drawable.question);
            box33.setImageResource(R.drawable.question);
            box34.setImageResource(R.drawable.question);

            // this is going to change the players turn
            if(turn == 1){
                turn = 2;
                tvPlayer1.setTextColor(Color.GRAY);
                tvPlayer2.setTextColor(Color.BLACK);
            } else if(turn == 2){
                turn = 1;
                tvPlayer2.setTextColor(Color.GRAY);
                tvPlayer1.setTextColor(Color.BLACK);
            }
        }

        box1.setEnabled(true);
        box2.setEnabled(true);
        box3.setEnabled(true);
        box4.setEnabled(true);
        box21.setEnabled(true);
        box22.setEnabled(true);
        box23.setEnabled(true);
        box24.setEnabled(true);
        box31.setEnabled(true);
        box32.setEnabled(true);
        box33.setEnabled(true);
        box34.setEnabled(true);

        //this checks if the game has finished
        checkEnd();


    }

    private void checkEnd(){
        if(box1.getVisibility() == View.INVISIBLE &&
                box2.getVisibility() == View.INVISIBLE &&
                box3.getVisibility() == View.INVISIBLE &&
                box4.getVisibility() == View.INVISIBLE &&
                box21.getVisibility() == View.INVISIBLE &&
                box22.getVisibility() == View.INVISIBLE &&
                box23.getVisibility() == View.INVISIBLE &&
                box24.getVisibility() == View.INVISIBLE &&
                box31.getVisibility() == View.INVISIBLE &&
                box32.getVisibility() == View.INVISIBLE &&
                box33.getVisibility() == View.INVISIBLE &&
                box34.getVisibility() == View.INVISIBLE){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SecondActivity.this);
            alertDialogBuilder
                    .setMessage("GAME OVER!\n Player 1:" + playerPoints + "\nPlayer 2: " + cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void loadImages(){
        image101 = R.drawable.orna101;
        image102 = R.drawable.orna102;
        image103 = R.drawable.orna103;
        image104 = R.drawable.orna104;
        image105 = R.drawable.orna105;
        image106 = R.drawable.orna106;
        image201 = R.drawable.orna201;
        image202 = R.drawable.orna202;
        image203 = R.drawable.orna203;
        image204 = R.drawable.orna204;
        image205 = R.drawable.orna205;
        image206 = R.drawable.orna206;


    }
}