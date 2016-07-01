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
        final Button taxButton = (Button) findViewById(R.id.taxation);
        Button drugButton = (Button) findViewById(R.id.drug);
        Button warButton = (Button) findViewById(R.id.war);
        Button corpButton = (Button) findViewById(R.id.corp);

        final String drugLine = "Who owns your body? You or the government?";
        final String taxLine = "Taxation is theft!";
        final String corpLine = "End all corporate welfare.";
        final String warLine = "Free trade with all. Entangling alliances with no one.";

        drugButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendLine(drugLine);
            }
        });

        taxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendLine(taxLine);
            }
        });

        corpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendLine(corpLine);
            }
        });

        warButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendLine(warLine);
            }
        });

    }

    private void sendLine(String argument) {
        Intent intent = new Intent(this, argumentActivity.class);
        intent.putExtra("Argument", argument);
        startActivity(intent);
    }
}