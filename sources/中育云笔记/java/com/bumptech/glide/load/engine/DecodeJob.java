package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C5812d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.InterfaceC5824d;
import com.bumptech.glide.load.data.InterfaceC5825e;
import com.bumptech.glide.load.engine.C5846e;
import com.bumptech.glide.load.engine.InterfaceC5844c;
import com.bumptech.glide.load.resource.bitmap.C5869a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p109d1.AbstractC8905f;
import p125e1.AbstractC9069a;
import p125e1.AbstractC9070b;
import p125e1.AbstractC9071c;
import p168h0.C9437d;
import p168h0.C9438e;
import p168h0.InterfaceC9435b;
import p168h0.InterfaceC9440g;
import p168h0.InterfaceC9441h;
import p198j0.AbstractC9650c;
import p198j0.C9648a;
import p198j0.C9649b;
import p198j0.C9652e;
import p198j0.C9656i;
import p198j0.C9658k;
import p198j0.InterfaceC9654g;
import p198j0.InterfaceC9657j;
import p229l0.InterfaceC10094a;

/* loaded from: classes3.dex */
public class DecodeJob implements InterfaceC5844c.a, Runnable, Comparable, AbstractC9069a.f {

    /* renamed from: A */
    public InterfaceC9435b f4726A;

    /* renamed from: B */
    public Object f4727B;

    /* renamed from: C */
    public DataSource f4728C;

    /* renamed from: D */
    public InterfaceC5824d f4729D;

    /* renamed from: E */
    public volatile InterfaceC5844c f4730E;

    /* renamed from: F */
    public volatile boolean f4731F;

    /* renamed from: G */
    public volatile boolean f4732G;

    /* renamed from: H */
    public boolean f4733H;

    /* renamed from: f */
    public final InterfaceC5839e f4737f;

    /* renamed from: g */
    public final Pools.Pool f4738g;

    /* renamed from: j */
    public C5812d f4741j;

    /* renamed from: k */
    public InterfaceC9435b f4742k;

    /* renamed from: l */
    public Priority f4743l;

    /* renamed from: m */
    public C9652e f4744m;

    /* renamed from: n */
    public int f4745n;

    /* renamed from: o */
    public int f4746o;

    /* renamed from: p */
    public AbstractC9650c f4747p;

    /* renamed from: q */
    public C9438e f4748q;

    /* renamed from: r */
    public InterfaceC5836b f4749r;

    /* renamed from: s */
    public int f4750s;

    /* renamed from: t */
    public Stage f4751t;

    /* renamed from: u */
    public RunReason f4752u;

    /* renamed from: v */
    public long f4753v;

    /* renamed from: w */
    public boolean f4754w;

    /* renamed from: x */
    public Object f4755x;

    /* renamed from: y */
    public Thread f4756y;

    /* renamed from: z */
    public InterfaceC9435b f4757z;

    /* renamed from: c */
    public final C5845d f4734c = new C5845d();

    /* renamed from: d */
    public final List f4735d = new ArrayList();

    /* renamed from: e */
    public final AbstractC9071c f4736e = AbstractC9071c.m17870a();

    /* renamed from: h */
    public final C5838d f4739h = new C5838d();

    /* renamed from: i */
    public final C5840f f4740i = new C5840f();

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
    public static /* synthetic */ class C5835a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4769a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4770b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f4771c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f4771c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4771c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f4770b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4770b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4770b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4770b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4770b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f4769a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4769a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4769a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface InterfaceC5836b {
        /* renamed from: b */
        void mo4118b(GlideException glideException);

        /* renamed from: c */
        void mo4119c(InterfaceC9657j interfaceC9657j, DataSource dataSource, boolean z10);

        /* renamed from: e */
        void mo4120e(DecodeJob decodeJob);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C5837c implements C5846e.a {

        /* renamed from: a */
        public final DataSource f4772a;

        public C5837c(DataSource dataSource) {
            this.f4772a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.C5846e.a
        /* renamed from: a */
        public InterfaceC9657j mo4121a(InterfaceC9657j interfaceC9657j) {
            return DecodeJob.this.m4111v(this.f4772a, interfaceC9657j);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C5838d {

        /* renamed from: a */
        public InterfaceC9435b f4774a;

        /* renamed from: b */
        public InterfaceC9440g f4775b;

        /* renamed from: c */
        public C9656i f4776c;

        /* renamed from: a */
        public void m4122a() {
            this.f4774a = null;
            this.f4775b = null;
            this.f4776c = null;
        }

        /* renamed from: b */
        public void m4123b(InterfaceC5839e interfaceC5839e, C9438e c9438e) {
            AbstractC9070b.m17864a("DecodeJob.encode");
            try {
                interfaceC5839e.mo4126a().mo21106a(this.f4774a, new C9649b(this.f4775b, this.f4776c, c9438e));
            } finally {
                this.f4776c.m19057f();
                AbstractC9070b.m17868e();
            }
        }

        /* renamed from: c */
        public boolean m4124c() {
            return this.f4776c != null;
        }

        /* renamed from: d */
        public void m4125d(InterfaceC9435b interfaceC9435b, InterfaceC9440g interfaceC9440g, C9656i c9656i) {
            this.f4774a = interfaceC9435b;
            this.f4775b = interfaceC9440g;
            this.f4776c = c9656i;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface InterfaceC5839e {
        /* renamed from: a */
        InterfaceC10094a mo4126a();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C5840f {

        /* renamed from: a */
        public boolean f4777a;

        /* renamed from: b */
        public boolean f4778b;

        /* renamed from: c */
        public boolean f4779c;

        /* renamed from: a */
        public final boolean m4127a(boolean z10) {
            return (this.f4779c || z10 || this.f4778b) && this.f4777a;
        }

        /* renamed from: b */
        public synchronized boolean m4128b() {
            this.f4778b = true;
            return m4127a(false);
        }

        /* renamed from: c */
        public synchronized boolean m4129c() {
            this.f4779c = true;
            return m4127a(false);
        }

        /* renamed from: d */
        public synchronized boolean m4130d(boolean z10) {
            this.f4777a = true;
            return m4127a(z10);
        }

        /* renamed from: e */
        public synchronized void m4131e() {
            this.f4778b = false;
            this.f4777a = false;
            this.f4779c = false;
        }
    }

    public DecodeJob(InterfaceC5839e interfaceC5839e, Pools.Pool pool) {
        this.f4737f = interfaceC5839e;
        this.f4738g = pool;
    }

    /* renamed from: A */
    public final InterfaceC9657j m4086A(Object obj, DataSource dataSource, C5850i c5850i) {
        C9438e c9438eM4101l = m4101l(dataSource);
        InterfaceC5825e interfaceC5825eM3932l = this.f4741j.m3972i().m3932l(obj);
        try {
            return c5850i.m4224a(interfaceC5825eM3932l, c9438eM4101l, this.f4745n, this.f4746o, new C5837c(dataSource));
        } finally {
            interfaceC5825eM3932l.cleanup();
        }
    }

    /* renamed from: B */
    public final void m4087B() {
        int i10 = C5835a.f4769a[this.f4752u.ordinal()];
        if (i10 == 1) {
            this.f4751t = m4100k(Stage.INITIALIZE);
            this.f4730E = m4099j();
            m4115z();
        } else if (i10 == 2) {
            m4115z();
        } else {
            if (i10 == 3) {
                m4098i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f4752u);
        }
    }

    /* renamed from: C */
    public final void m4088C() {
        Throwable th;
        this.f4736e.mo17872c();
        if (!this.f4731F) {
            this.f4731F = true;
            return;
        }
        if (this.f4735d.isEmpty()) {
            th = null;
        } else {
            List list = this.f4735d;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* renamed from: D */
    public boolean m4089D() {
        Stage stageM4100k = m4100k(Stage.INITIALIZE);
        return stageM4100k == Stage.RESOURCE_CACHE || stageM4100k == Stage.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5844c.a
    /* renamed from: a */
    public void mo4090a(InterfaceC9435b interfaceC9435b, Object obj, InterfaceC5824d interfaceC5824d, DataSource dataSource, InterfaceC9435b interfaceC9435b2) {
        this.f4757z = interfaceC9435b;
        this.f4727B = obj;
        this.f4729D = interfaceC5824d;
        this.f4728C = dataSource;
        this.f4726A = interfaceC9435b2;
        this.f4733H = interfaceC9435b != this.f4734c.m4155c().get(0);
        if (Thread.currentThread() != this.f4756y) {
            m4114y(RunReason.DECODE_DATA);
            return;
        }
        AbstractC9070b.m17864a("DecodeJob.decodeFromRetrievedData");
        try {
            m4098i();
        } finally {
            AbstractC9070b.m17868e();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5844c.a
    /* renamed from: b */
    public void mo4091b(InterfaceC9435b interfaceC9435b, Exception exc, InterfaceC5824d interfaceC5824d, DataSource dataSource) {
        interfaceC5824d.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.m4141o(interfaceC9435b, dataSource, interfaceC5824d.mo4051a());
        this.f4735d.add(glideException);
        if (Thread.currentThread() != this.f4756y) {
            m4114y(RunReason.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m4115z();
        }
    }

    /* renamed from: c */
    public void m4092c() {
        this.f4732G = true;
        InterfaceC5844c interfaceC5844c = this.f4730E;
        if (interfaceC5844c != null) {
            interfaceC5844c.cancel();
        }
    }

    @Override // p125e1.AbstractC9069a.f
    /* renamed from: d */
    public AbstractC9071c mo4093d() {
        return this.f4736e;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5844c.a
    /* renamed from: e */
    public void mo4094e() {
        m4114y(RunReason.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(DecodeJob decodeJob) {
        int iM4102m = m4102m() - decodeJob.m4102m();
        return iM4102m == 0 ? this.f4750s - decodeJob.f4750s : iM4102m;
    }

    /* renamed from: g */
    public final InterfaceC9657j m4096g(InterfaceC5824d interfaceC5824d, Object obj, DataSource dataSource) {
        if (obj == null) {
            interfaceC5824d.cleanup();
            return null;
        }
        try {
            long jM17452b = AbstractC8905f.m17452b();
            InterfaceC9657j interfaceC9657jM4097h = m4097h(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m4104o("Decoded result " + interfaceC9657jM4097h, jM17452b);
            }
            return interfaceC9657jM4097h;
        } finally {
            interfaceC5824d.cleanup();
        }
    }

    /* renamed from: h */
    public final InterfaceC9657j m4097h(Object obj, DataSource dataSource) {
        return m4086A(obj, dataSource, this.f4734c.m4160h(obj.getClass()));
    }

    /* renamed from: i */
    public final void m4098i() {
        InterfaceC9657j interfaceC9657jM4096g;
        if (Log.isLoggable("DecodeJob", 2)) {
            m4105p("Retrieved data", this.f4753v, "data: " + this.f4727B + ", cache key: " + this.f4757z + ", fetcher: " + this.f4729D);
        }
        try {
            interfaceC9657jM4096g = m4096g(this.f4729D, this.f4727B, this.f4728C);
        } catch (GlideException e10) {
            e10.m4140n(this.f4726A, this.f4728C);
            this.f4735d.add(e10);
            interfaceC9657jM4096g = null;
        }
        if (interfaceC9657jM4096g != null) {
            m4107r(interfaceC9657jM4096g, this.f4728C, this.f4733H);
        } else {
            m4115z();
        }
    }

    /* renamed from: j */
    public final InterfaceC5844c m4099j() {
        int i10 = C5835a.f4770b[this.f4751t.ordinal()];
        if (i10 == 1) {
            return new C5851j(this.f4734c, this);
        }
        if (i10 == 2) {
            return new C5843b(this.f4734c, this);
        }
        if (i10 == 3) {
            return new C5852k(this.f4734c, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f4751t);
    }

    /* renamed from: k */
    public final Stage m4100k(Stage stage) {
        int i10 = C5835a.f4770b[stage.ordinal()];
        if (i10 == 1) {
            return this.f4747p.mo19045a() ? Stage.DATA_CACHE : m4100k(Stage.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f4754w ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return Stage.FINISHED;
        }
        if (i10 == 5) {
            return this.f4747p.mo19046b() ? Stage.RESOURCE_CACHE : m4100k(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    /* renamed from: l */
    public final C9438e m4101l(DataSource dataSource) {
        C9438e c9438e = this.f4748q;
        if (Build.VERSION.SDK_INT < 26) {
            return c9438e;
        }
        boolean z10 = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f4734c.m4176x();
        C9437d c9437d = C5869a.f4960j;
        Boolean bool = (Boolean) c9438e.m18626c(c9437d);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return c9438e;
        }
        C9438e c9438e2 = new C9438e();
        c9438e2.m18627d(this.f4748q);
        c9438e2.m18629f(c9437d, Boolean.valueOf(z10));
        return c9438e2;
    }

    /* renamed from: m */
    public final int m4102m() {
        return this.f4743l.ordinal();
    }

    /* renamed from: n */
    public DecodeJob m4103n(C5812d c5812d, Object obj, C9652e c9652e, InterfaceC9435b interfaceC9435b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC9650c abstractC9650c, Map map, boolean z10, boolean z11, boolean z12, C9438e c9438e, InterfaceC5836b interfaceC5836b, int i12) {
        this.f4734c.m4174v(c5812d, obj, interfaceC9435b, i10, i11, abstractC9650c, cls, cls2, priority, c9438e, map, z10, z11, this.f4737f);
        this.f4741j = c5812d;
        this.f4742k = interfaceC9435b;
        this.f4743l = priority;
        this.f4744m = c9652e;
        this.f4745n = i10;
        this.f4746o = i11;
        this.f4747p = abstractC9650c;
        this.f4754w = z12;
        this.f4748q = c9438e;
        this.f4749r = interfaceC5836b;
        this.f4750s = i12;
        this.f4752u = RunReason.INITIALIZE;
        this.f4755x = obj;
        return this;
    }

    /* renamed from: o */
    public final void m4104o(String str, long j10) {
        m4105p(str, j10, null);
    }

    /* renamed from: p */
    public final void m4105p(String str, long j10, String str2) {
        AbstractC8905f.m17451a(j10);
        Objects.toString(this.f4744m);
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(str2);
        }
        Thread.currentThread().getName();
    }

    /* renamed from: q */
    public final void m4106q(InterfaceC9657j interfaceC9657j, DataSource dataSource, boolean z10) {
        m4088C();
        this.f4749r.mo4119c(interfaceC9657j, dataSource, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final void m4107r(InterfaceC9657j interfaceC9657j, DataSource dataSource, boolean z10) {
        C9656i c9656i;
        AbstractC9070b.m17864a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (interfaceC9657j instanceof InterfaceC9654g) {
                ((InterfaceC9654g) interfaceC9657j).initialize();
            }
            if (this.f4739h.m4124c()) {
                interfaceC9657j = C9656i.m19054c(interfaceC9657j);
                c9656i = interfaceC9657j;
            } else {
                c9656i = 0;
            }
            m4106q(interfaceC9657j, dataSource, z10);
            this.f4751t = Stage.ENCODE;
            try {
                if (this.f4739h.m4124c()) {
                    this.f4739h.m4123b(this.f4737f, this.f4748q);
                }
                m4109t();
                AbstractC9070b.m17868e();
            } finally {
                if (c9656i != 0) {
                    c9656i.m19057f();
                }
            }
        } catch (Throwable th) {
            AbstractC9070b.m17868e();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC9070b.m17866c("DecodeJob#run(reason=%s, model=%s)", this.f4752u, this.f4755x);
        InterfaceC5824d interfaceC5824d = this.f4729D;
        try {
            try {
                try {
                    if (this.f4732G) {
                        m4108s();
                        if (interfaceC5824d != null) {
                            interfaceC5824d.cleanup();
                        }
                        AbstractC9070b.m17868e();
                        return;
                    }
                    m4087B();
                    if (interfaceC5824d != null) {
                        interfaceC5824d.cleanup();
                    }
                    AbstractC9070b.m17868e();
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Objects.toString(this.f4751t);
                    }
                    if (this.f4751t != Stage.ENCODE) {
                        this.f4735d.add(th);
                        m4108s();
                    }
                    if (!this.f4732G) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            if (interfaceC5824d != null) {
                interfaceC5824d.cleanup();
            }
            AbstractC9070b.m17868e();
            throw th2;
        }
    }

    /* renamed from: s */
    public final void m4108s() {
        m4088C();
        this.f4749r.mo4118b(new GlideException("Failed to load resource", new ArrayList(this.f4735d)));
        m4110u();
    }

    /* renamed from: t */
    public final void m4109t() {
        if (this.f4740i.m4128b()) {
            m4113x();
        }
    }

    /* renamed from: u */
    public final void m4110u() {
        if (this.f4740i.m4129c()) {
            m4113x();
        }
    }

    /* renamed from: v */
    public InterfaceC9657j m4111v(DataSource dataSource, InterfaceC9657j interfaceC9657j) {
        InterfaceC9657j interfaceC9657jMo18617a;
        InterfaceC9441h interfaceC9441h;
        EncodeStrategy encodeStrategyMo18630b;
        InterfaceC9435b c9648a;
        Class<?> cls = interfaceC9657j.get().getClass();
        InterfaceC9440g interfaceC9440gM4166n = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            InterfaceC9441h interfaceC9441hM4171s = this.f4734c.m4171s(cls);
            interfaceC9441h = interfaceC9441hM4171s;
            interfaceC9657jMo18617a = interfaceC9441hM4171s.mo18617a(this.f4741j, interfaceC9657j, this.f4745n, this.f4746o);
        } else {
            interfaceC9657jMo18617a = interfaceC9657j;
            interfaceC9441h = null;
        }
        if (!interfaceC9657j.equals(interfaceC9657jMo18617a)) {
            interfaceC9657j.recycle();
        }
        if (this.f4734c.m4175w(interfaceC9657jMo18617a)) {
            interfaceC9440gM4166n = this.f4734c.m4166n(interfaceC9657jMo18617a);
            encodeStrategyMo18630b = interfaceC9440gM4166n.mo18630b(this.f4748q);
        } else {
            encodeStrategyMo18630b = EncodeStrategy.NONE;
        }
        InterfaceC9440g interfaceC9440g = interfaceC9440gM4166n;
        if (!this.f4747p.mo19048d(!this.f4734c.m4177y(this.f4757z), dataSource, encodeStrategyMo18630b)) {
            return interfaceC9657jMo18617a;
        }
        if (interfaceC9440g == null) {
            throw new Registry.NoResultEncoderAvailableException(interfaceC9657jMo18617a.get().getClass());
        }
        int i10 = C5835a.f4771c[encodeStrategyMo18630b.ordinal()];
        if (i10 == 1) {
            c9648a = new C9648a(this.f4757z, this.f4742k);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyMo18630b);
            }
            c9648a = new C9658k(this.f4734c.m4154b(), this.f4757z, this.f4742k, this.f4745n, this.f4746o, interfaceC9441h, cls, this.f4748q);
        }
        C9656i c9656iM19054c = C9656i.m19054c(interfaceC9657jMo18617a);
        this.f4739h.m4125d(c9648a, interfaceC9440g, c9656iM19054c);
        return c9656iM19054c;
    }

    /* renamed from: w */
    public void m4112w(boolean z10) {
        if (this.f4740i.m4130d(z10)) {
            m4113x();
        }
    }

    /* renamed from: x */
    public final void m4113x() {
        this.f4740i.m4131e();
        this.f4739h.m4122a();
        this.f4734c.m4153a();
        this.f4731F = false;
        this.f4741j = null;
        this.f4742k = null;
        this.f4748q = null;
        this.f4743l = null;
        this.f4744m = null;
        this.f4749r = null;
        this.f4751t = null;
        this.f4730E = null;
        this.f4756y = null;
        this.f4757z = null;
        this.f4727B = null;
        this.f4728C = null;
        this.f4729D = null;
        this.f4753v = 0L;
        this.f4732G = false;
        this.f4755x = null;
        this.f4735d.clear();
        this.f4738g.release(this);
    }

    /* renamed from: y */
    public final void m4114y(RunReason runReason) {
        this.f4752u = runReason;
        this.f4749r.mo4120e(this);
    }

    /* renamed from: z */
    public final void m4115z() {
        this.f4756y = Thread.currentThread();
        this.f4753v = AbstractC8905f.m17452b();
        boolean zMo4152c = false;
        while (!this.f4732G && this.f4730E != null && !(zMo4152c = this.f4730E.mo4152c())) {
            this.f4751t = m4100k(this.f4751t);
            this.f4730E = m4099j();
            if (this.f4751t == Stage.SOURCE) {
                m4114y(RunReason.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f4751t == Stage.FINISHED || this.f4732G) && !zMo4152c) {
            m4108s();
        }
    }
}
