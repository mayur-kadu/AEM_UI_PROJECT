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
package org.apache.sling.scripting.sightly.apps.aem__002d__bootcamp__002d__ui.components.structure.image;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class image__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
Object _global_template = null;
Object _dynamic_empty = bindings.get("empty");
Object _global_image = null;
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        String var_templateoptions1_field$_categories = "image1.content";
        {
            java.util.Map var_templateoptions1 = obj().with("categories", var_templateoptions1_field$_categories);
            callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
        }
    }
}
out.write("\n");
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
{
    Object var_templatevar2 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
    {
        Object var_templateoptions3_field$_isempty = _dynamic_empty;
        {
            java.util.Map var_templateoptions3 = obj().with("isEmpty", var_templateoptions3_field$_isempty);
            callUnit(out, renderContext, var_templatevar2, var_templateoptions3);
        }
    }
}
out.write("\n\n");
_global_image = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Image.class.getName(), obj());
{
    Object var_testvariable4 = renderContext.getObjectModel().resolveProperty(_global_image, "fileReference");
    if (renderContext.getObjectModel().toBoolean(var_testvariable4)) {
        out.write("<div class=\"cmp-image1\">\n    <img");
        {
            Object var_attrvalue5 = renderContext.getObjectModel().resolveProperty(_global_image, "fileReference");
            {
                Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "uri");
                {
                    boolean var_shoulddisplayattr8 = (((null != var_attrcontent6) && (!"".equals(var_attrcontent6))) && ((!"".equals(var_attrvalue5)) && (!((Object)false).equals(var_attrvalue5))));
                    if (var_shoulddisplayattr8) {
                        out.write(" src");
                        {
                            boolean var_istrueattr7 = (var_attrvalue5.equals(true));
                            if (!var_istrueattr7) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent6));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" class=\"cmp-image__image1\"");
        {
            Object var_attrvalue9 = renderContext.getObjectModel().resolveProperty(_global_image, "alt");
            {
                Object var_attrcontent10 = renderContext.call("xss", var_attrvalue9, "attribute");
                {
                    boolean var_shoulddisplayattr12 = (((null != var_attrcontent10) && (!"".equals(var_attrcontent10))) && ((!"".equals(var_attrvalue9)) && (!((Object)false).equals(var_attrvalue9))));
                    if (var_shoulddisplayattr12) {
                        out.write(" alt");
                        {
                            boolean var_istrueattr11 = (var_attrvalue9.equals(true));
                            if (!var_istrueattr11) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent10));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue13 = renderContext.getObjectModel().resolveProperty(_global_image, "title");
            {
                Object var_attrcontent14 = renderContext.call("xss", var_attrvalue13, "attribute");
                {
                    boolean var_shoulddisplayattr16 = (((null != var_attrcontent14) && (!"".equals(var_attrcontent14))) && ((!"".equals(var_attrvalue13)) && (!((Object)false).equals(var_attrvalue13))));
                    if (var_shoulddisplayattr16) {
                        out.write(" title");
                        {
                            boolean var_istrueattr15 = (var_attrvalue13.equals(true));
                            if (!var_istrueattr15) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent14));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("/>\n</div>");
    }
}
out.write("\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

