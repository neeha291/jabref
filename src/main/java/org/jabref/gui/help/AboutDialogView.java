package org.jabref.gui.help;

import javax.inject.Inject;

import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import org.jabref.gui.ClipBoardManager;
import org.jabref.gui.DialogService;
import org.jabref.gui.util.BaseDialog;
import org.jabref.gui.util.ControlHelper;
import org.jabref.logic.l10n.Localization;
import org.jabref.logic.util.BuildInfo;

import com.airhacks.afterburner.views.ViewLoader;
// TODO: temporarily removed SVG library
//import de.codecentric.centerdevice.javafxsvg.SvgImageLoaderFactory;

public class AboutDialogView extends BaseDialog<Void> {

    @FXML private ButtonType copyVersionButton;
    @FXML private TextArea textAreaVersions;
    @FXML private ImageView iconImage;

    @Inject private DialogService dialogService;
    @Inject private ClipBoardManager clipBoardManager;
    @Inject private BuildInfo buildInfo;

    private AboutDialogViewModel viewModel;

    public AboutDialogView() {
        this.setTitle(Localization.lang("About JabRef"));

        ViewLoader.view(this)
                  .load()
                  .setAsDialogPane(this);

        ControlHelper.setAction(copyVersionButton, getDialogPane(), event -> copyVersionToClipboard());
    }

    @FXML
    private void initialize() {
        viewModel = new AboutDialogViewModel(dialogService, clipBoardManager, buildInfo);

        //SvgImageLoaderFactory.install();
        Image icon = new Image(this.getClass().getResourceAsStream("/icons/jabref.svg"));
        iconImage.setImage(icon);
        textAreaVersions.setText(viewModel.getVersionInfo());
    }

    @FXML
    private void copyVersionToClipboard() {
        viewModel.copyVersionToClipboard();
    }

    @FXML
    private void openJabrefWebsite() {
        viewModel.openJabrefWebsite();
    }

    @FXML
    private void openExternalLibrariesWebsite() {
        viewModel.openExternalLibrariesWebsite();
    }

    @FXML
    private void openGithub() {
        viewModel.openGithub();
    }

    @FXML
    public void openChangeLog() {
        viewModel.openChangeLog();
    }

    @FXML
    public void openLicense() {
        viewModel.openLicense();
    }

    @FXML
    public void openDonation() {
        viewModel.openDonation();
    }

}
