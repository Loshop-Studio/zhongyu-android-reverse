package p127i0;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8748a {

    /* renamed from: a */
    public static final g f16382a = new a();

    /* renamed from: i0.a$b */
    public class b implements d {
        @Override // p127i0.AbstractC8748a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    /* renamed from: i0.a$c */
    public class c implements g {
        @Override // p127i0.AbstractC8748a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo14412a(List list) {
            list.clear();
        }
    }

    /* renamed from: i0.a$d */
    public interface d {
        Object create();
    }

    /* renamed from: i0.a$e */
    public static final class e implements Pools.Pool {

        /* renamed from: a */
        public final d f16383a;

        /* renamed from: b */
        public final g f16384b;

        /* renamed from: c */
        public final Pools.Pool f16385c;

        public e(Pools.Pool pool, d dVar, g gVar) {
            this.f16385c = pool;
            this.f16383a = dVar;
            this.f16384b = gVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public Object acquire() {
            Object objAcquire = this.f16385c.acquire();
            if (objAcquire == null) {
                objAcquire = this.f16383a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    objAcquire.getClass().toString();
                }
            }
            if (objAcquire instanceof f) {
                ((f) objAcquire).mo2886a().mo14422b(false);
            }
            return objAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(Object obj) {
            if (obj instanceof f) {
                ((f) obj).mo2886a().mo14422b(true);
            }
            this.f16384b.mo14412a(obj);
            return this.f16385c.release(obj);
        }
    }

    /* renamed from: i0.a$f */
    public interface f {
        /* renamed from: a */
        AbstractC8750c mo2886a();
    }

    /* renamed from: i0.a$g */
    public interface g {
        /* renamed from: a */
        void mo14412a(Object obj);
    }

    /* renamed from: a */
    public static Pools.Pool m14406a(Pools.Pool pool, d dVar) {
        return m14407b(pool, dVar, m14408c());
    }

    /* renamed from: b */
    public static Pools.Pool m14407b(Pools.Pool pool, d dVar, g gVar) {
        return new e(pool, dVar, gVar);
    }

    /* renamed from: c */
    public static g m14408c() {
        return f16382a;
    }

    /* renamed from: d */
    public static Pools.Pool m14409d(int i10, d dVar) {
        return m14406a(new Pools.SynchronizedPool(i10), dVar);
    }

    /* renamed from: e */
    public static Pools.Pool m14410e() {
        return m14411f(20);
    }

    /* renamed from: f */
    public static Pools.Pool m14411f(int i10) {
        return m14407b(new Pools.SynchronizedPool(i10), new b(), new c());
    }

    /* renamed from: i0.a$a */
    public class a implements g {
        @Override // p127i0.AbstractC8748a.g
        /* renamed from: a */
        public void mo14412a(Object obj) {
        }
    }
}
