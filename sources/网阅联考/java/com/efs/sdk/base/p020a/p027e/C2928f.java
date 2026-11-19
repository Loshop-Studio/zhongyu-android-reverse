package com.efs.sdk.base.p020a.p027e;

import android.content.Context;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p031h.C2943a;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.C2960g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: com.efs.sdk.base.a.e.f */
/* loaded from: classes2.dex */
public final class C2928f {

    /* renamed from: b */
    static FileLock f1107b;

    /* renamed from: a */
    volatile int f1108a;

    /* renamed from: com.efs.sdk.base.a.e.f$a */
    public static class a {

        /* renamed from: a */
        private static final C2928f f1111a = new C2928f(0);
    }

    public /* synthetic */ C2928f(byte b4) {
        this();
    }

    /* renamed from: a */
    public final boolean m2148a() {
        if (this.f1108a == 2) {
            return true;
        }
        if (this.f1108a != 0) {
            return false;
        }
        m2147a(C2921a.m2128a().f1040c);
        return false;
    }

    private C2928f() {
        this.f1108a = 0;
        m2147a(C2921a.m2128a().f1040c);
    }

    /* renamed from: a */
    private synchronized void m2147a(final Context context) {
        C2957d.m2213a("efs.send_log", "tryFileLock start! ", null);
        this.f1108a = 1;
        new Thread(new Runnable() { // from class: com.efs.sdk.base.a.e.f.1
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                FileLock fileLockLock;
                try {
                    File fileM2167a = C2943a.m2167a(context);
                    if (!fileM2167a.exists()) {
                        fileM2167a.mkdirs();
                    }
                    File file = new File(fileM2167a.getPath() + File.separator + "sendlock");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    do {
                        fileLockLock = new FileOutputStream(file).getChannel().lock();
                        C2928f.f1107b = fileLockLock;
                    } while (!fileLockLock.isValid());
                    C2957d.m2213a("efs.send_log", "tryFileLock sendlock sucess! processname: " + C2960g.m2224b(), null);
                    C2928f.this.f1108a = 2;
                } catch (Exception e4) {
                    C2957d.m2213a("efs.send_log", "tryFileLock fail! " + e4.getMessage(), null);
                    C2928f.this.f1108a = 0;
                }
            }
        }).start();
    }
}
