package com.example.jack.animationactivivty;

import android.animation.ObjectAnimator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);
        LinearLayout.LayoutParams params= (LinearLayout.LayoutParams) iv.getLayoutParams();
        iv.setPivotY(50);
        iv.setPivotX(50);
        iv.setLayoutParams(params);


//     Manimator(0);

//        Button bt= (Button) findViewById(R.id.bt);
//        bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {



            ObjectAnimator animator1 =ObjectAnimator.ofFloat(iv, View.ROTATION, -360, 0);
//            animator1.setInterpolator(new );
        //动画次数的次数
            animator1.setRepeatCount(10);
            animator1.setDuration(1000);
                    animator1.start();

//        });

    }

    private void Manimator(int m) {
        ObjectAnimator animator1 =ObjectAnimator.ofFloat(iv, View.ROTATION, -360, 0);
//                animator1.setInterpolator(new LinearOutSlowInInterpolator());
        animator1.setDuration(1000);
        for (int i = 0; i < 10; i++) {

            animator1.start();

        }
        m++;
        if(m<100)
        {
            Log.e("", "Manimator: "+m );
            animator1.clone();
            Manimator(m);
        }
        else
        {
            return;
        }
    }
}
