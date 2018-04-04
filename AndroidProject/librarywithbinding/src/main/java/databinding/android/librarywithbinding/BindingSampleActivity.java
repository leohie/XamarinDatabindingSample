package databinding.android.librarywithbinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import databinding.android.librarywithbinding.databinding.ActivityBindingSampleBinding;

public class BindingSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBindingSampleBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_sample);
        binding.setViewData(new SourceViewData());
    }

}
