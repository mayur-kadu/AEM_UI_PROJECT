package com.aembootcampui.core.models;

import com.day.cq.wcm.api.Page;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;





@Model(adaptables = Resource.class, resourceType = HeaderModel.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderModel {
    protected static final String RESOURCE_TYPE = "aem-bootcamp-ui/components/structure/header";
    List<Page> headerNavigationItemsList;



    @ValueMapValue(name = "fileReference")

    private String fileReference;

    @ValueMapValue(name = "altText")

    private String altText;


    @ValueMapValue(name = "logoLink")

    private String logoLink;


    @ChildResource(injectionStrategy = InjectionStrategy.DEFAULT)
    private Resource navigations;

    @SlingObject
    private ResourceResolver resourceResolver;

    @PostConstruct
    protected void init() {
        headerNavigationItemsList = new ArrayList<>();
        if (navigations != null) {
            Iterator<Resource> children = navigations.listChildren();
            while (children.hasNext()) {
                Resource childResource = children.next();
                ValueMap properties = childResource.adaptTo(ValueMap.class);
                String rootPath = properties.get("rootPath", String.class);
                Resource rootResource = resourceResolver.getResource(rootPath);
                if (rootResource != null) {
                    Page navPage = rootResource.adaptTo(Page.class);
                    if (navPage != null) {
                        if (!navPage.isHideInNav()) {
                            headerNavigationItemsList.add(navPage);
                        }
                    }
                }
            }
        }
    }






    public List<Page> getHeaderNavigationItemsList() {
        return headerNavigationItemsList;
    }

        public String getFileReference() {

        return fileReference;

    }


    public String getAltText() {

        return altText;

    }


    public String getLogoLink() {

        return logoLink;

    }

}