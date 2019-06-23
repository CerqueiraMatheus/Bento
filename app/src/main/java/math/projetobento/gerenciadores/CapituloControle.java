package math.projetobento.gerenciadores;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by txring on 29/08/2018.
 */
public class CapituloControle {

    private int tamanho = 14;
    private List<String> listaCor = new ArrayList<>();
    private List<String> listaNome = new ArrayList<>();
    private List<String> listaFoto = new ArrayList<>();
    private List<String> listaTexto = new ArrayList<>();
    private List<Capitulo> listaCapitulo = new ArrayList<>();
    private int i = 0;

    public CapituloControle() {

        setListaTexto();
        setListaCor();
        setListaNome();
        setListaCapitulo();

        this.listaCapitulo = getLista();

    }

    public void setListaTexto() {

        listaTexto = new ArrayList<>();

        for (int i = 0; i < tamanho; i++) {

            switch (i) {

                case 0:
                    listaTexto.add("Bento era um garoto simples. Morava em uma casa pequena com sua mãe, seu padrasto e seus dois irmãos. Como há em todas as famílias, havia algumas coisas que lhe desagradava, que o deixava triste às vezes, mas ele tentava não demonstrar isso para ninguém, pois acreditava que seu sorriso, mesmo estando triste, podia trazer alegria aos outros e, quem sabe, mudar algo.");
                    break;

                case 1:
                    listaTexto.add(" Quando sua mãe se desentendia com seu padrasto, ele se calava. Sabia que não podia e não deveria interferir na conversa, afinal, sempre soube que era preciso respeitar os  mais velhos. Mas aprendia com  aquela situação... Não queria crescer e se tornar um adulto que briga, pois achava isso muito feio");
                    break;

                case 2:
                    listaTexto.add("Bento tinha muitos amigos.  Divertia-se muito com eles no intervalo das aulas. Mas o que mais gostava de fazer era tocar seu violão. Não sabia tocar muito bem, mas ouvia sempre do avô, que às vezes tocava com ele, que não podia desistir fácil e, por isso, treinava, treinava, treinava... Ele aprendia sempre com seu avô  que, para conseguir algo, era preciso insistir muito.");
                    break;

                case 3:
                    listaTexto.add("Bento não era um aluno exemplar. Tinha algumas dificuldades na escola, mas gostava muito de história. História era sua aula preferida. Sua professora sempre o elogiava, principalmente por ser um garoto responsável, educado e talentoso, mesmo sabendo de suas dificuldades. – Garotinho, lindo! Ele sabia que o elogio era pelo seu esforço. Mesmo tendo dificuldades com algumas matérias, ele se esforçava sempre para ser  uma criança melhor. Com as conversas da professora e os elogios que recebi, ele aprendia que deveria sempre ser um garoto melhor.");
                    break;

                case 4:
                    listaTexto.add("Bento, apesar de algumas dificuldades financeiras de sua família, fazia de seus dias felizes, pois tinha com ele grandes sonhos.  Ele pensava que um dia se tornaria  um grande instrumentista em uma banda de sucesso. Ele treinava muito com seu violão e já começava a tocar algumas músicas na sua igreja.  Todos o admiravam! – Tão novo e talentoso!");
                    break;

                case 5:
                    listaTexto.add("Cada vez que encontrava uma dificuldade, apegava-se em seus sonhos e, sozinho, como sempre gostava de estar, encontrava motivação para continuar. Ele sabia que precisava estar bem para alcançar aquilo que tanto sonhava, ou seja, ser um grande instrumentista em uma banda de sucesso, e esse sonho sempre o motivava a continuar. Estando bem consigo mesmo, chegaria lá!");
                    break;

                case 6:
                    listaTexto.add("Em uma tarde fria, Bento estava tocando seu violão no quintal de sua casa quando observou um pássaro que pousou sozinho em uma árvore. Era um bem-te-vi. Parecia que o pássaro cantava em sintonia com o arranjo que ele fazia com o violão. Bento sorria e, com o coração cheio de alegria, agradecia a Deus por aquele momento. Ele acreditava que o canto do pássaro era um sinal de que ele deveria continuar. Ele aprendia com aquele canto. – Quem sabe um dia posso também me tornar um grande cantor? – Pensava.");
                    break;

                case 7:
                    listaTexto.add("Em casa, no seu quarto, soltava a voz e, mesmo desafinado e com um repertório ainda pequeno, já dava bons sinais de que podia um dia se tornar um cantor de verdade.  Seus irmãos nem sempre aprovavam sua cantoria e os barulhos do seu violão. Mas ele sabia que não podia depender da aprovação dos outros. Como o bem-te-vi, ele aprendeu que sozinho podia treinar, errar, cantar e aprender muito procurando sempre ser melhor");
                    break;

                case 8:
                    listaTexto.add("Certo dia, Bento foi convidado pela sua professora para cantar em uma apresentação da escola. No início, sentiu um pouco de medo e quase negou o convite, mas lembrou-se de todo seu esforço e, encorajado pela lembrança do pássaro bem-te-vi, decidiu aceitar o convite da professora: – SIM, EU TOPO – Disse ele  à professora!");
                    break;

                case 9:
                    listaTexto.add("Bento foi a atração da escola naquele dia. Seus amigos o elogiaram e todos ficaram encantados com seu talento com a música e o violão. Ele ficou muito feliz, pois sabia que, para ter conseguido chegar até lá, foi preciso muita força de vontade e dedicação, além de ter encontrado muitas dificuldades no  meio do caminho. Mas ele sempre aprendia com  as dificuldades!");
                    break;

                case 10:
                    listaTexto.add("Respeitando os outros, ajudando a quem precisava, procurando sempre ser um bom menino e confiante que a realização de seus sonhos dependia muito mais dele do  que dos outros e que com sua força  de vontade chegaria onde quisesse se  se esforçasse para isso, Bento continuava seus ensaios.");
                    break;

                case 11:
                    listaTexto.add("Bento seguia motivado pelo bem  que fazia a todos com sua voz e violão, mas, principalmente, pelo bem que fazia a si mesmo, pois nunca desistia de correr atrás dos seus sonhos!");
                    break;

                case 12:
                    listaTexto.add("");
                    break;

                case 13:
                    listaTexto.add("Para\n" +
                            "Ana Flávia, Maria Julia, Isadora,  Cecília, Mirella e Enzo. Crianças da minha vida!");
                    break;
            }
        }
    }

    public void setListaNome() {

        for (int i = 0; i < tamanho; i++) {
            switch (i) {

                case 0:
                    listaNome.add("Bento era um garoto simples...");
                    break;

                case 1:
                    listaNome.add("Quando sua mãe...");
                    break;

                case 2:
                    listaNome.add("Tinha muitos amigos...");
                    break;

                case 3:
                    listaNome.add("Não era um aluno exemplar...");
                    break;

                case 4:
                    listaNome.add("Apesar de algumas dificuldades...");
                    break;

                case 5:
                    listaNome.add("Cada vez que encontrava uma dificuldade...");
                    break;

                case 6:
                    listaNome.add("Em uma tarde fria...");
                    break;

                case 7:
                    listaNome.add("Em casa, no seu quarto...");
                    break;

                case 8:
                    listaNome.add("Certo dia, Bento foi convidado...");
                    break;

                case 9:
                    listaNome.add("Bento foi a atração da escola...");
                    break;

                case 10:
                    listaNome.add("Respeitando os outros...");
                    break;

                case 11:
                    listaNome.add("Bento seguia motivado...");
                    break;

                case 12:
                    listaNome.add("Bento aprendia com tudo");
                    break;
                case 13:
                    listaNome.add("Dedicatória");
                    break;
            }
        }
    }

    public void setListaCor() {
        for (int i = 0; i < tamanho; i++) {
            switch (i) {

                case 0:
                    listaCor.add("#009ED5");
                    break;

                case 1:
                    listaCor.add("#BA3E72");
                    break;

                case 2:
                    listaCor.add("#00813C");
                    break;

                case 3:
                    listaCor.add("#EF7D2D");
                    break;

                case 4:
                    listaCor.add("#3F6BA5");
                    break;

                case 5:
                    listaCor.add("#729E4B");
                    break;

                case 6:
                    listaCor.add("#B45B2D");
                    break;

                case 7:
                    listaCor.add("#C93029");
                    break;

                case 8:
                    listaCor.add("#366968");
                    break;

                case 9:
                    listaCor.add("#8E2F69");
                    break;

                case 10:
                    listaCor.add("#346C8A");
                    break;

                case 11:
                    listaCor.add("#CF692E");
                    break;

                case 12:
                    listaCor.add("#574989");
                    break;
                case 13:
                    listaCor.add("#CF692E");
                    break;

            }
        }
    }

    public void setListaCapitulo() {

        int y = 0;

        for (int i = 12; i < tamanho; i++){
            Capitulo c = new Capitulo();

            c.setIdCapitulo(y);
            c.setNome(listaNome.get(i));
            c.setCor(Color.parseColor(listaCor.get(i)));
            System.out.println(c.getCor());
            c.setTexto(listaTexto.get(i));

            listaCapitulo.add(c);
            y++;
        }

        y = 2;

        for (int i = 0; i < tamanho - 2; i++) {

            Capitulo c = new Capitulo();

            c.setIdCapitulo(y);
            c.setNome(listaNome.get(i));
            c.setCor(Color.parseColor(listaCor.get(i)));
            c.setTexto(listaTexto.get(i));

            listaCapitulo.add(c);
            y++;

        }
    }

    public List<Capitulo> getLista() {
        return this.listaCapitulo;
    }

    public void setCapitulo(int i) {
        this.i = i;
    }

    public void proximoCapitulo() {
        this.i++;
    }

    public int capituloAtual() {
        return i;
    }
}
