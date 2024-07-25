package com.aembootcampui.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.ResourceResolver;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NewsModel {

    private static final Logger LOG = LoggerFactory.getLogger(NewsModel.class);

    @Self
    private Resource resource;

    @Inject
    private ResourceResolver resourceResolver;

    @ValueMapValue
    private String parentPath;

    private List<ChildPage> childPages = new ArrayList<>();

    @PostConstruct
    protected void init() {
        LOG.debug("Initializing NewsModel with parentPath: {}", parentPath);

        if (resourceResolver != null && parentPath != null) {
            PageManager pageManager = resourceResolver.adaptTo(PageManager.class);
            if (pageManager != null) {
                Page parentPage = pageManager.getPage(parentPath);
                if (parentPage != null) {
                    Iterator<Page> it = parentPage.listChildren();
                    while (it.hasNext()) {
                        Page childPage = it.next();
                        String title = childPage.getTitle();
                        String description = childPage.getDescription();

                        String imagePath = childPage.getProperties().get("file", String.class);

                        LOG.debug("Child page title: {}, description: {}, imagePath: {}", title, description, imagePath);

                        childPages.add(new ChildPage(title, description, imagePath));
                    }
                } else {
                    LOG.warn("Parent page not found for path: {}", parentPath);
                }
            } else {
                LOG.error("PageManager is null");
            }
        } else {
            LOG.error("ResourceResolver is null or parentPath is null");
        }
    }

    public List<ChildPage> getChildPages() {
        return childPages;
    }

    public static class ChildPage {
        private final String title;
        private final String description;
        private final String imagePath;

        public ChildPage(String title, String description, String imagePath) {
            this.title = title;
            this.description = description;
            this.imagePath = imagePath;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getImagePath() {
            return imagePath;
        }
    }
}