package p102f1;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7909a {

    /* renamed from: a */
    public static final g f13321a = new a();

    /* renamed from: f1.a$b */
    public class b implements d {
        @Override // p102f1.AbstractC7909a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    /* renamed from: f1.a$c */
    public class c implements g {
        @Override // p102f1.AbstractC7909a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo12441a(List list) {
            list.clear();
        }
    }

    /* renamed from: f1.a$d */
    public interface d {
        Object create();
    }

    /* renamed from: f1.a$e */
    public static final class e implements Pools.Pool {

        /* renamed from: a */
        public final d f13322a;

        /* renamed from: b */
        public final g f13323b;

        /* renamed from: c */
        public final Pools.Pool f13324c;

        public e(Pools.Pool pool, d dVar, g gVar) {
            this.f13324c = pool;
            this.f13322a = dVar;
            this.f13323b = gVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public Object acquire() {
            Object objAcquire = this.f13324c.acquire();
            if (objAcquire == null) {
                objAcquire = this.f13322a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    objAcquire.getClass().toString();
                }
            }
            if (objAcquire instanceof f) {
                ((f) objAcquire).mo3094b().mo12449b(false);
            }
            return objAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(Object obj) {
            if (obj instanceof f) {
                ((f) obj).mo3094b().mo12449b(true);
            }
            this.f13323b.mo12441a(obj);
            return this.f13324c.release(obj);
        }
    }

    /* renamed from: f1.a$f */
    public interface f {
        /* renamed from: b */
        AbstractC7911c mo3094b();
    }

    /* renamed from: f1.a$g */
    public interface g {
        /* renamed from: a */
        void mo12441a(Object obj);
    }

    /* renamed from: a */
    public static Pools.Pool m12435a(Pools.Pool pool, d dVar) {
        return m12436b(pool, dVar, m12437c());
    }

    /* renamed from: b */
    public static Pools.Pool m12436b(Pools.Pool pool, d dVar, g gVar) {
        return new e(pool, dVar, gVar);
    }

    /* renamed from: c */
    public static g m12437c() {
        return f13321a;
    }

    /* renamed from: d */
    public static Pools.Pool m12438d(int i9, d dVar) {
        return m12435a(new Pools.SynchronizedPool(i9), dVar);
    }

    /* renamed from: e */
    public static Pools.Pool m12439e() {
        return m12440f(20);
    }

    /* renamed from: f */
    public static Pools.Pool m12440f(int i9) {
        return m12436b(new Pools.SynchronizedPool(i9), new b(), new c());
    }

    /* renamed from: f1.a$a */
    public class a implements g {
        @Override // p102f1.AbstractC7909a.g
        /* renamed from: a */
        public void mo12441a(Object obj) {
        }
    }
}
