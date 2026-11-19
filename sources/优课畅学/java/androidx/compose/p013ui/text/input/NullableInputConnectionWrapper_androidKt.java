package androidx.compose.p013ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class NullableInputConnectionWrapper_androidKt {
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(InputConnection inputConnection, InterfaceC10570l interfaceC10570l) {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 34 ? new NullableInputConnectionWrapperApi34(inputConnection, interfaceC10570l) : i10 >= 25 ? new NullableInputConnectionWrapperApi25(inputConnection, interfaceC10570l) : new NullableInputConnectionWrapperApi24(inputConnection, interfaceC10570l);
    }
}
