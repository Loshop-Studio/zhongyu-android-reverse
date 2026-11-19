package androidx.compose.p013ui.internal;

import kotlin.KotlinNothingValueException;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class InlineClassHelperKt {
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

    public static final <T> T requirePreconditionNotNull(T t10, InterfaceC10559a interfaceC10559a) {
        if (t10 != null) {
            return t10;
        }
        throwIllegalArgumentExceptionForNullCheck((String) interfaceC10559a.invoke());
        throw new KotlinNothingValueException();
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final Void throwIllegalArgumentExceptionForNullCheck(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    public static final Void throwIllegalStateExceptionForNullCheck(String str) {
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void throwUnsupportedOperationException(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static final void checkPrecondition(boolean z10) {
        if (z10) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }

    public static final <T> T checkPreconditionNotNull(T t10) {
        if (t10 != null) {
            return t10;
        }
        throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    }
}
