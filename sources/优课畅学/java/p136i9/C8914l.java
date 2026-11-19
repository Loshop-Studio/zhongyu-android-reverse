package p136i9;

import com.tencent.smtt.audio.core.utils.TbsDialogBase;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p181m9.C9346d;
import p192n9.AbstractC9479f;
import p192n9.C9484k;
import p192n9.C9485l;
import p192n9.C9489p;
import p192n9.C9490q;
import p192n9.C9493t;
import p192n9.InterfaceC9480g;
import p192n9.InterfaceC9482i;
import p300x7.InterfaceC10575q;

/* renamed from: i9.l */
/* loaded from: classes5.dex */
public final class C8914l {

    /* renamed from: a */
    public final C9489p f16752a;

    public C8914l(C9489p delegate) {
        AbstractC9133u.m16133g(delegate, "delegate");
        this.f16752a = delegate;
    }

    /* renamed from: b */
    public static final InterfaceC9482i m15192b(C9346d c9346d, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, C9493t c9493t, C9489p pool, C8896a address, InterfaceC9480g user) {
        AbstractC9133u.m16133g(pool, "pool");
        AbstractC9133u.m16133g(address, "address");
        AbstractC9133u.m16133g(user, "user");
        return new C9484k(new C9485l(new C9490q(c9346d, pool, i10, i11, i12, i13, i14, z10, z11, address, c9493t, user)), c9346d);
    }

    /* renamed from: c */
    public final C9489p m15193c() {
        return this.f16752a;
    }

    public /* synthetic */ C8914l(int i10, long j10, TimeUnit timeUnit, C9346d c9346d, AbstractC9479f abstractC9479f, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, C9493t c9493t, int i16, AbstractC9126n abstractC9126n) {
        this((i16 & 1) != 0 ? 5 : i10, (i16 & 2) != 0 ? 5L : j10, (i16 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i16 & 8) != 0 ? C9346d.f18415m : c9346d, (i16 & 16) != 0 ? AbstractC9479f.f18728a.m17466a() : abstractC9479f, (i16 & 32) != 0 ? 10000 : i11, (i16 & 64) != 0 ? 10000 : i12, (i16 & 128) != 0 ? 10000 : i13, (i16 & 256) != 0 ? 10000 : i14, (i16 & 512) == 0 ? i15 : TbsDialogBase.BTN_ID_POSITIVE, (i16 & 1024) != 0 ? true : z10, (i16 & 2048) == 0 ? z11 : true, (i16 & 4096) != 0 ? new C9493t() : c9493t);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8914l(int i10, long j10, TimeUnit timeUnit, final C9346d taskRunner, AbstractC9479f connectionListener, final int i11, final int i12, final int i13, final int i14, final int i15, final boolean z10, final boolean z11, final C9493t routeDatabase) {
        this(new C9489p(taskRunner, i10, j10, timeUnit, connectionListener, new InterfaceC10575q() { // from class: i9.k
            @Override // p300x7.InterfaceC10575q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C8914l.m15192b(taskRunner, i11, i12, i13, i14, i15, z10, z11, routeDatabase, (C9489p) obj, (C8896a) obj2, (InterfaceC9480g) obj3);
            }
        }));
        AbstractC9133u.m16133g(timeUnit, "timeUnit");
        AbstractC9133u.m16133g(taskRunner, "taskRunner");
        AbstractC9133u.m16133g(connectionListener, "connectionListener");
        AbstractC9133u.m16133g(routeDatabase, "routeDatabase");
    }
}
