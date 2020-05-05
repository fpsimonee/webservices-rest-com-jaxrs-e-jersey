package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Projeto;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class ProjetoDAO {

    private static Map<Long, Projeto> banco = new HashMap<Long, Projeto>();
    private static AtomicLong contador = new AtomicLong(1);

    static {
        Projeto videogame = new Projeto("Videogame", 1l, 2020);
        banco.put(1l, videogame);
    }

    public void adiciona(Projeto projeto) {
        long id = contador.incrementAndGet();
        projeto.setId(id);
        banco.put(id, projeto);
    }

    public Projeto busca(Long id) {
        return banco.get(id);
    }

    public Projeto remove(long id) {
        return banco.remove(id);
    }
}
