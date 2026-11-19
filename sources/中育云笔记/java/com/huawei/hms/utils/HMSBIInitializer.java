package com.huawei.hms.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.stats.C7322a;
import com.huawei.hms.stats.HianalyticsExist;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p318r5.AbstractC10844a;

/* loaded from: classes5.dex */
public class HMSBIInitializer {

    /* renamed from: d */
    public static final Object f11830d = new Object();

    /* renamed from: e */
    public static HMSBIInitializer f11831e;

    /* renamed from: f */
    public static HiAnalyticsInstance f11832f;

    /* renamed from: a */
    public final Context f11833a;

    /* renamed from: b */
    public AtomicBoolean f11834b = new AtomicBoolean(false);

    /* renamed from: c */
    public boolean f11835c = HianalyticsExist.isHianalyticsExist();

    /* renamed from: com.huawei.hms.utils.HMSBIInitializer$a */
    public class C7357a implements IQueryUrlCallBack {
        public C7357a() {
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackFail(int i10) {
            HMSLog.m8725e("HMSBIInitializer", "get grs failed, the errorcode is " + i10);
            HMSBIInitializer.this.f11834b.set(false);
            C7322a.m8666c().m8667a();
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (HMSBIInitializer.this.f11835c) {
                        HMSBIInitializer.this.m8758b(str);
                    } else {
                        AbstractC10844a.m23335c(HMSBIInitializer.this.f11833a, false, false, false, str, "com.huawei.hwid");
                    }
                    HMSLog.m8727i("HMSBIInitializer", "BI URL acquired successfully");
                } catch (Throwable th) {
                    HMSLog.m8725e("HMSBIInitializer", "HA Init error, message : " + th.getMessage());
                }
            }
            HMSBIInitializer.this.f11834b.set(false);
            C7322a.m8666c().m8669b();
        }
    }

    /* renamed from: com.huawei.hms.utils.HMSBIInitializer$b */
    public class AsyncTaskC7358b extends AsyncTask<String, Integer, Void> {
        public AsyncTaskC7358b() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            HMSBIInitializer.this.m8759f(strArr[0]);
            return null;
        }

        public /* synthetic */ AsyncTaskC7358b(HMSBIInitializer hMSBIInitializer, C7357a c7357a) {
            this();
        }
    }

    public HMSBIInitializer(Context context) {
        this.f11833a = context;
    }

    public static HMSBIInitializer getInstance(Context context) {
        synchronized (f11830d) {
            try {
                if (f11831e == null && context != null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        f11831e = new HMSBIInitializer(applicationContext);
                    } else {
                        f11831e = new HMSBIInitializer(context);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f11831e;
    }

    /* renamed from: b */
    public final void m8758b(String str) {
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag(HiAnalyticsConstant.HA_SERVICE_TAG);
        f11832f = instanceByTag;
        if (instanceByTag != null) {
            instanceByTag.setAppid("com.huawei.hwid");
            return;
        }
        HiAnalyticsConfig hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build();
        HiAnalyticsInstance hiAnalyticsInstanceCreate = new HiAnalyticsInstance.Builder(this.f11833a).setOperConf(hiAnalyticsConfigBuild).setMaintConf(new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build()).create(HiAnalyticsConstant.HA_SERVICE_TAG);
        f11832f = hiAnalyticsInstanceCreate;
        if (hiAnalyticsInstanceCreate != null) {
            hiAnalyticsInstanceCreate.setAppid("com.huawei.hwid");
        }
    }

    /* renamed from: f */
    public final void m8759f(String str) {
        HMSLog.m8727i("HMSBIInitializer", "Start to query GRS");
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setIssueCountry(str);
        new GrsClient(this.f11833a, grsBaseInfo).ayncGetGrsUrl("com.huawei.cloud.opensdkhianalytics", "ROOTV2", new C7357a());
    }

    public HiAnalyticsInstance getAnalyticsInstance() {
        return f11832f;
    }

    /* renamed from: h */
    public void m8760h() {
        if (this.f11834b.compareAndSet(false, true)) {
            String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(this.f11833a);
            if (!TextUtils.isEmpty(issueCountryCode)) {
                issueCountryCode = issueCountryCode.toUpperCase(Locale.ENGLISH);
            }
            if (!GrsBaseInfo.CountryCodeSource.UNKNOWN.equalsIgnoreCase(issueCountryCode) && !TextUtils.isEmpty(issueCountryCode)) {
                new AsyncTaskC7358b(this, null).execute(issueCountryCode);
            } else {
                HMSLog.m8725e("HMSBIInitializer", "Failed to get device issue country");
                this.f11834b.set(false);
            }
        }
    }

    public void initBI() {
        boolean zM23334b = !this.f11835c ? AbstractC10844a.m23334b() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
        HMSLog.m8727i("HMSBIInitializer", "Builder->biInitFlag :" + zM23334b);
        if (zM23334b || AnalyticsSwitchHolder.isAnalyticsDisabled(this.f11833a)) {
            return;
        }
        HMSLog.m8727i("HMSBIInitializer", "Builder->biInitFlag : start initHaSDK");
        m8760h();
    }

    public boolean isInit() {
        return !this.f11835c ? AbstractC10844a.m23334b() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }
}
