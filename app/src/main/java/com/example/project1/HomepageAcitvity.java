package com.example.project1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

/*import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;*/
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class HomepageAcitvity extends AppCompatActivity {
    //ImageSlider imageSlider;
    GridView gridView;

    BottomNavigationView bottomNavigationView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage_acitvity);

        bottomNavigationView= findViewById(R.id.nav_Viewid);
        replacedFragment(new Shop ());

      //  gridView=findViewById(R.id.gridviewid);
      //  Myadapter myadapter = new Myadapter();
       // gridView.setAdapter(myadapter);


       /* ArrayList<SlideModel> slideModels= new ArrayList<SlideModel>();
        slideModels.add(new SlideModel(R.drawable.file, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.nice1, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels);*/


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.shop){
                    replacedFragment(new Shop());
                }
                return false;
            }
        });



        }

    public  void shopback(View view){
        onBackPressed();

    }
    private void replacedFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.framelayout,fragment);
        transaction.commit();

    }


/*private class Myadapter extends BaseAdapter{


    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View myview=layoutInflater.inflate(R.layout.expandebol,parent,false);


        LinearLayout motherlayout=myview.findViewById(R.id.motherlayout);
        RelativeLayout itemcliekd=myview.findViewById(R.id.itemclieked);


        itemcliekd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(HomepageAcitvity.this, "woww", Toast.LENGTH_SHORT).show();

            }
        });

        return myview;
    }
}*/


}