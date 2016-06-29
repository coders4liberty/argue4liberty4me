package us.votedifferent.code4liberty.argue4me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // grab left button
        final Button leftButton = (Button) findViewById(R.id.left);
        Button rightButton = (Button) findViewById(R.id.right);

        final String argument = "Taxation is theft!";

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendLine(argument);
            }

                                      }

        );

    }

    private void sendLine(String argument) {
        Intent intent = new Intent(this, argumentActivity.class);
        intent.putExtra("Pickup Line", argument);
        startActivity(intent);
    }
}