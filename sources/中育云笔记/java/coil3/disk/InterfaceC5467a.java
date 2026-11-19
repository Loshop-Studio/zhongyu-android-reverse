package coil3.disk;

import androidx.camera.video.AudioStats;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import okio.FileSystem;
import okio.Path;
import p001a0.AbstractC0013j;
import p001a0.AbstractC0014k;
import p265nd.AbstractC10410o;

/* renamed from: coil3.disk.a */
/* loaded from: classes3.dex */
public interface InterfaceC5467a {

    /* renamed from: coil3.disk.a$a */
    public static final class a {

        /* renamed from: a */
        public Path f3667a;

        /* renamed from: f */
        public long f3672f;

        /* renamed from: b */
        public FileSystem f3668b = AbstractC0014k.m28a();

        /* renamed from: c */
        public double f3669c = 0.02d;

        /* renamed from: d */
        public long f3670d = 10485760;

        /* renamed from: e */
        public long f3671e = 262144000;

        /* renamed from: g */
        public InterfaceC9945d f3673g = EmptyCoroutineContext.f23351c;

        /* renamed from: a */
        public final InterfaceC5467a m3131a() {
            long jM21763p;
            Path path = this.f3667a;
            if (path == null) {
                throw new IllegalStateException("directory == null");
            }
            double d10 = this.f3669c;
            if (d10 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                try {
                    jM21763p = AbstractC10410o.m21763p((long) (d10 * AbstractC0013j.m27a(this.f3668b, path)), this.f3670d, this.f3671e);
                } catch (Exception unused) {
                    jM21763p = this.f3670d;
                }
            } else {
                jM21763p = this.f3672f;
            }
            return new C5468b(jM21763p, path, this.f3668b, this.f3673g);
        }

        /* renamed from: b */
        public final a m3132b(Path path) {
            this.f3667a = path;
            return this;
        }
    }

    /* renamed from: coil3.disk.a$b */
    public interface b {
        /* renamed from: a */
        c mo3133a();

        /* renamed from: b */
        void mo3134b();

        Path getData();

        Path getMetadata();
    }

    /* renamed from: coil3.disk.a$c */
    public interface c extends AutoCloseable {
        Path getData();

        Path getMetadata();

        /* renamed from: o */
        b mo3135o();
    }

    /* renamed from: a */
    b mo3129a(String str);

    /* renamed from: b */
    c mo3130b(String str);

    FileSystem getFileSystem();
}
