package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: kotlin.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9079b {
    /* renamed from: a */
    public static final Object m15925a(Throwable exception) {
        AbstractC9133u.m16133g(exception, "exception");
        return new Result.Failure(exception);
    }

    /* renamed from: b */
    public static final void m15926b(Object obj) throws Throwable {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f17352a;
        }
    }
}
