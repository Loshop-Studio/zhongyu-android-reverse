package coil3.util;

import android.os.SystemClock;
import coil3.util.Logger;
import java.io.File;

/* renamed from: coil3.util.b */
/* loaded from: classes3.dex */
public final class C5347b {

    /* renamed from: a */
    public static final C5347b f3157a = new C5347b();

    /* renamed from: b */
    public static final File f3158b = new File("/proc/self/fd");

    /* renamed from: c */
    public static int f3159c = 30;

    /* renamed from: d */
    public static long f3160d = SystemClock.uptimeMillis();

    /* renamed from: e */
    public static boolean f3161e = true;

    /* renamed from: a */
    public final boolean m2922a() {
        int i9 = f3159c;
        f3159c = i9 + 1;
        return i9 >= 30 || SystemClock.uptimeMillis() > f3160d + ((long) 30000);
    }

    /* renamed from: b */
    public final synchronized boolean m2923b(Logger logger) {
        try {
            if (m2922a()) {
                f3159c = 0;
                f3160d = SystemClock.uptimeMillis();
                String[] list = f3158b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z9 = length < 800;
                f3161e = z9;
                if (!z9 && logger != null) {
                    Logger.Level level = Logger.Level.f3149d;
                    if (logger.m2917a().compareTo(level) <= 0) {
                        logger.m2918b("FileDescriptorCounter", level, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3161e;
    }
}
