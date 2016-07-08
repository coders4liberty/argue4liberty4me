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



    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // grab buttons
        final Button taxButton = (Button) findViewById(R.id.taxation);
        Button drugButton = (Button) findViewById(R.id.drug);
        Button warButton = (Button) findViewById(R.id.war);
        Button corpButton = (Button) findViewById(R.id.corp);
        Button privButton = (Button) findViewById(R.id.privacyButton);
        Button gunButton = (Button) findViewById(R.id.guns);

        // add arguments to these arrays of strings.
        final String[] drugList = {getString(R.string.drug0), getString(R.string.drug1),
                getString(R.string.drug2), getString(R.string.drug3), getString(R.string.drug4),
                getString(R.string.drug5), getString(R.string.drug6), getString(R.string.drug7),
                getString(R.string.drug8), getString(R.string.drug9), getString(R.string.drug10),
                getString(R.string.drug11), getString(R.string.drug12), getString(R.string.drug13),
                getString(R.string.drug14), getString(R.string.drug15), getString(R.string.drug16),
                getString(R.string.drug17), getString(R.string.drug18)};
        final int drugSize = drugList.length;

        final String[] warList = {getString(R.string.war0), getString(R.string.war1),
                getString(R.string.war2), getString(R.string.war3), getString(R.string.war4),
                getString(R.string.war5), getString(R.string.war6), getString(R.string.war6),
                getString(R.string.war7), getString(R.string.war8), getString(R.string.war9),
                getString(R.string.war10), getString(R.string.war11), getString(R.string.war12),
                getString(R.string.war13), getString(R.string.war14)};
        final int warSize = warList.length;

        final String[] econList = {getString(R.string.econ0), getString(R.string.econ1),
                getString(R.string.econ2), getString(R.string.econ3), getString(R.string.econ4)};
        final int econSize = econList.length;

        final String[] taxList = {getString(R.string.tax0), getString(R.string.tax1),
                getString(R.string.tax2), getString(R.string.tax3), getString(R.string.tax4),
                getString(R.string.tax5),  getString(R.string.tax6), getString(R.string.tax7),
                getString(R.string.tax8),  getString(R.string.tax9), getString(R.string.tax10),
                getString(R.string.tax11),  getString(R.string.tax12)};
        final int taxSize = taxList.length;

        final String[] privList = {getString(R.string.privacy1), getString(R.string.privacy2),
                getString(R.string.privacy3), getString(R.string.privacy4), getString(R.string.privacy5),
                getString(R.string.privacy6), getString(R.string.privacy7), getString(R.string.privacy8),
                getString(R.string.privacy9)};
        final int privSize = privList.length;

        final String[] gunList = {getString(R.string.gun0), getString(R.string.gun1),
                getString(R.string.gun2), getString(R.string.gun3), getString(R.string.gun4)};
        final int gunSize = gunList.length;


        warButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int w = + rand.nextInt(warSize);
                sendLine(warList[w]);
            }
        });

        taxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int w = + rand.nextInt(taxSize);
                sendLine(taxList[w]);
            }
        });

        corpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int w = + rand.nextInt(econSize);
                sendLine(econList[w]);
            }
        });

        drugButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int w = + rand.nextInt(drugSize);
                sendLine(drugList[w]);
            }
        });

        privButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int w = + rand.nextInt(privSize);
                sendLine(privList[w]);
            }
        });

        gunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int w = + rand.nextInt(gunSize);
                sendLine(gunList[w]);
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
