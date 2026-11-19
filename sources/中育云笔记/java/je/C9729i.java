package je;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9979u;
import ne.C10415e;
import p281oe.C10488f;

/* renamed from: je.i */
/* loaded from: classes6.dex */
public final class C9729i {

    /* renamed from: a */
    public final C10488f f22708a;

    public C9729i(C10488f delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.f22708a = delegate;
    }

    /* renamed from: a */
    public final C10488f m19324a() {
        return this.f22708a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9729i(int i10, long j10, TimeUnit timeUnit) {
        this(new C10488f(C10415e.f24784i, i10, j10, timeUnit));
        AbstractC9979u.m20294g(timeUnit, "timeUnit");
    }

    public C9729i() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
