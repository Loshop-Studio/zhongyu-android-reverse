package p024c1;

/* renamed from: c1.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4484c {

    /* renamed from: c1.c$b */
    public static class b extends AbstractC4484c {

        /* renamed from: a */
        public volatile boolean f1349a;

        public b() {
            super();
        }

        @Override // p024c1.AbstractC4484c
        /* renamed from: b */
        public void mo1594b(boolean z6) {
            this.f1349a = z6;
        }

        @Override // p024c1.AbstractC4484c
        /* renamed from: c */
        public void mo1595c() {
            if (this.f1349a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* renamed from: a */
    public static AbstractC4484c m1593a() {
        return new b();
    }

    /* renamed from: b */
    public abstract void mo1594b(boolean z6);

    /* renamed from: c */
    public abstract void mo1595c();

    public AbstractC4484c() {
    }
}
