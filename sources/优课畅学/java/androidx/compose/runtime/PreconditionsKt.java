package androidx.compose.runtime;

import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class PreconditionsKt {
    public static final void checkPrecondition(boolean z10, InterfaceC10559a interfaceC10559a) {
        if (z10) {
            return;
        }
        throwIllegalStateException((String) interfaceC10559a.invoke());
    }

    public static final void requirePrecondition(boolean z10, InterfaceC10559a interfaceC10559a) {
        if (z10) {
            return;
        }
        throwIllegalArgumentException((String) interfaceC10559a.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    public static final void checkPrecondition(boolean z10) {
        if (z10) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }
}
