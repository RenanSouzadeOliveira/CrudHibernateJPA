package view;

import controller.ClienteJpaDAO;
import model.Cliente;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Cliente cliente = new Cliente();
      cliente.setCpf("372.445.422-11");
      cliente.setId(1);
      cliente.setNome("Renan Souza");
      cliente.setRg("63.258.659-1");
      ClienteJpaDAO.getInstance().remove(cliente);
      System.out.println("Objetos salvo com sucesso!!!");
    }
}
