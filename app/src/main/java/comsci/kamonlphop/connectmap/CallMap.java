package comsci.kamonlphop.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);




        }//end maincall
        public void runCallMap(View view){

            EditText latitude = (EditText) findViewById(R.id.mapLat);
            EditText longtutude = (EditText) findViewById(R.id.mayLong);
            EditText labell = (EditText) findViewById(R.id.mapLabel);

            String lat = latitude.getText().toString().trim();
            String longti = longtutude.getText().toString().trim();
            String mlabell = labell.getText().toString().trim();

            Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:"+lat+","+longti+"("+mlabell+")");//link googlemap
            Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
            //mapIntent.setPackage("com.google.andriod.app.maps");//ใช้งานกับโทรศัพท์มือถืือ(ใช้งานกับgooglemap โดยตรง)
            startActivity(mapIntent);

        }//end runcallmap
}//end class
