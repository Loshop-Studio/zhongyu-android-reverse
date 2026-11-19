package be;

import p410xd.AbstractC11845f0;
import p410xd.C11839c0;

/* renamed from: be.j */
/* loaded from: classes6.dex */
public abstract class AbstractC5198j {

    /* renamed from: a */
    public static final int f3064a = AbstractC11845f0.m26265e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* renamed from: b */
    public static final C11839c0 f3065b = new C11839c0("PERMIT");

    /* renamed from: c */
    public static final C11839c0 f3066c = new C11839c0("TAKEN");

    /* renamed from: d */
    public static final C11839c0 f3067d = new C11839c0("BROKEN");

    /* renamed from: e */
    public static final C11839c0 f3068e = new C11839c0("CANCELLED");

    /* renamed from: f */
    public static final int f3069f = AbstractC11845f0.m26265e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* renamed from: a */
    public static final InterfaceC5195g m2750a(int i10, int i11) {
        return new C5197i(i10, i11);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC5195g m2751b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m2750a(i10, i11);
    }

    /* renamed from: j */
    public static final C5199k m2759j(long j10, C5199k c5199k) {
        return new C5199k(j10, c5199k, 0);
    }
}
