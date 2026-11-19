package p136p0;

import androidx.room.AbstractC0621h0;
import java.util.concurrent.atomic.AtomicBoolean;
import p149s0.InterfaceC3375f;

/* renamed from: p0.l */
/* loaded from: classes.dex */
public abstract class AbstractC2995l {

    /* renamed from: a */
    private final AtomicBoolean f11575a = new AtomicBoolean(false);

    /* renamed from: b */
    private final AbstractC0621h0 f11576b;

    /* renamed from: c */
    private volatile InterfaceC3375f f11577c;

    public AbstractC2995l(AbstractC0621h0 abstractC0621h0) {
        this.f11576b = abstractC0621h0;
    }

    /* renamed from: c */
    private InterfaceC3375f m10092c() {
        return this.f11576b.m3543f(mo8256d());
    }

    /* renamed from: e */
    private InterfaceC3375f m10093e(boolean z3) {
        if (!z3) {
            return m10092c();
        }
        if (this.f11577c == null) {
            this.f11577c = m10092c();
        }
        return this.f11577c;
    }

    /* renamed from: a */
    public InterfaceC3375f m10094a() {
        m10095b();
        return m10093e(this.f11575a.compareAndSet(false, true));
    }

    /* renamed from: b */
    protected void m10095b() {
        this.f11576b.m3540c();
    }

    /* renamed from: d */
    protected abstract String mo8256d();

    /* renamed from: f */
    public void m10096f(InterfaceC3375f interfaceC3375f) {
        if (interfaceC3375f == this.f11577c) {
            this.f11575a.set(false);
        }
    }
}
