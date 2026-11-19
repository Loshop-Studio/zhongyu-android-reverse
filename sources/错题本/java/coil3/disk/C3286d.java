package coil3.disk;

/* renamed from: coil3.disk.d */
/* loaded from: classes2.dex */
public final class C3286d implements AutoCloseable {

    /* renamed from: a */
    public final C3285c f1946a;

    /* renamed from: b */
    public boolean f1947b;

    /* renamed from: c */
    public final /* synthetic */ C3288f f1948c;

    public C3286d(C3288f c3288f, C3285c c3285c) {
        this.f1948c = c3288f;
        this.f1946a = c3285c;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f1947b) {
            return;
        }
        this.f1947b = true;
        C3288f c3288f = this.f1948c;
        synchronized (c3288f.f1957h) {
            C3285c c3285c = this.f1946a;
            int i = c3285c.f1944h - 1;
            c3285c.f1944h = i;
            if (i == 0 && c3285c.f1942f) {
                c3288f.m2223k(c3285c);
            }
        }
    }
}
