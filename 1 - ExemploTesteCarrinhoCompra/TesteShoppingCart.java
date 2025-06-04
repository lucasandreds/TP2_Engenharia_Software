/**
* Engenharia de Software Moderna - Testes  (Cap. 8)
* Prof. Marco Tulio Valente
* 
* Exercício simples de teste de unidade (ShoppingCart)
*
*/

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class TesteShoppingCart {

  private ShoppingCart shoppingCart;

  @Before
  public void setUp() {
    shoppingCart = new ShoppingCart();
    shoppingCart.addItem(new Item("ESM", 65.0));
    shoppingCart.addItem(new Item("GoF", 120.0));
  }

  @Test
  public void testAddItem() {
    Item newItem = new Item("NEWITEM", 5.0);
    shoppingCart.addItem(newItem);
    assertEquals(3,shoppingCart.getItemCount());
    assertTrue(shoppingCart.getItems().contains(newItem));
    // Escreva aqui seu código de teste
  }

  @Test
  public void testRemoveItem() {
    Item newItem = new Item("NEWITEM", 5.0);
    shoppingCart.addItem(newItem);
    shoppingCart.removeItem(newItem);
    assertFalse(shoppingCart.getItems().contains(newItem));
    assertEquals(2,shoppingCart.getItemCount());
    // Escreva aqui seu código de teste
  }

  @Test
  public void testGetTotalPrice() {
    assertEquals(185.0,shoppingCart.getTotalPrice(), 0.001);
    Item newItem = new Item("NEWITEM", 5.0);
    shoppingCart.addItem(newItem);
    assertEquals(190.0,shoppingCart.getTotalPrice(), 0.001);
    // Escreva aqui seu código de teste
  }

  @Test
  public void testClearCart() {
    shoppingCart.clearCart();
    assertEquals(0,shoppingCart.getItemCount());
    assertTrue(shoppingCart.getItems().isEmpty());
    // Escreva aqui seu código de teste
  }
}
