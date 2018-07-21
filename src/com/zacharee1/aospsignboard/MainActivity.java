package com.zacharee1.aospsignboard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.ServiceManager;
import android.os.ISignBoardService;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

		ISignBoardService sbs = ISignBoardService.Stub.asInterface(ServiceManager.getService("signboardservice"));

        findViewById(R.id.add_test_view1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
				try {
					Log.d("SignBoardService", "Going to call service");
					sbs.addTestView1();
				} catch (Exception e) {
					Log.d("SignBoardService", "FAILED to call service");
					e.printStackTrace();
				}
            }
        });
        findViewById(R.id.add_test_view2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
				try {
					Log.d("SignBoardService", "Going to call service");
					sbs.addTestView2();
				} catch (Exception e) {
					Log.d("SignBoardService", "FAILED to call service");
					e.printStackTrace();
				}
            }
        });
        findViewById(R.id.add_test_view3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
				try {
					Log.d("SignBoardService", "Going to call service");
					sbs.addTestView3();
				} catch (Exception e) {
					Log.d("SignBoardService", "FAILED to call service");
					e.printStackTrace();
				}
            }
        });
        findViewById(R.id.add_test_view4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
				try {
					Log.d("SignBoardService", "Going to call service");
					sbs.addTestView4();
				} catch (Exception e) {
					Log.d("SignBoardService", "FAILED to call service");
					e.printStackTrace();
				}
            }
        });
        findViewById(R.id.remove_all_views).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
				try {
					Log.d("SignBoardService", "Going to call service");
					sbs.removeAllViews();
				} catch (Exception e) {
					Log.d("SignBoardService", "FAILED to call service");
					e.printStackTrace();
				}
            }
        });
    }

}
