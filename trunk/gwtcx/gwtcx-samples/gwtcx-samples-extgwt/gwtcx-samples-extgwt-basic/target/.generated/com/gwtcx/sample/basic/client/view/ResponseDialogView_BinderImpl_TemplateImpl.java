package com.gwtcx.sample.basic.client.view;

public class ResponseDialogView_BinderImpl_TemplateImpl implements com.gwtcx.sample.basic.client.view.ResponseDialogView_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<b>Sending name to the server:</b>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html2() {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<br> <b>Server replies:</b>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html3(java.lang.String arg0) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("'></span>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html4(java.lang.String arg0,java.lang.String arg1) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("'></span> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
sb.append("'></span>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html5() {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<b>Remote Procedure Call</b>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
