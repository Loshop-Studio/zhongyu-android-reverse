package androidx.compose.animation.core;

import kotlin.KotlinNothingValueException;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class PreconditionsKt {
    public static final void checkPrecondition(boolean z10, InterfaceC10559a interfaceC10559a) {
        if (z10) {
            return;
        }
        throwIllegalStateException((String) interfaceC10559a.invoke());
    }

    public static final <T> T checkPreconditionNotNull(T t10, InterfaceC10559a interfaceC10559a) {
        if (t10 != null) {
            return t10;
        }
        throwIllegalStateExceptionForNullCheck((String) interfaceC10559a.invoke());
        throw new KotlinNothingValueException();
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

    public static final Void throwIllegalStateExceptionForNullCheck(String str) {
        throw new IllegalStateException(str);
    }
}
