package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C5393d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.InterfaceC5405d;
import com.bumptech.glide.load.data.InterfaceC5406e;
import com.bumptech.glide.load.engine.C5427e;
import com.bumptech.glide.load.engine.InterfaceC5425c;
import com.bumptech.glide.load.resource.bitmap.C5450a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p116h0.AbstractC8702f;
import p127i0.AbstractC8748a;
import p127i0.AbstractC8749b;
import p127i0.AbstractC8750c;
import p160l.C9229c;
import p160l.C9230d;
import p160l.InterfaceC9228b;
import p160l.InterfaceC9232f;
import p160l.InterfaceC9233g;
import p182n.AbstractC9350c;
import p182n.C9348a;
import p182n.C9349b;
import p182n.C9352e;
import p182n.C9356i;
import p182n.C9358k;
import p182n.InterfaceC9354g;
import p182n.InterfaceC9357j;
import p204p.InterfaceC9624a;

/* loaded from: classes3.dex */
public class DecodeJob implements InterfaceC5425c.a, Runnable, Comparable, AbstractC8748a.f {

    /* renamed from: A */
    public DataSource f2956A;

    /* renamed from: B */
    public InterfaceC5405d f2957B;

    /* renamed from: C */
    public volatile InterfaceC5425c f2958C;

    /* renamed from: D */
    public volatile boolean f2959D;

    /* renamed from: E */
    public volatile boolean f2960E;

    /* renamed from: F */
    public boolean f2961F;

    /* renamed from: d */
    public final InterfaceC5420e f2965d;

    /* renamed from: e */
    public final Pools.Pool f2966e;

    /* renamed from: h */
    public C5393d f2969h;

    /* renamed from: i */
    public InterfaceC9228b f2970i;

    /* renamed from: j */
    public Priority f2971j;

    /* renamed from: k */
    public C9352e f2972k;

    /* renamed from: l */
    public int f2973l;

    /* renamed from: m */
    public int f2974m;

    /* renamed from: n */
    public AbstractC9350c f2975n;

    /* renamed from: o */
    public C9230d f2976o;

    /* renamed from: p */
    public InterfaceC5417b f2977p;

    /* renamed from: q */
    public int f2978q;

    /* renamed from: r */
    public Stage f2979r;

    /* renamed from: s */
    public RunReason f2980s;

    /* renamed from: t */
    public long f2981t;

    /* renamed from: u */
    public boolean f2982u;

    /* renamed from: v */
    public Object f2983v;

    /* renamed from: w */
    public Thread f2984w;

    /* renamed from: x */
    public InterfaceC9228b f2985x;

    /* renamed from: y */
    public InterfaceC9228b f2986y;

    /* renamed from: z */
    public Object f2987z;

    /* renamed from: a */
    public final C5426d f2962a = new C5426d();

    /* renamed from: b */
    public final List f2963b = new ArrayList();

    /* renamed from: c */
    public final AbstractC8750c f2964c = AbstractC8750c.m14421a();

    /* renamed from: f */
    public final C5419d f2967f = new C5419d();

    /* renamed from: g */
    public final C5421f f2968g = new C5421f();

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
    public static /* synthetic */ class C5416a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2999a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3000b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f3001c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f3001c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3001c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f3000b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3000b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3000b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3000b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3000b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f2999a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2999a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2999a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface InterfaceC5417b {
        /* renamed from: b */
        void mo2914b(InterfaceC9357j interfaceC9357j, DataSource dataSource, boolean z10);

        /* renamed from: c */
        void mo2915c(GlideException glideException);

        /* renamed from: d */
        void mo2916d(DecodeJob decodeJob);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C5418c implements C5427e.a {

        /* renamed from: a */
        public final DataSource f3002a;

        public C5418c(DataSource dataSource) {
            this.f3002a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.C5427e.a
        /* renamed from: a */
        public InterfaceC9357j mo2917a(InterfaceC9357j interfaceC9357j) {
            return DecodeJob.this.m2907v(this.f3002a, interfaceC9357j);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C5419d {

        /* renamed from: a */
        public InterfaceC9228b f3004a;

        /* renamed from: b */
        public InterfaceC9232f f3005b;

        /* renamed from: c */
        public C9356i f3006c;

        /* renamed from: a */
        public void m2918a() {
            this.f3004a = null;
            this.f3005b = null;
            this.f3006c = null;
        }

        /* renamed from: b */
        public void m2919b(InterfaceC5420e interfaceC5420e, C9230d c9230d) {
            AbstractC8749b.m14415a("DecodeJob.encode");
            try {
                interfaceC5420e.mo2922a().mo18171b(this.f3004a, new C9349b(this.f3005b, this.f3006c, c9230d));
            } finally {
                this.f3006c.m17239f();
                AbstractC8749b.m14419e();
            }
        }

        /* renamed from: c */
        public boolean m2920c() {
            return this.f3006c != null;
        }

        /* renamed from: d */
        public void m2921d(InterfaceC9228b interfaceC9228b, InterfaceC9232f interfaceC9232f, C9356i c9356i) {
            this.f3004a = interfaceC9228b;
            this.f3005b = interfaceC9232f;
            this.f3006c = c9356i;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface InterfaceC5420e {
        /* renamed from: a */
        InterfaceC9624a mo2922a();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C5421f {

        /* renamed from: a */
        public boolean f3007a;

        /* renamed from: b */
        public boolean f3008b;

        /* renamed from: c */
        public boolean f3009c;

        /* renamed from: a */
        public final boolean m2923a(boolean z10) {
            return (this.f3009c || z10 || this.f3008b) && this.f3007a;
        }

        /* renamed from: b */
        public synchronized boolean m2924b() {
            this.f3008b = true;
            return m2923a(false);
        }

        /* renamed from: c */
        public synchronized boolean m2925c() {
            this.f3009c = true;
            return m2923a(false);
        }

        /* renamed from: d */
        public synchronized boolean m2926d(boolean z10) {
            this.f3007a = true;
            return m2923a(z10);
        }

        /* renamed from: e */
        public synchronized void m2927e() {
            this.f3008b = false;
            this.f3007a = false;
            this.f3009c = false;
        }
    }

    public DecodeJob(InterfaceC5420e interfaceC5420e, Pools.Pool pool) {
        this.f2965d = interfaceC5420e;
        this.f2966e = pool;
    }

    /* renamed from: A */
    public final InterfaceC9357j m2882A(Object obj, DataSource dataSource, C5431i c5431i) {
        C9230d c9230dM2897l = m2897l(dataSource);
        InterfaceC5406e interfaceC5406eM2724l = this.f2969h.m2763i().m2724l(obj);
        try {
            return c5431i.m3020a(interfaceC5406eM2724l, c9230dM2897l, this.f2973l, this.f2974m, new C5418c(dataSource));
        } finally {
            interfaceC5406eM2724l.mo2841b();
        }
    }

    /* renamed from: B */
    public final void m2883B() {
        int i10 = C5416a.f2999a[this.f2980s.ordinal()];
        if (i10 == 1) {
            this.f2979r = m2896k(Stage.INITIALIZE);
            this.f2958C = m2895j();
            m2911z();
        } else if (i10 == 2) {
            m2911z();
        } else {
            if (i10 == 3) {
                m2894i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f2980s);
        }
    }

    /* renamed from: C */
    public final void m2884C() {
        Throwable th;
        this.f2964c.mo14423c();
        if (!this.f2959D) {
            this.f2959D = true;
            return;
        }
        if (this.f2963b.isEmpty()) {
            th = null;
        } else {
            List list = this.f2963b;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* renamed from: D */
    public boolean m2885D() {
        Stage stageM2896k = m2896k(Stage.INITIALIZE);
        return stageM2896k == Stage.RESOURCE_CACHE || stageM2896k == Stage.DATA_CACHE;
    }

    @Override // p127i0.AbstractC8748a.f
    /* renamed from: a */
    public AbstractC8750c mo2886a() {
        return this.f2964c;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5425c.a
    /* renamed from: b */
    public void mo2887b(InterfaceC9228b interfaceC9228b, Object obj, InterfaceC5405d interfaceC5405d, DataSource dataSource, InterfaceC9228b interfaceC9228b2) {
        this.f2985x = interfaceC9228b;
        this.f2987z = obj;
        this.f2957B = interfaceC5405d;
        this.f2956A = dataSource;
        this.f2986y = interfaceC9228b2;
        this.f2961F = interfaceC9228b != this.f2962a.m2951c().get(0);
        if (Thread.currentThread() != this.f2984w) {
            m2910y(RunReason.DECODE_DATA);
            return;
        }
        AbstractC8749b.m14415a("DecodeJob.decodeFromRetrievedData");
        try {
            m2894i();
        } finally {
            AbstractC8749b.m14419e();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5425c.a
    /* renamed from: c */
    public void mo2888c() {
        m2910y(RunReason.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5425c.a
    /* renamed from: d */
    public void mo2889d(InterfaceC9228b interfaceC9228b, Exception exc, InterfaceC5405d interfaceC5405d, DataSource dataSource) {
        interfaceC5405d.mo2851b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.m2937k(interfaceC9228b, dataSource, interfaceC5405d.mo2846a());
        this.f2963b.add(glideException);
        if (Thread.currentThread() != this.f2984w) {
            m2910y(RunReason.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m2911z();
        }
    }

    /* renamed from: e */
    public void m2890e() {
        this.f2960E = true;
        InterfaceC5425c interfaceC5425c = this.f2958C;
        if (interfaceC5425c != null) {
            interfaceC5425c.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(DecodeJob decodeJob) {
        int iM2898m = m2898m() - decodeJob.m2898m();
        return iM2898m == 0 ? this.f2978q - decodeJob.f2978q : iM2898m;
    }

    /* renamed from: g */
    public final InterfaceC9357j m2892g(InterfaceC5405d interfaceC5405d, Object obj, DataSource dataSource) {
        if (obj == null) {
            interfaceC5405d.mo2851b();
            return null;
        }
        try {
            long jM14165b = AbstractC8702f.m14165b();
            InterfaceC9357j interfaceC9357jM2893h = m2893h(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m2900o("Decoded result " + interfaceC9357jM2893h, jM14165b);
            }
            return interfaceC9357jM2893h;
        } finally {
            interfaceC5405d.mo2851b();
        }
    }

    /* renamed from: h */
    public final InterfaceC9357j m2893h(Object obj, DataSource dataSource) {
        return m2882A(obj, dataSource, this.f2962a.m2956h(obj.getClass()));
    }

    /* renamed from: i */
    public final void m2894i() {
        InterfaceC9357j interfaceC9357jM2892g;
        if (Log.isLoggable("DecodeJob", 2)) {
            m2901p("Retrieved data", this.f2981t, "data: " + this.f2987z + ", cache key: " + this.f2985x + ", fetcher: " + this.f2957B);
        }
        try {
            interfaceC9357jM2892g = m2892g(this.f2957B, this.f2987z, this.f2956A);
        } catch (GlideException e10) {
            e10.m2936j(this.f2986y, this.f2956A);
            this.f2963b.add(e10);
            interfaceC9357jM2892g = null;
        }
        if (interfaceC9357jM2892g != null) {
            m2903r(interfaceC9357jM2892g, this.f2956A, this.f2961F);
        } else {
            m2911z();
        }
    }

    /* renamed from: j */
    public final InterfaceC5425c m2895j() {
        int i10 = C5416a.f3000b[this.f2979r.ordinal()];
        if (i10 == 1) {
            return new C5432j(this.f2962a, this);
        }
        if (i10 == 2) {
            return new C5424b(this.f2962a, this);
        }
        if (i10 == 3) {
            return new C5433k(this.f2962a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f2979r);
    }

    /* renamed from: k */
    public final Stage m2896k(Stage stage) {
        int i10 = C5416a.f3000b[stage.ordinal()];
        if (i10 == 1) {
            return this.f2975n.mo17227a() ? Stage.DATA_CACHE : m2896k(Stage.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f2982u ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return Stage.FINISHED;
        }
        if (i10 == 5) {
            return this.f2975n.mo17228b() ? Stage.RESOURCE_CACHE : m2896k(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    /* renamed from: l */
    public final C9230d m2897l(DataSource dataSource) {
        C9230d c9230d = this.f2976o;
        if (Build.VERSION.SDK_INT < 26) {
            return c9230d;
        }
        boolean z10 = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f2962a.m2972x();
        C9229c c9229c = C5450a.f3190j;
        Boolean bool = (Boolean) c9230d.m16940c(c9229c);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return c9230d;
        }
        C9230d c9230d2 = new C9230d();
        c9230d2.m16941d(this.f2976o);
        c9230d2.m16942e(c9229c, Boolean.valueOf(z10));
        return c9230d2;
    }

    /* renamed from: m */
    public final int m2898m() {
        return this.f2971j.ordinal();
    }

    /* renamed from: n */
    public DecodeJob m2899n(C5393d c5393d, Object obj, C9352e c9352e, InterfaceC9228b interfaceC9228b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC9350c abstractC9350c, Map map, boolean z10, boolean z11, boolean z12, C9230d c9230d, InterfaceC5417b interfaceC5417b, int i12) {
        this.f2962a.m2970v(c5393d, obj, interfaceC9228b, i10, i11, abstractC9350c, cls, cls2, priority, c9230d, map, z10, z11, this.f2965d);
        this.f2969h = c5393d;
        this.f2970i = interfaceC9228b;
        this.f2971j = priority;
        this.f2972k = c9352e;
        this.f2973l = i10;
        this.f2974m = i11;
        this.f2975n = abstractC9350c;
        this.f2982u = z12;
        this.f2976o = c9230d;
        this.f2977p = interfaceC5417b;
        this.f2978q = i12;
        this.f2980s = RunReason.INITIALIZE;
        this.f2983v = obj;
        return this;
    }

    /* renamed from: o */
    public final void m2900o(String str, long j10) {
        m2901p(str, j10, null);
    }

    /* renamed from: p */
    public final void m2901p(String str, long j10, String str2) {
        AbstractC8702f.m14164a(j10);
        Objects.toString(this.f2972k);
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(str2);
        }
        Thread.currentThread().getName();
    }

    /* renamed from: q */
    public final void m2902q(InterfaceC9357j interfaceC9357j, DataSource dataSource, boolean z10) {
        m2884C();
        this.f2977p.mo2914b(interfaceC9357j, dataSource, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final void m2903r(InterfaceC9357j interfaceC9357j, DataSource dataSource, boolean z10) {
        C9356i c9356i;
        AbstractC8749b.m14415a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (interfaceC9357j instanceof InterfaceC9354g) {
                ((InterfaceC9354g) interfaceC9357j).initialize();
            }
            if (this.f2967f.m2920c()) {
                interfaceC9357j = C9356i.m17236d(interfaceC9357j);
                c9356i = interfaceC9357j;
            } else {
                c9356i = 0;
            }
            m2902q(interfaceC9357j, dataSource, z10);
            this.f2979r = Stage.ENCODE;
            try {
                if (this.f2967f.m2920c()) {
                    this.f2967f.m2919b(this.f2965d, this.f2976o);
                }
                m2905t();
                AbstractC8749b.m14419e();
            } finally {
                if (c9356i != 0) {
                    c9356i.m17239f();
                }
            }
        } catch (Throwable th) {
            AbstractC8749b.m14419e();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC8749b.m14417c("DecodeJob#run(reason=%s, model=%s)", this.f2980s, this.f2983v);
        InterfaceC5405d interfaceC5405d = this.f2957B;
        try {
            try {
                try {
                    if (this.f2960E) {
                        m2904s();
                        if (interfaceC5405d != null) {
                            interfaceC5405d.mo2851b();
                        }
                        AbstractC8749b.m14419e();
                        return;
                    }
                    m2883B();
                    if (interfaceC5405d != null) {
                        interfaceC5405d.mo2851b();
                    }
                    AbstractC8749b.m14419e();
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Objects.toString(this.f2979r);
                    }
                    if (this.f2979r != Stage.ENCODE) {
                        this.f2963b.add(th);
                        m2904s();
                    }
                    if (!this.f2960E) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            if (interfaceC5405d != null) {
                interfaceC5405d.mo2851b();
            }
            AbstractC8749b.m14419e();
            throw th2;
        }
    }

    /* renamed from: s */
    public final void m2904s() {
        m2884C();
        this.f2977p.mo2915c(new GlideException("Failed to load resource", new ArrayList(this.f2963b)));
        m2906u();
    }

    /* renamed from: t */
    public final void m2905t() {
        if (this.f2968g.m2924b()) {
            m2909x();
        }
    }

    /* renamed from: u */
    public final void m2906u() {
        if (this.f2968g.m2925c()) {
            m2909x();
        }
    }

    /* renamed from: v */
    public InterfaceC9357j m2907v(DataSource dataSource, InterfaceC9357j interfaceC9357j) {
        InterfaceC9357j interfaceC9357jMo16944a;
        InterfaceC9233g interfaceC9233g;
        EncodeStrategy encodeStrategyMo16943a;
        InterfaceC9228b c9348a;
        Class<?> cls = interfaceC9357j.get().getClass();
        InterfaceC9232f interfaceC9232fM2962n = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            InterfaceC9233g interfaceC9233gM2967s = this.f2962a.m2967s(cls);
            interfaceC9233g = interfaceC9233gM2967s;
            interfaceC9357jMo16944a = interfaceC9233gM2967s.mo16944a(this.f2969h, interfaceC9357j, this.f2973l, this.f2974m);
        } else {
            interfaceC9357jMo16944a = interfaceC9357j;
            interfaceC9233g = null;
        }
        if (!interfaceC9357j.equals(interfaceC9357jMo16944a)) {
            interfaceC9357j.recycle();
        }
        if (this.f2962a.m2971w(interfaceC9357jMo16944a)) {
            interfaceC9232fM2962n = this.f2962a.m2962n(interfaceC9357jMo16944a);
            encodeStrategyMo16943a = interfaceC9232fM2962n.mo16943a(this.f2976o);
        } else {
            encodeStrategyMo16943a = EncodeStrategy.NONE;
        }
        InterfaceC9232f interfaceC9232f = interfaceC9232fM2962n;
        if (!this.f2975n.mo17230d(!this.f2962a.m2973y(this.f2985x), dataSource, encodeStrategyMo16943a)) {
            return interfaceC9357jMo16944a;
        }
        if (interfaceC9232f == null) {
            throw new Registry.NoResultEncoderAvailableException(interfaceC9357jMo16944a.get().getClass());
        }
        int i10 = C5416a.f3001c[encodeStrategyMo16943a.ordinal()];
        if (i10 == 1) {
            c9348a = new C9348a(this.f2985x, this.f2970i);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyMo16943a);
            }
            c9348a = new C9358k(this.f2962a.m2950b(), this.f2985x, this.f2970i, this.f2973l, this.f2974m, interfaceC9233g, cls, this.f2976o);
        }
        C9356i c9356iM17236d = C9356i.m17236d(interfaceC9357jMo16944a);
        this.f2967f.m2921d(c9348a, interfaceC9232f, c9356iM17236d);
        return c9356iM17236d;
    }

    /* renamed from: w */
    public void m2908w(boolean z10) {
        if (this.f2968g.m2926d(z10)) {
            m2909x();
        }
    }

    /* renamed from: x */
    public final void m2909x() {
        this.f2968g.m2927e();
        this.f2967f.m2918a();
        this.f2962a.m2949a();
        this.f2959D = false;
        this.f2969h = null;
        this.f2970i = null;
        this.f2976o = null;
        this.f2971j = null;
        this.f2972k = null;
        this.f2977p = null;
        this.f2979r = null;
        this.f2958C = null;
        this.f2984w = null;
        this.f2985x = null;
        this.f2987z = null;
        this.f2956A = null;
        this.f2957B = null;
        this.f2981t = 0L;
        this.f2960E = false;
        this.f2983v = null;
        this.f2963b.clear();
        this.f2966e.release(this);
    }

    /* renamed from: y */
    public final void m2910y(RunReason runReason) {
        this.f2980s = runReason;
        this.f2977p.mo2916d(this);
    }

    /* renamed from: z */
    public final void m2911z() {
        this.f2984w = Thread.currentThread();
        this.f2981t = AbstractC8702f.m14165b();
        boolean zMo2948a = false;
        while (!this.f2960E && this.f2958C != null && !(zMo2948a = this.f2958C.mo2948a())) {
            this.f2979r = m2896k(this.f2979r);
            this.f2958C = m2895j();
            if (this.f2979r == Stage.SOURCE) {
                m2910y(RunReason.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f2979r == Stage.FINISHED || this.f2960E) && !zMo2948a) {
            m2904s();
        }
    }
}
