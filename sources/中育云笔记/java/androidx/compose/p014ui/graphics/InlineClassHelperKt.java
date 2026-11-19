package androidx.compose.p014ui.graphics;

import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class InlineClassHelperKt {
    public static final void requirePrecondition(boolean z10, InterfaceC9529a interfaceC9529a) {
        if (z10) {
            return;
        }
        throwIllegalArgumentException((String) interfaceC9529a.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }
}
