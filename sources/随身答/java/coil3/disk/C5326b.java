package coil3.disk;

import coil3.disk.DiskLruCache;
import coil3.disk.InterfaceC5325a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;

/* renamed from: coil3.disk.b */
/* loaded from: classes3.dex */
public final class C5326b implements InterfaceC5325a {

    /* renamed from: e */
    public static final a f2927e = new a(null);

    /* renamed from: a */
    public final long f2928a;

    /* renamed from: b */
    public final Path f2929b;

    /* renamed from: c */
    public final FileSystem f2930c;

    /* renamed from: d */
    public final DiskLruCache f2931d;

    /* renamed from: coil3.disk.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: coil3.disk.b$b */
    public static final class b implements InterfaceC5325a.b {

        /* renamed from: a */
        public final DiskLruCache.C5321b f2932a;

        public b(DiskLruCache.C5321b c5321b) {
            this.f2932a = c5321b;
        }

        @Override // coil3.disk.InterfaceC5325a.b
        /* renamed from: b */
        public void mo2765b() {
            this.f2932a.m2735a();
        }

        @Override // coil3.disk.InterfaceC5325a.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c mo2764a() {
            DiskLruCache.C5323d c5323dM2737c = this.f2932a.m2737c();
            if (c5323dM2737c != null) {
                return new c(c5323dM2737c);
            }
            return null;
        }

        @Override // coil3.disk.InterfaceC5325a.b
        public Path getData() {
            return this.f2932a.m2740f(1);
        }

        @Override // coil3.disk.InterfaceC5325a.b
        public Path getMetadata() {
            return this.f2932a.m2740f(0);
        }
    }

    /* renamed from: coil3.disk.b$c */
    public static final class c implements InterfaceC5325a.c {

        /* renamed from: a */
        public final DiskLruCache.C5323d f2933a;

        public c(DiskLruCache.C5323d c5323d) {
            this.f2933a = c5323d;
        }

        @Override // coil3.disk.InterfaceC5325a.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b mo2766e() {
            DiskLruCache.C5321b c5321bM2758a = this.f2933a.m2758a();
            if (c5321bM2758a != null) {
                return new b(c5321bM2758a);
            }
            return null;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.f2933a.close();
        }

        @Override // coil3.disk.InterfaceC5325a.c
        public Path getData() {
            return this.f2933a.m2759c(1);
        }

        @Override // coil3.disk.InterfaceC5325a.c
        public Path getMetadata() {
            return this.f2933a.m2759c(0);
        }
    }

    public C5326b(long j9, Path path, FileSystem fileSystem, CoroutineContext coroutineContext) {
        this.f2928a = j9;
        this.f2929b = path;
        this.f2930c = fileSystem;
        this.f2931d = new DiskLruCache(getFileSystem(), m2767c(), coroutineContext, m2768d(), 3, 2);
    }

    @Override // coil3.disk.InterfaceC5325a
    /* renamed from: a */
    public InterfaceC5325a.b mo2760a(String str) {
        DiskLruCache.C5321b c5321bM2731w = this.f2931d.m2731w(m2769e(str));
        if (c5321bM2731w != null) {
            return new b(c5321bM2731w);
        }
        return null;
    }

    @Override // coil3.disk.InterfaceC5325a
    /* renamed from: b */
    public InterfaceC5325a.c mo2761b(String str) {
        DiskLruCache.C5323d c5323dM2732x = this.f2931d.m2732x(m2769e(str));
        if (c5323dM2732x != null) {
            return new c(c5323dM2732x);
        }
        return null;
    }

    /* renamed from: c */
    public Path m2767c() {
        return this.f2929b;
    }

    /* renamed from: d */
    public long m2768d() {
        return this.f2928a;
    }

    /* renamed from: e */
    public final String m2769e(String str) {
        return ByteString.INSTANCE.encodeUtf8(str).sha256().hex();
    }

    @Override // coil3.disk.InterfaceC5325a
    public FileSystem getFileSystem() {
        return this.f2930c;
    }
}
