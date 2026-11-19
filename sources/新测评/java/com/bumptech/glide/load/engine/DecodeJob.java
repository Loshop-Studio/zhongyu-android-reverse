package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C5344d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.InterfaceC5356d;
import com.bumptech.glide.load.data.InterfaceC5357e;
import com.bumptech.glide.load.engine.C5378e;
import com.bumptech.glide.load.engine.InterfaceC5376c;
import com.bumptech.glide.load.resource.bitmap.C5401a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p117i1.AbstractC7647f;
import p128j1.AbstractC7778a;
import p128j1.AbstractC7779b;
import p128j1.AbstractC7780c;
import p162m0.C8538c;
import p162m0.C8539d;
import p162m0.InterfaceC8537b;
import p162m0.InterfaceC8541f;
import p162m0.InterfaceC8542g;
import p184o0.AbstractC8683c;
import p184o0.C8681a;
import p184o0.C8682b;
import p184o0.C8685e;
import p184o0.C8689i;
import p184o0.C8691k;
import p184o0.InterfaceC8687g;
import p184o0.InterfaceC8690j;
import p206q0.InterfaceC8866a;

/* loaded from: classes3.dex */
public class DecodeJob implements InterfaceC5376c.a, Runnable, Comparable, AbstractC7778a.f {

    /* renamed from: A */
    public DataSource f3523A;

    /* renamed from: B */
    public InterfaceC5356d f3524B;

    /* renamed from: C */
    public volatile InterfaceC5376c f3525C;

    /* renamed from: D */
    public volatile boolean f3526D;

    /* renamed from: E */
    public volatile boolean f3527E;

    /* renamed from: F */
    public boolean f3528F;

    /* renamed from: d */
    public final InterfaceC5371e f3532d;

    /* renamed from: e */
    public final Pools.Pool f3533e;

    /* renamed from: h */
    public C5344d f3536h;

    /* renamed from: i */
    public InterfaceC8537b f3537i;

    /* renamed from: j */
    public Priority f3538j;

    /* renamed from: k */
    public C8685e f3539k;

    /* renamed from: l */
    public int f3540l;

    /* renamed from: m */
    public int f3541m;

    /* renamed from: n */
    public AbstractC8683c f3542n;

    /* renamed from: o */
    public C8539d f3543o;

    /* renamed from: p */
    public InterfaceC5368b f3544p;

    /* renamed from: q */
    public int f3545q;

    /* renamed from: r */
    public Stage f3546r;

    /* renamed from: s */
    public RunReason f3547s;

    /* renamed from: t */
    public long f3548t;

    /* renamed from: u */
    public boolean f3549u;

    /* renamed from: v */
    public Object f3550v;

    /* renamed from: w */
    public Thread f3551w;

    /* renamed from: x */
    public InterfaceC8537b f3552x;

    /* renamed from: y */
    public InterfaceC8537b f3553y;

    /* renamed from: z */
    public Object f3554z;

    /* renamed from: a */
    public final C5377d f3529a = new C5377d();

    /* renamed from: b */
    public final List f3530b = new ArrayList();

    /* renamed from: c */
    public final AbstractC7780c f3531c = AbstractC7780c.m13149a();

    /* renamed from: f */
    public final C5370d f3534f = new C5370d();

    /* renamed from: g */
    public final C5372f f3535g = new C5372f();

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
    public static /* synthetic */ class C5367a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3566a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3567b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f3568c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f3568c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3568c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f3567b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3567b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3567b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3567b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3567b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f3566a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3566a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3566a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface InterfaceC5368b {
        /* renamed from: a */
        void mo3468a(InterfaceC8690j interfaceC8690j, DataSource dataSource, boolean z9);

        /* renamed from: c */
        void mo3469c(GlideException glideException);

        /* renamed from: e */
        void mo3470e(DecodeJob decodeJob);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C5369c implements C5378e.a {

        /* renamed from: a */
        public final DataSource f3569a;

        public C5369c(DataSource dataSource) {
            this.f3569a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.C5378e.a
        /* renamed from: a */
        public InterfaceC8690j mo3471a(InterfaceC8690j interfaceC8690j) {
            return DecodeJob.this.m3461v(this.f3569a, interfaceC8690j);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C5370d {

        /* renamed from: a */
        public InterfaceC8537b f3571a;

        /* renamed from: b */
        public InterfaceC8541f f3572b;

        /* renamed from: c */
        public C8689i f3573c;

        /* renamed from: a */
        public void m3472a() {
            this.f3571a = null;
            this.f3572b = null;
            this.f3573c = null;
        }

        /* renamed from: b */
        public void m3473b(InterfaceC5371e interfaceC5371e, C8539d c8539d) {
            AbstractC7779b.m13143a("DecodeJob.encode");
            try {
                interfaceC5371e.mo3476a().mo14869b(this.f3571a, new C8682b(this.f3572b, this.f3573c, c8539d));
            } finally {
                this.f3573c.m14293f();
                AbstractC7779b.m13147e();
            }
        }

        /* renamed from: c */
        public boolean m3474c() {
            return this.f3573c != null;
        }

        /* renamed from: d */
        public void m3475d(InterfaceC8537b interfaceC8537b, InterfaceC8541f interfaceC8541f, C8689i c8689i) {
            this.f3571a = interfaceC8537b;
            this.f3572b = interfaceC8541f;
            this.f3573c = c8689i;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface InterfaceC5371e {
        /* renamed from: a */
        InterfaceC8866a mo3476a();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C5372f {

        /* renamed from: a */
        public boolean f3574a;

        /* renamed from: b */
        public boolean f3575b;

        /* renamed from: c */
        public boolean f3576c;

        /* renamed from: a */
        public final boolean m3477a(boolean z9) {
            return (this.f3576c || z9 || this.f3575b) && this.f3574a;
        }

        /* renamed from: b */
        public synchronized boolean m3478b() {
            this.f3575b = true;
            return m3477a(false);
        }

        /* renamed from: c */
        public synchronized boolean m3479c() {
            this.f3576c = true;
            return m3477a(false);
        }

        /* renamed from: d */
        public synchronized boolean m3480d(boolean z9) {
            this.f3574a = true;
            return m3477a(z9);
        }

        /* renamed from: e */
        public synchronized void m3481e() {
            this.f3575b = false;
            this.f3574a = false;
            this.f3576c = false;
        }
    }

    public DecodeJob(InterfaceC5371e interfaceC5371e, Pools.Pool pool) {
        this.f3532d = interfaceC5371e;
        this.f3533e = pool;
    }

    /* renamed from: A */
    public final InterfaceC8690j m3436A(Object obj, DataSource dataSource, C5382i c5382i) {
        C8539d c8539dM3451l = m3451l(dataSource);
        InterfaceC5357e interfaceC5357eM3283l = this.f3536h.m3322i().m3283l(obj);
        try {
            return c5382i.m3574a(interfaceC5357eM3283l, c8539dM3451l, this.f3540l, this.f3541m, new C5369c(dataSource));
        } finally {
            interfaceC5357eM3283l.mo3394b();
        }
    }

    /* renamed from: B */
    public final void m3437B() {
        int i10 = C5367a.f3566a[this.f3547s.ordinal()];
        if (i10 == 1) {
            this.f3546r = m3450k(Stage.INITIALIZE);
            this.f3525C = m3449j();
            m3465z();
        } else if (i10 == 2) {
            m3465z();
        } else {
            if (i10 == 3) {
                m3448i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f3547s);
        }
    }

    /* renamed from: C */
    public final void m3438C() {
        Throwable th;
        this.f3531c.mo13151c();
        if (!this.f3526D) {
            this.f3526D = true;
            return;
        }
        if (this.f3530b.isEmpty()) {
            th = null;
        } else {
            List list = this.f3530b;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* renamed from: D */
    public boolean m3439D() {
        Stage stageM3450k = m3450k(Stage.INITIALIZE);
        return stageM3450k == Stage.RESOURCE_CACHE || stageM3450k == Stage.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5376c.a
    /* renamed from: a */
    public void mo3440a(InterfaceC8537b interfaceC8537b, Exception exc, InterfaceC5356d interfaceC5356d, DataSource dataSource) {
        interfaceC5356d.mo3404b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.m3491t(interfaceC8537b, dataSource, interfaceC5356d.mo3399a());
        this.f3530b.add(glideException);
        if (Thread.currentThread() != this.f3551w) {
            m3464y(RunReason.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m3465z();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5376c.a
    /* renamed from: b */
    public void mo3441b(InterfaceC8537b interfaceC8537b, Object obj, InterfaceC5356d interfaceC5356d, DataSource dataSource, InterfaceC8537b interfaceC8537b2) {
        this.f3552x = interfaceC8537b;
        this.f3554z = obj;
        this.f3524B = interfaceC5356d;
        this.f3523A = dataSource;
        this.f3553y = interfaceC8537b2;
        this.f3528F = interfaceC8537b != this.f3529a.m3505c().get(0);
        if (Thread.currentThread() != this.f3551w) {
            m3464y(RunReason.DECODE_DATA);
            return;
        }
        AbstractC7779b.m13143a("DecodeJob.decodeFromRetrievedData");
        try {
            m3448i();
        } finally {
            AbstractC7779b.m13147e();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5376c.a
    /* renamed from: c */
    public void mo3442c() {
        m3464y(RunReason.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // p128j1.AbstractC7778a.f
    /* renamed from: d */
    public AbstractC7780c mo3443d() {
        return this.f3531c;
    }

    /* renamed from: e */
    public void m3444e() {
        this.f3527E = true;
        InterfaceC5376c interfaceC5376c = this.f3525C;
        if (interfaceC5376c != null) {
            interfaceC5376c.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(DecodeJob decodeJob) {
        int iM3452m = m3452m() - decodeJob.m3452m();
        return iM3452m == 0 ? this.f3545q - decodeJob.f3545q : iM3452m;
    }

    /* renamed from: g */
    public final InterfaceC8690j m3446g(InterfaceC5356d interfaceC5356d, Object obj, DataSource dataSource) {
        if (obj == null) {
            interfaceC5356d.mo3404b();
            return null;
        }
        try {
            long jM12667b = AbstractC7647f.m12667b();
            InterfaceC8690j interfaceC8690jM3447h = m3447h(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m3454o("Decoded result " + interfaceC8690jM3447h, jM12667b);
            }
            return interfaceC8690jM3447h;
        } finally {
            interfaceC5356d.mo3404b();
        }
    }

    /* renamed from: h */
    public final InterfaceC8690j m3447h(Object obj, DataSource dataSource) {
        return m3436A(obj, dataSource, this.f3529a.m3510h(obj.getClass()));
    }

    /* renamed from: i */
    public final void m3448i() {
        InterfaceC8690j interfaceC8690jM3446g;
        if (Log.isLoggable("DecodeJob", 2)) {
            m3455p("Retrieved data", this.f3548t, "data: " + this.f3554z + ", cache key: " + this.f3552x + ", fetcher: " + this.f3524B);
        }
        try {
            interfaceC8690jM3446g = m3446g(this.f3524B, this.f3554z, this.f3523A);
        } catch (GlideException e10) {
            e10.m3490s(this.f3553y, this.f3523A);
            this.f3530b.add(e10);
            interfaceC8690jM3446g = null;
        }
        if (interfaceC8690jM3446g != null) {
            m3457r(interfaceC8690jM3446g, this.f3523A, this.f3528F);
        } else {
            m3465z();
        }
    }

    /* renamed from: j */
    public final InterfaceC5376c m3449j() {
        int i10 = C5367a.f3567b[this.f3546r.ordinal()];
        if (i10 == 1) {
            return new C5383j(this.f3529a, this);
        }
        if (i10 == 2) {
            return new C5375b(this.f3529a, this);
        }
        if (i10 == 3) {
            return new C5384k(this.f3529a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f3546r);
    }

    /* renamed from: k */
    public final Stage m3450k(Stage stage) {
        int i10 = C5367a.f3567b[stage.ordinal()];
        if (i10 == 1) {
            return this.f3542n.mo14281a() ? Stage.DATA_CACHE : m3450k(Stage.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f3549u ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return Stage.FINISHED;
        }
        if (i10 == 5) {
            return this.f3542n.mo14282b() ? Stage.RESOURCE_CACHE : m3450k(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    /* renamed from: l */
    public final C8539d m3451l(DataSource dataSource) {
        C8539d c8539d = this.f3543o;
        if (Build.VERSION.SDK_INT < 26) {
            return c8539d;
        }
        boolean z9 = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f3529a.m3526x();
        C8538c c8538c = C5401a.f3757j;
        Boolean bool = (Boolean) c8539d.m14057c(c8538c);
        if (bool != null && (!bool.booleanValue() || z9)) {
            return c8539d;
        }
        C8539d c8539d2 = new C8539d();
        c8539d2.m14058d(this.f3543o);
        c8539d2.m14059e(c8538c, Boolean.valueOf(z9));
        return c8539d2;
    }

    /* renamed from: m */
    public final int m3452m() {
        return this.f3538j.ordinal();
    }

    /* renamed from: n */
    public DecodeJob m3453n(C5344d c5344d, Object obj, C8685e c8685e, InterfaceC8537b interfaceC8537b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC8683c abstractC8683c, Map map, boolean z9, boolean z10, boolean z11, C8539d c8539d, InterfaceC5368b interfaceC5368b, int i12) {
        this.f3529a.m3524v(c5344d, obj, interfaceC8537b, i10, i11, abstractC8683c, cls, cls2, priority, c8539d, map, z9, z10, this.f3532d);
        this.f3536h = c5344d;
        this.f3537i = interfaceC8537b;
        this.f3538j = priority;
        this.f3539k = c8685e;
        this.f3540l = i10;
        this.f3541m = i11;
        this.f3542n = abstractC8683c;
        this.f3549u = z11;
        this.f3543o = c8539d;
        this.f3544p = interfaceC5368b;
        this.f3545q = i12;
        this.f3547s = RunReason.INITIALIZE;
        this.f3550v = obj;
        return this;
    }

    /* renamed from: o */
    public final void m3454o(String str, long j10) {
        m3455p(str, j10, null);
    }

    /* renamed from: p */
    public final void m3455p(String str, long j10, String str2) {
        AbstractC7647f.m12666a(j10);
        Objects.toString(this.f3539k);
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(str2);
        }
        Thread.currentThread().getName();
    }

    /* renamed from: q */
    public final void m3456q(InterfaceC8690j interfaceC8690j, DataSource dataSource, boolean z9) {
        m3438C();
        this.f3544p.mo3468a(interfaceC8690j, dataSource, z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final void m3457r(InterfaceC8690j interfaceC8690j, DataSource dataSource, boolean z9) {
        C8689i c8689i;
        AbstractC7779b.m13143a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (interfaceC8690j instanceof InterfaceC8687g) {
                ((InterfaceC8687g) interfaceC8690j).initialize();
            }
            if (this.f3534f.m3474c()) {
                interfaceC8690j = C8689i.m14290c(interfaceC8690j);
                c8689i = interfaceC8690j;
            } else {
                c8689i = 0;
            }
            m3456q(interfaceC8690j, dataSource, z9);
            this.f3546r = Stage.ENCODE;
            try {
                if (this.f3534f.m3474c()) {
                    this.f3534f.m3473b(this.f3532d, this.f3543o);
                }
                m3459t();
                AbstractC7779b.m13147e();
            } finally {
                if (c8689i != 0) {
                    c8689i.m14293f();
                }
            }
        } catch (Throwable th) {
            AbstractC7779b.m13147e();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC7779b.m13145c("DecodeJob#run(reason=%s, model=%s)", this.f3547s, this.f3550v);
        InterfaceC5356d interfaceC5356d = this.f3524B;
        try {
            try {
                try {
                    if (this.f3527E) {
                        m3458s();
                        if (interfaceC5356d != null) {
                            interfaceC5356d.mo3404b();
                        }
                        AbstractC7779b.m13147e();
                        return;
                    }
                    m3437B();
                    if (interfaceC5356d != null) {
                        interfaceC5356d.mo3404b();
                    }
                    AbstractC7779b.m13147e();
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Objects.toString(this.f3546r);
                    }
                    if (this.f3546r != Stage.ENCODE) {
                        this.f3530b.add(th);
                        m3458s();
                    }
                    if (!this.f3527E) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            if (interfaceC5356d != null) {
                interfaceC5356d.mo3404b();
            }
            AbstractC7779b.m13147e();
            throw th2;
        }
    }

    /* renamed from: s */
    public final void m3458s() {
        m3438C();
        this.f3544p.mo3469c(new GlideException("Failed to load resource", new ArrayList(this.f3530b)));
        m3460u();
    }

    /* renamed from: t */
    public final void m3459t() {
        if (this.f3535g.m3478b()) {
            m3463x();
        }
    }

    /* renamed from: u */
    public final void m3460u() {
        if (this.f3535g.m3479c()) {
            m3463x();
        }
    }

    /* renamed from: v */
    public InterfaceC8690j m3461v(DataSource dataSource, InterfaceC8690j interfaceC8690j) {
        InterfaceC8690j interfaceC8690jMo14061b;
        InterfaceC8542g interfaceC8542g;
        EncodeStrategy encodeStrategyMo14060b;
        InterfaceC8537b c8681a;
        Class<?> cls = interfaceC8690j.get().getClass();
        InterfaceC8541f interfaceC8541fM3516n = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            InterfaceC8542g interfaceC8542gM3521s = this.f3529a.m3521s(cls);
            interfaceC8542g = interfaceC8542gM3521s;
            interfaceC8690jMo14061b = interfaceC8542gM3521s.mo14061b(this.f3536h, interfaceC8690j, this.f3540l, this.f3541m);
        } else {
            interfaceC8690jMo14061b = interfaceC8690j;
            interfaceC8542g = null;
        }
        if (!interfaceC8690j.equals(interfaceC8690jMo14061b)) {
            interfaceC8690j.recycle();
        }
        if (this.f3529a.m3525w(interfaceC8690jMo14061b)) {
            interfaceC8541fM3516n = this.f3529a.m3516n(interfaceC8690jMo14061b);
            encodeStrategyMo14060b = interfaceC8541fM3516n.mo14060b(this.f3543o);
        } else {
            encodeStrategyMo14060b = EncodeStrategy.NONE;
        }
        InterfaceC8541f interfaceC8541f = interfaceC8541fM3516n;
        if (!this.f3542n.mo14284d(!this.f3529a.m3527y(this.f3552x), dataSource, encodeStrategyMo14060b)) {
            return interfaceC8690jMo14061b;
        }
        if (interfaceC8541f == null) {
            throw new Registry.NoResultEncoderAvailableException(interfaceC8690jMo14061b.get().getClass());
        }
        int i10 = C5367a.f3568c[encodeStrategyMo14060b.ordinal()];
        if (i10 == 1) {
            c8681a = new C8681a(this.f3552x, this.f3537i);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyMo14060b);
            }
            c8681a = new C8691k(this.f3529a.m3504b(), this.f3552x, this.f3537i, this.f3540l, this.f3541m, interfaceC8542g, cls, this.f3543o);
        }
        C8689i c8689iM14290c = C8689i.m14290c(interfaceC8690jMo14061b);
        this.f3534f.m3475d(c8681a, interfaceC8541f, c8689iM14290c);
        return c8689iM14290c;
    }

    /* renamed from: w */
    public void m3462w(boolean z9) {
        if (this.f3535g.m3480d(z9)) {
            m3463x();
        }
    }

    /* renamed from: x */
    public final void m3463x() {
        this.f3535g.m3481e();
        this.f3534f.m3472a();
        this.f3529a.m3503a();
        this.f3526D = false;
        this.f3536h = null;
        this.f3537i = null;
        this.f3543o = null;
        this.f3538j = null;
        this.f3539k = null;
        this.f3544p = null;
        this.f3546r = null;
        this.f3525C = null;
        this.f3551w = null;
        this.f3552x = null;
        this.f3554z = null;
        this.f3523A = null;
        this.f3524B = null;
        this.f3548t = 0L;
        this.f3527E = false;
        this.f3550v = null;
        this.f3530b.clear();
        this.f3533e.release(this);
    }

    /* renamed from: y */
    public final void m3464y(RunReason runReason) {
        this.f3547s = runReason;
        this.f3544p.mo3470e(this);
    }

    /* renamed from: z */
    public final void m3465z() {
        this.f3551w = Thread.currentThread();
        this.f3548t = AbstractC7647f.m12667b();
        boolean zMo3502d = false;
        while (!this.f3527E && this.f3525C != null && !(zMo3502d = this.f3525C.mo3502d())) {
            this.f3546r = m3450k(this.f3546r);
            this.f3525C = m3449j();
            if (this.f3546r == Stage.SOURCE) {
                m3464y(RunReason.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f3546r == Stage.FINISHED || this.f3527E) && !zMo3502d) {
            m3458s();
        }
    }
}
