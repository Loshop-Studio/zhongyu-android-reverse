package p235r8;

import kotlinx.coroutines.sync.SemaphoreImpl;
import p191n8.AbstractC9448g0;
import p191n8.C9442d0;

/* renamed from: r8.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9945d {

    /* renamed from: a */
    public static final int f19916a = AbstractC9448g0.m17337e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* renamed from: b */
    public static final C9442d0 f19917b = new C9442d0("PERMIT");

    /* renamed from: c */
    public static final C9442d0 f19918c = new C9442d0("TAKEN");

    /* renamed from: d */
    public static final C9442d0 f19919d = new C9442d0("BROKEN");

    /* renamed from: e */
    public static final C9442d0 f19920e = new C9442d0("CANCELLED");

    /* renamed from: f */
    public static final int f19921f = AbstractC9448g0.m17337e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* renamed from: a */
    public static final InterfaceC9944c m18574a(int i10, int i11) {
        return new SemaphoreImpl(i10, i11);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9944c m18575b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m18574a(i10, i11);
    }

    /* renamed from: j */
    public static final C9946e m18583j(long j10, C9946e c9946e) {
        return new C9946e(j10, c9946e, 0);
    }
}
