package com.tencent.bugly.proguard;

import android.os.FileObserver;
import android.support.v4.media.AbstractC0037f;
import com.blankj.utilcode.util.RunnableC3379a0;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;

/* renamed from: com.tencent.bugly.proguard.b1 */
/* loaded from: classes3.dex */
public final class FileObserverC4072b1 extends FileObserver {

    /* renamed from: a */
    public final /* synthetic */ int f3645a = 0;

    /* renamed from: b */
    public final /* synthetic */ C4068ay f3646b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileObserverC4072b1(C4068ay c4068ay) {
        super("/data/anr/", 8);
        this.f3646b = c4068ay;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        switch (this.f3645a) {
            case 0:
                if (str != null) {
                    String strConcat = "/data/anr/".concat(str);
                    C4055al.m3026d("watching file %s", strConcat);
                    if (!strConcat.contains("trace")) {
                        C4055al.m3026d("not anr file %s", strConcat);
                        break;
                    } else {
                        this.f3646b.f3634d.m3014a(new RunnableC3379a0(3, this, false, strConcat));
                        break;
                    }
                }
                break;
            default:
                if (str != null) {
                    C4068ay c4068ay = this.f3646b;
                    C4055al.m3026d("observe file, dir:%s fileName:%s", c4068ay.f3635e, str);
                    if (!str.startsWith("manual_bugly_trace_") || !str.endsWith(".txt")) {
                        C4055al.m3025c("not manual trace file, ignore.", new Object[0]);
                        break;
                    } else if (!c4068ay.f3631a.get()) {
                        C4055al.m3025c("proc is not in anr, just ignore", new Object[0]);
                        break;
                    } else if (!c4068ay.f3633c.m2896a()) {
                        C4055al.m3025c("Found background anr, resend sigquit later.", new Object[0]);
                        c4068ay.m3193a(C4056am.m3028a(str, "manual_bugly_trace_", ".txt"), AbstractC0037f.m92q(new StringBuilder(), c4068ay.f3635e, "/", str));
                        C4055al.m3025c("Finish handling one anr, now resend sigquit.", new Object[0]);
                        NativeCrashHandler.getInstance().resendSigquit();
                        break;
                    } else {
                        C4055al.m3025c("Found foreground anr, resend sigquit immediately.", new Object[0]);
                        NativeCrashHandler.getInstance().resendSigquit();
                        c4068ay.m3193a(C4056am.m3028a(str, "manual_bugly_trace_", ".txt"), AbstractC0037f.m92q(new StringBuilder(), c4068ay.f3635e, "/", str));
                        C4055al.m3025c("Finish handling one anr.", new Object[0]);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileObserverC4072b1(C4068ay c4068ay, String str) {
        super(str, 8);
        this.f3646b = c4068ay;
    }
}
