package com.sencha.gxt.theme.base.client.container;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class BoxLayoutBaseAppearance_BoxLayoutTemplateImpl implements com.sencha.gxt.theme.base.client.container.BoxLayoutBaseAppearance.BoxLayoutTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml template(com.sencha.gxt.theme.base.client.container.BoxLayoutBaseAppearance.BoxLayoutStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"><div class="{1}"></div></div>
     * params:
       * com.sencha.gxt.theme.base.client.container.BoxLayoutBaseAppearance_BoxLayoutStyle_container_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.container.BoxLayoutBaseAppearance_BoxLayoutStyle_inner_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.container.BoxLayoutBaseAppearance_BoxLayoutTemplate_template_SafeHtml__BoxLayoutStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.container.BoxLayoutBaseAppearance_BoxLayoutTemplate_template_SafeHtml__BoxLayoutStyle_style___SafeHtmlTemplates.class).template0(com.sencha.gxt.theme.base.client.container.BoxLayoutBaseAppearance_BoxLayoutStyle_container_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.container.BoxLayoutBaseAppearance_BoxLayoutStyle_inner_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
