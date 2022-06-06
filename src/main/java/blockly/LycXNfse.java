package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class LycXNfse {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Cancelar NF através da aplicação cronapp customizada
public static Var CancelarNFSE() throws Exception {
 return new Callable<Var>() {

   private Var resp = Var.VAR_NULL;

   public Var call() throws Exception {

    resp =
    Var.valueOf(cronapi.LyceumxNFse.CancelarNFSE(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("pluginNFse.active.idIntegracao"))));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("pluginNFse"),
    Var.valueOf("true"));

    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf("Nota enviada para cancelamento !! "));
    return resp;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var ConsultarNFSE() throws Exception {
 return new Callable<Var>() {

   private Var msg = Var.VAR_NULL;

   public Var call() throws Exception {

    msg =
    Var.valueOf(cronapi.LyceumxNFse.ConsultarNFSE(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("pluginNFse.active.idIntegracao"))));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("pluginNFse"),
    Var.valueOf("true"));
    return msg;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var EmitirNFSE() throws Exception {
 return new Callable<Var>() {

   private Var resp = Var.VAR_NULL;
   private Var valorNF = Var.VAR_NULL;
   private Var idIntegracao = Var.VAR_NULL;

   public Var call() throws Exception {

    valorNF =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.nfseValor"));

    if (
    Var.valueOf(
    Var.valueOf(valorNF.equals(
    Var.valueOf(0))).getObjectAsBoolean() ||
    cronapi.logic.Operations.isNullOrEmpty(valorNF).getObjectAsBoolean()).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Favor informar valor da Nota"));
    } else {

        idIntegracao =
        Var.valueOf(
        Var.valueOf("cronapp-").toString() +
        cronapi.util.Operations.generateUUID().toString());

        resp =
        Var.valueOf(cronapi.LyceumxNFse.EmitirNFSE(
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("vars.nfseValor")), idIntegracao));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("modal-emitirNF"));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
        Var.valueOf("pluginNFse"),
        Var.valueOf("false"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

