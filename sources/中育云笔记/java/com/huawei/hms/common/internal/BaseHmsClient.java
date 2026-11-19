package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.adapter.InnerBinderAdapter;
import com.huawei.hms.adapter.OuterBinderAdapter;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.IPCTransport;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.core.aidl.InterfaceC7277d;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.Util;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public abstract class BaseHmsClient implements AidlApiClient {

    /* renamed from: l */
    public static final Object f11511l = new Object();

    /* renamed from: m */
    public static final AtomicInteger f11512m = new AtomicInteger(1);

    /* renamed from: n */
    public static final AtomicInteger f11513n = new AtomicInteger(1);

    /* renamed from: o */
    public static BinderAdapter f11514o;

    /* renamed from: p */
    public static BinderAdapter f11515p;

    /* renamed from: c */
    public final Context f11516c;

    /* renamed from: d */
    public String f11517d;

    /* renamed from: e */
    public final ClientSettings f11518e;

    /* renamed from: f */
    public volatile InterfaceC7277d f11519f;

    /* renamed from: g */
    public String f11520g;

    /* renamed from: h */
    public final ConnectionCallbacks f11521h;

    /* renamed from: i */
    public final OnConnectionFailedListener f11522i;

    /* renamed from: j */
    public Handler f11523j = null;

    /* renamed from: k */
    public HuaweiApi.RequestHandler f11524k;

    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i10);
    }

    public static final class ConnectionResultWrapper {

        /* renamed from: a */
        public HuaweiApi.RequestHandler f11529a;

        /* renamed from: b */
        public ConnectionResult f11530b;

        public ConnectionResultWrapper(HuaweiApi.RequestHandler requestHandler, ConnectionResult connectionResult) {
            this.f11529a = requestHandler;
            this.f11530b = connectionResult;
        }

        public ConnectionResult getConnectionResult() {
            return this.f11530b;
        }

        public HuaweiApi.RequestHandler getRequest() {
            return this.f11529a;
        }
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public BaseHmsClient(Context context, ClientSettings clientSettings, OnConnectionFailedListener onConnectionFailedListener, ConnectionCallbacks connectionCallbacks) {
        this.f11516c = context;
        this.f11518e = clientSettings;
        if (clientSettings != null) {
            this.f11517d = clientSettings.getAppID();
        }
        this.f11522i = onConnectionFailedListener;
        this.f11521h = connectionCallbacks;
    }

    /* renamed from: c */
    public void m8464c() {
        String innerHmsPkg = this.f11518e.getInnerHmsPkg();
        String serviceAction = getServiceAction();
        HMSLog.m8727i("BaseHmsClient", "enter bindCoreService, packageName is " + innerHmsPkg + ", serviceAction is " + serviceAction);
        m8469j(innerHmsPkg, serviceAction);
    }

    public void connect(int i10) {
        m8466e(i10, false);
    }

    public void connectedInternal(IBinder iBinder) {
        this.f11519f = InterfaceC7277d.a.m8519l(iBinder);
        if (this.f11519f != null) {
            onConnecting();
        } else {
            HMSLog.m8725e("BaseHmsClient", "mService is null, try to unBind.");
            m8476s();
        }
    }

    /* renamed from: d */
    public final void m8465d(int i10) {
        HMSLog.m8727i("BaseHmsClient", "notifyFailed result: " + i10);
        Message message = new Message();
        message.what = RequestManager.NOTIFY_CONNECT_FAILED;
        message.obj = new ConnectionResultWrapper(this.f11524k, new ConnectionResult(i10));
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f11522i;
        if (onConnectionFailedListener == null || (onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        onConnectionFailedListener.onConnectionFailed(new ConnectionResult(i10));
    }

    public void disconnect() {
        int i10 = (this.f11518e.isUseInnerHms() ? f11513n : f11512m).get();
        HMSLog.m8727i("BaseHmsClient", "Enter disconnect, Connection Status: " + i10);
        if (i10 == 3) {
            m8477t();
            m8471m(1);
        } else {
            if (i10 != 5) {
                return;
            }
            m8470l();
            m8471m(1);
        }
    }

    /* renamed from: e */
    public final void m8466e(int i10, boolean z10) {
        HMSLog.m8727i("BaseHmsClient", "====== HMSSDK version: 61300301 ======");
        int i11 = (this.f11518e.isUseInnerHms() ? f11513n : f11512m).get();
        HMSLog.m8727i("BaseHmsClient", "Enter connect, Connection Status: " + i11);
        if (z10 || !(i11 == 3 || i11 == 5)) {
            if (getMinApkVersion() > i10) {
                i10 = getMinApkVersion();
            }
            HMSLog.m8727i("BaseHmsClient", "connect minVersion:" + i10 + " packageName:" + this.f11518e.getInnerHmsPkg());
            if (this.f11516c.getPackageName().equals(this.f11518e.getInnerHmsPkg())) {
                HMSLog.m8727i("BaseHmsClient", "service packageName is same, bind core service return");
                m8464c();
                return;
            }
            if (!Util.isAvailableLibExist(this.f11516c)) {
                int iIsHuaweiMobileServicesAvailable = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.f11516c, i10);
                HMSLog.m8727i("BaseHmsClient", "HuaweiApiAvailability check available result: " + iIsHuaweiMobileServicesAvailable);
                if (iIsHuaweiMobileServicesAvailable == 0) {
                    m8464c();
                    return;
                } else {
                    m8465d(iIsHuaweiMobileServicesAvailable);
                    return;
                }
            }
            AvailableAdapter availableAdapter = new AvailableAdapter(i10);
            int iIsHuaweiMobileServicesAvailable2 = availableAdapter.isHuaweiMobileServicesAvailable(this.f11516c);
            HMSLog.m8727i("BaseHmsClient", "check available result: " + iIsHuaweiMobileServicesAvailable2);
            if (iIsHuaweiMobileServicesAvailable2 == 0) {
                m8464c();
                return;
            }
            if (availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable2)) {
                HMSLog.m8727i("BaseHmsClient", "bindCoreService3.0 fail, start resolution now.");
                m8472n(availableAdapter, iIsHuaweiMobileServicesAvailable2);
            } else {
                if (availableAdapter.isUserNoticeError(iIsHuaweiMobileServicesAvailable2)) {
                    HMSLog.m8727i("BaseHmsClient", "bindCoreService3.0 fail, start notice now.");
                    m8467f(availableAdapter, iIsHuaweiMobileServicesAvailable2);
                    return;
                }
                HMSLog.m8727i("BaseHmsClient", "bindCoreService3.0 fail: " + iIsHuaweiMobileServicesAvailable2 + " is not resolvable.");
                m8465d(iIsHuaweiMobileServicesAvailable2);
            }
        }
    }

    /* renamed from: f */
    public final void m8467f(AvailableAdapter availableAdapter, int i10) {
        HMSLog.m8727i("BaseHmsClient", "enter notice");
        if (!m8478u().isHasActivity()) {
            if (i10 == 29) {
                i10 = 9;
            }
            m8468g(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.f11516c, i10, 0)));
        } else {
            Activity activeActivity = Util.getActiveActivity(m8478u().getCpActivity(), getContext());
            if (activeActivity != null) {
                availableAdapter.startNotice(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.2
                    @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                    public void onComplete(int i11) {
                        BaseHmsClient.this.m8465d(i11);
                    }
                });
            } else {
                m8465d(26);
            }
        }
    }

    /* renamed from: g */
    public final void m8468g(ConnectionResult connectionResult) {
        HMSLog.m8727i("BaseHmsClient", "notifyFailed result: " + connectionResult.getErrorCode());
        Message message = new Message();
        message.what = RequestManager.NOTIFY_CONNECT_FAILED;
        HuaweiApi.RequestHandler requestHandler = this.f11524k;
        this.f11524k = null;
        message.obj = new ConnectionResultWrapper(requestHandler, connectionResult);
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f11522i;
        if (onConnectionFailedListener == null || (onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        onConnectionFailedListener.onConnectionFailed(connectionResult);
    }

    public BinderAdapter getAdapter() {
        HMSLog.m8727i("BaseHmsClient", "getAdapter:isInner:" + this.f11518e.isUseInnerHms() + ", mInnerBinderAdapter:" + f11515p + ", mOuterBinderAdapter:" + f11514o);
        return this.f11518e.isUseInnerHms() ? f11515p : f11514o;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        return this.f11518e.getApiName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f11517d;
    }

    public int getConnectionStatus() {
        return (this.f11518e.isUseInnerHms() ? f11513n : f11512m).get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f11516c;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f11518e.getCpID();
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f11518e.getClientPackageName();
    }

    public int getRequestHmsVersionCode() {
        return getMinApkVersion();
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public InterfaceC7277d getService() {
        return this.f11519f;
    }

    public String getServiceAction() {
        HMSPackageManager hMSPackageManager = HMSPackageManager.getInstance(this.f11516c);
        return this.f11518e.isUseInnerHms() ? hMSPackageManager.getInnerServiceAction() : hMSPackageManager.getServiceAction();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.f11520g;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public SubAppInfo getSubAppInfo() {
        return this.f11518e.getSubAppID();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        return this.f11518e.isUseInnerHms() ? f11513n.get() == 3 : f11512m.get() == 3;
    }

    public boolean isConnecting() {
        return (this.f11518e.isUseInnerHms() ? f11513n : f11512m).get() == 5;
    }

    /* renamed from: j */
    public final void m8469j(String str, String str2) {
        if (this.f11518e.isUseInnerHms()) {
            f11515p = InnerBinderAdapter.getInstance(this.f11516c, str2, str);
            if (!isConnected()) {
                m8471m(5);
                f11515p.binder(m8475r());
                return;
            } else {
                HMSLog.m8727i("BaseHmsClient", "The binder is already connected.");
                getAdapter().updateDelayTask();
                connectedInternal(getAdapter().getServiceBinder());
                return;
            }
        }
        f11514o = OuterBinderAdapter.getInstance(this.f11516c, str2, str);
        if (!isConnected()) {
            m8471m(5);
            f11514o.binder(m8475r());
        } else {
            HMSLog.m8727i("BaseHmsClient", "The binder is already connected.");
            getAdapter().updateDelayTask();
            connectedInternal(getAdapter().getServiceBinder());
        }
    }

    /* renamed from: l */
    public final void m8470l() {
        synchronized (f11511l) {
            try {
                Handler handler = this.f11523j;
                if (handler != null) {
                    handler.removeMessages(2);
                    this.f11523j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: m */
    public void m8471m(int i10) {
        if (this.f11518e.isUseInnerHms()) {
            f11513n.set(i10);
        } else {
            f11512m.set(i10);
        }
    }

    /* renamed from: n */
    public final void m8472n(AvailableAdapter availableAdapter, int i10) {
        HMSLog.m8727i("BaseHmsClient", "enter HmsCore resolution");
        if (!m8478u().isHasActivity()) {
            m8468g(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.f11516c, i10, 0)));
            return;
        }
        Activity activeActivity = Util.getActiveActivity(m8478u().getCpActivity(), getContext());
        if (activeActivity != null) {
            availableAdapter.startResolution(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.3
                @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                public void onComplete(int i11) {
                    if (i11 == 0 && BaseHmsClient.this.m8473o()) {
                        BaseHmsClient.this.m8464c();
                    } else {
                        BaseHmsClient.this.m8465d(i11);
                    }
                }
            });
        } else {
            m8465d(26);
        }
    }

    /* renamed from: o */
    public final boolean m8473o() {
        return HMSPackageManager.getInstance(this.f11516c).getHMSPackageStatesForMultiService() == PackageManagerHelper.PackageStates.ENABLED;
    }

    public void onConnecting() {
        m8474q();
    }

    /* renamed from: q */
    public final void m8474q() {
        m8471m(3);
        RequestManager.getHandler().sendEmptyMessage(RequestManager.NOTIFY_CONNECT_SUCCESS);
        ConnectionCallbacks connectionCallbacks = this.f11521h;
        if (connectionCallbacks == null || (connectionCallbacks instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        connectionCallbacks.onConnected();
    }

    /* renamed from: r */
    public final BinderAdapter.BinderCallBack m8475r() {
        return new BinderAdapter.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1
            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i10) {
                onBinderFailed(i10, null);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onNullBinding(ComponentName componentName) {
                BaseHmsClient.this.m8471m(1);
                BaseHmsClient.this.m8465d(10);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                HMSLog.m8727i("BaseHmsClient", "Enter onServiceConnected.");
                BaseHmsClient.this.connectedInternal(iBinder);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceDisconnected(ComponentName componentName) {
                HMSLog.m8727i("BaseHmsClient", "Enter onServiceDisconnected.");
                BaseHmsClient.this.m8471m(1);
                RequestManager.getHandler().sendEmptyMessage(RequestManager.NOTIFY_CONNECT_SUSPENDED);
                if (BaseHmsClient.this.f11521h == null || (BaseHmsClient.this.f11521h instanceof HuaweiApi.RequestHandler)) {
                    return;
                }
                BaseHmsClient.this.f11521h.onConnectionSuspended(1);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onTimedDisconnected() {
                BaseHmsClient.this.m8471m(6);
                if (BaseHmsClient.this.f11521h == null || (BaseHmsClient.this.f11521h instanceof HuaweiApi.RequestHandler)) {
                    return;
                }
                BaseHmsClient.this.f11521h.onConnectionSuspended(1);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i10, Intent intent) {
                if (intent == null) {
                    HMSLog.m8727i("BaseHmsClient", "onBinderFailed: intent is null!");
                    BaseHmsClient.this.m8468g(new ConnectionResult(10, (PendingIntent) null));
                    BaseHmsClient.this.f11519f = null;
                    return;
                }
                Activity activeActivity = Util.getActiveActivity(BaseHmsClient.this.m8478u().getCpActivity(), BaseHmsClient.this.getContext());
                if (activeActivity == null) {
                    HMSLog.m8727i("BaseHmsClient", "onBinderFailed: return pendingIntent to kit and cp");
                    BaseHmsClient.this.m8468g(new ConnectionResult(10, PendingIntent.getActivity(BaseHmsClient.this.f11516c, 11, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL)));
                    BaseHmsClient.this.f11519f = null;
                    return;
                }
                HMSLog.m8727i("BaseHmsClient", "onBinderFailed: SDK try to resolve and reConnect!");
                long time = new Timestamp(System.currentTimeMillis()).getTime();
                FailedBinderCallBack.getInstance().setCallBack(Long.valueOf(time), new FailedBinderCallBack.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1.1
                    @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
                    public void binderCallBack(int i11) {
                        if (i11 != 0) {
                            BaseHmsClient.this.m8468g(new ConnectionResult(10, (PendingIntent) null));
                            BaseHmsClient.this.f11519f = null;
                        }
                    }
                });
                intent.putExtra(FailedBinderCallBack.CALLER_ID, time);
                activeActivity.startActivity(intent);
            }
        };
    }

    /* renamed from: s */
    public final void m8476s() {
        HMSLog.m8728w("BaseHmsClient", "Failed to get service as interface, trying to unbind.");
        if (this.f11518e.isUseInnerHms()) {
            BinderAdapter binderAdapter = f11515p;
            if (binderAdapter == null) {
                HMSLog.m8728w("BaseHmsClient", "mInnerBinderAdapter is null.");
                return;
            }
            binderAdapter.unBind();
        } else {
            BinderAdapter binderAdapter2 = f11514o;
            if (binderAdapter2 == null) {
                HMSLog.m8728w("BaseHmsClient", "mOuterBinderAdapter is null.");
                return;
            }
            binderAdapter2.unBind();
        }
        m8471m(1);
        m8465d(10);
    }

    public final void setInternalRequest(HuaweiApi.RequestHandler requestHandler) {
        this.f11524k = requestHandler;
    }

    public void setService(InterfaceC7277d interfaceC7277d) {
        this.f11519f = interfaceC7277d;
    }

    /* renamed from: t */
    public final void m8477t() {
        if (this.f11518e.isUseInnerHms()) {
            BinderAdapter binderAdapter = f11515p;
            if (binderAdapter != null) {
                binderAdapter.unBind();
                return;
            }
            return;
        }
        BinderAdapter binderAdapter2 = f11514o;
        if (binderAdapter2 != null) {
            binderAdapter2.unBind();
        }
    }

    /* renamed from: u */
    public ClientSettings m8478u() {
        return this.f11518e;
    }

    public void connect(int i10, boolean z10) {
        m8466e(i10, z10);
    }
}
