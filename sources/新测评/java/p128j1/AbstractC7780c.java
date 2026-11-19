package p128j1;

/* renamed from: j1.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7780c {

    /* renamed from: j1.c$b */
    public static class b extends AbstractC7780c {

        /* renamed from: a */
        public volatile boolean f13421a;

        public b() {
            super();
        }

        @Override // p128j1.AbstractC7780c
        /* renamed from: b */
        public void mo13150b(boolean z9) {
            this.f13421a = z9;
        }

        @Override // p128j1.AbstractC7780c
        /* renamed from: c */
        public void mo13151c() {
            if (this.f13421a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* renamed from: a */
    public static AbstractC7780c m13149a() {
        return new b();
    }

    /* renamed from: b */
    public abstract void mo13150b(boolean z9);

    /* renamed from: c */
    public abstract void mo13151c();

    public AbstractC7780c() {
    }
}
