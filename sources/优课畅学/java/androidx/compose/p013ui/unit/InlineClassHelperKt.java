package androidx.compose.p013ui.unit;

import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class InlineClassHelperKt {
    public static final long DualFloatSignBit = -9223372034707292160L;

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
}
