package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.text.TextUtils;
import androidx.collection.SieveCacheKt;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.anr.TraceFileHelper;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.bugly.proguard.ay */
/* loaded from: classes3.dex */
public final class C4068ay {

    /* renamed from: f */
    public static C4068ay f3630f;

    /* renamed from: b */
    public final ActivityManager f3632b;

    /* renamed from: c */
    final C4044aa f3633c;

    /* renamed from: d */
    final C4054ak f3634d;

    /* renamed from: e */
    String f3635e;

    /* renamed from: g */
    private final Context f3636g;

    /* renamed from: h */
    private final C4046ac f3637h;

    /* renamed from: i */
    private final C4062as f3638i;

    /* renamed from: k */
    private FileObserver f3640k;

    /* renamed from: m */
    private C4079bg f3642m;

    /* renamed from: n */
    private int f3643n;

    /* renamed from: a */
    public final AtomicBoolean f3631a = new AtomicBoolean(false);

    /* renamed from: j */
    private final Object f3639j = new Object();

    /* renamed from: l */
    private boolean f3641l = true;

    /* renamed from: o */
    private long f3644o = 0;

    public C4068ay(Context context, C4046ac c4046ac, C4044aa c4044aa, C4054ak c4054ak, C4062as c4062as) {
        Context contextM3051a = C4059ap.m3051a(context);
        this.f3636g = contextM3051a;
        this.f3632b = (ActivityManager) contextM3051a.getSystemService("activity");
        if (C4059ap.m3084b(NativeCrashHandler.getDumpFilePath())) {
            this.f3635e = context.getDir("bugly", 0).getAbsolutePath();
        } else {
            this.f3635e = NativeCrashHandler.getDumpFilePath();
        }
        this.f3633c = c4044aa;
        this.f3634d = c4054ak;
        this.f3637h = c4046ac;
        this.f3638i = c4062as;
    }

    /* renamed from: c */
    private synchronized void m3185c() {
        if (m3189e()) {
            C4055al.m3026d("start when started!", new Object[0]);
            return;
        }
        FileObserverC4072b1 fileObserverC4072b1 = new FileObserverC4072b1(this);
        this.f3640k = fileObserverC4072b1;
        try {
            fileObserverC4072b1.startWatching();
            C4055al.m3021a("start anr monitor!", new Object[0]);
            this.f3634d.m3014a(new RunnableC4097c1(this, 0));
        } catch (Throwable th) {
            this.f3640k = null;
            C4055al.m3026d("start anr monitor failed!", new Object[0]);
            if (C4055al.m3022a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: d */
    private synchronized void m3187d() {
        if (!m3189e()) {
            C4055al.m3026d("close when closed!", new Object[0]);
            return;
        }
        try {
            this.f3640k.stopWatching();
            this.f3640k = null;
            C4055al.m3026d("close anr monitor!", new Object[0]);
        } catch (Throwable th) {
            C4055al.m3026d("stop anr monitor failed!", new Object[0]);
            if (C4055al.m3022a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private synchronized boolean m3189e() {
        return this.f3640k != null;
    }

    /* renamed from: f */
    private synchronized boolean m3190f() {
        return this.f3641l;
    }

    /* renamed from: g */
    private synchronized void m3191g() {
        if (m3189e()) {
            C4055al.m3026d("start when started!", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(this.f3635e)) {
            return;
        }
        synchronized (this.f3639j) {
            try {
                C4079bg c4079bg = this.f3642m;
                if (c4079bg == null || !c4079bg.isAlive()) {
                    C4079bg c4079bg2 = new C4079bg();
                    this.f3642m = c4079bg2;
                    boolean z8 = this.f3633c.f3400S;
                    c4079bg2.f3678b = z8;
                    C4055al.m3025c("set record stack trace enable:".concat(String.valueOf(z8)), new Object[0]);
                    C4079bg c4079bg3 = this.f3642m;
                    StringBuilder sb = new StringBuilder("Bugly-ThreadMonitor");
                    int i = this.f3643n;
                    this.f3643n = i + 1;
                    sb.append(i);
                    c4079bg3.setName(sb.toString());
                    this.f3642m.m3226b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        FileObserverC4072b1 fileObserverC4072b1 = new FileObserverC4072b1(this, this.f3635e);
        this.f3640k = fileObserverC4072b1;
        try {
            fileObserverC4072b1.startWatching();
            C4055al.m3021a("startWatchingPrivateAnrDir! dumFilePath is %s", this.f3635e);
            this.f3634d.m3014a(new RunnableC4097c1(this, 1));
        } catch (Throwable th2) {
            this.f3640k = null;
            C4055al.m3026d("startWatchingPrivateAnrDir failed!", new Object[0]);
            if (C4055al.m3022a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: h */
    private synchronized void m3192h() {
        if (!m3189e()) {
            C4055al.m3026d("close when closed!", new Object[0]);
            return;
        }
        synchronized (this.f3639j) {
            try {
                C4079bg c4079bg = this.f3642m;
                if (c4079bg != null) {
                    c4079bg.m3225a();
                    this.f3642m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C4055al.m3021a("stopWatchingPrivateAnrDir", new Object[0]);
        try {
            this.f3640k.stopWatching();
            this.f3640k = null;
            C4055al.m3026d("close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            C4055al.m3026d("stop anr monitor failed!", new Object[0]);
            if (C4055al.m3022a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m3197b(boolean z8) {
        m3188d(z8);
        boolean zM3190f = m3190f();
        C4046ac c4046acM2951a = C4046ac.m2951a();
        if (c4046acM2951a != null) {
            zM3190f = zM3190f && c4046acM2951a.m2960c().f3274f;
        }
        if (zM3190f != m3189e()) {
            C4055al.m3021a("anr changed to %b", Boolean.valueOf(zM3190f));
            m3186c(zM3190f);
        }
    }

    /* renamed from: a */
    public static synchronized C4068ay m3180a() {
        return f3630f;
    }

    /* renamed from: a */
    private CrashDetailBean m3179a(C4067ax c4067ax) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.f3294C = C4045ab.m2939j();
            crashDetailBean.f3295D = C4045ab.m2935f();
            crashDetailBean.f3296E = C4045ab.m2941l();
            crashDetailBean.f3297F = this.f3633c.m2912k();
            crashDetailBean.f3298G = this.f3633c.m2911j();
            crashDetailBean.f3299H = this.f3633c.m2913l();
            crashDetailBean.f3300I = C4045ab.m2929b(this.f3636g);
            crashDetailBean.f3301J = C4045ab.m2936g();
            crashDetailBean.f3302K = C4045ab.m2937h();
            crashDetailBean.f3320b = 3;
            crashDetailBean.f3323e = this.f3633c.m2907g();
            C4044aa c4044aa = this.f3633c;
            crashDetailBean.f3324f = c4044aa.f3445o;
            crashDetailBean.f3325g = c4044aa.m2917q();
            crashDetailBean.f3331m = this.f3633c.m2905f();
            crashDetailBean.f3332n = "ANR_EXCEPTION";
            crashDetailBean.f3333o = c4067ax.f3628f;
            crashDetailBean.f3335q = c4067ax.f3629g;
            HashMap map = new HashMap();
            crashDetailBean.f3311T = map;
            map.put("BUGLY_CR_01", c4067ax.f3627e);
            String str = crashDetailBean.f3335q;
            int iIndexOf = str != null ? str.indexOf(SignParameters.NEW_LINE) : -1;
            crashDetailBean.f3334p = iIndexOf > 0 ? crashDetailBean.f3335q.substring(0, iIndexOf) : "GET_FAIL";
            crashDetailBean.f3336r = c4067ax.f3625c;
            String str2 = crashDetailBean.f3335q;
            if (str2 != null) {
                crashDetailBean.f3339u = C4059ap.m3086c(str2.getBytes());
            }
            crashDetailBean.f3344z = c4067ax.f3624b;
            crashDetailBean.f3292A = c4067ax.f3623a;
            crashDetailBean.f3293B = "main(1)";
            crashDetailBean.f3303L = this.f3633c.m2919s();
            crashDetailBean.f3326h = this.f3633c.m2916p();
            crashDetailBean.f3327i = this.f3633c.m2892A();
            crashDetailBean.f3340v = c4067ax.f3626d;
            C4044aa c4044aa2 = this.f3633c;
            crashDetailBean.f3307P = c4044aa2.f3451u;
            crashDetailBean.f3308Q = c4044aa2.f3407a;
            crashDetailBean.f3309R = c4044aa2.m2896a();
            crashDetailBean.f3312U = this.f3633c.m2926z();
            C4044aa c4044aa3 = this.f3633c;
            crashDetailBean.f3313V = c4044aa3.f3454x;
            crashDetailBean.f3314W = c4044aa3.m2920t();
            crashDetailBean.f3315X = this.f3633c.m2925y();
            crashDetailBean.f3343y = C4058ao.m3040a();
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C4055al.m3022a(th)) {
                th.printStackTrace();
            }
            return crashDetailBean;
        }
    }

    /* renamed from: b */
    public final synchronized void m3196b() {
        C4055al.m3026d("customer decides whether to open or close.", new Object[0]);
    }

    /* renamed from: d */
    private synchronized void m3188d(boolean z8) {
        if (this.f3641l != z8) {
            C4055al.m3021a("user change anr %b", Boolean.valueOf(z8));
            this.f3641l = z8;
        }
    }

    /* renamed from: c */
    private synchronized void m3186c(boolean z8) {
        if (z8) {
            m3191g();
        } else {
            m3192h();
        }
    }

    /* renamed from: a */
    private static boolean m3184a(String str, String str2, String str3) {
        Map<String, String[]> map;
        TraceFileHelper.C4036a targetDumpInfo = TraceFileHelper.readTargetDumpInfo(str3, str, true);
        if (targetDumpInfo != null && (map = targetDumpInfo.f3348d) != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder(1024);
            String[] strArr = targetDumpInfo.f3348d.get("main");
            if (strArr != null && strArr.length >= 3) {
                sb.append("\"main\" tid=");
                sb.append(strArr[2]);
                sb.append(" :\n");
                sb.append(strArr[0]);
                sb.append(SignParameters.NEW_LINE);
                sb.append(strArr[1]);
                sb.append("\n\n");
            }
            for (Map.Entry<String, String[]> entry : targetDumpInfo.f3348d.entrySet()) {
                if (!entry.getKey().equals("main") && entry.getValue() != null && entry.getValue().length >= 3) {
                    sb.append("\"");
                    sb.append(entry.getKey());
                    sb.append("\" tid=");
                    sb.append(entry.getValue()[2]);
                    sb.append(" :\n");
                    sb.append(entry.getValue()[0]);
                    sb.append(SignParameters.NEW_LINE);
                    sb.append(entry.getValue()[1]);
                    sb.append("\n\n");
                }
            }
            return C4056am.m3033a(str2, sb.toString(), sb.length() * 2);
        }
        C4055al.m3027e("not found trace dump for %s", str3);
        return false;
    }

    /* renamed from: a */
    private static String m3181a(List<C4073ba> list, long j7) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder(4096);
            sb.append("\n>>>>> 以下为anr过程中主线程堆栈记录，可根据堆栈出现次数推测在该堆栈阻塞的时间，出现次数越多对anr贡献越大，越可能是造成anr的原因 >>>>>\n\n>>>>> Thread Stack Traces Records Start >>>>>\n");
            for (int i = 0; i < list.size(); i++) {
                C4073ba c4073ba = list.get(i);
                sb.append("Thread name:");
                sb.append(c4073ba.f3647a);
                sb.append(SignParameters.NEW_LINE);
                long j8 = c4073ba.f3648b - j7;
                String str = j8 <= 0 ? "before " : "after ";
                sb.append("Got ");
                sb.append(str);
                sb.append("anr:");
                sb.append(Math.abs(j8));
                sb.append("ms\n");
                sb.append(c4073ba.f3649c);
                sb.append(SignParameters.NEW_LINE);
                if (sb.length() * 2 >= 101376) {
                    break;
                }
            }
            sb.append("\n<<<<< Thread Stack Traces Records End <<<<<\n");
            return sb.toString();
        }
        return "main thread stack not enable";
    }

    /* renamed from: a */
    public final boolean m3195a(boolean z8) {
        boolean zCompareAndSet = this.f3631a.compareAndSet(!z8, z8);
        C4055al.m3025c("tryChangeAnrState to %s, success:%s", Boolean.valueOf(z8), Boolean.valueOf(zCompareAndSet));
        return zCompareAndSet;
    }

    /* renamed from: a */
    public final void m3193a(long j7, String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfoM3198a;
        List<C4073ba> listM3222c;
        try {
            C4055al.m3025c("anr time:%s", Long.valueOf(j7));
            synchronized (this.f3639j) {
                try {
                    if (this.f3642m != null) {
                        C4055al.m3025c("Disable record main stack trace.", new Object[0]);
                        this.f3642m.m3227c();
                    }
                } finally {
                }
            }
            String strM3061a = C4059ap.m3061a(Looper.getMainLooper().getThread());
            Map<String, String> mapM3067a = C4059ap.m3067a(this.f3633c.f3399R, C4063at.f3577h);
            if (this.f3633c.m2896a()) {
                boolean z8 = C4045ab.m2944o() || C4045ab.m2945p();
                C4055al.m3025c("isAnrCrashDevice:%s", Boolean.valueOf(z8));
                if (!z8) {
                    processErrorStateInfoM3198a = C4069az.m3198a(this.f3632b, 21000L);
                } else {
                    processErrorStateInfoM3198a = C4069az.m3198a(this.f3632b, 0L);
                }
            } else {
                processErrorStateInfoM3198a = C4069az.m3198a(this.f3632b, 0L);
            }
            if (processErrorStateInfoM3198a == null) {
                C4055al.m3025c("proc state is invisible or not my proc!", new Object[0]);
                return;
            }
            C4067ax c4067ax = new C4067ax();
            c4067ax.f3625c = j7;
            c4067ax.f3623a = processErrorStateInfoM3198a.processName;
            c4067ax.f3628f = processErrorStateInfoM3198a.shortMsg;
            c4067ax.f3627e = processErrorStateInfoM3198a.longMsg;
            c4067ax.f3624b = mapM3067a;
            c4067ax.f3629g = strM3061a;
            if (TextUtils.isEmpty(strM3061a)) {
                c4067ax.f3629g = "main stack is null , some error may be encountered.";
            }
            Long lValueOf = Long.valueOf(c4067ax.f3625c);
            String str2 = c4067ax.f3626d;
            String str3 = c4067ax.f3623a;
            String str4 = c4067ax.f3629g;
            String str5 = c4067ax.f3628f;
            String str6 = c4067ax.f3627e;
            Map<String, String> map = c4067ax.f3624b;
            C4055al.m3025c("anr time:%d\ntrace file:%s\nproc:%s\nmain stack:%s\nshort msg:%s\nlong msg:%s\n threads:%d", lValueOf, str2, str3, str4, str5, str6, Integer.valueOf(map == null ? 0 : map.size()));
            C4055al.m3021a("found visible anr , start to upload!", new Object[0]);
            C4055al.m3025c("trace file:%s", str);
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                File file = new File(this.f3635e, "bugly_trace_" + j7 + ".txt");
                C4055al.m3025c("trace file exists", new Object[0]);
                if (str.startsWith("/data/anr/")) {
                    C4055al.m3021a("backup trace isOK:%s", Boolean.valueOf(m3184a(str, file.getAbsolutePath(), c4067ax.f3623a)));
                } else {
                    C4055al.m3021a("trace file rename :%s", Boolean.valueOf(new File(str).renameTo(file)));
                }
                synchronized (this.f3639j) {
                    try {
                        C4079bg c4079bg = this.f3642m;
                        listM3222c = c4079bg != null ? c4079bg.f3677a.m3222c() : null;
                    } finally {
                    }
                }
                if (listM3222c != null) {
                    String strM3181a = m3181a(listM3222c, j7);
                    C4055al.m3025c("save main stack trace", new Object[0]);
                    C4056am.m3031a(file, strM3181a, SieveCacheKt.NodeLinkMask, true);
                }
                c4067ax.f3626d = file.getAbsolutePath();
            } else {
                C4055al.m3025c("trace file is null or not exists, just ignore", new Object[0]);
            }
            CrashDetailBean crashDetailBeanM3179a = m3179a(c4067ax);
            C4063at.m3143a().m3148a(crashDetailBeanM3179a);
            if (crashDetailBeanM3179a.f3318a >= 0) {
                C4055al.m3021a("backup anr record success!", new Object[0]);
            } else {
                C4055al.m3026d("backup anr record fail!", new Object[0]);
            }
            C4062as.m3111a("ANR", C4059ap.m3058a(j7), c4067ax.f3623a, "main", c4067ax.f3629g, crashDetailBeanM3179a);
            if (!this.f3638i.m3140a(crashDetailBeanM3179a, !C4045ab.m2947r())) {
                this.f3638i.m3142b(crashDetailBeanM3179a, true);
            }
            this.f3638i.m3138a(crashDetailBeanM3179a);
            synchronized (this.f3639j) {
                try {
                    if (this.f3642m != null) {
                        C4055al.m3025c("Finish anr process.", new Object[0]);
                        this.f3642m.m3228d();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                C4055al.m3024b(th);
            } finally {
                m3195a(false);
            }
        }
    }

    /* renamed from: a */
    public final boolean m3194a(long j7) {
        if (Math.abs(j7 - this.f3644o) < 10000) {
            C4055al.m3026d("should not process ANR too Fre in %dms", 10000);
            return true;
        }
        this.f3644o = j7;
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m3182a(C4068ay c4068ay) {
        long jCurrentTimeMillis = (System.currentTimeMillis() + C4063at.f3579j) - C4059ap.m3076b();
        C4056am.m3030a(c4068ay.f3635e, "bugly_trace_", ".txt", jCurrentTimeMillis);
        C4056am.m3030a(c4068ay.f3635e, "manual_bugly_trace_", ".txt", jCurrentTimeMillis);
        C4056am.m3030a(c4068ay.f3635e, "main_stack_record_", ".txt", jCurrentTimeMillis);
        C4056am.m3030a(c4068ay.f3635e, "main_stack_record_", ".txt.merged", jCurrentTimeMillis);
    }
}
