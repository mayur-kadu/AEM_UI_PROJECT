/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.aem__002d__bootcamp__002d__ui.components.structure.header;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class header__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
Object _global_header = null;
Object _global_empty = null;
Object _global_template = null;
Collection var_collectionvar18_list_coerced$ = null;
Object _dynamic_currentpage = bindings.get("currentpage");
Object _global_subnav = null;
Collection var_collectionvar38_list_coerced$ = null;
out.write("<!-- Header Component Start -->\r\n");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar1 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "all");
    {
        String var_templateoptions2_field$_categories = "header.content";
        {
            java.util.Map var_templateoptions2 = obj().with("categories", var_templateoptions2_field$_categories);
            callUnit(out, renderContext, var_templatevar1, var_templateoptions2);
        }
    }
}
out.write("\r\n\r\n");
_global_header = renderContext.call("use", com.aembootcampui.core.models.HeaderModel.class.getName(), obj());
_global_empty = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_header, "fileReference")));
if (renderContext.getObjectModel().toBoolean(_global_empty)) {
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
    {
        Object var_templatevar3 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
        {
            Object var_templateoptions4_field$_isempty = _global_empty;
            {
                java.util.Map var_templateoptions4 = obj().with("isEmpty", var_templateoptions4_field$_isempty);
                callUnit(out, renderContext, var_templatevar3, var_templateoptions4);
            }
        }
    }
}
out.write("\r\n\r\n");
{
    boolean var_testvariable5 = (!renderContext.getObjectModel().toBoolean(_global_empty));
    if (var_testvariable5) {
        out.write("\r\n    <nav id=\"navbar\">\r\n        <div class=\"header-container\">\r\n            <div class=\"logo cmp-image--logo\" style=\"display: inline-block;\">\r\n                <a class=\"cmp-image\"");
        {
            Object var_attrvalue6 = renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_header, "logoLink"), obj().with("extension", "html"));
            {
                Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "uri");
                {
                    boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (!((Object)false).equals(var_attrvalue6))));
                    if (var_shoulddisplayattr9) {
                        out.write(" href");
                        {
                            boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                            if (!var_istrueattr8) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent7));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(">\r\n                    <img");
        {
            Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(_global_header, "fileReference");
            {
                Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "uri");
                {
                    boolean var_shoulddisplayattr13 = (((null != var_attrcontent11) && (!"".equals(var_attrcontent11))) && ((!"".equals(var_attrvalue10)) && (!((Object)false).equals(var_attrvalue10))));
                    if (var_shoulddisplayattr13) {
                        out.write(" src");
                        {
                            boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                            if (!var_istrueattr12) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(_global_header, "altText");
            {
                Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "attribute");
                {
                    boolean var_shoulddisplayattr17 = (((null != var_attrcontent15) && (!"".equals(var_attrcontent15))) && ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14))));
                    if (var_shoulddisplayattr17) {
                        out.write(" alt");
                        {
                            boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                            if (!var_istrueattr16) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" class=\"cmp-image__image\"/>\r\n                </a>\r\n            </div>\r\n\r\n            <input type=\"checkbox\" id=\"nav-toggle\" class=\"nav-toggle\"/>\r\n            <label for=\"nav-toggle\" class=\"hamburger\">\r\n                <span class=\"hamburger-icon\"></span>\r\n            </label>\r\n\r\n            <ul id=\"nav-links\">\r\n                ");
        {
            Object var_collectionvar18 = renderContext.getObjectModel().resolveProperty(_global_header, "headerNavigationItemsList");
            {
                long var_size19 = ((var_collectionvar18_list_coerced$ == null ? (var_collectionvar18_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar18)) : var_collectionvar18_list_coerced$).size());
                {
                    boolean var_notempty20 = (var_size19 > 0);
                    if (var_notempty20) {
                        {
                            long var_end23 = var_size19;
                            {
                                boolean var_validstartstepend24 = (((0 < var_size19) && true) && (var_end23 > 0));
                                if (var_validstartstepend24) {
                                    if (var_collectionvar18_list_coerced$ == null) {
                                        var_collectionvar18_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar18);
                                    }
                                    long var_index25 = 0;
                                    for (Object nav : var_collectionvar18_list_coerced$) {
                                        {
                                            boolean var_traversal27 = (((var_index25 >= 0) && (var_index25 <= var_end23)) && true);
                                            if (var_traversal27) {
                                                out.write("\r\n                    <li>\r\n                        <a");
                                                {
                                                    Object var_attrvalue28 = renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(nav, "path"), obj().with("extension", "html"));
                                                    {
                                                        Object var_attrcontent29 = renderContext.call("xss", var_attrvalue28, "uri");
                                                        {
                                                            boolean var_shoulddisplayattr31 = (((null != var_attrcontent29) && (!"".equals(var_attrcontent29))) && ((!"".equals(var_attrvalue28)) && (!((Object)false).equals(var_attrvalue28))));
                                                            if (var_shoulddisplayattr31) {
                                                                out.write(" href");
                                                                {
                                                                    boolean var_istrueattr30 = (var_attrvalue28.equals(true));
                                                                    if (!var_istrueattr30) {
                                                                        out.write("=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent29));
                                                                        out.write("\"");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    String var_attrvalue32 = ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(nav, "path"), renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "path"))) ? "current" : "");
                                                    {
                                                        Object var_attrcontent33 = renderContext.call("xss", var_attrvalue32, "attribute");
                                                        {
                                                            boolean var_shoulddisplayattr35 = (((null != var_attrcontent33) && (!"".equals(var_attrcontent33))) && ((!"".equals(var_attrvalue32)) && (!((Object)false).equals(var_attrvalue32))));
                                                            if (var_shoulddisplayattr35) {
                                                                out.write(" class");
                                                                {
                                                                    boolean var_istrueattr34 = (var_attrvalue32.equals(true));
                                                                    if (!var_istrueattr34) {
                                                                        out.write("=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent33));
                                                                        out.write("\"");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                out.write(">");
                                                {
                                                    String var_36 = (("\r\n                            " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(nav, "title"), "text"))) + "\r\n                        ");
                                                    out.write(renderContext.getObjectModel().toString(var_36));
                                                }
                                                out.write("</a>\r\n                        ");
_global_subnav = renderContext.getObjectModel().resolveProperty(nav, "listChildren");
                                                if (renderContext.getObjectModel().toBoolean(_global_subnav)) {
                                                    out.write("<div class=\"childpage\"></div>");
                                                }
                                                out.write("\r\n                        ");
                                                {
                                                    Object var_testvariable37 = _global_subnav;
                                                    if (renderContext.getObjectModel().toBoolean(var_testvariable37)) {
                                                        out.write("<ul class=\"dropdown-list\">\r\n                            ");
                                                        {
                                                            Object var_collectionvar38 = _global_subnav;
                                                            {
                                                                long var_size39 = ((var_collectionvar38_list_coerced$ == null ? (var_collectionvar38_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar38)) : var_collectionvar38_list_coerced$).size());
                                                                {
                                                                    boolean var_notempty40 = (var_size39 > 0);
                                                                    if (var_notempty40) {
                                                                        {
                                                                            long var_end43 = var_size39;
                                                                            {
                                                                                boolean var_validstartstepend44 = (((0 < var_size39) && true) && (var_end43 > 0));
                                                                                if (var_validstartstepend44) {
                                                                                    if (var_collectionvar38_list_coerced$ == null) {
                                                                                        var_collectionvar38_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar38);
                                                                                    }
                                                                                    long var_index45 = 0;
                                                                                    for (Object item : var_collectionvar38_list_coerced$) {
                                                                                        {
                                                                                            boolean var_traversal47 = (((var_index45 >= 0) && (var_index45 <= var_end43)) && true);
                                                                                            if (var_traversal47) {
                                                                                                out.write("<li>\r\n                                <a");
                                                                                                {
                                                                                                    Object var_attrvalue48 = renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(item, "path"), obj().with("extension", "html"));
                                                                                                    {
                                                                                                        Object var_attrcontent49 = renderContext.call("xss", var_attrvalue48, "uri");
                                                                                                        {
                                                                                                            boolean var_shoulddisplayattr51 = (((null != var_attrcontent49) && (!"".equals(var_attrcontent49))) && ((!"".equals(var_attrvalue48)) && (!((Object)false).equals(var_attrvalue48))));
                                                                                                            if (var_shoulddisplayattr51) {
                                                                                                                out.write(" href");
                                                                                                                {
                                                                                                                    boolean var_istrueattr50 = (var_attrvalue48.equals(true));
                                                                                                                    if (!var_istrueattr50) {
                                                                                                                        out.write("=\"");
                                                                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent49));
                                                                                                                        out.write("\"");
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                out.write(">");
                                                                                                {
                                                                                                    Object var_52 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "title"), "text");
                                                                                                    out.write(renderContext.getObjectModel().toString(var_52));
                                                                                                }
                                                                                                out.write("</a>\r\n                            </li>\n");
                                                                                            }
                                                                                        }
                                                                                        var_index45++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            var_collectionvar38_list_coerced$ = null;
                                                        }
                                                        out.write("\r\n                        </ul>");
                                                    }
                                                }
                                                out.write("\r\n                    </li>\r\n                ");
                                            }
                                        }
                                        var_index25++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var_collectionvar18_list_coerced$ = null;
        }
        out.write("\r\n            </ul>\r\n        </div>\r\n    </nav>\r\n");
    }
}
out.write("\r\n<!-- Header Component End -->\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

