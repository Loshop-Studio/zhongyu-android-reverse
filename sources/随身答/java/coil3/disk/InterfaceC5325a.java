package coil3.disk;

import androidx.camera.video.AudioStats;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;
import okio.FileSystem;
import okio.Path;
import p090e0.AbstractC7811i;
import p090e0.AbstractC7812j;

/* renamed from: coil3.disk.a */
/* loaded from: classes3.dex */
public interface InterfaceC5325a {

    /* renamed from: coil3.disk.a$a */
    public static final class a {

        /* renamed from: a */
        public Path f2920a;

        /* renamed from: f */
        public long f2925f;

        /* renamed from: b */
        public FileSystem f2921b = AbstractC7812j.m12195a();

        /* renamed from: c */
        public double f2922c = 0.02d;

        /* renamed from: d */
        public long f2923d = 10485760;

        /* renamed from: e */
        public long f2924e = 262144000;

        /* renamed from: g */
        public CoroutineContext f2926g = EmptyCoroutineContext.INSTANCE;

        /* renamed from: a */
        public final InterfaceC5325a m2762a() {
            long jCoerceIn;
            Path path = this.f2920a;
            if (path == null) {
                throw new IllegalStateException("directory == null");
            }
            double d10 = this.f2922c;
            if (d10 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                try {
                    jCoerceIn = RangesKt.coerceIn((long) (d10 * AbstractC7811i.m12194a(this.f2921b, path)), this.f2923d, this.f2924e);
                } catch (Exception unused) {
                    jCoerceIn = this.f2923d;
                }
            } else {
                jCoerceIn = this.f2925f;
            }
            return new C5326b(jCoerceIn, path, this.f2921b, this.f2926g);
        }

        /* renamed from: b */
        public final a m2763b(Path path) {
            this.f2920a = path;
            return this;
        }
    }

    /* renamed from: coil3.disk.a$b */
    public interface b {
        /* renamed from: a */
        c mo2764a();

        /* renamed from: b */
        void mo2765b();

        Path getData();

        Path getMetadata();
    }

    /* renamed from: coil3.disk.a$c */
    public interface c extends AutoCloseable {
        /* renamed from: e */
        b mo2766e();

        Path getData();

        Path getMetadata();
    }

    /* renamed from: a */
    b mo2760a(String str);

    /* renamed from: b */
    c mo2761b(String str);

    FileSystem getFileSystem();
}
