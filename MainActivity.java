package /*YOUR PACKAGE DIRECTORY GOES HERE*/;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Connect the graphics to variables*/
        final EditText firstname = (EditText) findViewById(R.id.firstnameTxt);
        final EditText surname = (EditText) findViewById(R.id.surnameTxt);
        final EditText address = (EditText) findViewById(R.id.addressTxt);
        final EditText pcode = (EditText) findViewById(R.id.postcodeTxt);
        final EditText gender = (EditText) findViewById(R.id.genderTxt);
        final EditText affil = (EditText) findViewById(R.id.affiliateTxt);
      
        Button nextButton = (Button) findViewById(R.id.nextButton);
        Button cancelButton = (Button) findViewById(R.id.cancelButton);


        /*Create a click listener for the  NEXT button, that leads to the next activity*/
        nextButton.setOnClickListener(
                new View.OnClickListener(){
        
                    @Override
                    public void onClick(View view) {
                        
                        /*create new instance of Intent object that helps us start the second activity*/
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        
                        /*create new bundle instance and use it with putExtra method in order to send 
                         *the data (text) from the first activity  to the second
                         */
                        Bundle b1 = new Bundle();
                        b1.putString("name", firstname.getText().toString());
                        intent.putExtras(b1);
                        startActivity(intent);
                    }
                }
        );

        /*Create a click listener for the CANCEL button,that clears the form*/
        cancelButton.setOnClickListener(
                new View.OnClickListener() {
        
                    @Override
                    public void onClick(View view) {
                        
                        firstname.setText("");
                        surname.setText("");
                        address.setText("");
                        pcode.setText("");
                        gender.setText("");
                        affil.setText("");
                    }
                }
        );

    }
}
