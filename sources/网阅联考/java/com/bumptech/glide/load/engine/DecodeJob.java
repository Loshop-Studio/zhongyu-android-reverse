package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C2860e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.C2876e;
import com.bumptech.glide.load.engine.InterfaceC2874c;
import com.bumptech.glide.load.resource.bitmap.C2892a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p062g0.AbstractC3745e;
import p067h0.AbstractC3762a;
import p067h0.AbstractC3763b;
import p067h0.AbstractC3764c;
import p076j.C3793c;
import p076j.C3794d;
import p076j.InterfaceC3792b;
import p076j.InterfaceC3796f;
import p076j.InterfaceC3797g;
import p081k.InterfaceC3843d;
import p081k.InterfaceC3844e;
import p093m.AbstractC4354c;
import p093m.C4352a;
import p093m.C4353b;
import p093m.C4356e;
import p093m.C4360i;
import p093m.C4362k;
import p093m.InterfaceC4358g;
import p093m.InterfaceC4361j;
import p102o.InterfaceC4410a;

/* loaded from: classes2.dex */
public class DecodeJob implements InterfaceC2874c.a, Runnable, Comparable, AbstractC3762a.f {

    /* renamed from: A */
    public DataSource f667A;

    /* renamed from: B */
    public InterfaceC3843d f668B;

    /* renamed from: C */
    public volatile InterfaceC2874c f669C;

    /* renamed from: D */
    public volatile boolean f670D;

    /* renamed from: E */
    public volatile boolean f671E;

    /* renamed from: d */
    public final InterfaceC2869e f675d;

    /* renamed from: e */
    public final Pools.Pool f676e;

    /* renamed from: h */
    public C2860e f679h;

    /* renamed from: i */
    public InterfaceC3792b f680i;

    /* renamed from: j */
    public Priority f681j;

    /* renamed from: k */
    public C4356e f682k;

    /* renamed from: l */
    public int f683l;

    /* renamed from: m */
    public int f684m;

    /* renamed from: n */
    public AbstractC4354c f685n;

    /* renamed from: o */
    public C3794d f686o;

    /* renamed from: p */
    public InterfaceC2866b f687p;

    /* renamed from: q */
    public int f688q;

    /* renamed from: r */
    public Stage f689r;

    /* renamed from: s */
    public RunReason f690s;

    /* renamed from: t */
    public long f691t;

    /* renamed from: u */
    public boolean f692u;

    /* renamed from: v */
    public Object f693v;

    /* renamed from: w */
    public Thread f694w;

    /* renamed from: x */
    public InterfaceC3792b f695x;

    /* renamed from: y */
    public InterfaceC3792b f696y;

    /* renamed from: z */
    public Object f697z;

    /* renamed from: a */
    public final C2875d f672a = new C2875d();

    /* renamed from: b */
    public final List f673b = new ArrayList();

    /* renamed from: c */
    public final AbstractC3764c f674c = AbstractC3764c.m4863a();

    /* renamed from: f */
    public final C2868d f677f = new C2868d();

    /* renamed from: g */
    public final C2870f f678g = new C2870f();

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
    public static /* synthetic */ class C2865a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f709a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f710b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f711c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f711c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f711c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f710b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f710b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f710b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f710b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f710b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f709a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f709a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f709a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface InterfaceC2866b {
        /* renamed from: a */
        void mo1794a(InterfaceC4361j interfaceC4361j, DataSource dataSource);

        /* renamed from: b */
        void mo1795b(GlideException glideException);

        /* renamed from: c */
        void mo1796c(DecodeJob decodeJob);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C2867c implements C2876e.a {

        /* renamed from: a */
        public final DataSource f712a;

        public C2867c(DataSource dataSource) {
            this.f712a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.C2876e.a
        /* renamed from: a */
        public InterfaceC4361j mo1797a(InterfaceC4361j interfaceC4361j) {
            return DecodeJob.this.m1789v(this.f712a, interfaceC4361j);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C2868d {

        /* renamed from: a */
        public InterfaceC3792b f714a;

        /* renamed from: b */
        public InterfaceC3796f f715b;

        /* renamed from: c */
        public C4360i f716c;

        /* renamed from: a */
        public void m1798a() {
            this.f714a = null;
            this.f715b = null;
            this.f716c = null;
        }

        /* renamed from: b */
        public void m1799b(InterfaceC2869e interfaceC2869e, C3794d c3794d) {
            AbstractC3763b.m4859a("DecodeJob.encode");
            try {
                interfaceC2869e.mo1802a().mo5497a(this.f714a, new C4353b(this.f715b, this.f716c, c3794d));
            } finally {
                this.f716c.m5377f();
                AbstractC3763b.m4862d();
            }
        }

        /* renamed from: c */
        public boolean m1800c() {
            return this.f716c != null;
        }

        /* renamed from: d */
        public void m1801d(InterfaceC3792b interfaceC3792b, InterfaceC3796f interfaceC3796f, C4360i c4360i) {
            this.f714a = interfaceC3792b;
            this.f715b = interfaceC3796f;
            this.f716c = c4360i;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface InterfaceC2869e {
        /* renamed from: a */
        InterfaceC4410a mo1802a();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C2870f {

        /* renamed from: a */
        public boolean f717a;

        /* renamed from: b */
        public boolean f718b;

        /* renamed from: c */
        public boolean f719c;

        /* renamed from: a */
        public final boolean m1803a(boolean z3) {
            return (this.f719c || z3 || this.f718b) && this.f717a;
        }

        /* renamed from: b */
        public synchronized boolean m1804b() {
            this.f718b = true;
            return m1803a(false);
        }

        /* renamed from: c */
        public synchronized boolean m1805c() {
            this.f719c = true;
            return m1803a(false);
        }

        /* renamed from: d */
        public synchronized boolean m1806d(boolean z3) {
            this.f717a = true;
            return m1803a(z3);
        }

        /* renamed from: e */
        public synchronized void m1807e() {
            this.f718b = false;
            this.f717a = false;
            this.f719c = false;
        }
    }

    public DecodeJob(InterfaceC2869e interfaceC2869e, Pools.Pool pool) {
        this.f675d = interfaceC2869e;
        this.f676e = pool;
    }

    /* renamed from: A */
    public final void m1765A() {
        int i4 = C2865a.f709a[this.f690s.ordinal()];
        if (i4 == 1) {
            this.f689r = m1778k(Stage.INITIALIZE);
            this.f669C = m1777j();
            m1792y();
        } else if (i4 == 2) {
            m1792y();
        } else {
            if (i4 == 3) {
                m1776i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f690s);
        }
    }

    /* renamed from: B */
    public final void m1766B() {
        Throwable th;
        this.f674c.mo4865c();
        if (!this.f670D) {
            this.f670D = true;
            return;
        }
        if (this.f673b.isEmpty()) {
            th = null;
        } else {
            List list = this.f673b;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* renamed from: C */
    public boolean m1767C() {
        Stage stageM1778k = m1778k(Stage.INITIALIZE);
        return stageM1778k == Stage.RESOURCE_CACHE || stageM1778k == Stage.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c.a
    /* renamed from: a */
    public void mo1768a(InterfaceC3792b interfaceC3792b, Object obj, InterfaceC3843d interfaceC3843d, DataSource dataSource, InterfaceC3792b interfaceC3792b2) {
        this.f695x = interfaceC3792b;
        this.f697z = obj;
        this.f668B = interfaceC3843d;
        this.f667A = dataSource;
        this.f696y = interfaceC3792b2;
        if (Thread.currentThread() != this.f694w) {
            this.f690s = RunReason.DECODE_DATA;
            this.f687p.mo1796c(this);
        } else {
            AbstractC3763b.m4859a("DecodeJob.decodeFromRetrievedData");
            try {
                m1776i();
            } finally {
                AbstractC3763b.m4862d();
            }
        }
    }

    /* renamed from: b */
    public void m1769b() {
        this.f671E = true;
        InterfaceC2874c interfaceC2874c = this.f669C;
        if (interfaceC2874c != null) {
            interfaceC2874c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c.a
    /* renamed from: c */
    public void mo1770c() {
        this.f690s = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.f687p.mo1796c(this);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c.a
    /* renamed from: d */
    public void mo1771d(InterfaceC3792b interfaceC3792b, Exception exc, InterfaceC3843d interfaceC3843d, DataSource dataSource) {
        interfaceC3843d.mo5119b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.m1817j(interfaceC3792b, dataSource, interfaceC3843d.mo5114a());
        this.f673b.add(glideException);
        if (Thread.currentThread() == this.f694w) {
            m1792y();
        } else {
            this.f690s = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.f687p.mo1796c(this);
        }
    }

    @Override // p067h0.AbstractC3762a.f
    /* renamed from: e */
    public AbstractC3764c mo1772e() {
        return this.f674c;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(DecodeJob decodeJob) {
        int iM1780m = m1780m() - decodeJob.m1780m();
        return iM1780m == 0 ? this.f688q - decodeJob.f688q : iM1780m;
    }

    /* renamed from: g */
    public final InterfaceC4361j m1774g(InterfaceC3843d interfaceC3843d, Object obj, DataSource dataSource) {
        if (obj == null) {
            interfaceC3843d.mo5119b();
            return null;
        }
        try {
            long jM4752b = AbstractC3745e.m4752b();
            InterfaceC4361j interfaceC4361jM1775h = m1775h(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m1782o("Decoded result " + interfaceC4361jM1775h, jM4752b);
            }
            return interfaceC4361jM1775h;
        } finally {
            interfaceC3843d.mo5119b();
        }
    }

    /* renamed from: h */
    public final InterfaceC4361j m1775h(Object obj, DataSource dataSource) {
        return m1793z(obj, dataSource, this.f672a.m1838h(obj.getClass()));
    }

    /* renamed from: i */
    public final void m1776i() {
        InterfaceC4361j interfaceC4361jM1774g;
        if (Log.isLoggable("DecodeJob", 2)) {
            m1783p("Retrieved data", this.f691t, "data: " + this.f697z + ", cache key: " + this.f695x + ", fetcher: " + this.f668B);
        }
        try {
            interfaceC4361jM1774g = m1774g(this.f668B, this.f697z, this.f667A);
        } catch (GlideException e4) {
            e4.m1816i(this.f696y, this.f667A);
            this.f673b.add(e4);
            interfaceC4361jM1774g = null;
        }
        if (interfaceC4361jM1774g != null) {
            m1785r(interfaceC4361jM1774g, this.f667A);
        } else {
            m1792y();
        }
    }

    /* renamed from: j */
    public final InterfaceC2874c m1777j() {
        int i4 = C2865a.f710b[this.f689r.ordinal()];
        if (i4 == 1) {
            return new C2881j(this.f672a, this);
        }
        if (i4 == 2) {
            return new C2873b(this.f672a, this);
        }
        if (i4 == 3) {
            return new C2882k(this.f672a, this);
        }
        if (i4 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f689r);
    }

    /* renamed from: k */
    public final Stage m1778k(Stage stage) {
        int i4 = C2865a.f710b[stage.ordinal()];
        if (i4 == 1) {
            return this.f685n.mo5364a() ? Stage.DATA_CACHE : m1778k(Stage.DATA_CACHE);
        }
        if (i4 == 2) {
            return this.f692u ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i4 == 3 || i4 == 4) {
            return Stage.FINISHED;
        }
        if (i4 == 5) {
            return this.f685n.mo5365b() ? Stage.RESOURCE_CACHE : m1778k(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    /* renamed from: l */
    public final C3794d m1779l(DataSource dataSource) {
        C3794d c3794d = this.f686o;
        if (Build.VERSION.SDK_INT < 26) {
            return c3794d;
        }
        boolean z3 = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f672a.m1853w();
        C3793c c3793c = C2892a.f888j;
        Boolean bool = (Boolean) c3794d.m4951c(c3793c);
        if (bool != null && (!bool.booleanValue() || z3)) {
            return c3794d;
        }
        C3794d c3794d2 = new C3794d();
        c3794d2.m4952d(this.f686o);
        c3794d2.m4953e(c3793c, Boolean.valueOf(z3));
        return c3794d2;
    }

    /* renamed from: m */
    public final int m1780m() {
        return this.f681j.ordinal();
    }

    /* renamed from: n */
    public DecodeJob m1781n(C2860e c2860e, Object obj, C4356e c4356e, InterfaceC3792b interfaceC3792b, int i4, int i5, Class cls, Class cls2, Priority priority, AbstractC4354c abstractC4354c, Map map, boolean z3, boolean z4, boolean z5, C3794d c3794d, InterfaceC2866b interfaceC2866b, int i6) {
        this.f672a.m1851u(c2860e, obj, interfaceC3792b, i4, i5, abstractC4354c, cls, cls2, priority, c3794d, map, z3, z4, this.f675d);
        this.f679h = c2860e;
        this.f680i = interfaceC3792b;
        this.f681j = priority;
        this.f682k = c4356e;
        this.f683l = i4;
        this.f684m = i5;
        this.f685n = abstractC4354c;
        this.f692u = z5;
        this.f686o = c3794d;
        this.f687p = interfaceC2866b;
        this.f688q = i6;
        this.f690s = RunReason.INITIALIZE;
        this.f693v = obj;
        return this;
    }

    /* renamed from: o */
    public final void m1782o(String str, long j4) {
        m1783p(str, j4, null);
    }

    /* renamed from: p */
    public final void m1783p(String str, long j4, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(AbstractC3745e.m4751a(j4));
        sb.append(", load key: ");
        sb.append(this.f682k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    /* renamed from: q */
    public final void m1784q(InterfaceC4361j interfaceC4361j, DataSource dataSource) {
        m1766B();
        this.f687p.mo1794a(interfaceC4361j, dataSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final void m1785r(InterfaceC4361j interfaceC4361j, DataSource dataSource) {
        C4360i c4360i;
        if (interfaceC4361j instanceof InterfaceC4358g) {
            ((InterfaceC4358g) interfaceC4361j).mo5369a();
        }
        if (this.f677f.m1800c()) {
            interfaceC4361j = C4360i.m5374c(interfaceC4361j);
            c4360i = interfaceC4361j;
        } else {
            c4360i = 0;
        }
        m1784q(interfaceC4361j, dataSource);
        this.f689r = Stage.ENCODE;
        try {
            if (this.f677f.m1800c()) {
                this.f677f.m1799b(this.f675d, this.f686o);
            }
            m1787t();
        } finally {
            if (c4360i != 0) {
                c4360i.m5377f();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC3763b.m4860b("DecodeJob#run(model=%s)", this.f693v);
        InterfaceC3843d interfaceC3843d = this.f668B;
        try {
            try {
                if (this.f671E) {
                    m1786s();
                    return;
                }
                m1765A();
                if (interfaceC3843d != null) {
                    interfaceC3843d.mo5119b();
                }
                AbstractC3763b.m4862d();
            } finally {
                if (interfaceC3843d != null) {
                    interfaceC3843d.mo5119b();
                }
                AbstractC3763b.m4862d();
            }
        } catch (CallbackException e4) {
            throw e4;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("DecodeJob threw unexpectedly, isCancelled: ");
                sb.append(this.f671E);
                sb.append(", stage: ");
                sb.append(this.f689r);
            }
            if (this.f689r != Stage.ENCODE) {
                this.f673b.add(th);
                m1786s();
            }
            if (!this.f671E) {
                throw th;
            }
            throw th;
        }
    }

    /* renamed from: s */
    public final void m1786s() {
        m1766B();
        this.f687p.mo1795b(new GlideException("Failed to load resource", new ArrayList(this.f673b)));
        m1788u();
    }

    /* renamed from: t */
    public final void m1787t() {
        if (this.f678g.m1804b()) {
            m1791x();
        }
    }

    /* renamed from: u */
    public final void m1788u() {
        if (this.f678g.m1805c()) {
            m1791x();
        }
    }

    /* renamed from: v */
    public InterfaceC4361j m1789v(DataSource dataSource, InterfaceC4361j interfaceC4361j) {
        InterfaceC4361j interfaceC4361jMo4955a;
        InterfaceC3797g interfaceC3797g;
        EncodeStrategy encodeStrategyMo4954b;
        InterfaceC3792b c4352a;
        Class<?> cls = interfaceC4361j.get().getClass();
        InterfaceC3796f interfaceC3796fM1844n = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            InterfaceC3797g interfaceC3797gM1848r = this.f672a.m1848r(cls);
            interfaceC3797g = interfaceC3797gM1848r;
            interfaceC4361jMo4955a = interfaceC3797gM1848r.mo4955a(this.f679h, interfaceC4361j, this.f683l, this.f684m);
        } else {
            interfaceC4361jMo4955a = interfaceC4361j;
            interfaceC3797g = null;
        }
        if (!interfaceC4361j.equals(interfaceC4361jMo4955a)) {
            interfaceC4361j.recycle();
        }
        if (this.f672a.m1852v(interfaceC4361jMo4955a)) {
            interfaceC3796fM1844n = this.f672a.m1844n(interfaceC4361jMo4955a);
            encodeStrategyMo4954b = interfaceC3796fM1844n.mo4954b(this.f686o);
        } else {
            encodeStrategyMo4954b = EncodeStrategy.NONE;
        }
        InterfaceC3796f interfaceC3796f = interfaceC3796fM1844n;
        if (!this.f685n.mo5367d(!this.f672a.m1854x(this.f695x), dataSource, encodeStrategyMo4954b)) {
            return interfaceC4361jMo4955a;
        }
        if (interfaceC3796f == null) {
            throw new Registry.NoResultEncoderAvailableException(interfaceC4361jMo4955a.get().getClass());
        }
        int i4 = C2865a.f711c[encodeStrategyMo4954b.ordinal()];
        if (i4 == 1) {
            c4352a = new C4352a(this.f695x, this.f680i);
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyMo4954b);
            }
            c4352a = new C4362k(this.f672a.m1832b(), this.f695x, this.f680i, this.f683l, this.f684m, interfaceC3797g, cls, this.f686o);
        }
        C4360i c4360iM5374c = C4360i.m5374c(interfaceC4361jMo4955a);
        this.f677f.m1801d(c4352a, interfaceC3796f, c4360iM5374c);
        return c4360iM5374c;
    }

    /* renamed from: w */
    public void m1790w(boolean z3) {
        if (this.f678g.m1806d(z3)) {
            m1791x();
        }
    }

    /* renamed from: x */
    public final void m1791x() {
        this.f678g.m1807e();
        this.f677f.m1798a();
        this.f672a.m1831a();
        this.f670D = false;
        this.f679h = null;
        this.f680i = null;
        this.f686o = null;
        this.f681j = null;
        this.f682k = null;
        this.f687p = null;
        this.f689r = null;
        this.f669C = null;
        this.f694w = null;
        this.f695x = null;
        this.f697z = null;
        this.f667A = null;
        this.f668B = null;
        this.f691t = 0L;
        this.f671E = false;
        this.f693v = null;
        this.f673b.clear();
        this.f676e.release(this);
    }

    /* renamed from: y */
    public final void m1792y() {
        this.f694w = Thread.currentThread();
        this.f691t = AbstractC3745e.m4752b();
        boolean zMo1828b = false;
        while (!this.f671E && this.f669C != null && !(zMo1828b = this.f669C.mo1828b())) {
            this.f689r = m1778k(this.f689r);
            this.f669C = m1777j();
            if (this.f689r == Stage.SOURCE) {
                mo1770c();
                return;
            }
        }
        if ((this.f689r == Stage.FINISHED || this.f671E) && !zMo1828b) {
            m1786s();
        }
    }

    /* renamed from: z */
    public final InterfaceC4361j m1793z(Object obj, DataSource dataSource, C2880i c2880i) {
        C3794d c3794dM1779l = m1779l(dataSource);
        InterfaceC3844e interfaceC3844eM1671l = this.f679h.m1710h().m1671l(obj);
        try {
            return c2880i.m1902a(interfaceC3844eM1671l, c3794dM1779l, this.f683l, this.f684m, new C2867c(dataSource));
        } finally {
            interfaceC3844eM1671l.mo5128b();
        }
    }
}
