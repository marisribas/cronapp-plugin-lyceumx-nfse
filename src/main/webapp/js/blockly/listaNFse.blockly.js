window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ListaNFse = window.blockly.js.blockly.ListaNFse || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.ListaNFse.fecharModalNFArgs = [];
window.blockly.js.blockly.ListaNFse.fecharModalNF = async function() {

  this.cronapi.screen.hideModal("modal-emitirNF");
}

/**
 * Home
 */
window.blockly.js.blockly.ListaNFse.abrirModalNFArgs = [];
window.blockly.js.blockly.ListaNFse.abrirModalNF = async function() {

  this.cronapi.screen.showModal("modal-emitirNF");
}
