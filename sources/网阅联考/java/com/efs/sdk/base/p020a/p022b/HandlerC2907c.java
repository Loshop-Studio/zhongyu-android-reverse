package com.efs.sdk.base.p020a.p022b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.p020a.p022b.C2905a;
import com.efs.sdk.base.p020a.p023c.p024a.C2916c;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p031h.C2943a;
import com.efs.sdk.base.p020a.p031h.C2949b;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p032a.C2944a;
import com.efs.sdk.base.p020a.p031h.p032a.C2947d;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.c */
/* loaded from: classes2.dex */
public final class HandlerC2907c extends Handler implements Runnable {

    /* renamed from: a */
    public boolean f1031a;

    /* renamed from: com.efs.sdk.base.a.b.c$a */
    public static class a {

        /* renamed from: a */
        private static final HandlerC2907c f1032a = new HandlerC2907c(0);
    }

    public /* synthetic */ HandlerC2907c(byte b4) {
        this();
    }

    /* renamed from: a */
    public static HandlerC2907c m2079a() {
        return a.f1032a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 2) {
            C2947d.m2177a(this);
            return;
        }
        C2957d.m2213a("efs.cache", "disk listener not support command: " + message.what, null);
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        C2905a unused = C2905a.b.f1029a;
        File fileM2174f = C2943a.m2174f(C2921a.m2128a().f1040c, C2921a.m2128a().f1038a);
        if (fileM2174f.exists()) {
            for (File file : C2949b.m2190d(fileM2174f)) {
                if (C2905a.m2072a(file.getName())) {
                    C2905a.m2074c(file);
                }
            }
        }
        C2916c c2916cM2097a = C2916c.m2097a();
        String str = c2916cM2097a.f1065d.f1060e.containsKey("disk_bytes") ? c2916cM2097a.f1065d.f1060e.get("disk_bytes") : "4194304";
        long j4 = Long.parseLong(TextUtils.isEmpty(str) ? "4194304" : str);
        long jM2189c = C2949b.m2189c(C2943a.m2174f(C2921a.m2128a().f1040c, C2921a.m2128a().f1038a)) + C2949b.m2189c(C2943a.m2172d(C2921a.m2128a().f1040c, C2921a.m2128a().f1038a));
        boolean z3 = jM2189c < j4;
        this.f1031a = z3;
        if (!z3) {
            C2957d.m2213a("efs.cache", "Cache Limited! curr " + jM2189c + "byte, max " + j4 + " byte.", null);
        }
        sendEmptyMessageDelayed(2, 600000L);
    }

    private HandlerC2907c() {
        super(C2944a.f1135a.getLooper());
        this.f1031a = true;
        sendEmptyMessageDelayed(2, 60000L);
    }
}
