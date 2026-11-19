package p187w0;

import android.util.Log;
import androidx.core.util.Pools;

/* renamed from: w0.d */
/* loaded from: classes2.dex */
public final class C6696d implements Pools.Pool {

    /* renamed from: a */
    public final InterfaceC6695c f11307a;

    /* renamed from: b */
    public final InterfaceC6698f f11308b;

    /* renamed from: c */
    public final Pools.SynchronizedPool f11309c;

    public C6696d(Pools.SynchronizedPool synchronizedPool, InterfaceC6695c interfaceC6695c, InterfaceC6698f interfaceC6698f) {
        this.f11309c = synchronizedPool;
        this.f11307a = interfaceC6695c;
        this.f11308b = interfaceC6698f;
    }

    @Override // androidx.core.util.Pools.Pool
    public final Object acquire() {
        Object objAcquire = this.f11309c.acquire();
        if (objAcquire == null) {
            objAcquire = this.f11307a.mo2052a();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objAcquire.getClass());
            }
        }
        if (objAcquire instanceof InterfaceC6697e) {
            ((InterfaceC6697e) objAcquire).mo2015c().f11311a = false;
        }
        return objAcquire;
    }

    @Override // androidx.core.util.Pools.Pool
    public final boolean release(Object obj) {
        if (obj instanceof InterfaceC6697e) {
            ((InterfaceC6697e) obj).mo2015c().f11311a = true;
        }
        this.f11308b.mo5083b(obj);
        return this.f11309c.release(obj);
    }
}
