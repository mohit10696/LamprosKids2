package com.example.lamproskids;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.lamproskids.classinfo.classinfo;
import com.example.lamproskids.students.addStudent;
import com.example.lamproskids.students.manangestudent;
import com.example.lamproskids.teacher.addTeacher;
import com.example.lamproskids.teacher.manageteacher;
import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    int global_id;
    Menu dynamicmenu;
    boolean menuche = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Welcome to Dashboard");
        setSupportActionBar(toolbar);
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "New value added form will be here", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.home, menu);
        dynamicmenu = menu;

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.add_value) {
             if (global_id == R.id.nav_tools) {
                //manage teacher form from here
                 Intent i = new Intent(Home.this, addTeacher.class);
                 startActivity(i);

            } else if (global_id == R.id.nav_share) {
                //manange student form from here
                 Intent i = new Intent(Home.this, addStudent.class);
                 startActivity(i);
            } else{
//                 Snackbar.make(findViewById(R.id.home), "Not available here", Snackbar.LENGTH_LONG)
//                         .setAction("Action", null).show();
             }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment fragment = null;
        int id = item.getItemId();
        global_id = id;
        if (id == R.id.nav_home) {
            toolbar.setTitle("Welcome to Dashboard");
        } else if (id == R.id.nav_gallery) {
            toolbar.setTitle("Branch info");
            if(menuche){
                dynamicmenu.removeItem(R.id.add_value);
                menuche = false;
            }
            fragment = new branch();
        } else if (id == R.id.nav_slideshow) {
            toolbar.setTitle("Class info");
            if(menuche){
                dynamicmenu.removeItem(R.id.add_value);
                menuche = false;
            }
            fragment = new classinfo();
        } else if (id == R.id.nav_tools) {
            toolbar.setTitle("Manage Teachers");
            if (!menuche){
                getMenuInflater().inflate(R.menu.home, dynamicmenu);
                menuche = true;
            }
            fragment = new manageteacher();
        } else if (id == R.id.nav_share) {
            toolbar.setTitle("Manage Students");
            if (!menuche){
                getMenuInflater().inflate(R.menu.home, dynamicmenu);
                menuche = true;
            }
            fragment = new manangestudent();
        }else if (id == R.id.nav_cart){
            if(menuche){
                dynamicmenu.removeItem(R.id.add_value);
                menuche = false;
            }
            toolbar.setTitle("Manage Cart");
            // fragment = new manangestudent();
        } else if (id == R.id.nav_order){
            if(menuche){
                dynamicmenu.removeItem(R.id.add_value);
                menuche = false;
            }
            toolbar.setTitle("My Orders");
            // fragment = new manangestudent();
        }else if (id == R.id.nav_send) {
            Intent i = new Intent(Home.this,Login.class);
            startActivity(i);
            Home.this.finish();
        }
        if(fragment != null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.area,fragment);
            fragmentTransaction.commit();
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
