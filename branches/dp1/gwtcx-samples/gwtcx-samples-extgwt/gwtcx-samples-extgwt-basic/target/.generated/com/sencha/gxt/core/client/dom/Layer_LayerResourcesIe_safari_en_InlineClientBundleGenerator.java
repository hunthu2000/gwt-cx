package com.sencha.gxt.core.client.dom;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Layer_LayerResourcesIe_safari_en_InlineClientBundleGenerator implements com.sencha.gxt.core.client.dom.Layer.LayerResourcesIe {
  private static Layer_LayerResourcesIe_safari_en_InlineClientBundleGenerator _instance0 = new Layer_LayerResourcesIe_safari_en_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.core.client.dom.Layer.LayerStyleIe() {
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
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("/* CssDef */\n.GAVOEIYPJ-com-sencha-gxt-core-client-dom-Layer-LayerStyleIe-shim {\n  position : " + ("absolute")  + ";\n  visibility : " + ("hidden")  + ";\n  right : " + ("0")  + ";\n  top : " + ("0")  + ";\n  overflow : " + ("hidden")  + ";\n  filter : " + ("alpha(opacity=0)")  + ";\n}\n.GAVOEIYNJ-com-sencha-gxt-core-client-dom-Layer-LayerStyleIe-shadow * {\n  overflow : " + ("hidden")  + ";\n  padding : " + ("0")  + ";\n  border : " + ("0")  + ";\n  margin : " + ("0")  + ";\n  clear : ") + (("none")  + ";\n  zoom : " + ("1")  + ";\n}\n.GAVOEIYNJ-com-sencha-gxt-core-client-dom-Layer-LayerStyleIe-shadow {\n  display : " + ("none")  + ";\n  position : " + ("absolute")  + ";\n  overflow : " + ("hidden")  + ";\n  right : " + ("0")  + ";\n  top : " + ("0")  + ";\n  zoom : " + ("1")  + ";\n  background-color : " + ("#777")  + ";\n  filter : " + ("progid:DXImageTransform.Microsoft.alpha(opacity=50) progid:DXImageTransform.Microsoft.Blur(pixelradius="+ " " +"4"+ " " +")")  + ";\n}\n")) : (("/* CssDef */\n.GAVOEIYPJ-com-sencha-gxt-core-client-dom-Layer-LayerStyleIe-shim {\n  position : " + ("absolute")  + ";\n  visibility : " + ("hidden")  + ";\n  left : " + ("0")  + ";\n  top : " + ("0")  + ";\n  overflow : " + ("hidden")  + ";\n  filter : " + ("alpha(opacity=0)")  + ";\n}\n.GAVOEIYNJ-com-sencha-gxt-core-client-dom-Layer-LayerStyleIe-shadow * {\n  overflow : " + ("hidden")  + ";\n  padding : " + ("0")  + ";\n  border : " + ("0")  + ";\n  margin : " + ("0")  + ";\n  clear : ") + (("none")  + ";\n  zoom : " + ("1")  + ";\n}\n.GAVOEIYNJ-com-sencha-gxt-core-client-dom-Layer-LayerStyleIe-shadow {\n  display : " + ("none")  + ";\n  position : " + ("absolute")  + ";\n  overflow : " + ("hidden")  + ";\n  left : " + ("0")  + ";\n  top : " + ("0")  + ";\n  zoom : " + ("1")  + ";\n  background-color : " + ("#777")  + ";\n  filter : " + ("progid:DXImageTransform.Microsoft.alpha(opacity=50) progid:DXImageTransform.Microsoft.Blur(pixelradius="+ " " +"4"+ " " +")")  + ";\n}\n"));
      }
      public java.lang.String shadow(){
        return "GAVOEIYNJ-com-sencha-gxt-core-client-dom-Layer-LayerStyleIe-shadow";
      }
      public int shadowOffset() {
        return 4;
      }
      public java.lang.String shim(){
        return "GAVOEIYPJ-com-sencha-gxt-core-client-dom-Layer-LayerStyleIe-shim";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.core.client.dom.Layer.LayerStyleIe get() {
      return style;
    }
  }
  public com.sencha.gxt.core.client.dom.Layer.LayerStyleIe style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.core.client.dom.Layer.LayerStyleIe style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.sencha.gxt.core.client.dom.Layer.LayerResourcesIe::style()();
    }
    return null;
  }-*/;
}