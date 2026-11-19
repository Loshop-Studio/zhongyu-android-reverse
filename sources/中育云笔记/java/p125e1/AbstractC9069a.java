package p125e1;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9069a {

    /* renamed from: a */
    public static final g f21237a = new a();

    /* renamed from: e1.a$b */
    public class b implements d {
        @Override // p125e1.AbstractC9069a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    /* renamed from: e1.a$c */
    public class c implements g {
        @Override // p125e1.AbstractC9069a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo17861a(List list) {
            list.clear();
        }
    }

    /* renamed from: e1.a$d */
    public interface d {
        Object create();
    }

    /* renamed from: e1.a$e */
    public static final class e implements Pools.Pool {

        /* renamed from: a */
        public final d f21238a;

        /* renamed from: b */
        public final g f21239b;

        /* renamed from: c */
        public final Pools.Pool f21240c;

        public e(Pools.Pool pool, d dVar, g gVar) {
            this.f21240c = pool;
            this.f21238a = dVar;
            this.f21239b = gVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public Object acquire() {
            Object objAcquire = this.f21240c.acquire();
            if (objAcquire == null) {
                objAcquire = this.f21238a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    objAcquire.getClass().toString();
                }
            }
            if (objAcquire instanceof f) {
                ((f) objAcquire).mo4093d().mo17871b(false);
            }
            return objAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(Object obj) {
            if (obj instanceof f) {
                ((f) obj).mo4093d().mo17871b(true);
            }
            this.f21239b.mo17861a(obj);
            return this.f21240c.release(obj);
        }
    }

    /* renamed from: e1.a$f */
    public interface f {
        /* renamed from: d */
        AbstractC9071c mo4093d();
    }

    /* renamed from: e1.a$g */
    public interface g {
        /* renamed from: a */
        void mo17861a(Object obj);
    }

    /* renamed from: a */
    public static Pools.Pool m17855a(Pools.Pool pool, d dVar) {
        return m17856b(pool, dVar, m17857c());
    }

    /* renamed from: b */
    public static Pools.Pool m17856b(Pools.Pool pool, d dVar, g gVar) {
        return new e(pool, dVar, gVar);
    }

    /* renamed from: c */
    public static g m17857c() {
        return f21237a;
    }

    /* renamed from: d */
    public static Pools.Pool m17858d(int i10, d dVar) {
        return m17855a(new Pools.SynchronizedPool(i10), dVar);
    }

    /* renamed from: e */
    public static Pools.Pool m17859e() {
        return m17860f(20);
    }

    /* renamed from: f */
    public static Pools.Pool m17860f(int i10) {
        return m17856b(new Pools.SynchronizedPool(i10), new b(), new c());
    }

    /* renamed from: e1.a$a */
    public class a implements g {
        @Override // p125e1.AbstractC9069a.g
        /* renamed from: a */
        public void mo17861a(Object obj) {
        }
    }
}
