package com.aembootcampui.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NavigationItemMulti {

    @ValueMapValue
    private String title;
    @ValueMapValue
    private String text;
    @ValueMapValue
    private String fileReference;
    @ValueMapValue
    private String altText;
    @ValueMapValue
    private String logoLink;


    @ValueMapValue
    private String dateTime;

//        public NavigationItem(Resource resource) {
////            this.rootPath = resource.getValueMap().get("rootPath", String.class);
//            this.title = resource.getValueMap().get("title", String.class);
//            this.text = resource.getValueMap().get("text", String.class);
//            this.fileReference = resource.getValueMap().get("fileReference", String.class);
//            this.altText = resource.getValueMap().get("altText", String.class);
//            this.logoLink = resource.getValueMap().get("logoLink", String.class);
//        }

//        public String getRootPath() {
//            return rootPath;
//        }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
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

    public String getDateTime() throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = inputFormat.parse(dateTime);
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMMM yyyy");
        return outputFormat.format(date);
    }
}