package anetwork.channel.aidl.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.fulltrace.C0893a;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.util.ALog;
import anetwork.channel.Network;
import anetwork.channel.NetworkListener;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.aidl.Connection;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.IRemoteNetworkGetter;
import anetwork.channel.aidl.NetworkResponse;
import anetwork.channel.aidl.ParcelableRequest;
import anetwork.channel.aidl.RemoteNetwork;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.degrade.DegradableNetworkDelegate;
import anetwork.channel.http.HttpNetworkDelegate;
import anetwork.channel.util.RequestConstant;
import java.util.concurrent.Future;

/* renamed from: anetwork.channel.aidl.adapter.b */
/* loaded from: classes.dex */
public class C0973b implements Network {
    protected static final int DEGRADE = 1;
    protected static final int HTTP = 0;
    protected static String TAG = "anet.NetworkProxy";
    private Context mContext;
    private volatile RemoteNetwork mDelegate = null;
    private int mType;

    public C0973b(Context context, int i4) {
        this.mContext = context;
        this.mType = i4;
    }

    private void initDelegateInstance(boolean z3) {
        if (this.mDelegate != null) {
            return;
        }
        if (NetworkConfigCenter.isRemoteNetworkServiceEnable()) {
            boolean zIsTargetProcess = GlobalAppRuntimeInfo.isTargetProcess();
            if (NetworkConfigCenter.isBindServiceOptimize() && zIsTargetProcess) {
                C0975d.m4674a(this.mContext, false);
                if (C0975d.f5527c && this.mDelegate == null) {
                    this.mDelegate = this.mType == 1 ? new DegradableNetworkDelegate(this.mContext) : new HttpNetworkDelegate(this.mContext);
                    ALog.m4639i(TAG, "[initDelegateInstance] getNetworkInstance when binding service", null, new Object[0]);
                    return;
                } else {
                    tryGetRemoteNetworkInstance(this.mType);
                    if (this.mDelegate != null) {
                        return;
                    }
                }
            } else {
                C0975d.m4674a(this.mContext, z3);
                tryGetRemoteNetworkInstance(this.mType);
                if (this.mDelegate != null) {
                    return;
                }
            }
            if (NetworkConfigCenter.isAllowSpdyWhenBindServiceFailed() && zIsTargetProcess && C0975d.f5526b) {
                synchronized (this) {
                    if (this.mDelegate == null) {
                        this.mDelegate = this.mType == 1 ? new DegradableNetworkDelegate(this.mContext) : new HttpNetworkDelegate(this.mContext);
                        ALog.m4638e(TAG, "[initDelegateInstance] getNetworkInstance when bindService failed.", null, new Object[0]);
                        return;
                    }
                }
            }
        }
        synchronized (this) {
            if (this.mDelegate == null) {
                if (ALog.isPrintLog(2)) {
                    ALog.m4639i(TAG, "[getLocalNetworkInstance]", null, new Object[0]);
                }
                this.mDelegate = new HttpNetworkDelegate(this.mContext);
            }
        }
    }

    private void recordRequestStat(Request request) {
        if (request == null) {
            return;
        }
        request.setExtProperty(RequestConstant.KEY_REQ_START, String.valueOf(System.currentTimeMillis()));
        String extProperty = request.getExtProperty(RequestConstant.KEY_TRACE_ID);
        if (TextUtils.isEmpty(extProperty)) {
            extProperty = C0893a.m4454a().createRequest();
        }
        request.setExtProperty(RequestConstant.KEY_TRACE_ID, extProperty);
        request.setExtProperty(RequestConstant.KEY_REQ_PROCESS, GlobalAppRuntimeInfo.getCurrentProcess());
    }

    private void reportRemoteError(Throwable th, String str) {
        ALog.m4637e(TAG, null, str, th, new Object[0]);
        ExceptionStatistic exceptionStatistic = new ExceptionStatistic(-103, null, "rt");
        exceptionStatistic.exceptionStack = th.toString();
        AppMonitor.getInstance().commitStat(exceptionStatistic);
    }

    private synchronized void tryGetRemoteNetworkInstance(int i4) {
        if (this.mDelegate != null) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.m4639i(TAG, "[tryGetRemoteNetworkInstance] type=" + i4, null, new Object[0]);
        }
        IRemoteNetworkGetter iRemoteNetworkGetterM4672a = C0975d.m4672a();
        if (iRemoteNetworkGetterM4672a != null) {
            try {
                this.mDelegate = iRemoteNetworkGetterM4672a.get(i4);
            } catch (Throwable th) {
                reportRemoteError(th, "[tryGetRemoteNetworkInstance]get RemoteNetwork Delegate failed.");
            }
        }
    }

    @Override // anetwork.channel.Network
    public Future<Response> asyncSend(Request request, Object obj, Handler handler, NetworkListener networkListener) {
        ALog.m4639i(TAG, "networkProxy asyncSend", request.getSeqNo(), new Object[0]);
        recordRequestStat(request);
        initDelegateInstance(Looper.myLooper() != Looper.getMainLooper());
        ParcelableRequest parcelableRequest = new ParcelableRequest(request);
        ParcelableNetworkListenerWrapper parcelableNetworkListenerWrapper = (networkListener == null && handler == null) ? null : new ParcelableNetworkListenerWrapper(networkListener, handler, obj);
        if (parcelableRequest.url == null) {
            if (parcelableNetworkListenerWrapper != null) {
                try {
                    parcelableNetworkListenerWrapper.onFinished(new DefaultFinishEvent(-102));
                } catch (RemoteException unused) {
                }
            }
            return new FutureC0972a(new NetworkResponse(-102));
        }
        try {
            return new FutureC0972a(this.mDelegate.asyncSend(parcelableRequest, parcelableNetworkListenerWrapper));
        } catch (Throwable th) {
            if (parcelableNetworkListenerWrapper != null) {
                try {
                    parcelableNetworkListenerWrapper.onFinished(new DefaultFinishEvent(-102));
                } catch (RemoteException unused2) {
                }
            }
            reportRemoteError(th, "[asyncSend]call asyncSend exception");
            return new FutureC0972a(new NetworkResponse(-103));
        }
    }

    @Override // anetwork.channel.Network
    public Connection getConnection(Request request, Object obj) {
        ALog.m4639i(TAG, "networkProxy getConnection", request.getSeqNo(), new Object[0]);
        recordRequestStat(request);
        initDelegateInstance(true);
        ParcelableRequest parcelableRequest = new ParcelableRequest(request);
        if (parcelableRequest.url == null) {
            return new ConnectionDelegate(-102);
        }
        try {
            return this.mDelegate.getConnection(parcelableRequest);
        } catch (Throwable th) {
            reportRemoteError(th, "[getConnection]call getConnection method failed.");
            return new ConnectionDelegate(-103);
        }
    }

    @Override // anetwork.channel.Network
    public Response syncSend(Request request, Object obj) {
        ALog.m4639i(TAG, "networkProxy syncSend", request.getSeqNo(), new Object[0]);
        recordRequestStat(request);
        initDelegateInstance(true);
        ParcelableRequest parcelableRequest = new ParcelableRequest(request);
        if (parcelableRequest.url == null) {
            return new NetworkResponse(-102);
        }
        try {
            return this.mDelegate.syncSend(parcelableRequest);
        } catch (Throwable th) {
            reportRemoteError(th, "[syncSend]call syncSend method failed.");
            return new NetworkResponse(-103);
        }
    }
}
