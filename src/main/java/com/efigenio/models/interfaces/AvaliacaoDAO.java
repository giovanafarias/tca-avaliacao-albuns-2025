package com.efigenio.models.interfaces;
import java.util.List;

import com.efigenio.models.Avaliacao;

public interface AvaliacaoDAO {
    List<Avaliacao> listaAvaliacoes(String username);

    Avaliacao getTotalAvalicoes();

    Avaliacao adicionarComentario();

    Avaliacao editarComentario();

    Avaliacao removerComentario();

    Avaliacao adicionarNota();

    Avaliacao editarNota();

    Avaliacao removerNota();
}
