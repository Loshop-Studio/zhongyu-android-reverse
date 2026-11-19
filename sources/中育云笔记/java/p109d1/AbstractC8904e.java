package p109d1;

/* renamed from: d1.e */
/* loaded from: classes3.dex */
public abstract class AbstractC8904e {

    /* renamed from: d1.e$a */
    public class a implements b {

        /* renamed from: a */
        public volatile Object f20870a;

        /* renamed from: b */
        public final /* synthetic */ b f20871b;

        public a(b bVar) {
            this.f20871b = bVar;
        }

        @Override // p109d1.AbstractC8904e.b
        public Object get() {
            if (this.f20870a == null) {
                synchronized (this) {
                    try {
                        if (this.f20870a == null) {
                            this.f20870a = AbstractC8909j.m17468d(this.f20871b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f20870a;
        }
    }

    /* renamed from: d1.e$b */
    public interface b {
        Object get();
    }

    /* renamed from: a */
    public static b m17450a(b bVar) {
        return new a(bVar);
    }
}
