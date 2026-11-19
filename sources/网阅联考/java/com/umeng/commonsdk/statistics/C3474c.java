package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3346at;
import com.umeng.analytics.pro.C3362bi;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3449a;
import com.umeng.commonsdk.internal.C3450b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.stateless.C3471d;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.C3484e;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.C3494a;
import com.umeng.commonsdk.statistics.internal.C3496c;
import com.umeng.commonsdk.statistics.internal.InterfaceC3497d;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.proto.Response;
import java.io.File;

/* renamed from: com.umeng.commonsdk.statistics.c */
/* loaded from: classes2.dex */
public class C3474c {

    /* renamed from: b */
    private static final int f2740b = 1;

    /* renamed from: c */
    private static final int f2741c = 2;

    /* renamed from: d */
    private static final int f2742d = 3;

    /* renamed from: o */
    private static final String f2743o = "thtstart";

    /* renamed from: p */
    private static final String f2744p = "gkvc";

    /* renamed from: q */
    private static final String f2745q = "ekvc";

    /* renamed from: a */
    String f2746a;

    /* renamed from: f */
    private C3496c f2748f;

    /* renamed from: g */
    private ImprintHandler f2749g;

    /* renamed from: h */
    private C3484e f2750h;

    /* renamed from: i */
    private ImprintHandler.C3479a f2751i;

    /* renamed from: k */
    private Defcon f2753k;

    /* renamed from: l */
    private long f2754l;

    /* renamed from: m */
    private int f2755m;

    /* renamed from: n */
    private int f2756n;

    /* renamed from: r */
    private Context f2757r;

    /* renamed from: e */
    private final int f2747e = 1;

    /* renamed from: j */
    private ABTest f2752j = null;

    public C3474c(Context context) {
        this.f2750h = null;
        this.f2751i = null;
        this.f2753k = null;
        this.f2754l = 0L;
        this.f2755m = 0;
        this.f2756n = 0;
        this.f2746a = null;
        this.f2757r = context;
        this.f2751i = ImprintHandler.getImprintService(context).m3750c();
        this.f2753k = Defcon.getService(this.f2757r);
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f2757r);
        this.f2754l = sharedPreferences.getLong(f2743o, 0L);
        this.f2755m = sharedPreferences.getInt(f2744p, 0);
        this.f2756n = sharedPreferences.getInt(f2745q, 0);
        this.f2746a = UMEnvelopeBuild.imprintProperty(this.f2757r, "track_list", null);
        ImprintHandler imprintService = ImprintHandler.getImprintService(this.f2757r);
        this.f2749g = imprintService;
        imprintService.m3744a(new InterfaceC3497d() { // from class: com.umeng.commonsdk.statistics.c.1
            @Override // com.umeng.commonsdk.statistics.internal.InterfaceC3497d
            public void onImprintChanged(ImprintHandler.C3479a c3479a) {
                C3474c.this.f2753k.onImprintChanged(c3479a);
                C3474c c3474c = C3474c.this;
                c3474c.f2746a = UMEnvelopeBuild.imprintProperty(c3474c.f2757r, "track_list", null);
            }
        });
        if (!UMConfigure.needSendZcfgEnv(this.f2757r)) {
            this.f2750h = C3484e.m3767a(this.f2757r);
        }
        C3496c c3496c = new C3496c(this.f2757r);
        this.f2748f = c3496c;
        c3496c.m3809a(StatTracer.getInstance(this.f2757r));
    }

    /* renamed from: a */
    public boolean m3640a(File file) {
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
            C3494a c3494aM3793a = C3494a.m3793a(this.f2757r);
            c3494aM3793a.m3801d(name);
            boolean zM3797a = c3494aM3793a.m3797a(name);
            boolean zM3799b = c3494aM3793a.m3799b(name);
            boolean zM3800c = c3494aM3793a.m3800c(name);
            String strM3620d = C3471d.m3620d(name);
            byte[] bArrM3811a = this.f2748f.m3811a(byteArray, zM3797a, zM3800c, !TextUtils.isEmpty(strM3620d) ? C3471d.m3617c(strM3620d) : zM3800c ? UMServerURL.ZCFG_PATH : UMServerURL.PATH_ANALYTICS);
            int iM3637a = bArrM3811a == null ? 1 : m3637a(bArrM3811a);
            if (UMConfigure.isDebugLog()) {
                if (zM3800c && iM3637a == 2) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "Zero req: succeed.");
                } else if (zM3799b && iM3637a == 2) {
                    MLog.m3641d("本次启动数据: 发送成功!");
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "Send instant data: succeed.");
                } else if (zM3797a && iM3637a == 2) {
                    MLog.m3641d("普通统计数据: 发送成功!");
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "Send analytics data: succeed.");
                } else {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "Inner req: succeed.");
                }
            }
            if (iM3637a == 2) {
                C3484e c3484e = this.f2750h;
                if (c3484e != null) {
                    c3484e.m3778e();
                }
                StatTracer.getInstance(this.f2757r).saveSate();
            } else if (iM3637a == 3) {
                StatTracer.getInstance(this.f2757r).saveSate();
                if (zM3800c) {
                    FieldManager.m3406a().m3408a(this.f2757r);
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 零号报文应答内容报错!!! ，特殊处理!，继续正常流程。");
                    Context context = this.f2757r;
                    UMWorkDispatch.sendEvent(context, C3449a.f2594s, C3450b.m3469a(context).m3470a(), null);
                    return true;
                }
            }
            return iM3637a == 2;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f2757r, th);
            return false;
        }
    }

    /* renamed from: a */
    private int m3637a(byte[] bArr) {
        Response response = new Response();
        try {
            new C3346at(new C3362bi.a()).m2988a(response, bArr);
            if (response.resp_code == 1) {
                this.f2749g.m3749b(response.getImprint());
                this.f2749g.m3751d();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f2757r, th);
        }
        return response.resp_code == 1 ? 2 : 3;
    }
}
