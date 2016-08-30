package errorinclude

class ContentController {

    def index() {}

    def navPanel() {
    	render(view:'/common/header')
    }

    def navPanelWithTemplates() {
    	render(template:'/common/header')
    }
}
