package white.box.sclone

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.Initializable

import javafx.animation.AnimationTimer

class ToolboxController implements Initializable {

    def viewer = new Viewer()

    private int pointX_start = 0
    private int pointX_drag = 0
    private int pointX_end = 0

    private int pointY_start = 0
    private int pointY_drag = 0
    private int pointY_end = 0

    /**
     * 範囲選択の処理実施
     */
    @FXML
    private void handleSelectButtonAction(ActionEvent event) {
        println "selectButton clicked!"
//        viewer.start()
        // change cursor

        // Rectangle onMouseMoved
    }

    @FXML
    private void handleViewHideButtonAction(ActionEvent event) {
        println "ボタンの表示切り替えしたいかも"
        viewer.stop()
    }

    @Override
    void initialize(URL url, ResourceBundle rb) {
        // TODO:選択範囲のロード処理とか
    }
}

class Viewer extends AnimationTimer {

    int i = 0
    @Override
    void handle(long now) {
        // 選択範囲の場所をキャプチャ
        // 画面上に表示し続ける
        println i++
    }
}