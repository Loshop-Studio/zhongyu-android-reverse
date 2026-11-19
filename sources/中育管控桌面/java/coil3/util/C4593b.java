package coil3.util;

import android.os.SystemClock;
import coil3.util.Logger;
import java.io.File;

/* renamed from: coil3.util.b */
/* loaded from: classes3.dex */
public final class C4593b {

    /* renamed from: a */
    public static final C4593b f1959a = new C4593b();

    /* renamed from: b */
    public static final File f1960b = new File("/proc/self/fd");

    /* renamed from: c */
    public static int f1961c = 30;

    /* renamed from: d */
    public static long f1962d = SystemClock.uptimeMillis();

    /* renamed from: e */
    public static boolean f1963e = true;

    /* renamed from: a */
    public final boolean m2031a() {
        int i6 = f1961c;
        f1961c = i6 + 1;
        return i6 >= 30 || SystemClock.uptimeMillis() > f1962d + ((long) 30000);
    }

    /* renamed from: b */
    public final synchronized boolean m2032b(Logger logger) {
        try {
            if (m2031a()) {
                f1961c = 0;
                f1962d = SystemClock.uptimeMillis();
                String[] list = f1960b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z6 = length < 800;
                f1963e = z6;
                if (!z6 && logger != null) {
                    Logger.Level level = Logger.Level.f1946d;
                    if (logger.m2023a().compareTo(level) <= 0) {
                        logger.m2024b("FileDescriptorCounter", level, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1963e;
    }
}
