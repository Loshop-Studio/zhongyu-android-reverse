package p235r8;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.InterfaceC9100d;
import p191n8.AbstractC9436a0;

/* renamed from: r8.e */
/* loaded from: classes5.dex */
public final class C9946e extends AbstractC9436a0 {

    /* renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f19922e;

    public C9946e(long j10, C9946e c9946e, int i10) {
        super(j10, c9946e, i10);
        this.f19922e = new AtomicReferenceArray(AbstractC9945d.f19921f);
    }

    @Override // p191n8.AbstractC9436a0
    /* renamed from: r */
    public int mo15889r() {
        return AbstractC9945d.f19921f;
    }

    @Override // p191n8.AbstractC9436a0
    /* renamed from: s */
    public void mo15890s(int i10, Throwable th, InterfaceC9100d interfaceC9100d) {
        m18584v().set(i10, AbstractC9945d.f19920e);
        m17295t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f18641c + ", hashCode=" + hashCode() + ']';
    }

    /* renamed from: v */
    public final /* synthetic */ AtomicReferenceArray m18584v() {
        return this.f19922e;
    }
}
