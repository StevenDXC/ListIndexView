package com.dxc.listindexview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.dxc.listindexview.widget.ListIndexView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListIndexView indexView = (ListIndexView)findViewById(R.id.index_view);
        String[] letters = new String[]{"A","B","C","D","E","F","G","H","J","K","L","M","N","P","Q"};
        assert indexView != null;
        indexView.setIndexLetters(letters);
        indexView.setOnTouchIndexListener(new ListIndexView.OnTouchIndexListener() {
            @Override
            public void onTouchIndex(int index) {
                Log.i("TouchIndex:",Integer.toString(index));
            }
        });
    }
}
