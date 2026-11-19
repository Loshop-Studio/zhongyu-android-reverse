package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C5473d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.C5489e;
import com.bumptech.glide.load.engine.InterfaceC5487c;
import com.bumptech.glide.load.resource.bitmap.C5505a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p091e1.AbstractC7833e;
import p102f1.AbstractC7909a;
import p102f1.AbstractC7910b;
import p102f1.AbstractC7911c;
import p122h0.C8083c;
import p122h0.C8084d;
import p122h0.InterfaceC8082b;
import p122h0.InterfaceC8086f;
import p122h0.InterfaceC8087g;
import p132i0.InterfaceC8115d;
import p132i0.InterfaceC8116e;
import p152k0.AbstractC8252c;
import p152k0.C8250a;
import p152k0.C8251b;
import p152k0.C8254e;
import p152k0.C8258i;
import p152k0.C8260k;
import p152k0.InterfaceC8256g;
import p152k0.InterfaceC8259j;
import p174m0.InterfaceC8939a;

/* loaded from: classes3.dex */
public class DecodeJob implements InterfaceC5487c.a, Runnable, Comparable, AbstractC7909a.f {

    /* renamed from: A */
    public DataSource f3321A;

    /* renamed from: B */
    public InterfaceC8115d f3322B;

    /* renamed from: C */
    public volatile InterfaceC5487c f3323C;

    /* renamed from: D */
    public volatile boolean f3324D;

    /* renamed from: E */
    public volatile boolean f3325E;

    /* renamed from: d */
    public final InterfaceC5482e f3329d;

    /* renamed from: e */
    public final Pools.Pool f3330e;

    /* renamed from: h */
    public C5473d f3333h;

    /* renamed from: i */
    public InterfaceC8082b f3334i;

    /* renamed from: j */
    public Priority f3335j;

    /* renamed from: k */
    public C8254e f3336k;

    /* renamed from: l */
    public int f3337l;

    /* renamed from: m */
    public int f3338m;

    /* renamed from: n */
    public AbstractC8252c f3339n;

    /* renamed from: o */
    public C8084d f3340o;

    /* renamed from: p */
    public InterfaceC5479b f3341p;

    /* renamed from: q */
    public int f3342q;

    /* renamed from: r */
    public Stage f3343r;

    /* renamed from: s */
    public RunReason f3344s;

    /* renamed from: t */
    public long f3345t;

    /* renamed from: u */
    public boolean f3346u;

    /* renamed from: v */
    public Object f3347v;

    /* renamed from: w */
    public Thread f3348w;

    /* renamed from: x */
    public InterfaceC8082b f3349x;

    /* renamed from: y */
    public InterfaceC8082b f3350y;

    /* renamed from: z */
    public Object f3351z;

    /* renamed from: a */
    public final C5488d f3326a = new C5488d();

    /* renamed from: b */
    public final List f3327b = new ArrayList();

    /* renamed from: c */
    public final AbstractC7911c f3328c = AbstractC7911c.m12448a();

    /* renamed from: f */
    public final C5481d f3331f = new C5481d();

    /* renamed from: g */
    public final C5483f f3332g = new C5483f();

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
    public static /* synthetic */ class C5478a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3363a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3364b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f3365c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f3365c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3365c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f3364b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3364b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3364b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3364b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3364b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f3363a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3363a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3363a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface InterfaceC5479b {
        /* renamed from: a */
        void mo3119a(InterfaceC8259j interfaceC8259j, DataSource dataSource);

        /* renamed from: c */
        void mo3120c(GlideException glideException);

        /* renamed from: d */
        void mo3121d(DecodeJob decodeJob);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C5480c implements C5489e.a {

        /* renamed from: a */
        public final DataSource f3366a;

        public C5480c(DataSource dataSource) {
            this.f3366a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.C5489e.a
        /* renamed from: a */
        public InterfaceC8259j mo3122a(InterfaceC8259j interfaceC8259j) {
            return DecodeJob.this.m3114v(this.f3366a, interfaceC8259j);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C5481d {

        /* renamed from: a */
        public InterfaceC8082b f3368a;

        /* renamed from: b */
        public InterfaceC8086f f3369b;

        /* renamed from: c */
        public C8258i f3370c;

        /* renamed from: a */
        public void m3123a() {
            this.f3368a = null;
            this.f3369b = null;
            this.f3370c = null;
        }

        /* renamed from: b */
        public void m3124b(InterfaceC5482e interfaceC5482e, C8084d c8084d) {
            AbstractC7910b.m12444a("DecodeJob.encode");
            try {
                interfaceC5482e.mo3127a().mo14250a(this.f3368a, new C8251b(this.f3369b, this.f3370c, c8084d));
            } finally {
                this.f3370c.m13304f();
                AbstractC7910b.m12447d();
            }
        }

        /* renamed from: c */
        public boolean m3125c() {
            return this.f3370c != null;
        }

        /* renamed from: d */
        public void m3126d(InterfaceC8082b interfaceC8082b, InterfaceC8086f interfaceC8086f, C8258i c8258i) {
            this.f3368a = interfaceC8082b;
            this.f3369b = interfaceC8086f;
            this.f3370c = c8258i;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface InterfaceC5482e {
        /* renamed from: a */
        InterfaceC8939a mo3127a();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C5483f {

        /* renamed from: a */
        public boolean f3371a;

        /* renamed from: b */
        public boolean f3372b;

        /* renamed from: c */
        public boolean f3373c;

        /* renamed from: a */
        public final boolean m3128a(boolean z9) {
            return (this.f3373c || z9 || this.f3372b) && this.f3371a;
        }

        /* renamed from: b */
        public synchronized boolean m3129b() {
            this.f3372b = true;
            return m3128a(false);
        }

        /* renamed from: c */
        public synchronized boolean m3130c() {
            this.f3373c = true;
            return m3128a(false);
        }

        /* renamed from: d */
        public synchronized boolean m3131d(boolean z9) {
            this.f3371a = true;
            return m3128a(z9);
        }

        /* renamed from: e */
        public synchronized void m3132e() {
            this.f3372b = false;
            this.f3371a = false;
            this.f3373c = false;
        }
    }

    public DecodeJob(InterfaceC5482e interfaceC5482e, Pools.Pool pool) {
        this.f3329d = interfaceC5482e;
        this.f3330e = pool;
    }

    /* renamed from: A */
    public final void m3090A() {
        int i9 = C5478a.f3363a[this.f3344s.ordinal()];
        if (i9 == 1) {
            this.f3343r = m3103k(Stage.INITIALIZE);
            this.f3323C = m3102j();
            m3117y();
        } else if (i9 == 2) {
            m3117y();
        } else {
            if (i9 == 3) {
                m3101i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f3344s);
        }
    }

    /* renamed from: B */
    public final void m3091B() {
        Throwable th;
        this.f3328c.mo12450c();
        if (!this.f3324D) {
            this.f3324D = true;
            return;
        }
        if (this.f3327b.isEmpty()) {
            th = null;
        } else {
            List list = this.f3327b;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* renamed from: C */
    public boolean m3092C() {
        Stage stageM3103k = m3103k(Stage.INITIALIZE);
        return stageM3103k == Stage.RESOURCE_CACHE || stageM3103k == Stage.DATA_CACHE;
    }

    /* renamed from: a */
    public void m3093a() {
        this.f3325E = true;
        InterfaceC5487c interfaceC5487c = this.f3323C;
        if (interfaceC5487c != null) {
            interfaceC5487c.cancel();
        }
    }

    @Override // p102f1.AbstractC7909a.f
    /* renamed from: b */
    public AbstractC7911c mo3094b() {
        return this.f3328c;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c.a
    /* renamed from: c */
    public void mo3095c() {
        this.f3344s = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.f3341p.mo3121d(this);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c.a
    /* renamed from: d */
    public void mo3096d(InterfaceC8082b interfaceC8082b, Exception exc, InterfaceC8115d interfaceC8115d, DataSource dataSource) {
        interfaceC8115d.mo12983b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.m3142w(interfaceC8082b, dataSource, interfaceC8115d.mo12978a());
        this.f3327b.add(glideException);
        if (Thread.currentThread() == this.f3348w) {
            m3117y();
        } else {
            this.f3344s = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.f3341p.mo3121d(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c.a
    /* renamed from: e */
    public void mo3097e(InterfaceC8082b interfaceC8082b, Object obj, InterfaceC8115d interfaceC8115d, DataSource dataSource, InterfaceC8082b interfaceC8082b2) {
        this.f3349x = interfaceC8082b;
        this.f3351z = obj;
        this.f3322B = interfaceC8115d;
        this.f3321A = dataSource;
        this.f3350y = interfaceC8082b2;
        if (Thread.currentThread() != this.f3348w) {
            this.f3344s = RunReason.DECODE_DATA;
            this.f3341p.mo3121d(this);
        } else {
            AbstractC7910b.m12444a("DecodeJob.decodeFromRetrievedData");
            try {
                m3101i();
            } finally {
                AbstractC7910b.m12447d();
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(DecodeJob decodeJob) {
        int iM3105m = m3105m() - decodeJob.m3105m();
        return iM3105m == 0 ? this.f3342q - decodeJob.f3342q : iM3105m;
    }

    /* renamed from: g */
    public final InterfaceC8259j m3099g(InterfaceC8115d interfaceC8115d, Object obj, DataSource dataSource) {
        if (obj == null) {
            interfaceC8115d.mo12983b();
            return null;
        }
        try {
            long jM12240b = AbstractC7833e.m12240b();
            InterfaceC8259j interfaceC8259jM3100h = m3100h(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m3107o("Decoded result " + interfaceC8259jM3100h, jM12240b);
            }
            return interfaceC8259jM3100h;
        } finally {
            interfaceC8115d.mo12983b();
        }
    }

    /* renamed from: h */
    public final InterfaceC8259j m3100h(Object obj, DataSource dataSource) {
        return m3118z(obj, dataSource, this.f3326a.m3163h(obj.getClass()));
    }

    /* renamed from: i */
    public final void m3101i() {
        InterfaceC8259j interfaceC8259jM3099g;
        if (Log.isLoggable("DecodeJob", 2)) {
            m3108p("Retrieved data", this.f3345t, "data: " + this.f3351z + ", cache key: " + this.f3349x + ", fetcher: " + this.f3322B);
        }
        try {
            interfaceC8259jM3099g = m3099g(this.f3322B, this.f3351z, this.f3321A);
        } catch (GlideException e10) {
            e10.m3141v(this.f3350y, this.f3321A);
            this.f3327b.add(e10);
            interfaceC8259jM3099g = null;
        }
        if (interfaceC8259jM3099g != null) {
            m3110r(interfaceC8259jM3099g, this.f3321A);
        } else {
            m3117y();
        }
    }

    /* renamed from: j */
    public final InterfaceC5487c m3102j() {
        int i9 = C5478a.f3364b[this.f3343r.ordinal()];
        if (i9 == 1) {
            return new C5494j(this.f3326a, this);
        }
        if (i9 == 2) {
            return new C5486b(this.f3326a, this);
        }
        if (i9 == 3) {
            return new C5495k(this.f3326a, this);
        }
        if (i9 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f3343r);
    }

    /* renamed from: k */
    public final Stage m3103k(Stage stage) {
        int i9 = C5478a.f3364b[stage.ordinal()];
        if (i9 == 1) {
            return this.f3339n.mo13292a() ? Stage.DATA_CACHE : m3103k(Stage.DATA_CACHE);
        }
        if (i9 == 2) {
            return this.f3346u ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i9 == 3 || i9 == 4) {
            return Stage.FINISHED;
        }
        if (i9 == 5) {
            return this.f3339n.mo13293b() ? Stage.RESOURCE_CACHE : m3103k(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    /* renamed from: l */
    public final C8084d m3104l(DataSource dataSource) {
        C8084d c8084d = this.f3340o;
        if (Build.VERSION.SDK_INT < 26) {
            return c8084d;
        }
        boolean z9 = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f3326a.m3178w();
        C8083c c8083c = C5505a.f3542j;
        Boolean bool = (Boolean) c8084d.m12908c(c8083c);
        if (bool != null && (!bool.booleanValue() || z9)) {
            return c8084d;
        }
        C8084d c8084d2 = new C8084d();
        c8084d2.m12909d(this.f3340o);
        c8084d2.m12910e(c8083c, Boolean.valueOf(z9));
        return c8084d2;
    }

    /* renamed from: m */
    public final int m3105m() {
        return this.f3335j.ordinal();
    }

    /* renamed from: n */
    public DecodeJob m3106n(C5473d c5473d, Object obj, C8254e c8254e, InterfaceC8082b interfaceC8082b, int i9, int i10, Class cls, Class cls2, Priority priority, AbstractC8252c abstractC8252c, Map map, boolean z9, boolean z10, boolean z11, C8084d c8084d, InterfaceC5479b interfaceC5479b, int i11) {
        this.f3326a.m3176u(c5473d, obj, interfaceC8082b, i9, i10, abstractC8252c, cls, cls2, priority, c8084d, map, z9, z10, this.f3329d);
        this.f3333h = c5473d;
        this.f3334i = interfaceC8082b;
        this.f3335j = priority;
        this.f3336k = c8254e;
        this.f3337l = i9;
        this.f3338m = i10;
        this.f3339n = abstractC8252c;
        this.f3346u = z11;
        this.f3340o = c8084d;
        this.f3341p = interfaceC5479b;
        this.f3342q = i11;
        this.f3344s = RunReason.INITIALIZE;
        this.f3347v = obj;
        return this;
    }

    /* renamed from: o */
    public final void m3107o(String str, long j9) {
        m3108p(str, j9, null);
    }

    /* renamed from: p */
    public final void m3108p(String str, long j9, String str2) {
        AbstractC7833e.m12239a(j9);
        Objects.toString(this.f3336k);
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(str2);
        }
        Thread.currentThread().getName();
    }

    /* renamed from: q */
    public final void m3109q(InterfaceC8259j interfaceC8259j, DataSource dataSource) {
        m3091B();
        this.f3341p.mo3119a(interfaceC8259j, dataSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final void m3110r(InterfaceC8259j interfaceC8259j, DataSource dataSource) {
        C8258i c8258i;
        if (interfaceC8259j instanceof InterfaceC8256g) {
            ((InterfaceC8256g) interfaceC8259j).initialize();
        }
        if (this.f3331f.m3125c()) {
            interfaceC8259j = C8258i.m13301d(interfaceC8259j);
            c8258i = interfaceC8259j;
        } else {
            c8258i = 0;
        }
        m3109q(interfaceC8259j, dataSource);
        this.f3343r = Stage.ENCODE;
        try {
            if (this.f3331f.m3125c()) {
                this.f3331f.m3124b(this.f3329d, this.f3340o);
            }
            m3112t();
        } finally {
            if (c8258i != 0) {
                c8258i.m13304f();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC7910b.m12445b("DecodeJob#run(model=%s)", this.f3347v);
        InterfaceC8115d interfaceC8115d = this.f3322B;
        try {
            try {
                try {
                    if (this.f3325E) {
                        m3111s();
                        if (interfaceC8115d != null) {
                            interfaceC8115d.mo12983b();
                        }
                        AbstractC7910b.m12447d();
                        return;
                    }
                    m3090A();
                    if (interfaceC8115d != null) {
                        interfaceC8115d.mo12983b();
                    }
                    AbstractC7910b.m12447d();
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Objects.toString(this.f3343r);
                    }
                    if (this.f3343r != Stage.ENCODE) {
                        this.f3327b.add(th);
                        m3111s();
                    }
                    if (!this.f3325E) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            if (interfaceC8115d != null) {
                interfaceC8115d.mo12983b();
            }
            AbstractC7910b.m12447d();
            throw th2;
        }
    }

    /* renamed from: s */
    public final void m3111s() {
        m3091B();
        this.f3341p.mo3120c(new GlideException("Failed to load resource", new ArrayList(this.f3327b)));
        m3113u();
    }

    /* renamed from: t */
    public final void m3112t() {
        if (this.f3332g.m3129b()) {
            m3116x();
        }
    }

    /* renamed from: u */
    public final void m3113u() {
        if (this.f3332g.m3130c()) {
            m3116x();
        }
    }

    /* renamed from: v */
    public InterfaceC8259j m3114v(DataSource dataSource, InterfaceC8259j interfaceC8259j) {
        InterfaceC8259j interfaceC8259jMo12912b;
        InterfaceC8087g interfaceC8087g;
        EncodeStrategy encodeStrategyMo12911b;
        InterfaceC8082b c8250a;
        Class<?> cls = interfaceC8259j.get().getClass();
        InterfaceC8086f interfaceC8086fM3169n = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            InterfaceC8087g interfaceC8087gM3173r = this.f3326a.m3173r(cls);
            interfaceC8087g = interfaceC8087gM3173r;
            interfaceC8259jMo12912b = interfaceC8087gM3173r.mo12912b(this.f3333h, interfaceC8259j, this.f3337l, this.f3338m);
        } else {
            interfaceC8259jMo12912b = interfaceC8259j;
            interfaceC8087g = null;
        }
        if (!interfaceC8259j.equals(interfaceC8259jMo12912b)) {
            interfaceC8259j.recycle();
        }
        if (this.f3326a.m3177v(interfaceC8259jMo12912b)) {
            interfaceC8086fM3169n = this.f3326a.m3169n(interfaceC8259jMo12912b);
            encodeStrategyMo12911b = interfaceC8086fM3169n.mo12911b(this.f3340o);
        } else {
            encodeStrategyMo12911b = EncodeStrategy.NONE;
        }
        InterfaceC8086f interfaceC8086f = interfaceC8086fM3169n;
        if (!this.f3339n.mo13295d(!this.f3326a.m3179x(this.f3349x), dataSource, encodeStrategyMo12911b)) {
            return interfaceC8259jMo12912b;
        }
        if (interfaceC8086f == null) {
            throw new Registry.NoResultEncoderAvailableException(interfaceC8259jMo12912b.get().getClass());
        }
        int i9 = C5478a.f3365c[encodeStrategyMo12911b.ordinal()];
        if (i9 == 1) {
            c8250a = new C8250a(this.f3349x, this.f3334i);
        } else {
            if (i9 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyMo12911b);
            }
            c8250a = new C8260k(this.f3326a.m3157b(), this.f3349x, this.f3334i, this.f3337l, this.f3338m, interfaceC8087g, cls, this.f3340o);
        }
        C8258i c8258iM13301d = C8258i.m13301d(interfaceC8259jMo12912b);
        this.f3331f.m3126d(c8250a, interfaceC8086f, c8258iM13301d);
        return c8258iM13301d;
    }

    /* renamed from: w */
    public void m3115w(boolean z9) {
        if (this.f3332g.m3131d(z9)) {
            m3116x();
        }
    }

    /* renamed from: x */
    public final void m3116x() {
        this.f3332g.m3132e();
        this.f3331f.m3123a();
        this.f3326a.m3156a();
        this.f3324D = false;
        this.f3333h = null;
        this.f3334i = null;
        this.f3340o = null;
        this.f3335j = null;
        this.f3336k = null;
        this.f3341p = null;
        this.f3343r = null;
        this.f3323C = null;
        this.f3348w = null;
        this.f3349x = null;
        this.f3351z = null;
        this.f3321A = null;
        this.f3322B = null;
        this.f3345t = 0L;
        this.f3325E = false;
        this.f3347v = null;
        this.f3327b.clear();
        this.f3330e.release(this);
    }

    /* renamed from: y */
    public final void m3117y() {
        this.f3348w = Thread.currentThread();
        this.f3345t = AbstractC7833e.m12240b();
        boolean zMo3153a = false;
        while (!this.f3325E && this.f3323C != null && !(zMo3153a = this.f3323C.mo3153a())) {
            this.f3343r = m3103k(this.f3343r);
            this.f3323C = m3102j();
            if (this.f3343r == Stage.SOURCE) {
                mo3095c();
                return;
            }
        }
        if ((this.f3343r == Stage.FINISHED || this.f3325E) && !zMo3153a) {
            m3111s();
        }
    }

    /* renamed from: z */
    public final InterfaceC8259j m3118z(Object obj, DataSource dataSource, C5493i c5493i) {
        C8084d c8084dM3104l = m3104l(dataSource);
        InterfaceC8116e interfaceC8116eM2998l = this.f3333h.m3036h().m2998l(obj);
        try {
            return c5493i.m3226a(interfaceC8116eM2998l, c8084dM3104l, this.f3337l, this.f3338m, new C5480c(dataSource));
        } finally {
            interfaceC8116eM2998l.mo12992b();
        }
    }
}
