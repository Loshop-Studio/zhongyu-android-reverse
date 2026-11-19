package p129j2;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import p118i2.AbstractC7657e;

/* renamed from: j2.e */
/* loaded from: classes4.dex */
public abstract class AbstractC7785e {

    /* renamed from: a */
    public static File f13423a;

    /* renamed from: b */
    public static FileChannel f13424b;

    /* renamed from: c */
    public static FileLock f13425c;

    /* renamed from: d */
    public static File f13426d;

    /* renamed from: e */
    public static FileChannel f13427e;

    /* renamed from: f */
    public static FileLock f13428f;

    /* renamed from: a */
    public static synchronized boolean m13167a() {
        try {
            AbstractC7788h.m13183i();
            if (f13426d == null) {
                f13426d = new File(AbstractC7657e.m12719i());
            }
            if (!f13426d.exists()) {
                try {
                    f13426d.createNewFile();
                } catch (Exception unused) {
                    return false;
                }
            }
            if (f13427e == null) {
                try {
                    f13427e = new RandomAccessFile(f13426d, "rw").getChannel();
                } catch (Exception unused2) {
                    return false;
                }
            }
            try {
                FileLock fileLockTryLock = f13427e.tryLock();
                if (fileLockTryLock != null) {
                    f13428f = fileLockTryLock;
                    return true;
                }
            } catch (Throwable unused3) {
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public static synchronized void m13168b() {
        try {
            AbstractC7788h.m13183i();
            if (f13423a == null) {
                f13423a = new File(AbstractC7657e.m12717g());
            }
            if (!f13423a.exists()) {
                try {
                    f13423a.createNewFile();
                } catch (Exception unused) {
                    return;
                }
            }
            if (f13424b == null) {
                try {
                    f13424b = new RandomAccessFile(f13423a, "rw").getChannel();
                } catch (Exception unused2) {
                    return;
                }
            }
            try {
                f13425c = f13424b.lock();
            } catch (Throwable unused3) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public static synchronized void m13169c() {
        try {
            AbstractC7788h.m13183i();
            FileLock fileLock = f13425c;
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    f13425c = null;
                    throw th;
                }
                f13425c = null;
            }
            FileChannel fileChannel = f13424b;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    f13424b = null;
                    throw th2;
                }
                f13424b = null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* renamed from: d */
    public static synchronized void m13170d() {
        try {
            AbstractC7788h.m13183i();
            FileLock fileLock = f13428f;
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    f13428f = null;
                    throw th;
                }
                f13428f = null;
            }
            FileChannel fileChannel = f13427e;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    f13427e = null;
                    throw th2;
                }
                f13427e = null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
