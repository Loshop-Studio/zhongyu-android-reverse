package com.p053ta.p054a.p057c;

import com.p053ta.p054a.p056b.C1679e;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.ta.a.c.c */
/* loaded from: classes.dex */
public class C1685c {

    /* renamed from: a */
    private static File f7443a;

    /* renamed from: a */
    private static FileChannel f7444a;

    /* renamed from: a */
    private static FileLock f7445a;

    /* renamed from: b */
    private static File f7446b;

    /* renamed from: c */
    public static synchronized void m5760c() {
        C1688f.m5774e();
        if (f7443a == null) {
            f7443a = new File(C1679e.m5745c());
        }
        if (!f7443a.exists()) {
            try {
                f7443a.createNewFile();
            } catch (Exception unused) {
                return;
            }
        }
        if (f7444a == null) {
            try {
                f7444a = new RandomAccessFile(f7443a, "rw").getChannel();
            } catch (Exception unused2) {
                return;
            }
        }
        try {
            f7445a = f7444a.lock();
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void m5761d() {
        /*
            java.lang.Class<com.ta.a.c.c> r0 = com.p053ta.p054a.p057c.C1685c.class
            monitor-enter(r0)
            com.p053ta.p054a.p057c.C1688f.m5774e()     // Catch: java.lang.Throwable -> L25
            java.nio.channels.FileLock r1 = com.p053ta.p054a.p057c.C1685c.f7445a     // Catch: java.lang.Throwable -> L25
            r2 = 0
            if (r1 == 0) goto L15
            r1.release()     // Catch: java.lang.Exception -> Le java.lang.Throwable -> L11
        Le:
            com.p053ta.p054a.p057c.C1685c.f7445a = r2     // Catch: java.lang.Throwable -> L25
            goto L15
        L11:
            r1 = move-exception
            com.p053ta.p054a.p057c.C1685c.f7445a = r2     // Catch: java.lang.Throwable -> L25
            throw r1     // Catch: java.lang.Throwable -> L25
        L15:
            java.nio.channels.FileChannel r1 = com.p053ta.p054a.p057c.C1685c.f7444a     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L23
            r1.close()     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L1f
        L1c:
            com.p053ta.p054a.p057c.C1685c.f7444a = r2     // Catch: java.lang.Throwable -> L25
            goto L23
        L1f:
            r1 = move-exception
            com.p053ta.p054a.p057c.C1685c.f7444a = r2     // Catch: java.lang.Throwable -> L25
            throw r1     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r0)
            return
        L25:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p053ta.p054a.p057c.C1685c.m5761d():void");
    }
}
