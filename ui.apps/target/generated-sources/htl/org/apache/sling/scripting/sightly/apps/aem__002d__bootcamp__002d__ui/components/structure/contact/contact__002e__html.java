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
package org.apache.sling.scripting.sightly.apps.aem__002d__bootcamp__002d__ui.components.structure.contact;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class contact__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar1 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "all");
    {
        String var_templateoptions2_field$_categories = "contact.content";
        {
            java.util.Map var_templateoptions2 = obj().with("categories", var_templateoptions2_field$_categories);
            callUnit(out, renderContext, var_templatevar1, var_templateoptions2);
        }
    }
}
out.write("\r\n\r\n<div class=\"col-md-6\">\r\n    <div class=\"contact_box\">\r\n        <h1 class=\"book_text\">Book Appointment</h1>\r\n        <form>\r\n            <input type=\"text\" class=\"Email_text\" placeholder=\"Name\" id=\"nameInput\" required/>\r\n            <input type=\"email\" class=\"Email_text\" placeholder=\"Email\" id=\"emailInput\" required/>\r\n            <textarea class=\"massage-bt\" placeholder=\"Message\" rows=\"5\" id=\"messageInput\" required></textarea>\r\n            <div class=\"send_bt\">\r\n                <button type=\"submit\" class=\"send_button\">SEND</button>\r\n            </div>\r\n        </form>\r\n    </div>\r\n</div>\r\n\r\n<div class=\"cookie_data_section\">\r\n    <h2>Stored Form Data</h2>\r\n    <div id=\"formData\"></div>\r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

