package p070b.p074b.p105b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;

/* renamed from: b.b.b.h */
/* loaded from: classes.dex */
public class C0767h extends AbstractC0783x<AtomicLongArray> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0783x f4433a;

    public C0767h(AbstractC0783x abstractC0783x) {
        this.f4433a = abstractC0783x;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: a */
    public AtomicLongArray mo2370a(C0759a c0759a) {
        ArrayList arrayList = new ArrayList();
        c0759a.mo2390a();
        while (c0759a.mo2395i()) {
            arrayList.add(Long.valueOf(((Number) this.f4433a.mo2370a(c0759a)).longValue()));
        }
        c0759a.mo2392e();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: b */
    public void mo2371b(C0761c c0761c, AtomicLongArray atomicLongArray) throws IOException {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        c0761c.mo2404b();
        int length = atomicLongArray2.length();
        for (int i = 0; i < length; i++) {
            this.f4433a.mo2371b(c0761c, Long.valueOf(atomicLongArray2.get(i)));
        }
        c0761c.mo2406e();
    }
}
