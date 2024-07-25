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
package org.apache.sling.scripting.sightly.apps.aem__002d__bootcamp__002d__ui.components.structure.heroimage;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class heroimage__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
Object _dynamic_properties = bindings.get("properties");
Object _dynamic_currentpage = bindings.get("currentpage");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar1 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        String var_templateoptions2_field$_categories = "hero.content";
        {
            java.util.Map var_templateoptions2 = obj().with("categories", var_templateoptions2_field$_categories);
            callUnit(out, renderContext, var_templatevar1, var_templateoptions2);
        }
    }
}
out.write("\n<div class=\"hero-container\">\n    <div class=\"banner\">\n        <div class=\"hero-image\"");
{
    String var_attrcontent3 = (("background-image: url('" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "fileReference"), "uri"))) + "');");
    out.write(" style=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent3));
    out.write("\"");
}
out.write(">\n            <div class=\"text-container\">\n                <div class=\"text\">\n                    <strong class=\"heading\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heading"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</strong>\n                    <p class=\"heroImage-title\">");
{
    Object var_5 = renderContext.call("xss", ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title")) ? renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title") : renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "title"))), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\n                    ");
{
    Object var_testvariable6 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonLabel")) ? renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonLinkTo") : renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonLabel")));
    if (renderContext.getObjectModel().toBoolean(var_testvariable6)) {
        out.write("<p>\n                        <a class=\"hero-primary-btn\"");
        {
            Object var_attrvalue7 = renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonLinkTo"), obj().with("extension", "html"));
            {
                Object var_attrcontent8 = renderContext.call("xss", var_attrvalue7, "uri");
                {
                    boolean var_shoulddisplayattr10 = (((null != var_attrcontent8) && (!"".equals(var_attrcontent8))) && ((!"".equals(var_attrvalue7)) && (!((Object)false).equals(var_attrvalue7))));
                    if (var_shoulddisplayattr10) {
                        out.write(" href");
                        {
                            boolean var_istrueattr9 = (var_attrvalue7.equals(true));
                            if (!var_istrueattr9) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent8));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" role=\"button\">");
        {
            Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonLabel"), "text");
            out.write(renderContext.getObjectModel().toString(var_11));
        }
        out.write("</a>\n                    </p>");
    }
}
out.write("\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

