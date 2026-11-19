package androidx.compose.p006ui.platform;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.text.input.TextInputService;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalComposeUiApi
@Metadata(m5174d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m5175d2 = {"Landroidx/compose/ui/platform/DelegatingSoftwareKeyboardController;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "(Landroidx/compose/ui/text/input/TextInputService;)V", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "hide", "", "show", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {
    private final TextInputService textInputService;

    public DelegatingSoftwareKeyboardController(TextInputService textInputService) {
        Intrinsics.checkNotNullParameter(textInputService, "textInputService");
        this.textInputService = textInputService;
    }

    public final TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.p006ui.platform.SoftwareKeyboardController
    public void hide() {
        this.textInputService.hideSoftwareKeyboard();
    }

    @Override // androidx.compose.p006ui.platform.SoftwareKeyboardController
    public /* synthetic */ void hideSoftwareKeyboard() {
        AbstractC1534c2.m753a(this);
    }

    @Override // androidx.compose.p006ui.platform.SoftwareKeyboardController
    public void show() {
        this.textInputService.showSoftwareKeyboard();
    }

    @Override // androidx.compose.p006ui.platform.SoftwareKeyboardController
    public /* synthetic */ void showSoftwareKeyboard() {
        AbstractC1534c2.m754b(this);
    }
}
