package p000a.p021e;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* renamed from: a.e.f */
/* loaded from: classes.dex */
public class C0134f<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f922a;

    /* renamed from: b */
    public int f923b;

    /* renamed from: c */
    public int f924c;

    /* renamed from: d */
    public int f925d;

    /* renamed from: e */
    public int f926e;

    /* renamed from: f */
    public int f927f;

    /* renamed from: g */
    public int f928g;

    public C0134f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f924c = i;
        this.f922a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: a */
    public final V m500a(K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f922a.get(k);
            if (v != null) {
                this.f927f++;
                return v;
            }
            this.f928g++;
            return null;
        }
    }

    /* renamed from: b */
    public final V m501b(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f925d++;
            this.f923b++;
            vPut = this.f922a.put(k, v);
            if (vPut != null) {
                this.f923b--;
            }
        }
        m502c(this.f924c);
        return vPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m502c(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f923b     // Catch: java.lang.Throwable -> L69
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<K, V> r0 = r2.f922a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L11
            int r0 = r2.f923b     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.f923b     // Catch: java.lang.Throwable -> L69
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<K, V> r0 = r2.f922a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r2.f922a     // Catch: java.lang.Throwable -> L69
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L69
            r0.getValue()     // Catch: java.lang.Throwable -> L69
            java.util.LinkedHashMap<K, V> r0 = r2.f922a     // Catch: java.lang.Throwable -> L69
            r0.remove(r1)     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f923b     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + (-1)
            r2.f923b = r0     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f926e     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + 1
            r2.f926e = r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L0
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            return
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L69
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L69
        L69:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p021e.C0134f.m502c(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f927f;
        i2 = this.f928g + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f924c), Integer.valueOf(this.f927f), Integer.valueOf(this.f928g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
