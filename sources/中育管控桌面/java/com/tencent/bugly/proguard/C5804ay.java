package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.text.TextUtils;
import androidx.collection.SieveCacheKt;
import androidx.work.WorkRequest;
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
public final class C5804ay {

    /* renamed from: f */
    public static C5804ay f4145f;

    /* renamed from: b */
    public final ActivityManager f4147b;

    /* renamed from: c */
    final C5780aa f4148c;

    /* renamed from: d */
    final C5790ak f4149d;

    /* renamed from: e */
    String f4150e;

    /* renamed from: g */
    private final Context f4151g;

    /* renamed from: h */
    private final C5782ac f4152h;

    /* renamed from: i */
    private final C5798as f4153i;

    /* renamed from: k */
    private FileObserver f4155k;

    /* renamed from: m */
    private C5813bg f4157m;

    /* renamed from: n */
    private int f4158n;

    /* renamed from: a */
    public final AtomicBoolean f4146a = new AtomicBoolean(false);

    /* renamed from: j */
    private final Object f4154j = new Object();

    /* renamed from: l */
    private boolean f4156l = true;

    /* renamed from: o */
    private long f4159o = 0;

    public C5804ay(Context context, C5782ac c5782ac, C5780aa c5780aa, C5790ak c5790ak, C5798as c5798as) {
        Context contextM3958a = C5795ap.m3958a(context);
        this.f4151g = contextM3958a;
        this.f4147b = (ActivityManager) contextM3958a.getSystemService("activity");
        if (C5795ap.m3991b(NativeCrashHandler.getDumpFilePath())) {
            this.f4150e = context.getDir("bugly", 0).getAbsolutePath();
        } else {
            this.f4150e = NativeCrashHandler.getDumpFilePath();
        }
        this.f4148c = c5780aa;
        this.f4149d = c5790ak;
        this.f4152h = c5782ac;
        this.f4153i = c5798as;
    }

    /* renamed from: c */
    private synchronized void m4093c() {
        if (m4097e()) {
            C5791al.m3933d("start when started!", new Object[0]);
            return;
        }
        FileObserver fileObserver = new FileObserver("/data/anr/") { // from class: com.tencent.bugly.proguard.ay.1
            @Override // android.os.FileObserver
            public final void onEvent(int i6, String str) {
                if (str == null) {
                    return;
                }
                final String strConcat = "/data/anr/".concat(str);
                C5791al.m3933d("watching file %s", strConcat);
                if (strConcat.contains("trace")) {
                    C5804ay.this.f4149d.m3921a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5804ay c5804ay = C5804ay.this;
                            String str2 = strConcat;
                            if (c5804ay.m4103a(true)) {
                                try {
                                    C5791al.m3932c("read trace first dump for create time!", new Object[0]);
                                    TraceFileHelper.C5775a firstDumpInfo = TraceFileHelper.readFirstDumpInfo(str2, false);
                                    long jCurrentTimeMillis = firstDumpInfo != null ? firstDumpInfo.f3839c : -1L;
                                    if (jCurrentTimeMillis == -1) {
                                        C5791al.m3933d("trace dump fail could not get time!", new Object[0]);
                                        jCurrentTimeMillis = System.currentTimeMillis();
                                    }
                                    if (c5804ay.m4102a(jCurrentTimeMillis)) {
                                        return;
                                    }
                                    c5804ay.m4101a(jCurrentTimeMillis, str2);
                                } catch (Throwable th) {
                                    if (!C5791al.m3929a(th)) {
                                        th.printStackTrace();
                                    }
                                    C5791al.m3934e("handle anr error %s", th.getClass().toString());
                                }
                            }
                        }
                    });
                } else {
                    C5791al.m3933d("not anr file %s", strConcat);
                }
            }
        };
        this.f4155k = fileObserver;
        try {
            fileObserver.startWatching();
            C5791al.m3928a("start anr monitor!", new Object[0]);
            this.f4149d.m3921a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.2
                @Override // java.lang.Runnable
                public final void run() {
                    C5804ay.m4090a(C5804ay.this);
                }
            });
        } catch (Throwable th) {
            this.f4155k = null;
            C5791al.m3933d("start anr monitor failed!", new Object[0]);
            if (C5791al.m3929a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: d */
    private synchronized void m4095d() {
        if (!m4097e()) {
            C5791al.m3933d("close when closed!", new Object[0]);
            return;
        }
        try {
            this.f4155k.stopWatching();
            this.f4155k = null;
            C5791al.m3933d("close anr monitor!", new Object[0]);
        } catch (Throwable th) {
            C5791al.m3933d("stop anr monitor failed!", new Object[0]);
            if (C5791al.m3929a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private synchronized boolean m4097e() {
        return this.f4155k != null;
    }

    /* renamed from: f */
    private synchronized boolean m4098f() {
        return this.f4156l;
    }

    /* renamed from: g */
    private synchronized void m4099g() {
        if (m4097e()) {
            C5791al.m3933d("start when started!", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(this.f4150e)) {
            return;
        }
        synchronized (this.f4154j) {
            try {
                C5813bg c5813bg = this.f4157m;
                if (c5813bg == null || !c5813bg.isAlive()) {
                    C5813bg c5813bg2 = new C5813bg();
                    this.f4157m = c5813bg2;
                    boolean z6 = this.f4148c.f3882S;
                    c5813bg2.f4197b = z6;
                    C5791al.m3932c("set record stack trace enable:".concat(String.valueOf(z6)), new Object[0]);
                    C5813bg c5813bg3 = this.f4157m;
                    StringBuilder sb = new StringBuilder("Bugly-ThreadMonitor");
                    int i6 = this.f4158n;
                    this.f4158n = i6 + 1;
                    sb.append(i6);
                    c5813bg3.setName(sb.toString());
                    this.f4157m.m4134b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        FileObserver fileObserver = new FileObserver(this.f4150e) { // from class: com.tencent.bugly.proguard.ay.3
            @Override // android.os.FileObserver
            public final void onEvent(int i7, String str) {
                if (str == null) {
                    return;
                }
                C5791al.m3933d("observe file, dir:%s fileName:%s", C5804ay.this.f4150e, str);
                if (!str.startsWith("manual_bugly_trace_") || !str.endsWith(".txt")) {
                    C5791al.m3932c("not manual trace file, ignore.", new Object[0]);
                    return;
                }
                if (!C5804ay.this.f4146a.get()) {
                    C5791al.m3932c("proc is not in anr, just ignore", new Object[0]);
                    return;
                }
                if (C5804ay.this.f4148c.m3801a()) {
                    C5791al.m3932c("Found foreground anr, resend sigquit immediately.", new Object[0]);
                    NativeCrashHandler.getInstance().resendSigquit();
                    long jM3935a = C5792am.m3935a(str, "manual_bugly_trace_", ".txt");
                    C5804ay.this.m4101a(jM3935a, C5804ay.this.f4150e + "/" + str);
                    C5791al.m3932c("Finish handling one anr.", new Object[0]);
                    return;
                }
                C5791al.m3932c("Found background anr, resend sigquit later.", new Object[0]);
                long jM3935a2 = C5792am.m3935a(str, "manual_bugly_trace_", ".txt");
                C5804ay.this.m4101a(jM3935a2, C5804ay.this.f4150e + "/" + str);
                C5791al.m3932c("Finish handling one anr, now resend sigquit.", new Object[0]);
                NativeCrashHandler.getInstance().resendSigquit();
            }
        };
        this.f4155k = fileObserver;
        try {
            fileObserver.startWatching();
            C5791al.m3928a("startWatchingPrivateAnrDir! dumFilePath is %s", this.f4150e);
            this.f4149d.m3921a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.4
                @Override // java.lang.Runnable
                public final void run() {
                    C5804ay.m4090a(C5804ay.this);
                }
            });
        } catch (Throwable th2) {
            this.f4155k = null;
            C5791al.m3933d("startWatchingPrivateAnrDir failed!", new Object[0]);
            if (C5791al.m3929a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: h */
    private synchronized void m4100h() {
        if (!m4097e()) {
            C5791al.m3933d("close when closed!", new Object[0]);
            return;
        }
        synchronized (this.f4154j) {
            try {
                C5813bg c5813bg = this.f4157m;
                if (c5813bg != null) {
                    c5813bg.m4133a();
                    this.f4157m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5791al.m3928a("stopWatchingPrivateAnrDir", new Object[0]);
        try {
            this.f4155k.stopWatching();
            this.f4155k = null;
            C5791al.m3933d("close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            C5791al.m3933d("stop anr monitor failed!", new Object[0]);
            if (C5791al.m3929a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m4105b(boolean z6) {
        m4096d(z6);
        boolean zM4098f = m4098f();
        C5782ac c5782acM3857a = C5782ac.m3857a();
        if (c5782acM3857a != null) {
            zM4098f = zM4098f && c5782acM3857a.m3866c().f3761f;
        }
        if (zM4098f != m4097e()) {
            C5791al.m3928a("anr changed to %b", Boolean.valueOf(zM4098f));
            m4094c(zM4098f);
        }
    }

    /* renamed from: a */
    public static synchronized C5804ay m4088a() {
        return f4145f;
    }

    /* renamed from: a */
    private CrashDetailBean m4087a(C5803ax c5803ax) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.f3781C = C5781ab.m3844j();
            crashDetailBean.f3782D = C5781ab.m3840f();
            crashDetailBean.f3783E = C5781ab.m3846l();
            crashDetailBean.f3784F = this.f4148c.m3817k();
            crashDetailBean.f3785G = this.f4148c.m3816j();
            crashDetailBean.f3786H = this.f4148c.m3818l();
            crashDetailBean.f3787I = C5781ab.m3834b(this.f4151g);
            crashDetailBean.f3788J = C5781ab.m3841g();
            crashDetailBean.f3789K = C5781ab.m3842h();
            crashDetailBean.f3807b = 3;
            crashDetailBean.f3810e = this.f4148c.m3812g();
            C5780aa c5780aa = this.f4148c;
            crashDetailBean.f3811f = c5780aa.f3927o;
            crashDetailBean.f3812g = c5780aa.m3822q();
            crashDetailBean.f3818m = this.f4148c.m3810f();
            crashDetailBean.f3819n = "ANR_EXCEPTION";
            crashDetailBean.f3820o = c5803ax.f4143f;
            crashDetailBean.f3822q = c5803ax.f4144g;
            HashMap map = new HashMap();
            crashDetailBean.f3798T = map;
            map.put("BUGLY_CR_01", c5803ax.f4142e);
            String str = crashDetailBean.f3822q;
            int iIndexOf = str != null ? str.indexOf(SignParameters.NEW_LINE) : -1;
            crashDetailBean.f3821p = iIndexOf > 0 ? crashDetailBean.f3822q.substring(0, iIndexOf) : "GET_FAIL";
            crashDetailBean.f3823r = c5803ax.f4140c;
            String str2 = crashDetailBean.f3822q;
            if (str2 != null) {
                crashDetailBean.f3826u = C5795ap.m3993c(str2.getBytes());
            }
            crashDetailBean.f3831z = c5803ax.f4139b;
            crashDetailBean.f3779A = c5803ax.f4138a;
            crashDetailBean.f3780B = "main(1)";
            crashDetailBean.f3790L = this.f4148c.m3824s();
            crashDetailBean.f3813h = this.f4148c.m3821p();
            crashDetailBean.f3814i = this.f4148c.m3797A();
            crashDetailBean.f3827v = c5803ax.f4141d;
            C5780aa c5780aa2 = this.f4148c;
            crashDetailBean.f3794P = c5780aa2.f3933u;
            crashDetailBean.f3795Q = c5780aa2.f3889a;
            crashDetailBean.f3796R = c5780aa2.m3801a();
            crashDetailBean.f3799U = this.f4148c.m3831z();
            C5780aa c5780aa3 = this.f4148c;
            crashDetailBean.f3800V = c5780aa3.f3936x;
            crashDetailBean.f3801W = c5780aa3.m3825t();
            crashDetailBean.f3802X = this.f4148c.m3830y();
            crashDetailBean.f3830y = C5794ao.m3947a();
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C5791al.m3929a(th)) {
                th.printStackTrace();
            }
            return crashDetailBean;
        }
    }

    /* renamed from: b */
    public final synchronized void m4104b() {
        C5791al.m3933d("customer decides whether to open or close.", new Object[0]);
    }

    /* renamed from: d */
    private synchronized void m4096d(boolean z6) {
        if (this.f4156l != z6) {
            C5791al.m3928a("user change anr %b", Boolean.valueOf(z6));
            this.f4156l = z6;
        }
    }

    /* renamed from: c */
    private synchronized void m4094c(boolean z6) {
        if (z6) {
            m4099g();
        } else {
            m4100h();
        }
    }

    /* renamed from: a */
    private static boolean m4092a(String str, String str2, String str3) throws Throwable {
        Map<String, String[]> map;
        TraceFileHelper.C5775a targetDumpInfo = TraceFileHelper.readTargetDumpInfo(str3, str, true);
        if (targetDumpInfo != null && (map = targetDumpInfo.f3840d) != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder(1024);
            String[] strArr = targetDumpInfo.f3840d.get("main");
            if (strArr != null && strArr.length >= 3) {
                sb.append("\"main\" tid=");
                sb.append(strArr[2]);
                sb.append(" :\n");
                sb.append(strArr[0]);
                sb.append(SignParameters.NEW_LINE);
                sb.append(strArr[1]);
                sb.append("\n\n");
            }
            for (Map.Entry<String, String[]> entry : targetDumpInfo.f3840d.entrySet()) {
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
            return C5792am.m3940a(str2, sb.toString(), sb.length() * 2);
        }
        C5791al.m3934e("not found trace dump for %s", str3);
        return false;
    }

    /* renamed from: a */
    private static String m4089a(List<C5807ba> list, long j6) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder(4096);
            sb.append("\n>>>>> 以下为anr过程中主线程堆栈记录，可根据堆栈出现次数推测在该堆栈阻塞的时间，出现次数越多对anr贡献越大，越可能是造成anr的原因 >>>>>\n");
            sb.append("\n>>>>> Thread Stack Traces Records Start >>>>>\n");
            for (int i6 = 0; i6 < list.size(); i6++) {
                C5807ba c5807ba = list.get(i6);
                sb.append("Thread name:");
                sb.append(c5807ba.f4166a);
                sb.append(SignParameters.NEW_LINE);
                long j7 = c5807ba.f4167b - j6;
                String str = j7 <= 0 ? "before " : "after ";
                sb.append("Got ");
                sb.append(str);
                sb.append("anr:");
                sb.append(Math.abs(j7));
                sb.append("ms\n");
                sb.append(c5807ba.f4168c);
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
    public final boolean m4103a(boolean z6) {
        boolean zCompareAndSet = this.f4146a.compareAndSet(!z6, z6);
        C5791al.m3932c("tryChangeAnrState to %s, success:%s", Boolean.valueOf(z6), Boolean.valueOf(zCompareAndSet));
        return zCompareAndSet;
    }

    /* renamed from: a */
    public final void m4101a(long j6, String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfoM4106a;
        List<C5807ba> listM4130c;
        try {
            C5791al.m3932c("anr time:%s", Long.valueOf(j6));
            synchronized (this.f4154j) {
                try {
                    if (this.f4157m != null) {
                        C5791al.m3932c("Disable record main stack trace.", new Object[0]);
                        this.f4157m.m4135c();
                    }
                } finally {
                }
            }
            String strM3968a = C5795ap.m3968a(Looper.getMainLooper().getThread());
            Map<String, String> mapM3974a = C5795ap.m3974a(this.f4148c.f3881R, C5799at.f4082h);
            if (this.f4148c.m3801a()) {
                boolean z6 = C5781ab.m3849o() || C5781ab.m3850p();
                C5791al.m3932c("isAnrCrashDevice:%s", Boolean.valueOf(z6));
                if (!z6) {
                    processErrorStateInfoM4106a = C5805az.m4106a(this.f4147b, 21000L);
                } else {
                    processErrorStateInfoM4106a = C5805az.m4106a(this.f4147b, 0L);
                }
            } else {
                processErrorStateInfoM4106a = C5805az.m4106a(this.f4147b, 0L);
            }
            if (processErrorStateInfoM4106a == null) {
                C5791al.m3932c("proc state is invisible or not my proc!", new Object[0]);
                return;
            }
            C5803ax c5803ax = new C5803ax();
            c5803ax.f4140c = j6;
            c5803ax.f4138a = processErrorStateInfoM4106a.processName;
            c5803ax.f4143f = processErrorStateInfoM4106a.shortMsg;
            c5803ax.f4142e = processErrorStateInfoM4106a.longMsg;
            c5803ax.f4139b = mapM3974a;
            c5803ax.f4144g = strM3968a;
            if (TextUtils.isEmpty(strM3968a)) {
                c5803ax.f4144g = "main stack is null , some error may be encountered.";
            }
            Long lValueOf = Long.valueOf(c5803ax.f4140c);
            String str2 = c5803ax.f4141d;
            String str3 = c5803ax.f4138a;
            String str4 = c5803ax.f4144g;
            String str5 = c5803ax.f4143f;
            String str6 = c5803ax.f4142e;
            Map<String, String> map = c5803ax.f4139b;
            C5791al.m3932c("anr time:%d\ntrace file:%s\nproc:%s\nmain stack:%s\nshort msg:%s\nlong msg:%s\n threads:%d", lValueOf, str2, str3, str4, str5, str6, Integer.valueOf(map == null ? 0 : map.size()));
            C5791al.m3928a("found visible anr , start to upload!", new Object[0]);
            C5791al.m3932c("trace file:%s", str);
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                File file = new File(this.f4150e, "bugly_trace_" + j6 + ".txt");
                C5791al.m3932c("trace file exists", new Object[0]);
                if (str.startsWith("/data/anr/")) {
                    C5791al.m3928a("backup trace isOK:%s", Boolean.valueOf(m4092a(str, file.getAbsolutePath(), c5803ax.f4138a)));
                } else {
                    C5791al.m3928a("trace file rename :%s", Boolean.valueOf(new File(str).renameTo(file)));
                }
                synchronized (this.f4154j) {
                    try {
                        C5813bg c5813bg = this.f4157m;
                        listM4130c = c5813bg != null ? c5813bg.f4196a.m4130c() : null;
                    } finally {
                    }
                }
                if (listM4130c != null) {
                    String strM4089a = m4089a(listM4130c, j6);
                    C5791al.m3932c("save main stack trace", new Object[0]);
                    C5792am.m3938a(file, strM4089a, SieveCacheKt.NodeLinkMask, true);
                }
                c5803ax.f4141d = file.getAbsolutePath();
            } else {
                C5791al.m3932c("trace file is null or not exists, just ignore", new Object[0]);
            }
            CrashDetailBean crashDetailBeanM4087a = m4087a(c5803ax);
            C5799at.m4051a().m4056a(crashDetailBeanM4087a);
            if (crashDetailBeanM4087a.f3805a >= 0) {
                C5791al.m3928a("backup anr record success!", new Object[0]);
            } else {
                C5791al.m3933d("backup anr record fail!", new Object[0]);
            }
            C5798as.m4018a("ANR", C5795ap.m3965a(j6), c5803ax.f4138a, "main", c5803ax.f4144g, crashDetailBeanM4087a);
            if (!this.f4153i.m4047a(crashDetailBeanM4087a, !C5781ab.m3852r())) {
                this.f4153i.m4049b(crashDetailBeanM4087a, true);
            }
            this.f4153i.m4045a(crashDetailBeanM4087a);
            synchronized (this.f4154j) {
                try {
                    if (this.f4157m != null) {
                        C5791al.m3932c("Finish anr process.", new Object[0]);
                        this.f4157m.m4136d();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                C5791al.m3931b(th);
            } finally {
                m4103a(false);
            }
        }
    }

    /* renamed from: a */
    public final boolean m4102a(long j6) {
        if (Math.abs(j6 - this.f4159o) < WorkRequest.MIN_BACKOFF_MILLIS) {
            C5791al.m3933d("should not process ANR too Fre in %dms", 10000);
            return true;
        }
        this.f4159o = j6;
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m4090a(C5804ay c5804ay) {
        long jCurrentTimeMillis = (C5799at.f4084j + System.currentTimeMillis()) - C5795ap.m3983b();
        C5792am.m3937a(c5804ay.f4150e, "bugly_trace_", ".txt", jCurrentTimeMillis);
        C5792am.m3937a(c5804ay.f4150e, "manual_bugly_trace_", ".txt", jCurrentTimeMillis);
        C5792am.m3937a(c5804ay.f4150e, "main_stack_record_", ".txt", jCurrentTimeMillis);
        C5792am.m3937a(c5804ay.f4150e, "main_stack_record_", ".txt.merged", jCurrentTimeMillis);
    }
}
