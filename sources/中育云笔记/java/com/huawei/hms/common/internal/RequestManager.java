package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.InterfaceC7277d;
import com.huawei.hms.support.log.HMSLog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes5.dex */
public class RequestManager implements Handler.Callback {
    public static final int NOTIFY_CONNECT_FAILED = 10012;
    public static final int NOTIFY_CONNECT_SUCCESS = 10011;
    public static final int NOTIFY_CONNECT_SUSPENDED = 10013;

    /* renamed from: d */
    public static volatile RequestManager f11564d;

    /* renamed from: e */
    public static Handler f11565e;

    /* renamed from: c */
    public static final Object f11563c = new Object();

    /* renamed from: f */
    public static Queue f11566f = new ConcurrentLinkedQueue();

    /* renamed from: g */
    public static Map f11567g = new LinkedHashMap();

    public RequestManager(Looper looper) {
        f11565e = new Handler(looper, this);
    }

    public static void addRequestToQueue(HuaweiApi.RequestHandler requestHandler) {
        f11566f.add(requestHandler);
    }

    public static void addToConnectedReqMap(final String str, final HuaweiApi.RequestHandler requestHandler) {
        if (f11565e == null) {
            return;
        }
        HMSLog.m8727i("RequestManager", "addToConnectedReqMap");
        f11565e.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f11567g.put(str, requestHandler);
            }
        });
    }

    public static Handler getHandler() {
        return f11565e;
    }

    public static RequestManager getInstance() {
        synchronized (f11563c) {
            try {
                if (f11564d == null) {
                    HandlerThread handlerThread = new HandlerThread("RequestManager");
                    handlerThread.start();
                    f11564d = new RequestManager(handlerThread.getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f11564d;
    }

    public static void removeReqByTransId(final String str) {
        if (f11565e == null) {
            return;
        }
        HMSLog.m8727i("RequestManager", "removeReqByTransId");
        f11565e.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.2
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f11567g.remove(str);
            }
        });
    }

    /* renamed from: b */
    public final void m8486b(Message message) {
        HMSLog.m8727i("RequestManager", "NOTIFY_CONNECT_FAILED.");
        try {
            BaseHmsClient.ConnectionResultWrapper connectionResultWrapper = (BaseHmsClient.ConnectionResultWrapper) message.obj;
            HuaweiApi.RequestHandler request = connectionResultWrapper.getRequest();
            f11566f.remove(request);
            request.onConnectionFailed(connectionResultWrapper.getConnectionResult());
        } catch (RuntimeException e10) {
            HMSLog.m8725e("RequestManager", "<handleConnectFailed> handle Failed" + e10.getMessage());
        }
    }

    /* renamed from: c */
    public final void m8487c() {
        while (!f11566f.isEmpty()) {
            HuaweiApi.RequestHandler requestHandler = (HuaweiApi.RequestHandler) f11566f.poll();
            if (requestHandler != null) {
                Object client = requestHandler.getClient();
                if (client instanceof BaseHmsClient) {
                    BaseHmsClient baseHmsClient = (BaseHmsClient) client;
                    baseHmsClient.setService(InterfaceC7277d.a.m8519l(baseHmsClient.getAdapter().getServiceBinder()));
                    requestHandler.onConnected();
                }
            }
        }
    }

    /* renamed from: d */
    public final void m8488d() {
        HMSLog.m8727i("RequestManager", "NOTIFY_CONNECT_SUSPENDED.");
        while (!f11566f.isEmpty()) {
            ((HuaweiApi.RequestHandler) f11566f.poll()).onConnectionSuspended(1);
        }
        m8489e();
    }

    /* renamed from: e */
    public final void m8489e() {
        HMSLog.m8727i("RequestManager", "notifyRunningRequestConnectSuspend, connectedReqMap.size(): " + f11567g.size());
        Iterator it = f11567g.entrySet().iterator();
        while (it.hasNext()) {
            try {
                ((HuaweiApi.RequestHandler) ((Map.Entry) it.next()).getValue()).onConnectionSuspended(1);
            } catch (RuntimeException e10) {
                HMSLog.m8725e("RequestManager", "NOTIFY_CONNECT_SUSPENDED Exception: " + e10.getMessage());
            }
            it.remove();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        HMSLog.m8727i("RequestManager", "RequestManager handleMessage.");
        switch (message.what) {
            case NOTIFY_CONNECT_SUCCESS /* 10011 */:
                m8487c();
                break;
            case NOTIFY_CONNECT_FAILED /* 10012 */:
                m8486b(message);
                break;
            case NOTIFY_CONNECT_SUSPENDED /* 10013 */:
                m8488d();
                break;
            default:
                HMSLog.m8727i("RequestManager", "handleMessage unknown msg:" + message.what);
                break;
        }
        return false;
    }
}
