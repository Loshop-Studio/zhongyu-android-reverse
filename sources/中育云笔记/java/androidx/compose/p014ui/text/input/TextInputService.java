package androidx.compose.p014ui.text.input;

import androidx.annotation.RestrictTo;
import androidx.camera.view.AbstractC0979q;
import androidx.compose.p014ui.text.InternalTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public class TextInputService {
    public static final int $stable = 8;
    private final AtomicReference<TextInputSession> _currentInputSession = new AtomicReference<>(null);
    private final PlatformTextInputService platformTextInputService;

    public TextInputService(PlatformTextInputService platformTextInputService) {
        this.platformTextInputService = platformTextInputService;
    }

    public final TextInputSession getCurrentInputSession$ui_text_release() {
        return this._currentInputSession.get();
    }

    @InterfaceC10770a
    public final void hideSoftwareKeyboard() {
        this.platformTextInputService.hideSoftwareKeyboard();
    }

    @InterfaceC10770a
    public final void showSoftwareKeyboard() {
        if (getCurrentInputSession$ui_text_release() != null) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
    }

    public TextInputSession startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.platformTextInputService.startInput(textFieldValue, imeOptions, interfaceC9540l, interfaceC9540l2);
        TextInputSession textInputSession = new TextInputSession(this, this.platformTextInputService);
        this._currentInputSession.set(textInputSession);
        return textInputSession;
    }

    public void stopInput(TextInputSession textInputSession) {
        if (AbstractC0979q.m884a(this._currentInputSession, textInputSession, null)) {
            this.platformTextInputService.stopInput();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public final void stopInput() {
        this._currentInputSession.set(null);
        this.platformTextInputService.stopInput();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public final void startInput() {
        this.platformTextInputService.startInput();
        this._currentInputSession.set(new TextInputSession(this, this.platformTextInputService));
    }
}
