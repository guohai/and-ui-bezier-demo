package org.xkit.and.demo.bezier;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(org.xkit.and.demo.bezier.R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(org.xkit.and.demo.bezier.R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == org.xkit.and.demo.bezier.R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onHitMeToShowBezier(View v) {
        ArcTranslateAnimation animation = new ArcTranslateAnimation(
                0, 600, 0, 800);
        animation
                .setInterpolator(new LinearInterpolator());
        animation.setDuration(3000);
        animation.setFillAfter(true);

        findViewById(R.id.anim_id).startAnimation(animation);
    }
}
