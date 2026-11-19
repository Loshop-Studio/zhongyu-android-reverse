package p011a9;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p081e9.C7420e;
import p092f9.C7502f;

/* renamed from: a9.i */
/* loaded from: classes5.dex */
public final class C0046i {

    /* renamed from: a */
    public final C7502f f127a;

    public C0046i(C7502f delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f127a = delegate;
    }

    /* renamed from: a */
    public final C7502f m115a() {
        return this.f127a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0046i(int i10, long j10, TimeUnit timeUnit) {
        this(new C7502f(C7420e.f12105i, i10, j10, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public C0046i() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
