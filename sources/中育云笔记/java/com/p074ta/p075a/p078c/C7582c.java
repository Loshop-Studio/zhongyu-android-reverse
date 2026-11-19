package com.p074ta.p075a.p078c;

import com.p074ta.p075a.p077b.C7576e;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.ta.a.c.c */
/* loaded from: classes5.dex */
public class C7582c {

    /* renamed from: a */
    private static File f12841a;

    /* renamed from: a */
    private static FileChannel f12842a;

    /* renamed from: a */
    private static FileLock f12843a;

    /* renamed from: b */
    private static File f12844b;

    /* renamed from: c */
    public static synchronized void m9786c() {
        try {
            C7585f.m9800e();
            if (f12841a == null) {
                f12841a = new File(C7576e.m9771c());
            }
            if (!f12841a.exists()) {
                try {
                    f12841a.createNewFile();
                } catch (Exception unused) {
                    return;
                }
            }
            if (f12842a == null) {
                try {
                    f12842a = new RandomAccessFile(f12841a, "rw").getChannel();
                } catch (Exception unused2) {
                    return;
                }
            }
            try {
                f12843a = f12842a.lock();
            } catch (Throwable unused3) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: d */
    public static synchronized void m9787d() {
        try {
            C7585f.m9800e();
            FileLock fileLock = f12843a;
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    f12843a = null;
                    throw th;
                }
                f12843a = null;
            }
            FileChannel fileChannel = f12842a;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    f12842a = null;
                    throw th2;
                }
                f12842a = null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
