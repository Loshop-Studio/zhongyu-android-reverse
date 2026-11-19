package androidx.compose.runtime;

import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class PreconditionsKt {
    public static final void checkPrecondition(boolean z10, InterfaceC9529a interfaceC9529a) {
        if (z10) {
            return;
        }
        throwIllegalStateException((String) interfaceC9529a.invoke());
    }

    public static final void requirePrecondition(boolean z10, InterfaceC9529a interfaceC9529a) {
        if (z10) {
            return;
        }
        throwIllegalArgumentException((String) interfaceC9529a.invoke());
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
