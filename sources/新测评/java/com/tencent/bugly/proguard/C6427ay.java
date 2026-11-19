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
/* loaded from: classes4.dex */
public final class C6427ay {

    /* renamed from: f */
    public static C6427ay f5424f;

    /* renamed from: b */
    public final ActivityManager f5426b;

    /* renamed from: c */
    final C6403aa f5427c;

    /* renamed from: d */
    final C6413ak f5428d;

    /* renamed from: e */
    String f5429e;

    /* renamed from: g */
    private final Context f5430g;

    /* renamed from: h */
    private final C6405ac f5431h;

    /* renamed from: i */
    private final C6421as f5432i;

    /* renamed from: k */
    private FileObserver f5434k;

    /* renamed from: m */
    private C6436bg f5436m;

    /* renamed from: n */
    private int f5437n;

    /* renamed from: a */
    public final AtomicBoolean f5425a = new AtomicBoolean(false);

    /* renamed from: j */
    private final Object f5433j = new Object();

    /* renamed from: l */
    private boolean f5435l = true;

    /* renamed from: o */
    private long f5438o = 0;

    public C6427ay(Context context, C6405ac c6405ac, C6403aa c6403aa, C6413ak c6413ak, C6421as c6421as) {
        Context contextM4953a = C6418ap.m4953a(context);
        this.f5430g = contextM4953a;
        this.f5426b = (ActivityManager) contextM4953a.getSystemService("activity");
        if (C6418ap.m4986b(NativeCrashHandler.getDumpFilePath())) {
            this.f5429e = context.getDir("bugly", 0).getAbsolutePath();
        } else {
            this.f5429e = NativeCrashHandler.getDumpFilePath();
        }
        this.f5427c = c6403aa;
        this.f5428d = c6413ak;
        this.f5431h = c6405ac;
        this.f5432i = c6421as;
    }

    /* renamed from: c */
    private synchronized void m5088c() {
        if (m5092e()) {
            C6414al.m4928d("start when started!", new Object[0]);
            return;
        }
        FileObserver fileObserver = new FileObserver("/data/anr/") { // from class: com.tencent.bugly.proguard.ay.1
            @Override // android.os.FileObserver
            public final void onEvent(int i10, String str) {
                if (str == null) {
                    return;
                }
                final String strConcat = "/data/anr/".concat(str);
                C6414al.m4928d("watching file %s", strConcat);
                if (strConcat.contains("trace")) {
                    C6427ay.this.f5428d.m4916a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6427ay c6427ay = C6427ay.this;
                            String str2 = strConcat;
                            if (c6427ay.m5098a(true)) {
                                try {
                                    C6414al.m4927c("read trace first dump for create time!", new Object[0]);
                                    TraceFileHelper.C6398a firstDumpInfo = TraceFileHelper.readFirstDumpInfo(str2, false);
                                    long jCurrentTimeMillis = firstDumpInfo != null ? firstDumpInfo.f5118c : -1L;
                                    if (jCurrentTimeMillis == -1) {
                                        C6414al.m4928d("trace dump fail could not get time!", new Object[0]);
                                        jCurrentTimeMillis = System.currentTimeMillis();
                                    }
                                    if (c6427ay.m5097a(jCurrentTimeMillis)) {
                                        return;
                                    }
                                    c6427ay.m5096a(jCurrentTimeMillis, str2);
                                } catch (Throwable th) {
                                    if (!C6414al.m4924a(th)) {
                                        th.printStackTrace();
                                    }
                                    C6414al.m4929e("handle anr error %s", th.getClass().toString());
                                }
                            }
                        }
                    });
                } else {
                    C6414al.m4928d("not anr file %s", strConcat);
                }
            }
        };
        this.f5434k = fileObserver;
        try {
            fileObserver.startWatching();
            C6414al.m4923a("start anr monitor!", new Object[0]);
            this.f5428d.m4916a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.2
                @Override // java.lang.Runnable
                public final void run() {
                    C6427ay.m5085a(C6427ay.this);
                }
            });
        } catch (Throwable th) {
            this.f5434k = null;
            C6414al.m4928d("start anr monitor failed!", new Object[0]);
            if (C6414al.m4924a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: d */
    private synchronized void m5090d() {
        if (!m5092e()) {
            C6414al.m4928d("close when closed!", new Object[0]);
            return;
        }
        try {
            this.f5434k.stopWatching();
            this.f5434k = null;
            C6414al.m4928d("close anr monitor!", new Object[0]);
        } catch (Throwable th) {
            C6414al.m4928d("stop anr monitor failed!", new Object[0]);
            if (C6414al.m4924a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private synchronized boolean m5092e() {
        return this.f5434k != null;
    }

    /* renamed from: f */
    private synchronized boolean m5093f() {
        return this.f5435l;
    }

    /* renamed from: g */
    private synchronized void m5094g() {
        if (m5092e()) {
            C6414al.m4928d("start when started!", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(this.f5429e)) {
            return;
        }
        synchronized (this.f5433j) {
            try {
                C6436bg c6436bg = this.f5436m;
                if (c6436bg == null || !c6436bg.isAlive()) {
                    C6436bg c6436bg2 = new C6436bg();
                    this.f5436m = c6436bg2;
                    boolean z9 = this.f5427c.f5161S;
                    c6436bg2.f5476b = z9;
                    C6414al.m4927c("set record stack trace enable:".concat(String.valueOf(z9)), new Object[0]);
                    C6436bg c6436bg3 = this.f5436m;
                    StringBuilder sb = new StringBuilder("Bugly-ThreadMonitor");
                    int i10 = this.f5437n;
                    this.f5437n = i10 + 1;
                    sb.append(i10);
                    c6436bg3.setName(sb.toString());
                    this.f5436m.m5129b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        FileObserver fileObserver = new FileObserver(this.f5429e) { // from class: com.tencent.bugly.proguard.ay.3
            @Override // android.os.FileObserver
            public final void onEvent(int i11, String str) {
                if (str == null) {
                    return;
                }
                C6414al.m4928d("observe file, dir:%s fileName:%s", C6427ay.this.f5429e, str);
                if (!str.startsWith("manual_bugly_trace_") || !str.endsWith(".txt")) {
                    C6414al.m4927c("not manual trace file, ignore.", new Object[0]);
                    return;
                }
                if (!C6427ay.this.f5425a.get()) {
                    C6414al.m4927c("proc is not in anr, just ignore", new Object[0]);
                    return;
                }
                if (C6427ay.this.f5427c.m4796a()) {
                    C6414al.m4927c("Found foreground anr, resend sigquit immediately.", new Object[0]);
                    NativeCrashHandler.getInstance().resendSigquit();
                    long jM4930a = C6415am.m4930a(str, "manual_bugly_trace_", ".txt");
                    C6427ay.this.m5096a(jM4930a, C6427ay.this.f5429e + "/" + str);
                    C6414al.m4927c("Finish handling one anr.", new Object[0]);
                    return;
                }
                C6414al.m4927c("Found background anr, resend sigquit later.", new Object[0]);
                long jM4930a2 = C6415am.m4930a(str, "manual_bugly_trace_", ".txt");
                C6427ay.this.m5096a(jM4930a2, C6427ay.this.f5429e + "/" + str);
                C6414al.m4927c("Finish handling one anr, now resend sigquit.", new Object[0]);
                NativeCrashHandler.getInstance().resendSigquit();
            }
        };
        this.f5434k = fileObserver;
        try {
            fileObserver.startWatching();
            C6414al.m4923a("startWatchingPrivateAnrDir! dumFilePath is %s", this.f5429e);
            this.f5428d.m4916a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.4
                @Override // java.lang.Runnable
                public final void run() {
                    C6427ay.m5085a(C6427ay.this);
                }
            });
        } catch (Throwable th2) {
            this.f5434k = null;
            C6414al.m4928d("startWatchingPrivateAnrDir failed!", new Object[0]);
            if (C6414al.m4924a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: h */
    private synchronized void m5095h() {
        if (!m5092e()) {
            C6414al.m4928d("close when closed!", new Object[0]);
            return;
        }
        synchronized (this.f5433j) {
            try {
                C6436bg c6436bg = this.f5436m;
                if (c6436bg != null) {
                    c6436bg.m5128a();
                    this.f5436m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6414al.m4923a("stopWatchingPrivateAnrDir", new Object[0]);
        try {
            this.f5434k.stopWatching();
            this.f5434k = null;
            C6414al.m4928d("close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            C6414al.m4928d("stop anr monitor failed!", new Object[0]);
            if (C6414al.m4924a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m5100b(boolean z9) {
        m5091d(z9);
        boolean zM5093f = m5093f();
        C6405ac c6405acM4852a = C6405ac.m4852a();
        if (c6405acM4852a != null) {
            zM5093f = zM5093f && c6405acM4852a.m4861c().f5040f;
        }
        if (zM5093f != m5092e()) {
            C6414al.m4923a("anr changed to %b", Boolean.valueOf(zM5093f));
            m5089c(zM5093f);
        }
    }

    /* renamed from: a */
    public static synchronized C6427ay m5083a() {
        return f5424f;
    }

    /* renamed from: a */
    private CrashDetailBean m5082a(C6426ax c6426ax) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.f5060C = C6404ab.m4839j();
            crashDetailBean.f5061D = C6404ab.m4835f();
            crashDetailBean.f5062E = C6404ab.m4841l();
            crashDetailBean.f5063F = this.f5427c.m4812k();
            crashDetailBean.f5064G = this.f5427c.m4811j();
            crashDetailBean.f5065H = this.f5427c.m4813l();
            crashDetailBean.f5066I = C6404ab.m4829b(this.f5430g);
            crashDetailBean.f5067J = C6404ab.m4836g();
            crashDetailBean.f5068K = C6404ab.m4837h();
            crashDetailBean.f5086b = 3;
            crashDetailBean.f5089e = this.f5427c.m4807g();
            C6403aa c6403aa = this.f5427c;
            crashDetailBean.f5090f = c6403aa.f5206o;
            crashDetailBean.f5091g = c6403aa.m4817q();
            crashDetailBean.f5097m = this.f5427c.m4805f();
            crashDetailBean.f5098n = "ANR_EXCEPTION";
            crashDetailBean.f5099o = c6426ax.f5422f;
            crashDetailBean.f5101q = c6426ax.f5423g;
            HashMap map = new HashMap();
            crashDetailBean.f5077T = map;
            map.put("BUGLY_CR_01", c6426ax.f5421e);
            String str = crashDetailBean.f5101q;
            int iIndexOf = str != null ? str.indexOf(SignParameters.NEW_LINE) : -1;
            crashDetailBean.f5100p = iIndexOf > 0 ? crashDetailBean.f5101q.substring(0, iIndexOf) : "GET_FAIL";
            crashDetailBean.f5102r = c6426ax.f5419c;
            String str2 = crashDetailBean.f5101q;
            if (str2 != null) {
                crashDetailBean.f5105u = C6418ap.m4988c(str2.getBytes());
            }
            crashDetailBean.f5110z = c6426ax.f5418b;
            crashDetailBean.f5058A = c6426ax.f5417a;
            crashDetailBean.f5059B = "main(1)";
            crashDetailBean.f5069L = this.f5427c.m4819s();
            crashDetailBean.f5092h = this.f5427c.m4816p();
            crashDetailBean.f5093i = this.f5427c.m4792A();
            crashDetailBean.f5106v = c6426ax.f5420d;
            C6403aa c6403aa2 = this.f5427c;
            crashDetailBean.f5073P = c6403aa2.f5212u;
            crashDetailBean.f5074Q = c6403aa2.f5168a;
            crashDetailBean.f5075R = c6403aa2.m4796a();
            crashDetailBean.f5078U = this.f5427c.m4826z();
            C6403aa c6403aa3 = this.f5427c;
            crashDetailBean.f5079V = c6403aa3.f5215x;
            crashDetailBean.f5080W = c6403aa3.m4820t();
            crashDetailBean.f5081X = this.f5427c.m4825y();
            crashDetailBean.f5109y = C6417ao.m4942a();
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C6414al.m4924a(th)) {
                th.printStackTrace();
            }
            return crashDetailBean;
        }
    }

    /* renamed from: b */
    public final synchronized void m5099b() {
        C6414al.m4928d("customer decides whether to open or close.", new Object[0]);
    }

    /* renamed from: d */
    private synchronized void m5091d(boolean z9) {
        if (this.f5435l != z9) {
            C6414al.m4923a("user change anr %b", Boolean.valueOf(z9));
            this.f5435l = z9;
        }
    }

    /* renamed from: c */
    private synchronized void m5089c(boolean z9) {
        if (z9) {
            m5094g();
        } else {
            m5095h();
        }
    }

    /* renamed from: a */
    private static boolean m5087a(String str, String str2, String str3) throws Throwable {
        Map<String, String[]> map;
        TraceFileHelper.C6398a targetDumpInfo = TraceFileHelper.readTargetDumpInfo(str3, str, true);
        if (targetDumpInfo != null && (map = targetDumpInfo.f5119d) != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder(1024);
            String[] strArr = targetDumpInfo.f5119d.get("main");
            if (strArr != null && strArr.length >= 3) {
                sb.append("\"main\" tid=");
                sb.append(strArr[2]);
                sb.append(" :\n");
                sb.append(strArr[0]);
                sb.append(SignParameters.NEW_LINE);
                sb.append(strArr[1]);
                sb.append("\n\n");
            }
            for (Map.Entry<String, String[]> entry : targetDumpInfo.f5119d.entrySet()) {
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
            return C6415am.m4935a(str2, sb.toString(), sb.length() * 2);
        }
        C6414al.m4929e("not found trace dump for %s", str3);
        return false;
    }

    /* renamed from: a */
    private static String m5084a(List<C6430ba> list, long j10) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder(4096);
            sb.append("\n>>>>> 以下为anr过程中主线程堆栈记录，可根据堆栈出现次数推测在该堆栈阻塞的时间，出现次数越多对anr贡献越大，越可能是造成anr的原因 >>>>>\n");
            sb.append("\n>>>>> Thread Stack Traces Records Start >>>>>\n");
            for (int i10 = 0; i10 < list.size(); i10++) {
                C6430ba c6430ba = list.get(i10);
                sb.append("Thread name:");
                sb.append(c6430ba.f5445a);
                sb.append(SignParameters.NEW_LINE);
                long j11 = c6430ba.f5446b - j10;
                String str = j11 <= 0 ? "before " : "after ";
                sb.append("Got ");
                sb.append(str);
                sb.append("anr:");
                sb.append(Math.abs(j11));
                sb.append("ms\n");
                sb.append(c6430ba.f5447c);
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
    public final boolean m5098a(boolean z9) {
        boolean zCompareAndSet = this.f5425a.compareAndSet(!z9, z9);
        C6414al.m4927c("tryChangeAnrState to %s, success:%s", Boolean.valueOf(z9), Boolean.valueOf(zCompareAndSet));
        return zCompareAndSet;
    }

    /* renamed from: a */
    public final void m5096a(long j10, String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfoM5101a;
        List<C6430ba> listM5125c;
        try {
            C6414al.m4927c("anr time:%s", Long.valueOf(j10));
            synchronized (this.f5433j) {
                try {
                    if (this.f5436m != null) {
                        C6414al.m4927c("Disable record main stack trace.", new Object[0]);
                        this.f5436m.m5130c();
                    }
                } finally {
                }
            }
            String strM4963a = C6418ap.m4963a(Looper.getMainLooper().getThread());
            Map<String, String> mapM4969a = C6418ap.m4969a(this.f5427c.f5160R, C6422at.f5361h);
            if (this.f5427c.m4796a()) {
                boolean z9 = C6404ab.m4844o() || C6404ab.m4845p();
                C6414al.m4927c("isAnrCrashDevice:%s", Boolean.valueOf(z9));
                if (!z9) {
                    processErrorStateInfoM5101a = C6428az.m5101a(this.f5426b, 21000L);
                } else {
                    processErrorStateInfoM5101a = C6428az.m5101a(this.f5426b, 0L);
                }
            } else {
                processErrorStateInfoM5101a = C6428az.m5101a(this.f5426b, 0L);
            }
            if (processErrorStateInfoM5101a == null) {
                C6414al.m4927c("proc state is invisible or not my proc!", new Object[0]);
                return;
            }
            C6426ax c6426ax = new C6426ax();
            c6426ax.f5419c = j10;
            c6426ax.f5417a = processErrorStateInfoM5101a.processName;
            c6426ax.f5422f = processErrorStateInfoM5101a.shortMsg;
            c6426ax.f5421e = processErrorStateInfoM5101a.longMsg;
            c6426ax.f5418b = mapM4969a;
            c6426ax.f5423g = strM4963a;
            if (TextUtils.isEmpty(strM4963a)) {
                c6426ax.f5423g = "main stack is null , some error may be encountered.";
            }
            Long lValueOf = Long.valueOf(c6426ax.f5419c);
            String str2 = c6426ax.f5420d;
            String str3 = c6426ax.f5417a;
            String str4 = c6426ax.f5423g;
            String str5 = c6426ax.f5422f;
            String str6 = c6426ax.f5421e;
            Map<String, String> map = c6426ax.f5418b;
            C6414al.m4927c("anr time:%d\ntrace file:%s\nproc:%s\nmain stack:%s\nshort msg:%s\nlong msg:%s\n threads:%d", lValueOf, str2, str3, str4, str5, str6, Integer.valueOf(map == null ? 0 : map.size()));
            C6414al.m4923a("found visible anr , start to upload!", new Object[0]);
            C6414al.m4927c("trace file:%s", str);
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                File file = new File(this.f5429e, "bugly_trace_" + j10 + ".txt");
                C6414al.m4927c("trace file exists", new Object[0]);
                if (str.startsWith("/data/anr/")) {
                    C6414al.m4923a("backup trace isOK:%s", Boolean.valueOf(m5087a(str, file.getAbsolutePath(), c6426ax.f5417a)));
                } else {
                    C6414al.m4923a("trace file rename :%s", Boolean.valueOf(new File(str).renameTo(file)));
                }
                synchronized (this.f5433j) {
                    try {
                        C6436bg c6436bg = this.f5436m;
                        listM5125c = c6436bg != null ? c6436bg.f5475a.m5125c() : null;
                    } finally {
                    }
                }
                if (listM5125c != null) {
                    String strM5084a = m5084a(listM5125c, j10);
                    C6414al.m4927c("save main stack trace", new Object[0]);
                    C6415am.m4933a(file, strM5084a, SieveCacheKt.NodeLinkMask, true);
                }
                c6426ax.f5420d = file.getAbsolutePath();
            } else {
                C6414al.m4927c("trace file is null or not exists, just ignore", new Object[0]);
            }
            CrashDetailBean crashDetailBeanM5082a = m5082a(c6426ax);
            C6422at.m5046a().m5051a(crashDetailBeanM5082a);
            if (crashDetailBeanM5082a.f5084a >= 0) {
                C6414al.m4923a("backup anr record success!", new Object[0]);
            } else {
                C6414al.m4928d("backup anr record fail!", new Object[0]);
            }
            C6421as.m5013a("ANR", C6418ap.m4960a(j10), c6426ax.f5417a, "main", c6426ax.f5423g, crashDetailBeanM5082a);
            if (!this.f5432i.m5042a(crashDetailBeanM5082a, !C6404ab.m4847r())) {
                this.f5432i.m5044b(crashDetailBeanM5082a, true);
            }
            this.f5432i.m5040a(crashDetailBeanM5082a);
            synchronized (this.f5433j) {
                try {
                    if (this.f5436m != null) {
                        C6414al.m4927c("Finish anr process.", new Object[0]);
                        this.f5436m.m5131d();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                C6414al.m4926b(th);
            } finally {
                m5098a(false);
            }
        }
    }

    /* renamed from: a */
    public final boolean m5097a(long j10) {
        if (Math.abs(j10 - this.f5438o) < WorkRequest.MIN_BACKOFF_MILLIS) {
            C6414al.m4928d("should not process ANR too Fre in %dms", 10000);
            return true;
        }
        this.f5438o = j10;
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5085a(C6427ay c6427ay) {
        long jCurrentTimeMillis = (C6422at.f5363j + System.currentTimeMillis()) - C6418ap.m4978b();
        C6415am.m4932a(c6427ay.f5429e, "bugly_trace_", ".txt", jCurrentTimeMillis);
        C6415am.m4932a(c6427ay.f5429e, "manual_bugly_trace_", ".txt", jCurrentTimeMillis);
        C6415am.m4932a(c6427ay.f5429e, "main_stack_record_", ".txt", jCurrentTimeMillis);
        C6415am.m4932a(c6427ay.f5429e, "main_stack_record_", ".txt.merged", jCurrentTimeMillis);
    }
}
