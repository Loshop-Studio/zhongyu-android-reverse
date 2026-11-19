package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.C1862at;
import com.umeng.analytics.pro.C1878bi;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C1965a;
import com.umeng.commonsdk.internal.C1966b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.stateless.C1987d;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.C2000e;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.C2010a;
import com.umeng.commonsdk.statistics.internal.C2012c;
import com.umeng.commonsdk.statistics.internal.InterfaceC2013d;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.proto.Response;
import java.io.File;

/* renamed from: com.umeng.commonsdk.statistics.c */
/* loaded from: classes.dex */
public class C1990c {

    /* renamed from: b */
    private static final int f9332b = 1;

    /* renamed from: c */
    private static final int f9333c = 2;

    /* renamed from: d */
    private static final int f9334d = 3;

    /* renamed from: o */
    private static final String f9335o = "thtstart";

    /* renamed from: p */
    private static final String f9336p = "gkvc";

    /* renamed from: q */
    private static final String f9337q = "ekvc";

    /* renamed from: a */
    String f9338a;

    /* renamed from: f */
    private C2012c f9340f;

    /* renamed from: g */
    private ImprintHandler f9341g;

    /* renamed from: h */
    private C2000e f9342h;

    /* renamed from: i */
    private ImprintHandler.C1995a f9343i;

    /* renamed from: k */
    private Defcon f9345k;

    /* renamed from: l */
    private long f9346l;

    /* renamed from: m */
    private int f9347m;

    /* renamed from: n */
    private int f9348n;

    /* renamed from: r */
    private Context f9349r;

    /* renamed from: e */
    private final int f9339e = 1;

    /* renamed from: j */
    private ABTest f9344j = null;

    public C1990c(Context context) {
        this.f9342h = null;
        this.f9343i = null;
        this.f9345k = null;
        this.f9346l = 0L;
        this.f9347m = 0;
        this.f9348n = 0;
        this.f9338a = null;
        this.f9349r = context;
        this.f9343i = ImprintHandler.getImprintService(context).m7673c();
        this.f9345k = Defcon.getService(this.f9349r);
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f9349r);
        this.f9346l = sharedPreferences.getLong(f9335o, 0L);
        this.f9347m = sharedPreferences.getInt(f9336p, 0);
        this.f9348n = sharedPreferences.getInt(f9337q, 0);
        this.f9338a = UMEnvelopeBuild.imprintProperty(this.f9349r, "track_list", null);
        ImprintHandler imprintService = ImprintHandler.getImprintService(this.f9349r);
        this.f9341g = imprintService;
        imprintService.m7667a(new InterfaceC2013d() { // from class: com.umeng.commonsdk.statistics.c.1
            @Override // com.umeng.commonsdk.statistics.internal.InterfaceC2013d
            public void onImprintChanged(ImprintHandler.C1995a c1995a) {
                C1990c.this.f9345k.onImprintChanged(c1995a);
                C1990c c1990c = C1990c.this;
                c1990c.f9338a = UMEnvelopeBuild.imprintProperty(c1990c.f9349r, "track_list", null);
            }
        });
        if (!UMConfigure.needSendZcfgEnv(this.f9349r)) {
            this.f9342h = C2000e.m7690a(this.f9349r);
        }
        C2012c c2012c = new C2012c(this.f9349r);
        this.f9340f = c2012c;
        c2012c.m7732a(StatTracer.getInstance(this.f9349r));
    }

    /* renamed from: a */
    public boolean m7563a(File file) {
        if (file == null) {
            return false;
        }
        try {
            byte[] byteArray = UMFrUtils.toByteArray(file.getPath());
            if (byteArray == null) {
                return false;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name)) {
                return false;
            }
            C2010a c2010aM7716a = C2010a.m7716a(this.f9349r);
            c2010aM7716a.m7724d(name);
            boolean zM7720a = c2010aM7716a.m7720a(name);
            boolean zM7722b = c2010aM7716a.m7722b(name);
            boolean zM7723c = c2010aM7716a.m7723c(name);
            String strM7543d = C1987d.m7543d(name);
            byte[] bArrM7734a = this.f9340f.m7734a(byteArray, zM7720a, zM7723c, !TextUtils.isEmpty(strM7543d) ? C1987d.m7540c(strM7543d) : zM7723c ? UMServerURL.ZCFG_PATH : UMServerURL.PATH_ANALYTICS);
            int iM7560a = bArrM7734a == null ? 1 : m7560a(bArrM7734a);
            if (UMConfigure.isDebugLog()) {
                if (zM7723c && iM7560a == 2) {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "Zero req: succeed.");
                } else if (zM7722b && iM7560a == 2) {
                    MLog.m7564d("本次启动数据: 发送成功!");
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "Send instant data: succeed.");
                } else if (zM7720a && iM7560a == 2) {
                    MLog.m7564d("普通统计数据: 发送成功!");
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "Send analytics data: succeed.");
                } else {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "Inner req: succeed.");
                }
            }
            if (iM7560a == 2) {
                C2000e c2000e = this.f9342h;
                if (c2000e != null) {
                    c2000e.m7701e();
                }
                StatTracer.getInstance(this.f9349r).saveSate();
            } else if (iM7560a == 3) {
                StatTracer.getInstance(this.f9349r).saveSate();
                if (zM7723c) {
                    FieldManager.m7329a().m7331a(this.f9349r);
                    UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 零号报文应答内容报错!!! ，特殊处理!，继续正常流程。");
                    Context context = this.f9349r;
                    UMWorkDispatch.sendEvent(context, C1965a.f9186s, C1966b.m7392a(context).m7393a(), null);
                    return true;
                }
            }
            return iM7560a == 2;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f9349r, th);
            return false;
        }
    }

    /* renamed from: a */
    private int m7560a(byte[] bArr) {
        Response response = new Response();
        try {
            new C1862at(new C1878bi.a()).m6911a(response, bArr);
            if (response.resp_code == 1) {
                this.f9341g.m7672b(response.getImprint());
                this.f9341g.m7674d();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f9349r, th);
        }
        return response.resp_code == 1 ? 2 : 3;
    }
}
