package p067h0;

/* renamed from: h0.c */
/* loaded from: classes2.dex */
public abstract class AbstractC3764c {

    /* renamed from: h0.c$b */
    public static class b extends AbstractC3764c {

        /* renamed from: a */
        public volatile boolean f4451a;

        public b() {
            super();
        }

        @Override // p067h0.AbstractC3764c
        /* renamed from: b */
        public void mo4864b(boolean z3) {
            this.f4451a = z3;
        }

        @Override // p067h0.AbstractC3764c
        /* renamed from: c */
        public void mo4865c() {
            if (this.f4451a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public AbstractC3764c() {
    }

    /* renamed from: a */
    public static AbstractC3764c m4863a() {
        return new b();
    }

    /* renamed from: b */
    public abstract void mo4864b(boolean z3);

    /* renamed from: c */
    public abstract void mo4865c();
}
