package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.text.TextUtils;
import androidx.collection.SieveCacheKt;
import androidx.work.WorkRequest;
import com.efs.sdk.base.protocol.file.section.AbsSection;
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
public final class C6687ay {

    /* renamed from: f */
    public static C6687ay f6001f;

    /* renamed from: b */
    public final ActivityManager f6003b;

    /* renamed from: c */
    final C6663aa f6004c;

    /* renamed from: d */
    final C6673ak f6005d;

    /* renamed from: e */
    String f6006e;

    /* renamed from: g */
    private final Context f6007g;

    /* renamed from: h */
    private final C6665ac f6008h;

    /* renamed from: i */
    private final C6681as f6009i;

    /* renamed from: k */
    private FileObserver f6011k;

    /* renamed from: m */
    private C6696bg f6013m;

    /* renamed from: n */
    private int f6014n;

    /* renamed from: a */
    public final AtomicBoolean f6002a = new AtomicBoolean(false);

    /* renamed from: j */
    private final Object f6010j = new Object();

    /* renamed from: l */
    private boolean f6012l = true;

    /* renamed from: o */
    private long f6015o = 0;

    public C6687ay(Context context, C6665ac c6665ac, C6663aa c6663aa, C6673ak c6673ak, C6681as c6681as) {
        Context contextM5132a = C6678ap.m5132a(context);
        this.f6007g = contextM5132a;
        this.f6003b = (ActivityManager) contextM5132a.getSystemService("activity");
        if (C6678ap.m5165b(NativeCrashHandler.getDumpFilePath())) {
            this.f6006e = context.getDir("bugly", 0).getAbsolutePath();
        } else {
            this.f6006e = NativeCrashHandler.getDumpFilePath();
        }
        this.f6004c = c6663aa;
        this.f6005d = c6673ak;
        this.f6008h = c6665ac;
        this.f6009i = c6681as;
    }

    /* renamed from: c */
    private synchronized void m5267c() {
        if (m5271e()) {
            C6674al.m5107d("start when started!", new Object[0]);
            return;
        }
        FileObserver fileObserver = new FileObserver("/data/anr/") { // from class: com.tencent.bugly.proguard.ay.1
            @Override // android.os.FileObserver
            public final void onEvent(int i9, String str) {
                if (str == null) {
                    return;
                }
                final String strConcat = "/data/anr/".concat(str);
                C6674al.m5107d("watching file %s", strConcat);
                if (strConcat.contains("trace")) {
                    C6687ay.this.f6005d.m5095a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6687ay c6687ay = C6687ay.this;
                            String str2 = strConcat;
                            if (c6687ay.m5277a(true)) {
                                try {
                                    C6674al.m5106c("read trace first dump for create time!", new Object[0]);
                                    TraceFileHelper.C6658a firstDumpInfo = TraceFileHelper.readFirstDumpInfo(str2, false);
                                    long jCurrentTimeMillis = firstDumpInfo != null ? firstDumpInfo.f5695c : -1L;
                                    if (jCurrentTimeMillis == -1) {
                                        C6674al.m5107d("trace dump fail could not get time!", new Object[0]);
                                        jCurrentTimeMillis = System.currentTimeMillis();
                                    }
                                    if (c6687ay.m5276a(jCurrentTimeMillis)) {
                                        return;
                                    }
                                    c6687ay.m5275a(jCurrentTimeMillis, str2);
                                } catch (Throwable th) {
                                    if (!C6674al.m5103a(th)) {
                                        th.printStackTrace();
                                    }
                                    C6674al.m5108e("handle anr error %s", th.getClass().toString());
                                }
                            }
                        }
                    });
                } else {
                    C6674al.m5107d("not anr file %s", strConcat);
                }
            }
        };
        this.f6011k = fileObserver;
        try {
            fileObserver.startWatching();
            C6674al.m5102a("start anr monitor!", new Object[0]);
            this.f6005d.m5095a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.2
                @Override // java.lang.Runnable
                public final void run() {
                    C6687ay.m5264a(C6687ay.this);
                }
            });
        } catch (Throwable th) {
            this.f6011k = null;
            C6674al.m5107d("start anr monitor failed!", new Object[0]);
            if (C6674al.m5103a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: d */
    private synchronized void m5269d() {
        if (!m5271e()) {
            C6674al.m5107d("close when closed!", new Object[0]);
            return;
        }
        try {
            this.f6011k.stopWatching();
            this.f6011k = null;
            C6674al.m5107d("close anr monitor!", new Object[0]);
        } catch (Throwable th) {
            C6674al.m5107d("stop anr monitor failed!", new Object[0]);
            if (C6674al.m5103a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private synchronized boolean m5271e() {
        return this.f6011k != null;
    }

    /* renamed from: f */
    private synchronized boolean m5272f() {
        return this.f6012l;
    }

    /* renamed from: g */
    private synchronized void m5273g() {
        if (m5271e()) {
            C6674al.m5107d("start when started!", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(this.f6006e)) {
            return;
        }
        synchronized (this.f6010j) {
            try {
                C6696bg c6696bg = this.f6013m;
                if (c6696bg == null || !c6696bg.isAlive()) {
                    C6696bg c6696bg2 = new C6696bg();
                    this.f6013m = c6696bg2;
                    boolean z9 = this.f6004c.f5738S;
                    c6696bg2.f6053b = z9;
                    C6674al.m5106c("set record stack trace enable:".concat(String.valueOf(z9)), new Object[0]);
                    C6696bg c6696bg3 = this.f6013m;
                    StringBuilder sb = new StringBuilder("Bugly-ThreadMonitor");
                    int i9 = this.f6014n;
                    this.f6014n = i9 + 1;
                    sb.append(i9);
                    c6696bg3.setName(sb.toString());
                    this.f6013m.m5308b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        FileObserver fileObserver = new FileObserver(this.f6006e) { // from class: com.tencent.bugly.proguard.ay.3
            @Override // android.os.FileObserver
            public final void onEvent(int i10, String str) {
                if (str == null) {
                    return;
                }
                C6674al.m5107d("observe file, dir:%s fileName:%s", C6687ay.this.f6006e, str);
                if (!str.startsWith("manual_bugly_trace_") || !str.endsWith(".txt")) {
                    C6674al.m5106c("not manual trace file, ignore.", new Object[0]);
                    return;
                }
                if (!C6687ay.this.f6002a.get()) {
                    C6674al.m5106c("proc is not in anr, just ignore", new Object[0]);
                    return;
                }
                if (C6687ay.this.f6004c.m4975a()) {
                    C6674al.m5106c("Found foreground anr, resend sigquit immediately.", new Object[0]);
                    NativeCrashHandler.getInstance().resendSigquit();
                    long jM5109a = C6675am.m5109a(str, "manual_bugly_trace_", ".txt");
                    C6687ay.this.m5275a(jM5109a, C6687ay.this.f6006e + "/" + str);
                    C6674al.m5106c("Finish handling one anr.", new Object[0]);
                    return;
                }
                C6674al.m5106c("Found background anr, resend sigquit later.", new Object[0]);
                long jM5109a2 = C6675am.m5109a(str, "manual_bugly_trace_", ".txt");
                C6687ay.this.m5275a(jM5109a2, C6687ay.this.f6006e + "/" + str);
                C6674al.m5106c("Finish handling one anr, now resend sigquit.", new Object[0]);
                NativeCrashHandler.getInstance().resendSigquit();
            }
        };
        this.f6011k = fileObserver;
        try {
            fileObserver.startWatching();
            C6674al.m5102a("startWatchingPrivateAnrDir! dumFilePath is %s", this.f6006e);
            this.f6005d.m5095a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.4
                @Override // java.lang.Runnable
                public final void run() {
                    C6687ay.m5264a(C6687ay.this);
                }
            });
        } catch (Throwable th2) {
            this.f6011k = null;
            C6674al.m5107d("startWatchingPrivateAnrDir failed!", new Object[0]);
            if (C6674al.m5103a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: h */
    private synchronized void m5274h() {
        if (!m5271e()) {
            C6674al.m5107d("close when closed!", new Object[0]);
            return;
        }
        synchronized (this.f6010j) {
            try {
                C6696bg c6696bg = this.f6013m;
                if (c6696bg != null) {
                    c6696bg.m5307a();
                    this.f6013m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6674al.m5102a("stopWatchingPrivateAnrDir", new Object[0]);
        try {
            this.f6011k.stopWatching();
            this.f6011k = null;
            C6674al.m5107d("close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            C6674al.m5107d("stop anr monitor failed!", new Object[0]);
            if (C6674al.m5103a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m5279b(boolean z9) {
        m5270d(z9);
        boolean zM5272f = m5272f();
        C6665ac c6665acM5031a = C6665ac.m5031a();
        if (c6665acM5031a != null) {
            zM5272f = zM5272f && c6665acM5031a.m5040c().f5617f;
        }
        if (zM5272f != m5271e()) {
            C6674al.m5102a("anr changed to %b", Boolean.valueOf(zM5272f));
            m5268c(zM5272f);
        }
    }

    /* renamed from: a */
    public static synchronized C6687ay m5262a() {
        return f6001f;
    }

    /* renamed from: a */
    private CrashDetailBean m5261a(C6686ax c6686ax) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.f5637C = C6664ab.m5018j();
            crashDetailBean.f5638D = C6664ab.m5014f();
            crashDetailBean.f5639E = C6664ab.m5020l();
            crashDetailBean.f5640F = this.f6004c.m4991k();
            crashDetailBean.f5641G = this.f6004c.m4990j();
            crashDetailBean.f5642H = this.f6004c.m4992l();
            crashDetailBean.f5643I = C6664ab.m5008b(this.f6007g);
            crashDetailBean.f5644J = C6664ab.m5015g();
            crashDetailBean.f5645K = C6664ab.m5016h();
            crashDetailBean.f5663b = 3;
            crashDetailBean.f5666e = this.f6004c.m4986g();
            C6663aa c6663aa = this.f6004c;
            crashDetailBean.f5667f = c6663aa.f5783o;
            crashDetailBean.f5668g = c6663aa.m4996q();
            crashDetailBean.f5674m = this.f6004c.m4984f();
            crashDetailBean.f5675n = "ANR_EXCEPTION";
            crashDetailBean.f5676o = c6686ax.f5999f;
            crashDetailBean.f5678q = c6686ax.f6000g;
            HashMap map = new HashMap();
            crashDetailBean.f5654T = map;
            map.put("BUGLY_CR_01", c6686ax.f5998e);
            String str = crashDetailBean.f5678q;
            int iIndexOf = str != null ? str.indexOf(AbsSection.SEP_ORIGIN_LINE_BREAK) : -1;
            crashDetailBean.f5677p = iIndexOf > 0 ? crashDetailBean.f5678q.substring(0, iIndexOf) : "GET_FAIL";
            crashDetailBean.f5679r = c6686ax.f5996c;
            String str2 = crashDetailBean.f5678q;
            if (str2 != null) {
                crashDetailBean.f5682u = C6678ap.m5167c(str2.getBytes());
            }
            crashDetailBean.f5687z = c6686ax.f5995b;
            crashDetailBean.f5635A = c6686ax.f5994a;
            crashDetailBean.f5636B = "main(1)";
            crashDetailBean.f5646L = this.f6004c.m4998s();
            crashDetailBean.f5669h = this.f6004c.m4995p();
            crashDetailBean.f5670i = this.f6004c.m4971A();
            crashDetailBean.f5683v = c6686ax.f5997d;
            C6663aa c6663aa2 = this.f6004c;
            crashDetailBean.f5650P = c6663aa2.f5789u;
            crashDetailBean.f5651Q = c6663aa2.f5745a;
            crashDetailBean.f5652R = c6663aa2.m4975a();
            crashDetailBean.f5655U = this.f6004c.m5005z();
            C6663aa c6663aa3 = this.f6004c;
            crashDetailBean.f5656V = c6663aa3.f5792x;
            crashDetailBean.f5657W = c6663aa3.m4999t();
            crashDetailBean.f5658X = this.f6004c.m5004y();
            crashDetailBean.f5686y = C6677ao.m5121a();
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C6674al.m5103a(th)) {
                th.printStackTrace();
            }
            return crashDetailBean;
        }
    }

    /* renamed from: b */
    public final synchronized void m5278b() {
        C6674al.m5107d("customer decides whether to open or close.", new Object[0]);
    }

    /* renamed from: d */
    private synchronized void m5270d(boolean z9) {
        if (this.f6012l != z9) {
            C6674al.m5102a("user change anr %b", Boolean.valueOf(z9));
            this.f6012l = z9;
        }
    }

    /* renamed from: c */
    private synchronized void m5268c(boolean z9) {
        if (z9) {
            m5273g();
        } else {
            m5274h();
        }
    }

    /* renamed from: a */
    private static boolean m5266a(String str, String str2, String str3) throws Throwable {
        Map<String, String[]> map;
        TraceFileHelper.C6658a targetDumpInfo = TraceFileHelper.readTargetDumpInfo(str3, str, true);
        if (targetDumpInfo != null && (map = targetDumpInfo.f5696d) != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder(1024);
            String[] strArr = targetDumpInfo.f5696d.get("main");
            if (strArr != null && strArr.length >= 3) {
                sb.append("\"main\" tid=");
                sb.append(strArr[2]);
                sb.append(" :\n");
                sb.append(strArr[0]);
                sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                sb.append(strArr[1]);
                sb.append("\n\n");
            }
            for (Map.Entry<String, String[]> entry : targetDumpInfo.f5696d.entrySet()) {
                if (!entry.getKey().equals("main") && entry.getValue() != null && entry.getValue().length >= 3) {
                    sb.append("\"");
                    sb.append(entry.getKey());
                    sb.append("\" tid=");
                    sb.append(entry.getValue()[2]);
                    sb.append(" :\n");
                    sb.append(entry.getValue()[0]);
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                    sb.append(entry.getValue()[1]);
                    sb.append("\n\n");
                }
            }
            return C6675am.m5114a(str2, sb.toString(), sb.length() * 2);
        }
        C6674al.m5108e("not found trace dump for %s", str3);
        return false;
    }

    /* renamed from: a */
    private static String m5263a(List<C6690ba> list, long j9) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder(4096);
            sb.append("\n>>>>> 以下为anr过程中主线程堆栈记录，可根据堆栈出现次数推测在该堆栈阻塞的时间，出现次数越多对anr贡献越大，越可能是造成anr的原因 >>>>>\n");
            sb.append("\n>>>>> Thread Stack Traces Records Start >>>>>\n");
            for (int i9 = 0; i9 < list.size(); i9++) {
                C6690ba c6690ba = list.get(i9);
                sb.append("Thread name:");
                sb.append(c6690ba.f6022a);
                sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                long j10 = c6690ba.f6023b - j9;
                String str = j10 <= 0 ? "before " : "after ";
                sb.append("Got ");
                sb.append(str);
                sb.append("anr:");
                sb.append(Math.abs(j10));
                sb.append("ms\n");
                sb.append(c6690ba.f6024c);
                sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
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
    public final boolean m5277a(boolean z9) {
        boolean zCompareAndSet = this.f6002a.compareAndSet(!z9, z9);
        C6674al.m5106c("tryChangeAnrState to %s, success:%s", Boolean.valueOf(z9), Boolean.valueOf(zCompareAndSet));
        return zCompareAndSet;
    }

    /* renamed from: a */
    public final void m5275a(long j9, String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfoM5280a;
        List<C6690ba> listM5304c;
        try {
            C6674al.m5106c("anr time:%s", Long.valueOf(j9));
            synchronized (this.f6010j) {
                try {
                    if (this.f6013m != null) {
                        C6674al.m5106c("Disable record main stack trace.", new Object[0]);
                        this.f6013m.m5309c();
                    }
                } finally {
                }
            }
            String strM5142a = C6678ap.m5142a(Looper.getMainLooper().getThread());
            Map<String, String> mapM5148a = C6678ap.m5148a(this.f6004c.f5737R, C6682at.f5938h);
            if (this.f6004c.m4975a()) {
                boolean z9 = C6664ab.m5023o() || C6664ab.m5024p();
                C6674al.m5106c("isAnrCrashDevice:%s", Boolean.valueOf(z9));
                if (!z9) {
                    processErrorStateInfoM5280a = C6688az.m5280a(this.f6003b, 21000L);
                } else {
                    processErrorStateInfoM5280a = C6688az.m5280a(this.f6003b, 0L);
                }
            } else {
                processErrorStateInfoM5280a = C6688az.m5280a(this.f6003b, 0L);
            }
            if (processErrorStateInfoM5280a == null) {
                C6674al.m5106c("proc state is invisible or not my proc!", new Object[0]);
                return;
            }
            C6686ax c6686ax = new C6686ax();
            c6686ax.f5996c = j9;
            c6686ax.f5994a = processErrorStateInfoM5280a.processName;
            c6686ax.f5999f = processErrorStateInfoM5280a.shortMsg;
            c6686ax.f5998e = processErrorStateInfoM5280a.longMsg;
            c6686ax.f5995b = mapM5148a;
            c6686ax.f6000g = strM5142a;
            if (TextUtils.isEmpty(strM5142a)) {
                c6686ax.f6000g = "main stack is null , some error may be encountered.";
            }
            Long lValueOf = Long.valueOf(c6686ax.f5996c);
            String str2 = c6686ax.f5997d;
            String str3 = c6686ax.f5994a;
            String str4 = c6686ax.f6000g;
            String str5 = c6686ax.f5999f;
            String str6 = c6686ax.f5998e;
            Map<String, String> map = c6686ax.f5995b;
            C6674al.m5106c("anr time:%d\ntrace file:%s\nproc:%s\nmain stack:%s\nshort msg:%s\nlong msg:%s\n threads:%d", lValueOf, str2, str3, str4, str5, str6, Integer.valueOf(map == null ? 0 : map.size()));
            C6674al.m5102a("found visible anr , start to upload!", new Object[0]);
            C6674al.m5106c("trace file:%s", str);
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                File file = new File(this.f6006e, "bugly_trace_" + j9 + ".txt");
                C6674al.m5106c("trace file exists", new Object[0]);
                if (str.startsWith("/data/anr/")) {
                    C6674al.m5102a("backup trace isOK:%s", Boolean.valueOf(m5266a(str, file.getAbsolutePath(), c6686ax.f5994a)));
                } else {
                    C6674al.m5102a("trace file rename :%s", Boolean.valueOf(new File(str).renameTo(file)));
                }
                synchronized (this.f6010j) {
                    try {
                        C6696bg c6696bg = this.f6013m;
                        listM5304c = c6696bg != null ? c6696bg.f6052a.m5304c() : null;
                    } finally {
                    }
                }
                if (listM5304c != null) {
                    String strM5263a = m5263a(listM5304c, j9);
                    C6674al.m5106c("save main stack trace", new Object[0]);
                    C6675am.m5112a(file, strM5263a, SieveCacheKt.NodeLinkMask, true);
                }
                c6686ax.f5997d = file.getAbsolutePath();
            } else {
                C6674al.m5106c("trace file is null or not exists, just ignore", new Object[0]);
            }
            CrashDetailBean crashDetailBeanM5261a = m5261a(c6686ax);
            C6682at.m5225a().m5230a(crashDetailBeanM5261a);
            if (crashDetailBeanM5261a.f5661a >= 0) {
                C6674al.m5102a("backup anr record success!", new Object[0]);
            } else {
                C6674al.m5107d("backup anr record fail!", new Object[0]);
            }
            C6681as.m5192a("ANR", C6678ap.m5139a(j9), c6686ax.f5994a, "main", c6686ax.f6000g, crashDetailBeanM5261a);
            if (!this.f6009i.m5221a(crashDetailBeanM5261a, !C6664ab.m5026r())) {
                this.f6009i.m5223b(crashDetailBeanM5261a, true);
            }
            this.f6009i.m5219a(crashDetailBeanM5261a);
            synchronized (this.f6010j) {
                try {
                    if (this.f6013m != null) {
                        C6674al.m5106c("Finish anr process.", new Object[0]);
                        this.f6013m.m5310d();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                C6674al.m5105b(th);
            } finally {
                m5277a(false);
            }
        }
    }

    /* renamed from: a */
    public final boolean m5276a(long j9) {
        if (Math.abs(j9 - this.f6015o) < WorkRequest.MIN_BACKOFF_MILLIS) {
            C6674al.m5107d("should not process ANR too Fre in %dms", 10000);
            return true;
        }
        this.f6015o = j9;
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5264a(C6687ay c6687ay) {
        long jCurrentTimeMillis = (C6682at.f5940j + System.currentTimeMillis()) - C6678ap.m5157b();
        C6675am.m5111a(c6687ay.f6006e, "bugly_trace_", ".txt", jCurrentTimeMillis);
        C6675am.m5111a(c6687ay.f6006e, "manual_bugly_trace_", ".txt", jCurrentTimeMillis);
        C6675am.m5111a(c6687ay.f6006e, "main_stack_record_", ".txt", jCurrentTimeMillis);
        C6675am.m5111a(c6687ay.f6006e, "main_stack_record_", ".txt.merged", jCurrentTimeMillis);
    }
}
