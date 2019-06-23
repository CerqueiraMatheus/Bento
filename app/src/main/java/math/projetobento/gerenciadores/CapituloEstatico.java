package math.projetobento.gerenciadores;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by txring on 29/08/2018.
 */
public class CapituloEstatico {

    private static int capitulo = 0;
    public static int n = 0;
    private static List<Capitulo> listaCapitulo = new ArrayList();

    public static void setCapitulo(int i){
        n = 0;
        capitulo = i;
    }

    public static void proximoCapitulo(){
        System.out.println("Próximo");
        n = 0;
        capitulo++;
    }

    public static int capituloAtual(){
        return capitulo;
    }

    public static void setListaCapitulo(List<Capitulo> listaRecebida){
        listaCapitulo = listaRecebida;
    }

    public static List<Capitulo> getListaCapitulo(){
        return listaCapitulo;
    }

}
