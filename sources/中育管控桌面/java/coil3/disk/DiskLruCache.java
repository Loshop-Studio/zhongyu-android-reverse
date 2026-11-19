package coil3.disk;

import coil3.disk.DiskLruCache;
import coil3.util.AbstractC4594c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okio.BufferedSink;
import okio.FileSystem;
import okio.ForwardingFileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import p023c0.AbstractC4457b;
import p023c0.AbstractC4459d;
import p023c0.AbstractC4464i;
import p117o.C7487b;

/* loaded from: classes3.dex */
public final class DiskLruCache implements AutoCloseable {

    /* renamed from: t */
    public static final C4566a f1637t = new C4566a(null);

    /* renamed from: u */
    public static final Regex f1638u = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    public final Path f1639a;

    /* renamed from: b */
    public final long f1640b;

    /* renamed from: c */
    public final int f1641c;

    /* renamed from: d */
    public final int f1642d;

    /* renamed from: e */
    public final Path f1643e;

    /* renamed from: f */
    public final Path f1644f;

    /* renamed from: g */
    public final Path f1645g;

    /* renamed from: h */
    public final Map f1646h;

    /* renamed from: i */
    public final CoroutineScope f1647i;

    /* renamed from: j */
    public final Object f1648j;

    /* renamed from: k */
    public long f1649k;

    /* renamed from: l */
    public int f1650l;

    /* renamed from: m */
    public BufferedSink f1651m;

    /* renamed from: n */
    public boolean f1652n;

    /* renamed from: o */
    public boolean f1653o;

    /* renamed from: p */
    public boolean f1654p;

    /* renamed from: q */
    public boolean f1655q;

    /* renamed from: r */
    public boolean f1656r;

    /* renamed from: s */
    public final C4570e f1657s;

    /* renamed from: coil3.disk.DiskLruCache$a */
    public static final class C4566a {
        public /* synthetic */ C4566a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C4566a() {
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$b */
    public final class C4567b {

        /* renamed from: a */
        public final C4568c f1658a;

        /* renamed from: b */
        public boolean f1659b;

        /* renamed from: c */
        public final boolean[] f1660c;

        public C4567b(C4568c c4568c) {
            this.f1658a = c4568c;
            this.f1660c = new boolean[DiskLruCache.this.f1642d];
        }

        /* renamed from: a */
        public final void m1838a() {
            m1841d(false);
        }

        /* renamed from: b */
        public final void m1839b() {
            m1841d(true);
        }

        /* renamed from: c */
        public final C4569d m1840c() {
            C4569d c4569dM1835x;
            Object obj = DiskLruCache.this.f1648j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                m1839b();
                c4569dM1835x = diskLruCache.m1835x(this.f1658a.m1849d());
            }
            return c4569dM1835x;
        }

        /* renamed from: d */
        public final void m1841d(boolean z6) {
            Object obj = DiskLruCache.this.f1648j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                try {
                    if (this.f1659b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.areEqual(this.f1658a.m1847b(), this)) {
                        diskLruCache.m1832u(this, z6);
                    }
                    this.f1659b = true;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: e */
        public final void m1842e() {
            if (Intrinsics.areEqual(this.f1658a.m1847b(), this)) {
                this.f1658a.m1858m(true);
            }
        }

        /* renamed from: f */
        public final Path m1843f(int i6) {
            Path path;
            Object obj = DiskLruCache.this.f1648j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                if (this.f1659b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f1660c[i6] = true;
                Object obj2 = this.f1658a.m1848c().get(i6);
                AbstractC4464i.m1541b(diskLruCache.f1657s, (Path) obj2, false, 2, null);
                path = (Path) obj2;
            }
            return path;
        }

        /* renamed from: g */
        public final C4568c m1844g() {
            return this.f1658a;
        }

        /* renamed from: h */
        public final boolean[] m1845h() {
            return this.f1660c;
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$c */
    public final class C4568c {

        /* renamed from: a */
        public final String f1662a;

        /* renamed from: b */
        public final long[] f1663b;

        /* renamed from: c */
        public final ArrayList f1664c;

        /* renamed from: d */
        public final ArrayList f1665d;

        /* renamed from: e */
        public boolean f1666e;

        /* renamed from: f */
        public boolean f1667f;

        /* renamed from: g */
        public C4567b f1668g;

        /* renamed from: h */
        public int f1669h;

        public C4568c(String str) {
            this.f1662a = str;
            this.f1663b = new long[DiskLruCache.this.f1642d];
            this.f1664c = new ArrayList(DiskLruCache.this.f1642d);
            this.f1665d = new ArrayList(DiskLruCache.this.f1642d);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i6 = DiskLruCache.this.f1642d;
            for (int i7 = 0; i7 < i6; i7++) {
                sb.append(i7);
                this.f1664c.add(DiskLruCache.this.f1639a.resolve(sb.toString()));
                sb.append(".tmp");
                this.f1665d.add(DiskLruCache.this.f1639a.resolve(sb.toString()));
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public final ArrayList m1846a() {
            return this.f1664c;
        }

        /* renamed from: b */
        public final C4567b m1847b() {
            return this.f1668g;
        }

        /* renamed from: c */
        public final ArrayList m1848c() {
            return this.f1665d;
        }

        /* renamed from: d */
        public final String m1849d() {
            return this.f1662a;
        }

        /* renamed from: e */
        public final long[] m1850e() {
            return this.f1663b;
        }

        /* renamed from: f */
        public final int m1851f() {
            return this.f1669h;
        }

        /* renamed from: g */
        public final boolean m1852g() {
            return this.f1666e;
        }

        /* renamed from: h */
        public final boolean m1853h() {
            return this.f1667f;
        }

        /* renamed from: i */
        public final void m1854i(C4567b c4567b) {
            this.f1668g = c4567b;
        }

        /* renamed from: j */
        public final void m1855j(List list) throws IOException {
            if (list.size() != DiskLruCache.this.f1642d) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    this.f1663b[i6] = Long.parseLong((String) list.get(i6));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        /* renamed from: k */
        public final void m1856k(int i6) {
            this.f1669h = i6;
        }

        /* renamed from: l */
        public final void m1857l(boolean z6) {
            this.f1666e = z6;
        }

        /* renamed from: m */
        public final void m1858m(boolean z6) {
            this.f1667f = z6;
        }

        /* renamed from: n */
        public final C4569d m1859n() {
            if (!this.f1666e || this.f1668g != null || this.f1667f) {
                return null;
            }
            ArrayList arrayList = this.f1664c;
            DiskLruCache diskLruCache = DiskLruCache.this;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (!diskLruCache.f1657s.exists((Path) arrayList.get(i6))) {
                    try {
                        diskLruCache.m1826H(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f1669h++;
            return DiskLruCache.this.new C4569d(this);
        }

        /* renamed from: o */
        public final void m1860o(BufferedSink bufferedSink) {
            for (long j6 : this.f1663b) {
                bufferedSink.writeByte(32).writeDecimalLong(j6);
            }
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$d */
    public final class C4569d implements AutoCloseable {

        /* renamed from: a */
        public final C4568c f1671a;

        /* renamed from: b */
        public boolean f1672b;

        public C4569d(C4568c c4568c) {
            this.f1671a = c4568c;
        }

        /* renamed from: a */
        public final C4567b m1861a() {
            C4567b c4567bM1834w;
            Object obj = DiskLruCache.this.f1648j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                close();
                c4567bM1834w = diskLruCache.m1834w(this.f1671a.m1849d());
            }
            return c4567bM1834w;
        }

        /* renamed from: c */
        public final Path m1862c(int i6) {
            if (this.f1672b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path) this.f1671a.m1846a().get(i6);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.f1672b) {
                return;
            }
            this.f1672b = true;
            Object obj = DiskLruCache.this.f1648j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                try {
                    this.f1671a.m1856k(r2.m1851f() - 1);
                    if (this.f1671a.m1851f() == 0 && this.f1671a.m1853h()) {
                        diskLruCache.m1826H(this.f1671a);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$e */
    public static final class C4570e extends ForwardingFileSystem {
        public C4570e(FileSystem fileSystem) {
            super(fileSystem);
        }

        @Override // okio.ForwardingFileSystem, okio.FileSystem
        public Sink sink(Path path, boolean z6) {
            Path pathParent = path.parent();
            if (pathParent != null) {
                createDirectories(pathParent);
            }
            return super.sink(path, z6);
        }
    }

    public DiskLruCache(FileSystem fileSystem, Path path, CoroutineContext coroutineContext, long j6, int i6, int i7) {
        this.f1639a = path;
        this.f1640b = j6;
        this.f1641c = i6;
        this.f1642d = i7;
        if (j6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i7 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f1643e = path.resolve("journal");
        this.f1644f = path.resolve("journal.tmp");
        this.f1645g = path.resolve("journal.bkp");
        this.f1646h = AbstractC4457b.m1525b(0, 0.0f, 3, null);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        CoroutineDispatcher coroutineDispatcherM2042j = AbstractC4594c.m2042j(coroutineContext);
        this.f1647i = CoroutineScopeKt.CoroutineScope(coroutineContextPlus.plus(CoroutineDispatcher.limitedParallelism$default(coroutineDispatcherM2042j == null ? AbstractC4459d.m1535a() : coroutineDispatcherM2042j, 1, null, 2, null)));
        this.f1648j = new Object();
        this.f1657s = new C4570e(fileSystem);
    }

    /* renamed from: C */
    public static final Unit m1804C(DiskLruCache diskLruCache, IOException iOException) {
        diskLruCache.f1652n = true;
        return Unit.INSTANCE;
    }

    /* renamed from: A */
    public final void m1820A() {
        BuildersKt__Builders_commonKt.launch$default(this.f1647i, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
    }

    /* renamed from: B */
    public final BufferedSink m1821B() {
        return Okio.buffer(new C7487b(this.f1657s.appendingSink(this.f1643e), new Function1() { // from class: o.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DiskLruCache.m1804C(this.f9665a, (IOException) obj);
            }
        }));
    }

    /* renamed from: D */
    public final void m1822D() {
        Iterator it = this.f1646h.values().iterator();
        long j6 = 0;
        while (it.hasNext()) {
            C4568c c4568c = (C4568c) it.next();
            int i6 = 0;
            if (c4568c.m1847b() == null) {
                int i7 = this.f1642d;
                while (i6 < i7) {
                    j6 += c4568c.m1850e()[i6];
                    i6++;
                }
            } else {
                c4568c.m1854i(null);
                int i8 = this.f1642d;
                while (i6 < i8) {
                    this.f1657s.delete((Path) c4568c.m1846a().get(i6));
                    this.f1657s.delete((Path) c4568c.m1848c().get(i6));
                    i6++;
                }
                it.remove();
            }
        }
        this.f1649k = j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1823E() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            coil3.disk.DiskLruCache$e r1 = r10.f1657s
            okio.Path r2 = r10.f1643e
            okio.Source r1 = r1.source(r2)
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            java.lang.String r7 = "1"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r3)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r10.f1641c     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r4)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r10.f1642d     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r5)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L5b
            if (r7 > 0) goto L82
            r0 = 0
        L51:
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            r10.m1824F(r2)     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            int r0 = r0 + 1
            goto L51
        L5b:
            r0 = move-exception
            goto Lb6
        L5d:
            java.util.Map r2 = r10.f1646h     // Catch: java.lang.Throwable -> L5b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5b
            int r0 = r0 - r2
            r10.f1650l = r0     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1.exhausted()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L70
            r10.m1830L()     // Catch: java.lang.Throwable -> L5b
            goto L76
        L70:
            okio.BufferedSink r0 = r10.m1821B()     // Catch: java.lang.Throwable -> L5b
            r10.f1651m = r0     // Catch: java.lang.Throwable -> L5b
        L76:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L80
            r1.close()     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r0 = move-exception
            goto Lc0
        L80:
            r0 = 0
            goto Lc0
        L82:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r8.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r9 = "unexpected journal header: ["
            r8.append(r9)     // Catch: java.lang.Throwable -> L5b
            r8.append(r2)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r3)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r4)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r5)     // Catch: java.lang.Throwable -> L5b
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            r8.append(r6)     // Catch: java.lang.Throwable -> L5b
            r0 = 93
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            throw r7     // Catch: java.lang.Throwable -> L5b
        Lb6:
            if (r1 == 0) goto Lc0
            r1.close()     // Catch: java.lang.Throwable -> Lbc
            goto Lc0
        Lbc:
            r1 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r0, r1)
        Lc0:
            if (r0 != 0) goto Lc3
            return
        Lc3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.DiskLruCache.m1823E():void");
    }

    /* renamed from: F */
    public final void m1824F(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i6 = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ' ', i6, false, 4, (Object) null);
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (iIndexOf$default == 6 && StringsKt.startsWith$default(str, "REMOVE", false, 2, (Object) null)) {
                this.f1646h.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i6, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        Map map = this.f1646h;
        Object c4568c = map.get(strSubstring);
        if (c4568c == null) {
            c4568c = new C4568c(strSubstring);
            map.put(strSubstring, c4568c);
        }
        C4568c c4568c2 = (C4568c) c4568c;
        if (iIndexOf$default2 != -1 && iIndexOf$default == 5 && StringsKt.startsWith$default(str, "CLEAN", false, 2, (Object) null)) {
            String strSubstring2 = str.substring(iIndexOf$default2 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            List listSplit$default = StringsKt.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
            c4568c2.m1857l(true);
            c4568c2.m1854i(null);
            c4568c2.m1855j(listSplit$default);
            return;
        }
        if (iIndexOf$default2 == -1 && iIndexOf$default == 5 && StringsKt.startsWith$default(str, "DIRTY", false, 2, (Object) null)) {
            c4568c2.m1854i(new C4567b(c4568c2));
            return;
        }
        if (iIndexOf$default2 == -1 && iIndexOf$default == 4 && StringsKt.startsWith$default(str, "READ", false, 2, (Object) null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: G */
    public final boolean m1825G(String str) {
        synchronized (this.f1648j) {
            m1831t();
            m1829K(str);
            m1836y();
            C4568c c4568c = (C4568c) this.f1646h.get(str);
            if (c4568c == null) {
                return false;
            }
            boolean zM1826H = m1826H(c4568c);
            if (zM1826H && this.f1649k <= this.f1640b) {
                this.f1655q = false;
            }
            return zM1826H;
        }
    }

    /* renamed from: H */
    public final boolean m1826H(C4568c c4568c) {
        BufferedSink bufferedSink;
        if (c4568c.m1851f() > 0 && (bufferedSink = this.f1651m) != null) {
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(c4568c.m1849d());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (c4568c.m1851f() > 0 || c4568c.m1847b() != null) {
            c4568c.m1858m(true);
            return true;
        }
        int i6 = this.f1642d;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f1657s.delete((Path) c4568c.m1846a().get(i7));
            this.f1649k -= c4568c.m1850e()[i7];
            c4568c.m1850e()[i7] = 0;
        }
        this.f1650l++;
        BufferedSink bufferedSink2 = this.f1651m;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8("REMOVE");
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(c4568c.m1849d());
            bufferedSink2.writeByte(10);
            bufferedSink2.flush();
        }
        this.f1646h.remove(c4568c.m1849d());
        if (m1837z()) {
            m1820A();
        }
        return true;
    }

    /* renamed from: I */
    public final boolean m1827I() {
        for (C4568c c4568c : this.f1646h.values()) {
            if (!c4568c.m1853h()) {
                m1826H(c4568c);
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final void m1828J() {
        while (this.f1649k > this.f1640b) {
            if (!m1827I()) {
                return;
            }
        }
        this.f1655q = false;
    }

    /* renamed from: K */
    public final void m1829K(String str) {
        if (f1638u.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + Typography.quote).toString());
    }

    /* renamed from: L */
    public final void m1830L() {
        Throwable th;
        synchronized (this.f1648j) {
            try {
                BufferedSink bufferedSink = this.f1651m;
                if (bufferedSink != null) {
                    bufferedSink.close();
                }
                BufferedSink bufferedSinkBuffer = Okio.buffer(this.f1657s.sink(this.f1644f, false));
                try {
                    bufferedSinkBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                    bufferedSinkBuffer.writeUtf8("1").writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(this.f1641c).writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(this.f1642d).writeByte(10);
                    bufferedSinkBuffer.writeByte(10);
                    for (C4568c c4568c : this.f1646h.values()) {
                        if (c4568c.m1847b() != null) {
                            bufferedSinkBuffer.writeUtf8("DIRTY");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(c4568c.m1849d());
                            bufferedSinkBuffer.writeByte(10);
                        } else {
                            bufferedSinkBuffer.writeUtf8("CLEAN");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(c4568c.m1849d());
                            c4568c.m1860o(bufferedSinkBuffer);
                            bufferedSinkBuffer.writeByte(10);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    if (bufferedSinkBuffer != null) {
                        try {
                            bufferedSinkBuffer.close();
                            th = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        th = null;
                    }
                } catch (Throwable th3) {
                    if (bufferedSinkBuffer != null) {
                        try {
                            bufferedSinkBuffer.close();
                        } catch (Throwable th4) {
                            ExceptionsKt.addSuppressed(th3, th4);
                        }
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                if (this.f1657s.exists(this.f1643e)) {
                    this.f1657s.atomicMove(this.f1643e, this.f1645g);
                    this.f1657s.atomicMove(this.f1644f, this.f1643e);
                    this.f1657s.delete(this.f1645g);
                } else {
                    this.f1657s.atomicMove(this.f1644f, this.f1643e);
                }
                this.f1651m = m1821B();
                this.f1650l = 0;
                this.f1652n = false;
                this.f1656r = false;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f1648j) {
            try {
                if (this.f1653o && !this.f1654p) {
                    for (C4568c c4568c : (C4568c[]) this.f1646h.values().toArray(new C4568c[0])) {
                        C4567b c4567bM1847b = c4568c.m1847b();
                        if (c4567bM1847b != null) {
                            c4567bM1847b.m1842e();
                        }
                    }
                    m1828J();
                    CoroutineScopeKt.cancel$default(this.f1647i, null, 1, null);
                    BufferedSink bufferedSink = this.f1651m;
                    Intrinsics.checkNotNull(bufferedSink);
                    bufferedSink.close();
                    this.f1651m = null;
                    this.f1654p = true;
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                this.f1654p = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: t */
    public final void m1831t() {
        if (this.f1654p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: u */
    public final void m1832u(C4567b c4567b, boolean z6) {
        synchronized (this.f1648j) {
            C4568c c4568cM1844g = c4567b.m1844g();
            if (!Intrinsics.areEqual(c4568cM1844g.m1847b(), c4567b)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z6 || c4568cM1844g.m1853h()) {
                int i6 = this.f1642d;
                for (int i7 = 0; i7 < i6; i7++) {
                    this.f1657s.delete((Path) c4568cM1844g.m1848c().get(i7));
                }
            } else {
                int i8 = this.f1642d;
                for (int i9 = 0; i9 < i8; i9++) {
                    if (c4567b.m1845h()[i9] && !this.f1657s.exists((Path) c4568cM1844g.m1848c().get(i9))) {
                        c4567b.m1838a();
                        return;
                    }
                }
                int i10 = this.f1642d;
                for (int i11 = 0; i11 < i10; i11++) {
                    Path path = (Path) c4568cM1844g.m1848c().get(i11);
                    Path path2 = (Path) c4568cM1844g.m1846a().get(i11);
                    if (this.f1657s.exists(path)) {
                        this.f1657s.atomicMove(path, path2);
                    } else {
                        AbstractC4464i.m1541b(this.f1657s, (Path) c4568cM1844g.m1846a().get(i11), false, 2, null);
                    }
                    long j6 = c4568cM1844g.m1850e()[i11];
                    Long size = this.f1657s.metadata(path2).getSize();
                    long jLongValue = size != null ? size.longValue() : 0L;
                    c4568cM1844g.m1850e()[i11] = jLongValue;
                    this.f1649k = (this.f1649k - j6) + jLongValue;
                }
            }
            c4568cM1844g.m1854i(null);
            if (c4568cM1844g.m1853h()) {
                m1826H(c4568cM1844g);
                return;
            }
            this.f1650l++;
            BufferedSink bufferedSink = this.f1651m;
            Intrinsics.checkNotNull(bufferedSink);
            if (z6 || c4568cM1844g.m1852g()) {
                c4568cM1844g.m1857l(true);
                bufferedSink.writeUtf8("CLEAN");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(c4568cM1844g.m1849d());
                c4568cM1844g.m1860o(bufferedSink);
                bufferedSink.writeByte(10);
            } else {
                this.f1646h.remove(c4568cM1844g.m1849d());
                bufferedSink.writeUtf8("REMOVE");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(c4568cM1844g.m1849d());
                bufferedSink.writeByte(10);
            }
            bufferedSink.flush();
            if (this.f1649k > this.f1640b || m1837z()) {
                m1820A();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: v */
    public final void m1833v() throws IOException {
        close();
        AbstractC4464i.m1542c(this.f1657s, this.f1639a);
    }

    /* renamed from: w */
    public final C4567b m1834w(String str) {
        synchronized (this.f1648j) {
            m1831t();
            m1829K(str);
            m1836y();
            C4568c c4568c = (C4568c) this.f1646h.get(str);
            if ((c4568c != null ? c4568c.m1847b() : null) != null) {
                return null;
            }
            if (c4568c != null && c4568c.m1851f() != 0) {
                return null;
            }
            if (!this.f1655q && !this.f1656r) {
                BufferedSink bufferedSink = this.f1651m;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.writeUtf8("DIRTY");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.f1652n) {
                    return null;
                }
                if (c4568c == null) {
                    c4568c = new C4568c(str);
                    this.f1646h.put(str, c4568c);
                }
                C4567b c4567b = new C4567b(c4568c);
                c4568c.m1854i(c4567b);
                return c4567b;
            }
            m1820A();
            return null;
        }
    }

    /* renamed from: x */
    public final C4569d m1835x(String str) {
        C4569d c4569dM1859n;
        synchronized (this.f1648j) {
            m1831t();
            m1829K(str);
            m1836y();
            C4568c c4568c = (C4568c) this.f1646h.get(str);
            if (c4568c != null && (c4569dM1859n = c4568c.m1859n()) != null) {
                this.f1650l++;
                BufferedSink bufferedSink = this.f1651m;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.writeUtf8("READ");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (m1837z()) {
                    m1820A();
                }
                return c4569dM1859n;
            }
            return null;
        }
    }

    /* renamed from: y */
    public final void m1836y() {
        synchronized (this.f1648j) {
            try {
                if (this.f1653o) {
                    return;
                }
                this.f1657s.delete(this.f1644f);
                if (this.f1657s.exists(this.f1645g)) {
                    if (this.f1657s.exists(this.f1643e)) {
                        this.f1657s.delete(this.f1645g);
                    } else {
                        this.f1657s.atomicMove(this.f1645g, this.f1643e);
                    }
                }
                if (this.f1657s.exists(this.f1643e)) {
                    try {
                        m1823E();
                        m1822D();
                        this.f1653o = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            m1833v();
                            this.f1654p = false;
                        } catch (Throwable th) {
                            this.f1654p = false;
                            throw th;
                        }
                    }
                }
                m1830L();
                this.f1653o = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: z */
    public final boolean m1837z() {
        return this.f1650l >= 2000;
    }
}
