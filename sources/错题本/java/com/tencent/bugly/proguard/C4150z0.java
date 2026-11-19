package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.stormdzh.lame4android.PCMFormat;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C4050ag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p016b0.RunnableC3059a;
import p048e0.ThreadFactoryC5451a;
import p121n1.C6210a;
import p121n1.C6211b;
import p121n1.HandlerThreadC6212c;
import p152r6.InterfaceC6469a;

/* renamed from: com.tencent.bugly.proguard.z0 */
/* loaded from: classes3.dex */
public final class C4150z0 extends Thread {

    /* renamed from: a */
    public final /* synthetic */ int f3918a;

    /* renamed from: b */
    public final /* synthetic */ Object f3919b;

    public /* synthetic */ C4150z0(Object obj, int i) {
        this.f3918a = i;
        this.f3919b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        List<CrashDetailBean> list;
        switch (this.f3918a) {
            case 0:
                C4063at c4063at = (C4063at) this.f3919b;
                if (!C4059ap.m3070a(c4063at.f3591c, "local_crash_lock")) {
                    C4055al.m3025c("Failed to lock file for uploading local crash.", new Object[0]);
                    return;
                }
                C4050ag c4050ag = C4050ag.a.f3475a;
                List<C4050ag.b> listM2977a = C4050ag.m2977a();
                if (listM2977a == null || listM2977a.isEmpty()) {
                    C4055al.m3025c("sla local data is null", new Object[0]);
                } else {
                    C4055al.m3025c("sla load local data list size:%s", Integer.valueOf(listM2977a.size()));
                    Iterator<C4050ag.b> it = listM2977a.iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        C4050ag.b next = it.next();
                        if (next.f3477b < C4059ap.m3076b() - 604800000) {
                            C4055al.m3025c("sla local data is expired:%s", next.f3478c);
                            arrayList.add(next);
                            it.remove();
                        }
                    }
                    C4050ag.m2980d(arrayList);
                    c4050ag.m2984b(listM2977a);
                }
                List<CrashDetailBean> listM3106a = C4062as.m3106a();
                if (listM3106a == null || listM3106a.size() <= 0) {
                    C4055al.m3025c("no crash need to be uploaded at this start", new Object[0]);
                } else {
                    C4055al.m3025c("Size of crash list: %s", Integer.valueOf(listM3106a.size()));
                    int size = listM3106a.size();
                    if (size > 20) {
                        ArrayList arrayList2 = new ArrayList();
                        Collections.sort(listM3106a);
                        for (int i = 0; i < 20; i++) {
                            arrayList2.add(listM3106a.get((size - 1) - i));
                        }
                        list = arrayList2;
                    } else {
                        list = listM3106a;
                    }
                    c4063at.f3592s.m3139a(list, 0L, false, false, false);
                }
                C4059ap.m3082b(c4063at.f3591c, "local_crash_lock");
                return;
            case 1:
                Process.setThreadPriority(9);
                if (((ThreadFactoryC5451a) this.f3919b).f8418b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                    return;
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 2:
                ((InterfaceC6469a) this.f3919b).invoke();
                return;
            default:
                synchronized (((C6210a) this.f3919b).f9937g) {
                    try {
                        if (((C6210a) this.f3919b).f9935e > 0) {
                            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3059a(this, 15), (((C6210a) this.f3919b).f9935e * 1000) + 100);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Process.setThreadPriority(-19);
                while (((C6210a) this.f3919b).m5846c()) {
                    C6210a c6210a = (C6210a) this.f3919b;
                    if (c6210a.f9931a != null && c6210a.m5846c()) {
                        C6210a c6210a2 = (C6210a) this.f3919b;
                        int i8 = c6210a2.f9931a.read(c6210a2.f9933c, 0, c6210a2.f9932b);
                        if (i8 > 0) {
                            C6210a c6210a3 = (C6210a) this.f3919b;
                            HandlerThreadC6212c handlerThreadC6212c = c6210a3.f9934d;
                            short[] sArr = c6210a3.f9933c;
                            List list2 = handlerThreadC6212c.f9943d;
                            C6211b c6211b = new C6211b();
                            c6211b.f9938a = (short[]) sArr.clone();
                            c6211b.f9939b = i8;
                            list2.add(c6211b);
                            short[] sArr2 = ((C6210a) this.f3919b).f9933c;
                            if (sArr2 != null) {
                                int i9 = 0;
                                for (int i10 = 0; i10 < i8; i10++) {
                                    short s8 = sArr2[i10];
                                    i9 += s8 * s8;
                                }
                                if (i8 > 0) {
                                    Math.sqrt(i9 / i8);
                                }
                            }
                            PCMFormat pCMFormat = C6210a.f9930h;
                        }
                    }
                }
                ((C6210a) this.f3919b).m5844a();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4150z0(ThreadFactoryC5451a threadFactoryC5451a, Runnable runnable, String str) {
        super(runnable, str);
        this.f3918a = 1;
        this.f3919b = threadFactoryC5451a;
    }
}
