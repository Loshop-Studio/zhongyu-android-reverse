package p058f5;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p086j5.C6601d;
import p093k5.AbstractC6683f;
import p093k5.C6688k;
import p093k5.C6689l;
import p093k5.C6693p;
import p093k5.C6694q;
import p093k5.C6697t;
import p093k5.InterfaceC6684g;
import p093k5.InterfaceC6686i;

/* renamed from: f5.l */
/* loaded from: classes4.dex */
public final class C6373l {

    /* renamed from: a */
    public final C6693p f7920a;

    public C6373l(C6693p delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f7920a = delegate;
    }

    /* renamed from: b */
    public static final InterfaceC6686i m6731b(C6601d c6601d, int i6, int i7, int i8, int i9, int i10, boolean z6, boolean z7, C6697t c6697t, C6693p pool, C6355a address, InterfaceC6684g user) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(user, "user");
        return new C6688k(new C6689l(new C6694q(c6601d, pool, i6, i7, i8, i9, i10, z6, z7, address, c6697t, user)), c6601d);
    }

    /* renamed from: c */
    public final C6693p m6732c() {
        return this.f7920a;
    }

    public /* synthetic */ C6373l(int i6, long j6, TimeUnit timeUnit, C6601d c6601d, AbstractC6683f abstractC6683f, int i7, int i8, int i9, int i10, int i11, boolean z6, boolean z7, C6697t c6697t, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 5 : i6, (i12 & 2) != 0 ? 5L : j6, (i12 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i12 & 8) != 0 ? C6601d.f8627m : c6601d, (i12 & 16) != 0 ? AbstractC6683f.f8858a.m7733a() : abstractC6683f, (i12 & 32) != 0 ? 10000 : i7, (i12 & 64) != 0 ? 10000 : i8, (i12 & 128) != 0 ? 10000 : i9, (i12 & 256) != 0 ? 10000 : i10, (i12 & 512) == 0 ? i11 : 10000, (i12 & 1024) != 0 ? true : z6, (i12 & 2048) == 0 ? z7 : true, (i12 & 4096) != 0 ? new C6697t() : c6697t);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6373l(int i6, long j6, TimeUnit timeUnit, final C6601d taskRunner, AbstractC6683f connectionListener, final int i7, final int i8, final int i9, final int i10, final int i11, final boolean z6, final boolean z7, final C6697t routeDatabase) {
        this(new C6693p(taskRunner, i6, j6, timeUnit, connectionListener, new Function3() { // from class: f5.k
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C6373l.m6731b(taskRunner, i7, i8, i9, i10, i11, z6, z7, routeDatabase, (C6693p) obj, (C6355a) obj2, (InterfaceC6684g) obj3);
            }
        }));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
    }
}
