class UrlMappings {

    static mappings = {
        "/test/$action"(controller: "testController")

        "/$controller/$action?/$id?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(view: "/index")
        "500"(view: '/error')
    }
}
