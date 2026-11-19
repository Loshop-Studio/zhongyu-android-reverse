package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: kotlin.b */
/* loaded from: classes.dex */
public abstract class AbstractC5774b {
    /* renamed from: a */
    public static final Result.Failure m5118a(Throwable exception) {
        AbstractC5830k.m5330g(exception, "exception");
        return new Result.Failure(exception);
    }

    /* renamed from: b */
    public static final void m5119b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
