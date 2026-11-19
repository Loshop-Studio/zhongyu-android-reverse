package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.Window;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.anr.TraceFileHelper;
import com.tencent.bugly.proguard.C4052ai;
import com.tencent.bugly.proguard.C4055al;
import com.tencent.bugly.proguard.C4060aq;
import com.tencent.bugly.proguard.C4068ay;
import com.tencent.bugly.proguard.C4135s;
import com.tencent.bugly.proguard.FileObserverC4072b1;
import com.zykj.mistake.widget.LineBaseProView;
import com.zykj.mistake.widget.StemWebView;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC6014x;
import p054e7.AbstractC5469a;
import p054e7.C5474f;
import p075h6.InterfaceC5631c;
import p185v7.AbstractC6683l;

/* renamed from: com.blankj.utilcode.util.a0 */
/* loaded from: classes2.dex */
public final class RunnableC3379a0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2117a;

    /* renamed from: b */
    public Object f2118b;

    /* renamed from: c */
    public final /* synthetic */ Object f2119c;

    public /* synthetic */ RunnableC3379a0(int i, Object obj, Object obj2) {
        this.f2117a = i;
        this.f2118b = obj;
        this.f2119c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2117a) {
            case 0:
                try {
                    Window window = ((Activity) this.f2118b).getWindow();
                    if (window != null) {
                        window.setSoftInputMode(((Integer) this.f2119c).intValue());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ((Runnable) this.f2118b).run();
                synchronized (((C4052ai) this.f2119c).f3495j) {
                    C4052ai.m2995b((C4052ai) this.f2119c);
                }
                return;
            case 2:
                try {
                    C4055al.m3020a(C4060aq.f3547d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                    synchronized (((C4060aq) this.f2118b)) {
                        ((C4060aq) this.f2119c).f3549b.registerReceiver(C4060aq.f3547d, ((C4060aq) this.f2119c).f3548a, "com.tencent.bugly.BuglyBroadcastReceiver.permission", null);
                    }
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            case 3:
                C4068ay c4068ay = ((FileObserverC4072b1) this.f2119c).f3646b;
                String str = (String) this.f2118b;
                if (c4068ay.m3195a(true)) {
                    try {
                        C4055al.m3025c("read trace first dump for create time!", new Object[0]);
                        TraceFileHelper.C4036a firstDumpInfo = TraceFileHelper.readFirstDumpInfo(str, false);
                        long jCurrentTimeMillis = firstDumpInfo != null ? firstDumpInfo.f3347c : -1L;
                        if (jCurrentTimeMillis == -1) {
                            C4055al.m3026d("trace dump fail could not get time!", new Object[0]);
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        if (c4068ay.m3194a(jCurrentTimeMillis)) {
                            return;
                        }
                        c4068ay.m3193a(jCurrentTimeMillis, str);
                        return;
                    } catch (Throwable th2) {
                        if (!C4055al.m3022a(th2)) {
                            th2.printStackTrace();
                        }
                        C4055al.m3027e("handle anr error %s", th2.getClass().toString());
                        return;
                    }
                }
                return;
            case 4:
                C4135s.m3363c((Context) this.f2118b, (BuglyStrategy) this.f2119c);
                return;
            case 5:
                ((StemWebView) this.f2118b).m4481b((String) this.f2119c);
                return;
            case 6:
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.f2118b).run();
                    } catch (Throwable th3) {
                        AbstractC6014x.m5645p(EmptyCoroutineContext.INSTANCE, th3);
                    }
                    Runnable runnableM4845d = ((C5474f) this.f2119c).m4845d();
                    if (runnableM4845d == null) {
                        return;
                    }
                    try {
                        this.f2118b = runnableM4845d;
                        i++;
                        if (i >= 16) {
                            C5474f c5474f = (C5474f) this.f2119c;
                            if (AbstractC5469a.m4834j(c5474f.f8456b, c5474f)) {
                                C5474f c5474f2 = (C5474f) this.f2119c;
                                AbstractC5469a.m4833i(c5474f2.f8456b, c5474f2, this);
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        C5474f c5474f3 = (C5474f) this.f2119c;
                        synchronized (c5474f3.f8460f) {
                            C5474f.f8454g.decrementAndGet(c5474f3);
                            throw th4;
                        }
                    }
                }
            case 7:
                LineBaseProView lineBaseProView = (LineBaseProView) this.f2119c;
                int[] iArr = (int[]) this.f2118b;
                int[] iArr2 = new int[iArr.length];
                for (int i8 = 0; i8 < iArr.length; i8++) {
                    iArr2[i8] = iArr[i8];
                }
                lineBaseProView.f8066o.setShader(new LinearGradient(0.0f, 0.0f, lineBaseProView.f8052a, 0.0f, iArr2, (float[]) null, Shader.TileMode.CLAMP));
                return;
            default:
                AbstractC6683l.m6374n((InterfaceC5631c) this.f2118b).resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a((Throwable) this.f2119c)));
                return;
        }
    }

    public /* synthetic */ RunnableC3379a0(int i, Object obj, boolean z8, Object obj2) {
        this.f2117a = i;
        this.f2119c = obj;
        this.f2118b = obj2;
    }
}
