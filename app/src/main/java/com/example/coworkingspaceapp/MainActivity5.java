package com.example.coworkingspaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Intent intent5 = getIntent();
    }

    public void fbcl(View view) {
        startActivity(getOpenFacebookIntent());

    }
    public Intent getOpenFacebookIntent() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/skon.ayedi/"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/skon.ayedi/"));
        }
    }

    public void instacl(View view) {
        startActivity(getOpenInstagramIntent());
    }

    public Intent getOpenInstagramIntent() {
        try {
            getPackageManager().getPackageInfo("com.instagram.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/yossriabdedayem/"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/yossriabdedayem/"));
        }
    }
}