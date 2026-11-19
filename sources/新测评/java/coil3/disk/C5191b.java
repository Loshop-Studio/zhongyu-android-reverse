package coil3.disk;

import coil3.disk.DiskLruCache;
import coil3.disk.InterfaceC5190a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;

/* renamed from: coil3.disk.b */
/* loaded from: classes3.dex */
public final class C5191b implements InterfaceC5190a {

    /* renamed from: e */
    public static final a f2999e = new a(null);

    /* renamed from: a */
    public final long f3000a;

    /* renamed from: b */
    public final Path f3001b;

    /* renamed from: c */
    public final FileSystem f3002c;

    /* renamed from: d */
    public final DiskLruCache f3003d;

    /* renamed from: coil3.disk.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: coil3.disk.b$b */
    public static final class b implements InterfaceC5190a.b {

        /* renamed from: a */
        public final DiskLruCache.C5186b f3004a;

        public b(DiskLruCache.C5186b c5186b) {
            this.f3004a = c5186b;
        }

        @Override // coil3.disk.InterfaceC5190a.b
        /* renamed from: b */
        public void mo3040b() {
            this.f3004a.m3010a();
        }

        @Override // coil3.disk.InterfaceC5190a.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c mo3039a() {
            DiskLruCache.C5188d c5188dM3012c = this.f3004a.m3012c();
            if (c5188dM3012c != null) {
                return new c(c5188dM3012c);
            }
            return null;
        }

        @Override // coil3.disk.InterfaceC5190a.b
        public Path getData() {
            return this.f3004a.m3015f(1);
        }

        @Override // coil3.disk.InterfaceC5190a.b
        public Path getMetadata() {
            return this.f3004a.m3015f(0);
        }
    }

    /* renamed from: coil3.disk.b$c */
    public static final class c implements InterfaceC5190a.c {

        /* renamed from: a */
        public final DiskLruCache.C5188d f3005a;

        public c(DiskLruCache.C5188d c5188d) {
            this.f3005a = c5188d;
        }

        @Override // coil3.disk.InterfaceC5190a.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b mo3041d() {
            DiskLruCache.C5186b c5186bM3033a = this.f3005a.m3033a();
            if (c5186bM3033a != null) {
                return new b(c5186bM3033a);
            }
            return null;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.f3005a.close();
        }

        @Override // coil3.disk.InterfaceC5190a.c
        public Path getData() {
            return this.f3005a.m3034f(1);
        }

        @Override // coil3.disk.InterfaceC5190a.c
        public Path getMetadata() {
            return this.f3005a.m3034f(0);
        }
    }

    public C5191b(long j10, Path path, FileSystem fileSystem, CoroutineContext coroutineContext) {
        this.f3000a = j10;
        this.f3001b = path;
        this.f3002c = fileSystem;
        this.f3003d = new DiskLruCache(getFileSystem(), m3042c(), coroutineContext, m3043d(), 3, 2);
    }

    @Override // coil3.disk.InterfaceC5190a
    /* renamed from: a */
    public InterfaceC5190a.b mo3035a(String str) {
        DiskLruCache.C5186b c5186bM3006w = this.f3003d.m3006w(m3044e(str));
        if (c5186bM3006w != null) {
            return new b(c5186bM3006w);
        }
        return null;
    }

    @Override // coil3.disk.InterfaceC5190a
    /* renamed from: b */
    public InterfaceC5190a.c mo3036b(String str) {
        DiskLruCache.C5188d c5188dM3007x = this.f3003d.m3007x(m3044e(str));
        if (c5188dM3007x != null) {
            return new c(c5188dM3007x);
        }
        return null;
    }

    /* renamed from: c */
    public Path m3042c() {
        return this.f3001b;
    }

    /* renamed from: d */
    public long m3043d() {
        return this.f3000a;
    }

    /* renamed from: e */
    public final String m3044e(String str) {
        return ByteString.INSTANCE.encodeUtf8(str).sha256().hex();
    }

    @Override // coil3.disk.InterfaceC5190a
    public FileSystem getFileSystem() {
        return this.f3002c;
    }
}
