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
package org.apache.sling.scripting.sightly.apps.aem__002d__bootcamp__002d__ui.components.structure.customcarousal;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class customcarousal__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
Object _dynamic_properties = bindings.get("properties");
Object _global_carousel = null;
Object _global_templates = null;
Object _dynamic_wcmmode = bindings.get("wcmmode");
Collection var_collectionvar40_list_coerced$ = null;
Collection var_collectionvar90_list_coerced$ = null;
Object _dynamic_resource = bindings.get("resource");
out.write("\n\n");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "all");
    {
        String var_templateoptions1_field$_categories = "customcarousal.validation";
        {
            java.util.Map var_templateoptions1 = obj().with("categories", var_templateoptions1_field$_categories);
            callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
        }
    }
}
out.write("\n<div class=\"cmp-carousal-txt\">\n<h1 class=\"cmp-text\">");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heading"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</h1>\n\n    ");
_global_carousel = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Carousel.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("<div");
{
    Object var_attrvalue3 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? "carousel" : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")));
    {
        Object var_attrcontent4 = renderContext.call("xss", var_attrvalue3, "attribute");
        {
            boolean var_shoulddisplayattr6 = (((null != var_attrcontent4) && (!"".equals(var_attrcontent4))) && ((!"".equals(var_attrvalue3)) && (!((Object)false).equals(var_attrvalue3))));
            if (var_shoulddisplayattr6) {
                out.write(" data-panelcontainer");
                {
                    boolean var_istrueattr5 = (var_attrvalue3.equals(true));
                    if (!var_istrueattr5) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent4));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue7 = renderContext.getObjectModel().resolveProperty(_global_carousel, "id");
    {
        Object var_attrcontent8 = renderContext.call("xss", var_attrvalue7, "attribute");
        {
            boolean var_shoulddisplayattr10 = (((null != var_attrcontent8) && (!"".equals(var_attrcontent8))) && ((!"".equals(var_attrvalue7)) && (!((Object)false).equals(var_attrvalue7))));
            if (var_shoulddisplayattr10) {
                out.write(" id");
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
out.write(" class=\"cmp-carousel\" role=\"group\"");
{
    Object var_attrvalue11 = renderContext.getObjectModel().resolveProperty(_global_carousel, "accessibilityLabel");
    {
        Object var_attrcontent12 = renderContext.call("xss", var_attrvalue11, "attribute");
        {
            boolean var_shoulddisplayattr14 = (((null != var_attrcontent12) && (!"".equals(var_attrcontent12))) && ((!"".equals(var_attrvalue11)) && (!((Object)false).equals(var_attrvalue11))));
            if (var_shoulddisplayattr14) {
                out.write(" aria-label");
                {
                    boolean var_istrueattr13 = (var_attrvalue11.equals(true));
                    if (!var_istrueattr13) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" aria-live=\"polite\" aria-roledescription=\"carousel\" data-cmp-is=\"carousel\"");
{
    Object var_attrvalue15 = (renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "preview")))) ? "" : renderContext.getObjectModel().resolveProperty(_global_carousel, "autoplay"));
    {
        Object var_attrcontent16 = renderContext.call("xss", var_attrvalue15, "attribute");
        {
            boolean var_shoulddisplayattr18 = (((null != var_attrcontent16) && (!"".equals(var_attrcontent16))) && ((!"".equals(var_attrvalue15)) && (!((Object)false).equals(var_attrvalue15))));
            if (var_shoulddisplayattr18) {
                out.write(" data-cmp-autoplay");
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
{
    Object var_attrvalue19 = renderContext.getObjectModel().resolveProperty(_global_carousel, "delay");
    {
        Object var_attrcontent20 = renderContext.call("xss", var_attrvalue19, "attribute");
        {
            boolean var_shoulddisplayattr22 = (((null != var_attrcontent20) && (!"".equals(var_attrcontent20))) && ((!"".equals(var_attrvalue19)) && (!((Object)false).equals(var_attrvalue19))));
            if (var_shoulddisplayattr22) {
                out.write(" data-cmp-delay");
                {
                    boolean var_istrueattr21 = (var_attrvalue19.equals(true));
                    if (!var_istrueattr21) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent20));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue23 = renderContext.getObjectModel().resolveProperty(_global_carousel, "autopauseDisabled");
    {
        Object var_attrcontent24 = renderContext.call("xss", var_attrvalue23, "attribute");
        {
            boolean var_shoulddisplayattr26 = (((null != var_attrcontent24) && (!"".equals(var_attrcontent24))) && ((!"".equals(var_attrvalue23)) && (!((Object)false).equals(var_attrvalue23))));
            if (var_shoulddisplayattr26) {
                out.write(" data-cmp-autopause-disabled");
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
{
    Object var_attrvalue27 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_carousel, "data"), "json");
    {
        Object var_attrcontent28 = renderContext.call("xss", var_attrvalue27, "attribute");
        {
            boolean var_shoulddisplayattr30 = (((null != var_attrcontent28) && (!"".equals(var_attrcontent28))) && ((!"".equals(var_attrvalue27)) && (!((Object)false).equals(var_attrvalue27))));
            if (var_shoulddisplayattr30) {
                out.write(" data-cmp-data-layer");
                {
                    boolean var_istrueattr29 = (var_attrvalue27.equals(true));
                    if (!var_istrueattr29) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent28));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue31 = renderContext.call("i18n", ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? "Please add Carousel components here" : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit"))), obj().with("i18n", null));
    {
        Object var_attrcontent32 = renderContext.call("xss", var_attrvalue31, "attribute");
        {
            boolean var_shoulddisplayattr34 = (((null != var_attrcontent32) && (!"".equals(var_attrcontent32))) && ((!"".equals(var_attrvalue31)) && (!((Object)false).equals(var_attrvalue31))));
            if (var_shoulddisplayattr34) {
                out.write(" data-placeholder-text");
                {
                    boolean var_istrueattr33 = (var_attrvalue31.equals(true));
                    if (!var_istrueattr33) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent32));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\n        ");
{
    Object var_testvariable35 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_carousel, "items")) ? (!(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.leq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_carousel, "items"), "size"), 0))) : renderContext.getObjectModel().resolveProperty(_global_carousel, "items")));
    if (renderContext.getObjectModel().toBoolean(var_testvariable35)) {
        out.write("<div class=\"cmp-carousel__content\" aria-atomic=\"false\"");
        {
            String var_attrvalue36 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_carousel, "autoplay")) ? "off" : "polite");
            {
                Object var_attrcontent37 = renderContext.call("xss", var_attrvalue36, "attribute");
                {
                    boolean var_shoulddisplayattr39 = (((null != var_attrcontent37) && (!"".equals(var_attrcontent37))) && ((!"".equals(var_attrvalue36)) && (!((Object)false).equals(var_attrvalue36))));
                    if (var_shoulddisplayattr39) {
                        out.write(" aria-live");
                        {
                            boolean var_istrueattr38 = (var_attrvalue36.equals(true));
                            if (!var_istrueattr38) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent37));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(">\n            ");
        {
            Object var_collectionvar40 = renderContext.getObjectModel().resolveProperty(_global_carousel, "items");
            {
                long var_size41 = ((var_collectionvar40_list_coerced$ == null ? (var_collectionvar40_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar40)) : var_collectionvar40_list_coerced$).size());
                {
                    boolean var_notempty42 = (var_size41 > 0);
                    if (var_notempty42) {
                        {
                            long var_end45 = var_size41;
                            {
                                boolean var_validstartstepend46 = (((0 < var_size41) && true) && (var_end45 > 0));
                                if (var_validstartstepend46) {
                                    if (var_collectionvar40_list_coerced$ == null) {
                                        var_collectionvar40_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar40);
                                    }
                                    long var_index47 = 0;
                                    for (Object item : var_collectionvar40_list_coerced$) {
                                        {
                                            long itemlist_field$_count = (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.ADD.eval(var_index47, 1)).longValue());
                                            {
                                                boolean itemlist_field$_first = (var_index47 == 0);
                                                {
                                                    boolean var_traversal49 = (((var_index47 >= 0) && (var_index47 <= var_end45)) && true);
                                                    if (var_traversal49) {
                                                        out.write("<div");
                                                        {
                                                            Object var_attrvalue50 = renderContext.getObjectModel().resolveProperty(item, "id");
                                                            {
                                                                Object var_attrcontent51 = renderContext.call("xss", var_attrvalue50, "attribute");
                                                                {
                                                                    boolean var_shoulddisplayattr53 = (((null != var_attrcontent51) && (!"".equals(var_attrcontent51))) && ((!"".equals(var_attrvalue50)) && (!((Object)false).equals(var_attrvalue50))));
                                                                    if (var_shoulddisplayattr53) {
                                                                        out.write(" id");
                                                                        {
                                                                            boolean var_istrueattr52 = (var_attrvalue50.equals(true));
                                                                            if (!var_istrueattr52) {
                                                                                out.write("=\"");
                                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent51));
                                                                                out.write("\"");
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            String var_attrcontent54 = ("cmp-carousel__item" + renderContext.getObjectModel().toString(renderContext.call("xss", (itemlist_field$_first ? " cmp-carousel__item--active" : ""), "attribute")));
                                                            out.write(" class=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent54));
                                                            out.write("\"");
                                                        }
                                                        out.write(" role=\"tabpanel\" aria-roledescription=\"slide\"");
                                                        {
                                                            Object var_attrvalue55 = renderContext.call("format", renderContext.call("i18n", "Slide {0} of {1}", obj()), obj().with("format", (new Object[] {itemlist_field$_count, renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_carousel, "items"), "size")})));
                                                            {
                                                                Object var_attrcontent56 = renderContext.call("xss", var_attrvalue55, "attribute");
                                                                {
                                                                    boolean var_shoulddisplayattr58 = (((null != var_attrcontent56) && (!"".equals(var_attrcontent56))) && ((!"".equals(var_attrvalue55)) && (!((Object)false).equals(var_attrvalue55))));
                                                                    if (var_shoulddisplayattr58) {
                                                                        out.write(" aria-label");
                                                                        {
                                                                            boolean var_istrueattr57 = (var_attrvalue55.equals(true));
                                                                            if (!var_istrueattr57) {
                                                                                out.write("=\"");
                                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent56));
                                                                                out.write("\"");
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            Object var_attrvalue59 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(item, "data"), "json");
                                                            {
                                                                Object var_attrcontent60 = renderContext.call("xss", var_attrvalue59, "attribute");
                                                                {
                                                                    boolean var_shoulddisplayattr62 = (((null != var_attrcontent60) && (!"".equals(var_attrcontent60))) && ((!"".equals(var_attrvalue59)) && (!((Object)false).equals(var_attrvalue59))));
                                                                    if (var_shoulddisplayattr62) {
                                                                        out.write(" data-cmp-data-layer");
                                                                        {
                                                                            boolean var_istrueattr61 = (var_attrvalue59.equals(true));
                                                                            if (!var_istrueattr61) {
                                                                                out.write("=\"");
                                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent60));
                                                                                out.write("\"");
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        out.write(" data-cmp-hook-carousel=\"item\">");
                                                        {
                                                            Object var_resourcecontent63 = renderContext.call("includeResource", renderContext.getObjectModel().resolveProperty(item, "name"), obj().with("decorationTagName", "div"));
                                                            out.write(renderContext.getObjectModel().toString(var_resourcecontent63));
                                                        }
                                                        out.write("</div>\n");
                                                    }
                                                }
                                            }
                                        }
                                        var_index47++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var_collectionvar40_list_coerced$ = null;
        }
        out.write("\n            <div class=\"cmp-carousel__actions\">\n                <button class=\"cmp-carousel__action cmp-carousel__action--previous\" type=\"button\"");
        {
            Object var_attrvalue64 = renderContext.call("i18n", "Previous", obj().with("i18n", null));
            {
                Object var_attrcontent65 = renderContext.call("xss", var_attrvalue64, "attribute");
                {
                    boolean var_shoulddisplayattr67 = (((null != var_attrcontent65) && (!"".equals(var_attrcontent65))) && ((!"".equals(var_attrvalue64)) && (!((Object)false).equals(var_attrvalue64))));
                    if (var_shoulddisplayattr67) {
                        out.write(" aria-label");
                        {
                            boolean var_istrueattr66 = (var_attrvalue64.equals(true));
                            if (!var_istrueattr66) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent65));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" data-cmp-hook-carousel=\"previous\">\n                    <span class=\"cmp-carousel__action-icon\"></span>\n                    <span class=\"cmp-carousel__action-text\">");
        {
            Object var_68 = renderContext.call("xss", renderContext.call("i18n", "Previous", obj().with("i18n", null)), "text");
            out.write(renderContext.getObjectModel().toString(var_68));
        }
        out.write("</span>\n                </button>\n                <button class=\"cmp-carousel__action cmp-carousel__action--next\" type=\"button\"");
        {
            Object var_attrvalue69 = renderContext.call("i18n", "Next", obj().with("i18n", null));
            {
                Object var_attrcontent70 = renderContext.call("xss", var_attrvalue69, "attribute");
                {
                    boolean var_shoulddisplayattr72 = (((null != var_attrcontent70) && (!"".equals(var_attrcontent70))) && ((!"".equals(var_attrvalue69)) && (!((Object)false).equals(var_attrvalue69))));
                    if (var_shoulddisplayattr72) {
                        out.write(" aria-label");
                        {
                            boolean var_istrueattr71 = (var_attrvalue69.equals(true));
                            if (!var_istrueattr71) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent70));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" data-cmp-hook-carousel=\"next\">\n                    <span class=\"cmp-carousel__action-icon\"></span>\n                    <span class=\"cmp-carousel__action-text\">");
        {
            Object var_73 = renderContext.call("xss", renderContext.call("i18n", "Next", obj().with("i18n", null)), "text");
            out.write(renderContext.getObjectModel().toString(var_73));
        }
        out.write("</span>\n                </button>\n                ");
        {
            Object var_testvariable74 = renderContext.getObjectModel().resolveProperty(_global_carousel, "autoplay");
            if (renderContext.getObjectModel().toBoolean(var_testvariable74)) {
                out.write("<button class=\"cmp-carousel__action cmp-carousel__action--pause\" type=\"button\"");
                {
                    Object var_attrvalue75 = renderContext.call("i18n", "Pause", obj().with("i18n", null));
                    {
                        Object var_attrcontent76 = renderContext.call("xss", var_attrvalue75, "attribute");
                        {
                            boolean var_shoulddisplayattr78 = (((null != var_attrcontent76) && (!"".equals(var_attrcontent76))) && ((!"".equals(var_attrvalue75)) && (!((Object)false).equals(var_attrvalue75))));
                            if (var_shoulddisplayattr78) {
                                out.write(" aria-label");
                                {
                                    boolean var_istrueattr77 = (var_attrvalue75.equals(true));
                                    if (!var_istrueattr77) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent76));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write(" data-cmp-hook-carousel=\"pause\">\n                    <span class=\"cmp-carousel__action-icon\"></span>\n                    <span class=\"cmp-carousel__action-text\">");
                {
                    Object var_79 = renderContext.call("xss", renderContext.call("i18n", "Pause", obj().with("i18n", null)), "text");
                    out.write(renderContext.getObjectModel().toString(var_79));
                }
                out.write("</span>\n                </button>");
            }
        }
        out.write("\n                ");
        {
            Object var_testvariable80 = renderContext.getObjectModel().resolveProperty(_global_carousel, "autoplay");
            if (renderContext.getObjectModel().toBoolean(var_testvariable80)) {
                out.write("<button class=\"cmp-carousel__action cmp-carousel__action--play cmp-carousel__action--disabled\" type=\"button\"");
                {
                    Object var_attrvalue81 = renderContext.call("i18n", "Play", obj().with("i18n", null));
                    {
                        Object var_attrcontent82 = renderContext.call("xss", var_attrvalue81, "attribute");
                        {
                            boolean var_shoulddisplayattr84 = (((null != var_attrcontent82) && (!"".equals(var_attrcontent82))) && ((!"".equals(var_attrvalue81)) && (!((Object)false).equals(var_attrvalue81))));
                            if (var_shoulddisplayattr84) {
                                out.write(" aria-label");
                                {
                                    boolean var_istrueattr83 = (var_attrvalue81.equals(true));
                                    if (!var_istrueattr83) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent82));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write(" data-cmp-hook-carousel=\"play\">\n                    <span class=\"cmp-carousel__action-icon\"></span>\n                    <span class=\"cmp-carousel__action-text\">");
                {
                    Object var_85 = renderContext.call("xss", renderContext.call("i18n", "Play", obj().with("i18n", null)), "text");
                    out.write(renderContext.getObjectModel().toString(var_85));
                }
                out.write("</span>\n                </button>");
            }
        }
        out.write("\n            </div>\n            <ol class=\"cmp-carousel__indicators\" role=\"tablist\"");
        {
            Object var_attrvalue86 = renderContext.call("i18n", "Choose a slide to display", obj().with("i18n", null));
            {
                Object var_attrcontent87 = renderContext.call("xss", var_attrvalue86, "attribute");
                {
                    boolean var_shoulddisplayattr89 = (((null != var_attrcontent87) && (!"".equals(var_attrcontent87))) && ((!"".equals(var_attrvalue86)) && (!((Object)false).equals(var_attrvalue86))));
                    if (var_shoulddisplayattr89) {
                        out.write(" aria-label");
                        {
                            boolean var_istrueattr88 = (var_attrvalue86.equals(true));
                            if (!var_istrueattr88) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent87));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" data-cmp-hook-carousel=\"indicators\">\n                ");
        {
            Object var_collectionvar90 = renderContext.getObjectModel().resolveProperty(_global_carousel, "items");
            {
                long var_size91 = ((var_collectionvar90_list_coerced$ == null ? (var_collectionvar90_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar90)) : var_collectionvar90_list_coerced$).size());
                {
                    boolean var_notempty92 = (var_size91 > 0);
                    if (var_notempty92) {
                        {
                            long var_end95 = var_size91;
                            {
                                boolean var_validstartstepend96 = (((0 < var_size91) && true) && (var_end95 > 0));
                                if (var_validstartstepend96) {
                                    if (var_collectionvar90_list_coerced$ == null) {
                                        var_collectionvar90_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar90);
                                    }
                                    long var_index97 = 0;
                                    for (Object item : var_collectionvar90_list_coerced$) {
                                        {
                                            long itemlist_field$_count = (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.ADD.eval(var_index97, 1)).longValue());
                                            {
                                                long itemlist_field$_index = var_index97;
                                                {
                                                    boolean itemlist_field$_first = (var_index97 == 0);
                                                    {
                                                        boolean var_traversal99 = (((var_index97 >= 0) && (var_index97 <= var_end95)) && true);
                                                        if (var_traversal99) {
                                                            out.write("<li");
                                                            {
                                                                String var_attrcontent100 = ("cmp-carousel__indicator" + renderContext.getObjectModel().toString(renderContext.call("xss", (itemlist_field$_first ? " cmp-carousel__indicator--active" : ""), "attribute")));
                                                                out.write(" class=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent100));
                                                                out.write("\"");
                                                            }
                                                            out.write(" role=\"tab\"");
                                                            {
                                                                String var_attrcontent101 = ((renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_carousel, "id"), "attribute")) + "-item-") + renderContext.getObjectModel().toString(renderContext.call("xss", itemlist_field$_index, "attribute")));
                                                                out.write(" aria-controls=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent101));
                                                                out.write("\"");
                                                            }
                                                            {
                                                                Object var_attrvalue102 = renderContext.call("format", renderContext.call("i18n", "Slide {0}", obj()), obj().with("format", (new Object[] {itemlist_field$_count})));
                                                                {
                                                                    Object var_attrcontent103 = renderContext.call("xss", var_attrvalue102, "attribute");
                                                                    {
                                                                        boolean var_shoulddisplayattr105 = (((null != var_attrcontent103) && (!"".equals(var_attrcontent103))) && ((!"".equals(var_attrvalue102)) && (!((Object)false).equals(var_attrvalue102))));
                                                                        if (var_shoulddisplayattr105) {
                                                                            out.write(" aria-label");
                                                                            {
                                                                                boolean var_istrueattr104 = (var_attrvalue102.equals(true));
                                                                                if (!var_istrueattr104) {
                                                                                    out.write("=\"");
                                                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent103));
                                                                                    out.write("\"");
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            out.write(" data-cmp-hook-carousel=\"indicator\">");
                                                            {
                                                                Object var_106 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "title"), "text");
                                                                out.write(renderContext.getObjectModel().toString(var_106));
                                                            }
                                                            out.write("</li>\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        var_index97++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var_collectionvar90_list_coerced$ = null;
        }
        out.write("\n            </ol>\n        </div>");
    }
}
out.write("\n        ");
{
    Object var_testvariable107 = ((renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "preview")))) ? (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.lt(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_carousel, "items"), "size"), 1)) : ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "preview")))));
    if (renderContext.getObjectModel().toBoolean(var_testvariable107)) {
        {
            Object var_resourcecontent108 = renderContext.call("includeResource", renderContext.getObjectModel().resolveProperty(_dynamic_resource, "path"), obj().with("cssClassName", "new section aem-Grid-newComponent").with("decorationTagName", "div").with("appendPath", "/*").with("resourceType", "wcm/foundation/components/parsys/newpar"));
            out.write(renderContext.getObjectModel().toString(var_resourcecontent108));
        }
    }
}
out.write("\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

