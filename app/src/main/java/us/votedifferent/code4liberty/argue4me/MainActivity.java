package us.votedifferent.code4liberty.argue4me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    // iteration variable for foreign policy
    public int wi = 0;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // grab left button
        final Button taxButton = (Button) findViewById(R.id.taxation);
        Button drugButton = (Button) findViewById(R.id.drug);
        Button warButton = (Button) findViewById(R.id.war);
        Button corpButton = (Button) findViewById(R.id.corp);

        final String[] drugList = {"Who owns your body? You or the government?"};

        final String[] taxList = {"Taxation is theft!"};

        final String[] econList = {"End all corporate welfare."};

        final String[] warList = {"Free trade with all. Entangling alliances with no one.", "War is the health of the state"};
        final int warSize = warList.length;


        final String drugLine = "Who owns your body? You or the government?";
        final String taxLine = "Taxation is theft!";
        final String corpLine = "End all corporate welfare.";
        final String warLine = "Free trade with all. Entangling alliances with no one.";

        drugButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int w = + rand.nextInt((warSize) + 1);
                sendLine(taxList[w]);

            }
        });

        taxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendLine(taxList[0]);
            }
        });

        corpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendLine(econList[0]);
            }
        });

        warButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendLine(warList[0]);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void sendLine(String argument) {
        Intent intent = new Intent(this, argumentActivity.class);
        intent.putExtra("Argument", argument);
        startActivity(intent);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://us.votedifferent.code4liberty.argue4me/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://us.votedifferent.code4liberty.argue4me/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}