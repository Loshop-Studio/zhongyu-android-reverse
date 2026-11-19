package p016b0;

import android.support.v4.media.C0039h;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.AbstractC3415a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.RunnableC3416b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p055f0.C5510o;
import p120n0.InterfaceC6207a;
import p185v7.AbstractC6675d;
import p187w0.C6696d;
import p202y.C6763f;
import p202y.InterfaceC6760c;
import p202y.InterfaceC6764g;
import p202y.InterfaceC6765h;
import p202y.InterfaceC6766i;
import p208z.InterfaceC6802g;

/* renamed from: b0.l */
/* loaded from: classes2.dex */
public final class C3081l {

    /* renamed from: a */
    public final Class f1466a;

    /* renamed from: b */
    public final List f1467b;

    /* renamed from: c */
    public final InterfaceC6207a f1468c;

    /* renamed from: d */
    public final Pools.Pool f1469d;

    /* renamed from: e */
    public final String f1470e;

    public C3081l(Class cls, Class cls2, Class cls3, List list, InterfaceC6207a interfaceC6207a, C6696d c6696d) {
        this.f1466a = cls;
        this.f1467b = list;
        this.f1468c = interfaceC6207a;
        this.f1469d = c6696d;
        this.f1470e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public final InterfaceC3072g0 m2046a(int i, int i8, C0039h c0039h, C6763f c6763f, InterfaceC6802g interfaceC6802g) {
        InterfaceC3072g0 interfaceC3072g0Mo4937a;
        InterfaceC6766i interfaceC6766i;
        EncodeStrategy encodeStrategyMo113g;
        boolean z8;
        boolean z9;
        boolean z10;
        Object c3069f;
        Pools.Pool pool = this.f1469d;
        Object objAcquire = pool.acquire();
        AbstractC6675d.m6344f(objAcquire, "Argument must not be null");
        List list = (List) objAcquire;
        try {
            InterfaceC3072g0 interfaceC3072g0M2047b = m2047b(interfaceC6802g, i, i8, c6763f, list);
            pool.release(list);
            RunnableC3416b runnableC3416b = (RunnableC3416b) c0039h.f97c;
            DataSource dataSource = (DataSource) c0039h.f96b;
            C3077j c3077j = runnableC3416b.f2264a;
            Class<?> cls = interfaceC3072g0M2047b.get().getClass();
            InterfaceC6765h interfaceC6765hM5349g = null;
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                InterfaceC6766i interfaceC6766iM2029e = c3077j.m2029e(cls);
                interfaceC6766i = interfaceC6766iM2029e;
                interfaceC3072g0Mo4937a = interfaceC6766iM2029e.mo4937a(runnableC3416b.f2271h, interfaceC3072g0M2047b, runnableC3416b.f2275l, runnableC3416b.f2276m);
            } else {
                interfaceC3072g0Mo4937a = interfaceC3072g0M2047b;
                interfaceC6766i = null;
            }
            if (!interfaceC3072g0M2047b.equals(interfaceC3072g0Mo4937a)) {
                interfaceC3072g0M2047b.recycle();
            }
            if (c3077j.f1444c.f2209b.f2220d.m5349g(interfaceC3072g0Mo4937a.mo2004a()) != null) {
                interfaceC6765hM5349g = c3077j.f1444c.f2209b.f2220d.m5349g(interfaceC3072g0Mo4937a.mo2004a());
                if (interfaceC6765hM5349g == null) {
                    final Class clsMo2004a = interfaceC3072g0Mo4937a.mo2004a();
                    throw new Registry$MissingComponentException(clsMo2004a) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + clsMo2004a + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                encodeStrategyMo113g = interfaceC6765hM5349g.mo113g(runnableC3416b.f2278o);
            } else {
                encodeStrategyMo113g = EncodeStrategy.NONE;
            }
            InterfaceC6765h interfaceC6765h = interfaceC6765hM5349g;
            InterfaceC6760c interfaceC6760c = runnableC3416b.f2286w;
            ArrayList arrayListM2026b = c3077j.m2026b();
            int size = arrayListM2026b.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    z8 = false;
                    break;
                }
                if (((C5510o) arrayListM2026b.get(i9)).f8529a.equals(interfaceC6760c)) {
                    z8 = true;
                    break;
                }
                i9++;
            }
            if (runnableC3416b.f2277n.mo2051d(!z8, dataSource, encodeStrategyMo113g)) {
                if (interfaceC6765h == null) {
                    final Class<?> cls2 = interfaceC3072g0Mo4937a.get().getClass();
                    throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + cls2 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                int i10 = AbstractC3415a.f2259c[encodeStrategyMo113g.ordinal()];
                if (i10 == 1) {
                    z9 = false;
                    z10 = true;
                    c3069f = new C3069f(runnableC3416b.f2286w, runnableC3416b.f2272i);
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyMo113g);
                    }
                    z9 = false;
                    z10 = true;
                    c3069f = new C3076i0(c3077j.f1444c.f2208a, runnableC3416b.f2286w, runnableC3416b.f2272i, runnableC3416b.f2275l, runnableC3416b.f2276m, interfaceC6766i, cls, runnableC3416b.f2278o);
                }
                C3070f0 c3070f0 = (C3070f0) C3070f0.f1414e.acquire();
                c3070f0.f1418d = z9;
                c3070f0.f1417c = z10;
                c3070f0.f1416b = interfaceC3072g0Mo4937a;
                C3071g c3071g = runnableC3416b.f2269f;
                c3071g.f1420b = c3069f;
                c3071g.f1421c = interfaceC6765h;
                c3071g.f1422d = c3070f0;
                interfaceC3072g0Mo4937a = c3070f0;
            }
            return this.f1468c.mo2017a(interfaceC3072g0Mo4937a, c6763f);
        } catch (Throwable th) {
            pool.release(list);
            throw th;
        }
    }

    /* renamed from: b */
    public final InterfaceC3072g0 m2047b(InterfaceC6802g interfaceC6802g, int i, int i8, C6763f c6763f, List list) throws GlideException {
        List list2 = this.f1467b;
        int size = list2.size();
        InterfaceC3072g0 interfaceC3072g0Mo4971b = null;
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC6764g interfaceC6764g = (InterfaceC6764g) list2.get(i9);
            try {
                if (interfaceC6764g.mo4970a(interfaceC6802g.mo4976c(), c6763f)) {
                    interfaceC3072g0Mo4971b = interfaceC6764g.mo4971b(interfaceC6802g.mo4976c(), i, i8, c6763f);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC6764g, e);
                }
                list.add(e);
            }
            if (interfaceC3072g0Mo4971b != null) {
                break;
            }
        }
        if (interfaceC3072g0Mo4971b != null) {
            return interfaceC3072g0Mo4971b;
        }
        throw new GlideException(this.f1470e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f1466a + ", decoders=" + this.f1467b + ", transcoder=" + this.f1468c + '}';
    }
}
