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
package org.apache.sling.scripting.sightly.apps.aem__002d__bootcamp__002d__ui.components.structure.news;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class news__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_news = null;
Collection var_collectionvar0_list_coerced$ = null;
_global_news = renderContext.call("use", com.aembootcampui.core.models.NewsModel.class.getName(), obj());
out.write("\r\n    <div class=\"child-page-list\">\r\n        ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_news, "childPages");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object child : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\r\n            <div class=\"child-page-item\">\r\n                ");
                                        {
                                            Object var_testvariable10 = renderContext.getObjectModel().resolveProperty(child, "imagePath");
                                            if (renderContext.getObjectModel().toBoolean(var_testvariable10)) {
                                                out.write("\r\n                    <img");
                                                {
                                                    Object var_attrvalue11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(child, "imagePath"), "uri");
                                                    {
                                                        boolean var_shoulddisplayattr14 = ((!"".equals(var_attrvalue11)) && (!((Object)false).equals(var_attrvalue11)));
                                                        if (var_shoulddisplayattr14) {
                                                            out.write(" src");
                                                            {
                                                                boolean var_istrueattr13 = (var_attrvalue11.equals(true));
                                                                if (!var_istrueattr13) {
                                                                    out.write("=\"");
                                                                    out.write(renderContext.getObjectModel().toString(var_attrvalue11));
                                                                    out.write("\"");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    Object var_attrvalue15 = renderContext.getObjectModel().resolveProperty(child, "title");
                                                    {
                                                        Object var_attrcontent16 = renderContext.call("xss", var_attrvalue15, "attribute");
                                                        {
                                                            boolean var_shoulddisplayattr18 = (((null != var_attrcontent16) && (!"".equals(var_attrcontent16))) && ((!"".equals(var_attrvalue15)) && (!((Object)false).equals(var_attrvalue15))));
                                                            if (var_shoulddisplayattr18) {
                                                                out.write(" alt");
                                                                {
                                                                    boolean var_istrueattr17 = (var_attrvalue15.equals(true));
                                                                    if (!var_istrueattr17) {
                                                                        out.write("=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent16));
                                                                        out.write("\"");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                out.write("/>\r\n                ");
                                            }
                                        }
                                        out.write("\r\n                <h2>");
                                        {
                                            Object var_19 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(child, "title"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_19));
                                        }
                                        out.write("</h2>\r\n                <p>");
                                        {
                                            Object var_20 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(child, "description"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_20));
                                        }
                                        out.write("</p>\r\n            </div>\r\n        ");
                                    }
                                }
                                var_index7++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\r\n    </div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

