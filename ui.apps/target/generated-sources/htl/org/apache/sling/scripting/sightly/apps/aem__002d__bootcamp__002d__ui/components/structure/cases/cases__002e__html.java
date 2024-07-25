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
package org.apache.sling.scripting.sightly.apps.aem__002d__bootcamp__002d__ui.components.structure.cases;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class cases__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_clientlib = null;
Collection var_collectionvar3_list_coerced$ = null;
_global_model = renderContext.call("use", com.aembootcampui.core.models.NewsSectionModel.class.getName(), obj());
out.write("\n    ");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar1 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        String var_templateoptions2_field$_categories = "newssection.content";
        {
            java.util.Map var_templateoptions2 = obj().with("categories", var_templateoptions2_field$_categories);
            callUnit(out, renderContext, var_templatevar1, var_templateoptions2);
        }
    }
}
out.write("\n    <div class=\"cases\">\n        <div class=\"cases-cards\">\n            ");
{
    Object var_collectionvar3 = renderContext.getObjectModel().resolveProperty(_global_model, "navigations");
    {
        long var_size4 = ((var_collectionvar3_list_coerced$ == null ? (var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3)) : var_collectionvar3_list_coerced$).size());
        {
            boolean var_notempty5 = (var_size4 > 0);
            if (var_notempty5) {
                {
                    long var_end8 = var_size4;
                    {
                        boolean var_validstartstepend9 = (((0 < var_size4) && true) && (var_end8 > 0));
                        if (var_validstartstepend9) {
                            if (var_collectionvar3_list_coerced$ == null) {
                                var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3);
                            }
                            long var_index10 = 0;
                            for (Object newsitem : var_collectionvar3_list_coerced$) {
                                {
                                    boolean var_traversal12 = (((var_index10 >= 0) && (var_index10 <= var_end8)) && true);
                                    if (var_traversal12) {
                                        out.write("\n                <div class=\"case-card\">\n                    <img");
                                        {
                                            Object var_attrvalue13 = renderContext.getObjectModel().resolveProperty(newsitem, "fileReference");
                                            {
                                                Object var_attrcontent14 = renderContext.call("xss", var_attrvalue13, "uri");
                                                {
                                                    boolean var_shoulddisplayattr16 = (((null != var_attrcontent14) && (!"".equals(var_attrcontent14))) && ((!"".equals(var_attrvalue13)) && (!((Object)false).equals(var_attrvalue13))));
                                                    if (var_shoulddisplayattr16) {
                                                        out.write(" src");
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
                                        {
                                            Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(newsitem, "altText");
                                            {
                                                Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "attribute");
                                                {
                                                    boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17))));
                                                    if (var_shoulddisplayattr20) {
                                                        out.write(" alt");
                                                        {
                                                            boolean var_istrueattr19 = (var_attrvalue17.equals(true));
                                                            if (!var_istrueattr19) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write("/>\n                    <h3>");
                                        {
                                            Object var_21 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(newsitem, "title"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_21));
                                        }
                                        out.write("</h3>\n                    <p>");
                                        {
                                            Object var_22 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(newsitem, "text"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_22));
                                        }
                                        out.write("</p>\n                    <a class=\"sec-btn\"");
                                        {
                                            Object var_attrvalue23 = renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(newsitem, "logoLink"), obj().with("extension", "html"));
                                            {
                                                Object var_attrcontent24 = renderContext.call("xss", var_attrvalue23, "uri");
                                                {
                                                    boolean var_shoulddisplayattr26 = (((null != var_attrcontent24) && (!"".equals(var_attrcontent24))) && ((!"".equals(var_attrvalue23)) && (!((Object)false).equals(var_attrvalue23))));
                                                    if (var_shoulddisplayattr26) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr25 = (var_attrvalue23.equals(true));
                                                            if (!var_istrueattr25) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent24));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(">Read More</a>\n                </div>\n            ");
                                    }
                                }
                                var_index10++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar3_list_coerced$ = null;
}
out.write("\n        </div>\n    </div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

