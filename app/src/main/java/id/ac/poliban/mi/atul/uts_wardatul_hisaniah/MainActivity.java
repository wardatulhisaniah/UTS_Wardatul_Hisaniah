package id.ac.poliban.mi.atul.uts_wardatul_hisaniah;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup mRadioGroup = findViewById(R.id.mRadioGroup);
        EditText etNama = findViewById(R.id.etNama);
        EditText etNP = findViewById(R.id.etNP);
        EditText etAlamat = findViewById(R.id.etAlamat);
        EditText etTelp = findViewById(R.id.etTelp);
        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);
        Spinner spAgama = findViewById(R.id.spAgama);

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNama.getText().clear();
                etNP.getText().clear();
                etAlamat.getText().clear();
                etTelp.getText().clear();
                mRadioGroup.clearCheck();
                spAgama.setAdapter(null);
            }
        });

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Nama" + etNama + "/n" , Toast.LENGTH_SHORT).show();
            }
        });

        btSubmit.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("Info Registrasi")
                    .setPositiveButton("OK", null).show();

        });


    }
}
