package com.example.imageinternet;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView onlineimg,onlineimg1,onlineimg2,onlineimg3,onlineimg4,onlineimg5,onlineimg6,onlineimg7,onlineimg8,onlineimg9,onlineimg10,onlineimg11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onlineimg = findViewById(R.id.imageView);
        onlineimg1 = findViewById(R.id.imageView1);
        onlineimg2 = findViewById(R.id.imageView2);
        onlineimg3 = findViewById(R.id.imageView3);
        onlineimg4 = findViewById(R.id.imageView4);
        onlineimg5 = findViewById(R.id.imageView5);
        onlineimg6 = findViewById(R.id.imageView6);
        onlineimg7 = findViewById(R.id.imageView7);
        onlineimg8 = findViewById(R.id.imageView8);
        onlineimg9 = findViewById(R.id.imageView9);
        onlineimg10 = findViewById(R.id.imageView10);
        onlineimg11 = findViewById(R.id.imageView11);


        String uri = "https://cdn.pixabay.com/photo/2015/02/24/15/38/onion-647525_1280.jpg";
        Picasso.get().load(uri).placeholder(R.drawable.placeholder_avatar).into(onlineimg);

        Picasso.get().load("https://cdn.pixabay.com/photo/2017/11/26/00/11/vegetables-2977891_1280.jpg").placeholder(R.drawable.placeholder_avatar).into(onlineimg1);
        Picasso.get().load("https://cdn.pixabay.com/photo/2018/03/28/20/32/food-3270461_1280.jpg").placeholder(R.drawable.placeholder_avatar).into(onlineimg2);
        Picasso.get().load("https://cdn.pixabay.com/photo/2018/04/15/16/43/onion-3322048_1280.jpg").placeholder(R.drawable.placeholder_avatar).into(onlineimg3);
        Picasso.get().load("https://cdn.pixabay.com/photo/2019/04/28/18/24/sideburn-4163932_1280.jpg").placeholder(R.drawable.placeholder_avatar).into(onlineimg4);
        Picasso.get().load("https://cdn.pixabay.com/photo/2014/08/12/23/41/red-417106_1280.jpg").placeholder(R.drawable.placeholder_avatar).into(onlineimg5);
        Picasso.get().load("https://cdn.pixabay.com/photo/2017/02/27/23/36/greek-salad-2104592_1280.jpg").placeholder(R.drawable.placeholder_avatar).into(onlineimg6);
        Picasso.get().load("https://cdn.pixabay.com/photo/2017/06/21/00/35/tomato-2425561_1280.jpg").placeholder(R.drawable.placeholder_avatar).into(onlineimg7);
        Picasso.get().load("https://cdn.pixabay.com/photo/2017/01/31/08/32/meatballs-2023247_1280.jpg").placeholder(R.drawable.placeholder_avatar).into(onlineimg8);
        Picasso.get().load("https://cdn.pixabay.com/photo/2017/07/24/17/51/osso-buco-2535546_1280.jpg").placeholder(R.drawable.placeholder_avatar).into(onlineimg9);
        Picasso.get().load("https://cdn.pixabay.com/photo/2014/08/19/10/53/salad-421382_1280.jpg").placeholder(R.drawable.placeholder_avatar).into(onlineimg10);
        Picasso.get().load("https://cdn.pixabay.com/photo/2017/09/01/19/20/white-cabbage-2705228_1280.jpg").placeholder(R.drawable.placeholder_avatar).into(onlineimg11);


    }
}