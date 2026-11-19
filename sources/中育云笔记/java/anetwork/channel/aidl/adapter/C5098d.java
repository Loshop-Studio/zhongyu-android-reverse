package anetwork.channel.aidl.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkRequest;
import anet.channel.util.ALog;
import anetwork.channel.aidl.IRemoteNetworkGetter;
import anetwork.channel.aidl.NetworkService;
import anetwork.channel.config.NetworkConfigCenter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: anetwork.channel.aidl.adapter.d */
/* loaded from: classes3.dex */
public class C5098d {

    /* renamed from: a */
    static volatile IRemoteNetworkGetter f2803a = null;

    /* renamed from: b */
    static volatile boolean f2804b = false;

    /* renamed from: c */
    static volatile boolean f2805c = false;

    /* renamed from: d */
    static volatile CountDownLatch f2806d;

    /* renamed from: e */
    static Handler f2807e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private static ServiceConnection f2808f = new ServiceConnectionC5099e();

    /* renamed from: a */
    public static void m2565a(Context context, boolean z10) {
        if (f2803a == null && !f2804b) {
            m2564a(context);
            if (f2804b || !z10) {
                return;
            }
            try {
                synchronized (C5098d.class) {
                    try {
                        if (f2803a != null) {
                            return;
                        }
                        if (f2806d == null) {
                            f2806d = new CountDownLatch(1);
                        }
                        ALog.m2530i("anet.RemoteGetter", "[initRemoteGetterAndWait]begin to wait", null, new Object[0]);
                        if (f2806d.await(NetworkConfigCenter.getServiceBindWaitTime(), TimeUnit.SECONDS)) {
                            ALog.m2530i("anet.RemoteGetter", "mServiceBindLock count down to 0", null, new Object[0]);
                        } else {
                            ALog.m2530i("anet.RemoteGetter", "mServiceBindLock wait timeout", null, new Object[0]);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException unused) {
                ALog.m2529e("anet.RemoteGetter", "mServiceBindLock wait interrupt", null, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static IRemoteNetworkGetter m2563a() {
        return f2803a;
    }

    /* renamed from: a */
    private static void m2564a(Context context) {
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("anet.RemoteGetter", "[asyncBindService] mContext:" + context + " bBindFailed:" + f2804b + " bBinding:" + f2805c, null, new Object[0]);
        }
        if (context == null || f2804b || f2805c) {
            return;
        }
        f2805c = true;
        Intent intent = new Intent(context, (Class<?>) NetworkService.class);
        intent.setAction(IRemoteNetworkGetter.class.getName());
        intent.addCategory("android.intent.category.DEFAULT");
        f2804b = !context.bindService(intent, f2808f, 1);
        if (f2804b) {
            f2805c = false;
            ALog.m2529e("anet.RemoteGetter", "[asyncBindService]ANet_Service start not success. ANet run with local mode!", null, new Object[0]);
        }
        f2807e.postDelayed(new RunnableC5100f(), WorkRequest.MIN_BACKOFF_MILLIS);
    }
}
