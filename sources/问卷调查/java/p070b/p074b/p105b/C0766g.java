package p070b.p074b.p105b;

import java.util.concurrent.atomic.AtomicLong;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;

/* renamed from: b.b.b.g */
/* loaded from: classes.dex */
public class C0766g extends AbstractC0783x<AtomicLong> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0783x f4432a;

    public C0766g(AbstractC0783x abstractC0783x) {
        this.f4432a = abstractC0783x;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: a */
    public AtomicLong mo2370a(C0759a c0759a) {
        return new AtomicLong(((Number) this.f4432a.mo2370a(c0759a)).longValue());
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: b */
    public void mo2371b(C0761c c0761c, AtomicLong atomicLong) {
        this.f4432a.mo2371b(c0761c, Long.valueOf(atomicLong.get()));
    }
}
