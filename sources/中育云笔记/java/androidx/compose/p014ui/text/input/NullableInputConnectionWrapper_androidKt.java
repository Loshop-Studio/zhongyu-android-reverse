package androidx.compose.p014ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class NullableInputConnectionWrapper_androidKt {
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(InputConnection inputConnection, InterfaceC9540l interfaceC9540l) {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 34 ? new NullableInputConnectionWrapperApi34(inputConnection, interfaceC9540l) : i10 >= 25 ? new NullableInputConnectionWrapperApi25(inputConnection, interfaceC9540l) : new NullableInputConnectionWrapperApi24(inputConnection, interfaceC9540l);
    }
}
