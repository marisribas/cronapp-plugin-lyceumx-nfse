package cronapi;

import cronapi.*;
import java.util.concurrent.Callable;

/**
 * Emite NFSe utilizando plugin LyceumX ...
 *
 * @author Maristella Ribas De Sousa
 * @version 1.0
 * @since 2022-05-30
 *
 */

@CronapiMetaData(categoryName = "LyceumX-hello")
public class LyceumxHello {

@CronapiMetaData(type = "function", name = "ObterHello", description = "ObterHello")
public static Var ObterToken() throws Exception {
 return new Callable<Var>() {

   private Var hello = Var.VAR_NULL;

   public Var call() throws Exception {

    System.out.println("Hello");
    return hello;
   }
 }.call();
}


}