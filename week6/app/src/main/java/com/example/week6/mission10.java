package com.example.week6;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Adapter;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class mission10 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    mission10MainFragment mainFragment;
    mission10Fragment1 fragment1;
    mission10Fragment2 fragment2;
    mission10Fragment3 fragment3;
    Toolbar toolbar;
    DrawerLayout drawer;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission10);

        mainFragment = new mission10MainFragment();
        fragment2 = new mission10Fragment2();
        fragment3 = new mission10Fragment3();

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();

        BottomNavigationView bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu1 :
                        Toast.makeText(getApplicationContext(),"1번째", Toast.LENGTH_LONG).show();
                        toolbar.setTitle("첫 번째 화면 2018038053 유병주");
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();
                        return true;
                    case R.id.menu2 :
                        Toast.makeText(getApplicationContext(),"2번째", Toast.LENGTH_LONG).show();
                        toolbar.setTitle("두 번째 화면 2018038053 유병주");
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment2).commit();
                        return true;
                    case R.id.menu3 :
                        Toast.makeText(getApplicationContext(),"3번째", Toast.LENGTH_LONG).show();
                        toolbar.setTitle("세 번째 화면 2018038053 유병주");
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment3).commit();
                        return true;

                }
                return false;
            }
        });
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menu1){
            toolbar.setTitle("첫 번째 화면 2018038065 김광모");
            getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();
        }
        else if(id == R.id.menu2){
            toolbar.setTitle("두 번째 화면 2018038065 김광모");
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment2).commit();
        }
        else if(id == R.id.menu3){
            toolbar.setTitle("세 번째 화면 2018038065 김광모");
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment3).commit();
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed(){
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}