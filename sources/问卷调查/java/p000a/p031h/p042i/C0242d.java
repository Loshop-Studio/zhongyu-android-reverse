package p000a.p031h.p042i;

/* renamed from: a.h.i.d */
/* loaded from: classes.dex */
public class C0242d<T> extends C0241c<T> {

    /* renamed from: c */
    public final Object f1554c;

    public C0242d(int i) {
        super(i);
        this.f1554c = new Object();
    }

    @Override // p000a.p031h.p042i.C0241c
    /* renamed from: a */
    public T mo805a() {
        T t;
        synchronized (this.f1554c) {
            t = (T) super.mo805a();
        }
        return t;
    }

    @Override // p000a.p031h.p042i.C0241c
    /* renamed from: b */
    public boolean mo806b(T t) {
        boolean zMo806b;
        synchronized (this.f1554c) {
            zMo806b = super.mo806b(t);
        }
        return zMo806b;
    }
}
