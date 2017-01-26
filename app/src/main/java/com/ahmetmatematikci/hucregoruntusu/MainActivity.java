package com.ahmetmatematikci.hucregoruntusu;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView)findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));
    }

    public class ImageAdapter extends BaseAdapter {
        private Context mContext;

        public ImageAdapter(Context c) {
            mContext = c;
        }

        @Override
        public int getCount() {
            return mThumbIds.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageview;
            if (view ==null) {
                imageview = new ImageView(mContext);
                imageview.setLayoutParams(new GridView.LayoutParams(85,85));
                imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageview.setPadding(8,8,8,8);
            } else {
                imageview = (ImageView)view;
            }
            imageview.setImageResource(mThumbIds[i]);
            return imageview;
        }

    

        private Integer[] mThumbIds = {
                R.drawable.d, R.drawable.b,
                R.drawable.e, R.drawable.c,
                R.drawable.f, R.drawable.b,
                R.drawable.g, R.drawable.b

        };

    }
}



