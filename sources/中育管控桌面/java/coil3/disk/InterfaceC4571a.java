package coil3.disk;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;
import okio.FileSystem;
import okio.Path;
import p023c0.AbstractC4465j;
import p023c0.AbstractC4466k;

/* renamed from: coil3.disk.a */
/* loaded from: classes3.dex */
public interface InterfaceC4571a {

    /* renamed from: coil3.disk.a$a */
    public static final class a {

        /* renamed from: a */
        public Path f1676a;

        /* renamed from: f */
        public long f1681f;

        /* renamed from: b */
        public FileSystem f1677b = AbstractC4466k.m1545a();

        /* renamed from: c */
        public double f1678c = 0.02d;

        /* renamed from: d */
        public long f1679d = 10485760;

        /* renamed from: e */
        public long f1680e = 262144000;

        /* renamed from: g */
        public CoroutineContext f1682g = EmptyCoroutineContext.INSTANCE;

        /* renamed from: a */
        public final InterfaceC4571a m1865a() {
            long jCoerceIn;
            Path path = this.f1676a;
            if (path == null) {
                throw new IllegalStateException("directory == null");
            }
            double d6 = this.f1678c;
            if (d6 > 0.0d) {
                try {
                    jCoerceIn = RangesKt.coerceIn((long) (d6 * AbstractC4465j.m1544a(this.f1677b, path)), this.f1679d, this.f1680e);
                } catch (Exception unused) {
                    jCoerceIn = this.f1679d;
                }
            } else {
                jCoerceIn = this.f1681f;
            }
            return new C4572b(jCoerceIn, path, this.f1677b, this.f1682g);
        }

        /* renamed from: b */
        public final a m1866b(Path path) {
            this.f1676a = path;
            return this;
        }
    }

    /* renamed from: coil3.disk.a$b */
    public interface b {
        /* renamed from: a */
        c mo1867a();

        /* renamed from: b */
        void mo1868b();

        Path getData();

        Path getMetadata();
    }

    /* renamed from: coil3.disk.a$c */
    public interface c extends AutoCloseable {
        /* renamed from: e */
        b mo1869e();

        Path getData();

        Path getMetadata();
    }

    /* renamed from: a */
    b mo1863a(String str);

    /* renamed from: b */
    c mo1864b(String str);

    FileSystem getFileSystem();

    boolean remove(String str);
}
