package ir.radindev.myapplication;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {
    //1
    MaterialCardView cardView;

    ImageButton showButton;

    LinearLayout hiddenLayout;
    //2
    ImageButton button_Location;
    MaterialCardView cardView_location;
    LinearLayout layout_Location;

    //3
    ImageButton button_Calendar;
    MaterialCardView cardView_Calendar;
    LinearLayout layout_Calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //3
        cardView_Calendar = findViewById(R.id.material_Calendar);
        button_Calendar = findViewById(R.id.image_Calender);
        layout_Calendar = findViewById(R.id.layout_Calendar);

        //2
        cardView_location = findViewById(R.id.material_Location);
        button_Location = findViewById(R.id.image_Location);
        layout_Location = findViewById(R.id.layout_Location);

        //1
        cardView = findViewById(R.id.material_card_view);
        showButton = findViewById(R.id.image_button);
        hiddenLayout = findViewById(R.id.layout_expand);

        showButton.setOnClickListener(view -> {
            if (hiddenLayout.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());

                hiddenLayout.setVisibility(View.GONE);
                showButton.setImageResource(R.drawable.ic_expand);
            } else {
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                hiddenLayout.setVisibility(View.VISIBLE);
                showButton.setImageResource(R.drawable.ic_expand_less);
            }

        });
        button_Location.setOnClickListener(view -> {
            if (layout_Location.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(cardView_location, new AutoTransition());

                layout_Location.setVisibility(View.GONE);
                button_Location.setImageResource(R.drawable.ic_expand);
            } else {
                TransitionManager.beginDelayedTransition(cardView_location, new AutoTransition());
                layout_Location.setVisibility(View.VISIBLE);
                button_Location.setImageResource(R.drawable.ic_expand_less);
            }

        });
        button_Calendar.setOnClickListener(view -> {
            if (layout_Calendar.getVisibility() == View.VISIBLE) {
                TransitionManager.beginDelayedTransition(cardView_Calendar, new AutoTransition());

                layout_Calendar.setVisibility(View.GONE);
                button_Calendar.setImageResource(R.drawable.ic_expand);
            } else {
                TransitionManager.beginDelayedTransition(cardView_Calendar, new AutoTransition());
                layout_Calendar.setVisibility(View.VISIBLE);
                button_Calendar.setImageResource(R.drawable.ic_expand_less);
            }

        });

    }
}