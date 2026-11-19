package p117r2;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p133v2.C4635e;
import p137w2.C4647g;

/* renamed from: r2.j */
/* loaded from: classes2.dex */
public final class C4507j {

    /* renamed from: a */
    public final C4647g f5481a;

    public C4507j(C4647g delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5481a = delegate;
    }

    /* renamed from: a */
    public final C4647g m5883a() {
        return this.f5481a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4507j(int i4, long j4, TimeUnit timeUnit) {
        this(new C4647g(C4635e.f5849h, i4, j4, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public C4507j() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
