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
import org.android.agoo.common.AgooConstants;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: com.tencent.bugly.proguard.ay */
/* loaded from: classes5.dex */
public final class C7792ay {

    /* renamed from: f */
    public static C7792ay f13866f;

    /* renamed from: b */
    public final ActivityManager f13868b;

    /* renamed from: c */
    final C7768aa f13869c;

    /* renamed from: d */
    final C7778ak f13870d;

    /* renamed from: e */
    String f13871e;

    /* renamed from: g */
    private final Context f13872g;

    /* renamed from: h */
    private final C7770ac f13873h;

    /* renamed from: i */
    private final C7786as f13874i;

    /* renamed from: k */
    private FileObserver f13876k;

    /* renamed from: m */
    private C7801bg f13878m;

    /* renamed from: n */
    private int f13879n;

    /* renamed from: a */
    public final AtomicBoolean f13867a = new AtomicBoolean(false);

    /* renamed from: j */
    private final Object f13875j = new Object();

    /* renamed from: l */
    private boolean f13877l = true;

    /* renamed from: o */
    private long f13880o = 0;

    /* renamed from: com.tencent.bugly.proguard.ay$a */
    public class a extends FileObserver {

        /* renamed from: com.tencent.bugly.proguard.ay$a$a, reason: collision with other inner class name */
        public class RunnableC12111a implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ String f13882c;

            public RunnableC12111a(String str) {
                this.f13882c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7792ay c7792ay = C7792ay.this;
                String str = this.f13882c;
                if (c7792ay.m10788a(true)) {
                    try {
                        C7779al.m10617c("read trace first dump for create time!", new Object[0]);
                        TraceFileHelper.C7761a firstDumpInfo = TraceFileHelper.readFirstDumpInfo(str, false);
                        long jCurrentTimeMillis = firstDumpInfo != null ? firstDumpInfo.f13555c : -1L;
                        if (jCurrentTimeMillis == -1) {
                            C7779al.m10618d("trace dump fail could not get time!", new Object[0]);
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        if (c7792ay.m10787a(jCurrentTimeMillis)) {
                            return;
                        }
                        c7792ay.m10786a(jCurrentTimeMillis, str);
                    } catch (Throwable th) {
                        if (!C7779al.m10614a(th)) {
                            th.printStackTrace();
                        }
                        C7779al.m10619e("handle anr error %s", th.getClass().toString());
                    }
                }
            }
        }

        public a(String str) {
            super(str, 8);
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i10, String str) {
            if (str == null) {
                return;
            }
            String strConcat = "/data/anr/".concat(str);
            C7779al.m10618d("watching file %s", strConcat);
            if (strConcat.contains(AgooConstants.MESSAGE_TRACE)) {
                C7792ay.this.f13870d.m10606a(new RunnableC12111a(strConcat));
            } else {
                C7779al.m10618d("not anr file %s", strConcat);
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ay$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7792ay.m10775a(C7792ay.this);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ay$c */
    public class c extends FileObserver {
        public c(String str) {
            super(str, 8);
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i10, String str) {
            if (str == null) {
                return;
            }
            C7779al.m10618d("observe file, dir:%s fileName:%s", C7792ay.this.f13871e, str);
            if (!str.startsWith("manual_bugly_trace_") || !str.endsWith(".txt")) {
                C7779al.m10617c("not manual trace file, ignore.", new Object[0]);
                return;
            }
            if (!C7792ay.this.f13867a.get()) {
                C7779al.m10617c("proc is not in anr, just ignore", new Object[0]);
                return;
            }
            if (C7792ay.this.f13869c.m10486a()) {
                C7779al.m10617c("Found foreground anr, resend sigquit immediately.", new Object[0]);
                NativeCrashHandler.getInstance().resendSigquit();
                long jM10620a = C7780am.m10620a(str, "manual_bugly_trace_", ".txt");
                C7792ay.this.m10786a(jM10620a, C7792ay.this.f13871e + MqttTopic.TOPIC_LEVEL_SEPARATOR + str);
                C7779al.m10617c("Finish handling one anr.", new Object[0]);
                return;
            }
            C7779al.m10617c("Found background anr, resend sigquit later.", new Object[0]);
            long jM10620a2 = C7780am.m10620a(str, "manual_bugly_trace_", ".txt");
            C7792ay.this.m10786a(jM10620a2, C7792ay.this.f13871e + MqttTopic.TOPIC_LEVEL_SEPARATOR + str);
            C7779al.m10617c("Finish handling one anr, now resend sigquit.", new Object[0]);
            NativeCrashHandler.getInstance().resendSigquit();
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ay$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7792ay.m10775a(C7792ay.this);
        }
    }

    public C7792ay(Context context, C7770ac c7770ac, C7768aa c7768aa, C7778ak c7778ak, C7786as c7786as) {
        Context contextM10643a = C7783ap.m10643a(context);
        this.f13872g = contextM10643a;
        this.f13868b = (ActivityManager) contextM10643a.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
        if (C7783ap.m10676b(NativeCrashHandler.getDumpFilePath())) {
            this.f13871e = context.getDir("bugly", 0).getAbsolutePath();
        } else {
            this.f13871e = NativeCrashHandler.getDumpFilePath();
        }
        this.f13869c = c7768aa;
        this.f13870d = c7778ak;
        this.f13873h = c7770ac;
        this.f13874i = c7786as;
    }

    /* renamed from: c */
    private synchronized void m10778c() {
        if (m10782e()) {
            C7779al.m10618d("start when started!", new Object[0]);
            return;
        }
        a aVar = new a("/data/anr/");
        this.f13876k = aVar;
        try {
            aVar.startWatching();
            C7779al.m10613a("start anr monitor!", new Object[0]);
            this.f13870d.m10606a(new b());
        } catch (Throwable th) {
            this.f13876k = null;
            C7779al.m10618d("start anr monitor failed!", new Object[0]);
            if (C7779al.m10614a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: d */
    private synchronized void m10780d() {
        if (!m10782e()) {
            C7779al.m10618d("close when closed!", new Object[0]);
            return;
        }
        try {
            this.f13876k.stopWatching();
            this.f13876k = null;
            C7779al.m10618d("close anr monitor!", new Object[0]);
        } catch (Throwable th) {
            C7779al.m10618d("stop anr monitor failed!", new Object[0]);
            if (C7779al.m10614a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    private synchronized boolean m10782e() {
        return this.f13876k != null;
    }

    /* renamed from: f */
    private synchronized boolean m10783f() {
        return this.f13877l;
    }

    /* renamed from: g */
    private synchronized void m10784g() {
        if (m10782e()) {
            C7779al.m10618d("start when started!", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(this.f13871e)) {
            return;
        }
        synchronized (this.f13875j) {
            try {
                C7801bg c7801bg = this.f13878m;
                if (c7801bg == null || !c7801bg.isAlive()) {
                    C7801bg c7801bg2 = new C7801bg();
                    this.f13878m = c7801bg2;
                    boolean z10 = this.f13869c.f13603S;
                    c7801bg2.f13918b = z10;
                    C7779al.m10617c("set record stack trace enable:".concat(String.valueOf(z10)), new Object[0]);
                    C7801bg c7801bg3 = this.f13878m;
                    StringBuilder sb2 = new StringBuilder("Bugly-ThreadMonitor");
                    int i10 = this.f13879n;
                    this.f13879n = i10 + 1;
                    sb2.append(i10);
                    c7801bg3.setName(sb2.toString());
                    this.f13878m.m10819b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = new c(this.f13871e);
        this.f13876k = cVar;
        try {
            cVar.startWatching();
            C7779al.m10613a("startWatchingPrivateAnrDir! dumFilePath is %s", this.f13871e);
            this.f13870d.m10606a(new d());
        } catch (Throwable th2) {
            this.f13876k = null;
            C7779al.m10618d("startWatchingPrivateAnrDir failed!", new Object[0]);
            if (C7779al.m10614a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: h */
    private synchronized void m10785h() {
        if (!m10782e()) {
            C7779al.m10618d("close when closed!", new Object[0]);
            return;
        }
        synchronized (this.f13875j) {
            try {
                C7801bg c7801bg = this.f13878m;
                if (c7801bg != null) {
                    c7801bg.m10818a();
                    this.f13878m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C7779al.m10613a("stopWatchingPrivateAnrDir", new Object[0]);
        try {
            this.f13876k.stopWatching();
            this.f13876k = null;
            C7779al.m10618d("close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            C7779al.m10618d("stop anr monitor failed!", new Object[0]);
            if (C7779al.m10614a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m10790b(boolean z10) {
        m10781d(z10);
        boolean zM10783f = m10783f();
        C7770ac c7770acM10542a = C7770ac.m10542a();
        if (c7770acM10542a != null) {
            zM10783f = zM10783f && c7770acM10542a.m10551c().f13482f;
        }
        if (zM10783f != m10782e()) {
            C7779al.m10613a("anr changed to %b", Boolean.valueOf(zM10783f));
            m10779c(zM10783f);
        }
    }

    /* renamed from: a */
    public static synchronized C7792ay m10773a() {
        return f13866f;
    }

    /* renamed from: a */
    private CrashDetailBean m10772a(C7791ax c7791ax) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.f13502C = C7769ab.m10529j();
            crashDetailBean.f13503D = C7769ab.m10525f();
            crashDetailBean.f13504E = C7769ab.m10531l();
            crashDetailBean.f13505F = this.f13869c.m10502k();
            crashDetailBean.f13506G = this.f13869c.m10501j();
            crashDetailBean.f13507H = this.f13869c.m10503l();
            crashDetailBean.f13508I = C7769ab.m10519b(this.f13872g);
            crashDetailBean.f13509J = C7769ab.m10526g();
            crashDetailBean.f13510K = C7769ab.m10527h();
            crashDetailBean.f13528b = 3;
            crashDetailBean.f13531e = this.f13869c.m10497g();
            C7768aa c7768aa = this.f13869c;
            crashDetailBean.f13532f = c7768aa.f13648o;
            crashDetailBean.f13533g = c7768aa.m10507q();
            crashDetailBean.f13539m = this.f13869c.m10495f();
            crashDetailBean.f13540n = "ANR_EXCEPTION";
            crashDetailBean.f13541o = c7791ax.f13864f;
            crashDetailBean.f13543q = c7791ax.f13865g;
            HashMap map = new HashMap();
            crashDetailBean.f13519T = map;
            map.put("BUGLY_CR_01", c7791ax.f13863e);
            String str = crashDetailBean.f13543q;
            int iIndexOf = str != null ? str.indexOf(SignParameters.NEW_LINE) : -1;
            crashDetailBean.f13542p = iIndexOf > 0 ? crashDetailBean.f13543q.substring(0, iIndexOf) : "GET_FAIL";
            crashDetailBean.f13544r = c7791ax.f13861c;
            String str2 = crashDetailBean.f13543q;
            if (str2 != null) {
                crashDetailBean.f13547u = C7783ap.m10678c(str2.getBytes());
            }
            crashDetailBean.f13552z = c7791ax.f13860b;
            crashDetailBean.f13500A = c7791ax.f13859a;
            crashDetailBean.f13501B = "main(1)";
            crashDetailBean.f13511L = this.f13869c.m10509s();
            crashDetailBean.f13534h = this.f13869c.m10506p();
            crashDetailBean.f13535i = this.f13869c.m10482A();
            crashDetailBean.f13548v = c7791ax.f13862d;
            C7768aa c7768aa2 = this.f13869c;
            crashDetailBean.f13515P = c7768aa2.f13654u;
            crashDetailBean.f13516Q = c7768aa2.f13610a;
            crashDetailBean.f13517R = c7768aa2.m10486a();
            crashDetailBean.f13520U = this.f13869c.m10516z();
            C7768aa c7768aa3 = this.f13869c;
            crashDetailBean.f13521V = c7768aa3.f13657x;
            crashDetailBean.f13522W = c7768aa3.m10510t();
            crashDetailBean.f13523X = this.f13869c.m10515y();
            crashDetailBean.f13551y = C7782ao.m10632a();
            return crashDetailBean;
        } catch (Throwable th) {
            if (!C7779al.m10614a(th)) {
                th.printStackTrace();
            }
            return crashDetailBean;
        }
    }

    /* renamed from: b */
    public final synchronized void m10789b() {
        C7779al.m10618d("customer decides whether to open or close.", new Object[0]);
    }

    /* renamed from: d */
    private synchronized void m10781d(boolean z10) {
        if (this.f13877l != z10) {
            C7779al.m10613a("user change anr %b", Boolean.valueOf(z10));
            this.f13877l = z10;
        }
    }

    /* renamed from: c */
    private synchronized void m10779c(boolean z10) {
        if (z10) {
            m10784g();
        } else {
            m10785h();
        }
    }

    /* renamed from: a */
    private static boolean m10777a(String str, String str2, String str3) throws Throwable {
        Map<String, String[]> map;
        TraceFileHelper.C7761a targetDumpInfo = TraceFileHelper.readTargetDumpInfo(str3, str, true);
        if (targetDumpInfo != null && (map = targetDumpInfo.f13556d) != null && !map.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(1024);
            String[] strArr = targetDumpInfo.f13556d.get("main");
            if (strArr != null && strArr.length >= 3) {
                sb2.append("\"main\" tid=");
                sb2.append(strArr[2]);
                sb2.append(" :\n");
                sb2.append(strArr[0]);
                sb2.append(SignParameters.NEW_LINE);
                sb2.append(strArr[1]);
                sb2.append("\n\n");
            }
            for (Map.Entry<String, String[]> entry : targetDumpInfo.f13556d.entrySet()) {
                if (!entry.getKey().equals("main") && entry.getValue() != null && entry.getValue().length >= 3) {
                    sb2.append("\"");
                    sb2.append(entry.getKey());
                    sb2.append("\" tid=");
                    sb2.append(entry.getValue()[2]);
                    sb2.append(" :\n");
                    sb2.append(entry.getValue()[0]);
                    sb2.append(SignParameters.NEW_LINE);
                    sb2.append(entry.getValue()[1]);
                    sb2.append("\n\n");
                }
            }
            return C7780am.m10625a(str2, sb2.toString(), sb2.length() * 2);
        }
        C7779al.m10619e("not found trace dump for %s", str3);
        return false;
    }

    /* renamed from: a */
    private static String m10774a(List<C7795ba> list, long j10) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(4096);
            sb2.append("\n>>>>> 以下为anr过程中主线程堆栈记录，可根据堆栈出现次数推测在该堆栈阻塞的时间，出现次数越多对anr贡献越大，越可能是造成anr的原因 >>>>>\n");
            sb2.append("\n>>>>> Thread Stack Traces Records Start >>>>>\n");
            for (int i10 = 0; i10 < list.size(); i10++) {
                C7795ba c7795ba = list.get(i10);
                sb2.append("Thread name:");
                sb2.append(c7795ba.f13887a);
                sb2.append(SignParameters.NEW_LINE);
                long j11 = c7795ba.f13888b - j10;
                String str = j11 <= 0 ? "before " : "after ";
                sb2.append("Got ");
                sb2.append(str);
                sb2.append("anr:");
                sb2.append(Math.abs(j11));
                sb2.append("ms\n");
                sb2.append(c7795ba.f13889c);
                sb2.append(SignParameters.NEW_LINE);
                if (sb2.length() * 2 >= 101376) {
                    break;
                }
            }
            sb2.append("\n<<<<< Thread Stack Traces Records End <<<<<\n");
            return sb2.toString();
        }
        return "main thread stack not enable";
    }

    /* renamed from: a */
    public final boolean m10788a(boolean z10) {
        boolean zCompareAndSet = this.f13867a.compareAndSet(!z10, z10);
        C7779al.m10617c("tryChangeAnrState to %s, success:%s", Boolean.valueOf(z10), Boolean.valueOf(zCompareAndSet));
        return zCompareAndSet;
    }

    /* renamed from: a */
    public final void m10786a(long j10, String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfoM10791a;
        List<C7795ba> listM10815c;
        try {
            C7779al.m10617c("anr time:%s", Long.valueOf(j10));
            synchronized (this.f13875j) {
                try {
                    if (this.f13878m != null) {
                        C7779al.m10617c("Disable record main stack trace.", new Object[0]);
                        this.f13878m.m10820c();
                    }
                } finally {
                }
            }
            String strM10653a = C7783ap.m10653a(Looper.getMainLooper().getThread());
            Map<String, String> mapM10659a = C7783ap.m10659a(this.f13869c.f13602R, C7787at.f13803h);
            if (this.f13869c.m10486a()) {
                boolean z10 = C7769ab.m10534o() || C7769ab.m10535p();
                C7779al.m10617c("isAnrCrashDevice:%s", Boolean.valueOf(z10));
                if (!z10) {
                    processErrorStateInfoM10791a = C7793az.m10791a(this.f13868b, 21000L);
                } else {
                    processErrorStateInfoM10791a = C7793az.m10791a(this.f13868b, 0L);
                }
            } else {
                processErrorStateInfoM10791a = C7793az.m10791a(this.f13868b, 0L);
            }
            if (processErrorStateInfoM10791a == null) {
                C7779al.m10617c("proc state is invisible or not my proc!", new Object[0]);
                return;
            }
            C7791ax c7791ax = new C7791ax();
            c7791ax.f13861c = j10;
            c7791ax.f13859a = processErrorStateInfoM10791a.processName;
            c7791ax.f13864f = processErrorStateInfoM10791a.shortMsg;
            c7791ax.f13863e = processErrorStateInfoM10791a.longMsg;
            c7791ax.f13860b = mapM10659a;
            c7791ax.f13865g = strM10653a;
            if (TextUtils.isEmpty(strM10653a)) {
                c7791ax.f13865g = "main stack is null , some error may be encountered.";
            }
            Long lValueOf = Long.valueOf(c7791ax.f13861c);
            String str2 = c7791ax.f13862d;
            String str3 = c7791ax.f13859a;
            String str4 = c7791ax.f13865g;
            String str5 = c7791ax.f13864f;
            String str6 = c7791ax.f13863e;
            Map<String, String> map = c7791ax.f13860b;
            C7779al.m10617c("anr time:%d\ntrace file:%s\nproc:%s\nmain stack:%s\nshort msg:%s\nlong msg:%s\n threads:%d", lValueOf, str2, str3, str4, str5, str6, Integer.valueOf(map == null ? 0 : map.size()));
            C7779al.m10613a("found visible anr , start to upload!", new Object[0]);
            C7779al.m10617c("trace file:%s", str);
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                File file = new File(this.f13871e, "bugly_trace_" + j10 + ".txt");
                C7779al.m10617c("trace file exists", new Object[0]);
                if (str.startsWith("/data/anr/")) {
                    C7779al.m10613a("backup trace isOK:%s", Boolean.valueOf(m10777a(str, file.getAbsolutePath(), c7791ax.f13859a)));
                } else {
                    C7779al.m10613a("trace file rename :%s", Boolean.valueOf(new File(str).renameTo(file)));
                }
                synchronized (this.f13875j) {
                    try {
                        C7801bg c7801bg = this.f13878m;
                        listM10815c = c7801bg != null ? c7801bg.f13917a.m10815c() : null;
                    } finally {
                    }
                }
                if (listM10815c != null) {
                    String strM10774a = m10774a(listM10815c, j10);
                    C7779al.m10617c("save main stack trace", new Object[0]);
                    C7780am.m10623a(file, strM10774a, SieveCacheKt.NodeLinkMask, true);
                }
                c7791ax.f13862d = file.getAbsolutePath();
            } else {
                C7779al.m10617c("trace file is null or not exists, just ignore", new Object[0]);
            }
            CrashDetailBean crashDetailBeanM10772a = m10772a(c7791ax);
            C7787at.m10736a().m10741a(crashDetailBeanM10772a);
            if (crashDetailBeanM10772a.f13526a >= 0) {
                C7779al.m10613a("backup anr record success!", new Object[0]);
            } else {
                C7779al.m10618d("backup anr record fail!", new Object[0]);
            }
            C7786as.m10703a("ANR", C7783ap.m10650a(j10), c7791ax.f13859a, "main", c7791ax.f13865g, crashDetailBeanM10772a);
            if (!this.f13874i.m10732a(crashDetailBeanM10772a, !C7769ab.m10537r())) {
                this.f13874i.m10734b(crashDetailBeanM10772a, true);
            }
            this.f13874i.m10730a(crashDetailBeanM10772a);
            synchronized (this.f13875j) {
                try {
                    if (this.f13878m != null) {
                        C7779al.m10617c("Finish anr process.", new Object[0]);
                        this.f13878m.m10821d();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                C7779al.m10616b(th);
            } finally {
                m10788a(false);
            }
        }
    }

    /* renamed from: a */
    public final boolean m10787a(long j10) {
        if (Math.abs(j10 - this.f13880o) < WorkRequest.MIN_BACKOFF_MILLIS) {
            C7779al.m10618d("should not process ANR too Fre in %dms", 10000);
            return true;
        }
        this.f13880o = j10;
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m10775a(C7792ay c7792ay) {
        long jCurrentTimeMillis = (C7787at.f13805j + System.currentTimeMillis()) - C7783ap.m10668b();
        C7780am.m10622a(c7792ay.f13871e, "bugly_trace_", ".txt", jCurrentTimeMillis);
        C7780am.m10622a(c7792ay.f13871e, "manual_bugly_trace_", ".txt", jCurrentTimeMillis);
        C7780am.m10622a(c7792ay.f13871e, "main_stack_record_", ".txt", jCurrentTimeMillis);
        C7780am.m10622a(c7792ay.f13871e, "main_stack_record_", ".txt.merged", jCurrentTimeMillis);
    }
}
