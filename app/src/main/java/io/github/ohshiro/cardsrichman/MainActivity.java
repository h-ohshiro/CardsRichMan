package io.github.ohshiro.cardsrichman;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton button1 = findViewById(R.id.toggleButton1);
        final ToggleButton button2 = findViewById(R.id.toggleButton2);
        final ToggleButton button3 = findViewById(R.id.toggleButton3);
        final ToggleButton button4 = findViewById(R.id.toggleButton4);
        final ToggleButton button5 = findViewById(R.id.toggleButton5);
        final ToggleButton button6 = findViewById(R.id.toggleButton6);
        final ToggleButton button7 = findViewById(R.id.toggleButton7);
        final ToggleButton button8 = findViewById(R.id.toggleButton8);
        final ToggleButton button9 = findViewById(R.id.toggleButton9);
        final ToggleButton button10 = findViewById(R.id.toggleButton10);
        final ToggleButton button11 = findViewById(R.id.toggleButton11);
        final ToggleButton button12 = findViewById(R.id.toggleButton12);
        final ToggleButton button13 = findViewById(R.id.toggleButton13);
        final ToggleButton button14 = findViewById(R.id.toggleButton14);
        final ToggleButton button15 = findViewById(R.id.toggleButton15);
        final ToggleButton button16 = findViewById(R.id.toggleButton16);
        final ToggleButton button17 = findViewById(R.id.toggleButton17);
        final ToggleButton button18 = findViewById(R.id.toggleButton18);
        final ToggleButton button19 = findViewById(R.id.toggleButton19);
        final ToggleButton button20 = findViewById(R.id.toggleButton20);
        final ToggleButton button21 = findViewById(R.id.toggleButton21);
        final ToggleButton button22 = findViewById(R.id.toggleButton22);
        final ToggleButton button23 = findViewById(R.id.toggleButton23);
        final ToggleButton button24 = findViewById(R.id.toggleButton24);
        final ToggleButton button25 = findViewById(R.id.toggleButton25);
        final ToggleButton button26 = findViewById(R.id.toggleButton26);
        final ToggleButton button27 = findViewById(R.id.toggleButton27);
        final ToggleButton button28 = findViewById(R.id.toggleButton28);
        final ToggleButton button29 = findViewById(R.id.toggleButton29);
        final ToggleButton button30 = findViewById(R.id.toggleButton30);
        final ToggleButton button31 = findViewById(R.id.toggleButton31);
        final ToggleButton button32 = findViewById(R.id.toggleButton32);
        final ToggleButton button33 = findViewById(R.id.toggleButton33);
        final ToggleButton button34 = findViewById(R.id.toggleButton34);
        final ToggleButton button35_5 = findViewById(R.id.toggleButton35_5);
        final ToggleButton button35 = findViewById(R.id.toggleButton35);
        final ToggleButton button36 = findViewById(R.id.toggleButton36);
        final ToggleButton button37 = findViewById(R.id.toggleButton37);
        final ToggleButton button38 = findViewById(R.id.toggleButton38);
        final ToggleButton button39 = findViewById(R.id.toggleButton39);
        final ToggleButton button40 = findViewById(R.id.toggleButton40);
        final ToggleButton button41 = findViewById(R.id.toggleButton41);
        final ToggleButton button42 = findViewById(R.id.toggleButton42);
        final ToggleButton button43 = findViewById(R.id.toggleButton43);
        final ToggleButton button44 = findViewById(R.id.toggleButton44);
        final ToggleButton button45 = findViewById(R.id.toggleButton45);
        final ToggleButton button46 = findViewById(R.id.toggleButton46);
        final ToggleButton button47 = findViewById(R.id.toggleButton47);
        final ToggleButton button48 = findViewById(R.id.toggleButton48);
        final ToggleButton button49 = findViewById(R.id.toggleButton49);
        final ToggleButton button50 = findViewById(R.id.toggleButton50);
        final ToggleButton button51 = findViewById(R.id.toggleButton51);
        final ToggleButton button52 = findViewById(R.id.toggleButton52);

        findViewById(R.id.clear)
                .setOnClickListener(v -> new AlertDialog.Builder(MainActivity.this)
                        .setTitle(R.string.title)
                        .setPositiveButton(
                                R.string.yes,
                                (dialog, which) -> {
                                    button1.setChecked(true);
                                    button2.setChecked(true);
                                    button3.setChecked(true);
                                    button4.setChecked(true);
                                    button5.setChecked(true);
                                    button6.setChecked(true);
                                    button7.setChecked(true);
                                    button8.setChecked(true);
                                    button9.setChecked(true);
                                    button10.setChecked(true);
                                    button11.setChecked(true);
                                    button12.setChecked(true);
                                    button13.setChecked(true);
                                    button14.setChecked(true);
                                    button15.setChecked(true);
                                    button16.setChecked(true);
                                    button17.setChecked(true);
                                    button18.setChecked(true);
                                    button19.setChecked(true);
                                    button20.setChecked(true);
                                    button21.setChecked(true);
                                    button22.setChecked(true);
                                    button23.setChecked(true);
                                    button24.setChecked(true);
                                    button25.setChecked(true);
                                    button26.setChecked(true);
                                    button27.setChecked(true);
                                    button28.setChecked(true);
                                    button29.setChecked(true);
                                    button30.setChecked(true);
                                    button31.setChecked(true);
                                    button32.setChecked(true);
                                    button33.setChecked(true);
                                    button34.setChecked(true);
                                    button35_5.setChecked(true);
                                    button35.setChecked(true);
                                    button36.setChecked(true);
                                    button37.setChecked(true);
                                    button38.setChecked(true);
                                    button39.setChecked(true);
                                    button40.setChecked(true);
                                    button41.setChecked(true);
                                    button42.setChecked(true);
                                    button43.setChecked(true);
                                    button44.setChecked(true);
                                    button45.setChecked(true);
                                    button46.setChecked(true);
                                    button47.setChecked(true);
                                    button48.setChecked(true);
                                    button49.setChecked(true);
                                    button50.setChecked(true);
                                    button51.setChecked(true);
                                    button52.setChecked(true);
                                })
                        .setNegativeButton(
                                R.string.no,
                                (dialog, which) -> {
                                })
                        .show());
}}

