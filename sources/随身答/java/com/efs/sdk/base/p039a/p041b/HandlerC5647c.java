package com.efs.sdk.base.p039a.p041b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.p039a.p041b.C5645a;
import com.efs.sdk.base.p039a.p042c.p043a.C5656c;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p050h.C5683a;
import com.efs.sdk.base.p039a.p050h.C5689b;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p051a.C5684a;
import com.efs.sdk.base.p039a.p050h.p051a.C5687d;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.c */
/* loaded from: classes3.dex */
public final class HandlerC5647c extends Handler implements Runnable {

    /* renamed from: a */
    public boolean f4635a;

    /* renamed from: com.efs.sdk.base.a.b.c$a */
    public static class a {

        /* renamed from: a */
        private static final HandlerC5647c f4636a = new HandlerC5647c(0);
    }

    public /* synthetic */ HandlerC5647c(byte b10) {
        this();
    }

    /* renamed from: a */
    public static HandlerC5647c m4048a() {
        return a.f4636a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 2) {
            C5687d.m4146a(this);
            return;
        }
        C5697d.m4182a("efs.cache", "disk listener not support command: " + message.what, null);
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        C5645a unused = C5645a.b.f4633a;
        File fileM4143f = C5683a.m4143f(C5661a.m4097a().f4644c, C5661a.m4097a().f4642a);
        if (fileM4143f.exists()) {
            for (File file : C5689b.m4159d(fileM4143f)) {
                if (C5645a.m4041a(file.getName())) {
                    C5645a.m4043c(file);
                }
            }
        }
        C5656c c5656cM4066a = C5656c.m4066a();
        String str = c5656cM4066a.f4669d.f4664e.containsKey("disk_bytes") ? c5656cM4066a.f4669d.f4664e.get("disk_bytes") : "4194304";
        long j9 = Long.parseLong(TextUtils.isEmpty(str) ? "4194304" : str);
        long jM4158c = C5689b.m4158c(C5683a.m4143f(C5661a.m4097a().f4644c, C5661a.m4097a().f4642a)) + C5689b.m4158c(C5683a.m4141d(C5661a.m4097a().f4644c, C5661a.m4097a().f4642a));
        boolean z9 = jM4158c < j9;
        this.f4635a = z9;
        if (!z9) {
            C5697d.m4182a("efs.cache", "Cache Limited! curr " + jM4158c + "byte, max " + j9 + " byte.", null);
        }
        sendEmptyMessageDelayed(2, 600000L);
    }

    private HandlerC5647c() {
        super(C5684a.f4739a.getLooper());
        this.f4635a = true;
        sendEmptyMessageDelayed(2, 60000L);
    }
}
