package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.utils.Util;

/* loaded from: classes5.dex */
public class ForegroundIntentBuilder {

    /* renamed from: a */
    public Activity f11272a;

    /* renamed from: b */
    public RequestHeader f11273b;

    /* renamed from: c */
    public String f11274c;

    /* renamed from: d */
    public ForegroundInnerHeader f11275d;

    /* renamed from: e */
    public String f11276e;

    /* renamed from: f */
    public Context f11277f;

    public ForegroundIntentBuilder(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("listener must not be null.");
        }
        this.f11272a = activity;
        RequestHeader requestHeader = new RequestHeader();
        this.f11273b = requestHeader;
        requestHeader.setSdkVersion(61300301);
        this.f11274c = "";
        ForegroundInnerHeader foregroundInnerHeader = new ForegroundInnerHeader();
        this.f11275d = foregroundInnerHeader;
        foregroundInnerHeader.setApkVersion(30000000);
    }

    public static void registerResponseCallback(String str, BusResponseCallback busResponseCallback) {
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
    }

    public static void unregisterResponseCallback(String str) {
        ForegroundBusResponseMgr.getInstance().unRegisterObserver(str);
    }

    public Intent build() {
        String packageName;
        String appId;
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(this.f11272a, ForegroundBusDelegate.class.getName());
        Context context = this.f11277f;
        if (context != null) {
            packageName = context.getPackageName();
            appId = Util.getAppId(this.f11277f);
        } else {
            packageName = this.f11272a.getPackageName();
            appId = Util.getAppId(this.f11272a);
        }
        if (this.f11273b.getAppID() == null) {
            this.f11273b.setAppID(appId + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        } else {
            this.f11273b.setAppID(appId + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f11273b.getAppID());
        }
        if (TextUtils.isEmpty(this.f11273b.getTransactionId())) {
            RequestHeader requestHeader = this.f11273b;
            requestHeader.setTransactionId(TransactionIdCreater.getId(requestHeader.getAppID(), CoreNaming.HUBREQUEST));
        }
        this.f11273b.setPkgName(packageName);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_HEADER, this.f11273b.toJson());
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_BODY, this.f11274c);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_INNER, this.f11275d.toJson());
        if (!TextUtils.isEmpty(this.f11276e)) {
            intentStartBridgeActivity.putExtra(ForegroundBusDelegate.INNER_PKG_NAME, this.f11276e);
        }
        return intentStartBridgeActivity;
    }

    public ForegroundIntentBuilder setAction(String str) {
        this.f11273b.setApiName(str);
        return this;
    }

    public ForegroundIntentBuilder setApiLevel(int i10) {
        this.f11273b.setApiLevel(i10);
        return this;
    }

    public ForegroundIntentBuilder setApplicationContext(Context context) {
        this.f11277f = context;
        return this;
    }

    public ForegroundIntentBuilder setInnerHms() {
        this.f11276e = this.f11272a.getPackageName();
        return this;
    }

    public ForegroundIntentBuilder setKitSdkVersion(int i10) {
        this.f11273b.setKitSdkVersion(i10);
        return this;
    }

    public ForegroundIntentBuilder setMinApkVersion(int i10) {
        this.f11275d.setApkVersion(i10);
        return this;
    }

    public ForegroundIntentBuilder setRequestBody(String str) {
        this.f11274c = str;
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str, BusResponseCallback busResponseCallback) {
        this.f11275d.setResponseCallbackKey(str);
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
        return this;
    }

    public ForegroundIntentBuilder setServiceName(String str) {
        this.f11273b.setSrvName(str);
        return this;
    }

    public ForegroundIntentBuilder setSubAppId(String str) {
        this.f11273b.setAppID(str);
        return this;
    }

    public ForegroundIntentBuilder setTransactionId(String str) {
        this.f11273b.setTransactionId(str);
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str) {
        this.f11275d.setResponseCallbackKey(str);
        return this;
    }
}
