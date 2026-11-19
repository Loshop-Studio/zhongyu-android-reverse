package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.android.agoo.common.AgooConstants;
import p093h.C2650a;
import p103j.InterfaceC2685a;
import p140q0.AbstractC3006a;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3372c;
import p149s0.InterfaceC3374e;
import p149s0.InterfaceC3375f;
import p153t0.C3398c;

/* renamed from: androidx.room.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC0621h0 {

    /* renamed from: a */
    @Deprecated
    protected volatile InterfaceC3371b f3956a;

    /* renamed from: b */
    private Executor f3957b;

    /* renamed from: c */
    private Executor f3958c;

    /* renamed from: d */
    private InterfaceC3372c f3959d;

    /* renamed from: f */
    private boolean f3961f;

    /* renamed from: g */
    boolean f3962g;

    /* renamed from: h */
    @Deprecated
    protected List<b> f3963h;

    /* renamed from: j */
    private C0606a f3965j;

    /* renamed from: i */
    private final ReentrantReadWriteLock f3964i = new ReentrantReadWriteLock();

    /* renamed from: k */
    private final ThreadLocal<Integer> f3966k = new ThreadLocal<>();

    /* renamed from: l */
    private final Map<String, Object> f3967l = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    private final C0633o f3960e = mo3544g();

    /* renamed from: m */
    private final Map<Class<?>, Object> f3968m = new HashMap();

    /* renamed from: androidx.room.h0$a */
    public static class a<T extends AbstractC0621h0> {

        /* renamed from: a */
        private final Class<T> f3969a;

        /* renamed from: b */
        private final String f3970b;

        /* renamed from: c */
        private final Context f3971c;

        /* renamed from: d */
        private ArrayList<b> f3972d;

        /* renamed from: e */
        private f f3973e;

        /* renamed from: f */
        private Executor f3974f;

        /* renamed from: g */
        private List<Object> f3975g;

        /* renamed from: h */
        private Executor f3976h;

        /* renamed from: i */
        private Executor f3977i;

        /* renamed from: j */
        private InterfaceC3372c.c f3978j;

        /* renamed from: k */
        private boolean f3979k;

        /* renamed from: m */
        private boolean f3981m;

        /* renamed from: o */
        private boolean f3983o;

        /* renamed from: q */
        private TimeUnit f3985q;

        /* renamed from: s */
        private Set<Integer> f3987s;

        /* renamed from: t */
        private Set<Integer> f3988t;

        /* renamed from: u */
        private String f3989u;

        /* renamed from: v */
        private File f3990v;

        /* renamed from: w */
        private Callable<InputStream> f3991w;

        /* renamed from: p */
        private long f3984p = -1;

        /* renamed from: l */
        private c f3980l = c.AUTOMATIC;

        /* renamed from: n */
        private boolean f3982n = true;

        /* renamed from: r */
        private final d f3986r = new d();

        a(Context context, Class<T> cls, String str) {
            this.f3971c = context;
            this.f3969a = cls;
            this.f3970b = str;
        }

        /* renamed from: a */
        public a<T> m3559a(b bVar) {
            if (this.f3972d == null) {
                this.f3972d = new ArrayList<>();
            }
            this.f3972d.add(bVar);
            return this;
        }

        /* renamed from: b */
        public a<T> m3560b(AbstractC3006a... abstractC3006aArr) {
            if (this.f3988t == null) {
                this.f3988t = new HashSet();
            }
            for (AbstractC3006a abstractC3006a : abstractC3006aArr) {
                this.f3988t.add(Integer.valueOf(abstractC3006a.f11667a));
                this.f3988t.add(Integer.valueOf(abstractC3006a.f11668b));
            }
            this.f3986r.m3573b(abstractC3006aArr);
            return this;
        }

        /* renamed from: c */
        public a<T> m3561c() {
            this.f3979k = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        /* renamed from: d */
        public T m3562d() {
            Executor executor;
            if (this.f3971c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f3969a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f3976h;
            if (executor2 == null && this.f3977i == null) {
                Executor executorM8860e = C2650a.m8860e();
                this.f3977i = executorM8860e;
                this.f3976h = executorM8860e;
            } else if (executor2 != null && this.f3977i == null) {
                this.f3977i = executor2;
            } else if (executor2 == null && (executor = this.f3977i) != null) {
                this.f3976h = executor;
            }
            Set<Integer> set = this.f3988t;
            if (set != null && this.f3987s != null) {
                for (Integer num : set) {
                    if (this.f3987s.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            InterfaceC3372c.c c0629l0 = this.f3978j;
            if (c0629l0 == null) {
                c0629l0 = new C3398c();
            }
            long j4 = this.f3984p;
            if (j4 > 0) {
                if (this.f3970b == null) {
                    throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                }
                c0629l0 = new C0620h(c0629l0, new C0606a(j4, this.f3985q, this.f3977i));
            }
            String str = this.f3989u;
            if (str != null || this.f3990v != null || this.f3991w != null) {
                if (this.f3970b == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                int i4 = str == null ? 0 : 1;
                File file = this.f3990v;
                int i5 = i4 + (file == null ? 0 : 1);
                Callable<InputStream> callable = this.f3991w;
                if (i5 + (callable != null ? 1 : 0) != 1) {
                    throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                }
                c0629l0 = new C0629l0(str, file, callable, c0629l0);
            }
            f fVar = this.f3973e;
            InterfaceC3372c.c c0609b0 = fVar != null ? new C0609b0(c0629l0, fVar, this.f3974f) : c0629l0;
            Context context = this.f3971c;
            C0622i c0622i = new C0622i(context, this.f3970b, c0609b0, this.f3986r, this.f3972d, this.f3979k, this.f3980l.m3570b(context), this.f3976h, this.f3977i, this.f3981m, this.f3982n, this.f3983o, this.f3987s, this.f3989u, this.f3990v, this.f3991w, null, this.f3975g);
            T t3 = (T) C0619g0.m3528b(this.f3969a, "_Impl");
            t3.m3554q(c0622i);
            return t3;
        }

        /* renamed from: e */
        public a<T> m3563e() {
            this.f3982n = false;
            this.f3983o = true;
            return this;
        }

        /* renamed from: f */
        public a<T> m3564f(InterfaceC3372c.c cVar) {
            this.f3978j = cVar;
            return this;
        }

        /* renamed from: g */
        public a<T> m3565g(Executor executor) {
            this.f3976h = executor;
            return this;
        }
    }

    /* renamed from: androidx.room.h0$b */
    public static abstract class b {
        /* renamed from: a */
        public void m3566a(InterfaceC3371b interfaceC3371b) {
        }

        /* renamed from: b */
        public void m3567b(InterfaceC3371b interfaceC3371b) {
        }

        /* renamed from: c */
        public void mo3568c(InterfaceC3371b interfaceC3371b) {
        }
    }

    /* renamed from: androidx.room.h0$c */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: a */
        private static boolean m3569a(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        /* renamed from: b */
        c m3570b(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
            return (activityManager == null || m3569a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: androidx.room.h0$d */
    public static class d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, AbstractC3006a>> f3996a = new HashMap<>();

        /* renamed from: a */
        private void m3571a(AbstractC3006a abstractC3006a) {
            int i4 = abstractC3006a.f11667a;
            int i5 = abstractC3006a.f11668b;
            TreeMap<Integer, AbstractC3006a> treeMap = this.f3996a.get(Integer.valueOf(i4));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f3996a.put(Integer.valueOf(i4), treeMap);
            }
            AbstractC3006a abstractC3006a2 = treeMap.get(Integer.valueOf(i5));
            if (abstractC3006a2 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC3006a2 + " with " + abstractC3006a);
            }
            treeMap.put(Integer.valueOf(i5), abstractC3006a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0047 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:1: B:13:0x0026->B:43:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.util.List<p140q0.AbstractC3006a> m3572d(java.util.List<p140q0.AbstractC3006a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L5a
                goto L7
            L5:
                if (r9 <= r10) goto L5a
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, q0.a>> r0 = r6.f3996a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L56
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = 1
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                q0.a r9 = (p140q0.AbstractC3006a) r9
                r7.add(r9)
                r9 = r3
                goto L57
            L56:
                r4 = 0
            L57:
                if (r4 != 0) goto L0
                return r1
            L5a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.AbstractC0621h0.d.m3572d(java.util.List, boolean, int, int):java.util.List");
        }

        /* renamed from: b */
        public void m3573b(AbstractC3006a... abstractC3006aArr) {
            for (AbstractC3006a abstractC3006a : abstractC3006aArr) {
                m3571a(abstractC3006a);
            }
        }

        /* renamed from: c */
        public List<AbstractC3006a> m3574c(int i4, int i5) {
            if (i4 == i5) {
                return Collections.emptyList();
            }
            return m3572d(new ArrayList(), i5 > i4, i4, i5);
        }
    }

    /* renamed from: androidx.room.h0$e */
    public static abstract class e {
    }

    /* renamed from: androidx.room.h0$f */
    public interface f {
        /* renamed from: a */
        void m3575a(String str, List<Object> list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    private <T> T m3531B(Class<T> cls, InterfaceC3372c interfaceC3372c) {
        if (cls.isInstance(interfaceC3372c)) {
            return interfaceC3372c;
        }
        if (interfaceC3372c instanceof InterfaceC0624j) {
            return (T) m3531B(cls, ((InterfaceC0624j) interfaceC3372c).getDelegate());
        }
        return null;
    }

    /* renamed from: r */
    private void m3534r() {
        m3540c();
        InterfaceC3371b interfaceC3371bMo3483F = this.f3959d.mo3483F();
        this.f3960e.m3628r(interfaceC3371bMo3483F);
        if (interfaceC3371bMo3483F.mo3512v()) {
            interfaceC3371bMo3483F.mo3501A();
        } else {
            interfaceC3371bMo3483F.mo3506f();
        }
    }

    /* renamed from: s */
    private void m3535s() {
        this.f3959d.mo3483F().mo3505e();
        if (m3553p()) {
            return;
        }
        this.f3960e.m3623j();
    }

    /* renamed from: u */
    private static boolean m3536u() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ Object m3537w(InterfaceC3371b interfaceC3371b) {
        m3534r();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ Object m3538x(InterfaceC3371b interfaceC3371b) {
        m3535s();
        return null;
    }

    @Deprecated
    /* renamed from: A */
    public void m3539A() {
        this.f3959d.mo3483F().mo3513x();
    }

    /* renamed from: c */
    public void m3540c() {
        if (!this.f3961f && m3536u()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: d */
    public void m3541d() {
        if (!m3553p() && this.f3966k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: e */
    public void m3542e() {
        m3540c();
        C0606a c0606a = this.f3965j;
        if (c0606a == null) {
            m3534r();
        } else {
            c0606a.m3477c(new InterfaceC2685a() { // from class: p0.h
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return this.f11564a.m3537w((InterfaceC3371b) obj);
                }
            });
        }
    }

    /* renamed from: f */
    public InterfaceC3375f m3543f(String str) {
        m3540c();
        m3541d();
        return this.f3959d.mo3483F().mo3509j(str);
    }

    /* renamed from: g */
    protected abstract C0633o mo3544g();

    /* renamed from: h */
    protected abstract InterfaceC3372c mo3545h(C0622i c0622i);

    @Deprecated
    /* renamed from: i */
    public void m3546i() {
        C0606a c0606a = this.f3965j;
        if (c0606a == null) {
            m3535s();
        } else {
            c0606a.m3477c(new InterfaceC2685a() { // from class: p0.i
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return this.f11565a.m3538x((InterfaceC3371b) obj);
                }
            });
        }
    }

    /* renamed from: j */
    Lock m3547j() {
        return this.f3964i.readLock();
    }

    /* renamed from: k */
    public C0633o m3548k() {
        return this.f3960e;
    }

    /* renamed from: l */
    public InterfaceC3372c m3549l() {
        return this.f3959d;
    }

    /* renamed from: m */
    public Executor m3550m() {
        return this.f3957b;
    }

    /* renamed from: n */
    protected Map<Class<?>, List<Class<?>>> mo3551n() {
        return Collections.emptyMap();
    }

    /* renamed from: o */
    public Executor m3552o() {
        return this.f3958c;
    }

    /* renamed from: p */
    public boolean m3553p() {
        return this.f3959d.mo3483F().mo3510p();
    }

    /* renamed from: q */
    public void m3554q(C0622i c0622i) {
        InterfaceC3372c interfaceC3372cMo3545h = mo3545h(c0622i);
        this.f3959d = interfaceC3372cMo3545h;
        C0627k0 c0627k0 = (C0627k0) m3531B(C0627k0.class, interfaceC3372cMo3545h);
        if (c0627k0 != null) {
            c0627k0.m3603d(c0622i);
        }
        C0616f c0616f = (C0616f) m3531B(C0616f.class, this.f3959d);
        if (c0616f != null) {
            C0606a c0606aM3492a = c0616f.m3492a();
            this.f3965j = c0606aM3492a;
            this.f3960e.m3625m(c0606aM3492a);
        }
        boolean z3 = c0622i.f4004h == c.WRITE_AHEAD_LOGGING;
        this.f3959d.setWriteAheadLoggingEnabled(z3);
        this.f3963h = c0622i.f4001e;
        this.f3957b = c0622i.f4005i;
        this.f3958c = new ExecutorC0631m0(c0622i.f4006j);
        this.f3961f = c0622i.f4003g;
        this.f3962g = z3;
        if (c0622i.f4007k) {
            this.f3960e.m3626n(c0622i.f3998b, c0622i.f3999c);
        }
        Map<Class<?>, List<Class<?>>> mapMo3551n = mo3551n();
        BitSet bitSet = new BitSet();
        for (Map.Entry<Class<?>, List<Class<?>>> entry : mapMo3551n.entrySet()) {
            Class<?> key = entry.getKey();
            for (Class<?> cls : entry.getValue()) {
                int size = c0622i.f4002f.size() - 1;
                while (true) {
                    if (size < 0) {
                        size = -1;
                        break;
                    } else {
                        if (cls.isAssignableFrom(c0622i.f4002f.get(size).getClass())) {
                            bitSet.set(size);
                            break;
                        }
                        size--;
                    }
                }
                if (size < 0) {
                    throw new IllegalArgumentException("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                }
                this.f3968m.put(cls, c0622i.f4002f.get(size));
            }
        }
        for (int size2 = c0622i.f4002f.size() - 1; size2 >= 0; size2--) {
            if (!bitSet.get(size2)) {
                throw new IllegalArgumentException("Unexpected type converter " + c0622i.f4002f.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
        }
    }

    /* renamed from: t */
    protected void m3555t(InterfaceC3371b interfaceC3371b) {
        this.f3960e.m3620g(interfaceC3371b);
    }

    /* renamed from: v */
    public boolean m3556v() {
        C0606a c0606a = this.f3965j;
        if (c0606a != null) {
            return c0606a.m3481g();
        }
        InterfaceC3371b interfaceC3371b = this.f3956a;
        return interfaceC3371b != null && interfaceC3371b.isOpen();
    }

    /* renamed from: y */
    public Cursor m3557y(InterfaceC3374e interfaceC3374e) {
        return m3558z(interfaceC3374e, null);
    }

    /* renamed from: z */
    public Cursor m3558z(InterfaceC3374e interfaceC3374e, CancellationSignal cancellationSignal) {
        m3540c();
        m3541d();
        return cancellationSignal != null ? this.f3959d.mo3483F().mo3503E(interfaceC3374e, cancellationSignal) : this.f3959d.mo3483F().mo3502D(interfaceC3374e);
    }
}
