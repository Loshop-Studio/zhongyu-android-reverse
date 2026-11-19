package androidx.compose.p013ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;
import p300x7.InterfaceC10570l;

@RequiresApi(25)
/* loaded from: classes2.dex */
class NullableInputConnectionWrapperApi25 extends NullableInputConnectionWrapperApi24 {
    public NullableInputConnectionWrapperApi25(InputConnection inputConnection, InterfaceC10570l interfaceC10570l) {
        super(inputConnection, interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
