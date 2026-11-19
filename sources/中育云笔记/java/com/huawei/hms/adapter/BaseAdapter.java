package com.huawei.hms.adapter;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.p069ui.BaseResolutionAdapter;
import com.huawei.hms.adapter.p069ui.UpdateAdapter;
import com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.availableupdate.UpdateAdapterMgr;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.ResponseWrap;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IntentUtil;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResolutionFlagUtil;
import com.huawei.hms.utils.Util;
import com.taobao.accs.common.Constants;
import java.lang.ref.WeakReference;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class BaseAdapter {

    /* renamed from: a */
    public WeakReference f11294a;

    /* renamed from: b */
    public WeakReference f11295b;

    /* renamed from: c */
    public BaseCallBack f11296c;

    /* renamed from: d */
    public String f11297d;

    /* renamed from: e */
    public String f11298e;

    /* renamed from: f */
    public Parcelable f11299f;

    /* renamed from: g */
    public BaseCallBack f11300g;

    /* renamed from: h */
    public String f11301h;

    /* renamed from: i */
    public Context f11302i;

    /* renamed from: j */
    public RequestHeader f11303j = new RequestHeader();

    /* renamed from: k */
    public ResponseHeader f11304k = new ResponseHeader();

    /* renamed from: l */
    public SystemObserver f11305l;

    public interface BaseCallBack {
        void onComplete(String str, String str2, Parcelable parcelable);

        void onError(String str);
    }

    public class BaseRequestResultCallback implements ResultCallback<ResolveResult<CoreBaseResponse>> {

        /* renamed from: a */
        public AtomicBoolean f11309a = new AtomicBoolean(true);

        public BaseRequestResultCallback() {
        }

        /* renamed from: a */
        public final void m8306a(final BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
            if (BaseAdapter.this.m8287U()) {
                HMSLog.m8727i("BaseAdapter", "HMS Core exists, need to refresh bind info");
                BaseAdapter.this.m8299m(baseCallBack);
                return;
            }
            if (!Util.isAvailableLibExist(BaseAdapter.this.f11302i)) {
                HMSLog.m8727i("BaseAdapter", "handleSolutionForHms: no Available lib exist");
                baseCallBack.onError(BaseAdapter.this.m8275A(-9));
                return;
            }
            Activity activityM8280H = BaseAdapter.this.m8280H();
            if (activityM8280H != null && !activityM8280H.isFinishing()) {
                HMSLog.m8727i("BaseAdapter", "start handleSolutionForHMS");
                AvailableAdapter availableAdapter = new AvailableAdapter(ExceptionCode.CRASH_EXCEPTION);
                availableAdapter.setCalledBySolutionInstallHms(true);
                availableAdapter.startResolution(activityM8280H, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.adapter.BaseAdapter.BaseRequestResultCallback.1
                    @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                    public void onComplete(int i10) {
                        HMSLog.m8727i("BaseAdapter", "complete handleSolutionForHMS, result: " + i10);
                        if (i10 == 0) {
                            BaseAdapter.this.m8299m(baseCallBack);
                            return;
                        }
                        BaseAdapter baseAdapter = BaseAdapter.this;
                        baseCallBack.onError(baseAdapter.m8291c(i10, baseAdapter.m8293f(i10)).toJson());
                    }
                });
                return;
            }
            HMSLog.m8725e("BaseAdapter", "activity is null");
            try {
                if (BaseAdapter.this.f11302i == null || !AvailableUtil.isInstallerLibExist(BaseAdapter.this.f11302i)) {
                    HMSLog.m8727i("BaseAdapter", "pass ACTIVITY_NULL error");
                    BaseAdapter baseAdapter = BaseAdapter.this;
                    baseCallBack.onError(baseAdapter.m8291c(-3, baseAdapter.m8293f(-3)).toJson());
                } else if (UpdateAdapterMgr.INST.needStartUpdateActivity()) {
                    HMSLog.m8727i("BaseAdapter", "pass installHMS intent");
                    Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(BaseAdapter.this.f11302i, UpdateAdapter.class.getName());
                    intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, ExceptionCode.CRASH_EXCEPTION);
                    intentStartBridgeActivity.putExtra("installHMS", "installHMS");
                    coreBaseResponse.setIntent(intentStartBridgeActivity);
                    BaseAdapter.this.m8300n(baseCallBack, coreBaseResponse);
                }
            } catch (RuntimeException unused) {
                HMSLog.m8725e("BaseAdapter", "handleSolutionForHms pass result failed");
            }
        }

        /* renamed from: b */
        public final void m8307b(String str, BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse, int i10) {
            if (!"intent".equals(str)) {
                if (!"installHMS".equals(str)) {
                    BaseAdapter.this.m8300n(baseCallBack, coreBaseResponse);
                    return;
                } else {
                    HMSLog.m8727i("BaseAdapter", "has resolutin: installHMS");
                    m8306a(baseCallBack, coreBaseResponse);
                    return;
                }
            }
            Activity activityM8280H = BaseAdapter.this.m8280H();
            HMSLog.m8727i("BaseAdapter", "activity is: " + activityM8280H);
            if (activityM8280H == null || activityM8280H.isFinishing()) {
                HMSLog.m8725e("BaseAdapter", "activity null");
                BaseAdapter.this.m8300n(baseCallBack, coreBaseResponse);
                return;
            }
            PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
            if (pendingIntent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.f11302i)) {
                    BaseAdapter.this.m8294h(activityM8280H, pendingIntent, coreBaseResponse);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.m8275A(-9));
                    return;
                }
            }
            Intent intent = coreBaseResponse.getIntent();
            if (intent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.f11302i)) {
                    BaseAdapter.this.m8294h(activityM8280H, intent, coreBaseResponse);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.m8275A(-9));
                    return;
                }
            }
            if (i10 == 2) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseCallBack.onError(baseAdapter.m8275A(baseAdapter.f11304k.getErrorCode()));
            } else {
                HMSLog.m8725e("BaseAdapter", "hasResolution is true but NO_SOLUTION");
                baseCallBack.onError(BaseAdapter.this.m8275A(-4));
            }
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        public void onResult(ResolveResult<CoreBaseResponse> resolveResult) throws IllegalArgumentException {
            HMSLog.m8727i("BaseAdapter", "BaseRequestResultCallback onResult");
            BaseCallBack baseCallBackM8305y = BaseAdapter.this.m8305y();
            if (baseCallBackM8305y == null) {
                HMSLog.m8725e("BaseAdapter", "onResult baseCallBack null");
                return;
            }
            if (resolveResult == null) {
                HMSLog.m8725e("BaseAdapter", "result null");
                baseCallBackM8305y.onError(BaseAdapter.this.m8275A(-1));
                return;
            }
            CoreBaseResponse value = resolveResult.getValue();
            if (value == null) {
                HMSLog.m8725e("BaseAdapter", "response null");
                baseCallBackM8305y.onError(BaseAdapter.this.m8275A(-1));
                return;
            }
            if (TextUtils.isEmpty(value.getJsonHeader())) {
                HMSLog.m8725e("BaseAdapter", "jsonHeader null");
                baseCallBackM8305y.onError(BaseAdapter.this.m8275A(-1));
                return;
            }
            JsonUtil.jsonToEntity(value.getJsonHeader(), BaseAdapter.this.f11304k);
            if (this.f11309a.compareAndSet(true, false)) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseAdapter.m8296j(baseAdapter.f11302i, BaseAdapter.this.f11304k);
            }
            String resolution = BaseAdapter.this.f11304k.getResolution();
            int statusCode = BaseAdapter.this.f11304k.getStatusCode();
            HMSLog.m8727i("BaseAdapter", "api is: " + BaseAdapter.this.f11304k.getApiName() + ", resolution: " + resolution + ", status_code: " + statusCode);
            m8307b(resolution, baseCallBackM8305y, value, statusCode);
        }
    }

    /* renamed from: com.huawei.hms.adapter.BaseAdapter$a */
    public static class C7228a extends PendingResultImpl<ResolveResult<CoreBaseResponse>, CoreBaseResponse> {
        public C7228a(ApiClient apiClient, String str, InterfaceC7278e interfaceC7278e) {
            super(apiClient, str, interfaceC7278e);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResolveResult<CoreBaseResponse> onComplete(CoreBaseResponse coreBaseResponse) {
            ResolveResult<CoreBaseResponse> resolveResult = new ResolveResult<>(coreBaseResponse);
            resolveResult.setStatus(Status.SUCCESS);
            return resolveResult;
        }
    }

    public BaseAdapter(ApiClient apiClient) {
        this.f11294a = new WeakReference(apiClient);
        if (apiClient == null) {
            HMSLog.m8728w("BaseAdapter", "BaseAdapter constructor client is null");
            return;
        }
        this.f11302i = apiClient.getContext().getApplicationContext();
        HMSLog.m8727i("BaseAdapter", "In constructor, WeakReference is " + this.f11294a);
    }

    /* renamed from: A */
    public final String m8275A(int i10) {
        m8281J(i10);
        return this.f11304k.toJson();
    }

    /* renamed from: C */
    public final void m8276C(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    /* renamed from: D */
    public final void m8277D(BaseCallBack baseCallBack) {
        this.f11300g = baseCallBack;
    }

    /* renamed from: E */
    public final void m8278E(String str) {
        this.f11298e = str;
    }

    /* renamed from: F */
    public final boolean m8279F(Intent intent, BaseCallBack baseCallBack) throws IllegalArgumentException {
        if (!intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT)) {
            return false;
        }
        int intExtra = intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0);
        HMSLog.m8727i("BaseAdapter", "kit_update_result is " + intExtra);
        if (intExtra == 1) {
            HMSLog.m8725e("BaseAdapter", "kit update success,replay request");
            m8288V();
        } else {
            HMSLog.m8725e("BaseAdapter", "kit update failed");
            baseCallBack.onError(m8291c(-10, m8293f(intExtra)).toJson());
        }
        return true;
    }

    /* renamed from: H */
    public final Activity m8280H() {
        if (this.f11295b == null) {
            HMSLog.m8727i("BaseAdapter", "activityWeakReference is " + this.f11295b);
            return null;
        }
        ApiClient apiClient = (ApiClient) this.f11294a.get();
        if (apiClient == null) {
            HMSLog.m8727i("BaseAdapter", "tmpApi is null");
            return null;
        }
        HMSLog.m8727i("BaseAdapter", "activityWeakReference has " + this.f11295b.get());
        return Util.getActiveActivity((Activity) this.f11295b.get(), apiClient.getContext());
    }

    /* renamed from: J */
    public final void m8281J(int i10) {
        this.f11304k.setTransactionId(this.f11303j.getTransactionId());
        this.f11304k.setAppID(this.f11303j.getAppID());
        this.f11304k.setApiName(this.f11303j.getApiName());
        this.f11304k.setSrvName(this.f11303j.getSrvName());
        this.f11304k.setPkgName(this.f11303j.getPkgName());
        this.f11304k.setStatusCode(1);
        this.f11304k.setErrorCode(i10);
        this.f11304k.setErrorReason("Core error");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8282K(android.content.Intent r7, com.huawei.hms.adapter.BaseAdapter.BaseCallBack r8) throws org.json.JSONException {
        /*
            r6 = this;
            java.lang.String r0 = "json_header"
            java.lang.String r0 = r7.getStringExtra(r0)
            java.lang.String r1 = "json_body"
            java.lang.String r1 = r7.getStringExtra(r1)
            java.lang.String r2 = "status_code"
            java.lang.Object r2 = com.huawei.hms.utils.JsonUtil.getInfoFromJsonobject(r0, r2)
            java.lang.String r3 = "error_code"
            java.lang.Object r3 = com.huawei.hms.utils.JsonUtil.getInfoFromJsonobject(r0, r3)
            java.lang.String r4 = "HMS_FOREGROUND_RES_UI"
            boolean r5 = r7.hasExtra(r4)
            if (r5 == 0) goto L35
            java.lang.String r7 = r7.getStringExtra(r4)
            java.lang.String r4 = "uiDuration"
            java.lang.Object r7 = com.huawei.hms.utils.JsonUtil.getInfoFromJsonobject(r7, r4)
            boolean r4 = r7 instanceof java.lang.Long
            if (r4 == 0) goto L35
            java.lang.Long r7 = (java.lang.Long) r7
            long r4 = r7.longValue()
            goto L37
        L35:
            r4 = 0
        L37:
            boolean r7 = r2 instanceof java.lang.Integer
            if (r7 == 0) goto L5b
            boolean r7 = r3 instanceof java.lang.Integer
            if (r7 == 0) goto L5b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r7 = r2.intValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r6.m8275A(r2)
            com.huawei.hms.common.internal.ResponseHeader r2 = r6.f11304k
            r2.setStatusCode(r7)
            android.content.Context r7 = r6.f11302i
            com.huawei.hms.common.internal.ResponseHeader r2 = r6.f11304k
            r6.m8297k(r7, r2, r4)
            goto L66
        L5b:
            r7 = -8
            r6.m8275A(r7)
            android.content.Context r7 = r6.f11302i
            com.huawei.hms.common.internal.ResponseHeader r2 = r6.f11304k
            r6.m8297k(r7, r2, r4)
        L66:
            r7 = 0
            r8.onComplete(r0, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.adapter.BaseAdapter.m8282K(android.content.Intent, com.huawei.hms.adapter.BaseAdapter$BaseCallBack):void");
    }

    /* renamed from: N */
    public final String m8283N() {
        return this.f11297d;
    }

    /* renamed from: P */
    public final String m8284P() {
        return this.f11298e;
    }

    /* renamed from: R */
    public final Parcelable m8285R() {
        return this.f11299f;
    }

    /* renamed from: S */
    public final void m8286S() {
        this.f11305l = new SystemObserver() { // from class: com.huawei.hms.adapter.BaseAdapter.2
            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onNoticeResult(int i10) {
                return false;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onSolutionResult(Intent intent, String str) throws JSONException {
                if (TextUtils.isEmpty(str)) {
                    HMSLog.m8725e("BaseAdapter", "onSolutionResult but id is null");
                    BaseCallBack baseCallBackM8305y = BaseAdapter.this.m8305y();
                    if (baseCallBackM8305y == null) {
                        HMSLog.m8725e("BaseAdapter", "onSolutionResult baseCallBack null");
                        return true;
                    }
                    baseCallBackM8305y.onError(BaseAdapter.this.m8275A(-6));
                    return true;
                }
                if (!str.equals(BaseAdapter.this.f11301h)) {
                    return false;
                }
                HMSLog.m8727i("BaseAdapter", "onSolutionResult + id is :" + str);
                BaseCallBack baseCallBackM8305y2 = BaseAdapter.this.m8305y();
                if (baseCallBackM8305y2 == null) {
                    HMSLog.m8725e("BaseAdapter", "onResult baseCallBack null");
                    return true;
                }
                if (intent == null) {
                    HMSLog.m8725e("BaseAdapter", "onSolutionResult but data is null");
                    String strM8275A = BaseAdapter.this.m8275A(-7);
                    BaseAdapter baseAdapter = BaseAdapter.this;
                    baseAdapter.m8297k(baseAdapter.f11302i, BaseAdapter.this.f11304k, 0L);
                    baseCallBackM8305y2.onError(strM8275A);
                    return true;
                }
                if (BaseAdapter.this.m8279F(intent, baseCallBackM8305y2) || BaseAdapter.this.m8304w(intent, baseCallBackM8305y2)) {
                    return true;
                }
                HMSLog.m8725e("BaseAdapter", "onComplete for on activity result");
                BaseAdapter.this.m8282K(intent, baseCallBackM8305y2);
                return true;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onUpdateResult(int i10) {
                return false;
            }
        };
    }

    /* renamed from: U */
    public final boolean m8287U() {
        return new PackageManagerHelper(this.f11302i).getPackageStates(HMSPackageManager.getInstance(this.f11302i).getHMSPackageName()) == PackageManagerHelper.PackageStates.ENABLED;
    }

    /* renamed from: V */
    public final void m8288V() throws IllegalArgumentException {
        if (this.f11297d == null || this.f11300g == null) {
            return;
        }
        this.f11304k = null;
        this.f11304k = new ResponseHeader();
        baseRequest(m8283N(), m8284P(), m8285R(), m8290a());
    }

    /* renamed from: W */
    public final void m8289W() {
        if (this.f11302i == null) {
            HMSLog.m8725e("BaseAdapter", "sendBroadcastAfterResolutionHms, context is null");
            return;
        }
        Intent intent = new Intent("com.huawei.hms.core.action.SESSION_INVALID");
        try {
            intent.setPackage(this.f11302i.getPackageName());
            this.f11302i.sendBroadcast(intent);
        } catch (IllegalArgumentException unused) {
            HMSLog.m8725e("BaseAdapter", "IllegalArgumentException when sendBroadcastAfterResolutionHms intent.setPackage");
        }
    }

    /* renamed from: a */
    public final BaseCallBack m8290a() {
        return this.f11300g;
    }

    public void baseRequest(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) throws IllegalArgumentException {
        m8303v(str, str2, parcelable, baseCallBack);
        if (this.f11294a == null) {
            HMSLog.m8725e("BaseAdapter", "client is null");
            baseCallBack.onError(m8275A(-2));
            return;
        }
        this.f11296c = baseCallBack;
        JsonUtil.jsonToEntity(str, this.f11303j);
        CoreBaseRequest coreBaseRequest = new CoreBaseRequest();
        coreBaseRequest.setJsonObject(str2);
        coreBaseRequest.setJsonHeader(str);
        coreBaseRequest.setParcelable(parcelable);
        String apiName = this.f11303j.getApiName();
        if (TextUtils.isEmpty(apiName)) {
            HMSLog.m8725e("BaseAdapter", "get uri null");
            baseCallBack.onError(m8275A(-5));
            return;
        }
        String transactionId = this.f11303j.getTransactionId();
        this.f11301h = transactionId;
        if (TextUtils.isEmpty(transactionId)) {
            HMSLog.m8725e("BaseAdapter", "get transactionId null");
            baseCallBack.onError(m8275A(-6));
            return;
        }
        HMSLog.m8727i("BaseAdapter", "in baseRequest + uri is :" + apiName + ", transactionId is : " + this.f11301h);
        m8295i(this.f11302i, this.f11303j);
        m8292e((ApiClient) this.f11294a.get(), apiName, coreBaseRequest).setResultCallback(new BaseRequestResultCallback());
    }

    /* renamed from: c */
    public final ResponseWrap m8291c(int i10, String str) {
        m8281J(i10);
        ResponseWrap responseWrap = new ResponseWrap(this.f11304k);
        responseWrap.setBody(str);
        return responseWrap;
    }

    /* renamed from: e */
    public final PendingResult m8292e(ApiClient apiClient, String str, CoreBaseRequest coreBaseRequest) {
        return new C7228a(apiClient, str, coreBaseRequest);
    }

    /* renamed from: f */
    public final String m8293f(int i10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_ERROR_CODE, i10);
        } catch (JSONException e10) {
            HMSLog.m8725e("BaseAdapter", "buildBodyStr failed: " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    /* renamed from: h */
    public final void m8294h(Activity activity, Parcelable parcelable, CoreBaseResponse coreBaseResponse) {
        HMSLog.m8727i("BaseAdapter", "startResolution");
        RequestHeader requestHeader = this.f11303j;
        if (requestHeader != null) {
            m8276C(this.f11302i, requestHeader);
        }
        if (this.f11305l == null) {
            m8286S();
        }
        SystemManager.getSystemNotifier().registerObserver(this.f11305l);
        if (Build.VERSION.SDK_INT >= 29) {
            m8301t(coreBaseResponse);
        }
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, BaseResolutionAdapter.class.getName());
        Bundle bundle = new Bundle();
        bundle.putParcelable(CommonCode.MapKey.HAS_RESOLUTION, parcelable);
        intentStartBridgeActivity.putExtras(bundle);
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.TRANSACTION_ID, this.f11301h);
        long time = new Timestamp(System.currentTimeMillis()).getTime();
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.RESOLUTION_FLAG, time);
        ResolutionFlagUtil.getInstance().saveResolutionFlag(this.f11301h, time);
        activity.startActivity(intentStartBridgeActivity);
    }

    /* renamed from: i */
    public final void m8295i(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* renamed from: j */
    public final void m8296j(Context context, ResponseHeader responseHeader) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f11303j.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* renamed from: k */
    public final void m8297k(Context context, ResponseHeader responseHeader, long j10) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(j10));
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f11303j.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    /* renamed from: l */
    public final void m8298l(Parcelable parcelable) {
        this.f11299f = parcelable;
    }

    /* renamed from: m */
    public final void m8299m(BaseCallBack baseCallBack) {
        HMSPackageManager.getInstance(this.f11302i).resetMultiServiceState();
        baseCallBack.onError(m8291c(11, m8293f(11)).toJson());
        m8289W();
    }

    /* renamed from: n */
    public final void m8300n(BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
        HMSLog.m8727i("BaseAdapter", "baseCallBack.onComplete");
        PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
        if (pendingIntent != null) {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), pendingIntent);
            return;
        }
        Intent intentModifyIntentBehaviorsSafe = IntentUtil.modifyIntentBehaviorsSafe(coreBaseResponse.getIntent());
        if (intentModifyIntentBehaviorsSafe != null) {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), intentModifyIntentBehaviorsSafe);
        } else {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), null);
        }
    }

    /* renamed from: t */
    public final void m8301t(final CoreBaseResponse coreBaseResponse) {
        HMSLog.m8727i("BaseAdapter", "postResolutionTimeoutHandle");
        ApkResolutionFailedManager.getInstance().postTask(this.f11301h, new Runnable() { // from class: com.huawei.hms.adapter.BaseAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                HMSLog.m8727i("BaseAdapter", "postResolutionTimeoutHandle handle");
                SystemManager.getSystemNotifier().unRegisterObserver(BaseAdapter.this.f11305l);
                ApkResolutionFailedManager.getInstance().removeValueOnly(BaseAdapter.this.f11301h);
                BaseCallBack baseCallBackM8305y = BaseAdapter.this.m8305y();
                if (baseCallBackM8305y == null) {
                    HMSLog.m8725e("BaseAdapter", "timeoutRunnable callBack is null");
                } else {
                    BaseAdapter.this.m8300n(baseCallBackM8305y, coreBaseResponse);
                }
            }
        });
    }

    /* renamed from: u */
    public final void m8302u(String str) {
        this.f11297d = str;
    }

    /* renamed from: v */
    public final void m8303v(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        m8302u(str);
        m8278E(str2);
        m8298l(parcelable);
        m8277D(baseCallBack);
    }

    /* renamed from: w */
    public final boolean m8304w(Intent intent, BaseCallBack baseCallBack) throws IllegalArgumentException {
        if (!intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            return false;
        }
        int intExtra = intent.getIntExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, 1001);
        if (intExtra != 1001) {
            HMSLog.m8727i("BaseAdapter", "privacy_statement_confirm_result rejected: " + intExtra);
            baseCallBack.onError(m8291c(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE, m8293f(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE)).toJson());
            return true;
        }
        HMSLog.m8727i("BaseAdapter", "privacy_statement_confirm_result agreed: " + intExtra + ", replay request");
        m8288V();
        return true;
    }

    /* renamed from: y */
    public final BaseCallBack m8305y() {
        BaseCallBack baseCallBack = this.f11296c;
        if (baseCallBack != null) {
            return baseCallBack;
        }
        HMSLog.m8725e("BaseAdapter", "callback null");
        return null;
    }

    public BaseAdapter(ApiClient apiClient, Activity activity) {
        this.f11294a = new WeakReference(apiClient);
        this.f11295b = new WeakReference(activity);
        if (activity == null) {
            HMSLog.m8728w("BaseAdapter", "BaseAdapter constructor activity is null");
            return;
        }
        this.f11302i = activity.getApplicationContext();
        HMSLog.m8727i("BaseAdapter", "In constructor, activityWeakReference is " + this.f11295b + ", activity is " + this.f11295b.get());
    }
}
