package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: kotlin.b */
/* loaded from: classes6.dex */
public abstract class AbstractC9924b {
    /* renamed from: a */
    public static final Object m20070a(Throwable exception) {
        AbstractC9979u.m20294g(exception, "exception");
        return new Result.Failure(exception);
    }

    /* renamed from: b */
    public static final void m20071b(Object obj) throws Throwable {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f23265c;
        }
    }
}
