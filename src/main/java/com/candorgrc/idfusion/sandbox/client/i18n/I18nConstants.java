package com.candorgrc.idfusion.sandbox.client.i18n;

/**
 * Interface to represent the constants contained in resource bundle:
 * 	'/home/bpetridean/workspace/idf-sandbox/src/main/resources/com/candorgrc/idfusion/sandbox/client/i18n/I18nConstants.properties'.
 */
public interface I18nConstants extends com.google.gwt.i18n.client.Constants {
  
  /**
   * Translated "Entrez votre nom".
   * 
   * @return translated "Entrez votre nom"
   */
  @DefaultStringValue("Entrez votre nom")
  @Key("nameField")
  String nameField();

  /**
   * Translated "Envoyer".
   * 
   * @return translated "Envoyer"
   */
  @DefaultStringValue("Envoyer")
  @Key("sendButton")
  String sendButton();
}
