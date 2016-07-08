package us.votedifferent.code4liberty.argue4me;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class argumentActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argument);

        final Bundle pickupData = getIntent().getExtras();
        Button copyButton = (Button) findViewById(R.id.copy);

        if (pickupData == null) {
            return;
        }
        final String receivedArgument = pickupData.getString("Argument");
        TextView newLine = (TextView) findViewById(R.id.Argument);
        newLine.setText(receivedArgument);

        copyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if the user selects copy
                //case R.id.menu_copy:

// Gets a handle to the clipboard service.
                ClipboardManager clipboard = (ClipboardManager)
                        getSystemService(Context.CLIPBOARD_SERVICE);
// Creates a clip object with the Intent in it. Its label is "Intent" and its data is
// the Intent object created previously

                if (receivedArgument.length() < 129) {
                    String clipString = receivedArgument + getString(R.string.hashtag);
                    ClipData clip = ClipData.newPlainText("argument", clipString);
                    // Set the clipboard's primary clip.
                    clipboard.setPrimaryClip(clip);
                    TextView newLine = (TextView) findViewById(R.id.copy);
                    String copied = getString(R.string.copied);
                    newLine.setText(copied);
                }

                else if (receivedArgument.length() < 113) {
                    String clipString = receivedArgument + getString(R.string.hashtag) + getString(R.string.coders4liberty);
                    ClipData clip = ClipData.newPlainText("argument", clipString);
                    clipboard.setPrimaryClip(clip);
                    TextView newLine = (TextView) findViewById(R.id.copy);
                    String copied = getString(R.string.copied);
                    newLine.setText(copied);
                }

                else  {
                    String clipString = receivedArgument;
                    ClipData clip = ClipData.newPlainText("argument", clipString);
                    clipboard.setPrimaryClip(clip);
                    TextView newLine = (TextView) findViewById(R.id.copy);
                    String copied = getString(R.string.copied);
                    newLine.setText(copied);
                }





            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "argument Page", // TODO: Define a title for the content shown.
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
                "argument Page", // TODO: Define a title for the content shown.
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
