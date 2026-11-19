package coil3.disk;

import coil3.disk.DiskLruCache;
import coil3.util.AbstractC5490c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.text.Regex;
import kotlinx.coroutines.AbstractC10006d;
import okio.BufferedSink;
import okio.FileSystem;
import okio.ForwardingFileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import p001a0.AbstractC0005b;
import p001a0.AbstractC0007d;
import p001a0.AbstractC0012i;
import p181hd.InterfaceC9540l;
import p241m.C10187b;
import p309qc.AbstractC10771b;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import sd.AbstractC11106e0;
import sd.AbstractC11108e2;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

/* loaded from: classes3.dex */
public final class DiskLruCache implements AutoCloseable {

    /* renamed from: v */
    public static final C5462a f3628v = new C5462a(null);

    /* renamed from: w */
    public static final Regex f3629w = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: c */
    public final Path f3630c;

    /* renamed from: d */
    public final long f3631d;

    /* renamed from: e */
    public final int f3632e;

    /* renamed from: f */
    public final int f3633f;

    /* renamed from: g */
    public final Path f3634g;

    /* renamed from: h */
    public final Path f3635h;

    /* renamed from: i */
    public final Path f3636i;

    /* renamed from: j */
    public final Map f3637j;

    /* renamed from: k */
    public final InterfaceC11122i0 f3638k;

    /* renamed from: l */
    public final Object f3639l;

    /* renamed from: m */
    public long f3640m;

    /* renamed from: n */
    public int f3641n;

    /* renamed from: o */
    public BufferedSink f3642o;

    /* renamed from: p */
    public boolean f3643p;

    /* renamed from: q */
    public boolean f3644q;

    /* renamed from: r */
    public boolean f3645r;

    /* renamed from: s */
    public boolean f3646s;

    /* renamed from: t */
    public boolean f3647t;

    /* renamed from: u */
    public final C5466e f3648u;

    /* renamed from: coil3.disk.DiskLruCache$a */
    public static final class C5462a {
        public /* synthetic */ C5462a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C5462a() {
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$b */
    public final class C5463b {

        /* renamed from: a */
        public final C5464c f3649a;

        /* renamed from: b */
        public boolean f3650b;

        /* renamed from: c */
        public final boolean[] f3651c;

        public C5463b(C5464c c5464c) {
            this.f3649a = c5464c;
            this.f3651c = new boolean[DiskLruCache.this.f3633f];
        }

        /* renamed from: a */
        public final void m3104a() {
            m3107d(false);
        }

        /* renamed from: b */
        public final void m3105b() {
            m3107d(true);
        }

        /* renamed from: c */
        public final C5465d m3106c() {
            C5465d c5465dM3101x;
            Object obj = DiskLruCache.this.f3639l;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                m3105b();
                c5465dM3101x = diskLruCache.m3101x(this.f3649a.m3115d());
            }
            return c5465dM3101x;
        }

        /* renamed from: d */
        public final void m3107d(boolean z10) {
            Object obj = DiskLruCache.this.f3639l;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                try {
                    if (this.f3650b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (AbstractC9979u.m20289b(this.f3649a.m3113b(), this)) {
                        diskLruCache.m3098u(this, z10);
                    }
                    this.f3650b = true;
                    C10786q c10786q = C10786q.f26013a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: e */
        public final void m3108e() {
            if (AbstractC9979u.m20289b(this.f3649a.m3113b(), this)) {
                this.f3649a.m3124m(true);
            }
        }

        /* renamed from: f */
        public final Path m3109f(int i10) {
            Path path;
            Object obj = DiskLruCache.this.f3639l;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                if (this.f3650b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f3651c[i10] = true;
                Object obj2 = this.f3649a.m3114c().get(i10);
                AbstractC0012i.m24b(diskLruCache.f3648u, (Path) obj2, false, 2, null);
                path = (Path) obj2;
            }
            return path;
        }

        /* renamed from: g */
        public final C5464c m3110g() {
            return this.f3649a;
        }

        /* renamed from: h */
        public final boolean[] m3111h() {
            return this.f3651c;
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$c */
    public final class C5464c {

        /* renamed from: a */
        public final String f3653a;

        /* renamed from: b */
        public final long[] f3654b;

        /* renamed from: c */
        public final ArrayList f3655c;

        /* renamed from: d */
        public final ArrayList f3656d;

        /* renamed from: e */
        public boolean f3657e;

        /* renamed from: f */
        public boolean f3658f;

        /* renamed from: g */
        public C5463b f3659g;

        /* renamed from: h */
        public int f3660h;

        public C5464c(String str) {
            this.f3653a = str;
            this.f3654b = new long[DiskLruCache.this.f3633f];
            this.f3655c = new ArrayList(DiskLruCache.this.f3633f);
            this.f3656d = new ArrayList(DiskLruCache.this.f3633f);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = DiskLruCache.this.f3633f;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.f3655c.add(DiskLruCache.this.f3630c.resolve(sb2.toString()));
                sb2.append(".tmp");
                this.f3656d.add(DiskLruCache.this.f3630c.resolve(sb2.toString()));
                sb2.setLength(length);
            }
        }

        /* renamed from: a */
        public final ArrayList m3112a() {
            return this.f3655c;
        }

        /* renamed from: b */
        public final C5463b m3113b() {
            return this.f3659g;
        }

        /* renamed from: c */
        public final ArrayList m3114c() {
            return this.f3656d;
        }

        /* renamed from: d */
        public final String m3115d() {
            return this.f3653a;
        }

        /* renamed from: e */
        public final long[] m3116e() {
            return this.f3654b;
        }

        /* renamed from: f */
        public final int m3117f() {
            return this.f3660h;
        }

        /* renamed from: g */
        public final boolean m3118g() {
            return this.f3657e;
        }

        /* renamed from: h */
        public final boolean m3119h() {
            return this.f3658f;
        }

        /* renamed from: i */
        public final void m3120i(C5463b c5463b) {
            this.f3659g = c5463b;
        }

        /* renamed from: j */
        public final void m3121j(List list) throws IOException {
            if (list.size() != DiskLruCache.this.f3633f) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f3654b[i10] = Long.parseLong((String) list.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        /* renamed from: k */
        public final void m3122k(int i10) {
            this.f3660h = i10;
        }

        /* renamed from: l */
        public final void m3123l(boolean z10) {
            this.f3657e = z10;
        }

        /* renamed from: m */
        public final void m3124m(boolean z10) {
            this.f3658f = z10;
        }

        /* renamed from: n */
        public final C5465d m3125n() {
            if (!this.f3657e || this.f3659g != null || this.f3658f) {
                return null;
            }
            ArrayList arrayList = this.f3655c;
            DiskLruCache diskLruCache = DiskLruCache.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!diskLruCache.f3648u.exists((Path) arrayList.get(i10))) {
                    try {
                        diskLruCache.m3092G(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f3660h++;
            return DiskLruCache.this.new C5465d(this);
        }

        /* renamed from: o */
        public final void m3126o(BufferedSink bufferedSink) {
            for (long j10 : this.f3654b) {
                bufferedSink.writeByte(32).writeDecimalLong(j10);
            }
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$d */
    public final class C5465d implements AutoCloseable {

        /* renamed from: c */
        public final C5464c f3662c;

        /* renamed from: d */
        public boolean f3663d;

        public C5465d(C5464c c5464c) {
            this.f3662c = c5464c;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.f3663d) {
                return;
            }
            this.f3663d = true;
            Object obj = DiskLruCache.this.f3639l;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                try {
                    this.f3662c.m3122k(r2.m3117f() - 1);
                    if (this.f3662c.m3117f() == 0 && this.f3662c.m3119h()) {
                        diskLruCache.m3092G(this.f3662c);
                    }
                    C10786q c10786q = C10786q.f26013a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: e */
        public final C5463b m3127e() {
            C5463b c5463bM3100w;
            Object obj = DiskLruCache.this.f3639l;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (obj) {
                close();
                c5463bM3100w = diskLruCache.m3100w(this.f3662c.m3115d());
            }
            return c5463bM3100w;
        }

        /* renamed from: f */
        public final Path m3128f(int i10) {
            if (this.f3663d) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (Path) this.f3662c.m3112a().get(i10);
        }
    }

    /* renamed from: coil3.disk.DiskLruCache$e */
    public static final class C5466e extends ForwardingFileSystem {
        public C5466e(FileSystem fileSystem) {
            super(fileSystem);
        }

        @Override // okio.ForwardingFileSystem, okio.FileSystem
        public Sink sink(Path path, boolean z10) {
            Path pathParent = path.parent();
            if (pathParent != null) {
                createDirectories(pathParent);
            }
            return super.sink(path, z10);
        }
    }

    public DiskLruCache(FileSystem fileSystem, Path path, InterfaceC9945d interfaceC9945d, long j10, int i10, int i11) {
        this.f3630c = path;
        this.f3631d = j10;
        this.f3632e = i10;
        this.f3633f = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f3634g = path.resolve("journal");
        this.f3635h = path.resolve("journal.tmp");
        this.f3636i = path.resolve("journal.bkp");
        this.f3637j = AbstractC0005b.m9b(0, 0.0f, 3, null);
        InterfaceC9945d interfaceC9945dPlus = interfaceC9945d.plus(AbstractC11108e2.m24701b(null, 1, null));
        AbstractC11106e0 abstractC11106e0M3310j = AbstractC5490c.m3310j(interfaceC9945d);
        this.f3638k = AbstractC10006d.m20744a(interfaceC9945dPlus.plus(AbstractC11106e0.limitedParallelism$default(abstractC11106e0M3310j == null ? AbstractC0007d.m19a() : abstractC11106e0M3310j, 1, null, 2, null)));
        this.f3639l = new Object();
        this.f3648u = new C5466e(fileSystem);
    }

    /* renamed from: C */
    public static final C10786q m3071C(DiskLruCache diskLruCache, IOException iOException) {
        diskLruCache.f3643p = true;
        return C10786q.f26013a;
    }

    /* renamed from: A */
    public final void m3087A() {
        AbstractC11117h.m24726d(this.f3638k, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
    }

    /* renamed from: B */
    public final BufferedSink m3088B() {
        return Okio.buffer(new C10187b(this.f3648u.appendingSink(this.f3634g), new InterfaceC9540l() { // from class: m.a
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return DiskLruCache.m3071C(this.f24231c, (IOException) obj);
            }
        }));
    }

    /* renamed from: D */
    public final void m3089D() {
        Iterator it = this.f3637j.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            C5464c c5464c = (C5464c) it.next();
            int i10 = 0;
            if (c5464c.m3113b() == null) {
                int i11 = this.f3633f;
                while (i10 < i11) {
                    j10 += c5464c.m3116e()[i10];
                    i10++;
                }
            } else {
                c5464c.m3120i(null);
                int i12 = this.f3633f;
                while (i10 < i12) {
                    this.f3648u.delete((Path) c5464c.m3112a().get(i10));
                    this.f3648u.delete((Path) c5464c.m3114c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f3640m = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3090E() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            coil3.disk.DiskLruCache$e r1 = r10.f3648u
            okio.Path r2 = r10.f3634g
            okio.Source r1 = r1.source(r2)
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = kotlin.jvm.internal.AbstractC9979u.m20289b(r7, r2)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            java.lang.String r7 = "1"
            boolean r7 = kotlin.jvm.internal.AbstractC9979u.m20289b(r7, r3)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r10.f3632e     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.AbstractC9979u.m20289b(r7, r4)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r10.f3633f     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r7 = kotlin.jvm.internal.AbstractC9979u.m20289b(r7, r5)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L82
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L5b
            if (r7 > 0) goto L82
            r0 = 0
        L51:
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            r10.m3091F(r2)     // Catch: java.lang.Throwable -> L5b java.io.EOFException -> L5d
            int r0 = r0 + 1
            goto L51
        L5b:
            r0 = move-exception
            goto Lb6
        L5d:
            java.util.Map r2 = r10.f3637j     // Catch: java.lang.Throwable -> L5b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5b
            int r0 = r0 - r2
            r10.f3641n = r0     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1.exhausted()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L70
            r10.m3096K()     // Catch: java.lang.Throwable -> L5b
            goto L76
        L70:
            okio.BufferedSink r0 = r10.m3088B()     // Catch: java.lang.Throwable -> L5b
            r10.f3642o = r0     // Catch: java.lang.Throwable -> L5b
        L76:
            qc.q r0 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L5b
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
            p309qc.AbstractC10771b.m22973a(r0, r1)
        Lc0:
            if (r0 != 0) goto Lc3
            return
        Lc3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.DiskLruCache.m3090E():void");
    }

    /* renamed from: F */
    public final void m3091F(String str) throws IOException {
        String strSubstring;
        int iM23128e0 = AbstractC10793c0.m23128e0(str, ' ', 0, false, 6, null);
        if (iM23128e0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iM23128e0 + 1;
        int iM23128e02 = AbstractC10793c0.m23128e0(str, ' ', i10, false, 4, null);
        if (iM23128e02 == -1) {
            strSubstring = str.substring(i10);
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
            if (iM23128e0 == 6 && AbstractC10819z.m23242O(str, "REMOVE", false, 2, null)) {
                this.f3637j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iM23128e02);
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
        }
        Map map = this.f3637j;
        Object c5464c = map.get(strSubstring);
        if (c5464c == null) {
            c5464c = new C5464c(strSubstring);
            map.put(strSubstring, c5464c);
        }
        C5464c c5464c2 = (C5464c) c5464c;
        if (iM23128e02 != -1 && iM23128e0 == 5 && AbstractC10819z.m23242O(str, "CLEAN", false, 2, null)) {
            String strSubstring2 = str.substring(iM23128e02 + 1);
            AbstractC9979u.m20293f(strSubstring2, "substring(...)");
            List listM23090H0 = AbstractC10793c0.m23090H0(strSubstring2, new char[]{' '}, false, 0, 6, null);
            c5464c2.m3123l(true);
            c5464c2.m3120i(null);
            c5464c2.m3121j(listM23090H0);
            return;
        }
        if (iM23128e02 == -1 && iM23128e0 == 5 && AbstractC10819z.m23242O(str, "DIRTY", false, 2, null)) {
            c5464c2.m3120i(new C5463b(c5464c2));
            return;
        }
        if (iM23128e02 == -1 && iM23128e0 == 4 && AbstractC10819z.m23242O(str, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: G */
    public final boolean m3092G(C5464c c5464c) {
        BufferedSink bufferedSink;
        if (c5464c.m3117f() > 0 && (bufferedSink = this.f3642o) != null) {
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(c5464c.m3115d());
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (c5464c.m3117f() > 0 || c5464c.m3113b() != null) {
            c5464c.m3124m(true);
            return true;
        }
        int i10 = this.f3633f;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f3648u.delete((Path) c5464c.m3112a().get(i11));
            this.f3640m -= c5464c.m3116e()[i11];
            c5464c.m3116e()[i11] = 0;
        }
        this.f3641n++;
        BufferedSink bufferedSink2 = this.f3642o;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8("REMOVE");
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(c5464c.m3115d());
            bufferedSink2.writeByte(10);
            bufferedSink2.flush();
        }
        this.f3637j.remove(c5464c.m3115d());
        if (m3103z()) {
            m3087A();
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m3093H() {
        for (C5464c c5464c : this.f3637j.values()) {
            if (!c5464c.m3119h()) {
                m3092G(c5464c);
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public final void m3094I() {
        while (this.f3640m > this.f3631d) {
            if (!m3093H()) {
                return;
            }
        }
        this.f3646s = false;
    }

    /* renamed from: J */
    public final void m3095J(String str) {
        if (f3629w.m20341g(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* renamed from: K */
    public final void m3096K() {
        Throwable th;
        synchronized (this.f3639l) {
            try {
                BufferedSink bufferedSink = this.f3642o;
                if (bufferedSink != null) {
                    bufferedSink.close();
                }
                BufferedSink bufferedSinkBuffer = Okio.buffer(this.f3648u.sink(this.f3635h, false));
                try {
                    bufferedSinkBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                    bufferedSinkBuffer.writeUtf8("1").writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(this.f3632e).writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(this.f3633f).writeByte(10);
                    bufferedSinkBuffer.writeByte(10);
                    for (C5464c c5464c : this.f3637j.values()) {
                        if (c5464c.m3113b() != null) {
                            bufferedSinkBuffer.writeUtf8("DIRTY");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(c5464c.m3115d());
                            bufferedSinkBuffer.writeByte(10);
                        } else {
                            bufferedSinkBuffer.writeUtf8("CLEAN");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(c5464c.m3115d());
                            c5464c.m3126o(bufferedSinkBuffer);
                            bufferedSinkBuffer.writeByte(10);
                        }
                    }
                    C10786q c10786q = C10786q.f26013a;
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
                            AbstractC10771b.m22973a(th3, th4);
                        }
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                if (this.f3648u.exists(this.f3634g)) {
                    this.f3648u.atomicMove(this.f3634g, this.f3636i);
                    this.f3648u.atomicMove(this.f3635h, this.f3634g);
                    this.f3648u.delete(this.f3636i);
                } else {
                    this.f3648u.atomicMove(this.f3635h, this.f3634g);
                }
                this.f3642o = m3088B();
                this.f3641n = 0;
                this.f3643p = false;
                this.f3647t = false;
                C10786q c10786q2 = C10786q.f26013a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.f3639l) {
            try {
                if (this.f3644q && !this.f3645r) {
                    for (C5464c c5464c : (C5464c[]) this.f3637j.values().toArray(new C5464c[0])) {
                        C5463b c5463bM3113b = c5464c.m3113b();
                        if (c5463bM3113b != null) {
                            c5463bM3113b.m3108e();
                        }
                    }
                    m3094I();
                    AbstractC10006d.m20747d(this.f3638k, null, 1, null);
                    BufferedSink bufferedSink = this.f3642o;
                    AbstractC9979u.m20291d(bufferedSink);
                    bufferedSink.close();
                    this.f3642o = null;
                    this.f3645r = true;
                    C10786q c10786q = C10786q.f26013a;
                    return;
                }
                this.f3645r = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: t */
    public final void m3097t() {
        if (this.f3645r) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: u */
    public final void m3098u(C5463b c5463b, boolean z10) {
        synchronized (this.f3639l) {
            C5464c c5464cM3110g = c5463b.m3110g();
            if (!AbstractC9979u.m20289b(c5464cM3110g.m3113b(), c5463b)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z10 || c5464cM3110g.m3119h()) {
                int i10 = this.f3633f;
                for (int i11 = 0; i11 < i10; i11++) {
                    this.f3648u.delete((Path) c5464cM3110g.m3114c().get(i11));
                }
            } else {
                int i12 = this.f3633f;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (c5463b.m3111h()[i13] && !this.f3648u.exists((Path) c5464cM3110g.m3114c().get(i13))) {
                        c5463b.m3104a();
                        return;
                    }
                }
                int i14 = this.f3633f;
                for (int i15 = 0; i15 < i14; i15++) {
                    Path path = (Path) c5464cM3110g.m3114c().get(i15);
                    Path path2 = (Path) c5464cM3110g.m3112a().get(i15);
                    if (this.f3648u.exists(path)) {
                        this.f3648u.atomicMove(path, path2);
                    } else {
                        AbstractC0012i.m24b(this.f3648u, (Path) c5464cM3110g.m3112a().get(i15), false, 2, null);
                    }
                    long j10 = c5464cM3110g.m3116e()[i15];
                    Long size = this.f3648u.metadata(path2).getSize();
                    long jLongValue = size != null ? size.longValue() : 0L;
                    c5464cM3110g.m3116e()[i15] = jLongValue;
                    this.f3640m = (this.f3640m - j10) + jLongValue;
                }
            }
            c5464cM3110g.m3120i(null);
            if (c5464cM3110g.m3119h()) {
                m3092G(c5464cM3110g);
                return;
            }
            this.f3641n++;
            BufferedSink bufferedSink = this.f3642o;
            AbstractC9979u.m20291d(bufferedSink);
            if (z10 || c5464cM3110g.m3118g()) {
                c5464cM3110g.m3123l(true);
                bufferedSink.writeUtf8("CLEAN");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(c5464cM3110g.m3115d());
                c5464cM3110g.m3126o(bufferedSink);
                bufferedSink.writeByte(10);
            } else {
                this.f3637j.remove(c5464cM3110g.m3115d());
                bufferedSink.writeUtf8("REMOVE");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(c5464cM3110g.m3115d());
                bufferedSink.writeByte(10);
            }
            bufferedSink.flush();
            if (this.f3640m > this.f3631d || m3103z()) {
                m3087A();
            }
            C10786q c10786q = C10786q.f26013a;
        }
    }

    /* renamed from: v */
    public final void m3099v() throws IOException {
        close();
        AbstractC0012i.m25c(this.f3648u, this.f3630c);
    }

    /* renamed from: w */
    public final C5463b m3100w(String str) {
        synchronized (this.f3639l) {
            m3097t();
            m3095J(str);
            m3102y();
            C5464c c5464c = (C5464c) this.f3637j.get(str);
            if ((c5464c != null ? c5464c.m3113b() : null) != null) {
                return null;
            }
            if (c5464c != null && c5464c.m3117f() != 0) {
                return null;
            }
            if (!this.f3646s && !this.f3647t) {
                BufferedSink bufferedSink = this.f3642o;
                AbstractC9979u.m20291d(bufferedSink);
                bufferedSink.writeUtf8("DIRTY");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.f3643p) {
                    return null;
                }
                if (c5464c == null) {
                    c5464c = new C5464c(str);
                    this.f3637j.put(str, c5464c);
                }
                C5463b c5463b = new C5463b(c5464c);
                c5464c.m3120i(c5463b);
                return c5463b;
            }
            m3087A();
            return null;
        }
    }

    /* renamed from: x */
    public final C5465d m3101x(String str) {
        C5465d c5465dM3125n;
        synchronized (this.f3639l) {
            m3097t();
            m3095J(str);
            m3102y();
            C5464c c5464c = (C5464c) this.f3637j.get(str);
            if (c5464c != null && (c5465dM3125n = c5464c.m3125n()) != null) {
                this.f3641n++;
                BufferedSink bufferedSink = this.f3642o;
                AbstractC9979u.m20291d(bufferedSink);
                bufferedSink.writeUtf8("READ");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (m3103z()) {
                    m3087A();
                }
                return c5465dM3125n;
            }
            return null;
        }
    }

    /* renamed from: y */
    public final void m3102y() {
        synchronized (this.f3639l) {
            try {
                if (this.f3644q) {
                    return;
                }
                this.f3648u.delete(this.f3635h);
                if (this.f3648u.exists(this.f3636i)) {
                    if (this.f3648u.exists(this.f3634g)) {
                        this.f3648u.delete(this.f3636i);
                    } else {
                        this.f3648u.atomicMove(this.f3636i, this.f3634g);
                    }
                }
                if (this.f3648u.exists(this.f3634g)) {
                    try {
                        m3090E();
                        m3089D();
                        this.f3644q = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            m3099v();
                            this.f3645r = false;
                        } catch (Throwable th) {
                            this.f3645r = false;
                            throw th;
                        }
                    }
                }
                m3096K();
                this.f3644q = true;
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: z */
    public final boolean m3103z() {
        return this.f3641n >= 2000;
    }
}
