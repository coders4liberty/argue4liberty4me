package us.votedifferent.code4liberty.argue4me;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class argumentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argument);

        Bundle pickupData = getIntent().getExtras();
        Button retryButton = (Button) findViewById(R.id.tryAgain);

        if (pickupData == null) {
            return;
        }
            String receivedArgument = pickupData.getString("Argument");
            TextView newLine = (TextView) findViewById(R.id.Argument);
            newLine.setText(receivedArgument);

        retryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
            });

        }
    }
