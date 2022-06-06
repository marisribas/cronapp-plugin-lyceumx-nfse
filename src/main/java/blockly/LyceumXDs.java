package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class LyceumXDs {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// LyceumX
public static Var ObterToken() throws Exception {
 return new Callable<Var>() {

   private Var token = Var.VAR_NULL;

   public Var call() throws Exception {

    token =
    cronapi.screen.Operations.getTokenClaim(
    Var.valueOf("SSOAccessToken"));
    return
Var.valueOf(
Var.valueOf("Bearer ").toString() +
token.toString());
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var filterx() throws Exception {
 return new Callable<Var>() {

   private Var simpleFilter = Var.VAR_NULL;
   private Var filterLista = Var.VAR_NULL;
   private Var filterby = Var.VAR_NULL;

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf("filter").getObjectAsString());

    System.out.println(
    cronapi.screen.Operations.getParam(
    Var.valueOf("$filter")).getObjectAsString());

    simpleFilter =
    cronapi.text.Operations.replaceAll(
    cronapi.screen.Operations.getParam(
    Var.valueOf("$filter")),
    Var.valueOf("\'"),
    Var.valueOf(""));

    System.out.println(simpleFilter.getObjectAsString());

    filterLista =
    cronapi.list.Operations.getListFromText(simpleFilter,
    Var.valueOf(" "));

    System.out.println(filterLista.getObjectAsString());

    filterby =
    Var.valueOf(
    cronapi.list.Operations.getFirst(filterLista).toString() +
    Var.valueOf(":").toString() +
    cronapi.list.Operations.getLast(filterLista).toString());

    System.out.println(filterby.getObjectAsString());
    return filterby;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var orderx() throws Exception {
 return new Callable<Var>() {

   private Var orderLista = Var.VAR_NULL;
   private Var orderby = Var.VAR_NULL;

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf("orderx").getObjectAsString());

    System.out.println(
    cronapi.screen.Operations.getParam(
    Var.valueOf("$orderby")).getObjectAsString());

    orderLista =
    cronapi.list.Operations.getListFromText(
    cronapi.screen.Operations.getParam(
    Var.valueOf("$orderby")),
    Var.valueOf(" "));

    System.out.println(orderLista.getObjectAsString());

    orderby =
    cronapi.list.Operations.getFirst(orderLista);

    if (
    Var.valueOf(
    cronapi.list.Operations.size(orderLista).compareTo(
    Var.valueOf(1)) > 0).getObjectAsBoolean()) {

        orderby =
        Var.valueOf(
        cronapi.list.Operations.getFirst(orderLista).toString() +
        Var.valueOf(",").toString() +
        cronapi.list.Operations.getLast(orderLista).toString());
    }

    System.out.println(orderby.getObjectAsString());
    return orderby;
   }
 }.call();
}

}

