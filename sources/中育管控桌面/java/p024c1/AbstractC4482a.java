package p024c1;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4482a {

    /* renamed from: a */
    public static final g f1345a = new a();

    /* renamed from: c1.a$b */
    public class b implements d {
        @Override // p024c1.AbstractC4482a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    /* renamed from: c1.a$c */
    public class c implements g {
        @Override // p024c1.AbstractC4482a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo1583a(List list) {
            list.clear();
        }
    }

    /* renamed from: c1.a$d */
    public interface d {
        Object create();
    }

    /* renamed from: c1.a$e */
    public static final class e implements Pools.Pool {

        /* renamed from: a */
        public final d f1346a;

        /* renamed from: b */
        public final g f1347b;

        /* renamed from: c */
        public final Pools.Pool f1348c;

        public e(Pools.Pool pool, d dVar, g gVar) {
            this.f1348c = pool;
            this.f1346a = dVar;
            this.f1347b = gVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public Object acquire() {
            Object objAcquire = this.f1348c.acquire();
            if (objAcquire == null) {
                objAcquire = this.f1346a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    objAcquire.getClass().toString();
                }
            }
            if (objAcquire instanceof f) {
                ((f) objAcquire).mo1586d().mo1594b(false);
            }
            return objAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(Object obj) {
            if (obj instanceof f) {
                ((f) obj).mo1586d().mo1594b(true);
            }
            this.f1347b.mo1583a(obj);
            return this.f1348c.release(obj);
        }
    }

    /* renamed from: c1.a$f */
    public interface f {
        /* renamed from: d */
        AbstractC4484c mo1586d();
    }

    /* renamed from: c1.a$g */
    public interface g {
        /* renamed from: a */
        void mo1583a(Object obj);
    }

    /* renamed from: a */
    public static Pools.Pool m1577a(Pools.Pool pool, d dVar) {
        return m1578b(pool, dVar, m1579c());
    }

    /* renamed from: b */
    public static Pools.Pool m1578b(Pools.Pool pool, d dVar, g gVar) {
        return new e(pool, dVar, gVar);
    }

    /* renamed from: c */
    public static g m1579c() {
        return f1345a;
    }

    /* renamed from: d */
    public static Pools.Pool m1580d(int i6, d dVar) {
        return m1577a(new Pools.SynchronizedPool(i6), dVar);
    }

    /* renamed from: e */
    public static Pools.Pool m1581e() {
        return m1582f(20);
    }

    /* renamed from: f */
    public static Pools.Pool m1582f(int i6) {
        return m1578b(new Pools.SynchronizedPool(i6), new b(), new c());
    }

    /* renamed from: c1.a$a */
    public class a implements g {
        @Override // p024c1.AbstractC4482a.g
        /* renamed from: a */
        public void mo1583a(Object obj) {
        }
    }
}
