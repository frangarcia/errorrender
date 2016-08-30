This project replicates an issue on Grails 3.1.10 when rendering view pages that are in a different path of the controller.

I have a controller called ContentController with 2 methods _navPanel_ and _navPanelWithTemplates_. _navPanel_ just tries to render a view from the folder _/common_ and _navPanelWithTemplates_ does the same but instead of with a page with a template. 
_navPanelWithTemplates_ works fine but _navPanel_ does not render anything and it seems is not able to find the page.

To see the problem, start up the application with

```
grails run-app
```


The url http://localhost:8080/content/navPanelWithTemplates renders 

This is my template for header

but the url http://localhost:8080/content/navPanel does NOT render anything and it should render

This is my page for header

