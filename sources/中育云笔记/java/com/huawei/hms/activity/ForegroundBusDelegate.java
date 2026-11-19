package com.huawei.hms.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.BusResponseResult;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IntentUtil;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes5.dex */
public class ForegroundBusDelegate implements IBridgeActivityDelegate {
    public static final String HMS_FOREGROUND_REQ_BODY = "HMS_FOREGROUND_REQ_BODY";
    public static final String HMS_FOREGROUND_REQ_HEADER = "HMS_FOREGROUND_REQ_HEADER";
    public static final String HMS_FOREGROUND_REQ_INNER = "HMS_FOREGROUND_REQ_INNER";
    public static final String HMS_FOREGROUND_RESP_HEADER = "HMS_FOREGROUND_RESP_HEADER";
    public static final String INNER_PKG_NAME = "INNER_PACKAGE_NAME";

    /* renamed from: c */
    public RequestHeader f11265c;

    /* renamed from: d */
    public String f11266d;

    /* renamed from: e */
    public ForegroundInnerHeader f11267e = new ForegroundInnerHeader();

    /* renamed from: f */
    public ResponseHeader f11268f;

    /* renamed from: g */
    public WeakReference f11269g;

    /* renamed from: h */
    public boolean f11270h;

    /* renamed from: com.huawei.hms.activity.ForegroundBusDelegate$b */
    public class C7222b implements AvailableAdapter.AvailableCallBack {
        public C7222b() {
        }

        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
        public void onComplete(int i10) {
            if (i10 == 0) {
                ForegroundBusDelegate.this.m8250o();
            } else {
                HMSLog.m8727i("ForegroundBusDelegate", "version check failed");
                ForegroundBusDelegate.this.m8241c(0, "apk version is invalid");
            }
        }
    }

    /* renamed from: d */
    public static void m8236d(Activity activity, AvailableAdapter availableAdapter, AvailableAdapter.AvailableCallBack availableCallBack) {
        if (activity == null) {
            HMSLog.m8727i("ForegroundBusDelegate", "null activity, could not start resolution intent");
        }
        availableAdapter.startResolution(activity, availableCallBack);
    }

    /* renamed from: a */
    public final void m8239a() {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f11265c);
        mapFromForegroundRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f11265c.getKitSdkVersion())));
        if (m8249n() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(m8249n().getApplicationContext(), HiAnalyticsConstant.HMS_SDK_BASE_ACTIVITY_STARTED, mapFromForegroundRequestHeader);
        }
    }

    /* renamed from: b */
    public final void m8240b(int i10, Intent intent) {
        HMSLog.m8727i("ForegroundBusDelegate", "succeedReturn");
        Activity activityM8249n = m8249n();
        if (activityM8249n == null) {
            return;
        }
        activityM8249n.setResult(i10, IntentUtil.modifyIntentBehaviorsSafe(intent));
        m8248m();
    }

    /* renamed from: c */
    public final void m8241c(int i10, String str) {
        BusResponseResult busResponseResultInnerError;
        HMSLog.m8725e("ForegroundBusDelegate", str);
        Activity activityM8249n = m8249n();
        if (activityM8249n == null) {
            return;
        }
        BusResponseCallback busResponseCallbackM8243h = m8243h(this.f11267e.getResponseCallbackKey());
        if (busResponseCallbackM8243h == null || (busResponseResultInnerError = busResponseCallbackM8243h.innerError((Activity) this.f11269g.get(), i10, str)) == null) {
            activityM8249n.setResult(0);
        } else {
            activityM8249n.setResult(busResponseResultInnerError.getCode(), IntentUtil.modifyIntentBehaviorsSafe(busResponseResultInnerError.getIntent()));
        }
        m8248m();
    }

    /* renamed from: g */
    public final void m8242g(String str) {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f11265c);
        mapFromForegroundRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f11265c.getKitSdkVersion())));
        ResponseHeader responseHeader = this.f11268f;
        if (responseHeader != null) {
            mapFromForegroundRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(responseHeader.getStatusCode()));
            mapFromForegroundRequestHeader.put("result", String.valueOf(this.f11268f.getErrorCode()));
        }
        if (m8249n() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(m8249n().getApplicationContext(), str, mapFromForegroundRequestHeader);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 431057;
    }

    /* renamed from: h */
    public final BusResponseCallback m8243h(String str) {
        return ForegroundBusResponseMgr.getInstance().get(str);
    }

    /* renamed from: i */
    public final void m8244i() {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f11265c);
        mapFromForegroundRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f11265c.getKitSdkVersion())));
        if (m8249n() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(m8249n().getApplicationContext(), HiAnalyticsConstant.HMS_SDK_BASE_START_CORE_ACTIVITY, mapFromForegroundRequestHeader);
        }
    }

    /* renamed from: j */
    public final void m8245j() {
        if (this.f11265c != null) {
            m8242g(HiAnalyticsConstant.HMS_SDK_BASE_ACTIVITY_STARTED);
        }
    }

    /* renamed from: k */
    public final void m8246k() {
        m8242g(HiAnalyticsConstant.HMS_SDK_BASE_START_CORE_ACTIVITY);
    }

    /* renamed from: l */
    public final void m8247l() {
        if (m8249n() == null) {
            HMSLog.m8725e("ForegroundBusDelegate", "checkMinVersion failed, activity must not be null.");
            m8241c(0, "checkMinVersion failed, activity must not be null.");
            return;
        }
        if (this.f11270h) {
            m8250o();
            return;
        }
        if (!Util.isAvailableLibExist(m8249n().getApplicationContext())) {
            if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(m8249n().getApplicationContext(), this.f11267e.getApkVersion()) == 0) {
                m8250o();
                return;
            } else {
                HMSLog.m8725e("ForegroundBusDelegate", "checkMinVersion failed, and no available lib exists.");
                m8241c(0, "apk version is invalid");
                return;
            }
        }
        C7222b c7222b = new C7222b();
        AvailableAdapter availableAdapter = new AvailableAdapter(this.f11267e.getApkVersion());
        int iIsHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(m8249n());
        if (iIsHuaweiMobileServicesAvailable == 0) {
            c7222b.onComplete(iIsHuaweiMobileServicesAvailable);
        } else if (availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable)) {
            m8236d(m8249n(), availableAdapter, c7222b);
        } else {
            c7222b.onComplete(iIsHuaweiMobileServicesAvailable);
        }
    }

    /* renamed from: m */
    public final void m8248m() {
        Activity activityM8249n = m8249n();
        if (activityM8249n == null || activityM8249n.isFinishing()) {
            return;
        }
        activityM8249n.finish();
    }

    /* renamed from: n */
    public final Activity m8249n() {
        WeakReference weakReference = this.f11269g;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    /* renamed from: o */
    public final void m8250o() {
        HMSLog.m8727i("ForegroundBusDelegate", "startApkHubActivity");
        Activity activityM8249n = m8249n();
        if (activityM8249n == null) {
            HMSLog.m8725e("ForegroundBusDelegate", "startApkHubActivity but activity is null");
            return;
        }
        String packageName = this.f11270h ? activityM8249n.getPackageName() : HMSPackageManager.getInstance(activityM8249n.getApplicationContext()).getHMSPackageNameForMultiService();
        if (TextUtils.isEmpty(packageName)) {
            HMSLog.m8725e("ForegroundBusDelegate", "hmsPackageName is null, Service is invalid.");
            m8241c(0, "hmsPackageName is null, Service is invalid.");
            return;
        }
        Intent intent = new Intent(this.f11267e.getAction());
        intent.putExtra(HMS_FOREGROUND_REQ_BODY, this.f11266d);
        try {
            intent.setPackage(packageName);
        } catch (IllegalArgumentException unused) {
            HMSLog.m8725e("ForegroundBusDelegate", "IllegalArgumentException when startApkHubActivity intent.setPackage");
        }
        intent.putExtra(BridgeActivity.EXTRA_IS_FULLSCREEN, UIUtil.isActivityFullscreen(activityM8249n));
        intent.setClassName(packageName, "com.huawei.hms.core.activity.UiJumpActivity");
        intent.putExtra(HMS_FOREGROUND_REQ_HEADER, this.f11265c.toJson());
        intent.putExtra("intent.extra.hms.core.DELEGATE_NAME", "com.huawei.hms.core.activity.ForegroundBus");
        try {
            m8244i();
            activityM8249n.startActivityForResult(intent, 431057);
        } catch (ActivityNotFoundException e10) {
            HMSLog.m8726e("ForegroundBusDelegate", "Launch sign in Intent failed. hms is probably being updated：", e10);
            m8241c(0, "launch bus intent failed");
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.m8725e("ForegroundBusDelegate", "activity is null");
            m8241c(0, "activity is null");
            return;
        }
        if (activity.isFinishing()) {
            HMSLog.m8725e("ForegroundBusDelegate", "activity is finishing");
            m8241c(0, "activity is finishing");
            return;
        }
        this.f11269g = new WeakReference(activity);
        try {
            Intent intent = activity.getIntent();
            if (intent == null) {
                m8241c(0, "intent is invalid");
                return;
            }
            String stringExtra = intent.getStringExtra(HMS_FOREGROUND_REQ_HEADER);
            RequestHeader requestHeader = new RequestHeader();
            this.f11265c = requestHeader;
            if (!requestHeader.fromJson(stringExtra)) {
                m8241c(0, "header is invalid");
                return;
            }
            this.f11266d = intent.getStringExtra(HMS_FOREGROUND_REQ_BODY);
            ForegroundInnerHeader foregroundInnerHeader = this.f11267e;
            if (foregroundInnerHeader == null) {
                m8241c(0, "inner header is invalid");
                return;
            }
            foregroundInnerHeader.fromJson(intent.getStringExtra(HMS_FOREGROUND_REQ_INNER));
            if (TextUtils.isEmpty(this.f11265c.getApiName())) {
                m8241c(0, "action is invalid");
                return;
            }
            m8239a();
            if (!TextUtils.isEmpty(intent.getStringExtra(INNER_PKG_NAME))) {
                HMSLog.m8727i("ForegroundBusDelegate", "isUseInnerHms: true");
                this.f11270h = true;
            }
            m8247l();
        } catch (Throwable th) {
            HMSLog.m8725e("ForegroundBusDelegate", "ForegroundBusDelegate getStringExtra error:" + th.getMessage());
            m8241c(0, "ForegroundBusDelegate getStringExtra error:" + th.getMessage());
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        m8245j();
        this.f11269g = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i10, int i11, Intent intent) throws IllegalArgumentException {
        String stringExtra;
        if (i10 != 431057) {
            return false;
        }
        if (intent != null && intent.hasExtra(HMS_FOREGROUND_RESP_HEADER)) {
            try {
                stringExtra = intent.getStringExtra(HMS_FOREGROUND_RESP_HEADER);
            } catch (Throwable unused) {
                HMSLog.m8728w("ForegroundBusDelegate", "exception occur, HMS_FOREGROUND_RESP_HEADER get failed.");
                stringExtra = "";
            }
            ResponseHeader responseHeader = new ResponseHeader();
            this.f11268f = responseHeader;
            JsonUtil.jsonToEntity(stringExtra, responseHeader);
        }
        m8246k();
        BusResponseCallback busResponseCallbackM8243h = m8243h(this.f11267e.getResponseCallbackKey());
        if (busResponseCallbackM8243h == null) {
            m8240b(i11, intent);
            return true;
        }
        BusResponseResult busResponseResultSucceedReturn = busResponseCallbackM8243h.succeedReturn((Activity) this.f11269g.get(), i11, intent);
        if (busResponseResultSucceedReturn == null) {
            m8240b(i11, intent);
            return true;
        }
        m8240b(busResponseResultSucceedReturn.getCode(), busResponseResultSucceedReturn.getIntent());
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i10, KeyEvent keyEvent) {
    }
}
