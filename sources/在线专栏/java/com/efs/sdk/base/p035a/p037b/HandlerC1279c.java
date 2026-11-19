package com.efs.sdk.base.p035a.p037b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.p035a.p037b.C1277a;
import com.efs.sdk.base.p035a.p038c.p039a.C1288c;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p046h.C1315a;
import com.efs.sdk.base.p035a.p046h.C1321b;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p047a.C1316a;
import com.efs.sdk.base.p035a.p046h.p047a.C1319d;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.c */
/* loaded from: classes.dex */
public final class HandlerC1279c extends Handler implements Runnable {

    /* renamed from: a */
    public boolean f7001a;

    /* renamed from: com.efs.sdk.base.a.b.c$a */
    static class a {

        /* renamed from: a */
        private static final HandlerC1279c f7002a = new HandlerC1279c(0);
    }

    /* synthetic */ HandlerC1279c(byte b4) {
        this();
    }

    /* renamed from: a */
    public static HandlerC1279c m5438a() {
        return a.f7002a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 2) {
            C1319d.m5536a(this);
            return;
        }
        C1329d.m5572a("efs.cache", "disk listener not support command: " + message.what, null);
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        C1277a unused = C1277a.b.f6999a;
        File fileM5533f = C1315a.m5533f(C1293a.m5487a().f7010c, C1293a.m5487a().f7008a);
        if (fileM5533f.exists()) {
            for (File file : C1321b.m5549d(fileM5533f)) {
                if (C1277a.m5431a(file.getName())) {
                    C1277a.m5433c(file);
                }
            }
        }
        C1288c c1288cM5456a = C1288c.m5456a();
        String str = c1288cM5456a.f7035d.f7030e.containsKey("disk_bytes") ? c1288cM5456a.f7035d.f7030e.get("disk_bytes") : "4194304";
        long j4 = Long.parseLong(TextUtils.isEmpty(str) ? "4194304" : str);
        long jM5548c = C1321b.m5548c(C1315a.m5533f(C1293a.m5487a().f7010c, C1293a.m5487a().f7008a)) + C1321b.m5548c(C1315a.m5531d(C1293a.m5487a().f7010c, C1293a.m5487a().f7008a));
        boolean z3 = jM5548c < j4;
        this.f7001a = z3;
        if (!z3) {
            C1329d.m5572a("efs.cache", "Cache Limited! curr " + jM5548c + "byte, max " + j4 + " byte.", null);
        }
        sendEmptyMessageDelayed(2, 600000L);
    }

    private HandlerC1279c() {
        super(C1316a.f7105a.getLooper());
        this.f7001a = true;
        sendEmptyMessageDelayed(2, 60000L);
    }
}
