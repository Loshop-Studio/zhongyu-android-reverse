package coil3.disk;

import coil3.disk.DiskLruCache;
import coil3.util.AbstractC5213c;
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
import p030c0.AbstractC5077b;
import p030c0.AbstractC5079d;
import p030c0.AbstractC5084i;
import p183o.C8679b;

/* loaded from: classes3.dex */
public final class DiskLruCache implements AutoCloseable {

    /* renamed from: t */
    public static final C5185a f2953t = new C5185a(null);

    /* renamed from: u */
    public static final Regex f2954u = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    public final Path f2955a;

    /* renamed from: b */
    public final long f2956b;

    /* renamed from: c */
    public final int f2957c;

    /* renamed from: d */
    public final int f2958d;

    /* renamed from: e */
    public final Path f2959e;

    /* renamed from: f */
    public final Path f2960f;

    /* renamed from: g */
    public final Path f2961g;

    /* renamed from: h */
    public final Map f2962h;

    /* renamed from: i */
    public final CoroutineScope f2963i;

    /* renamed from: j */
    public final Object f2964j;

    /* renamed from: k */
    public long f2965k;

    /* renamed from: l */
    public int f2966l;

    /* renamed from: m */
    public BufferedSink f2967m;

    /* renamed from: n */
    public boolean f2968n;

    /* renamed from: o */
    public boolean f2969o;

    /* renamed from: p */
    public boolean f2970p;

    /* renamed from: q */
    public boolean f2971q;

    /* renamed from: r */
    public boolean f2972r;

    /* renamed from: s */
    public final C5189e f2973s;

    /* renamed from: coil3.disk.DiskLruCache$a */
    public static final class C5185a {
        public /* synthetic */ C5185a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C5185a() {
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$b */
    public final class C5186b {

        /* renamed from: a */
        public final C5187c f2974a;

        /* renamed from: b */
        public boolean f2975b;

        /* renamed from: c */
        public final boolean[] f2976c;

        public C5186b(C5187c c5187c) {
            this.f2974a = c5187c;
            this.f2976c = new boolean[DiskLruCache.this.f2958d];
        }

        /* renamed from: a */
        public final void m3010a() {
            m3013d(false);
        }

        /* renamed from: b */
        public final void m3011b() {
            m3013d(true);
        }

        /* renamed from: c */
        public final C5188d m3012c() {
            C5188d c5188dM3007x;
            Object obj = DiskLruCache.this.f2964j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                m3011b();
                c5188dM3007x = diskLruCache.m3007x(this.f2974a.m3021d());
            }
            return c5188dM3007x;
        }

        /* renamed from: d */
        public final void m3013d(boolean z9) {
            Object obj = DiskLruCache.this.f2964j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                try {
                    if (this.f2975b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.areEqual(this.f2974a.m3019b(), this)) {
                        diskLruCache.m3004u(this, z9);
                    }
                    this.f2975b = true;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: e */
        public final void m3014e() {
            if (Intrinsics.areEqual(this.f2974a.m3019b(), this)) {
                this.f2974a.m3030m(true);
            }
        }

        /* renamed from: f */
        public final Path m3015f(int i10) {
            Path path;
            Object obj = DiskLruCache.this.f2964j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                if (this.f2975b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f2976c[i10] = true;
                Object obj2 = this.f2974a.m3020c().get(i10);
                AbstractC5084i.m2683b(diskLruCache.f2973s, (Path) obj2, false, 2, null);
                path = (Path) obj2;
            }
            return path;
        }

        /* renamed from: g */
        public final C5187c m3016g() {
            return this.f2974a;
        }

        /* renamed from: h */
        public final boolean[] m3017h() {
            return this.f2976c;
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$c */
    public final class C5187c {

        /* renamed from: a */
        public final String f2978a;

        /* renamed from: b */
        public final long[] f2979b;

        /* renamed from: c */
        public final ArrayList f2980c;

        /* renamed from: d */
        public final ArrayList f2981d;

        /* renamed from: e */
        public boolean f2982e;

        /* renamed from: f */
        public boolean f2983f;

        /* renamed from: g */
        public C5186b f2984g;

        /* renamed from: h */
        public int f2985h;

        public C5187c(String str) {
            this.f2978a = str;
            this.f2979b = new long[DiskLruCache.this.f2958d];
            this.f2980c = new ArrayList(DiskLruCache.this.f2958d);
            this.f2981d = new ArrayList(DiskLruCache.this.f2958d);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i10 = DiskLruCache.this.f2958d;
            for (int i11 = 0; i11 < i10; i11++) {
                sb.append(i11);
                this.f2980c.add(DiskLruCache.this.f2955a.resolve(sb.toString()));
                sb.append(".tmp");
                this.f2981d.add(DiskLruCache.this.f2955a.resolve(sb.toString()));
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public final ArrayList m3018a() {
            return this.f2980c;
        }

        /* renamed from: b */
        public final C5186b m3019b() {
            return this.f2984g;
        }

        /* renamed from: c */
        public final ArrayList m3020c() {
            return this.f2981d;
        }

        /* renamed from: d */
        public final String m3021d() {
            return this.f2978a;
        }

        /* renamed from: e */
        public final long[] m3022e() {
            return this.f2979b;
        }

        /* renamed from: f */
        public final int m3023f() {
            return this.f2985h;
        }

        /* renamed from: g */
        public final boolean m3024g() {
            return this.f2982e;
        }

        /* renamed from: h */
        public final boolean m3025h() {
            return this.f2983f;
        }

        /* renamed from: i */
        public final void m3026i(C5186b c5186b) {
            this.f2984g = c5186b;
        }

        /* renamed from: j */
        public final void m3027j(List list) throws IOException {
            if (list.size() != DiskLruCache.this.f2958d) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f2979b[i10] = Long.parseLong((String) list.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        /* renamed from: k */
        public final void m3028k(int i10) {
            this.f2985h = i10;
        }

        /* renamed from: l */
        public final void m3029l(boolean z9) {
            this.f2982e = z9;
        }

        /* renamed from: m */
        public final void m3030m(boolean z9) {
            this.f2983f = z9;
        }

        /* renamed from: n */
        public final C5188d m3031n() {
            if (!this.f2982e || this.f2984g != null || this.f2983f) {
                return null;
            }
            ArrayList arrayList = this.f2980c;
            DiskLruCache diskLruCache = DiskLruCache.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!diskLruCache.f2973s.exists((Path) arrayList.get(i10))) {
                    try {
                        diskLruCache.m2998G(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f2985h++;
            return DiskLruCache.this.new C5188d(this);
        }

        /* renamed from: o */
        public final void m3032o(BufferedSink bufferedSink) throws IOException {
            for (long j10 : this.f2979b) {
                bufferedSink.writeByte(32).writeDecimalLong(j10);
            }
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$d */
    public final class C5188d implements AutoCloseable {

        /* renamed from: a */
        public final C5187c f2987a;

        /* renamed from: b */
        public boolean f2988b;

        public C5188d(C5187c c5187c) {
            this.f2987a = c5187c;
        }

        /* renamed from: a */
        public final C5186b m3033a() {
            C5186b c5186bM3006w;
            Object obj = DiskLruCache.this.f2964j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                close();
                c5186bM3006w = diskLruCache.m3006w(this.f2987a.m3021d());
            }
            return c5186bM3006w;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.f2988b) {
                return;
            }
            this.f2988b = true;
            Object obj = DiskLruCache.this.f2964j;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                try {
                    this.f2987a.m3028k(r2.m3023f() - 1);
                    if (this.f2987a.m3023f() == 0 && this.f2987a.m3025h()) {
                        diskLruCache.m2998G(this.f2987a);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: f */
        public final Path m3034f(int i10) {
            if (this.f2988b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path) this.f2987a.m3018a().get(i10);
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$e */
    public static final class C5189e extends ForwardingFileSystem {
        public C5189e(FileSystem fileSystem) {
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

    public DiskLruCache(FileSystem fileSystem, Path path, CoroutineContext coroutineContext, long j10, int i10, int i11) {
        this.f2955a = path;
        this.f2956b = j10;
        this.f2957c = i10;
        this.f2958d = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f2959e = path.resolve("journal");
        this.f2960f = path.resolve("journal.tmp");
        this.f2961g = path.resolve("journal.bkp");
        this.f2962h = AbstractC5077b.m2668b(0, 0.0f, 3, null);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        CoroutineDispatcher coroutineDispatcherM3216j = AbstractC5213c.m3216j(coroutineContext);
        this.f2963i = CoroutineScopeKt.CoroutineScope(coroutineContextPlus.plus(CoroutineDispatcher.limitedParallelism$default(coroutineDispatcherM3216j == null ? AbstractC5079d.m2678a() : coroutineDispatcherM3216j, 1, null, 2, null)));
        this.f2964j = new Object();
        this.f2973s = new C5189e(fileSystem);
    }

    /* renamed from: C */
    public static final Unit m2977C(DiskLruCache diskLruCache, IOException iOException) {
        diskLruCache.f2968n = true;
        return Unit.INSTANCE;
    }

    /* renamed from: A */
    public final void m2993A() {
        BuildersKt__Builders_commonKt.launch$default(this.f2963i, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
    }

    /* renamed from: B */
    public final BufferedSink m2994B() {
        return Okio.buffer(new C8679b(this.f2973s.appendingSink(this.f2959e), new Function1() { // from class: o.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DiskLruCache.m2977C(this.f14413a, (IOException) obj);
            }
        }));
    }

    /* renamed from: D */
    public final void m2995D() throws IOException {
        Iterator it = this.f2962h.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            C5187c c5187c = (C5187c) it.next();
            int i10 = 0;
            if (c5187c.m3019b() == null) {
                int i11 = this.f2958d;
                while (i10 < i11) {
                    j10 += c5187c.m3022e()[i10];
                    i10++;
                }
            } else {
                c5187c.m3026i(null);
                int i12 = this.f2958d;
                while (i10 < i12) {
                    this.f2973s.delete((Path) c5187c.m3018a().get(i10));
                    this.f2973s.delete((Path) c5187c.m3020c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f2965k = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2996E() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            coil3.disk.DiskLruCache$e r1 = r10.f2973s
            okio.Path r2 = r10.f2959e
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
            int r7 = r10.f2957c     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r4)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r10.f2958d     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r5)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L5b
            if (r7 > 0) goto L82
            r0 = 0
        L51:
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            r10.m2997F(r2)     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            int r0 = r0 + 1
            goto L51
        L5b:
            r0 = move-exception
            goto Lb6
        L5d:
            java.util.Map r2 = r10.f2962h     // Catch: java.lang.Throwable -> L5b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5b
            int r0 = r0 - r2
            r10.f2966l = r0     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1.exhausted()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L70
            r10.m3002K()     // Catch: java.lang.Throwable -> L5b
            goto L76
        L70:
            okio.BufferedSink r0 = r10.m2994B()     // Catch: java.lang.Throwable -> L5b
            r10.f2967m = r0     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.DiskLruCache.m2996E():void");
    }

    /* renamed from: F */
    public final void m2997F(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ' ', i10, false, 4, (Object) null);
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (iIndexOf$default == 6 && StringsKt.startsWith$default(str, "REMOVE", false, 2, (Object) null)) {
                this.f2962h.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        Map map = this.f2962h;
        Object c5187c = map.get(strSubstring);
        if (c5187c == null) {
            c5187c = new C5187c(strSubstring);
            map.put(strSubstring, c5187c);
        }
        C5187c c5187c2 = (C5187c) c5187c;
        if (iIndexOf$default2 != -1 && iIndexOf$default == 5 && StringsKt.startsWith$default(str, "CLEAN", false, 2, (Object) null)) {
            String strSubstring2 = str.substring(iIndexOf$default2 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            List listSplit$default = StringsKt.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
            c5187c2.m3029l(true);
            c5187c2.m3026i(null);
            c5187c2.m3027j(listSplit$default);
            return;
        }
        if (iIndexOf$default2 == -1 && iIndexOf$default == 5 && StringsKt.startsWith$default(str, "DIRTY", false, 2, (Object) null)) {
            c5187c2.m3026i(new C5186b(c5187c2));
            return;
        }
        if (iIndexOf$default2 == -1 && iIndexOf$default == 4 && StringsKt.startsWith$default(str, "READ", false, 2, (Object) null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: G */
    public final boolean m2998G(C5187c c5187c) throws IOException {
        BufferedSink bufferedSink;
        if (c5187c.m3023f() > 0 && (bufferedSink = this.f2967m) != null) {
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(c5187c.m3021d());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (c5187c.m3023f() > 0 || c5187c.m3019b() != null) {
            c5187c.m3030m(true);
            return true;
        }
        int i10 = this.f2958d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f2973s.delete((Path) c5187c.m3018a().get(i11));
            this.f2965k -= c5187c.m3022e()[i11];
            c5187c.m3022e()[i11] = 0;
        }
        this.f2966l++;
        BufferedSink bufferedSink2 = this.f2967m;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8("REMOVE");
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(c5187c.m3021d());
            bufferedSink2.writeByte(10);
            bufferedSink2.flush();
        }
        this.f2962h.remove(c5187c.m3021d());
        if (m3009z()) {
            m2993A();
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m2999H() throws IOException {
        for (C5187c c5187c : this.f2962h.values()) {
            if (!c5187c.m3025h()) {
                m2998G(c5187c);
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public final void m3000I() {
        while (this.f2965k > this.f2956b) {
            if (!m2999H()) {
                return;
            }
        }
        this.f2971q = false;
    }

    /* renamed from: J */
    public final void m3001J(String str) {
        if (f2954u.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + Typography.quote).toString());
    }

    /* renamed from: K */
    public final void m3002K() {
        Throwable th;
        synchronized (this.f2964j) {
            try {
                BufferedSink bufferedSink = this.f2967m;
                if (bufferedSink != null) {
                    bufferedSink.close();
                }
                BufferedSink bufferedSinkBuffer = Okio.buffer(this.f2973s.sink(this.f2960f, false));
                try {
                    bufferedSinkBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                    bufferedSinkBuffer.writeUtf8("1").writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(this.f2957c).writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(this.f2958d).writeByte(10);
                    bufferedSinkBuffer.writeByte(10);
                    for (C5187c c5187c : this.f2962h.values()) {
                        if (c5187c.m3019b() != null) {
                            bufferedSinkBuffer.writeUtf8("DIRTY");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(c5187c.m3021d());
                            bufferedSinkBuffer.writeByte(10);
                        } else {
                            bufferedSinkBuffer.writeUtf8("CLEAN");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(c5187c.m3021d());
                            c5187c.m3032o(bufferedSinkBuffer);
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
                if (this.f2973s.exists(this.f2959e)) {
                    this.f2973s.atomicMove(this.f2959e, this.f2961g);
                    this.f2973s.atomicMove(this.f2960f, this.f2959e);
                    this.f2973s.delete(this.f2961g);
                } else {
                    this.f2973s.atomicMove(this.f2960f, this.f2959e);
                }
                this.f2967m = m2994B();
                this.f2966l = 0;
                this.f2968n = false;
                this.f2972r = false;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f2964j) {
            try {
                if (this.f2969o && !this.f2970p) {
                    for (C5187c c5187c : (C5187c[]) this.f2962h.values().toArray(new C5187c[0])) {
                        C5186b c5186bM3019b = c5187c.m3019b();
                        if (c5186bM3019b != null) {
                            c5186bM3019b.m3014e();
                        }
                    }
                    m3000I();
                    CoroutineScopeKt.cancel$default(this.f2963i, null, 1, null);
                    BufferedSink bufferedSink = this.f2967m;
                    Intrinsics.checkNotNull(bufferedSink);
                    bufferedSink.close();
                    this.f2967m = null;
                    this.f2970p = true;
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                this.f2970p = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: t */
    public final void m3003t() {
        if (this.f2970p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: u */
    public final void m3004u(C5186b c5186b, boolean z9) {
        synchronized (this.f2964j) {
            C5187c c5187cM3016g = c5186b.m3016g();
            if (!Intrinsics.areEqual(c5187cM3016g.m3019b(), c5186b)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z9 || c5187cM3016g.m3025h()) {
                int i10 = this.f2958d;
                for (int i11 = 0; i11 < i10; i11++) {
                    this.f2973s.delete((Path) c5187cM3016g.m3020c().get(i11));
                }
            } else {
                int i12 = this.f2958d;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (c5186b.m3017h()[i13] && !this.f2973s.exists((Path) c5187cM3016g.m3020c().get(i13))) {
                        c5186b.m3010a();
                        return;
                    }
                }
                int i14 = this.f2958d;
                for (int i15 = 0; i15 < i14; i15++) {
                    Path path = (Path) c5187cM3016g.m3020c().get(i15);
                    Path path2 = (Path) c5187cM3016g.m3018a().get(i15);
                    if (this.f2973s.exists(path)) {
                        this.f2973s.atomicMove(path, path2);
                    } else {
                        AbstractC5084i.m2683b(this.f2973s, (Path) c5187cM3016g.m3018a().get(i15), false, 2, null);
                    }
                    long j10 = c5187cM3016g.m3022e()[i15];
                    Long size = this.f2973s.metadata(path2).getSize();
                    long jLongValue = size != null ? size.longValue() : 0L;
                    c5187cM3016g.m3022e()[i15] = jLongValue;
                    this.f2965k = (this.f2965k - j10) + jLongValue;
                }
            }
            c5187cM3016g.m3026i(null);
            if (c5187cM3016g.m3025h()) {
                m2998G(c5187cM3016g);
                return;
            }
            this.f2966l++;
            BufferedSink bufferedSink = this.f2967m;
            Intrinsics.checkNotNull(bufferedSink);
            if (z9 || c5187cM3016g.m3024g()) {
                c5187cM3016g.m3029l(true);
                bufferedSink.writeUtf8("CLEAN");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(c5187cM3016g.m3021d());
                c5187cM3016g.m3032o(bufferedSink);
                bufferedSink.writeByte(10);
            } else {
                this.f2962h.remove(c5187cM3016g.m3021d());
                bufferedSink.writeUtf8("REMOVE");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(c5187cM3016g.m3021d());
                bufferedSink.writeByte(10);
            }
            bufferedSink.flush();
            if (this.f2965k > this.f2956b || m3009z()) {
                m2993A();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: v */
    public final void m3005v() throws IOException {
        close();
        AbstractC5084i.m2684c(this.f2973s, this.f2955a);
    }

    /* renamed from: w */
    public final C5186b m3006w(String str) {
        synchronized (this.f2964j) {
            m3003t();
            m3001J(str);
            m3008y();
            C5187c c5187c = (C5187c) this.f2962h.get(str);
            if ((c5187c != null ? c5187c.m3019b() : null) != null) {
                return null;
            }
            if (c5187c != null && c5187c.m3023f() != 0) {
                return null;
            }
            if (!this.f2971q && !this.f2972r) {
                BufferedSink bufferedSink = this.f2967m;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.writeUtf8("DIRTY");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.f2968n) {
                    return null;
                }
                if (c5187c == null) {
                    c5187c = new C5187c(str);
                    this.f2962h.put(str, c5187c);
                }
                C5186b c5186b = new C5186b(c5187c);
                c5187c.m3026i(c5186b);
                return c5186b;
            }
            m2993A();
            return null;
        }
    }

    /* renamed from: x */
    public final C5188d m3007x(String str) {
        C5188d c5188dM3031n;
        synchronized (this.f2964j) {
            m3003t();
            m3001J(str);
            m3008y();
            C5187c c5187c = (C5187c) this.f2962h.get(str);
            if (c5187c != null && (c5188dM3031n = c5187c.m3031n()) != null) {
                this.f2966l++;
                BufferedSink bufferedSink = this.f2967m;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.writeUtf8("READ");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (m3009z()) {
                    m2993A();
                }
                return c5188dM3031n;
            }
            return null;
        }
    }

    /* renamed from: y */
    public final void m3008y() {
        synchronized (this.f2964j) {
            try {
                if (this.f2969o) {
                    return;
                }
                this.f2973s.delete(this.f2960f);
                if (this.f2973s.exists(this.f2961g)) {
                    if (this.f2973s.exists(this.f2959e)) {
                        this.f2973s.delete(this.f2961g);
                    } else {
                        this.f2973s.atomicMove(this.f2961g, this.f2959e);
                    }
                }
                if (this.f2973s.exists(this.f2959e)) {
                    try {
                        m2996E();
                        m2995D();
                        this.f2969o = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            m3005v();
                            this.f2970p = false;
                        } catch (Throwable th) {
                            this.f2970p = false;
                            throw th;
                        }
                    }
                }
                m3002K();
                this.f2969o = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: z */
    public final boolean m3009z() {
        return this.f2966l >= 2000;
    }
}
