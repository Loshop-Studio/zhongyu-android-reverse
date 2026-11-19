package com.efs.sdk.base.p039a.p046e;

import android.content.Context;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p050h.C5683a;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.C5700g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: com.efs.sdk.base.a.e.f */
/* loaded from: classes3.dex */
public final class C5668f {

    /* renamed from: b */
    static FileLock f4711b;

    /* renamed from: a */
    volatile int f4712a;

    /* renamed from: com.efs.sdk.base.a.e.f$a */
    public static class a {

        /* renamed from: a */
        private static final C5668f f4715a = new C5668f(0);
    }

    public /* synthetic */ C5668f(byte b10) {
        this();
    }

    /* renamed from: a */
    public final boolean m4117a() {
        if (this.f4712a == 2) {
            return true;
        }
        if (this.f4712a != 0) {
            return false;
        }
        m4116a(C5661a.m4097a().f4644c);
        return false;
    }

    private C5668f() {
        this.f4712a = 0;
        m4116a(C5661a.m4097a().f4644c);
    }

    /* renamed from: a */
    private synchronized void m4116a(final Context context) {
        C5697d.m4182a("efs.send_log", "tryFileLock start! ", null);
        this.f4712a = 1;
        new Thread(new Runnable() { // from class: com.efs.sdk.base.a.e.f.1
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                FileLock fileLockLock;
                try {
                    File fileM4136a = C5683a.m4136a(context);
                    if (!fileM4136a.exists()) {
                        fileM4136a.mkdirs();
                    }
                    File file = new File(fileM4136a.getPath() + File.separator + "sendlock");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    do {
                        fileLockLock = new FileOutputStream(file).getChannel().lock();
                        C5668f.f4711b = fileLockLock;
                    } while (!fileLockLock.isValid());
                    C5697d.m4182a("efs.send_log", "tryFileLock sendlock sucess! processname: " + C5700g.m4193b(), null);
                    C5668f.this.f4712a = 2;
                } catch (Exception e10) {
                    C5697d.m4182a("efs.send_log", "tryFileLock fail! " + e10.getMessage(), null);
                    C5668f.this.f4712a = 0;
                }
            }
        }).start();
    }
}
