package coil3.disk;

import androidx.compose.material3.AbstractC1923c;
import androidx.navigation.C2861i;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlin.text.Regex;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC5995r;
import kotlinx.coroutines.AbstractC6014x;
import okio.BufferedSink;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p054e7.C5471c;
import p068g7.C5609e;
import p068g7.ExecutorC5608d;
import p075h6.InterfaceC5636h;
import p185v7.AbstractC6683l;

/* renamed from: coil3.disk.f */
/* loaded from: classes2.dex */
public final class C3288f implements AutoCloseable {

    /* renamed from: r */
    public static final Regex f1949r = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    public final Path f1950a;

    /* renamed from: b */
    public final long f1951b;

    /* renamed from: c */
    public final Path f1952c;

    /* renamed from: d */
    public final Path f1953d;

    /* renamed from: e */
    public final Path f1954e;

    /* renamed from: f */
    public final LinkedHashMap f1955f;

    /* renamed from: g */
    public final C5471c f1956g;

    /* renamed from: h */
    public final Object f1957h;

    /* renamed from: i */
    public long f1958i;

    /* renamed from: j */
    public int f1959j;

    /* renamed from: k */
    public BufferedSink f1960k;

    /* renamed from: l */
    public boolean f1961l;

    /* renamed from: m */
    public boolean f1962m;

    /* renamed from: n */
    public boolean f1963n;

    /* renamed from: o */
    public boolean f1964o;

    /* renamed from: p */
    public boolean f1965p;

    /* renamed from: q */
    public final C3287e f1966q;

    public C3288f(FileSystem fileSystem, Path path, InterfaceC5636h interfaceC5636h, long j7) {
        this.f1950a = path;
        this.f1951b = j7;
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1952c = path.resolve("journal");
        this.f1953d = path.resolve("journal.tmp");
        this.f1954e = path.resolve("journal.bkp");
        this.f1955f = new LinkedHashMap(0, 0.75f, true);
        InterfaceC5636h interfaceC5636hPlus = interfaceC5636h.plus(AbstractC6014x.m5632c());
        AbstractC5995r abstractC5995r = (AbstractC5995r) interfaceC5636h.get(AbstractC5995r.Key);
        if (abstractC5995r == null) {
            C5609e c5609e = AbstractC5896f0.f9343a;
            abstractC5995r = ExecutorC5608d.f8730a;
        }
        this.f1956g = AbstractC6014x.m5630a(interfaceC5636hPlus.plus(AbstractC5995r.limitedParallelism$default(abstractC5995r, 1, null, 2, null)));
        this.f1957h = new Object();
        this.f1966q = new C3287e(fileSystem);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0112 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0020, B:16:0x0030, B:24:0x003e, B:26:0x0056, B:28:0x0069, B:30:0x0079, B:32:0x0080, B:27:0x005c, B:36:0x00a0, B:38:0x00a7, B:41:0x00ac, B:43:0x00bd, B:46:0x00c2, B:51:0x00fe, B:53:0x0109, B:57:0x0112, B:47:0x00da, B:49:0x00ef, B:50:0x00fb, B:35:0x0090, B:60:0x0117, B:61:0x011e), top: B:64:0x0003 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2214a(coil3.disk.C3288f r10, coil3.disk.C3284b r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.C3288f.m2214a(coil3.disk.f, coil3.disk.b, boolean):void");
    }

    /* renamed from: m */
    public static void m2215m(String str) {
        if (!f1949r.matches(str)) {
            throw new IllegalArgumentException(AbstractC1923c.m1047k('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* renamed from: b */
    public final C3284b m2216b(String str) {
        synchronized (this.f1957h) {
            if (this.f1963n) {
                throw new IllegalStateException("cache is closed");
            }
            m2215m(str);
            m2218d();
            C3285c c3285c = (C3285c) this.f1955f.get(str);
            if ((c3285c != null ? c3285c.f1943g : null) != null) {
                return null;
            }
            if (c3285c != null && c3285c.f1944h != 0) {
                return null;
            }
            if (!this.f1964o && !this.f1965p) {
                BufferedSink bufferedSink = this.f1960k;
                AbstractC5830k.m5327d(bufferedSink);
                bufferedSink.writeUtf8("DIRTY");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.f1961l) {
                    return null;
                }
                if (c3285c == null) {
                    c3285c = new C3285c(this, str);
                    this.f1955f.put(str, c3285c);
                }
                C3284b c3284b = new C3284b(this, c3285c);
                c3285c.f1943g = c3284b;
                return c3284b;
            }
            m2219e();
            return null;
        }
    }

    /* renamed from: c */
    public final C3286d m2217c(String str) {
        C3286d c3286dM2213a;
        synchronized (this.f1957h) {
            if (this.f1963n) {
                throw new IllegalStateException("cache is closed");
            }
            m2215m(str);
            m2218d();
            C3285c c3285c = (C3285c) this.f1955f.get(str);
            if (c3285c != null && (c3286dM2213a = c3285c.m2213a()) != null) {
                boolean z8 = true;
                this.f1959j++;
                BufferedSink bufferedSink = this.f1960k;
                AbstractC5830k.m5327d(bufferedSink);
                bufferedSink.writeUtf8("READ");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.f1959j < 2000) {
                    z8 = false;
                }
                if (z8) {
                    m2219e();
                }
                return c3286dM2213a;
            }
            return null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f1957h) {
            try {
                if (this.f1962m && !this.f1963n) {
                    for (C3285c c3285c : (C3285c[]) this.f1955f.values().toArray(new C3285c[0])) {
                        C3284b c3284b = c3285c.f1943g;
                        if (c3284b != null) {
                            C3285c c3285c2 = (C3285c) c3284b.f1935c;
                            if (AbstractC5830k.m5325b(c3285c2.f1943g, c3284b)) {
                                c3285c2.f1942f = true;
                            }
                        }
                    }
                    m2224l();
                    AbstractC6014x.m5635f(this.f1956g, null);
                    BufferedSink bufferedSink = this.f1960k;
                    AbstractC5830k.m5327d(bufferedSink);
                    bufferedSink.close();
                    this.f1960k = null;
                    this.f1963n = true;
                    return;
                }
                this.f1963n = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m2218d() {
        synchronized (this.f1957h) {
            try {
                if (this.f1962m) {
                    return;
                }
                this.f1966q.delete(this.f1953d);
                if (this.f1966q.exists(this.f1954e)) {
                    if (this.f1966q.exists(this.f1952c)) {
                        this.f1966q.delete(this.f1954e);
                    } else {
                        this.f1966q.atomicMove(this.f1954e, this.f1952c);
                    }
                }
                if (this.f1966q.exists(this.f1952c)) {
                    try {
                        m2221g();
                        m2220f();
                        this.f1962m = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            AbstractC6683l.m6367g(this.f1966q, this.f1950a);
                            this.f1963n = false;
                        } catch (Throwable th) {
                            this.f1963n = false;
                            throw th;
                        }
                    }
                }
                m2225n();
                this.f1962m = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m2219e() {
        AbstractC6014x.m5651v(this.f1956g, null, null, new DiskLruCache$launchCleanup$1(this, null), 3);
    }

    /* renamed from: f */
    public final void m2220f() throws IOException {
        Iterator it = this.f1955f.values().iterator();
        long j7 = 0;
        while (it.hasNext()) {
            C3285c c3285c = (C3285c) it.next();
            int i = 0;
            if (c3285c.f1943g == null) {
                while (i < 2) {
                    j7 += c3285c.f1938b[i];
                    i++;
                }
            } else {
                c3285c.f1943g = null;
                while (i < 2) {
                    Path path = (Path) c3285c.f1939c.get(i);
                    C3287e c3287e = this.f1966q;
                    c3287e.delete(path);
                    c3287e.delete((Path) c3285c.f1940d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f1958i = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2221g() throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            coil3.disk.e r2 = r11.f1966q
            okio.Path r3 = r11.f1952c
            okio.Source r4 = r2.source(r3)
            okio.BufferedSource r4 = okio.Okio.buffer(r4)
            java.lang.String r5 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r9 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r10 = "libcore.io.DiskLruCache"
            boolean r10 = r10.equals(r5)     // Catch: java.lang.Throwable -> L5c
            if (r10 == 0) goto L8d
            java.lang.String r10 = "1"
            boolean r10 = r10.equals(r6)     // Catch: java.lang.Throwable -> L5c
            if (r10 == 0) goto L8d
            r10 = 3
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L5c
            boolean r10 = kotlin.jvm.internal.AbstractC5830k.m5325b(r10, r7)     // Catch: java.lang.Throwable -> L5c
            if (r10 == 0) goto L8d
            r10 = 2
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L5c
            boolean r10 = kotlin.jvm.internal.AbstractC5830k.m5325b(r10, r8)     // Catch: java.lang.Throwable -> L5c
            if (r10 == 0) goto L8d
            int r10 = r9.length()     // Catch: java.lang.Throwable -> L5c
            if (r10 > 0) goto L8d
            r0 = 0
        L52:
            java.lang.String r1 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            r11.m2222h(r1)     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            int r0 = r0 + 1
            goto L52
        L5c:
            r0 = move-exception
            goto Lbc
        L5e:
            java.util.LinkedHashMap r1 = r11.f1955f     // Catch: java.lang.Throwable -> L5c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 - r1
            r11.f1959j = r0     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r4.exhausted()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L71
            r11.m2225n()     // Catch: java.lang.Throwable -> L5c
            goto L86
        L71:
            okio.Sink r0 = r2.appendingSink(r3)     // Catch: java.lang.Throwable -> L5c
            coil3.disk.g r1 = new coil3.disk.g     // Catch: java.lang.Throwable -> L5c
            androidx.navigation.i r2 = new androidx.navigation.i     // Catch: java.lang.Throwable -> L5c
            r3 = 2
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> L5c
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L5c
            okio.BufferedSink r0 = okio.Okio.buffer(r1)     // Catch: java.lang.Throwable -> L5c
            r11.f1960k = r0     // Catch: java.lang.Throwable -> L5c
        L86:
            r4.close()     // Catch: java.lang.Throwable -> L8b
            r0 = 0
            goto Lc6
        L8b:
            r0 = move-exception
            goto Lc6
        L8d:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L5c
            r3.append(r5)     // Catch: java.lang.Throwable -> L5c
            r3.append(r0)     // Catch: java.lang.Throwable -> L5c
            r3.append(r6)     // Catch: java.lang.Throwable -> L5c
            r3.append(r0)     // Catch: java.lang.Throwable -> L5c
            r3.append(r7)     // Catch: java.lang.Throwable -> L5c
            r3.append(r0)     // Catch: java.lang.Throwable -> L5c
            r3.append(r8)     // Catch: java.lang.Throwable -> L5c
            r3.append(r0)     // Catch: java.lang.Throwable -> L5c
            r3.append(r9)     // Catch: java.lang.Throwable -> L5c
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            throw r2     // Catch: java.lang.Throwable -> L5c
        Lbc:
            if (r4 == 0) goto Lc6
            r4.close()     // Catch: java.lang.Throwable -> Lc2
            goto Lc6
        Lc2:
            r1 = move-exception
            kotlin.collections.AbstractC5806u.m5266e(r0, r1)
        Lc6:
            if (r0 != 0) goto Lc9
            return
        Lc9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.C3288f.m2221g():void");
    }

    /* renamed from: h */
    public final void m2222h(String str) throws IOException {
        String strSubstring;
        int iM5379M = AbstractC5855p.m5379M(str, ' ', 0, 6);
        if (iM5379M == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iM5379M + 1;
        int iM5379M2 = AbstractC5855p.m5379M(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f1955f;
        if (iM5379M2 == -1) {
            strSubstring = str.substring(i);
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
            if (iM5379M == 6 && AbstractC5862w.m5409C(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM5379M2);
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
        }
        Object c3285c = linkedHashMap.get(strSubstring);
        if (c3285c == null) {
            c3285c = new C3285c(this, strSubstring);
            linkedHashMap.put(strSubstring, c3285c);
        }
        C3285c c3285c2 = (C3285c) c3285c;
        if (iM5379M2 == -1 || iM5379M != 5 || !AbstractC5862w.m5409C(str, "CLEAN", false)) {
            if (iM5379M2 == -1 && iM5379M == 5 && AbstractC5862w.m5409C(str, "DIRTY", false)) {
                c3285c2.f1943g = new C3284b(this, c3285c2);
                return;
            } else {
                if (iM5379M2 != -1 || iM5379M != 4 || !AbstractC5862w.m5409C(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iM5379M2 + 1);
        AbstractC5830k.m5329f(strSubstring2, "substring(...)");
        List listM5393a0 = AbstractC5855p.m5393a0(strSubstring2, new char[]{' '});
        c3285c2.f1941e = true;
        c3285c2.f1943g = null;
        if (listM5393a0.size() != 2) {
            throw new IOException("unexpected journal line: " + listM5393a0);
        }
        try {
            int size = listM5393a0.size();
            for (int i8 = 0; i8 < size; i8++) {
                c3285c2.f1938b[i8] = Long.parseLong((String) listM5393a0.get(i8));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listM5393a0);
        }
    }

    /* renamed from: k */
    public final void m2223k(C3285c c3285c) {
        BufferedSink bufferedSink;
        int i = c3285c.f1944h;
        String str = c3285c.f1937a;
        if (i > 0 && (bufferedSink = this.f1960k) != null) {
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(str);
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (c3285c.f1944h > 0 || c3285c.f1943g != null) {
            c3285c.f1942f = true;
            return;
        }
        for (int i8 = 0; i8 < 2; i8++) {
            this.f1966q.delete((Path) c3285c.f1939c.get(i8));
            long j7 = this.f1958i;
            long[] jArr = c3285c.f1938b;
            this.f1958i = j7 - jArr[i8];
            jArr[i8] = 0;
        }
        this.f1959j++;
        BufferedSink bufferedSink2 = this.f1960k;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8("REMOVE");
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(str);
            bufferedSink2.writeByte(10);
            bufferedSink2.flush();
        }
        this.f1955f.remove(str);
        if (this.f1959j >= 2000) {
            m2219e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        m2223k(r1);
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2224l() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f1958i
            long r2 = r4.f1951b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f1955f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            coil3.disk.c r1 = (coil3.disk.C3285c) r1
            boolean r2 = r1.f1942f
            if (r2 != 0) goto L12
            r4.m2223k(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f1964o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.C3288f.m2224l():void");
    }

    /* renamed from: n */
    public final void m2225n() {
        Throwable th;
        synchronized (this.f1957h) {
            try {
                BufferedSink bufferedSink = this.f1960k;
                if (bufferedSink != null) {
                    bufferedSink.close();
                }
                BufferedSink bufferedSinkBuffer = Okio.buffer(this.f1966q.sink(this.f1953d, false));
                try {
                    bufferedSinkBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                    bufferedSinkBuffer.writeUtf8("1").writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(3).writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(2).writeByte(10);
                    bufferedSinkBuffer.writeByte(10);
                    for (C3285c c3285c : this.f1955f.values()) {
                        if (c3285c.f1943g != null) {
                            bufferedSinkBuffer.writeUtf8("DIRTY");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(c3285c.f1937a);
                            bufferedSinkBuffer.writeByte(10);
                        } else {
                            bufferedSinkBuffer.writeUtf8("CLEAN");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(c3285c.f1937a);
                            for (long j7 : c3285c.f1938b) {
                                bufferedSinkBuffer.writeByte(32).writeDecimalLong(j7);
                            }
                            bufferedSinkBuffer.writeByte(10);
                        }
                    }
                    try {
                        bufferedSinkBuffer.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    if (bufferedSinkBuffer != null) {
                        try {
                            bufferedSinkBuffer.close();
                        } catch (Throwable th4) {
                            AbstractC5806u.m5266e(th3, th4);
                        }
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                if (this.f1966q.exists(this.f1952c)) {
                    this.f1966q.atomicMove(this.f1952c, this.f1954e);
                    this.f1966q.atomicMove(this.f1953d, this.f1952c);
                    this.f1966q.delete(this.f1954e);
                } else {
                    this.f1966q.atomicMove(this.f1953d, this.f1952c);
                }
                this.f1960k = Okio.buffer(new C3289g(this.f1966q.appendingSink(this.f1952c), new C2861i(this, 2)));
                this.f1959j = 0;
                this.f1961l = false;
                this.f1965p = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
