package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String input_item = getIntent().getStringExtra("item");
        // pos = getIntent().getIntExtra("pos");
        pos = getIntent().getIntExtra("pos", -1);

        EditText etNewItem = (EditText) findViewById(R.id.etEditItem);
        etNewItem.setText(input_item);
    }

    public void onSaveItem(View v) {
        EditText etEditItem = (EditText) findViewById(R.id.etEditItem);
        String itemText = etEditItem.getText().toString();

        Intent data = new Intent();
        data.putExtra("item", etEditItem.getText().toString());
        data.putExtra("pos", pos);
        setResult(RESULT_OK, data);
        finish();
    }
}
