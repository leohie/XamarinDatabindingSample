package databinding.android.databindingexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import databinding.android.librarywithbinding.BindingSampleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = this.findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(getBaseContext(), BindingSampleActivity.class);
            startActivity(intent);
        });
    }
}
