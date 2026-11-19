package coil3.util;

import android.os.SystemClock;
import coil3.util.Logger;
import com.alibaba.sdk.android.tbrest.rest.RestConstants;
import java.io.File;

/* renamed from: coil3.util.b */
/* loaded from: classes3.dex */
public final class C5489b {

    /* renamed from: a */
    public static final C5489b f3950a = new C5489b();

    /* renamed from: b */
    public static final File f3951b = new File("/proc/self/fd");

    /* renamed from: c */
    public static int f3952c = 30;

    /* renamed from: d */
    public static long f3953d = SystemClock.uptimeMillis();

    /* renamed from: e */
    public static boolean f3954e = true;

    /* renamed from: a */
    public final boolean m3299a() {
        int i10 = f3952c;
        f3952c = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > f3953d + ((long) RestConstants.G_MAX_READ_CONNECTION_STREAM_TIME_OUT);
    }

    /* renamed from: b */
    public final synchronized boolean m3300b(Logger logger) {
        try {
            if (m3299a()) {
                f3952c = 0;
                f3953d = SystemClock.uptimeMillis();
                String[] list = f3951b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z10 = length < 800;
                f3954e = z10;
                if (!z10 && logger != null) {
                    Logger.Level level = Logger.Level.f3937f;
                    if (logger.m3291a().compareTo(level) <= 0) {
                        logger.m3292b("FileDescriptorCounter", level, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3954e;
    }
}
