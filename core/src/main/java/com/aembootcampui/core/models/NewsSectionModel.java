package com.aembootcampui.core.models;
        import com.adobe.cq.wcm.core.components.models.ListItem;
        import com.adobe.cq.wcm.core.components.models.NavigationItem;
        import org.apache.sling.api.resource.Resource;
        import org.apache.sling.models.annotations.DefaultInjectionStrategy;
        import org.apache.sling.models.annotations.Model;
        import org.apache.sling.models.annotations.injectorspecific.ChildResource;
        import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

        import java.util.*;

@Model(adaptables = Resource.class,resourceType = NewsSectionModel.RESOURCE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NewsSectionModel {

    protected static final String RESOURCE="aem-bootcamp-ui/components/structure/cases";



    @ChildResource(name = "navigations")
    private final Collection<NavigationItemMulti> navigations = Collections.EMPTY_LIST;


    public Collection<NavigationItemMulti> getNavigations() {
        return navigations;
    }
   }

//    public List<NavigationItem> getNavigations() {
//        List<NavigationItem> navigations = new ArrayList<>();
//        if (Objects.nonNull(navigationsResource)) {
//            for (Resource navigation : navigationsResource.getChildren()) {
//                NavigationItem navigationItem = new NavigationItem(navigation);
//                navigations.add(navigationItem);
//            }
//        }
//        return navigations;
//    }



