package androidx.compose.p014ui.text.input;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import androidx.annotation.RequiresApi;
import p181hd.InterfaceC9540l;

@RequiresApi(24)
/* loaded from: classes2.dex */
class NullableInputConnectionWrapperApi24 extends NullableInputConnectionWrapperApi21 {
    public NullableInputConnectionWrapperApi24(InputConnection inputConnection, InterfaceC9540l interfaceC9540l) {
        super(inputConnection, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.text.input.NullableInputConnectionWrapperApi21
    public final void closeDelegate(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // androidx.compose.p014ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // androidx.compose.p014ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.getHandler();
        }
        return null;
    }
}
