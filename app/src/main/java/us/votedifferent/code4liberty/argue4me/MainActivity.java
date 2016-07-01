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

        final String leftLine = "Who owns you? You or the government?";
        final String rightLine = "Taxation is theft!";

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendLine(leftLine);
            }
        });

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendLine(rightLine);
            }
        });

    }

    private void sendLine(String argument) {
        Intent intent = new Intent(this, argumentActivity.class);
        intent.putExtra("Argument", argument);
        startActivity(intent);
    }
}