package p000a.p015c.p016a.p017a;

/* renamed from: a.c.a.a.a */
/* loaded from: classes.dex */
public class C0121a extends AbstractC0123c {

    /* renamed from: c */
    public static volatile C0121a f878c;

    /* renamed from: a */
    public AbstractC0123c f879a;

    /* renamed from: b */
    public AbstractC0123c f880b;

    public C0121a() {
        C0122b c0122b = new C0122b();
        this.f880b = c0122b;
        this.f879a = c0122b;
    }

    /* renamed from: b */
    public static C0121a m460b() {
        if (f878c != null) {
            return f878c;
        }
        synchronized (C0121a.class) {
            if (f878c == null) {
                f878c = new C0121a();
            }
        }
        return f878c;
    }

    @Override // p000a.p015c.p016a.p017a.AbstractC0123c
    /* renamed from: a */
    public boolean mo461a() {
        return this.f879a.mo461a();
    }
}
