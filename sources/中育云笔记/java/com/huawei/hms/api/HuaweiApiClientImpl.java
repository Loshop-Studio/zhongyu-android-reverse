package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.work.PeriodicWorkRequest;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.core.aidl.AbstractC7275b;
import com.huawei.hms.core.aidl.C7279f;
import com.huawei.hms.core.aidl.C7281h;
import com.huawei.hms.core.aidl.C7282i;
import com.huawei.hms.core.aidl.DataBuffer;
import com.huawei.hms.core.aidl.InterfaceC7276c;
import com.huawei.hms.core.aidl.InterfaceC7277d;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.core.ConnectService;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
/* loaded from: classes5.dex */
public class HuaweiApiClientImpl extends HuaweiApiClient implements InnerApiClient, ServiceConnection {

    /* renamed from: A */
    private static final Object f11371A = new Object();

    /* renamed from: B */
    private static final Object f11372B = new Object();
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    /* renamed from: b */
    private final Context f11374b;

    /* renamed from: c */
    private final String f11375c;

    /* renamed from: d */
    private String f11376d;

    /* renamed from: e */
    private String f11377e;

    /* renamed from: f */
    private volatile InterfaceC7277d f11378f;

    /* renamed from: g */
    private String f11379g;

    /* renamed from: h */
    private WeakReference<Activity> f11380h;

    /* renamed from: i */
    private WeakReference<Activity> f11381i;

    /* renamed from: l */
    private List<Scope> f11384l;

    /* renamed from: m */
    private List<PermissionInfo> f11385m;

    /* renamed from: n */
    private Map<Api<?>, Api.ApiOptions> f11386n;

    /* renamed from: o */
    private SubAppInfo f11387o;

    /* renamed from: s */
    private final ReentrantLock f11391s;

    /* renamed from: t */
    private final Condition f11392t;

    /* renamed from: u */
    private ConnectionResult f11393u;

    /* renamed from: v */
    private HuaweiApiClient.ConnectionCallbacks f11394v;

    /* renamed from: w */
    private HuaweiApiClient.OnConnectionFailedListener f11395w;

    /* renamed from: x */
    private Handler f11396x;

    /* renamed from: y */
    private Handler f11397y;

    /* renamed from: z */
    private CheckUpdatelistener f11398z;

    /* renamed from: a */
    private int f11373a = -1;

    /* renamed from: j */
    private boolean f11382j = false;

    /* renamed from: k */
    private AtomicInteger f11383k = new AtomicInteger(1);

    /* renamed from: p */
    private long f11388p = 0;

    /* renamed from: q */
    private int f11389q = 0;

    /* renamed from: r */
    private final Object f11390r = new Object();

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$a */
    public class C7239a implements Handler.Callback {
        public C7239a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 2) {
                return false;
            }
            HMSLog.m8725e("HuaweiApiClientImpl", "In connect, bind core service time out");
            if (HuaweiApiClientImpl.this.f11383k.get() == 5) {
                HuaweiApiClientImpl.this.m8355c(1);
                HuaweiApiClientImpl.this.m8348b();
            }
            return true;
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$b */
    public class C7240b implements Handler.Callback {
        public C7240b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 3) {
                return false;
            }
            HMSLog.m8725e("HuaweiApiClientImpl", "In connect, process time out");
            if (HuaweiApiClientImpl.this.f11383k.get() == 2) {
                HuaweiApiClientImpl.this.m8355c(1);
                HuaweiApiClientImpl.this.m8348b();
            }
            return true;
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$c */
    public class BinderC7241c extends InterfaceC7276c.a {

        /* renamed from: a */
        public final /* synthetic */ ResultCallback f11401a;

        public BinderC7241c(ResultCallback resultCallback) {
            this.f11401a = resultCallback;
        }

        @Override // com.huawei.hms.core.aidl.InterfaceC7276c
        public void call(DataBuffer dataBuffer) {
            if (dataBuffer == null) {
                HMSLog.m8727i("HuaweiApiClientImpl", "Exit asyncRequest onResult -1");
                this.f11401a.onResult(new BundleResult(-1, null));
                return;
            }
            C7279f c7279fM8513a = AbstractC7275b.m8513a(dataBuffer.m8510i());
            C7282i c7282i = new C7282i();
            c7279fM8513a.m8527f(dataBuffer.f11601d, c7282i);
            BundleResult bundleResult = new BundleResult(c7282i.m8538a(), dataBuffer.m8508g());
            HMSLog.m8727i("HuaweiApiClientImpl", "Exit asyncRequest onResult");
            this.f11401a.onResult(bundleResult);
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$d */
    public static class C7242d extends PendingResultImpl {
        public C7242d(ApiClient apiClient, String str, InterfaceC7278e interfaceC7278e) {
            super(apiClient, str, interfaceC7278e);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Status onComplete(InterfaceC7278e interfaceC7278e) {
            return new Status(0);
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$e */
    public class C7243e implements ResultCallback {

        /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$e$a */
        public class a implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ ResolveResult f11404c;

            public a(ResolveResult resolveResult) {
                this.f11404c = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.m8346a((ResolveResult<ConnectResp>) this.f11404c);
            }
        }

        public C7243e() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        public /* synthetic */ C7243e(HuaweiApiClientImpl huaweiApiClientImpl, C7239a c7239a) {
            this();
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$f */
    public class C7244f implements ResultCallback {

        /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$f$a */
        public class a implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ ResolveResult f11407c;

            public a(ResolveResult resolveResult) {
                this.f11407c = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.m8352b((ResolveResult<DisconnectResp>) this.f11407c);
            }
        }

        public C7244f() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        public /* synthetic */ C7244f(HuaweiApiClientImpl huaweiApiClientImpl, C7239a c7239a) {
            this();
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$g */
    public class C7245g implements ResultCallback {
        public C7245g() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult resolveResult) {
            JosGetNoticeResp josGetNoticeResp;
            Intent noticeIntent;
            if (resolveResult == null || !resolveResult.getStatus().isSuccess() || (noticeIntent = (josGetNoticeResp = (JosGetNoticeResp) resolveResult.getValue()).getNoticeIntent()) == null || josGetNoticeResp.getStatusCode() != 0) {
                return;
            }
            HMSLog.m8727i("HuaweiApiClientImpl", "get notice has intent.");
            Activity validActivity = Util.getValidActivity((Activity) HuaweiApiClientImpl.this.f11380h.get(), HuaweiApiClientImpl.this.getTopActivity());
            if (validActivity == null) {
                HMSLog.m8725e("HuaweiApiClientImpl", "showNotice no valid activity!");
            } else {
                HuaweiApiClientImpl.this.f11382j = true;
                validActivity.startActivity(noticeIntent);
            }
        }

        public /* synthetic */ C7245g(HuaweiApiClientImpl huaweiApiClientImpl, C7239a c7239a) {
            this();
        }
    }

    public HuaweiApiClientImpl(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f11391s = reentrantLock;
        this.f11392t = reentrantLock.newCondition();
        this.f11396x = null;
        this.f11397y = null;
        this.f11398z = null;
        this.f11374b = context;
        String appId = Util.getAppId(context);
        this.f11375c = appId;
        this.f11376d = appId;
        this.f11377e = Util.getCpId(context);
    }

    /* renamed from: d */
    private DisconnectInfo m8357d() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f11386n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return new DisconnectInfo(this.f11384l, arrayList);
    }

    /* renamed from: e */
    private int m8358e() {
        int hmsVersion = Util.getHmsVersion(this.f11374b);
        if (hmsVersion != 0 && hmsVersion >= 20503000) {
            return hmsVersion;
        }
        int iM8359f = m8359f();
        if (m8360g()) {
            if (iM8359f < 20503000) {
                return 20503000;
            }
        } else if (iM8359f < 20600000) {
            return 20600000;
        }
        return iM8359f;
    }

    /* renamed from: f */
    private int m8359f() {
        Integer num;
        int iIntValue;
        Map<Api<?>, Api.ApiOptions> apiMap = getApiMap();
        int i10 = 0;
        if (apiMap == null) {
            return 0;
        }
        Iterator<Api<?>> it = apiMap.keySet().iterator();
        while (it.hasNext()) {
            String apiName = it.next().getApiName();
            if (!TextUtils.isEmpty(apiName) && (num = HuaweiApiAvailability.getApiMap().get(apiName)) != null && (iIntValue = num.intValue()) > i10) {
                i10 = iIntValue;
            }
        }
        return i10;
    }

    /* renamed from: g */
    private boolean m8360g() {
        Map<Api<?>, Api.ApiOptions> map = this.f11386n;
        if (map == null) {
            return false;
        }
        Iterator<Api<?>> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(it.next().getApiName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m8361h() {
        Handler handler = this.f11396x;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f11396x = new Handler(Looper.getMainLooper(), new C7239a());
        }
        this.f11396x.sendEmptyMessageDelayed(2, CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    }

    /* renamed from: i */
    private void m8362i() {
        synchronized (f11372B) {
            try {
                Handler handler = this.f11397y;
                if (handler != null) {
                    handler.removeMessages(3);
                } else {
                    this.f11397y = new Handler(Looper.getMainLooper(), new C7240b());
                }
                HMSLog.m8722d("HuaweiApiClientImpl", "sendEmptyMessageDelayed for onConnectionResult 3 seconds. the result is : " + this.f11397y.sendEmptyMessageDelayed(3, 3000L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    private void m8363j() {
        HMSLog.m8727i("HuaweiApiClientImpl", "Enter sendConnectApiServceRequest.");
        ConnectService.connect(this, m8353c()).setResultCallback(new C7243e(this, null));
    }

    /* renamed from: k */
    private void m8364k() {
        ConnectService.disconnect(this, m8357d()).setResultCallback(new C7244f(this, null));
    }

    /* renamed from: l */
    private void m8365l() {
        HMSLog.m8727i("HuaweiApiClientImpl", "Enter sendForceConnectApiServceRequest.");
        ConnectService.forceConnect(this, m8353c()).setResultCallback(new C7243e(this, null));
    }

    /* renamed from: m */
    private void m8366m() {
        if (this.f11382j) {
            HMSLog.m8727i("HuaweiApiClientImpl", "Connect notice has been shown.");
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.f11374b) == 0) {
            ConnectService.getNotice(this, 0, "6.13.0.301").setResultCallback(new C7245g(this, null));
        }
    }

    /* renamed from: n */
    private void m8367n() {
        Util.unBindServiceCatchException(this.f11374b, this);
        this.f11378f = null;
    }

    public int asyncRequest(Bundle bundle, String str, int i10, ResultCallback<BundleResult> resultCallback) {
        HMSLog.m8727i("HuaweiApiClientImpl", "Enter asyncRequest.");
        if (resultCallback == null || str == null || bundle == null) {
            HMSLog.m8725e("HuaweiApiClientImpl", "arguments is invalid.");
            return CommonCode.ErrorCode.ARGUMENTS_INVALID;
        }
        if (!innerIsConnected()) {
            HMSLog.m8725e("HuaweiApiClientImpl", "client is unConnect.");
            return CommonCode.ErrorCode.CLIENT_API_INVALID;
        }
        DataBuffer dataBuffer = new DataBuffer(str, i10);
        C7279f c7279fM8513a = AbstractC7275b.m8513a(dataBuffer.m8510i());
        dataBuffer.m8507c(bundle);
        C7281h c7281h = new C7281h(getAppID(), getPackageName(), 61300301, getSessionId());
        c7281h.m8533b(getApiNameList());
        dataBuffer.f11601d = c7279fM8513a.m8528g(c7281h, new Bundle());
        try {
            getService().mo8518j(dataBuffer, new BinderC7241c(resultCallback));
            return 0;
        } catch (RemoteException e10) {
            HMSLog.m8725e("HuaweiApiClientImpl", "remote exception:" + e10.getMessage());
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (checkUpdatelistener == null) {
            HMSLog.m8725e("HuaweiApiClientImpl", "listener is null!");
            return;
        }
        if (activity == null || activity.isFinishing()) {
            HMSLog.m8725e("HuaweiApiClientImpl", "checkUpdate, activity is illegal: " + activity);
            checkUpdatelistener.onResult(-1);
            return;
        }
        this.f11398z = checkUpdatelistener;
        try {
            Class<?> cls = Class.forName("com.huawei.hms.update.manager.CheckUpdateLegacy");
            cls.getMethod("initCheckUpdateCallBack", Object.class, Activity.class).invoke(cls.getDeclaredConstructor(null).newInstance(null), this, activity);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            HMSLog.m8725e("HuaweiApiClientImpl", "invoke CheckUpdateLegacy.initCheckUpdateCallBack fail. " + e10.getMessage());
            checkUpdatelistener.onResult(-1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(Activity activity) {
        HMSLog.m8727i("HuaweiApiClientImpl", "====== HMSSDK version: 61300301 ======");
        int i10 = this.f11383k.get();
        HMSLog.m8727i("HuaweiApiClientImpl", "Enter connect, Connection Status: " + i10);
        if (i10 == 3 || i10 == 5 || i10 == 2 || i10 == 4) {
            return;
        }
        if (activity != null) {
            this.f11380h = new WeakReference<>(activity);
            this.f11381i = new WeakReference<>(activity);
        }
        this.f11376d = TextUtils.isEmpty(this.f11375c) ? Util.getAppId(this.f11374b) : this.f11375c;
        int iM8358e = m8358e();
        HMSLog.m8727i("HuaweiApiClientImpl", "connect minVersion:" + iM8358e);
        HuaweiApiAvailability.setServicesVersionCode(iM8358e);
        int iIsHuaweiMobileServicesAvailable = HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(this.f11374b, iM8358e);
        HMSLog.m8727i("HuaweiApiClientImpl", "In connect, isHuaweiMobileServicesAvailable result: " + iIsHuaweiMobileServicesAvailable);
        this.f11389q = HMSPackageManager.getInstance(this.f11374b).getHmsMultiServiceVersion();
        if (iIsHuaweiMobileServicesAvailable != 0) {
            if (this.f11395w != null) {
                m8349b(iIsHuaweiMobileServicesAvailable);
                return;
            }
            return;
        }
        m8355c(5);
        if (this.f11378f == null) {
            m8342a();
            return;
        }
        m8355c(2);
        m8363j();
        m8362i();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connectForeground() {
        HMSLog.m8727i("HuaweiApiClientImpl", "====== HMSSDK version: 61300301 ======");
        int i10 = this.f11383k.get();
        HMSLog.m8727i("HuaweiApiClientImpl", "Enter forceConnect, Connection Status: " + i10);
        if (i10 == 3 || i10 == 5 || i10 == 2 || i10 == 4) {
            return;
        }
        this.f11376d = TextUtils.isEmpty(this.f11375c) ? Util.getAppId(this.f11374b) : this.f11375c;
        m8365l();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disableLifeCycleManagement(Activity activity) {
        if (this.f11373a < 0) {
            throw new IllegalStateException("disableLifeCycleManagement failed");
        }
        AutoLifecycleFragment.getInstance(activity).stopAutoManage(this.f11373a);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public PendingResult<Status> discardAndReconnect() {
        return new C7242d(this, null, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disconnect() {
        int i10 = this.f11383k.get();
        HMSLog.m8727i("HuaweiApiClientImpl", "Enter disconnect, Connection Status: " + i10);
        if (i10 == 2) {
            m8355c(4);
            return;
        }
        if (i10 == 3) {
            m8355c(4);
            m8364k();
        } else {
            if (i10 != 5) {
                return;
            }
            m8343a(2);
            m8355c(4);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Map<Api<?>, Api.ApiOptions> getApiMap() {
        return this.f11386n;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f11386n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f11376d;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult getConnectionResult(Api<?> api) {
        if (isConnected()) {
            this.f11393u = null;
            return new ConnectionResult(0, (PendingIntent) null);
        }
        ConnectionResult connectionResult = this.f11393u;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f11374b;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f11377e;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f11374b.getPackageName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<PermissionInfo> getPermissionInfos() {
        return this.f11385m;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<Scope> getScopes() {
        return this.f11384l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public InterfaceC7277d getService() {
        return this.f11378f;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.f11379g;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public final SubAppInfo getSubAppInfo() {
        return this.f11387o;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Activity getTopActivity() {
        WeakReference<Activity> weakReference = this.f11381i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectedApi(Api<?> api) {
        return isConnected();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f11390r) {
            try {
                return this.f11395w == onConnectionFailedListener;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f11390r) {
            try {
                return this.f11394v == connectionCallbacks;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("blockingConnect must not be called on the UI thread");
        }
        this.f11391s.lock();
        try {
            connect((Activity) null);
            while (isConnecting()) {
                this.f11392t.await();
            }
            if (isConnected()) {
                this.f11393u = null;
                return new ConnectionResult(0, (PendingIntent) null);
            }
            ConnectionResult connectionResult = this.f11393u;
            return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, (PendingIntent) null);
        } finally {
            this.f11391s.unlock();
        }
    }

    @Override // com.huawei.hms.support.api.client.InnerApiClient
    public boolean innerIsConnected() {
        return this.f11383k.get() == 3 || this.f11383k.get() == 4;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient, com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (this.f11389q == 0) {
            this.f11389q = HMSPackageManager.getInstance(this.f11374b).getHmsMultiServiceVersion();
        }
        if (this.f11389q >= 20504000) {
            return innerIsConnected();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f11388p;
        if (jCurrentTimeMillis > 0 && jCurrentTimeMillis < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            return innerIsConnected();
        }
        if (!innerIsConnected()) {
            return false;
        }
        Status status = ((ResolveResult) ConnectService.checkconnect(this, new CheckConnectInfo()).awaitOnAnyThread(2000L, TimeUnit.MILLISECONDS)).getStatus();
        if (status.isSuccess()) {
            this.f11388p = System.currentTimeMillis();
            return true;
        }
        int statusCode = status.getStatusCode();
        HMSLog.m8727i("HuaweiApiClientImpl", "isConnected is false, statuscode:" + statusCode);
        if (statusCode == 907135004) {
            return false;
        }
        m8367n();
        m8355c(1);
        this.f11388p = System.currentTimeMillis();
        return false;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean isConnecting() {
        int i10 = this.f11383k.get();
        return i10 == 2 || i10 == 5;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onPause(Activity activity) {
        HMSLog.m8727i("HuaweiApiClientImpl", "onPause");
    }

    public void onResult(int i10) {
        this.f11398z.onResult(i10);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onResume(Activity activity) {
        if (activity != null) {
            HMSLog.m8727i("HuaweiApiClientImpl", "onResume");
            this.f11381i = new WeakReference<>(activity);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.m8727i("HuaweiApiClientImpl", "HuaweiApiClientImpl Enter onServiceConnected.");
        m8343a(2);
        this.f11378f = InterfaceC7277d.a.m8519l(iBinder);
        if (this.f11378f != null) {
            if (this.f11383k.get() == 5) {
                m8355c(2);
                m8363j();
                m8362i();
                return;
            } else {
                if (this.f11383k.get() != 3) {
                    m8367n();
                    return;
                }
                return;
            }
        }
        HMSLog.m8725e("HuaweiApiClientImpl", "In onServiceConnected, mCoreService must not be null.");
        m8367n();
        m8355c(1);
        if (this.f11395w != null) {
            WeakReference<Activity> weakReference = this.f11380h;
            ConnectionResult connectionResult = new ConnectionResult(10, (weakReference == null || weakReference.get() == null) ? null : HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f11380h.get(), 10));
            this.f11395w.onConnectionFailed(connectionResult);
            this.f11393u = connectionResult;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.m8727i("HuaweiApiClientImpl", "Enter onServiceDisconnected.");
        this.f11378f = null;
        m8355c(1);
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f11394v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnectionSuspended(1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void reconnect() {
        disconnect();
        connect((Activity) null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f11390r) {
            try {
                if (this.f11395w != onConnectionFailedListener) {
                    HMSLog.m8728w("HuaweiApiClientImpl", "unregisterConnectionFailedListener: this onConnectionFailedListener has not been registered");
                } else {
                    this.f11395w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f11390r) {
            try {
                if (this.f11394v != connectionCallbacks) {
                    HMSLog.m8728w("HuaweiApiClientImpl", "unregisterConnectionCallback: this connectionCallbacksListener has not been registered");
                } else {
                    this.f11394v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void resetListener() {
        this.f11398z = null;
    }

    public void setApiMap(Map<Api<?>, Api.ApiOptions> map) {
        this.f11386n = map;
    }

    public void setAutoLifecycleClientId(int i10) {
        this.f11373a = i10;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionCallbacks(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f11394v = connectionCallbacks;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionFailedListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f11395w = onConnectionFailedListener;
    }

    public void setHasShowNotice(boolean z10) {
        this.f11382j = z10;
    }

    public void setPermissionInfos(List<PermissionInfo> list) {
        this.f11385m = list;
    }

    public void setScopes(List<Scope> list) {
        this.f11384l = list;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.m8727i("HuaweiApiClientImpl", "Enter setSubAppInfo");
        if (subAppInfo == null) {
            HMSLog.m8725e("HuaweiApiClientImpl", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.m8725e("HuaweiApiClientImpl", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(TextUtils.isEmpty(this.f11375c) ? Util.getAppId(this.f11374b) : this.f11375c)) {
            HMSLog.m8725e("HuaweiApiClientImpl", "subAppId is host appid");
            return false;
        }
        this.f11387o = new SubAppInfo(subAppInfo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m8355c(int i10) {
        this.f11383k.set(i10);
        if (i10 == 1 || i10 == 3 || i10 == 2) {
            this.f11391s.lock();
            try {
                this.f11392t.signalAll();
            } finally {
                this.f11391s.unlock();
            }
        }
    }

    /* renamed from: b */
    private void m8349b(int i10) {
        PendingIntent resolveErrorPendingIntent;
        WeakReference<Activity> weakReference = this.f11380h;
        if (weakReference == null || weakReference.get() == null) {
            resolveErrorPendingIntent = null;
        } else {
            resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f11380h.get(), i10);
            HMSLog.m8727i("HuaweiApiClientImpl", "connect 2.0 fail: " + i10);
        }
        ConnectionResult connectionResult = new ConnectionResult(i10, resolveErrorPendingIntent);
        this.f11395w.onConnectionFailed(connectionResult);
        this.f11393u = connectionResult;
    }

    /* renamed from: a */
    private void m8342a() {
        Intent intent = new Intent(HMSPackageManager.getInstance(this.f11374b).getServiceAction());
        HMSPackageManager.getInstance(this.f11374b).refreshForMultiService();
        try {
            String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.f11374b).getHMSPackageNameForMultiService();
            if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
                HMSLog.m8725e("HuaweiApiClientImpl", "servicePackageName is empty, Service is invalid, bind core service fail.");
                m8355c(1);
                m8348b();
                return;
            }
            intent.setPackage(hMSPackageNameForMultiService);
            synchronized (f11371A) {
                try {
                    if (this.f11374b.bindService(intent, this, 1)) {
                        m8361h();
                        return;
                    }
                    m8355c(1);
                    HMSLog.m8725e("HuaweiApiClientImpl", "In connect, bind core service fail");
                    m8348b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalArgumentException unused) {
            HMSLog.m8725e("HuaweiApiClientImpl", "IllegalArgumentException when bindCoreService intent.setPackage");
            m8355c(1);
            HMSLog.m8725e("HuaweiApiClientImpl", "In connect, bind core service fail");
            m8348b();
        }
    }

    /* renamed from: c */
    private ConnectInfo m8353c() throws PackageManager.NameNotFoundException {
        String packageSignature = new PackageManagerHelper(this.f11374b).getPackageSignature(this.f11374b.getPackageName());
        if (packageSignature == null) {
            packageSignature = "";
        }
        SubAppInfo subAppInfo = this.f11387o;
        return new ConnectInfo(getApiNameList(), this.f11384l, packageSignature, subAppInfo == null ? null : subAppInfo.getSubAppID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8348b() {
        m8367n();
        if (this.f11395w != null) {
            int i10 = UIUtil.isBackground(this.f11374b) ? 7 : 6;
            WeakReference<Activity> weakReference = this.f11380h;
            ConnectionResult connectionResult = new ConnectionResult(i10, (weakReference == null || weakReference.get() == null) ? null : HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f11380h.get(), i10));
            this.f11395w.onConnectionFailed(connectionResult);
            this.f11393u = connectionResult;
        }
    }

    /* renamed from: c */
    private void m8356c(ResolveResult<ConnectResp> resolveResult) {
        if (resolveResult.getValue() != null) {
            ProtocolNegotiate.getInstance().negotiate(resolveResult.getValue().protocolVersion);
        }
        m8355c(3);
        this.f11393u = null;
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f11394v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnected();
        }
        if (this.f11380h != null) {
            m8366m();
        }
        for (Map.Entry<Api<?>, Api.ApiOptions> entry : getApiMap().entrySet()) {
            if (entry.getKey().getmConnetctPostList() != null && !entry.getKey().getmConnetctPostList().isEmpty()) {
                HMSLog.m8727i("HuaweiApiClientImpl", "Enter onConnectionResult, get the ConnetctPostList ");
                for (ConnectionPostProcessor connectionPostProcessor : entry.getKey().getmConnetctPostList()) {
                    HMSLog.m8727i("HuaweiApiClientImpl", "Enter onConnectionResult, processor.run");
                    connectionPostProcessor.run(this, this.f11380h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8352b(ResolveResult<DisconnectResp> resolveResult) {
        HMSLog.m8727i("HuaweiApiClientImpl", "Enter onDisconnectionResult, disconnect from server result: " + resolveResult.getStatus().getStatusCode());
        m8367n();
        m8355c(1);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect(long j10, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f11391s.lock();
            try {
                connect((Activity) null);
                long nanos = timeUnit.toNanos(j10);
                while (isConnecting()) {
                    if (nanos <= 0) {
                        disconnect();
                        return new ConnectionResult(14, (PendingIntent) null);
                    }
                    nanos = this.f11392t.awaitNanos(nanos);
                }
                if (isConnected()) {
                    this.f11393u = null;
                    return new ConnectionResult(0, (PendingIntent) null);
                }
                ConnectionResult connectionResult = this.f11393u;
                return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            } finally {
                this.f11391s.unlock();
            }
        }
        throw new IllegalStateException("blockingConnect must not be called on the UI thread");
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(int i10) {
        connect((Activity) null);
    }

    /* renamed from: a */
    private void m8343a(int i10) {
        if (i10 == 2) {
            synchronized (f11371A) {
                try {
                    Handler handler = this.f11396x;
                    if (handler != null) {
                        handler.removeMessages(i10);
                        this.f11396x = null;
                    }
                } finally {
                }
            }
        }
        if (i10 == 3) {
            synchronized (f11372B) {
                try {
                    Handler handler2 = this.f11397y;
                    if (handler2 != null) {
                        handler2.removeMessages(i10);
                        this.f11397y = null;
                    }
                } finally {
                }
            }
        }
        synchronized (f11371A) {
            try {
                Handler handler3 = this.f11396x;
                if (handler3 != null) {
                    handler3.removeMessages(2);
                    this.f11396x = null;
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8346a(ResolveResult<ConnectResp> resolveResult) {
        HMSLog.m8727i("HuaweiApiClientImpl", "Enter onConnectionResult");
        if (this.f11378f != null && this.f11383k.get() == 2) {
            m8343a(3);
            ConnectResp value = resolveResult.getValue();
            if (value != null) {
                this.f11379g = value.sessionId;
            }
            SubAppInfo subAppInfo = this.f11387o;
            PendingIntent resolveErrorPendingIntent = null;
            String subAppID = subAppInfo == null ? null : subAppInfo.getSubAppID();
            if (!TextUtils.isEmpty(subAppID)) {
                this.f11376d = subAppID;
            }
            int statusCode = resolveResult.getStatus().getStatusCode();
            HMSLog.m8727i("HuaweiApiClientImpl", "Enter onConnectionResult, connect to server result: " + statusCode);
            if (Status.SUCCESS.equals(resolveResult.getStatus())) {
                m8356c(resolveResult);
                return;
            }
            if (resolveResult.getStatus() != null && resolveResult.getStatus().getStatusCode() == 1001) {
                m8367n();
                m8355c(1);
                HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f11394v;
                if (connectionCallbacks != null) {
                    connectionCallbacks.onConnectionSuspended(3);
                    return;
                }
                return;
            }
            m8367n();
            m8355c(1);
            if (this.f11395w != null) {
                WeakReference<Activity> weakReference = this.f11380h;
                if (weakReference != null && weakReference.get() != null) {
                    resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f11380h.get(), statusCode);
                }
                ConnectionResult connectionResult = new ConnectionResult(statusCode, resolveErrorPendingIntent);
                this.f11395w.onConnectionFailed(connectionResult);
                this.f11393u = connectionResult;
                return;
            }
            return;
        }
        HMSLog.m8725e("HuaweiApiClientImpl", "Invalid onConnectionResult");
    }
}
