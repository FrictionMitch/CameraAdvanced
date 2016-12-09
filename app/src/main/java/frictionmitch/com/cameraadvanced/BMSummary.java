package frictionmitch.com.cameraadvanced;


import java.io.IOException;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class BMSummary extends Activity {

//    private static final int TAKE_PICTURE_REQUEST_B = 100;

    private Button mBackButton;
    private ImageButton mBackImageButton;
    private Context mContext;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        Intent intent = getIntent();
//        String value = intent.getStringExtra("key"); //if it's a string you stored.
        mBackButton = (Button) findViewById(R.id.back_button);
        mBackButton.setOnClickListener(mBackButtonClickListener);



        mTextView = (TextView)findViewById(R.id.text_view);
        mTextView.setText("Fuck");
        randomText();
        mTextView.setText(randomText().toString());
        Toast.makeText(this, mTextView.getText(), Toast.LENGTH_SHORT).show();

//        mSwitchCamera = (Button) findViewById(R.id.switch_camera);
//        mSwitchCamera.setOnClickListener(mSwitchCameraButtonClickListener);

//        mBackImageButton = (ImageButton)findViewById(R.id.backImageButton);
//        mBackImageButton.setOnClickListener(mBackButtonClickListener);
    }

    private OnClickListener mBackButtonClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getBaseContext(), "Testing", Toast.LENGTH_SHORT).show();
//            finish();
//            setContentView(R.layout.activity_main);
//            startActivityForResult(new Intent(BMSummary.this, CameraActivity.class), TAKE_PICTURE_REQUEST_B);

        }
    };

    public String randomText() {
            String[] arrayOfStrings = mContext.getResources().getStringArray(R.array.heading);
            String text = arrayOfStrings[new Random().nextInt(arrayOfStrings.length)];

        return text;
    }

    private OnClickListener showToast = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getBaseContext(), "Testing", Toast.LENGTH_SHORT).show();
//            finish();
//            setContentView(R.layout.activity_main);
//            startActivityForResult(new Intent(BMSummary.this, CameraActivity.class), TAKE_PICTURE_REQUEST_B);

        }
    };

}
