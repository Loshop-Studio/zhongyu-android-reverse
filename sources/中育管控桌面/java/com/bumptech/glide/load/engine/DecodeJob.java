package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C4680e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.InterfaceC4692d;
import com.bumptech.glide.load.data.InterfaceC4693e;
import com.bumptech.glide.load.engine.C4714e;
import com.bumptech.glide.load.engine.InterfaceC4712c;
import com.bumptech.glide.load.resource.bitmap.C4737a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p016b1.AbstractC4404f;
import p024c1.AbstractC4482a;
import p024c1.AbstractC4483b;
import p024c1.AbstractC4484c;
import p053f0.C6284c;
import p053f0.C6285d;
import p053f0.InterfaceC6283b;
import p053f0.InterfaceC6287f;
import p053f0.InterfaceC6288g;
import p067h0.AbstractC6433c;
import p067h0.C6431a;
import p067h0.C6432b;
import p067h0.C6435e;
import p067h0.C6439i;
import p067h0.C6441k;
import p067h0.InterfaceC6437g;
import p067h0.InterfaceC6440j;
import p081j0.InterfaceC6573a;

/* loaded from: classes3.dex */
public class DecodeJob implements InterfaceC4712c.a, Runnable, Comparable, AbstractC4482a.f {

    /* renamed from: A */
    public DataSource f2314A;

    /* renamed from: B */
    public InterfaceC4692d f2315B;

    /* renamed from: C */
    public volatile InterfaceC4712c f2316C;

    /* renamed from: D */
    public volatile boolean f2317D;

    /* renamed from: E */
    public volatile boolean f2318E;

    /* renamed from: F */
    public boolean f2319F;

    /* renamed from: d */
    public final InterfaceC4707e f2323d;

    /* renamed from: e */
    public final Pools.Pool f2324e;

    /* renamed from: h */
    public C4680e f2327h;

    /* renamed from: i */
    public InterfaceC6283b f2328i;

    /* renamed from: j */
    public Priority f2329j;

    /* renamed from: k */
    public C6435e f2330k;

    /* renamed from: l */
    public int f2331l;

    /* renamed from: m */
    public int f2332m;

    /* renamed from: n */
    public AbstractC6433c f2333n;

    /* renamed from: o */
    public C6285d f2334o;

    /* renamed from: p */
    public InterfaceC4704b f2335p;

    /* renamed from: q */
    public int f2336q;

    /* renamed from: r */
    public Stage f2337r;

    /* renamed from: s */
    public RunReason f2338s;

    /* renamed from: t */
    public long f2339t;

    /* renamed from: u */
    public boolean f2340u;

    /* renamed from: v */
    public Object f2341v;

    /* renamed from: w */
    public Thread f2342w;

    /* renamed from: x */
    public InterfaceC6283b f2343x;

    /* renamed from: y */
    public InterfaceC6283b f2344y;

    /* renamed from: z */
    public Object f2345z;

    /* renamed from: a */
    public final C4713d f2320a = new C4713d();

    /* renamed from: b */
    public final List f2321b = new ArrayList();

    /* renamed from: c */
    public final AbstractC4484c f2322c = AbstractC4484c.m1593a();

    /* renamed from: f */
    public final C4706d f2325f = new C4706d();

    /* renamed from: g */
    public final C4708f f2326g = new C4708f();

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$a */
    public static /* synthetic */ class C4703a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2357a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2358b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f2359c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f2359c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2359c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f2358b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2358b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2358b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2358b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2358b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f2357a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2357a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2357a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface InterfaceC4704b {
        /* renamed from: b */
        void mo2648b(InterfaceC6440j interfaceC6440j, DataSource dataSource, boolean z6);

        /* renamed from: c */
        void mo2649c(GlideException glideException);

        /* renamed from: e */
        void mo2650e(DecodeJob decodeJob);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C4705c implements C4714e.a {

        /* renamed from: a */
        public final DataSource f2360a;

        public C4705c(DataSource dataSource) {
            this.f2360a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.C4714e.a
        /* renamed from: a */
        public InterfaceC6440j mo2651a(InterfaceC6440j interfaceC6440j) {
            return DecodeJob.this.m2641v(this.f2360a, interfaceC6440j);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C4706d {

        /* renamed from: a */
        public InterfaceC6283b f2362a;

        /* renamed from: b */
        public InterfaceC6287f f2363b;

        /* renamed from: c */
        public C6439i f2364c;

        /* renamed from: a */
        public void m2652a() {
            this.f2362a = null;
            this.f2363b = null;
            this.f2364c = null;
        }

        /* renamed from: b */
        public void m2653b(InterfaceC4707e interfaceC4707e, C6285d c6285d) {
            AbstractC4483b.m1587a("DecodeJob.encode");
            try {
                interfaceC4707e.mo2656a().mo7439a(this.f2362a, new C6432b(this.f2363b, this.f2364c, c6285d));
            } finally {
                this.f2364c.m7052f();
                AbstractC4483b.m1591e();
            }
        }

        /* renamed from: c */
        public boolean m2654c() {
            return this.f2364c != null;
        }

        /* renamed from: d */
        public void m2655d(InterfaceC6283b interfaceC6283b, InterfaceC6287f interfaceC6287f, C6439i c6439i) {
            this.f2362a = interfaceC6283b;
            this.f2363b = interfaceC6287f;
            this.f2364c = c6439i;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface InterfaceC4707e {
        /* renamed from: a */
        InterfaceC6573a mo2656a();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C4708f {

        /* renamed from: a */
        public boolean f2365a;

        /* renamed from: b */
        public boolean f2366b;

        /* renamed from: c */
        public boolean f2367c;

        /* renamed from: a */
        public final boolean m2657a(boolean z6) {
            return (this.f2367c || z6 || this.f2366b) && this.f2365a;
        }

        /* renamed from: b */
        public synchronized boolean m2658b() {
            this.f2366b = true;
            return m2657a(false);
        }

        /* renamed from: c */
        public synchronized boolean m2659c() {
            this.f2367c = true;
            return m2657a(false);
        }

        /* renamed from: d */
        public synchronized boolean m2660d(boolean z6) {
            this.f2365a = true;
            return m2657a(z6);
        }

        /* renamed from: e */
        public synchronized void m2661e() {
            this.f2366b = false;
            this.f2365a = false;
            this.f2367c = false;
        }
    }

    public DecodeJob(InterfaceC4707e interfaceC4707e, Pools.Pool pool) {
        this.f2323d = interfaceC4707e;
        this.f2324e = pool;
    }

    /* renamed from: A */
    public final InterfaceC6440j m2617A(Object obj, DataSource dataSource, C4718i c4718i) {
        C6285d c6285dM2631l = m2631l(dataSource);
        InterfaceC4693e interfaceC4693eM2461l = this.f2327h.m2501i().m2461l(obj);
        try {
            return c4718i.m2754a(interfaceC4693eM2461l, c6285dM2631l, this.f2331l, this.f2332m, new C4705c(dataSource));
        } finally {
            interfaceC4693eM2461l.mo2575b();
        }
    }

    /* renamed from: B */
    public final void m2618B() {
        int i6 = C4703a.f2357a[this.f2338s.ordinal()];
        if (i6 == 1) {
            this.f2337r = m2630k(Stage.INITIALIZE);
            this.f2316C = m2629j();
            m2645z();
        } else if (i6 == 2) {
            m2645z();
        } else {
            if (i6 == 3) {
                m2628i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f2338s);
        }
    }

    /* renamed from: C */
    public final void m2619C() {
        Throwable th;
        this.f2322c.mo1595c();
        if (!this.f2317D) {
            this.f2317D = true;
            return;
        }
        if (this.f2321b.isEmpty()) {
            th = null;
        } else {
            List list = this.f2321b;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* renamed from: D */
    public boolean m2620D() {
        Stage stageM2630k = m2630k(Stage.INITIALIZE);
        return stageM2630k == Stage.RESOURCE_CACHE || stageM2630k == Stage.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC4712c.a
    /* renamed from: a */
    public void mo2621a(InterfaceC6283b interfaceC6283b, Object obj, InterfaceC4692d interfaceC4692d, DataSource dataSource, InterfaceC6283b interfaceC6283b2) {
        this.f2343x = interfaceC6283b;
        this.f2345z = obj;
        this.f2315B = interfaceC4692d;
        this.f2314A = dataSource;
        this.f2344y = interfaceC6283b2;
        this.f2319F = interfaceC6283b != this.f2320a.m2685c().get(0);
        if (Thread.currentThread() != this.f2342w) {
            m2644y(RunReason.DECODE_DATA);
            return;
        }
        AbstractC4483b.m1587a("DecodeJob.decodeFromRetrievedData");
        try {
            m2628i();
        } finally {
            AbstractC4483b.m1591e();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC4712c.a
    /* renamed from: b */
    public void mo2622b(InterfaceC6283b interfaceC6283b, Exception exc, InterfaceC4692d interfaceC4692d, DataSource dataSource) {
        interfaceC4692d.mo2585b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.m2671j(interfaceC6283b, dataSource, interfaceC4692d.mo2580a());
        this.f2321b.add(glideException);
        if (Thread.currentThread() != this.f2342w) {
            m2644y(RunReason.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m2645z();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC4712c.a
    /* renamed from: c */
    public void mo2623c() {
        m2644y(RunReason.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // p024c1.AbstractC4482a.f
    /* renamed from: d */
    public AbstractC4484c mo1586d() {
        return this.f2322c;
    }

    /* renamed from: e */
    public void m2624e() {
        this.f2318E = true;
        InterfaceC4712c interfaceC4712c = this.f2316C;
        if (interfaceC4712c != null) {
            interfaceC4712c.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(DecodeJob decodeJob) {
        int iM2632m = m2632m() - decodeJob.m2632m();
        return iM2632m == 0 ? this.f2336q - decodeJob.f2336q : iM2632m;
    }

    /* renamed from: g */
    public final InterfaceC6440j m2626g(InterfaceC4692d interfaceC4692d, Object obj, DataSource dataSource) {
        if (obj == null) {
            interfaceC4692d.mo2585b();
            return null;
        }
        try {
            long jM1422b = AbstractC4404f.m1422b();
            InterfaceC6440j interfaceC6440jM2627h = m2627h(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m2634o("Decoded result " + interfaceC6440jM2627h, jM1422b);
            }
            return interfaceC6440jM2627h;
        } finally {
            interfaceC4692d.mo2585b();
        }
    }

    /* renamed from: h */
    public final InterfaceC6440j m2627h(Object obj, DataSource dataSource) {
        return m2617A(obj, dataSource, this.f2320a.m2690h(obj.getClass()));
    }

    /* renamed from: i */
    public final void m2628i() {
        InterfaceC6440j interfaceC6440jM2626g;
        if (Log.isLoggable("DecodeJob", 2)) {
            m2635p("Retrieved data", this.f2339t, "data: " + this.f2345z + ", cache key: " + this.f2343x + ", fetcher: " + this.f2315B);
        }
        try {
            interfaceC6440jM2626g = m2626g(this.f2315B, this.f2345z, this.f2314A);
        } catch (GlideException e6) {
            e6.m2670i(this.f2344y, this.f2314A);
            this.f2321b.add(e6);
            interfaceC6440jM2626g = null;
        }
        if (interfaceC6440jM2626g != null) {
            m2637r(interfaceC6440jM2626g, this.f2314A, this.f2319F);
        } else {
            m2645z();
        }
    }

    /* renamed from: j */
    public final InterfaceC4712c m2629j() {
        int i6 = C4703a.f2358b[this.f2337r.ordinal()];
        if (i6 == 1) {
            return new C4719j(this.f2320a, this);
        }
        if (i6 == 2) {
            return new C4711b(this.f2320a, this);
        }
        if (i6 == 3) {
            return new C4720k(this.f2320a, this);
        }
        if (i6 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f2337r);
    }

    /* renamed from: k */
    public final Stage m2630k(Stage stage) {
        int i6 = C4703a.f2358b[stage.ordinal()];
        if (i6 == 1) {
            return this.f2333n.mo7040a() ? Stage.DATA_CACHE : m2630k(Stage.DATA_CACHE);
        }
        if (i6 == 2) {
            return this.f2340u ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i6 == 3 || i6 == 4) {
            return Stage.FINISHED;
        }
        if (i6 == 5) {
            return this.f2333n.mo7041b() ? Stage.RESOURCE_CACHE : m2630k(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    /* renamed from: l */
    public final C6285d m2631l(DataSource dataSource) {
        C6285d c6285d = this.f2334o;
        if (Build.VERSION.SDK_INT < 26) {
            return c6285d;
        }
        boolean z6 = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f2320a.m2706x();
        C6284c c6284c = C4737a.f2548j;
        Boolean bool = (Boolean) c6285d.m6420c(c6284c);
        if (bool != null && (!bool.booleanValue() || z6)) {
            return c6285d;
        }
        C6285d c6285d2 = new C6285d();
        c6285d2.m6421d(this.f2334o);
        c6285d2.m6422e(c6284c, Boolean.valueOf(z6));
        return c6285d2;
    }

    /* renamed from: m */
    public final int m2632m() {
        return this.f2329j.ordinal();
    }

    /* renamed from: n */
    public DecodeJob m2633n(C4680e c4680e, Object obj, C6435e c6435e, InterfaceC6283b interfaceC6283b, int i6, int i7, Class cls, Class cls2, Priority priority, AbstractC6433c abstractC6433c, Map map, boolean z6, boolean z7, boolean z8, C6285d c6285d, InterfaceC4704b interfaceC4704b, int i8) {
        this.f2320a.m2704v(c4680e, obj, interfaceC6283b, i6, i7, abstractC6433c, cls, cls2, priority, c6285d, map, z6, z7, this.f2323d);
        this.f2327h = c4680e;
        this.f2328i = interfaceC6283b;
        this.f2329j = priority;
        this.f2330k = c6435e;
        this.f2331l = i6;
        this.f2332m = i7;
        this.f2333n = abstractC6433c;
        this.f2340u = z8;
        this.f2334o = c6285d;
        this.f2335p = interfaceC4704b;
        this.f2336q = i8;
        this.f2338s = RunReason.INITIALIZE;
        this.f2341v = obj;
        return this;
    }

    /* renamed from: o */
    public final void m2634o(String str, long j6) {
        m2635p(str, j6, null);
    }

    /* renamed from: p */
    public final void m2635p(String str, long j6, String str2) {
        AbstractC4404f.m1421a(j6);
        Objects.toString(this.f2330k);
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(str2);
        }
        Thread.currentThread().getName();
    }

    /* renamed from: q */
    public final void m2636q(InterfaceC6440j interfaceC6440j, DataSource dataSource, boolean z6) {
        m2619C();
        this.f2335p.mo2648b(interfaceC6440j, dataSource, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final void m2637r(InterfaceC6440j interfaceC6440j, DataSource dataSource, boolean z6) {
        C6439i c6439i;
        AbstractC4483b.m1587a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (interfaceC6440j instanceof InterfaceC6437g) {
                ((InterfaceC6437g) interfaceC6440j).initialize();
            }
            if (this.f2325f.m2654c()) {
                interfaceC6440j = C6439i.m7049c(interfaceC6440j);
                c6439i = interfaceC6440j;
            } else {
                c6439i = 0;
            }
            m2636q(interfaceC6440j, dataSource, z6);
            this.f2337r = Stage.ENCODE;
            try {
                if (this.f2325f.m2654c()) {
                    this.f2325f.m2653b(this.f2323d, this.f2334o);
                }
                m2639t();
                AbstractC4483b.m1591e();
            } finally {
                if (c6439i != 0) {
                    c6439i.m7052f();
                }
            }
        } catch (Throwable th) {
            AbstractC4483b.m1591e();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC4483b.m1589c("DecodeJob#run(reason=%s, model=%s)", this.f2338s, this.f2341v);
        InterfaceC4692d interfaceC4692d = this.f2315B;
        try {
            try {
                try {
                    if (this.f2318E) {
                        m2638s();
                        if (interfaceC4692d != null) {
                            interfaceC4692d.mo2585b();
                        }
                        AbstractC4483b.m1591e();
                        return;
                    }
                    m2618B();
                    if (interfaceC4692d != null) {
                        interfaceC4692d.mo2585b();
                    }
                    AbstractC4483b.m1591e();
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Objects.toString(this.f2337r);
                    }
                    if (this.f2337r != Stage.ENCODE) {
                        this.f2321b.add(th);
                        m2638s();
                    }
                    if (!this.f2318E) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e6) {
                throw e6;
            }
        } catch (Throwable th2) {
            if (interfaceC4692d != null) {
                interfaceC4692d.mo2585b();
            }
            AbstractC4483b.m1591e();
            throw th2;
        }
    }

    /* renamed from: s */
    public final void m2638s() {
        m2619C();
        this.f2335p.mo2649c(new GlideException("Failed to load resource", new ArrayList(this.f2321b)));
        m2640u();
    }

    /* renamed from: t */
    public final void m2639t() {
        if (this.f2326g.m2658b()) {
            m2643x();
        }
    }

    /* renamed from: u */
    public final void m2640u() {
        if (this.f2326g.m2659c()) {
            m2643x();
        }
    }

    /* renamed from: v */
    public InterfaceC6440j m2641v(DataSource dataSource, InterfaceC6440j interfaceC6440j) {
        InterfaceC6440j interfaceC6440jMo6424a;
        InterfaceC6288g interfaceC6288g;
        EncodeStrategy encodeStrategyMo6423b;
        InterfaceC6283b c6431a;
        Class<?> cls = interfaceC6440j.get().getClass();
        InterfaceC6287f interfaceC6287fM2696n = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            InterfaceC6288g interfaceC6288gM2701s = this.f2320a.m2701s(cls);
            interfaceC6288g = interfaceC6288gM2701s;
            interfaceC6440jMo6424a = interfaceC6288gM2701s.mo6424a(this.f2327h, interfaceC6440j, this.f2331l, this.f2332m);
        } else {
            interfaceC6440jMo6424a = interfaceC6440j;
            interfaceC6288g = null;
        }
        if (!interfaceC6440j.equals(interfaceC6440jMo6424a)) {
            interfaceC6440j.recycle();
        }
        if (this.f2320a.m2705w(interfaceC6440jMo6424a)) {
            interfaceC6287fM2696n = this.f2320a.m2696n(interfaceC6440jMo6424a);
            encodeStrategyMo6423b = interfaceC6287fM2696n.mo6423b(this.f2334o);
        } else {
            encodeStrategyMo6423b = EncodeStrategy.NONE;
        }
        InterfaceC6287f interfaceC6287f = interfaceC6287fM2696n;
        if (!this.f2333n.mo7043d(!this.f2320a.m2707y(this.f2343x), dataSource, encodeStrategyMo6423b)) {
            return interfaceC6440jMo6424a;
        }
        if (interfaceC6287f == null) {
            throw new Registry.NoResultEncoderAvailableException(interfaceC6440jMo6424a.get().getClass());
        }
        int i6 = C4703a.f2359c[encodeStrategyMo6423b.ordinal()];
        if (i6 == 1) {
            c6431a = new C6431a(this.f2343x, this.f2328i);
        } else {
            if (i6 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyMo6423b);
            }
            c6431a = new C6441k(this.f2320a.m2684b(), this.f2343x, this.f2328i, this.f2331l, this.f2332m, interfaceC6288g, cls, this.f2334o);
        }
        C6439i c6439iM7049c = C6439i.m7049c(interfaceC6440jMo6424a);
        this.f2325f.m2655d(c6431a, interfaceC6287f, c6439iM7049c);
        return c6439iM7049c;
    }

    /* renamed from: w */
    public void m2642w(boolean z6) {
        if (this.f2326g.m2660d(z6)) {
            m2643x();
        }
    }

    /* renamed from: x */
    public final void m2643x() {
        this.f2326g.m2661e();
        this.f2325f.m2652a();
        this.f2320a.m2683a();
        this.f2317D = false;
        this.f2327h = null;
        this.f2328i = null;
        this.f2334o = null;
        this.f2329j = null;
        this.f2330k = null;
        this.f2335p = null;
        this.f2337r = null;
        this.f2316C = null;
        this.f2342w = null;
        this.f2343x = null;
        this.f2345z = null;
        this.f2314A = null;
        this.f2315B = null;
        this.f2339t = 0L;
        this.f2318E = false;
        this.f2341v = null;
        this.f2321b.clear();
        this.f2324e.release(this);
    }

    /* renamed from: y */
    public final void m2644y(RunReason runReason) {
        this.f2338s = runReason;
        this.f2335p.mo2650e(this);
    }

    /* renamed from: z */
    public final void m2645z() {
        this.f2342w = Thread.currentThread();
        this.f2339t = AbstractC4404f.m1422b();
        boolean zMo2682d = false;
        while (!this.f2318E && this.f2316C != null && !(zMo2682d = this.f2316C.mo2682d())) {
            this.f2337r = m2630k(this.f2337r);
            this.f2316C = m2629j();
            if (this.f2337r == Stage.SOURCE) {
                m2644y(RunReason.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f2337r == Stage.FINISHED || this.f2318E) && !zMo2682d) {
            m2638s();
        }
    }
}
