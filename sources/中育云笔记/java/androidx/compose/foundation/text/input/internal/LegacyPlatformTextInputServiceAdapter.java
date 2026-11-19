package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.platform.SoftwareKeyboardController;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.text.input.PlatformTextInputService;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class LegacyPlatformTextInputServiceAdapter implements PlatformTextInputService {
    public static final int $stable = 8;
    private LegacyPlatformTextInputNode textInputModifierNode;

    public interface LegacyPlatformTextInputNode {
        LayoutCoordinates getLayoutCoordinates();

        LegacyTextFieldState getLegacyTextFieldState();

        SoftwareKeyboardController getSoftwareKeyboardController();

        TextFieldSelectionManager getTextFieldSelectionManager();

        ViewConfiguration getViewConfiguration();

        InterfaceC10045g launchTextInputSession(InterfaceC9544p interfaceC9544p);
    }

    public final LegacyPlatformTextInputNode getTextInputModifierNode() {
        return this.textInputModifierNode;
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.textInputModifierNode;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    public final void registerModifier(LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        if (!(this.textInputModifierNode == null)) {
            InlineClassHelperKt.throwIllegalStateException("Expected textInputModifierNode to be null");
        }
        this.textInputModifierNode = legacyPlatformTextInputNode;
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.textInputModifierNode;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    public abstract void startStylusHandwriting();

    public final void unregisterModifier(LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        if (!(this.textInputModifierNode == legacyPlatformTextInputNode)) {
            InlineClassHelperKt.throwIllegalStateException("Expected textInputModifierNode to be " + legacyPlatformTextInputNode + " but was " + this.textInputModifierNode);
        }
        this.textInputModifierNode = null;
    }
}
