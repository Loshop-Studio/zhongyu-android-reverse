package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.InterfaceC7277d;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.AbstractC7346b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import p385w4.AbstractC11701e;
import p385w4.C11702f;

/* loaded from: classes5.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {

    /* renamed from: a */
    public Context f11448a;

    /* renamed from: b */
    public Api.ApiOptions f11449b;

    /* renamed from: c */
    public Context f11450c;

    /* renamed from: d */
    public AbstractClientBuilder f11451d;

    /* renamed from: e */
    public String f11452e;

    /* renamed from: f */
    public String f11453f;

    /* renamed from: g */
    public SubAppInfo f11454g;

    /* renamed from: h */
    public WeakReference f11455h;

    /* renamed from: i */
    public int f11456i;

    /* renamed from: j */
    public int f11457j = 1;

    /* renamed from: k */
    public boolean f11458k = false;

    /* renamed from: l */
    public String f11459l;

    /* renamed from: m */
    public boolean f11460m;

    /* renamed from: n */
    public RequestManager f11461n;

    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {

        /* renamed from: b */
        public final AnyClient f11466b;

        /* renamed from: d */
        public final HuaweiApi f11468d;

        /* renamed from: e */
        public ResolveClientBean f11469e;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();

        /* renamed from: a */
        public final Queue f11465a = new LinkedList();

        /* renamed from: c */
        public ConnectionResult f11467c = null;

        public RequestHandler(HuaweiApi huaweiApi) {
            this.f11468d = huaweiApi;
            this.f11466b = huaweiApi.getClient(RequestManager.getHandler().getLooper(), this);
        }

        /* renamed from: b */
        public final String m8434b(ConnectionResult connectionResult) {
            if (!Util.isAvailableLibExist(this.f11468d.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                return errorCode != -1 ? errorCode != 8 ? errorCode != 10 ? "unknown errorReason" : "application configuration error, please developer check configuration" : "internal error" : "get update result, but has other error codes";
            }
            int errorCode2 = connectionResult.getErrorCode();
            if (errorCode2 == -1) {
                return "get update result, but has other error codes";
            }
            if (errorCode2 == 3) {
                return "HuaWei Mobile Service is disabled";
            }
            if (errorCode2 == 8) {
                return "internal error";
            }
            if (errorCode2 == 10) {
                return "application configuration error, please developer check configuration";
            }
            if (errorCode2 == 13) {
                return "update cancelled";
            }
            if (errorCode2 == 21) {
                return "device is too old to be support";
            }
            switch (errorCode2) {
                case 25:
                    return "failed to get update result";
                case 26:
                    return "update failed, because no activity incoming, can't pop update page";
                case 27:
                    return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                default:
                    return "unknown errorReason";
            }
        }

        /* renamed from: c */
        public final String m8435c(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.f11468d.getAppID(), str2) : str;
        }

        /* renamed from: d */
        public void m8436d() {
            this.f11466b.disconnect();
        }

        /* renamed from: e */
        public synchronized void m8437e(int i10, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            if (this.f11466b.isConnected()) {
                HMSLog.m8722d("HuaweiApi", "client is connected");
                return;
            }
            if (this.f11466b.isConnecting()) {
                HMSLog.m8722d("HuaweiApi", "client is isConnecting");
                return;
            }
            if (this.f11468d.getActivity() != null) {
                if (this.f11469e == null) {
                    this.f11469e = new ResolveClientBean(this.f11466b, i10);
                }
                if (BindResolveClients.getInstance().isClientRegistered(this.f11469e)) {
                    HMSLog.m8727i("HuaweiApi", "mResolveClientBean has already register, return!");
                    return;
                }
                BindResolveClients.getInstance().register(this.f11469e);
            }
            this.f11466b.connect(i10);
        }

        /* renamed from: g */
        public final void m8438g(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper taskApiCallWrapperM8444a = taskApiCallbackWrapper.m8444a();
            ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
            responseHeader.setTransactionId(taskApiCallWrapperM8444a.getTaskApiCall().getTransactionId());
            taskApiCallWrapperM8444a.getTaskApiCall().onResponse(this.f11466b, responseHeader, null, taskApiCallWrapperM8444a.getTaskCompletionSource());
        }

        public AnyClient getClient() {
            return this.f11466b;
        }

        /* renamed from: h */
        public void m8439h(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.m8727i("HuaweiApi", "sendRequest");
            TaskApiCallbackWrapper taskApiCallbackWrapperM8440i = m8440i(taskApiCallWrapper);
            if (HMSPackageManager.getInstance(this.f11468d.getContext()).isUpdateHmsForThirdPartyDevice()) {
                this.f11466b.disconnect();
            }
            int hmsVersionCode = HMSPackageManager.getInstance(this.f11468d.f11448a).getHmsVersionCode();
            if (hmsVersionCode < 40000000 && hmsVersionCode > 0 && this.f11466b.isConnected() && !this.f11468d.f11460m && ((BaseHmsClient) this.f11466b).getAdapter().getServiceAction().equals("com.huawei.hms.core.aidlservice")) {
                int requestHmsVersionCode = this.f11466b.getRequestHmsVersionCode();
                if (requestHmsVersionCode <= taskApiCallWrapper.getTaskApiCall().getMinApkVersion()) {
                    requestHmsVersionCode = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
                }
                if (requestHmsVersionCode > hmsVersionCode) {
                    this.f11466b.disconnect();
                }
            }
            if (this.f11466b.isConnected()) {
                HMSLog.m8727i("HuaweiApi", "isConnected:true.");
                BinderAdapter adapter = ((BaseHmsClient) this.f11466b).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.f11466b).setService(InterfaceC7277d.a.m8519l(adapter.getServiceBinder()));
                postMessage(taskApiCallbackWrapperM8440i);
                return;
            }
            HMSLog.m8727i("HuaweiApi", "isConnected:false.");
            this.callbackWaitQueue.add(taskApiCallbackWrapperM8440i);
            ConnectionResult connectionResult = this.f11467c;
            if (connectionResult == null || connectionResult.getErrorCode() == 0) {
                RequestManager.addRequestToQueue(this);
                Object obj = this.f11466b;
                if (obj instanceof BaseHmsClient) {
                    ((BaseHmsClient) obj).setInternalRequest(this);
                }
                m8437e(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), taskApiCallbackWrapperM8440i);
                return;
            }
            HMSLog.m8727i("HuaweiApi", "onConnectionFailed, ErrorCode:" + this.f11467c.getErrorCode());
            onConnectionFailed(this.f11467c);
        }

        /* renamed from: i */
        public final TaskApiCallbackWrapper m8440i(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.1

                /* renamed from: a */
                public AtomicBoolean f11470a = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(InterfaceC7278e interfaceC7278e, String str) {
                    if (!(interfaceC7278e instanceof ResponseHeader)) {
                        HMSLog.m8725e("HuaweiApi", "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) interfaceC7278e;
                    if (responseHeader.getErrorCode() == 11) {
                        RequestHandler.this.m8436d();
                        HMSLog.m8727i("HuaweiApi", "unbind service");
                    }
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.m8725e("HuaweiApi", "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.f11470a.compareAndSet(true, false)) {
                        AbstractC7346b.m8720c(RequestHandler.this.f11468d.getContext(), responseHeader, String.valueOf(RequestHandler.this.f11468d.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.f11466b, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        /* renamed from: j */
        public final void m8441j() {
            this.f11467c = null;
            this.f11465a.clear();
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                postMessage(it.next());
            }
            this.callbackWaitQueue.clear();
        }

        /* renamed from: k */
        public final void m8442k(ConnectionResult connectionResult) {
            this.f11467c = connectionResult;
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                TaskApiCallWrapper taskApiCallWrapperM8444a = it.next().m8444a();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + m8434b(connectionResult) + "(" + connectionResult.getErrorCode() + ")");
                responseHeader.setTransactionId(taskApiCallWrapperM8444a.getTaskApiCall().getTransactionId());
                AbstractC7346b.m8720c(this.f11468d.getContext(), responseHeader, String.valueOf(this.f11468d.getKitSdkVersion()));
                if (this.f11467c.getResolution() != null && z10) {
                    responseHeader.setParcelable(this.f11467c.getResolution());
                    if (Util.isAvailableLibExist(this.f11468d.getContext()) && this.f11467c.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                    z10 = false;
                }
                int errorCode = this.f11467c.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                taskApiCallWrapperM8444a.getTaskApiCall().onResponse(this.f11466b, responseHeader, null, taskApiCallWrapperM8444a.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.f11465a.clear();
            this.f11467c = null;
            this.f11466b.disconnect();
        }

        /* renamed from: n */
        public final void m8443n() {
            HMSLog.m8727i("HuaweiApi", "wait queue size = " + this.callbackWaitQueue.size());
            HMSLog.m8727i("HuaweiApi", "run queue size = " + this.f11465a.size());
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                m8438g(it.next());
            }
            Iterator it2 = this.f11465a.iterator();
            while (it2.hasNext()) {
                m8438g((TaskApiCallbackWrapper) it2.next());
            }
            this.callbackWaitQueue.clear();
            this.f11465a.clear();
            this.f11467c = null;
            this.f11466b.disconnect();
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.m8727i("HuaweiApi", "onConnected");
            BindResolveClients.getInstance().unRegister(this.f11469e);
            this.f11469e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.4
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.m8441j();
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.m8727i("HuaweiApi", "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.f11469e);
            this.f11469e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.m8442k(connectionResult);
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i10) {
            HMSLog.m8727i("HuaweiApi", "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.f11469e);
            this.f11469e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.5
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.m8443n();
                }
            });
        }

        public void postMessage(final TaskApiCallbackWrapper taskApiCallbackWrapper) {
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.m8444a().getTaskApiCall().getTransactionId(), this);
            this.f11465a.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.m8444a().getTaskApiCall().getUri();
            String packageName = (this.f11468d.f11450c == null ? this.f11468d.getContext() : this.f11468d.f11450c).getPackageName();
            if (this.f11468d.f11450c != null) {
                HuaweiApi huaweiApi = this.f11468d;
                huaweiApi.m8425h(huaweiApi.f11450c);
            }
            final RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.f11468d.getAppID() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f11468d.getSubAppID());
            requestHeader.setPkgName(packageName);
            requestHeader.setSessionId(this.f11466b.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.m8444a().getTaskApiCall();
            requestHeader.setTransactionId(m8435c(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.f11468d.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.f11468d.getApiLevel(), taskApiCall.getApiLevel()));
            this.f11466b.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2
                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(InterfaceC7278e interfaceC7278e, String str) {
                    AnyClient.CallBack callBackM8445b = taskApiCallbackWrapper.m8445b();
                    if (callBackM8445b != null) {
                        callBackM8445b.onCallback(interfaceC7278e, str);
                    }
                    RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                    RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RequestHandler.this.f11465a.remove(taskApiCallbackWrapper);
                        }
                    });
                }
            });
        }
    }

    public static class TaskApiCallbackWrapper {

        /* renamed from: a */
        public final TaskApiCallWrapper f11481a;

        /* renamed from: b */
        public final AnyClient.CallBack f11482b;

        public TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.f11481a = taskApiCallWrapper;
            this.f11482b = callBack;
        }

        /* renamed from: a */
        public TaskApiCallWrapper m8444a() {
            return this.f11481a;
        }

        /* renamed from: b */
        public AnyClient.CallBack m8445b() {
            return this.f11482b;
        }
    }

    /* renamed from: com.huawei.hms.common.HuaweiApi$a */
    public static class RunnableC7261a<OptionsT extends Api.ApiOptions> implements Runnable {

        /* renamed from: c */
        public final HuaweiApi f11483c;

        /* renamed from: d */
        public final TaskApiCallWrapper f11484d;

        public RunnableC7261a(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
            this.f11483c = huaweiApi;
            this.f11484d = taskApiCallWrapper;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m8446a(com.huawei.hms.common.HuaweiApi.RequestHandler r8, java.lang.Throwable r9) {
            /*
                r7 = this;
                java.lang.String r0 = "HuaweiApi"
                r1 = 0
                com.huawei.hms.common.internal.AnyClient r8 = r8.getClient()     // Catch: java.lang.Throwable -> L36
                com.huawei.hms.common.internal.ResponseHeader r2 = new com.huawei.hms.common.internal.ResponseHeader     // Catch: java.lang.Throwable -> L33
                java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L33
                r3 = 1
                r4 = 907135001(0x3611c819, float:2.1723156E-6)
                r2.<init>(r3, r4, r9)     // Catch: java.lang.Throwable -> L33
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f
                r9.<init>()     // Catch: java.lang.Throwable -> L2f
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2f
                com.huawei.hms.common.internal.TaskApiCallWrapper r3 = r7.f11484d     // Catch: java.lang.Throwable -> L2c
                w4.f r3 = r3.getTaskCompletionSource()     // Catch: java.lang.Throwable -> L2c
                com.huawei.hms.common.internal.TaskApiCallWrapper r4 = r7.f11484d     // Catch: java.lang.Throwable -> L2a
                com.huawei.hms.common.internal.TaskApiCall r1 = r4.getTaskApiCall()     // Catch: java.lang.Throwable -> L2a
                goto L54
            L2a:
                r4 = move-exception
                goto L3c
            L2c:
                r4 = move-exception
                r3 = r1
                goto L3c
            L2f:
                r4 = move-exception
                r9 = r1
                r3 = r9
                goto L3c
            L33:
                r9 = move-exception
                r4 = r9
                goto L39
            L36:
                r8 = move-exception
                r4 = r8
                r8 = r1
            L39:
                r9 = r1
                r2 = r9
                r3 = r2
            L3c:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "<notifyCpException> "
                r5.append(r6)
                java.lang.String r4 = r4.getMessage()
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                com.huawei.hms.support.log.HMSLog.m8725e(r0, r4)
            L54:
                if (r8 == 0) goto L62
                if (r2 == 0) goto L62
                if (r9 == 0) goto L62
                if (r3 == 0) goto L62
                if (r1 == 0) goto L62
                r1.onResponse(r8, r2, r9, r3)
                goto L67
            L62:
                java.lang.String r8 = "<notifyCpException> isNotify is false, Can not notify CP."
                com.huawei.hms.support.log.HMSLog.m8725e(r0, r8)
            L67:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.HuaweiApi.RunnableC7261a.m8446a(com.huawei.hms.common.HuaweiApi$RequestHandler, java.lang.Throwable):void");
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestHandler requestHandler = new RequestHandler(this.f11483c);
            try {
                requestHandler.m8439h(this.f11484d);
            } catch (Throwable th) {
                HMSLog.m8726e("HuaweiApi", "sendRequest has exception", th);
                m8446a(requestHandler, th);
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i10) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f11455h = new WeakReference(activity);
        m8423d(activity, api, toption, abstractClientBuilder, i10, null);
    }

    /* renamed from: b */
    public final AbstractC11701e m8421b(TaskApiCall taskApiCall) {
        taskApiCall.getToken();
        C11702f c11702f = new C11702f();
        RequestManager.getHandler().post(new RunnableC7261a(this, new TaskApiCallWrapper(taskApiCall, c11702f)));
        return c11702f.m25872a();
    }

    /* renamed from: c */
    public final void m8422c(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    /* renamed from: d */
    public final void m8423d(Context context, Api api, Api.ApiOptions apiOptions, AbstractClientBuilder abstractClientBuilder, int i10, String str) {
        this.f11448a = context.getApplicationContext();
        this.f11449b = apiOptions;
        this.f11451d = abstractClientBuilder;
        m8425h(context);
        this.f11454g = new SubAppInfo("");
        this.f11456i = i10;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.f11452e)) {
                HMSLog.m8725e("HuaweiApi", "subAppId is host appid");
            } else {
                HMSLog.m8727i("HuaweiApi", "subAppId is " + str);
                this.f11454g = new SubAppInfo(str);
            }
        }
        m8422c(context);
        if (Util.isAvailableLibExist(context)) {
            AvailableUtil.asyncCheckHmsUpdateInfo(context);
        }
    }

    @Deprecated
    public AbstractC11701e disconnectService() {
        final C11702f c11702f = new C11702f();
        RequestManager.getInstance();
        RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.1
            @Override // java.lang.Runnable
            public void run() {
                HuaweiApi.this.m8424g(this, c11702f);
            }
        });
        return c11702f.m25872a();
    }

    public <TResult, TClient extends AnyClient> AbstractC11701e doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        this.f11458k = true;
        if (taskApiCall == null) {
            HMSLog.m8725e("HuaweiApi", "in doWrite:taskApiCall is null");
            C11702f c11702f = new C11702f();
            c11702f.m25873b(new ApiException(Status.FAILURE));
            return c11702f.m25872a();
        }
        AbstractC7346b.m8719b(this.f11448a, taskApiCall.getUri(), TextUtils.isEmpty(this.f11454g.getSubAppID()) ? this.f11453f : this.f11454g.getSubAppID(), taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
        if (this.f11461n == null) {
            this.f11461n = RequestManager.getInstance();
        }
        return m8421b(taskApiCall);
    }

    /* renamed from: g */
    public final void m8424g(HuaweiApi huaweiApi, C11702f c11702f) {
        HMSLog.m8727i("HuaweiApi", "innerDisconnect.");
        try {
            huaweiApi.getClient(RequestManager.getHandler().getLooper(), null).disconnect();
            c11702f.m25874c(Boolean.TRUE);
        } catch (Exception e10) {
            HMSLog.m8728w("HuaweiApi", "disconnect the binder failed for:" + e10.getMessage());
        }
    }

    public Activity getActivity() {
        WeakReference weakReference = this.f11455h;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.f11457j;
    }

    public String getAppID() {
        return this.f11453f;
    }

    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.f11451d.buildClient(this.f11448a, m8426k(), requestHandler, requestHandler);
    }

    public Context getContext() {
        return this.f11448a;
    }

    public int getKitSdkVersion() {
        return this.f11456i;
    }

    public TOption getOption() {
        return (TOption) this.f11449b;
    }

    public String getSubAppID() {
        return this.f11454g.getSubAppID();
    }

    /* renamed from: h */
    public final void m8425h(Context context) {
        String appId = Util.getAppId(context);
        this.f11452e = appId;
        this.f11453f = appId;
    }

    /* renamed from: k */
    public ClientSettings m8426k() {
        ClientSettings clientSettings = new ClientSettings(this.f11448a.getPackageName(), this.f11448a.getClass().getName(), m8427l(), this.f11452e, null, this.f11454g);
        if (!this.f11460m) {
            String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.f11448a).getHMSPackageNameForMultiService();
            if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
                hMSPackageNameForMultiService = "com.huawei.hwid";
            }
            this.f11459l = hMSPackageNameForMultiService;
            HMSLog.m8727i("HuaweiApi", "No setInnerHms, hms pkg name is " + this.f11459l);
        }
        clientSettings.setInnerHmsPkg(this.f11459l);
        clientSettings.setUseInnerHms(this.f11460m);
        WeakReference weakReference = this.f11455h;
        if (weakReference != null) {
            clientSettings.setCpActivity((Activity) weakReference.get());
        }
        return clientSettings;
    }

    /* renamed from: l */
    public List m8427l() {
        return Collections.EMPTY_LIST;
    }

    public void setApiLevel(int i10) {
        this.f11457j = i10;
    }

    public void setHostContext(Context context) {
        this.f11450c = context;
    }

    public void setInnerHms() {
        this.f11459l = this.f11448a.getPackageName();
        this.f11460m = true;
        HMSLog.m8727i("HuaweiApi", "<setInnerHms> init inner hms pkg info:" + this.f11459l);
    }

    public void setKitSdkVersion(int i10) {
        this.f11456i = i10;
    }

    public void setSubAppId(String str) throws ApiException {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.m8727i("HuaweiApi", "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.f11454g;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.m8725e("HuaweiApi", "subAppInfo is already set");
            return false;
        }
        if (subAppInfo == null) {
            HMSLog.m8725e("HuaweiApi", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.m8725e("HuaweiApi", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(this.f11452e)) {
            HMSLog.m8725e("HuaweiApi", "subAppId is host appid");
            return false;
        }
        if (this.f11458k) {
            HMSLog.m8725e("HuaweiApi", "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
            return false;
        }
        this.f11454g = new SubAppInfo(subAppInfo);
        return true;
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i10, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f11455h = new WeakReference(activity);
        m8423d(activity, api, toption, abstractClientBuilder, i10, str);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f11455h = new WeakReference(activity);
        m8423d(activity, api, toption, abstractClientBuilder, 0, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i10) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        m8423d(context, api, toption, abstractClientBuilder, i10, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i10, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        m8423d(context, api, toption, abstractClientBuilder, i10, str);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        m8423d(context, api, toption, abstractClientBuilder, 0, null);
    }
}
