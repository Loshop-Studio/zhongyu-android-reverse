package be;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.InterfaceC9945d;
import p410xd.AbstractC11875z;

/* renamed from: be.k */
/* loaded from: classes6.dex */
public final class C5199k extends AbstractC11875z {

    /* renamed from: g */
    public final /* synthetic */ AtomicReferenceArray f3070g;

    public C5199k(long j10, C5199k c5199k, int i10) {
        super(j10, c5199k, i10);
        this.f3070g = new AtomicReferenceArray(AbstractC5198j.f3069f);
    }

    @Override // p410xd.AbstractC11875z
    /* renamed from: r */
    public int mo2760r() {
        return AbstractC5198j.f3069f;
    }

    @Override // p410xd.AbstractC11875z
    /* renamed from: s */
    public void mo2761s(int i10, Throwable th, InterfaceC9945d interfaceC9945d) {
        m2762v().set(i10, AbstractC5198j.f3068e);
        m26357t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f28135e + ", hashCode=" + hashCode() + ']';
    }

    /* renamed from: v */
    public final /* synthetic */ AtomicReferenceArray m2762v() {
        return this.f3070g;
    }
}
