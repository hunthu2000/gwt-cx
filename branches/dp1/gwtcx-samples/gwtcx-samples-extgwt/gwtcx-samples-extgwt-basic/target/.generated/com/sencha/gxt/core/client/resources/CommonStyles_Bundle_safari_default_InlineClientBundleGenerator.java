package com.sencha.gxt.core.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CommonStyles_Bundle_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.core.client.resources.CommonStyles.Bundle {
  private static CommonStyles_Bundle_safari_default_InlineClientBundleGenerator _instance0 = new CommonStyles_Bundle_safari_default_InlineClientBundleGenerator();
  private void shimInitializer() {
    shim = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "shim",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 1, false, false
    );
  }
  private static class shimInitializer {
    static {
      _instance0.shimInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return shim;
    }
  }
  public com.google.gwt.resources.client.ImageResource shim() {
    return shimInitializer.get();
  }
  private void stylesInitializer() {
    styles = new com.sencha.gxt.core.client.resources.CommonStyles.Styles() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "styles";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("/* @external x-clear; */\n.GAVOEIYBL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-positionable {\n  position : " + ("absolute")  + " !important;\n  right : " + ("0")  + ";\n  top : " + ("0")  + ";\n}\n.GAVOEIYKK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-hideDisplay {\n  display : " + ("none")  + " !important;\n}\n.GAVOEIYLK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-hideOffsets {\n  position : " + ("absolute")  + " !important;\n  right : " + ("-10000px")  + " !important;\n  top : " + ("-10000px")  + " !important;\n  visibility : " + ("hidden")  + " !important;\n}\n.GAVOEIYMK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-hideVisibility {\n  visibility : " + ("hidden")  + " !important;\n}\n.GAVOEIYEL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-unselectable, .GAVOEIYEL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-unselectable *, .GAVOEIYFL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-unselectableSingle {\n  -moz-user-select : " + ("none")  + ";\n  -khtml-user-select : ") + (("none")  + ";\n  -webkit-user-select : " + ("ignore")  + ";\n}\n.GAVOEIYCL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-repaint {\n  zoom : " + ("1")  + ";\n  background-color : " + ("transparent")  + ";\n  -moz-outline : " + ("none")  + ";\n  outline : " + ("0"+ " " +"none")  + ";\n}\n.x-clear {\n  clear : " + ("both")  + ";\n  overflow : " + ("hidden")  + ";\n  line-height : " + ("0")  + ";\n  font-size : " + ("0")  + ";\n}\n.GAVOEIYJK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-floatRight {\n  float : " + ("left") ) + (";\n}\n.GAVOEIYGK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-columnResize {\n  cursor : " + ("w-resize")  + ";\n  cursor : " + ("col-resize")  + ";\n}\n.GAVOEIYHK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-columnRowResize {\n  cursor : " + ("n-resize")  + ";\n  cursor : " + ("row-resize")  + ";\n}\n.GAVOEIYOK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-inlineBlock {\n  position : " + ("relative")  + ";\n  display : " + ("inline-block")  + ";\n}\n.GAVOEIYAL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-nowrap {\n  white-space : " + ("nowrap")  + ";\n}\n.GAVOEIYDL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-shim {\n  height : " + ((CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getHeight() + "px")  + ";\n  width : " + ((CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getWidth() + "px")  + ";\n  overflow : " + ("hidden")  + ";\n  background : ") + (("url(\"" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getSafeUri().asString() + "\") -" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getLeft() + "px -" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getTop() + "px  no-repeat")  + ";\n  width : " + ("100%")  + ";\n  height : " + ("100%")  + ";\n  display : " + ("none")  + ";\n  position : " + ("absolute")  + ";\n  right : " + ("0")  + ";\n  top : " + ("0")  + ";\n  z-index : " + ("20000")  + ";\n}\n.GAVOEIYIK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-disabled * {\n  color : " + ("gray")  + " !important;\n}\n.GAVOEIYIK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-disabled {\n  cursor : " + ("default")  + ";\n  opacity : " + ("0.6") ) + (";\n}\n")) : (("/* @external x-clear; */\n.GAVOEIYBL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-positionable {\n  position : " + ("absolute")  + " !important;\n  left : " + ("0")  + ";\n  top : " + ("0")  + ";\n}\n.GAVOEIYKK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-hideDisplay {\n  display : " + ("none")  + " !important;\n}\n.GAVOEIYLK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-hideOffsets {\n  position : " + ("absolute")  + " !important;\n  left : " + ("-10000px")  + " !important;\n  top : " + ("-10000px")  + " !important;\n  visibility : " + ("hidden")  + " !important;\n}\n.GAVOEIYMK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-hideVisibility {\n  visibility : " + ("hidden")  + " !important;\n}\n.GAVOEIYEL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-unselectable, .GAVOEIYEL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-unselectable *, .GAVOEIYFL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-unselectableSingle {\n  -moz-user-select : " + ("none")  + ";\n  -khtml-user-select : ") + (("none")  + ";\n  -webkit-user-select : " + ("ignore")  + ";\n}\n.GAVOEIYCL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-repaint {\n  zoom : " + ("1")  + ";\n  background-color : " + ("transparent")  + ";\n  -moz-outline : " + ("none")  + ";\n  outline : " + ("0"+ " " +"none")  + ";\n}\n.x-clear {\n  clear : " + ("both")  + ";\n  overflow : " + ("hidden")  + ";\n  line-height : " + ("0")  + ";\n  font-size : " + ("0")  + ";\n}\n.GAVOEIYJK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-floatRight {\n  float : " + ("right") ) + (";\n}\n.GAVOEIYGK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-columnResize {\n  cursor : " + ("e-resize")  + ";\n  cursor : " + ("col-resize")  + ";\n}\n.GAVOEIYHK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-columnRowResize {\n  cursor : " + ("n-resize")  + ";\n  cursor : " + ("row-resize")  + ";\n}\n.GAVOEIYOK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-inlineBlock {\n  position : " + ("relative")  + ";\n  display : " + ("inline-block")  + ";\n}\n.GAVOEIYAL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-nowrap {\n  white-space : " + ("nowrap")  + ";\n}\n.GAVOEIYDL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-shim {\n  height : " + ((CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getHeight() + "px")  + ";\n  width : " + ((CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getWidth() + "px")  + ";\n  overflow : " + ("hidden")  + ";\n  background : ") + (("url(\"" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getSafeUri().asString() + "\") -" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getLeft() + "px -" + (CommonStyles_Bundle_safari_default_InlineClientBundleGenerator.this.shim()).getTop() + "px  no-repeat")  + ";\n  width : " + ("100%")  + ";\n  height : " + ("100%")  + ";\n  display : " + ("none")  + ";\n  position : " + ("absolute")  + ";\n  left : " + ("0")  + ";\n  top : " + ("0")  + ";\n  z-index : " + ("20000")  + ";\n}\n.GAVOEIYIK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-disabled * {\n  color : " + ("gray")  + " !important;\n}\n.GAVOEIYIK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-disabled {\n  cursor : " + ("default")  + ";\n  opacity : " + ("0.6") ) + (";\n}\n"));
      }
      public java.lang.String clear(){
        return "x-clear";
      }
      public java.lang.String columnResize(){
        return "GAVOEIYGK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-columnResize";
      }
      public java.lang.String columnRowResize(){
        return "GAVOEIYHK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-columnRowResize";
      }
      public java.lang.String disabled(){
        return "GAVOEIYIK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-disabled";
      }
      public java.lang.String floatRight(){
        return "GAVOEIYJK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-floatRight";
      }
      public java.lang.String hideDisplay(){
        return "GAVOEIYKK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-hideDisplay";
      }
      public java.lang.String hideOffsets(){
        return "GAVOEIYLK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-hideOffsets";
      }
      public java.lang.String hideVisibility(){
        return "GAVOEIYMK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-hideVisibility";
      }
      public java.lang.String ignore(){
        return "GAVOEIYNK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-ignore";
      }
      public java.lang.String inlineBlock(){
        return "GAVOEIYOK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-inlineBlock";
      }
      public java.lang.String nodrag(){
        return "GAVOEIYPK-com-sencha-gxt-core-client-resources-CommonStyles-Styles-nodrag";
      }
      public java.lang.String nowrap(){
        return "GAVOEIYAL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-nowrap";
      }
      public java.lang.String positionable(){
        return "GAVOEIYBL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-positionable";
      }
      public java.lang.String repaint(){
        return "GAVOEIYCL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-repaint";
      }
      public java.lang.String shim(){
        return "GAVOEIYDL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-shim";
      }
      public java.lang.String unselectable(){
        return "GAVOEIYEL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-unselectable";
      }
      public java.lang.String unselectableSingle(){
        return "GAVOEIYFL-com-sencha-gxt-core-client-resources-CommonStyles-Styles-unselectableSingle";
      }
    }
    ;
  }
  private static class stylesInitializer {
    static {
      _instance0.stylesInitializer();
    }
    static com.sencha.gxt.core.client.resources.CommonStyles.Styles get() {
      return styles;
    }
  }
  public com.sencha.gxt.core.client.resources.CommonStyles.Styles styles() {
    return stylesInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhAQABAID/AMDAwAAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw==";
  private static com.google.gwt.resources.client.ImageResource shim;
  private static com.sencha.gxt.core.client.resources.CommonStyles.Styles styles;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      shim(), 
      styles(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("shim", shim());
        resourceMap.put("styles", styles());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'shim': return this.@com.sencha.gxt.core.client.resources.CommonStyles.Bundle::shim()();
      case 'styles': return this.@com.sencha.gxt.core.client.resources.CommonStyles.Bundle::styles()();
    }
    return null;
  }-*/;
}
