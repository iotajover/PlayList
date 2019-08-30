package com.example.playlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String artistList[] = {"Bad Bunny", "Felipe Peláez", "Gilberto Santa Rosa", "Jessi Uribe", "Jorge Celedón", "Los Chinches Vallenatos", "Maluma", "Ozuna", "Paulo Londra", "Sech"};
    int photoList[] = {R.drawable.badbunny, R.drawable.felipepelaez, R.drawable.gilbertosantarosa, R.drawable.jessiuribe, R.drawable.jorgeceledon, R.drawable.loschinchesvallenatos, R.drawable.maluma, R.drawable.ozuna, R.drawable.paulolondra, R.drawable.sech};
    int videoList[] = {R.raw.badbunny, R.raw.felipepelaez, R.raw.gilbertosantarosa, R.raw.jessiuribe, R.raw.jorgeceledon, R.raw.loschinchevallenatos, R.raw.maluma, R.raw.ozuna, R.raw.paulolondra, R.raw.sech};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), artistList, photoList);
        simpleList.setAdapter(customAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(MainActivity.this, ActVideoView.class);
                intent.putExtra("image", videoList[position]); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}
