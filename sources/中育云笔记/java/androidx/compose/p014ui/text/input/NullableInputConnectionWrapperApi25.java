package androidx.compose.p014ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;
import p181hd.InterfaceC9540l;

@RequiresApi(25)
/* loaded from: classes2.dex */
class NullableInputConnectionWrapperApi25 extends NullableInputConnectionWrapperApi24 {
    public NullableInputConnectionWrapperApi25(InputConnection inputConnection, InterfaceC9540l interfaceC9540l) {
        super(inputConnection, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
