package coil3.disk;

import androidx.camera.video.AudioStats;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;
import okio.FileSystem;
import okio.Path;
import p030c0.AbstractC5085j;
import p030c0.AbstractC5086k;

/* renamed from: coil3.disk.a */
/* loaded from: classes3.dex */
public interface InterfaceC5190a {

    /* renamed from: coil3.disk.a$a */
    public static final class a {

        /* renamed from: a */
        public Path f2992a;

        /* renamed from: f */
        public long f2997f;

        /* renamed from: b */
        public FileSystem f2993b = AbstractC5086k.m2687a();

        /* renamed from: c */
        public double f2994c = 0.02d;

        /* renamed from: d */
        public long f2995d = 10485760;

        /* renamed from: e */
        public long f2996e = 262144000;

        /* renamed from: g */
        public CoroutineContext f2998g = EmptyCoroutineContext.INSTANCE;

        /* renamed from: a */
        public final InterfaceC5190a m3037a() {
            long jCoerceIn;
            Path path = this.f2992a;
            if (path == null) {
                throw new IllegalStateException("directory == null");
            }
            double d10 = this.f2994c;
            if (d10 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                try {
                    jCoerceIn = RangesKt.coerceIn((long) (d10 * AbstractC5085j.m2686a(this.f2993b, path)), this.f2995d, this.f2996e);
                } catch (Exception unused) {
                    jCoerceIn = this.f2995d;
                }
            } else {
                jCoerceIn = this.f2997f;
            }
            return new C5191b(jCoerceIn, path, this.f2993b, this.f2998g);
        }

        /* renamed from: b */
        public final a m3038b(Path path) {
            this.f2992a = path;
            return this;
        }
    }

    /* renamed from: coil3.disk.a$b */
    public interface b {
        /* renamed from: a */
        c mo3039a();

        /* renamed from: b */
        void mo3040b();

        Path getData();

        Path getMetadata();
    }

    /* renamed from: coil3.disk.a$c */
    public interface c extends AutoCloseable {
        /* renamed from: d */
        b mo3041d();

        Path getData();

        Path getMetadata();
    }

    /* renamed from: a */
    b mo3035a(String str);

    /* renamed from: b */
    c mo3036b(String str);

    FileSystem getFileSystem();
}
