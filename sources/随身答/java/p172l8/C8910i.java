package p172l8;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p216p8.C9342e;
import p226q8.C9383f;

/* renamed from: l8.i */
/* loaded from: classes5.dex */
public final class C8910i {

    /* renamed from: a */
    public final C9383f f14755a;

    public C8910i(C9383f delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f14755a = delegate;
    }

    /* renamed from: a */
    public final C9383f m13872a() {
        return this.f14755a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8910i(int i9, long j9, TimeUnit timeUnit) {
        this(new C9383f(C9342e.f16227i, i9, j9, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public C8910i() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
