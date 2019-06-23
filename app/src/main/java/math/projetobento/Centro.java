package math.projetobento;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import math.projetobento.fragmentos.Dedicatoria;
import math.projetobento.fragmentos.Encerramento;
import math.projetobento.fragmentos.Inicio;
import math.projetobento.fragmentos.Leitura;
import math.projetobento.gerenciadores.Capitulo;
import math.projetobento.gerenciadores.CapituloControle;
import math.projetobento.gerenciadores.CapituloEstatico;

public class Centro extends AppCompatActivity
        implements
        NavigationView.OnNavigationItemSelectedListener,
        Leitura.OnFragmentInteractionListener,
        Dedicatoria.OnFragmentInteractionListener,
        Inicio.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.centro, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.dedicatoria) {
            CapituloEstatico.setCapitulo(1);
            setColor(CapituloEstatico.getListaCapitulo().get(1));
        } else if (id == R.id.cap1) {
            CapituloEstatico.setCapitulo(2);
            setColor(CapituloEstatico.getListaCapitulo().get(2));
        } else if (id == R.id.cap2) {
            CapituloEstatico.setCapitulo(3);
            setColor(CapituloEstatico.getListaCapitulo().get(3));
        } else if (id == R.id.cap3) {
            CapituloEstatico.setCapitulo(4);
            setColor(CapituloEstatico.getListaCapitulo().get(4));
        } else if (id == R.id.cap4) {
            CapituloEstatico.setCapitulo(5);
            setColor(CapituloEstatico.getListaCapitulo().get(5));
        } else if (id == R.id.cap5) {
            CapituloEstatico.setCapitulo(6);
            setColor(CapituloEstatico.getListaCapitulo().get(6));
        } else if (id == R.id.cap6) {
            CapituloEstatico.setCapitulo(7);
            setColor(CapituloEstatico.getListaCapitulo().get(7));
        } else if (id == R.id.cap7) {
            CapituloEstatico.setCapitulo(8);
            setColor(CapituloEstatico.getListaCapitulo().get(8));
        } else if (id == R.id.cap8) {
            CapituloEstatico.setCapitulo(9);
            setColor(CapituloEstatico.getListaCapitulo().get(9));
        } else if (id == R.id.cap9) {
            CapituloEstatico.setCapitulo(10);
            setColor(CapituloEstatico.getListaCapitulo().get(10));
        } else if (id == R.id.cap10) {
            CapituloEstatico.setCapitulo(11);
            setColor(CapituloEstatico.getListaCapitulo().get(11));
        } else if (id == R.id.cap11) {
            CapituloEstatico.setCapitulo(12);
            setColor(CapituloEstatico.getListaCapitulo().get(12));
        } else if (id == R.id.cap12) {
            CapituloEstatico.setCapitulo(13);
            setColor(CapituloEstatico.getListaCapitulo().get(13));
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onResume() {

        super.onResume();
        CapituloControle cc = new CapituloControle();
        CapituloEstatico.setListaCapitulo(cc.getLista());

        CapituloEstatico.n++;

        setColor(CapituloEstatico.getListaCapitulo().get(CapituloEstatico.capituloAtual()));

        System.out.println("passou");

        boolean flag = false;

        if (getIntent().hasExtra("Clique")) {

            System.out.println(CapituloEstatico.n);
            flag = this.getIntent().getExtras().getBoolean("Clique");

            if (flag) {
                recebeToque();
                this.getIntent().removeExtra("Clique");
            }

        }
    }

    private void setColor(Capitulo capitulo) {

        getWindow().setStatusBarColor(capitulo.getCor());
        Toolbar tb = findViewById(R.id.toolbar);
        NavigationView nav = findViewById(R.id.nav_view);
        nav.setBackgroundColor(capitulo.getCor());
        tb.setTitleTextColor(Color.WHITE);
        tb.setTitle(capitulo.getNome());
        tb.setBackgroundColor(capitulo.getCor());
        tb.setDrawingCacheBackgroundColor(Color.WHITE);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (capitulo.getIdCapitulo() == 0) {

            Bundle params = new Bundle();
            params.putSerializable("capitulo", capitulo);

            Inicio inicio = new Inicio();
            inicio.setArguments(params);

            ft.add(R.id.layoutPrincipal, inicio);

        } else if (capitulo.getIdCapitulo() == 1) {

            Bundle params = new Bundle();
            params.putSerializable("capitulo", capitulo);

            Dedicatoria dedicatoria = new Dedicatoria();
            dedicatoria.setArguments(params);
            ft.replace(R.id.layoutPrincipal, dedicatoria);

        } else {

            Bundle params = new Bundle();
            params.putSerializable("capitulo", capitulo);

            Leitura leitura = new Leitura();
            leitura.setArguments(params);

            ft.replace(R.id.layoutPrincipal, leitura);

        }

        ft.commit();
    }

    public void recebeToque() {

        System.out.println("recebeu");

        if (CapituloEstatico.capituloAtual() != 13) {

            CapituloEstatico.proximoCapitulo();
        }

        setColor(CapituloEstatico.getListaCapitulo().get(CapituloEstatico.capituloAtual()));

    }

    @Override
    public void onFragmentInteraction(boolean b) {

    }
}