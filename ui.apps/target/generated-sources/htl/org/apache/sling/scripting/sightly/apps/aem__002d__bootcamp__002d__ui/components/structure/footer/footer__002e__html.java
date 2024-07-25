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
package org.apache.sling.scripting.sightly.apps.aem__002d__bootcamp__002d__ui.components.structure.footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footer__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar1 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        String var_templateoptions2_field$_categories = "footer.content";
        {
            java.util.Map var_templateoptions2 = obj().with("categories", var_templateoptions2_field$_categories);
            callUnit(out, renderContext, var_templatevar1, var_templateoptions2);
        }
    }
}
out.write("\r\n<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\" integrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"/>\r\n<footer>\r\n    <div class=\"footerContainer\">\r\n        <div class=\"socialIcons\">\r\n            <a href=\"https://www.facebook.com/\"><i class=\"fa-brands fa-facebook\"></i></a>\r\n            <a href=\"https://www.instagram.com/\"><i class=\"fa-brands fa-instagram\"></i></a>\r\n            <a href=\"https://x.com/\"><i class=\"fa-brands fa-twitter\"></i></a>\r\n            <a href=\"https://www.google.com/\"><i class=\"fa-brands fa-google-plus\"></i></a>\r\n            <a href=\"https://www.youtube.com/\"><i class=\"fa-brands fa-youtube\"></i></a>\r\n        </div>\r\n        <div class=\"footerNav\">\r\n            <ul>\r\n                <li><a href=\"home.html\">Home</a></li>\r\n                <li><a href=\"news.html\">News</a></li>\r\n                <li><a href=\"about-us.html\">About</a></li>\r\n                <li><a href=\"contact.html\">Contact Us</a></li>\r\n                <li><a href=\"\">our Team</a></li>\r\n            </ul>\r\n        </div>\r\n    </div>\r\n    <div class=\"footerBottom\">\r\n        <p>Copyright &copy;2023; Designed by <span class=\"designer\">Perficient Ind Pvt Ltd</span></p>\r\n    </div>\r\n</footer>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

