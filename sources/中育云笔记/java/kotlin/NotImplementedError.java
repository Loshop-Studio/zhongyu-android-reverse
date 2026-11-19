package kotlin;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class NotImplementedError extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotImplementedError(String message) {
        super(message);
        AbstractC9979u.m20294g(message, "message");
    }

    public /* synthetic */ NotImplementedError(String str, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
