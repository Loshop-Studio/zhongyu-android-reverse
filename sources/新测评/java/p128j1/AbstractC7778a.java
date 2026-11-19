package p128j1;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7778a {

    /* renamed from: a */
    public static final g f13417a = new a();

    /* renamed from: j1.a$b */
    public class b implements d {
        @Override // p128j1.AbstractC7778a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    /* renamed from: j1.a$c */
    public class c implements g {
        @Override // p128j1.AbstractC7778a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13140a(List list) {
            list.clear();
        }
    }

    /* renamed from: j1.a$d */
    public interface d {
        Object create();
    }

    /* renamed from: j1.a$e */
    public static final class e implements Pools.Pool {

        /* renamed from: a */
        public final d f13418a;

        /* renamed from: b */
        public final g f13419b;

        /* renamed from: c */
        public final Pools.Pool f13420c;

        public e(Pools.Pool pool, d dVar, g gVar) {
            this.f13420c = pool;
            this.f13418a = dVar;
            this.f13419b = gVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public Object acquire() {
            Object objAcquire = this.f13420c.acquire();
            if (objAcquire == null) {
                objAcquire = this.f13418a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    objAcquire.getClass().toString();
                }
            }
            if (objAcquire instanceof f) {
                ((f) objAcquire).mo3443d().mo13150b(false);
            }
            return objAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(Object obj) {
            if (obj instanceof f) {
                ((f) obj).mo3443d().mo13150b(true);
            }
            this.f13419b.mo13140a(obj);
            return this.f13420c.release(obj);
        }
    }

    /* renamed from: j1.a$f */
    public interface f {
        /* renamed from: d */
        AbstractC7780c mo3443d();
    }

    /* renamed from: j1.a$g */
    public interface g {
        /* renamed from: a */
        void mo13140a(Object obj);
    }

    /* renamed from: a */
    public static Pools.Pool m13134a(Pools.Pool pool, d dVar) {
        return m13135b(pool, dVar, m13136c());
    }

    /* renamed from: b */
    public static Pools.Pool m13135b(Pools.Pool pool, d dVar, g gVar) {
        return new e(pool, dVar, gVar);
    }

    /* renamed from: c */
    public static g m13136c() {
        return f13417a;
    }

    /* renamed from: d */
    public static Pools.Pool m13137d(int i10, d dVar) {
        return m13134a(new Pools.SynchronizedPool(i10), dVar);
    }

    /* renamed from: e */
    public static Pools.Pool m13138e() {
        return m13139f(20);
    }

    /* renamed from: f */
    public static Pools.Pool m13139f(int i10) {
        return m13135b(new Pools.SynchronizedPool(i10), new b(), new c());
    }

    /* renamed from: j1.a$a */
    public class a implements g {
        @Override // p128j1.AbstractC7778a.g
        /* renamed from: a */
        public void mo13140a(Object obj) {
        }
    }
}
