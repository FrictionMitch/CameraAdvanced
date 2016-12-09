package frictionmitch.com.cameraadvanced;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BMSummary extends Activity{

//    private static final int TAKE_PICTURE_REQUEST_B = 100;

    private Button mBackButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_summary);

        mBackButton = (Button) findViewById(R.id.back_button);
        mBackButton.setOnClickListener(mBackButtonClickListener);


//    The best way is you declare you Strings as an Array, then get it like this:
//
//    String[] arrayOfStrings = context.getResources().getStringArray(R.array.your_string_array);
//    String randomString = arrayOfStrings[new Random().nextInt(arrayOfStrings.length)];
    }

    private View.OnClickListener mBackButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setContentView(R.layout.activity_main);
//            startActivityForResult(new Intent(BMSummary.this, CameraActivity.class), TAKE_PICTURE_REQUEST_B);

        }
    };
}
