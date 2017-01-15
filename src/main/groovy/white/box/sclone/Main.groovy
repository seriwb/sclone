package white.box.sclone

import static groovyx.javafx.GroovyFX.start

start {

    def titleBarName = "sclone 1"

    stage(title: titleBarName, visible: true) {
        scene(stylesheets: resource("/sclone.css")) {
            fxml(resource('/sclone.fxml'))
        }
    }
    primaryStage.resizable = false
}