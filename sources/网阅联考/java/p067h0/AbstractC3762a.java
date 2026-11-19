package p067h0;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h0.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3762a {

    /* renamed from: a */
    public static final g f4447a = new a();

    /* renamed from: h0.a$a */
    public class a implements g {
        @Override // p067h0.AbstractC3762a.g
        /* renamed from: a */
        public void mo4856a(Object obj) {
        }
    }

    /* renamed from: h0.a$b */
    public class b implements d {
        @Override // p067h0.AbstractC3762a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List mo1871a() {
            return new ArrayList();
        }
    }

    /* renamed from: h0.a$c */
    public class c implements g {
        @Override // p067h0.AbstractC3762a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4856a(List list) {
            list.clear();
        }
    }

    /* renamed from: h0.a$d */
    public interface d {
        /* renamed from: a */
        Object mo1871a();
    }

    /* renamed from: h0.a$e */
    public static final class e implements Pools.Pool {

        /* renamed from: a */
        public final d f4448a;

        /* renamed from: b */
        public final g f4449b;

        /* renamed from: c */
        public final Pools.Pool f4450c;

        public e(Pools.Pool pool, d dVar, g gVar) {
            this.f4450c = pool;
            this.f4448a = dVar;
            this.f4449b = gVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public Object acquire() {
            Object objAcquire = this.f4450c.acquire();
            if (objAcquire == null) {
                objAcquire = this.f4448a.mo1871a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(objAcquire.getClass());
                }
            }
            if (objAcquire instanceof f) {
                ((f) objAcquire).mo1772e().mo4864b(false);
            }
            return objAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(Object obj) {
            if (obj instanceof f) {
                ((f) obj).mo1772e().mo4864b(true);
            }
            this.f4449b.mo4856a(obj);
            return this.f4450c.release(obj);
        }
    }

    /* renamed from: h0.a$f */
    public interface f {
        /* renamed from: e */
        AbstractC3764c mo1772e();
    }

    /* renamed from: h0.a$g */
    public interface g {
        /* renamed from: a */
        void mo4856a(Object obj);
    }

    /* renamed from: a */
    public static Pools.Pool m4850a(Pools.Pool pool, d dVar) {
        return m4851b(pool, dVar, m4852c());
    }

    /* renamed from: b */
    public static Pools.Pool m4851b(Pools.Pool pool, d dVar, g gVar) {
        return new e(pool, dVar, gVar);
    }

    /* renamed from: c */
    public static g m4852c() {
        return f4447a;
    }

    /* renamed from: d */
    public static Pools.Pool m4853d(int i4, d dVar) {
        return m4850a(new Pools.SynchronizedPool(i4), dVar);
    }

    /* renamed from: e */
    public static Pools.Pool m4854e() {
        return m4855f(20);
    }

    /* renamed from: f */
    public static Pools.Pool m4855f(int i4) {
        return m4851b(new Pools.SynchronizedPool(i4), new b(), new c());
    }
}
