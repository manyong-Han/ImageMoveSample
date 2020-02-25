package com.example.hanman_yong.example1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image1, image2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //출력하게될 위와 아래의 이미지뷰 정의
        this.image1 = (ImageView) findViewById(R.id.image1);
        this.image2 = (ImageView) findViewById(R.id.image2);
    }

    //switch - case 문을 이용하여 버튼을 활용한 이미지 토글
    public void toggleImage(View view) {
        Button button = (Button) findViewById(view.getId());

        switch (button.getId()) {

            //아래쪽으로 이동하는 버튼 클릭할때
            case R.id.downImageButton:
                this.image2.setImageDrawable(this.image1.getDrawable());
                this.image2.setVisibility(View.VISIBLE);
                this.image1.setVisibility(View.INVISIBLE);
                break;

            //위쪽으로 이동하는 버튼 클릭할때
            case R.id.upImageButton:
                this.image1.setImageDrawable(this.image2.getDrawable());
                this.image1.setVisibility(View.VISIBLE);
                this.image2.setVisibility(View.INVISIBLE);
        }
    }
}
