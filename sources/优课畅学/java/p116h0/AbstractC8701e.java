package p116h0;

/* renamed from: h0.e */
/* loaded from: classes3.dex */
public abstract class AbstractC8701e {

    /* renamed from: h0.e$a */
    public class a implements b {

        /* renamed from: a */
        public volatile Object f16312a;

        /* renamed from: b */
        public final /* synthetic */ b f16313b;

        public a(b bVar) {
            this.f16313b = bVar;
        }

        @Override // p116h0.AbstractC8701e.b
        public Object get() {
            if (this.f16312a == null) {
                synchronized (this) {
                    try {
                        if (this.f16312a == null) {
                            this.f16312a = AbstractC8706j.m14181d(this.f16313b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f16312a;
        }
    }

    /* renamed from: h0.e$b */
    public interface b {
        Object get();
    }

    /* renamed from: a */
    public static b m14163a(b bVar) {
        return new a(bVar);
    }
}
