package propsi.com.propsi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Vagas extends AppCompatActivity {
    AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vagas);
        TextView info1 = (TextView) findViewById(R.id.txtInformacoes1);
        TextView info2 = (TextView) findViewById(R.id.txtInformacoes2);
        TextView info3 = (TextView) findViewById(R.id.txtInformacoes3);
        TextView info4 = (TextView) findViewById(R.id.txtInformacoes4);

        info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new AlertDialog.Builder(Vagas.this);
                dialog.setTitle("Informações");
                dialog.setMessage("Email: email@email.com.br"+
                "\nTelefone: (37)9 9999-0000"+
                "\nSálario: a combinar"+
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
        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new AlertDialog.Builder(Vagas.this);
                dialog.setTitle("Informações");
                dialog.setMessage("Email: email@email.com.br"+
                        "\nTelefone: (37)9 9999-0000"+
                        "\nSálario: a combinar"+
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
        info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new AlertDialog.Builder(Vagas.this);
                dialog.setTitle("Informações");
                dialog.setMessage("Email: email@email.com.br"+
                        "\nTelefone: (37)9 9999-0000"+
                        "\nSálario: a combinar"+
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
        info4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new AlertDialog.Builder(Vagas.this);
                dialog.setTitle("Informações");
                dialog.setMessage("Email: email@email.com.br"+
                        "\nTelefone: (37)9 9999-0000"+
                        "\nSálario: a combinar"+
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
