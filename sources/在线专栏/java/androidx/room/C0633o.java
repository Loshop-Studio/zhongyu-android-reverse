package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import anet.channel.request.Request;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p098i.C2661b;
import p149s0.C3370a;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3375f;

/* renamed from: androidx.room.o */
/* loaded from: classes.dex */
public class C0633o {

    /* renamed from: n */
    private static final String[] f4058n = {"UPDATE", Request.Method.DELETE, "INSERT"};

    /* renamed from: b */
    final String[] f4060b;

    /* renamed from: c */
    private Map<String, Set<String>> f4061c;

    /* renamed from: e */
    final AbstractC0621h0 f4063e;

    /* renamed from: h */
    volatile InterfaceC3375f f4066h;

    /* renamed from: i */
    private b f4067i;

    /* renamed from: j */
    private final C0630m f4068j;

    /* renamed from: l */
    private C0634p f4070l;

    /* renamed from: d */
    C0606a f4062d = null;

    /* renamed from: f */
    AtomicBoolean f4064f = new AtomicBoolean(false);

    /* renamed from: g */
    private volatile boolean f4065g = false;

    /* renamed from: k */
    @SuppressLint({"RestrictedApi"})
    final C2661b<c, d> f4069k = new C2661b<>();

    /* renamed from: m */
    Runnable f4071m = new a();

    /* renamed from: a */
    final HashMap<String, Integer> f4059a = new HashMap<>();

    /* renamed from: androidx.room.o$a */
    class a implements Runnable {
        a() {
        }

        /* renamed from: a */
        private Set<Integer> m3629a() {
            HashSet hashSet = new HashSet();
            Cursor cursorM3557y = C0633o.this.f4063e.m3557y(new C3370a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorM3557y.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorM3557y.getInt(0)));
                } catch (Throwable th) {
                    cursorM3557y.close();
                    throw th;
                }
            }
            cursorM3557y.close();
            if (!hashSet.isEmpty()) {
                C0633o.this.f4066h.mo3521i();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0606a c0606a;
            C0606a c0606a2;
            Lock lockM3547j = C0633o.this.f4063e.m3547j();
            lockM3547j.lock();
            Set<Integer> setM3629a = null;
            try {
                try {
                } finally {
                    lockM3547j.unlock();
                    c0606a2 = C0633o.this.f4062d;
                    if (c0606a2 != null) {
                        c0606a2.m3476b();
                    }
                }
            } catch (SQLiteException | IllegalStateException e4) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
                lockM3547j.unlock();
                c0606a = C0633o.this.f4062d;
                if (c0606a != null) {
                }
            }
            if (!C0633o.this.m3619f()) {
                if (c0606a2 != null) {
                    return;
                } else {
                    return;
                }
            }
            if (!C0633o.this.f4064f.compareAndSet(true, false)) {
                lockM3547j.unlock();
                C0606a c0606a3 = C0633o.this.f4062d;
                if (c0606a3 != null) {
                    c0606a3.m3476b();
                    return;
                }
                return;
            }
            if (C0633o.this.f4063e.m3553p()) {
                lockM3547j.unlock();
                C0606a c0606a4 = C0633o.this.f4062d;
                if (c0606a4 != null) {
                    c0606a4.m3476b();
                    return;
                }
                return;
            }
            AbstractC0621h0 abstractC0621h0 = C0633o.this.f4063e;
            if (abstractC0621h0.f3962g) {
                InterfaceC3371b interfaceC3371bMo3483F = abstractC0621h0.m3549l().mo3483F();
                interfaceC3371bMo3483F.mo3501A();
                try {
                    setM3629a = m3629a();
                    interfaceC3371bMo3483F.mo3513x();
                    interfaceC3371bMo3483F.mo3505e();
                } catch (Throwable th) {
                    interfaceC3371bMo3483F.mo3505e();
                    throw th;
                }
            } else {
                setM3629a = m3629a();
            }
            lockM3547j.unlock();
            c0606a = C0633o.this.f4062d;
            if (c0606a != null) {
                c0606a.m3476b();
            }
            if (setM3629a == null || setM3629a.isEmpty()) {
                return;
            }
            synchronized (C0633o.this.f4069k) {
                Iterator<Map.Entry<c, d>> it = C0633o.this.f4069k.iterator();
                while (it.hasNext()) {
                    it.next().getValue().m3636a(setM3629a);
                }
            }
        }
    }

    /* renamed from: androidx.room.o$b */
    static class b {

        /* renamed from: a */
        final long[] f4073a;

        /* renamed from: b */
        final boolean[] f4074b;

        /* renamed from: c */
        final int[] f4075c;

        /* renamed from: d */
        boolean f4076d;

        /* renamed from: e */
        boolean f4077e;

        b(int i4) {
            long[] jArr = new long[i4];
            this.f4073a = jArr;
            boolean[] zArr = new boolean[i4];
            this.f4074b = zArr;
            this.f4075c = new int[i4];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        /* renamed from: a */
        int[] m3630a() {
            synchronized (this) {
                if (this.f4076d && !this.f4077e) {
                    int length = this.f4073a.length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 1;
                        if (i4 >= length) {
                            this.f4077e = true;
                            this.f4076d = false;
                            return this.f4075c;
                        }
                        boolean z3 = this.f4073a[i4] > 0;
                        boolean[] zArr = this.f4074b;
                        if (z3 != zArr[i4]) {
                            int[] iArr = this.f4075c;
                            if (!z3) {
                                i5 = 2;
                            }
                            iArr[i4] = i5;
                        } else {
                            this.f4075c[i4] = 0;
                        }
                        zArr[i4] = z3;
                        i4++;
                    }
                }
                return null;
            }
        }

        /* renamed from: b */
        boolean m3631b(int... iArr) {
            boolean z3;
            synchronized (this) {
                z3 = false;
                for (int i4 : iArr) {
                    long[] jArr = this.f4073a;
                    long j4 = jArr[i4];
                    jArr[i4] = 1 + j4;
                    if (j4 == 0) {
                        this.f4076d = true;
                        z3 = true;
                    }
                }
            }
            return z3;
        }

        /* renamed from: c */
        boolean m3632c(int... iArr) {
            boolean z3;
            synchronized (this) {
                z3 = false;
                for (int i4 : iArr) {
                    long[] jArr = this.f4073a;
                    long j4 = jArr[i4];
                    jArr[i4] = j4 - 1;
                    if (j4 == 1) {
                        this.f4076d = true;
                        z3 = true;
                    }
                }
            }
            return z3;
        }

        /* renamed from: d */
        void m3633d() {
            synchronized (this) {
                this.f4077e = false;
            }
        }

        /* renamed from: e */
        void m3634e() {
            synchronized (this) {
                Arrays.fill(this.f4074b, false);
                this.f4076d = true;
            }
        }
    }

    /* renamed from: androidx.room.o$c */
    public static abstract class c {

        /* renamed from: a */
        final String[] f4078a;

        public c(String[] strArr) {
            this.f4078a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        boolean mo3635a() {
            return false;
        }

        /* renamed from: b */
        public abstract void mo3596b(Set<String> set);
    }

    /* renamed from: androidx.room.o$d */
    static class d {

        /* renamed from: a */
        final int[] f4079a;

        /* renamed from: b */
        private final String[] f4080b;

        /* renamed from: c */
        final c f4081c;

        /* renamed from: d */
        private final Set<String> f4082d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f4081c = cVar;
            this.f4079a = iArr;
            this.f4080b = strArr;
            if (iArr.length != 1) {
                this.f4082d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f4082d = Collections.unmodifiableSet(hashSet);
        }

        /* renamed from: a */
        void m3636a(Set<Integer> set) {
            int length = this.f4079a.length;
            Set<String> hashSet = null;
            for (int i4 = 0; i4 < length; i4++) {
                if (set.contains(Integer.valueOf(this.f4079a[i4]))) {
                    if (length == 1) {
                        hashSet = this.f4082d;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>(length);
                        }
                        hashSet.add(this.f4080b[i4]);
                    }
                }
            }
            if (hashSet != null) {
                this.f4081c.mo3596b(hashSet);
            }
        }

        /* renamed from: b */
        void m3637b(String[] strArr) {
            Set<String> set = null;
            if (this.f4080b.length == 1) {
                int length = strArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    if (strArr[i4].equalsIgnoreCase(this.f4080b[0])) {
                        set = this.f4082d;
                        break;
                    }
                    i4++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f4080b;
                    int length2 = strArr2.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length2) {
                            String str2 = strArr2[i5];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i5++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f4081c.mo3596b(set);
            }
        }
    }

    /* renamed from: androidx.room.o$e */
    static class e extends c {

        /* renamed from: b */
        final C0633o f4083b;

        /* renamed from: c */
        final WeakReference<c> f4084c;

        e(C0633o c0633o, c cVar) {
            super(cVar.f4078a);
            this.f4083b = c0633o;
            this.f4084c = new WeakReference<>(cVar);
        }

        @Override // androidx.room.C0633o.c
        /* renamed from: b */
        public void mo3596b(Set<String> set) {
            c cVar = this.f4084c.get();
            if (cVar == null) {
                this.f4083b.m3624k(this);
            } else {
                cVar.mo3596b(set);
            }
        }
    }

    public C0633o(AbstractC0621h0 abstractC0621h0, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4063e = abstractC0621h0;
        this.f4067i = new b(strArr.length);
        this.f4061c = map2;
        this.f4068j = new C0630m(abstractC0621h0);
        int length = strArr.length;
        this.f4060b = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr[i4];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4059a.put(lowerCase, Integer.valueOf(i4));
            String str2 = map.get(strArr[i4]);
            if (str2 != null) {
                this.f4060b[i4] = str2.toLowerCase(locale);
            } else {
                this.f4060b[i4] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f4059a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f4059a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    /* renamed from: c */
    private static void m3610c(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: d */
    private static void m3611d(InterfaceC3371b interfaceC3371b) {
        if (interfaceC3371b.mo3512v()) {
            interfaceC3371b.mo3501A();
        } else {
            interfaceC3371b.mo3506f();
        }
    }

    /* renamed from: l */
    private String[] m3612l(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4061c.containsKey(lowerCase)) {
                hashSet.addAll(this.f4061c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: o */
    private void m3613o(InterfaceC3371b interfaceC3371b, int i4) throws SQLException {
        interfaceC3371b.mo3508h("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i4 + ", 0)");
        String str = this.f4060b[i4];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4058n) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m3610c(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i4);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            interfaceC3371b.mo3508h(sb.toString());
        }
    }

    /* renamed from: p */
    private void m3614p(InterfaceC3371b interfaceC3371b, int i4) throws SQLException {
        String str = this.f4060b[i4];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4058n) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m3610c(sb, str, str2);
            interfaceC3371b.mo3508h(sb.toString());
        }
    }

    /* renamed from: s */
    private String[] m3615s(String[] strArr) {
        String[] strArrM3612l = m3612l(strArr);
        for (String str : strArrM3612l) {
            if (!this.f4059a.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return strArrM3612l;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void m3616a(c cVar) {
        d dVarMo8932f;
        String[] strArrM3612l = m3612l(cVar.f4078a);
        int[] iArr = new int[strArrM3612l.length];
        int length = strArrM3612l.length;
        for (int i4 = 0; i4 < length; i4++) {
            Integer num = this.f4059a.get(strArrM3612l[i4].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrM3612l[i4]);
            }
            iArr[i4] = num.intValue();
        }
        d dVar = new d(cVar, iArr, strArrM3612l);
        synchronized (this.f4069k) {
            dVarMo8932f = this.f4069k.mo8932f(cVar, dVar);
        }
        if (dVarMo8932f == null && this.f4067i.m3631b(iArr)) {
            m3627q();
        }
    }

    /* renamed from: b */
    public void m3617b(c cVar) {
        m3616a(new e(this, cVar));
    }

    /* renamed from: e */
    public <T> LiveData<T> m3618e(String[] strArr, boolean z3, Callable<T> callable) {
        return this.f4068j.m3606a(m3615s(strArr), z3, callable);
    }

    /* renamed from: f */
    boolean m3619f() {
        if (!this.f4063e.m3556v()) {
            return false;
        }
        if (!this.f4065g) {
            this.f4063e.m3549l().mo3483F();
        }
        if (this.f4065g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: g */
    void m3620g(InterfaceC3371b interfaceC3371b) {
        synchronized (this) {
            if (this.f4065g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            interfaceC3371b.mo3508h("PRAGMA temp_store = MEMORY;");
            interfaceC3371b.mo3508h("PRAGMA recursive_triggers='ON';");
            interfaceC3371b.mo3508h("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m3628r(interfaceC3371b);
            this.f4066h = interfaceC3371b.mo3509j("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f4065g = true;
        }
    }

    /* renamed from: h */
    public void m3621h(String... strArr) {
        synchronized (this.f4069k) {
            Iterator<Map.Entry<c, d>> it = this.f4069k.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().mo3635a()) {
                    next.getValue().m3637b(strArr);
                }
            }
        }
    }

    /* renamed from: i */
    void m3622i() {
        synchronized (this) {
            this.f4065g = false;
            this.f4067i.m3634e();
        }
    }

    /* renamed from: j */
    public void m3623j() {
        if (this.f4064f.compareAndSet(false, true)) {
            C0606a c0606a = this.f4062d;
            if (c0606a != null) {
                c0606a.m3479e();
            }
            this.f4063e.m3550m().execute(this.f4071m);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: k */
    public void m3624k(c cVar) {
        d dVarMo8933g;
        synchronized (this.f4069k) {
            dVarMo8933g = this.f4069k.mo8933g(cVar);
        }
        if (dVarMo8933g == null || !this.f4067i.m3632c(dVarMo8933g.f4079a)) {
            return;
        }
        m3627q();
    }

    /* renamed from: m */
    void m3625m(C0606a c0606a) {
        this.f4062d = c0606a;
        c0606a.m3482h(new Runnable() { // from class: androidx.room.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f4057a.m3622i();
            }
        });
    }

    /* renamed from: n */
    void m3626n(Context context, String str) {
        this.f4070l = new C0634p(context, str, this, this.f4063e.m3550m());
    }

    /* renamed from: q */
    void m3627q() {
        if (this.f4063e.m3556v()) {
            m3628r(this.f4063e.m3549l().mo3483F());
        }
    }

    /* renamed from: r */
    void m3628r(InterfaceC3371b interfaceC3371b) {
        if (interfaceC3371b.mo3510p()) {
            return;
        }
        while (true) {
            try {
                Lock lockM3547j = this.f4063e.m3547j();
                lockM3547j.lock();
                try {
                    int[] iArrM3630a = this.f4067i.m3630a();
                    if (iArrM3630a == null) {
                        return;
                    }
                    int length = iArrM3630a.length;
                    m3611d(interfaceC3371b);
                    for (int i4 = 0; i4 < length; i4++) {
                        try {
                            int i5 = iArrM3630a[i4];
                            if (i5 == 1) {
                                m3613o(interfaceC3371b, i4);
                            } else if (i5 == 2) {
                                m3614p(interfaceC3371b, i4);
                            }
                        } finally {
                        }
                    }
                    interfaceC3371b.mo3513x();
                    interfaceC3371b.mo3505e();
                    this.f4067i.m3633d();
                } finally {
                    lockM3547j.unlock();
                }
            } catch (SQLiteException | IllegalStateException e4) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
                return;
            }
        }
    }
}
