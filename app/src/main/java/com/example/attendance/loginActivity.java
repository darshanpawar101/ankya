


package com.example.attendance;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class loginActivity extends AppCompatActivity {

    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
    }



    public void takeat(View view) {

        String tuid = user.getText().toString();
        String Pass = pass.getText().toString();

        background bg = new background(this);
        bg.execute(tuid,Pass);

        Intent intent = new Intent(this, takeatActivity.class);
        startActivity(intent);

    }

    public void signup(View view) {
        Intent intent = new Intent(this, signupActivity.class);
        startActivity(intent);
    }


    public void login(View view) {
    }
}
