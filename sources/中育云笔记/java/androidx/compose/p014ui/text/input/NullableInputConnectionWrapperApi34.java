package androidx.compose.p014ui.text.input;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p181hd.InterfaceC9540l;

@RequiresApi(34)
/* loaded from: classes2.dex */
class NullableInputConnectionWrapperApi34 extends NullableInputConnectionWrapperApi25 {
    public NullableInputConnectionWrapperApi34(InputConnection inputConnection, InterfaceC9540l interfaceC9540l) {
        super(inputConnection, interfaceC9540l);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            delegate.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
