package p127i0;

/* renamed from: i0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC8750c {

    /* renamed from: i0.c$b */
    public static class b extends AbstractC8750c {

        /* renamed from: a */
        public volatile boolean f16386a;

        public b() {
            super();
        }

        @Override // p127i0.AbstractC8750c
        /* renamed from: b */
        public void mo14422b(boolean z10) {
            this.f16386a = z10;
        }

        @Override // p127i0.AbstractC8750c
        /* renamed from: c */
        public void mo14423c() {
            if (this.f16386a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* renamed from: a */
    public static AbstractC8750c m14421a() {
        return new b();
    }

    /* renamed from: b */
    public abstract void mo14422b(boolean z10);

    /* renamed from: c */
    public abstract void mo14423c();

    public AbstractC8750c() {
    }
}
