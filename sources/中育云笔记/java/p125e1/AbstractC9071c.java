package p125e1;

/* renamed from: e1.c */
/* loaded from: classes3.dex */
public abstract class AbstractC9071c {

    /* renamed from: e1.c$b */
    public static class b extends AbstractC9071c {

        /* renamed from: a */
        public volatile boolean f21241a;

        public b() {
            super();
        }

        @Override // p125e1.AbstractC9071c
        /* renamed from: b */
        public void mo17871b(boolean z10) {
            this.f21241a = z10;
        }

        @Override // p125e1.AbstractC9071c
        /* renamed from: c */
        public void mo17872c() {
            if (this.f21241a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* renamed from: a */
    public static AbstractC9071c m17870a() {
        return new b();
    }

    /* renamed from: b */
    public abstract void mo17871b(boolean z10);

    /* renamed from: c */
    public abstract void mo17872c();

    public AbstractC9071c() {
    }
}
