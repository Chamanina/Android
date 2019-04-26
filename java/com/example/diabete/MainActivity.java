package com.example.diabete;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        Button button = (Button) this.findViewById(R.id.button);
        Button buttonConsulter = (Button) this.findViewById(R.id.buttonConsulter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Protocole.class);
                startActivityForResult(intent,1);
            }
        });
        buttonConsulter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,ConsulterProtocole.class);
                startActivityForResult(intent,1);
            }
        });
    }

    public void	onActivityResult (int requestCode, int resultCode, Intent data)
    {
        switch	(requestCode)
        {//intéressant	si	plusieurs	requestCode	suite	à	plusieurs	intent
            case (1):
                switch (resultCode)
                {
                    case RESULT_OK:
                        Toast.makeText(this,"Votre protocole a bien été enregistré.",
                                Toast.LENGTH_SHORT).show();
                        return;
                    case RESULT_CANCELED:
                        Toast.makeText(this,"Bienvenue sur Diabe'tel.",
                                Toast.LENGTH_SHORT).show();
                        return;
                }	//	fin	switch	(resultCode)
        }//	fin	switch	(requestCode)
    }//	fin	onAc1vityResult
}//	fin	classe