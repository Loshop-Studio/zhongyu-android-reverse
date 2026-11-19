package anetwork.channel.aidl.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import anet.channel.util.ALog;
import anetwork.channel.aidl.IRemoteNetworkGetter;
import anetwork.channel.aidl.NetworkService;
import anetwork.channel.config.NetworkConfigCenter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: anetwork.channel.aidl.adapter.d */
/* loaded from: classes.dex */
public class C0975d {

    /* renamed from: a */
    static volatile IRemoteNetworkGetter f5525a = null;

    /* renamed from: b */
    static volatile boolean f5526b = false;

    /* renamed from: c */
    static volatile boolean f5527c = false;

    /* renamed from: d */
    static volatile CountDownLatch f5528d;

    /* renamed from: e */
    static Handler f5529e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private static ServiceConnection f5530f = new ServiceConnectionC0976e();

    /* renamed from: a */
    public static void m4674a(Context context, boolean z3) {
        if (f5525a == null && !f5526b) {
            m4673a(context);
            if (f5526b || !z3) {
                return;
            }
            try {
                synchronized (C0975d.class) {
                    if (f5525a != null) {
                        return;
                    }
                    if (f5528d == null) {
                        f5528d = new CountDownLatch(1);
                    }
                    ALog.m4639i("anet.RemoteGetter", "[initRemoteGetterAndWait]begin to wait", null, new Object[0]);
                    if (f5528d.await(NetworkConfigCenter.getServiceBindWaitTime(), TimeUnit.SECONDS)) {
                        ALog.m4639i("anet.RemoteGetter", "mServiceBindLock count down to 0", null, new Object[0]);
                    } else {
                        ALog.m4639i("anet.RemoteGetter", "mServiceBindLock wait timeout", null, new Object[0]);
                    }
                }
            } catch (InterruptedException unused) {
                ALog.m4638e("anet.RemoteGetter", "mServiceBindLock wait interrupt", null, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static IRemoteNetworkGetter m4672a() {
        return f5525a;
    }

    /* renamed from: a */
    private static void m4673a(Context context) {
        if (ALog.isPrintLog(2)) {
            ALog.m4639i("anet.RemoteGetter", "[asyncBindService] mContext:" + context + " bBindFailed:" + f5526b + " bBinding:" + f5527c, null, new Object[0]);
        }
        if (context == null || f5526b || f5527c) {
            return;
        }
        f5527c = true;
        Intent intent = new Intent(context, (Class<?>) NetworkService.class);
        intent.setAction(IRemoteNetworkGetter.class.getName());
        intent.addCategory("android.intent.category.DEFAULT");
        f5526b = !context.bindService(intent, f5530f, 1);
        if (f5526b) {
            f5527c = false;
            ALog.m4638e("anet.RemoteGetter", "[asyncBindService]ANet_Service start not success. ANet run with local mode!", null, new Object[0]);
        }
        f5529e.postDelayed(new RunnableC0977f(), 10000L);
    }
}
