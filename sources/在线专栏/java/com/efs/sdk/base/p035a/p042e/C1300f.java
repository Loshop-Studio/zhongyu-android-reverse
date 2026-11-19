package com.efs.sdk.base.p035a.p042e;

import android.content.Context;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p046h.C1315a;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.C1332g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: com.efs.sdk.base.a.e.f */
/* loaded from: classes.dex */
public final class C1300f {

    /* renamed from: b */
    static FileLock f7077b;

    /* renamed from: a */
    volatile int f7078a;

    /* renamed from: com.efs.sdk.base.a.e.f$a */
    public static class a {

        /* renamed from: a */
        private static final C1300f f7081a = new C1300f(0);
    }

    /* synthetic */ C1300f(byte b4) {
        this();
    }

    /* renamed from: a */
    public final boolean m5507a() {
        if (this.f7078a == 2) {
            return true;
        }
        if (this.f7078a != 0) {
            return false;
        }
        m5506a(C1293a.m5487a().f7010c);
        return false;
    }

    private C1300f() {
        this.f7078a = 0;
        m5506a(C1293a.m5487a().f7010c);
    }

    /* renamed from: a */
    private synchronized void m5506a(final Context context) {
        C1329d.m5572a("efs.send_log", "tryFileLock start! ", null);
        this.f7078a = 1;
        new Thread(new Runnable() { // from class: com.efs.sdk.base.a.e.f.1
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                FileLock fileLockLock;
                try {
                    File fileM5526a = C1315a.m5526a(context);
                    if (!fileM5526a.exists()) {
                        fileM5526a.mkdirs();
                    }
                    File file = new File(fileM5526a.getPath() + File.separator + "sendlock");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    do {
                        fileLockLock = new FileOutputStream(file).getChannel().lock();
                        C1300f.f7077b = fileLockLock;
                    } while (!fileLockLock.isValid());
                    C1329d.m5572a("efs.send_log", "tryFileLock sendlock sucess! processname: " + C1332g.m5583b(), null);
                    C1300f.this.f7078a = 2;
                } catch (Exception e4) {
                    C1329d.m5572a("efs.send_log", "tryFileLock fail! " + e4.getMessage(), null);
                    C1300f.this.f7078a = 0;
                }
            }
        }).start();
    }
}
