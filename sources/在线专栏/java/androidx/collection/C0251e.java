package androidx.collection;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* renamed from: androidx.collection.e */
/* loaded from: classes.dex */
public class C0251e<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f1300a;

    /* renamed from: b */
    private int f1301b;

    /* renamed from: c */
    private int f1302c;

    /* renamed from: d */
    private int f1303d;

    /* renamed from: e */
    private int f1304e;

    /* renamed from: f */
    private int f1305f;

    /* renamed from: g */
    private int f1306g;

    /* renamed from: h */
    private int f1307h;

    public C0251e(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1302c = i4;
        this.f1300a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: e */
    private int m1122e(K k4, V v3) {
        int iM1127f = m1127f(k4, v3);
        if (iM1127f >= 0) {
            return iM1127f;
        }
        throw new IllegalStateException("Negative size: " + k4 + "=" + v3);
    }

    /* renamed from: a */
    protected V m1123a(K k4) {
        return null;
    }

    /* renamed from: b */
    protected void m1124b(boolean z3, K k4, V v3, V v4) {
    }

    /* renamed from: c */
    public final V m1125c(K k4) {
        V v3;
        Objects.requireNonNull(k4, "key == null");
        synchronized (this) {
            V v4 = this.f1300a.get(k4);
            if (v4 != null) {
                this.f1306g++;
                return v4;
            }
            this.f1307h++;
            V vM1123a = m1123a(k4);
            if (vM1123a == null) {
                return null;
            }
            synchronized (this) {
                this.f1304e++;
                v3 = (V) this.f1300a.put(k4, vM1123a);
                if (v3 != null) {
                    this.f1300a.put(k4, v3);
                } else {
                    this.f1301b += m1122e(k4, vM1123a);
                }
            }
            if (v3 != null) {
                m1124b(false, k4, vM1123a, v3);
                return v3;
            }
            m1128g(this.f1302c);
            return vM1123a;
        }
    }

    /* renamed from: d */
    public final V m1126d(K k4, V v3) {
        V vPut;
        if (k4 == null || v3 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1303d++;
            this.f1301b += m1122e(k4, v3);
            vPut = this.f1300a.put(k4, v3);
            if (vPut != null) {
                this.f1301b -= m1122e(k4, vPut);
            }
        }
        if (vPut != null) {
            m1124b(false, k4, vPut, v3);
        }
        m1128g(this.f1302c);
        return vPut;
    }

    /* renamed from: f */
    protected int m1127f(K k4, V v3) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1128g(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f1301b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f1300a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f1301b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f1301b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f1300a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f1300a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f1300a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1301b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m1122e(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f1301b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1305f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f1305f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.m1124b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C0251e.m1128g(int):void");
    }

    public final synchronized String toString() {
        int i4;
        int i5;
        i4 = this.f1306g;
        i5 = this.f1307h + i4;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1302c), Integer.valueOf(this.f1306g), Integer.valueOf(this.f1307h), Integer.valueOf(i5 != 0 ? (i4 * 100) / i5 : 0));
    }
}
