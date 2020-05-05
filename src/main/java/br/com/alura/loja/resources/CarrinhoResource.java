package br.com.alura.loja.resources;

import br.com.alura.loja.dao.CarrinhoDAO;
import br.com.alura.loja.modelo.Carrinho;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("carrinhos")
public class CarrinhoResource {

//    @GET
//    @Produces(MediaType.APPLICATION_XML)
//    public String buscaCarrinho(){
//        CarrinhoDAO dao = new CarrinhoDAO();
//        Carrinho carrinho = new Carrinho();
//
//        carrinho = dao.busca(1l);
//
//        return carrinho.toXML();
//    }

//    @GET
//    @Produces(MediaType.APPLICATION_XML)
//    public String buscaCarrinhoPorIdQueryParam(@QueryParam("id") long id){
//        CarrinhoDAO dao = new CarrinhoDAO();
//        Carrinho carrinho = new Carrinho();
//
//        carrinho = dao.busca(id);
//
//        return carrinho.toXML();
//    }

    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String buscaCarrinhoPorIdPathParam(@PathParam("id") long id){
        CarrinhoDAO dao = new CarrinhoDAO();
        Carrinho carrinho = new Carrinho();

        carrinho = dao.busca(id);

        return carrinho.toXML();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String buscaCarrinhoJson(){
        CarrinhoDAO dao = new CarrinhoDAO();
        Carrinho carrinho = new Carrinho();

        carrinho = dao.busca(1l);

        return carrinho.toJson();
    }
}
