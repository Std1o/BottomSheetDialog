package com.stdio.bottomsheetdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    BottomSheetDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                View view = getLayoutInflater().inflate(R.layout.fragment_bottom_sheet_dialog, null);

                dialog = new BottomSheetDialog(this);
                dialog.setContentView(view);
                dialog.show();
                break;
            default:
                Toast.makeText(this, String.valueOf(v.getId()), Toast.LENGTH_SHORT).show();
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }

}