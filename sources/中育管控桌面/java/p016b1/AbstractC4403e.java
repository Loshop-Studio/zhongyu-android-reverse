package p016b1;

/* renamed from: b1.e */
/* loaded from: classes3.dex */
public abstract class AbstractC4403e {

    /* renamed from: b1.e$a */
    public class a implements b {

        /* renamed from: a */
        public volatile Object f1255a;

        /* renamed from: b */
        public final /* synthetic */ b f1256b;

        public a(b bVar) {
            this.f1256b = bVar;
        }

        @Override // p016b1.AbstractC4403e.b
        public Object get() {
            if (this.f1255a == null) {
                synchronized (this) {
                    try {
                        if (this.f1255a == null) {
                            this.f1255a = AbstractC4408j.m1438d(this.f1256b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f1255a;
        }
    }

    /* renamed from: b1.e$b */
    public interface b {
        Object get();
    }

    /* renamed from: a */
    public static b m1420a(b bVar) {
        return new a(bVar);
    }
}
