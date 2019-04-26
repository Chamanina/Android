package com.example.diabete;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConsulterProtocole extends MainActivity
{
    private	Button	button1	;
    private	Button	button2;
    @Override
    public	void	onCreate(Bundle	savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.consulter_protocole);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button1.setOnClickListener	(new View.OnClickListener()
        {
            public	void	onClick	(View	v)
            {
                setResult(RESULT_OK);
                finish();	//l’ac1vité	est	terminée	et	on	retourne	à	l’ac1vité	éme>rice
            }
        });
        button2.setOnClickListener	(new View.OnClickListener()	{
            public	void	onClick	(View	v)	{
                setResult(RESULT_CANCELED);
                finish();	//l’ac1vité	est	terminée	et	on	retourne	à	l’ac1vité	éme>rice
            }
        });
    }
}