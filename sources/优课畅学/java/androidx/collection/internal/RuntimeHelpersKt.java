package androidx.collection.internal;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class RuntimeHelpersKt {
    public static final void checkPrecondition(boolean z10, InterfaceC10559a lazyMessage) {
        AbstractC9133u.m16133g(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        throwIllegalStateException((String) lazyMessage.invoke());
    }

    public static final void requirePrecondition(boolean z10, InterfaceC10559a lazyMessage) {
        AbstractC9133u.m16133g(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        throwIllegalArgumentException((String) lazyMessage.invoke());
    }

    public static final void throwIllegalArgumentException(String message) {
        AbstractC9133u.m16133g(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void throwIllegalStateException(String message) {
        AbstractC9133u.m16133g(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void throwIndexOutOfBoundsException(String message) {
        AbstractC9133u.m16133g(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void throwNoSuchElementException(String message) {
        AbstractC9133u.m16133g(message, "message");
        throw new NoSuchElementException(message);
    }

    public static final Void throwNoSuchElementExceptionForInline(String message) {
        AbstractC9133u.m16133g(message, "message");
        throw new NoSuchElementException(message);
    }
}
