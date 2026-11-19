package coil3.util;

import android.os.SystemClock;
import coil3.util.Logger;
import java.io.File;

/* renamed from: coil3.util.b */
/* loaded from: classes3.dex */
public final class C5212b {

    /* renamed from: a */
    public static final C5212b f3275a = new C5212b();

    /* renamed from: b */
    public static final File f3276b = new File("/proc/self/fd");

    /* renamed from: c */
    public static int f3277c = 30;

    /* renamed from: d */
    public static long f3278d = SystemClock.uptimeMillis();

    /* renamed from: e */
    public static boolean f3279e = true;

    /* renamed from: a */
    public final boolean m3205a() {
        int i10 = f3277c;
        f3277c = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > f3278d + ((long) 30000);
    }

    /* renamed from: b */
    public final synchronized boolean m3206b(Logger logger) {
        try {
            if (m3205a()) {
                f3277c = 0;
                f3278d = SystemClock.uptimeMillis();
                String[] list = f3276b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z9 = length < 800;
                f3279e = z9;
                if (!z9 && logger != null) {
                    Logger.Level level = Logger.Level.f3262d;
                    if (logger.m3197a().compareTo(level) <= 0) {
                        logger.m3198b("FileDescriptorCounter", level, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3279e;
    }
}
