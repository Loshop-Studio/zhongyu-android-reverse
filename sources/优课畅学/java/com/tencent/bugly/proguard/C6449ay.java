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
import com.tencent.smtt.audio.core.utils.TbsDialogBase;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.bugly.proguard.ay */
/* loaded from: classes4.dex */
public final class C6449ay {

    /* renamed from: f */
    public static C6449ay f4767f;

    /* renamed from: b */
    public final ActivityManager f4769b;

    /* renamed from: c */
    final C6425aa f4770c;

    /* renamed from: d */
    final C6435ak f4771d;

    /* renamed from: e */
    String f4772e;

    /* renamed from: g */
    private final Context f4773g;

    /* renamed from: h */
    private final C6427ac f4774h;

    /* renamed from: i */
    private final C6443as f4775i;

    /* renamed from: k */
    private FileObserver f4777k;

    /* renamed from: m */
    private C6458bg f4779m;

    /* renamed from: n */
    private int f4780n;

    /* renamed from: a */
    public final AtomicBoolean f4768a = new AtomicBoolean(false);

    /* renamed from: j */
    private final Object f4776j = new Object();

    /* renamed from: l */
    private boolean f4778l = true;

    /* renamed from: o */
    private long f4781o = 0;

    public C6449ay(Context context, C6427ac c6427ac, C6425aa c6425aa, C6435ak c6435ak, C6443as c6443as) {
        Context contextM4313a = C6440ap.m4313a(context);
        this.f4773g = contextM4313a;
        this.f4769b = (ActivityManager) contextM4313a.getSystemService("activity");
        if (C6440ap.m4346b(NativeCrashHandler.getDumpFilePath())) {
            this.f4772e = context.getDir("bugly", 0).getAbsolutePath();
        } else {
            this.f4772e = NativeCrashHandler.getDumpFilePath();
        }
        this.f4770c = c6425aa;
        this.f4771d = c6435ak;
        this.f4774h = c6427ac;
        this.f4775i = c6443as;
    }

    /* renamed from: c */
    private synchronized void m4448c() {
        if (m4452e()) {
            C6436al.m4288d("start when started!", new Object[0]);
            return;
        }
        FileObserver fileObserver = new FileObserver("/data/anr/") { // from class: com.tencent.bugly.proguard.ay.1
            @Override // android.os.FileObserver
            public final void onEvent(int i10, String str) {
                if (str == null) {
                    return;
                }
                final String strConcat = "/data/anr/".concat(str);
                C6436al.m4288d("watching file %s", strConcat);
                if (strConcat.contains("trace")) {
                    C6449ay.this.f4771d.m4276a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6449ay c6449ay = C6449ay.this;
                            String str2 = strConcat;
                            if (c6449ay.m4458a(true)) {
                                try {
                                    C6436al.m4287c("read trace first dump for create time!", new Object[0]);
                                    TraceFileHelper.C6420a firstDumpInfo = TraceFileHelper.readFirstDumpInfo(str2, false);
                                    long jCurrentTimeMillis = firstDumpInfo != null ? firstDumpInfo.f4461c : -1L;
                                    if (jCurrentTimeMillis == -1) {
                                        C6436al.m4288d("trace dump fail could not get time!", new Object[0]);
                                        jCurrentTimeMillis = System.currentTimeMillis();
                                    }
                                    if (c6449ay.m4457a(jCurrentTimeMillis)) {
                                        return;
                                    }
                                    c6449ay.m4456a(jCurrentTimeMillis, str2);
                                } catch (Throwable th) {
                                    if (!C6436al.m4284a(th)) {
                                        th.printStackTrace();
                                    }
                                    C6436al.m4289e("handle anr error %s", th.getClass().toString());
                                }
                            }
                        }
                    });
                } else {
                    C6436al.m4288d("not anr file %s", strConcat);
                }
            }
        };
        this.f4777k = fileObserver;
        try {
            fileObserver.startWatching();
            C6436al.m4283a("start anr monitor!", new Object[0]);
            this.f4771d.m4276a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.2
                @Override // java.lang.Runnable
                public final void run() {
                    C6449ay.m4445a(C6449ay.this);
                }
            });
        } catch (Throwable th) {
            this.f4777k = null;
            C6436al.m4288d("start anr monitor failed!", new Object[0]);
            if (C6436al.m4284a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: d */
    private synchronized void m4450d() {
        if (!m4452e()) {
            C6436al.m4288d("close when closed!", new Object[0]);
            return;
        }
        try {
            this.f4777k.stopWatching();
            this.f4777k = null;
            C6436al.m4288d("close anr monitor!", new Object[0]);
        } catch (Throwable th) {
            C6436al.m4288d("stop anr monitor failed!", new Object[0]);
            if (C6436al.m4284a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private synchronized boolean m4452e() {
        return this.f4777k != null;
    }

    /* renamed from: f */
    private synchronized boolean m4453f() {
        return this.f4778l;
    }

    /* renamed from: g */
    private synchronized void m4454g() {
        if (m4452e()) {
            C6436al.m4288d("start when started!", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(this.f4772e)) {
            return;
        }
        synchronized (this.f4776j) {
            try {
                C6458bg c6458bg = this.f4779m;
                if (c6458bg == null || !c6458bg.isAlive()) {
                    C6458bg c6458bg2 = new C6458bg();
                    this.f4779m = c6458bg2;
                    boolean z10 = this.f4770c.f4504S;
                    c6458bg2.f4819b = z10;
                    C6436al.m4287c("set record stack trace enable:".concat(String.valueOf(z10)), new Object[0]);
                    C6458bg c6458bg3 = this.f4779m;
                    StringBuilder sb = new StringBuilder("Bugly-ThreadMonitor");
                    int i10 = this.f4780n;
                    this.f4780n = i10 + 1;
                    sb.append(i10);
                    c6458bg3.setName(sb.toString());
                    this.f4779m.m4489b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        FileObserver fileObserver = new FileObserver(this.f4772e) { // from class: com.tencent.bugly.proguard.ay.3
            @Override // android.os.FileObserver
            public final void onEvent(int i11, String str) {
                if (str == null) {
                    return;
                }
                C6436al.m4288d("observe file, dir:%s fileName:%s", C6449ay.this.f4772e, str);
                if (!str.startsWith("manual_bugly_trace_") || !str.endsWith(".txt")) {
                    C6436al.m4287c("not manual trace file, ignore.", new Object[0]);
                    return;
                }
                if (!C6449ay.this.f4768a.get()) {
                    C6436al.m4287c("proc is not in anr, just ignore", new Object[0]);
                    return;
                }
                if (C6449ay.this.f4770c.m4156a()) {
                    C6436al.m4287c("Found foreground anr, resend sigquit immediately.", new Object[0]);
                    NativeCrashHandler.getInstance().resendSigquit();
                    long jM4290a = C6437am.m4290a(str, "manual_bugly_trace_", ".txt");
                    C6449ay.this.m4456a(jM4290a, C6449ay.this.f4772e + "/" + str);
                    C6436al.m4287c("Finish handling one anr.", new Object[0]);
                    return;
                }
                C6436al.m4287c("Found background anr, resend sigquit later.", new Object[0]);
                long jM4290a2 = C6437am.m4290a(str, "manual_bugly_trace_", ".txt");
                C6449ay.this.m4456a(jM4290a2, C6449ay.this.f4772e + "/" + str);
                C6436al.m4287c("Finish handling one anr, now resend sigquit.", new Object[0]);
                NativeCrashHandler.getInstance().resendSigquit();
            }
        };
        this.f4777k = fileObserver;
        try {
            fileObserver.startWatching();
            C6436al.m4283a("startWatchingPrivateAnrDir! dumFilePath is %s", this.f4772e);
            this.f4771d.m4276a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.4
                @Override // java.lang.Runnable
                public final void run() {
                    C6449ay.m4445a(C6449ay.this);
                }
            });
        } catch (Throwable th2) {
            this.f4777k = null;
            C6436al.m4288d("startWatchingPrivateAnrDir failed!", new Object[0]);
            if (C6436al.m4284a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: h */
    private synchronized void m4455h() {
        if (!m4452e()) {
            C6436al.m4288d("close when closed!", new Object[0]);
            return;
        }
        synchronized (this.f4776j) {
            try {
                C6458bg c6458bg = this.f4779m;
                if (c6458bg != null) {
                    c6458bg.m4488a();
                    this.f4779m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6436al.m4283a("stopWatchingPrivateAnrDir", new Object[0]);
        try {
            this.f4777k.stopWatching();
            this.f4777k = null;
            C6436al.m4288d("close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            C6436al.m4288d("stop anr monitor failed!", new Object[0]);
            if (C6436al.m4284a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m4460b(boolean z10) {
        m4451d(z10);
        boolean zM4453f = m4453f();
        C6427ac c6427acM4212a = C6427ac.m4212a();
        if (c6427acM4212a != null) {
            zM4453f = zM4453f && c6427acM4212a.m4221c().f4383f;
        }
        if (zM4453f != m4452e()) {
            C6436al.m4283a("anr changed to %b", Boolean.valueOf(zM4453f));
            m4449c(zM4453f);
        }
    }

    /* renamed from: a */
    public static synchronized C6449ay m4443a() {
        return f4767f;
    }

    /* renamed from: a */
    private CrashDetailBean m4442a(C6448ax c6448ax) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.f4403C = C6426ab.m4199j();
            crashDetailBean.f4404D = C6426ab.m4195f();
            crashDetailBean.f4405E = C6426ab.m4201l();
            crashDetailBean.f4406F = this.f4770c.m4172k();
            crashDetailBean.f4407G = this.f4770c.m4171j();
            crashDetailBean.f4408H = this.f4770c.m4173l();
            crashDetailBean.f4409I = C6426ab.m4189b(this.f4773g);
            crashDetailBean.f4410J = C6426ab.m4196g();
            crashDetailBean.f4411K = C6426ab.m4197h();
            crashDetailBean.f4429b = 3;
            crashDetailBean.f4432e = this.f4770c.m4167g();
            C6425aa c6425aa = this.f4770c;
            crashDetailBean.f4433f = c6425aa.f4549o;
            crashDetailBean.f4434g = c6425aa.m4177q();
            crashDetailBean.f4440m = this.f4770c.m4165f();
            crashDetailBean.f4441n = "ANR_EXCEPTION";
            crashDetailBean.f4442o = c6448ax.f4765f;
            crashDetailBean.f4444q = c6448ax.f4766g;
            HashMap map = new HashMap();
            crashDetailBean.f4420T = map;
            map.put("BUGLY_CR_01", c6448ax.f4764e);
            String str = crashDetailBean.f4444q;
            int iIndexOf = str != null ? str.indexOf(SignParameters.NEW_LINE) : -1;
            crashDetailBean.f4443p = iIndexOf > 0 ? crashDetailBean.f4444q.substring(0, iIndexOf) : "GET_FAIL";
            crashDetailBean.f4445r = c6448ax.f4762c;
            String str2 = crashDetailBean.f4444q;
            if (str2 != null) {
                crashDetailBean.f4448u = C6440ap.m4348c(str2.getBytes());
            }
            crashDetailBean.f4453z = c6448ax.f4761b;
            crashDetailBean.f4401A = c6448ax.f4760a;
            crashDetailBean.f4402B = "main(1)";
            crashDetailBean.f4412L = this.f4770c.m4179s();
            crashDetailBean.f4435h = this.f4770c.m4176p();
            crashDetailBean.f4436i = this.f4770c.m4152A();
            crashDetailBean.f4449v = c6448ax.f4763d;
            C6425aa c6425aa2 = this.f4770c;
            crashDetailBean.f4416P = c6425aa2.f4555u;
            crashDetailBean.f4417Q = c6425aa2.f4511a;
            crashDetailBean.f4418R = c6425aa2.m4156a();
            crashDetailBean.f4421U = this.f4770c.m4186z();
            C6425aa c6425aa3 = this.f4770c;
            crashDetailBean.f4422V = c6425aa3.f4558x;
            crashDetailBean.f4423W = c6425aa3.m4180t();
            crashDetailBean.f4424X = this.f4770c.m4185y();
            crashDetailBean.f4452y = C6439ao.m4302a();
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C6436al.m4284a(th)) {
                th.printStackTrace();
            }
            return crashDetailBean;
        }
    }

    /* renamed from: b */
    public final synchronized void m4459b() {
        C6436al.m4288d("customer decides whether to open or close.", new Object[0]);
    }

    /* renamed from: d */
    private synchronized void m4451d(boolean z10) {
        if (this.f4778l != z10) {
            C6436al.m4283a("user change anr %b", Boolean.valueOf(z10));
            this.f4778l = z10;
        }
    }

    /* renamed from: c */
    private synchronized void m4449c(boolean z10) {
        if (z10) {
            m4454g();
        } else {
            m4455h();
        }
    }

    /* renamed from: a */
    private static boolean m4447a(String str, String str2, String str3) throws Throwable {
        Map<String, String[]> map;
        TraceFileHelper.C6420a targetDumpInfo = TraceFileHelper.readTargetDumpInfo(str3, str, true);
        if (targetDumpInfo != null && (map = targetDumpInfo.f4462d) != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder(1024);
            String[] strArr = targetDumpInfo.f4462d.get("main");
            if (strArr != null && strArr.length >= 3) {
                sb.append("\"main\" tid=");
                sb.append(strArr[2]);
                sb.append(" :\n");
                sb.append(strArr[0]);
                sb.append(SignParameters.NEW_LINE);
                sb.append(strArr[1]);
                sb.append("\n\n");
            }
            for (Map.Entry<String, String[]> entry : targetDumpInfo.f4462d.entrySet()) {
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
            return C6437am.m4295a(str2, sb.toString(), sb.length() * 2);
        }
        C6436al.m4289e("not found trace dump for %s", str3);
        return false;
    }

    /* renamed from: a */
    private static String m4444a(List<C6452ba> list, long j10) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder(4096);
            sb.append("\n>>>>> 以下为anr过程中主线程堆栈记录，可根据堆栈出现次数推测在该堆栈阻塞的时间，出现次数越多对anr贡献越大，越可能是造成anr的原因 >>>>>\n");
            sb.append("\n>>>>> Thread Stack Traces Records Start >>>>>\n");
            for (int i10 = 0; i10 < list.size(); i10++) {
                C6452ba c6452ba = list.get(i10);
                sb.append("Thread name:");
                sb.append(c6452ba.f4788a);
                sb.append(SignParameters.NEW_LINE);
                long j11 = c6452ba.f4789b - j10;
                String str = j11 <= 0 ? "before " : "after ";
                sb.append("Got ");
                sb.append(str);
                sb.append("anr:");
                sb.append(Math.abs(j11));
                sb.append("ms\n");
                sb.append(c6452ba.f4790c);
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
    public final boolean m4458a(boolean z10) {
        boolean zCompareAndSet = this.f4768a.compareAndSet(!z10, z10);
        C6436al.m4287c("tryChangeAnrState to %s, success:%s", Boolean.valueOf(z10), Boolean.valueOf(zCompareAndSet));
        return zCompareAndSet;
    }

    /* renamed from: a */
    public final void m4456a(long j10, String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfoM4461a;
        List<C6452ba> listM4485c;
        try {
            C6436al.m4287c("anr time:%s", Long.valueOf(j10));
            synchronized (this.f4776j) {
                try {
                    if (this.f4779m != null) {
                        C6436al.m4287c("Disable record main stack trace.", new Object[0]);
                        this.f4779m.m4490c();
                    }
                } finally {
                }
            }
            String strM4323a = C6440ap.m4323a(Looper.getMainLooper().getThread());
            Map<String, String> mapM4329a = C6440ap.m4329a(this.f4770c.f4503R, C6444at.f4704h);
            if (this.f4770c.m4156a()) {
                boolean z10 = C6426ab.m4204o() || C6426ab.m4205p();
                C6436al.m4287c("isAnrCrashDevice:%s", Boolean.valueOf(z10));
                if (!z10) {
                    processErrorStateInfoM4461a = C6450az.m4461a(this.f4769b, 21000L);
                } else {
                    processErrorStateInfoM4461a = C6450az.m4461a(this.f4769b, 0L);
                }
            } else {
                processErrorStateInfoM4461a = C6450az.m4461a(this.f4769b, 0L);
            }
            if (processErrorStateInfoM4461a == null) {
                C6436al.m4287c("proc state is invisible or not my proc!", new Object[0]);
                return;
            }
            C6448ax c6448ax = new C6448ax();
            c6448ax.f4762c = j10;
            c6448ax.f4760a = processErrorStateInfoM4461a.processName;
            c6448ax.f4765f = processErrorStateInfoM4461a.shortMsg;
            c6448ax.f4764e = processErrorStateInfoM4461a.longMsg;
            c6448ax.f4761b = mapM4329a;
            c6448ax.f4766g = strM4323a;
            if (TextUtils.isEmpty(strM4323a)) {
                c6448ax.f4766g = "main stack is null , some error may be encountered.";
            }
            Long lValueOf = Long.valueOf(c6448ax.f4762c);
            String str2 = c6448ax.f4763d;
            String str3 = c6448ax.f4760a;
            String str4 = c6448ax.f4766g;
            String str5 = c6448ax.f4765f;
            String str6 = c6448ax.f4764e;
            Map<String, String> map = c6448ax.f4761b;
            C6436al.m4287c("anr time:%d\ntrace file:%s\nproc:%s\nmain stack:%s\nshort msg:%s\nlong msg:%s\n threads:%d", lValueOf, str2, str3, str4, str5, str6, Integer.valueOf(map == null ? 0 : map.size()));
            C6436al.m4283a("found visible anr , start to upload!", new Object[0]);
            C6436al.m4287c("trace file:%s", str);
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                File file = new File(this.f4772e, "bugly_trace_" + j10 + ".txt");
                C6436al.m4287c("trace file exists", new Object[0]);
                if (str.startsWith("/data/anr/")) {
                    C6436al.m4283a("backup trace isOK:%s", Boolean.valueOf(m4447a(str, file.getAbsolutePath(), c6448ax.f4760a)));
                } else {
                    C6436al.m4283a("trace file rename :%s", Boolean.valueOf(new File(str).renameTo(file)));
                }
                synchronized (this.f4776j) {
                    try {
                        C6458bg c6458bg = this.f4779m;
                        listM4485c = c6458bg != null ? c6458bg.f4818a.m4485c() : null;
                    } finally {
                    }
                }
                if (listM4485c != null) {
                    String strM4444a = m4444a(listM4485c, j10);
                    C6436al.m4287c("save main stack trace", new Object[0]);
                    C6437am.m4293a(file, strM4444a, SieveCacheKt.NodeLinkMask, true);
                }
                c6448ax.f4763d = file.getAbsolutePath();
            } else {
                C6436al.m4287c("trace file is null or not exists, just ignore", new Object[0]);
            }
            CrashDetailBean crashDetailBeanM4442a = m4442a(c6448ax);
            C6444at.m4406a().m4411a(crashDetailBeanM4442a);
            if (crashDetailBeanM4442a.f4427a >= 0) {
                C6436al.m4283a("backup anr record success!", new Object[0]);
            } else {
                C6436al.m4288d("backup anr record fail!", new Object[0]);
            }
            C6443as.m4373a("ANR", C6440ap.m4320a(j10), c6448ax.f4760a, "main", c6448ax.f4766g, crashDetailBeanM4442a);
            if (!this.f4775i.m4402a(crashDetailBeanM4442a, !C6426ab.m4207r())) {
                this.f4775i.m4404b(crashDetailBeanM4442a, true);
            }
            this.f4775i.m4400a(crashDetailBeanM4442a);
            synchronized (this.f4776j) {
                try {
                    if (this.f4779m != null) {
                        C6436al.m4287c("Finish anr process.", new Object[0]);
                        this.f4779m.m4491d();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                C6436al.m4286b(th);
            } finally {
                m4458a(false);
            }
        }
    }

    /* renamed from: a */
    public final boolean m4457a(long j10) {
        if (Math.abs(j10 - this.f4781o) < WorkRequest.MIN_BACKOFF_MILLIS) {
            C6436al.m4288d("should not process ANR too Fre in %dms", Integer.valueOf(TbsDialogBase.BTN_ID_POSITIVE));
            return true;
        }
        this.f4781o = j10;
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m4445a(C6449ay c6449ay) {
        long jCurrentTimeMillis = (C6444at.f4706j + System.currentTimeMillis()) - C6440ap.m4338b();
        C6437am.m4292a(c6449ay.f4772e, "bugly_trace_", ".txt", jCurrentTimeMillis);
        C6437am.m4292a(c6449ay.f4772e, "manual_bugly_trace_", ".txt", jCurrentTimeMillis);
        C6437am.m4292a(c6449ay.f4772e, "main_stack_record_", ".txt", jCurrentTimeMillis);
        C6437am.m4292a(c6449ay.f4772e, "main_stack_record_", ".txt.merged", jCurrentTimeMillis);
    }
}
