package coil3.disk;

import coil3.disk.DiskLruCache;
import coil3.disk.InterfaceC4571a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;

/* renamed from: coil3.disk.b */
/* loaded from: classes3.dex */
public final class C4572b implements InterfaceC4571a {

    /* renamed from: e */
    public static final a f1683e = new a(null);

    /* renamed from: a */
    public final long f1684a;

    /* renamed from: b */
    public final Path f1685b;

    /* renamed from: c */
    public final FileSystem f1686c;

    /* renamed from: d */
    public final DiskLruCache f1687d;

    /* renamed from: coil3.disk.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: coil3.disk.b$b */
    public static final class b implements InterfaceC4571a.b {

        /* renamed from: a */
        public final DiskLruCache.C4567b f1688a;

        public b(DiskLruCache.C4567b c4567b) {
            this.f1688a = c4567b;
        }

        @Override // coil3.disk.InterfaceC4571a.b
        /* renamed from: b */
        public void mo1868b() {
            this.f1688a.m1838a();
        }

        @Override // coil3.disk.InterfaceC4571a.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c mo1867a() {
            DiskLruCache.C4569d c4569dM1840c = this.f1688a.m1840c();
            if (c4569dM1840c != null) {
                return new c(c4569dM1840c);
            }
            return null;
        }

        @Override // coil3.disk.InterfaceC4571a.b
        public Path getData() {
            return this.f1688a.m1843f(1);
        }

        @Override // coil3.disk.InterfaceC4571a.b
        public Path getMetadata() {
            return this.f1688a.m1843f(0);
        }
    }

    /* renamed from: coil3.disk.b$c */
    public static final class c implements InterfaceC4571a.c {

        /* renamed from: a */
        public final DiskLruCache.C4569d f1689a;

        public c(DiskLruCache.C4569d c4569d) {
            this.f1689a = c4569d;
        }

        @Override // coil3.disk.InterfaceC4571a.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b mo1869e() {
            DiskLruCache.C4567b c4567bM1861a = this.f1689a.m1861a();
            if (c4567bM1861a != null) {
                return new b(c4567bM1861a);
            }
            return null;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.f1689a.close();
        }

        @Override // coil3.disk.InterfaceC4571a.c
        public Path getData() {
            return this.f1689a.m1862c(1);
        }

        @Override // coil3.disk.InterfaceC4571a.c
        public Path getMetadata() {
            return this.f1689a.m1862c(0);
        }
    }

    public C4572b(long j6, Path path, FileSystem fileSystem, CoroutineContext coroutineContext) {
        this.f1684a = j6;
        this.f1685b = path;
        this.f1686c = fileSystem;
        this.f1687d = new DiskLruCache(getFileSystem(), m1870c(), coroutineContext, m1871d(), 3, 2);
    }

    @Override // coil3.disk.InterfaceC4571a
    /* renamed from: a */
    public InterfaceC4571a.b mo1863a(String str) {
        DiskLruCache.C4567b c4567bM1834w = this.f1687d.m1834w(m1872e(str));
        if (c4567bM1834w != null) {
            return new b(c4567bM1834w);
        }
        return null;
    }

    @Override // coil3.disk.InterfaceC4571a
    /* renamed from: b */
    public InterfaceC4571a.c mo1864b(String str) {
        DiskLruCache.C4569d c4569dM1835x = this.f1687d.m1835x(m1872e(str));
        if (c4569dM1835x != null) {
            return new c(c4569dM1835x);
        }
        return null;
    }

    /* renamed from: c */
    public Path m1870c() {
        return this.f1685b;
    }

    /* renamed from: d */
    public long m1871d() {
        return this.f1684a;
    }

    /* renamed from: e */
    public final String m1872e(String str) {
        return ByteString.INSTANCE.encodeUtf8(str).sha256().hex();
    }

    @Override // coil3.disk.InterfaceC4571a
    public FileSystem getFileSystem() {
        return this.f1686c;
    }

    @Override // coil3.disk.InterfaceC4571a
    public boolean remove(String str) {
        return this.f1687d.m1825G(m1872e(str));
    }
}
