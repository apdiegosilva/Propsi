package propsi.com.propsi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        Button btnContato = (Button) findViewById(R.id.btnContato);
        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog;
                dialog = new AlertDialog.Builder(Sobre.this);
                dialog.setTitle("Contato");
                dialog.setMessage("Email: email@email.com.br"+
                        "\nTelefone: (37)9 9999-0000"+
                        "\nCidade: Bom Despacho/MG");
                dialog.setIcon(android.R.drawable.ic_dialog_email);
                dialog.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.create();
                dialog.show();
            }
        });
    }
}
