package p102f1;

/* renamed from: f1.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7911c {

    /* renamed from: f1.c$b */
    public static class b extends AbstractC7911c {

        /* renamed from: a */
        public volatile boolean f13325a;

        public b() {
            super();
        }

        @Override // p102f1.AbstractC7911c
        /* renamed from: b */
        public void mo12449b(boolean z9) {
            this.f13325a = z9;
        }

        @Override // p102f1.AbstractC7911c
        /* renamed from: c */
        public void mo12450c() {
            if (this.f13325a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* renamed from: a */
    public static AbstractC7911c m12448a() {
        return new b();
    }

    /* renamed from: b */
    public abstract void mo12449b(boolean z9);

    /* renamed from: c */
    public abstract void mo12450c();

    public AbstractC7911c() {
    }
}
