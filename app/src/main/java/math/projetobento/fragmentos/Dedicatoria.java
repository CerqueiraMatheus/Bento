package math.projetobento.fragmentos;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import math.projetobento.Centro;
import math.projetobento.R;
import math.projetobento.gerenciadores.Capitulo;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Dedicatoria.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Dedicatoria#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Dedicatoria extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private boolean b = false;
    private Capitulo c;
    private TextView txt;
    private ImageView play;

    private OnFragmentInteractionListener mListener;

    public Dedicatoria() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dedicatoria, container, false);
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(boolean b);
    }


    public void mandaToque(){
        if (!b) {
            Intent t = new Intent(getActivity().getBaseContext(), Centro.class);
            t.putExtra("Clique", true);
            getActivity().startActivity(t);
            b = true;
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        setComponentes();

        txt.setText(c.getTexto());

        setCores(c);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mandaToque();
            }
        });
    }

    public void setComponentes() {
        c = (Capitulo) getArguments().getSerializable("capitulo");
        txt = getView().findViewById(R.id.txtDedicatoria);
        play = getView().findViewById(R.id.btnDedicatoria);
    }

    public void setCores(Capitulo c) {
        txt.setTextColor(c.getCor());
        play.setColorFilter(c.getCor());
    }}
