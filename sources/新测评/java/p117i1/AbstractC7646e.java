package p117i1;

/* renamed from: i1.e */
/* loaded from: classes3.dex */
public abstract class AbstractC7646e {

    /* renamed from: i1.e$a */
    public class a implements b {

        /* renamed from: a */
        public volatile Object f12888a;

        /* renamed from: b */
        public final /* synthetic */ b f12889b;

        public a(b bVar) {
            this.f12889b = bVar;
        }

        @Override // p117i1.AbstractC7646e.b
        public Object get() {
            if (this.f12888a == null) {
                synchronized (this) {
                    try {
                        if (this.f12888a == null) {
                            this.f12888a = AbstractC7651j.m12683d(this.f12889b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f12888a;
        }
    }

    /* renamed from: i1.e$b */
    public interface b {
        Object get();
    }

    /* renamed from: a */
    public static b m12665a(b bVar) {
        return new a(bVar);
    }
}
