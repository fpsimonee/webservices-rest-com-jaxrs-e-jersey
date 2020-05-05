package br.com.alura.loja.resources;

import br.com.alura.loja.dao.CarrinhoDAO;
import br.com.alura.loja.modelo.Carrinho;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("carrinhos")
public class CarrinhoResource {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String buscaCarrinho(){
        CarrinhoDAO dao = new CarrinhoDAO();
        Carrinho carrinho = new Carrinho();

        carrinho = dao.busca(1l);

        return carrinho.toXML();
    }
}
