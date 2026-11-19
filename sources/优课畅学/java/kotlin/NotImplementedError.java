package kotlin;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
public final class NotImplementedError extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotImplementedError(String message) {
        super(message);
        AbstractC9133u.m16133g(message, "message");
    }

    public /* synthetic */ NotImplementedError(String str, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
