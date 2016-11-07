package white.box.sclone

import static groovyx.javafx.GroovyFX.start

start {

    def fxml = new javafx.fxml.FXMLLoader(this.class.getResource('/sclone.fxml'))
    stage(title: 'GroovyFX Hello World', visible: true) {
        scene(root: fxml.load(), fill: BLACK, width: 600, height: 250) {
            hbox(padding: 60) {
                text(text: 'Groovy', font: '80pt sanserif') {
                    fill linearGradient(endX: 0, stops: [PALEGREEN, SEAGREEN])
                }
                text(text: 'FX', font: '80pt sanserif') {
                    fill linearGradient(endX: 0, stops: [CYAN, DODGERBLUE])
                    effect dropShadow(color: DODGERBLUE, radius: 25, spread: 0.25)
                }
            }
        }
    }
}