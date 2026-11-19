package coil3.disk;

import coil3.disk.DiskLruCache;
import coil3.util.AbstractC5348c;
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
import p090e0.AbstractC7804b;
import p090e0.AbstractC7806d;
import p090e0.AbstractC7810h;
import p193o.C9132b;

/* loaded from: classes3.dex */
public final class DiskLruCache implements AutoCloseable {

    /* renamed from: t */
    public static final C5320a f2881t = new C5320a(null);

    /* renamed from: u */
    public static final Regex f2882u = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    public final Path f2883a;

    /* renamed from: b */
    public final long f2884b;

    /* renamed from: c */
    public final int f2885c;

    /* renamed from: d */
    public final int f2886d;

    /* renamed from: e */
    public final Path f2887e;

    /* renamed from: f */
    public final Path f2888f;

    /* renamed from: g */
    public final Path f2889g;

    /* renamed from: h */
    public final Map f2890h;

    /* renamed from: i */
    public final CoroutineScope f2891i;

    /* renamed from: j */
    public final Object f2892j;

    /* renamed from: k */
    public long f2893k;

    /* renamed from: l */
    public int f2894l;

    /* renamed from: m */
    public BufferedSink f2895m;

    /* renamed from: n */
    public boolean f2896n;

    /* renamed from: o */
    public boolean f2897o;

    /* renamed from: p */
    public boolean f2898p;

    /* renamed from: q */
    public boolean f2899q;

    /* renamed from: r */
    public boolean f2900r;

    /* renamed from: s */
    public final C5324e f2901s;

    /* renamed from: coil3.disk.DiskLruCache$a */
    public static final class C5320a {
        public /* synthetic */ C5320a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C5320a() {
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$b */
    public final class C5321b {

        /* renamed from: a */
        public final C5322c f2902a;

        /* renamed from: b */
        public boolean f2903b;

        /* renamed from: c */
        public final boolean[] f2904c;

        public C5321b(C5322c c5322c) {
            this.f2902a = c5322c;
            this.f2904c = new boolean[DiskLruCache.this.f2886d];
        }

        /* renamed from: a */
        public final void m2735a() {
            m2738d(false);
        }

        /* renamed from: b */
        public final void m2736b() {
            m2738d(true);
        }

        /* renamed from: c */
        public final C5323d m2737c() {
            C5323d c5323dM2732x;
            Object obj = DiskLruCache.this.f2892j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                m2736b();
                c5323dM2732x = diskLruCache.m2732x(this.f2902a.m2746d());
            }
            return c5323dM2732x;
        }

        /* renamed from: d */
        public final void m2738d(boolean z9) {
            Object obj = DiskLruCache.this.f2892j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                try {
                    if (this.f2903b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.areEqual(this.f2902a.m2744b(), this)) {
                        diskLruCache.m2729u(this, z9);
                    }
                    this.f2903b = true;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: e */
        public final void m2739e() {
            if (Intrinsics.areEqual(this.f2902a.m2744b(), this)) {
                this.f2902a.m2755m(true);
            }
        }

        /* renamed from: f */
        public final Path m2740f(int i9) {
            Path path;
            Object obj = DiskLruCache.this.f2892j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                if (this.f2903b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f2904c[i9] = true;
                Object obj2 = this.f2902a.m2745c().get(i9);
                AbstractC7810h.m12191b(diskLruCache.f2901s, (Path) obj2, false, 2, null);
                path = (Path) obj2;
            }
            return path;
        }

        /* renamed from: g */
        public final C5322c m2741g() {
            return this.f2902a;
        }

        /* renamed from: h */
        public final boolean[] m2742h() {
            return this.f2904c;
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$c */
    public final class C5322c {

        /* renamed from: a */
        public final String f2906a;

        /* renamed from: b */
        public final long[] f2907b;

        /* renamed from: c */
        public final ArrayList f2908c;

        /* renamed from: d */
        public final ArrayList f2909d;

        /* renamed from: e */
        public boolean f2910e;

        /* renamed from: f */
        public boolean f2911f;

        /* renamed from: g */
        public C5321b f2912g;

        /* renamed from: h */
        public int f2913h;

        public C5322c(String str) {
            this.f2906a = str;
            this.f2907b = new long[DiskLruCache.this.f2886d];
            this.f2908c = new ArrayList(DiskLruCache.this.f2886d);
            this.f2909d = new ArrayList(DiskLruCache.this.f2886d);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i9 = DiskLruCache.this.f2886d;
            for (int i10 = 0; i10 < i9; i10++) {
                sb.append(i10);
                this.f2908c.add(DiskLruCache.this.f2883a.resolve(sb.toString()));
                sb.append(".tmp");
                this.f2909d.add(DiskLruCache.this.f2883a.resolve(sb.toString()));
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public final ArrayList m2743a() {
            return this.f2908c;
        }

        /* renamed from: b */
        public final C5321b m2744b() {
            return this.f2912g;
        }

        /* renamed from: c */
        public final ArrayList m2745c() {
            return this.f2909d;
        }

        /* renamed from: d */
        public final String m2746d() {
            return this.f2906a;
        }

        /* renamed from: e */
        public final long[] m2747e() {
            return this.f2907b;
        }

        /* renamed from: f */
        public final int m2748f() {
            return this.f2913h;
        }

        /* renamed from: g */
        public final boolean m2749g() {
            return this.f2910e;
        }

        /* renamed from: h */
        public final boolean m2750h() {
            return this.f2911f;
        }

        /* renamed from: i */
        public final void m2751i(C5321b c5321b) {
            this.f2912g = c5321b;
        }

        /* renamed from: j */
        public final void m2752j(List list) throws IOException {
            if (list.size() != DiskLruCache.this.f2886d) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    this.f2907b[i9] = Long.parseLong((String) list.get(i9));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        /* renamed from: k */
        public final void m2753k(int i9) {
            this.f2913h = i9;
        }

        /* renamed from: l */
        public final void m2754l(boolean z9) {
            this.f2910e = z9;
        }

        /* renamed from: m */
        public final void m2755m(boolean z9) {
            this.f2911f = z9;
        }

        /* renamed from: n */
        public final C5323d m2756n() {
            if (!this.f2910e || this.f2912g != null || this.f2911f) {
                return null;
            }
            ArrayList arrayList = this.f2908c;
            DiskLruCache diskLruCache = DiskLruCache.this;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (!diskLruCache.f2901s.exists((Path) arrayList.get(i9))) {
                    try {
                        diskLruCache.m2723G(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f2913h++;
            return DiskLruCache.this.new C5323d(this);
        }

        /* renamed from: o */
        public final void m2757o(BufferedSink bufferedSink) throws IOException {
            for (long j9 : this.f2907b) {
                bufferedSink.writeByte(32).writeDecimalLong(j9);
            }
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$d */
    public final class C5323d implements AutoCloseable {

        /* renamed from: a */
        public final C5322c f2915a;

        /* renamed from: b */
        public boolean f2916b;

        public C5323d(C5322c c5322c) {
            this.f2915a = c5322c;
        }

        /* renamed from: a */
        public final C5321b m2758a() {
            C5321b c5321bM2731w;
            Object obj = DiskLruCache.this.f2892j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                close();
                c5321bM2731w = diskLruCache.m2731w(this.f2915a.m2746d());
            }
            return c5321bM2731w;
        }

        /* renamed from: c */
        public final Path m2759c(int i9) {
            if (this.f2916b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path) this.f2915a.m2743a().get(i9);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.f2916b) {
                return;
            }
            this.f2916b = true;
            Object obj = DiskLruCache.this.f2892j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                try {
                    this.f2915a.m2753k(r2.m2748f() - 1);
                    if (this.f2915a.m2748f() == 0 && this.f2915a.m2750h()) {
                        diskLruCache.m2723G(this.f2915a);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$e */
    public static final class C5324e extends ForwardingFileSystem {
        public C5324e(FileSystem fileSystem) {
            super(fileSystem);
        }

        @Override // okio.ForwardingFileSystem, okio.FileSystem
        public Sink sink(Path path, boolean z9) throws IOException {
            Path pathParent = path.parent();
            if (pathParent != null) {
                createDirectories(pathParent);
            }
            return super.sink(path, z9);
        }
    }

    public DiskLruCache(FileSystem fileSystem, Path path, CoroutineContext coroutineContext, long j9, int i9, int i10) {
        this.f2883a = path;
        this.f2884b = j9;
        this.f2885c = i9;
        this.f2886d = i10;
        if (j9 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i10 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f2887e = path.resolve("journal");
        this.f2888f = path.resolve("journal.tmp");
        this.f2889g = path.resolve("journal.bkp");
        this.f2890h = AbstractC7804b.m12176b(0, 0.0f, 3, null);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        CoroutineDispatcher coroutineDispatcherM2933j = AbstractC5348c.m2933j(coroutineContext);
        this.f2891i = CoroutineScopeKt.CoroutineScope(coroutineContextPlus.plus(CoroutineDispatcher.limitedParallelism$default(coroutineDispatcherM2933j == null ? AbstractC7806d.m12186a() : coroutineDispatcherM2933j, 1, null, 2, null)));
        this.f2892j = new Object();
        this.f2901s = new C5324e(fileSystem);
    }

    /* renamed from: C */
    public static final Unit m2702C(DiskLruCache diskLruCache, IOException iOException) {
        diskLruCache.f2896n = true;
        return Unit.INSTANCE;
    }

    /* renamed from: A */
    public final void m2718A() {
        BuildersKt__Builders_commonKt.launch$default(this.f2891i, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
    }

    /* renamed from: B */
    public final BufferedSink m2719B() {
        return Okio.buffer(new C9132b(this.f2901s.appendingSink(this.f2887e), new Function1() { // from class: o.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DiskLruCache.m2702C(this.f15370a, (IOException) obj);
            }
        }));
    }

    /* renamed from: D */
    public final void m2720D() throws IOException {
        Iterator it = this.f2890h.values().iterator();
        long j9 = 0;
        while (it.hasNext()) {
            C5322c c5322c = (C5322c) it.next();
            int i9 = 0;
            if (c5322c.m2744b() == null) {
                int i10 = this.f2886d;
                while (i9 < i10) {
                    j9 += c5322c.m2747e()[i9];
                    i9++;
                }
            } else {
                c5322c.m2751i(null);
                int i11 = this.f2886d;
                while (i9 < i11) {
                    this.f2901s.delete((Path) c5322c.m2743a().get(i9));
                    this.f2901s.delete((Path) c5322c.m2745c().get(i9));
                    i9++;
                }
                it.remove();
            }
        }
        this.f2893k = j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2721E() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            coil3.disk.DiskLruCache$e r1 = r10.f2901s
            okio.Path r2 = r10.f2887e
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
            int r7 = r10.f2885c     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r4)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r10.f2886d     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r5)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L5b
            if (r7 > 0) goto L82
            r0 = 0
        L51:
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            r10.m2722F(r2)     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            int r0 = r0 + 1
            goto L51
        L5b:
            r0 = move-exception
            goto Lb6
        L5d:
            java.util.Map r2 = r10.f2890h     // Catch: java.lang.Throwable -> L5b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5b
            int r0 = r0 - r2
            r10.f2894l = r0     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1.exhausted()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L70
            r10.m2727K()     // Catch: java.lang.Throwable -> L5b
            goto L76
        L70:
            okio.BufferedSink r0 = r10.m2719B()     // Catch: java.lang.Throwable -> L5b
            r10.f2895m = r0     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.DiskLruCache.m2721E():void");
    }

    /* renamed from: F */
    public final void m2722F(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i9 = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ' ', i9, false, 4, (Object) null);
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i9);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (iIndexOf$default == 6 && StringsKt.startsWith$default(str, "REMOVE", false, 2, (Object) null)) {
                this.f2890h.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i9, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        Map map = this.f2890h;
        Object c5322c = map.get(strSubstring);
        if (c5322c == null) {
            c5322c = new C5322c(strSubstring);
            map.put(strSubstring, c5322c);
        }
        C5322c c5322c2 = (C5322c) c5322c;
        if (iIndexOf$default2 != -1 && iIndexOf$default == 5 && StringsKt.startsWith$default(str, "CLEAN", false, 2, (Object) null)) {
            String strSubstring2 = str.substring(iIndexOf$default2 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            List listSplit$default = StringsKt.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
            c5322c2.m2754l(true);
            c5322c2.m2751i(null);
            c5322c2.m2752j(listSplit$default);
            return;
        }
        if (iIndexOf$default2 == -1 && iIndexOf$default == 5 && StringsKt.startsWith$default(str, "DIRTY", false, 2, (Object) null)) {
            c5322c2.m2751i(new C5321b(c5322c2));
            return;
        }
        if (iIndexOf$default2 == -1 && iIndexOf$default == 4 && StringsKt.startsWith$default(str, "READ", false, 2, (Object) null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: G */
    public final boolean m2723G(C5322c c5322c) throws IOException {
        BufferedSink bufferedSink;
        if (c5322c.m2748f() > 0 && (bufferedSink = this.f2895m) != null) {
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(c5322c.m2746d());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (c5322c.m2748f() > 0 || c5322c.m2744b() != null) {
            c5322c.m2755m(true);
            return true;
        }
        int i9 = this.f2886d;
        for (int i10 = 0; i10 < i9; i10++) {
            this.f2901s.delete((Path) c5322c.m2743a().get(i10));
            this.f2893k -= c5322c.m2747e()[i10];
            c5322c.m2747e()[i10] = 0;
        }
        this.f2894l++;
        BufferedSink bufferedSink2 = this.f2895m;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8("REMOVE");
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(c5322c.m2746d());
            bufferedSink2.writeByte(10);
            bufferedSink2.flush();
        }
        this.f2890h.remove(c5322c.m2746d());
        if (m2734z()) {
            m2718A();
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m2724H() throws IOException {
        for (C5322c c5322c : this.f2890h.values()) {
            if (!c5322c.m2750h()) {
                m2723G(c5322c);
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public final void m2725I() {
        while (this.f2893k > this.f2884b) {
            if (!m2724H()) {
                return;
            }
        }
        this.f2899q = false;
    }

    /* renamed from: J */
    public final void m2726J(String str) {
        if (f2882u.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + Typography.quote).toString());
    }

    /* renamed from: K */
    public final void m2727K() {
        Throwable th;
        synchronized (this.f2892j) {
            try {
                BufferedSink bufferedSink = this.f2895m;
                if (bufferedSink != null) {
                    bufferedSink.close();
                }
                BufferedSink bufferedSinkBuffer = Okio.buffer(this.f2901s.sink(this.f2888f, false));
                try {
                    bufferedSinkBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                    bufferedSinkBuffer.writeUtf8("1").writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(this.f2885c).writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(this.f2886d).writeByte(10);
                    bufferedSinkBuffer.writeByte(10);
                    for (C5322c c5322c : this.f2890h.values()) {
                        if (c5322c.m2744b() != null) {
                            bufferedSinkBuffer.writeUtf8("DIRTY");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(c5322c.m2746d());
                            bufferedSinkBuffer.writeByte(10);
                        } else {
                            bufferedSinkBuffer.writeUtf8("CLEAN");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(c5322c.m2746d());
                            c5322c.m2757o(bufferedSinkBuffer);
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
                if (this.f2901s.exists(this.f2887e)) {
                    this.f2901s.atomicMove(this.f2887e, this.f2889g);
                    this.f2901s.atomicMove(this.f2888f, this.f2887e);
                    this.f2901s.delete(this.f2889g);
                } else {
                    this.f2901s.atomicMove(this.f2888f, this.f2887e);
                }
                this.f2895m = m2719B();
                this.f2894l = 0;
                this.f2896n = false;
                this.f2900r = false;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f2892j) {
            try {
                if (this.f2897o && !this.f2898p) {
                    for (C5322c c5322c : (C5322c[]) this.f2890h.values().toArray(new C5322c[0])) {
                        C5321b c5321bM2744b = c5322c.m2744b();
                        if (c5321bM2744b != null) {
                            c5321bM2744b.m2739e();
                        }
                    }
                    m2725I();
                    CoroutineScopeKt.cancel$default(this.f2891i, null, 1, null);
                    BufferedSink bufferedSink = this.f2895m;
                    Intrinsics.checkNotNull(bufferedSink);
                    bufferedSink.close();
                    this.f2895m = null;
                    this.f2898p = true;
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                this.f2898p = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: t */
    public final void m2728t() {
        if (this.f2898p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: u */
    public final void m2729u(C5321b c5321b, boolean z9) {
        synchronized (this.f2892j) {
            C5322c c5322cM2741g = c5321b.m2741g();
            if (!Intrinsics.areEqual(c5322cM2741g.m2744b(), c5321b)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z9 || c5322cM2741g.m2750h()) {
                int i9 = this.f2886d;
                for (int i10 = 0; i10 < i9; i10++) {
                    this.f2901s.delete((Path) c5322cM2741g.m2745c().get(i10));
                }
            } else {
                int i11 = this.f2886d;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (c5321b.m2742h()[i12] && !this.f2901s.exists((Path) c5322cM2741g.m2745c().get(i12))) {
                        c5321b.m2735a();
                        return;
                    }
                }
                int i13 = this.f2886d;
                for (int i14 = 0; i14 < i13; i14++) {
                    Path path = (Path) c5322cM2741g.m2745c().get(i14);
                    Path path2 = (Path) c5322cM2741g.m2743a().get(i14);
                    if (this.f2901s.exists(path)) {
                        this.f2901s.atomicMove(path, path2);
                    } else {
                        AbstractC7810h.m12191b(this.f2901s, (Path) c5322cM2741g.m2743a().get(i14), false, 2, null);
                    }
                    long j9 = c5322cM2741g.m2747e()[i14];
                    Long size = this.f2901s.metadata(path2).getSize();
                    long jLongValue = size != null ? size.longValue() : 0L;
                    c5322cM2741g.m2747e()[i14] = jLongValue;
                    this.f2893k = (this.f2893k - j9) + jLongValue;
                }
            }
            c5322cM2741g.m2751i(null);
            if (c5322cM2741g.m2750h()) {
                m2723G(c5322cM2741g);
                return;
            }
            this.f2894l++;
            BufferedSink bufferedSink = this.f2895m;
            Intrinsics.checkNotNull(bufferedSink);
            if (z9 || c5322cM2741g.m2749g()) {
                c5322cM2741g.m2754l(true);
                bufferedSink.writeUtf8("CLEAN");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(c5322cM2741g.m2746d());
                c5322cM2741g.m2757o(bufferedSink);
                bufferedSink.writeByte(10);
            } else {
                this.f2890h.remove(c5322cM2741g.m2746d());
                bufferedSink.writeUtf8("REMOVE");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(c5322cM2741g.m2746d());
                bufferedSink.writeByte(10);
            }
            bufferedSink.flush();
            if (this.f2893k > this.f2884b || m2734z()) {
                m2718A();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: v */
    public final void m2730v() throws IOException {
        close();
        AbstractC7810h.m12192c(this.f2901s, this.f2883a);
    }

    /* renamed from: w */
    public final C5321b m2731w(String str) {
        synchronized (this.f2892j) {
            m2728t();
            m2726J(str);
            m2733y();
            C5322c c5322c = (C5322c) this.f2890h.get(str);
            if ((c5322c != null ? c5322c.m2744b() : null) != null) {
                return null;
            }
            if (c5322c != null && c5322c.m2748f() != 0) {
                return null;
            }
            if (!this.f2899q && !this.f2900r) {
                BufferedSink bufferedSink = this.f2895m;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.writeUtf8("DIRTY");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.f2896n) {
                    return null;
                }
                if (c5322c == null) {
                    c5322c = new C5322c(str);
                    this.f2890h.put(str, c5322c);
                }
                C5321b c5321b = new C5321b(c5322c);
                c5322c.m2751i(c5321b);
                return c5321b;
            }
            m2718A();
            return null;
        }
    }

    /* renamed from: x */
    public final C5323d m2732x(String str) {
        C5323d c5323dM2756n;
        synchronized (this.f2892j) {
            m2728t();
            m2726J(str);
            m2733y();
            C5322c c5322c = (C5322c) this.f2890h.get(str);
            if (c5322c != null && (c5323dM2756n = c5322c.m2756n()) != null) {
                this.f2894l++;
                BufferedSink bufferedSink = this.f2895m;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.writeUtf8("READ");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (m2734z()) {
                    m2718A();
                }
                return c5323dM2756n;
            }
            return null;
        }
    }

    /* renamed from: y */
    public final void m2733y() {
        synchronized (this.f2892j) {
            try {
                if (this.f2897o) {
                    return;
                }
                this.f2901s.delete(this.f2888f);
                if (this.f2901s.exists(this.f2889g)) {
                    if (this.f2901s.exists(this.f2887e)) {
                        this.f2901s.delete(this.f2889g);
                    } else {
                        this.f2901s.atomicMove(this.f2889g, this.f2887e);
                    }
                }
                if (this.f2901s.exists(this.f2887e)) {
                    try {
                        m2721E();
                        m2720D();
                        this.f2897o = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            m2730v();
                            this.f2898p = false;
                        } catch (Throwable th) {
                            this.f2898p = false;
                            throw th;
                        }
                    }
                }
                m2727K();
                this.f2897o = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: z */
    public final boolean m2734z() {
        return this.f2894l >= 2000;
    }
}
