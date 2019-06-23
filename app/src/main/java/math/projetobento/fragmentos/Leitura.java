package math.projetobento.fragmentos;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import math.projetobento.Centro;
import math.projetobento.R;
import math.projetobento.gerenciadores.Capitulo;
import math.projetobento.gerenciadores.CapituloEstatico;

public class Leitura extends Fragment {

    private static final String CAPITULO = "capitulo";
    private String mParam1;
    private String mParam2;

    private Capitulo c;
    private TextView txt;
    private boolean b = false;
    private ImageView play;

    private OnFragmentInteractionListener mListener;

    public Leitura() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_leitura, container, false);
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(boolean b);
    }

    public void mandaToque(){
        if (!b) {
            CapituloEstatico.n++;
            Intent t = new Intent(getActivity().getBaseContext(), Centro.class);
            t.putExtra("Clique", true);
            getActivity().startActivity(t);

        }else if (CapituloEstatico.n != 0){
            Intent t = new Intent(getActivity().getBaseContext(), Centro.class);
            t.putExtra("Clique", false);
            getActivity().startActivity(t);
        }
        b = true;
    }

    @Override
    public void onResume() {
        super.onResume();

        setComponentes();

        txt.setText(c.getTexto());

        setCores(c);
        setImagem(c);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mandaToque();
            }
        });
    }

    public void setComponentes() {
        c = (Capitulo) getArguments().getSerializable("capitulo");
        txt = getView().findViewById(R.id.txtLeitura);
        play = getView().findViewById(R.id.btnPlay);
    }

    public void setCores(Capitulo c) {
        txt.setTextColor(c.getCor());
        play.setColorFilter(c.getCor());
    }

    public void setImagem(Capitulo c) {

        ImageView img = getView().findViewById(R.id.imgLeitura);

        switch (c.getIdCapitulo()) {
            case 2:
                Picasso.get().load(R.drawable.f01).placeholder(R.drawable.f01).centerInside().fit().into(img);
                break;
            case 3:
                Picasso.get().load(R.drawable.f02).placeholder(R.drawable.f02).centerInside().fit().into(img);
                break;
            case 4:
                Picasso.get().load(R.drawable.f03).placeholder(R.drawable.f03).centerInside().fit().into(img);
                break;
            case 5:
                Picasso.get().load(R.drawable.f04).placeholder(R.drawable.f04).centerInside().fit().into(img);
                break;
            case 6:
                Picasso.get().load(R.drawable.f05).placeholder(R.drawable.f05).centerInside().fit().into(img);
                break;
            case 7:
                Picasso.get().load(R.drawable.f06).placeholder(R.drawable.f06).centerInside().fit().into(img);
                break;
            case 8:
                Picasso.get().load(R.drawable.f07).placeholder(R.drawable.f07).centerInside().fit().into(img);
                break;
            case 9:
                Picasso.get().load(R.drawable.f08).placeholder(R.drawable.f08).centerInside().fit().into(img);
                break;
            case 10:
                Picasso.get().load(R.drawable.f09).placeholder(R.drawable.f09).centerInside().fit().into(img);
                break;
            case 11:
                Picasso.get().load(R.drawable.f10).placeholder(R.drawable.f10).centerInside().fit().into(img);
                break;
            case 12:
                Picasso.get().load(R.drawable.f11).placeholder(R.drawable.f11).centerInside().fit().into(img);
                break;
            case 13:
                Picasso.get().load(R.drawable.f12).placeholder(R.drawable.f12).centerInside().fit().into(img);
                play.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
