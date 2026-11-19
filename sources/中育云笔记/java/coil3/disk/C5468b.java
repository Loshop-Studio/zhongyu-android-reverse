package coil3.disk;

import coil3.disk.DiskLruCache;
import coil3.disk.InterfaceC5467a;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;

/* renamed from: coil3.disk.b */
/* loaded from: classes3.dex */
public final class C5468b implements InterfaceC5467a {

    /* renamed from: e */
    public static final a f3674e = new a(null);

    /* renamed from: a */
    public final long f3675a;

    /* renamed from: b */
    public final Path f3676b;

    /* renamed from: c */
    public final FileSystem f3677c;

    /* renamed from: d */
    public final DiskLruCache f3678d;

    /* renamed from: coil3.disk.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: coil3.disk.b$b */
    public static final class b implements InterfaceC5467a.b {

        /* renamed from: a */
        public final DiskLruCache.C5463b f3679a;

        public b(DiskLruCache.C5463b c5463b) {
            this.f3679a = c5463b;
        }

        @Override // coil3.disk.InterfaceC5467a.b
        /* renamed from: b */
        public void mo3134b() {
            this.f3679a.m3104a();
        }

        @Override // coil3.disk.InterfaceC5467a.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c mo3133a() {
            DiskLruCache.C5465d c5465dM3106c = this.f3679a.m3106c();
            if (c5465dM3106c != null) {
                return new c(c5465dM3106c);
            }
            return null;
        }

        @Override // coil3.disk.InterfaceC5467a.b
        public Path getData() {
            return this.f3679a.m3109f(1);
        }

        @Override // coil3.disk.InterfaceC5467a.b
        public Path getMetadata() {
            return this.f3679a.m3109f(0);
        }
    }

    /* renamed from: coil3.disk.b$c */
    public static final class c implements InterfaceC5467a.c {

        /* renamed from: c */
        public final DiskLruCache.C5465d f3680c;

        public c(DiskLruCache.C5465d c5465d) {
            this.f3680c = c5465d;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.f3680c.close();
        }

        @Override // coil3.disk.InterfaceC5467a.c
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public b mo3135o() {
            DiskLruCache.C5463b c5463bM3127e = this.f3680c.m3127e();
            if (c5463bM3127e != null) {
                return new b(c5463bM3127e);
            }
            return null;
        }

        @Override // coil3.disk.InterfaceC5467a.c
        public Path getData() {
            return this.f3680c.m3128f(1);
        }

        @Override // coil3.disk.InterfaceC5467a.c
        public Path getMetadata() {
            return this.f3680c.m3128f(0);
        }
    }

    public C5468b(long j10, Path path, FileSystem fileSystem, InterfaceC9945d interfaceC9945d) {
        this.f3675a = j10;
        this.f3676b = path;
        this.f3677c = fileSystem;
        // Native journal app version 3, two slots: <sha256>.0 metadata and <sha256>.1 data.
        this.f3678d = new DiskLruCache(getFileSystem(), m3136c(), interfaceC9945d, m3137d(), 3, 2);
    }

    @Override // coil3.disk.InterfaceC5467a
    /* renamed from: a */
    public InterfaceC5467a.b mo3129a(String str) {
        DiskLruCache.C5463b c5463bM3100w = this.f3678d.m3100w(m3138e(str));
        if (c5463bM3100w != null) {
            return new b(c5463bM3100w);
        }
        return null;
    }

    @Override // coil3.disk.InterfaceC5467a
    /* renamed from: b */
    public InterfaceC5467a.c mo3130b(String str) {
        DiskLruCache.C5465d c5465dM3101x = this.f3678d.m3101x(m3138e(str));
        if (c5465dM3101x != null) {
            return new c(c5465dM3101x);
        }
        return null;
    }

    /* renamed from: c */
    public Path m3136c() {
        return this.f3676b;
    }

    /* renamed from: d */
    public long m3137d() {
        return this.f3675a;
    }

    /* renamed from: e */
    public final String m3138e(String str) {
        return ByteString.Companion.encodeUtf8(str).sha256().hex();
    }

    @Override // coil3.disk.InterfaceC5467a
    public FileSystem getFileSystem() {
        return this.f3677c;
    }
}
