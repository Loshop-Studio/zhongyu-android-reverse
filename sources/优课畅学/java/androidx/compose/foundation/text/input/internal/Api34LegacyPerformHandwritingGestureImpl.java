package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p013ui.platform.ViewConfiguration;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p300x7.InterfaceC10570l;

@RequiresApi(34)
/* loaded from: classes.dex */
final class Api34LegacyPerformHandwritingGestureImpl {
    public static final Api34LegacyPerformHandwritingGestureImpl INSTANCE = new Api34LegacyPerformHandwritingGestureImpl();

    private Api34LegacyPerformHandwritingGestureImpl() {
    }

    public final void performHandwritingGesture(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, HandwritingGesture handwritingGesture, ViewConfiguration viewConfiguration, Executor executor, final IntConsumer intConsumer, InterfaceC10570l interfaceC10570l) {
        final int iPerformHandwritingGesture$foundation_release = legacyTextFieldState != null ? HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation_release(legacyTextFieldState, handwritingGesture, textFieldSelectionManager, viewConfiguration, interfaceC10570l) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.input.internal.d
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(iPerformHandwritingGesture$foundation_release);
                }
            });
        } else {
            intConsumer.accept(iPerformHandwritingGesture$foundation_release);
        }
    }

    public final boolean previewHandwritingGesture(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (legacyTextFieldState != null) {
            return HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation_release(legacyTextFieldState, previewableHandwritingGesture, textFieldSelectionManager, cancellationSignal);
        }
        return false;
    }
}
