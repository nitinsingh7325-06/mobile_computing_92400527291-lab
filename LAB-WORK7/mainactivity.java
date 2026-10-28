
package com.lb.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e_name, e_contact;
    Button b_desing1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        b_desing1 = findViewById(R.id.b_desing1);
        e_name = findViewById(R.id.n_e_name);
        e_contact = findViewById(R.id.n_e_contact);

        // Button click listener
        b_desing1.setOnClickListener(v -> {

            String name = e_name.getText().toString();
            String contact = e_contact.getText().toString();

            // Explicit Intent
            Intent intent = new Intent(
                    MainActivity.this,
                    design1.class
            );

            // Pass data to the next Activity
            intent.putExtra("name", name);
            intent.putExtra("contact", contact);

            startActivity(intent);
        });
    }
}
