package androidx.collection.internal;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class RuntimeHelpersKt {
    public static final void checkPrecondition(boolean z10, InterfaceC9529a lazyMessage) {
        AbstractC9979u.m20294g(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        throwIllegalStateException((String) lazyMessage.invoke());
    }

    public static final void requirePrecondition(boolean z10, InterfaceC9529a lazyMessage) {
        AbstractC9979u.m20294g(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        throwIllegalArgumentException((String) lazyMessage.invoke());
    }

    public static final void throwIllegalArgumentException(String message) {
        AbstractC9979u.m20294g(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void throwIllegalStateException(String message) {
        AbstractC9979u.m20294g(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void throwIndexOutOfBoundsException(String message) {
        AbstractC9979u.m20294g(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void throwNoSuchElementException(String message) {
        AbstractC9979u.m20294g(message, "message");
        throw new NoSuchElementException(message);
    }

    public static final Void throwNoSuchElementExceptionForInline(String message) {
        AbstractC9979u.m20294g(message, "message");
        throw new NoSuchElementException(message);
    }
}
