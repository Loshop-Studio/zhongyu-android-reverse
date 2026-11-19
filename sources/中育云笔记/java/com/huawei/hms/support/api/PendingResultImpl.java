package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.adapter.BaseAdapter;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.AbstractC7274a;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public abstract class PendingResultImpl<R extends Result, T extends InterfaceC7278e> extends InnerPendingResult<R> {

    /* renamed from: a */
    private CountDownLatch f11715a;

    /* renamed from: c */
    private WeakReference<ApiClient> f11717c;
    protected DatagramTransport transport = null;

    /* renamed from: b */
    private R f11716b = null;

    /* renamed from: d */
    private String f11718d = null;

    /* renamed from: e */
    private String f11719e = null;

    /* renamed from: f */
    private boolean f11720f = true;

    /* renamed from: com.huawei.hms.support.api.PendingResultImpl$a */
    public class C7324a implements DatagramTransport.InterfaceC7338a {
        public C7324a() {
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.InterfaceC7338a
        /* renamed from: a */
        public void mo8680a(int i10, InterfaceC7278e interfaceC7278e) {
            PendingResultImpl.this.m8678c(i10, interfaceC7278e);
            PendingResultImpl.this.f11715a.countDown();
        }
    }

    /* renamed from: com.huawei.hms.support.api.PendingResultImpl$b */
    public class C7325b implements DatagramTransport.InterfaceC7338a {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f11722a;

        public C7325b(AtomicBoolean atomicBoolean) {
            this.f11722a = atomicBoolean;
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.InterfaceC7338a
        /* renamed from: a */
        public void mo8680a(int i10, InterfaceC7278e interfaceC7278e) {
            if (!this.f11722a.get()) {
                PendingResultImpl.this.m8678c(i10, interfaceC7278e);
            }
            PendingResultImpl.this.f11715a.countDown();
        }
    }

    /* renamed from: com.huawei.hms.support.api.PendingResultImpl$c */
    public class C7326c implements DatagramTransport.InterfaceC7338a {

        /* renamed from: a */
        public final /* synthetic */ HandlerC7327d f11724a;

        /* renamed from: b */
        public final /* synthetic */ ResultCallback f11725b;

        public C7326c(HandlerC7327d handlerC7327d, ResultCallback resultCallback) {
            this.f11724a = handlerC7327d;
            this.f11725b = resultCallback;
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.InterfaceC7338a
        /* renamed from: a */
        public void mo8680a(int i10, InterfaceC7278e interfaceC7278e) {
            PendingResultImpl.this.m8678c(i10, interfaceC7278e);
            this.f11724a.m8681a(this.f11725b, PendingResultImpl.this.f11716b);
        }
    }

    /* renamed from: com.huawei.hms.support.api.PendingResultImpl$d */
    public static class HandlerC7327d extends Handler {
        public HandlerC7327d(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public void m8681a(ResultCallback resultCallback, Result result) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, result)));
        }

        /* renamed from: b */
        public void m8682b(ResultCallback resultCallback, Result result) {
            resultCallback.onResult(result);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            Pair pair = (Pair) message.obj;
            m8682b((ResultCallback) pair.first, (Result) pair.second);
        }
    }

    public PendingResultImpl(ApiClient apiClient, String str, InterfaceC7278e interfaceC7278e) {
        m8679d(apiClient, str, interfaceC7278e, getResponseType(), 0);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        HMSLog.m8727i("PendingResultImpl", "await");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return (R) awaitOnAnyThread();
        }
        HMSLog.m8725e("PendingResultImpl", "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread() throws InterruptedException {
        HMSLog.m8727i("PendingResultImpl", "awaitOnAnyThread");
        WeakReference<ApiClient> weakReference = this.f11717c;
        if (weakReference == null) {
            HMSLog.m8725e("PendingResultImpl", "api is null");
            m8678c(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.f11716b;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m8725e("PendingResultImpl", "client invalid");
            m8678c(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.f11716b;
        }
        if (this.f11720f) {
            m8677b(0, 1);
        }
        this.transport.send(apiClient, new C7324a());
        try {
            this.f11715a.await();
        } catch (InterruptedException unused) {
            HMSLog.m8725e("PendingResultImpl", "await in anythread InterruptedException");
            m8678c(CommonCode.ErrorCode.INTERNAL_ERROR, null);
        }
        return this.f11716b;
    }

    /* renamed from: c */
    public final void m8678c(int i10, InterfaceC7278e interfaceC7278e) {
        Status status;
        HMSLog.m8727i("PendingResultImpl", "setResult:" + i10);
        Status commonStatus = interfaceC7278e instanceof AbstractC7274a ? ((AbstractC7274a) interfaceC7278e).getCommonStatus() : null;
        if (i10 == 0) {
            this.f11716b = (R) onComplete(interfaceC7278e);
        } else {
            this.f11716b = (R) onError(i10);
        }
        if (this.f11720f) {
            m8677b(i10, 2);
        }
        R r10 = this.f11716b;
        if (r10 == null || (status = r10.getStatus()) == null || commonStatus == null) {
            return;
        }
        int statusCode = status.getStatusCode();
        String statusMessage = status.getStatusMessage();
        int statusCode2 = commonStatus.getStatusCode();
        String statusMessage2 = commonStatus.getStatusMessage();
        if (statusCode == statusCode2) {
            if (!TextUtils.isEmpty(statusMessage) || TextUtils.isEmpty(statusMessage2)) {
                return;
            }
            HMSLog.m8727i("PendingResultImpl", "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + ")");
            this.f11716b.setStatus(new Status(statusCode, statusMessage2, status.getResolution()));
            return;
        }
        HMSLog.m8725e("PendingResultImpl", "rstStatus code (" + statusCode + ") is not equal commonStatus code (" + statusCode2 + ")");
        HMSLog.m8725e("PendingResultImpl", "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + ")");
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    public boolean checkApiClient(ApiClient apiClient) {
        return true;
    }

    /* renamed from: d */
    public final void m8679d(ApiClient apiClient, String str, InterfaceC7278e interfaceC7278e, Class cls, int i10) {
        HMSLog.m8727i("PendingResultImpl", "init uri:" + str);
        this.f11718d = str;
        if (apiClient == null) {
            HMSLog.m8725e("PendingResultImpl", "client is null");
            return;
        }
        this.f11717c = new WeakReference<>(apiClient);
        this.f11715a = new CountDownLatch(1);
        try {
            this.transport = (DatagramTransport) Class.forName(apiClient.getTransportName()).getConstructor(String.class, InterfaceC7278e.class, Class.class, Integer.TYPE).newInstance(str, interfaceC7278e, cls, Integer.valueOf(i10));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            HMSLog.m8725e("PendingResultImpl", "gen transport error:" + e10.getMessage());
            throw new IllegalStateException("Instancing transport exception, " + e10.getMessage(), e10);
        }
    }

    public Class<T> getResponseType() {
        Type type;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]) == null) {
            return null;
        }
        return (Class) type;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
        return false;
    }

    public abstract R onComplete(T t10);

    public R onError(int i10) {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Type type = genericSuperclass != null ? ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0] : null;
        Class<?> type2 = type != null ? GenericTypeReflector.getType(type) : null;
        if (type2 != null) {
            try {
                R r10 = (R) type2.newInstance();
                this.f11716b = r10;
                r10.setStatus(new Status(i10));
            } catch (Exception e10) {
                HMSLog.m8725e("PendingResultImpl", "on Error:" + e10.getMessage());
                return null;
            }
        }
        return this.f11716b;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
        this.f11720f = !(resultCallback instanceof BaseAdapter.BaseRequestResultCallback);
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    /* renamed from: b */
    public final void m8677b(int i10, int i11) {
        SubAppInfo subAppInfo;
        HMSLog.m8727i("PendingResultImpl", "biReportEvent ====== ");
        ApiClient apiClient = this.f11717c.get();
        if (apiClient == null || this.f11718d == null || HiAnalyticsUtil.getInstance().hasError(apiClient.getContext())) {
            HMSLog.m8725e("PendingResultImpl", "<biReportEvent> has some error.");
            return;
        }
        HashMap map = new HashMap();
        map.put("package", apiClient.getPackageName());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.13.0.301");
        if (i11 == 1) {
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        } else {
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
            map.put("result", String.valueOf(i10));
            R r10 = this.f11716b;
            if (r10 != null && r10.getStatus() != null) {
                map.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(this.f11716b.getStatus().getStatusCode()));
            }
        }
        map.put("version", "0");
        String appId = Util.getAppId(apiClient.getContext());
        if (TextUtils.isEmpty(appId) && (subAppInfo = apiClient.getSubAppInfo()) != null) {
            appId = subAppInfo.getSubAppID();
        }
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appId);
        if (TextUtils.isEmpty(this.f11719e)) {
            String id2 = TransactionIdCreater.getId(appId, this.f11718d);
            this.f11719e = id2;
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, id2);
        } else {
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, this.f11719e);
            this.f11719e = null;
        }
        String[] strArrSplit = this.f11718d.split("\\.");
        if (strArrSplit.length >= 2) {
            map.put("service", strArrSplit[0]);
            map.put("apiName", strArrSplit[1]);
        }
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onEvent(apiClient.getContext(), HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, map);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        HMSLog.m8727i("PendingResultImpl", "setResultCallback");
        if (looper == null) {
            looper = Looper.myLooper();
        }
        HandlerC7327d handlerC7327d = new HandlerC7327d(looper);
        WeakReference<ApiClient> weakReference = this.f11717c;
        if (weakReference == null) {
            HMSLog.m8725e("PendingResultImpl", "api is null");
            m8678c(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m8725e("PendingResultImpl", "client is invalid");
            m8678c(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            handlerC7327d.m8681a(resultCallback, this.f11716b);
        } else {
            if (this.f11720f) {
                m8677b(0, 1);
            }
            this.transport.post(apiClient, new C7326c(handlerC7327d, resultCallback));
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j10, TimeUnit timeUnit) {
        HMSLog.m8727i("PendingResultImpl", "await timeout:" + j10 + " unit:" + timeUnit.toString());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return (R) awaitOnAnyThread(j10, timeUnit);
        }
        HMSLog.m8727i("PendingResultImpl", "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    public PendingResultImpl(ApiClient apiClient, String str, InterfaceC7278e interfaceC7278e, Class<T> cls) {
        m8679d(apiClient, str, interfaceC7278e, cls, 0);
    }

    public PendingResultImpl(ApiClient apiClient, String str, InterfaceC7278e interfaceC7278e, int i10) {
        m8679d(apiClient, str, interfaceC7278e, getResponseType(), i10);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j10, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread(long j10, TimeUnit timeUnit) {
        HMSLog.m8727i("PendingResultImpl", "awaitOnAnyThread timeout:" + j10 + " unit:" + timeUnit.toString());
        WeakReference<ApiClient> weakReference = this.f11717c;
        if (weakReference == null) {
            HMSLog.m8725e("PendingResultImpl", "api is null");
            m8678c(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.f11716b;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m8725e("PendingResultImpl", "client invalid");
            m8678c(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.f11716b;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (this.f11720f) {
            m8677b(0, 1);
        }
        this.transport.post(apiClient, new C7325b(atomicBoolean));
        try {
            if (!this.f11715a.await(j10, timeUnit)) {
                atomicBoolean.set(true);
                m8678c(CommonCode.ErrorCode.EXECUTE_TIMEOUT, null);
            }
        } catch (InterruptedException unused) {
            HMSLog.m8725e("PendingResultImpl", "awaitOnAnyThread InterruptedException");
            m8678c(CommonCode.ErrorCode.INTERNAL_ERROR, null);
        }
        return this.f11716b;
    }
}
