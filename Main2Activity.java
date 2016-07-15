package /*YOUR PACKAGE DIRECTORY GOES HERE*/;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*Connect the graphics to variables*/
        Button gobackButton = (Button) findViewById(R.id.gobackbutton);
        TextView tv = (TextView)findViewById(R.id.textView7);
        
        /*Create a bundle in order to get the data from the previous activity and print them on the current screen*/
        Bundle extras = getIntent().getExtras();
        /*Convert the data to string format and print them in the textView*/
        tv.setText(extras.getString("name"));

        /*Create a click listener for the button that finishes the current activity and returns to the previous screen*/
        gobackButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
            
                Main2Activity.this.finish();
                
              /*The following example would open a new screen without closing the current*/
              /*  Intent intent = new Intent(Main2Activity.this, MainActivity.class);
               *  startActivity(intent);
               */
                
            }
        });
    }

}
