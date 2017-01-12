package assignment.android.acadgild.blinkingtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnBlink;
    TextView txtViewBlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBlink=(Button)findViewById(R.id.btnBlink);
        txtViewBlink=(TextView)findViewById(R.id.txtViewBlink);
        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startAnimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blinking_animation);
                txtViewBlink.startAnimation(startAnimation);
            }
        });
    }
}
