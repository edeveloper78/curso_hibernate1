package br.com.fivecode;

import br.com.fivecode.controller.OptionController;
import br.com.fivecode.controller.UserController;
import br.com.fivecode.model.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        UserController userController = new UserController();
        OptionController optionController = new OptionController();

//        Exercícios de Mapeamento hibernate

//        Carga na Tabela Opcao
//        Integer[] array_options = {1,2,3,4,5};
//
//        for (Integer i:array_options) {
//            Opcao opcao = new Opcao();
//            opcao.setName("Opcao_"+i);
//            optionController.salvarOpcao(opcao);
//            //System.out.println(i);
//        }




        /**
         * Incluir Usuário com Endereço!!!
         */
//        User user = new User();
//        user.setFirsname("Eduardo3");
//        user.setLastname("Santos");
//        user.setUsername("Edeveloper3");
//        user.setCreated(new Date());
//
//        List<Computer> list = new ArrayList<Computer>();
//        Computer computador = new Computer();
//        computador.setName("Computador1");
//        list.add(computador);
//
//        user.setComputador(list);
//
//
//
//
//        Address address = new Address();
//        address.setNumber(2);
//        address.setStreet("Rua das pitangueiras lote,  Bloco B Apto 501");
//
//        user.setAddress(address);
//        userController.salvarUsuario(user);


        /**
         * Atualizar Usuário
         */
//        User user = userController.getUsuarioPorId(1);
//          if(user != null){
//              System.out.println(user);
//              user.setLastname("Souza");
//              user.getAddress().setNumber(5);
//              user.getAddress().setStreet("Rua Babaçu lote, apto 901");
//              userController.atualizarUsuario(user);
//          }

//        int idUsuario = userController.salvarUsuario(user);
//        System.out.println("Salvando Cliente");
//        System.out.println(idUsuario);
//        System.out.println("Id do Usuário:" + idUsuario);
        /**
         * Listando Usuários com Endereços
         */
//        List<User> listaUsuarios = userController.listarTodosUsuarios();
//        for (User user: listaUsuarios ) {
//            StringBuilder usuario = new StringBuilder();
//            usuario.append("First Name: ");
//            usuario.append(user.getFirsname());
//            usuario.append(" Username: ");
//            usuario.append(user.getUsername());
//            usuario.append(" Endereço: ");
//            usuario.append(user.getAddress().getStreet());
//            usuario.append(" ");
//            usuario.append(user.getAddress().getNumber());
//            System.out.println(usuario);
//        }

//        User usuario = userController.getUsuarioPorId(1);
//
//        Opcao opcao = optionController.getOpcaoPorId(1);
//        List<Opcao>listOpcoes = new ArrayList<>();
//        listOpcoes.add(opcao);
//        usuario.setOpcoes(listOpcoes);
//        userController.atualizarUsuario(usuario);



     }
}
