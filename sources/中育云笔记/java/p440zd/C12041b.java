package p440zd;

import p410xd.AbstractC11856l;
import sd.AbstractC11106e0;

/* renamed from: zd.b */
/* loaded from: classes6.dex */
public final class C12041b extends AbstractC12044e {

    /* renamed from: i */
    public static final C12041b f28415i = new C12041b();

    public C12041b() {
        super(AbstractC12048i.f28427c, AbstractC12048i.f28428d, AbstractC12048i.f28429e, AbstractC12048i.f28425a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // sd.AbstractC11106e0
    public AbstractC11106e0 limitedParallelism(int i10, String str) {
        AbstractC11856l.m26301a(i10);
        return i10 >= AbstractC12048i.f28427c ? AbstractC11856l.m26302b(this, str) : super.limitedParallelism(i10, str);
    }

    @Override // sd.AbstractC11106e0
    public String toString() {
        return "Dispatchers.Default";
    }
}
