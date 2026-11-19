package anetwork.channel.aidl.adapter;

import android.os.Handler;
import anet.channel.util.ALog;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkListener;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.DefaultProgressEvent;
import anetwork.channel.aidl.ParcelableHeader;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.aidl.ParcelableNetworkListener;

/* loaded from: classes3.dex */
public class ParcelableNetworkListenerWrapper extends ParcelableNetworkListener.Stub {
    private static final String TAG = "anet.ParcelableNetworkListenerWrapper";
    private Handler handler;
    private NetworkListener listener;
    private Object mContext;
    private byte state;

    public ParcelableNetworkListenerWrapper(NetworkListener networkListener, Handler handler, Object obj) {
        this.state = (byte) 0;
        this.listener = networkListener;
        if (networkListener != null) {
            if (NetworkCallBack.FinishListener.class.isAssignableFrom(networkListener.getClass())) {
                this.state = (byte) (this.state | 1);
            }
            if (NetworkCallBack.ProgressListener.class.isAssignableFrom(networkListener.getClass())) {
                this.state = (byte) (this.state | 2);
            }
            if (NetworkCallBack.ResponseCodeListener.class.isAssignableFrom(networkListener.getClass())) {
                this.state = (byte) (this.state | 4);
            }
            if (NetworkCallBack.InputStreamListener.class.isAssignableFrom(networkListener.getClass())) {
                this.state = (byte) (this.state | 8);
            }
        }
        this.handler = handler;
        this.mContext = obj;
    }

    private void dispatch(byte b10, Object obj) {
        Handler handler = this.handler;
        if (handler == null) {
            dispatchCallback(b10, obj);
        } else {
            handler.post(new RunnableC5097c(this, b10, obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCallback(byte b10, Object obj) {
        try {
            if (b10 == 4) {
                ParcelableHeader parcelableHeader = (ParcelableHeader) obj;
                ((NetworkCallBack.ResponseCodeListener) this.listener).onResponseCode(parcelableHeader.getResponseCode(), parcelableHeader.getHeader(), this.mContext);
                if (ALog.isPrintLog(1)) {
                    ALog.m2527d(TAG, "[onResponseCode]" + parcelableHeader, null, new Object[0]);
                    return;
                }
                return;
            }
            if (b10 == 2) {
                DefaultProgressEvent defaultProgressEvent = (DefaultProgressEvent) obj;
                if (defaultProgressEvent != null) {
                    defaultProgressEvent.setContext(this.mContext);
                }
                ((NetworkCallBack.ProgressListener) this.listener).onDataReceived(defaultProgressEvent, this.mContext);
                if (ALog.isPrintLog(1)) {
                    ALog.m2527d(TAG, "[onDataReceived]" + defaultProgressEvent, null, new Object[0]);
                    return;
                }
                return;
            }
            if (b10 != 1) {
                if (b10 == 8) {
                    ((NetworkCallBack.InputStreamListener) this.listener).onInputStreamGet((ParcelableInputStream) obj, this.mContext);
                    if (ALog.isPrintLog(1)) {
                        ALog.m2527d(TAG, "[onInputStreamReceived]", null, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            }
            DefaultFinishEvent defaultFinishEvent = (DefaultFinishEvent) obj;
            if (defaultFinishEvent != null) {
                defaultFinishEvent.setContext(this.mContext);
            }
            ((NetworkCallBack.FinishListener) this.listener).onFinished(defaultFinishEvent, this.mContext);
            if (ALog.isPrintLog(1)) {
                ALog.m2527d(TAG, "[onFinished]" + defaultFinishEvent, null, new Object[0]);
            }
        } catch (Exception unused) {
            ALog.m2529e(TAG, "dispatchCallback error", null, new Object[0]);
        }
    }

    public NetworkListener getListener() {
        return this.listener;
    }

    @Override // anetwork.channel.aidl.ParcelableNetworkListener
    public byte getListenerState() {
        return this.state;
    }

    @Override // anetwork.channel.aidl.ParcelableNetworkListener
    public void onDataReceived(DefaultProgressEvent defaultProgressEvent) {
        if ((this.state & 2) != 0) {
            dispatch((byte) 2, defaultProgressEvent);
        }
    }

    @Override // anetwork.channel.aidl.ParcelableNetworkListener
    public void onFinished(DefaultFinishEvent defaultFinishEvent) {
        if ((this.state & 1) != 0) {
            dispatch((byte) 1, defaultFinishEvent);
        }
        this.listener = null;
        this.mContext = null;
        this.handler = null;
    }

    @Override // anetwork.channel.aidl.ParcelableNetworkListener
    public void onInputStreamGet(ParcelableInputStream parcelableInputStream) {
        if ((this.state & 8) != 0) {
            dispatch((byte) 8, parcelableInputStream);
        }
    }

    @Override // anetwork.channel.aidl.ParcelableNetworkListener
    public boolean onResponseCode(int i10, ParcelableHeader parcelableHeader) {
        if ((this.state & 4) == 0) {
            return false;
        }
        dispatch((byte) 4, parcelableHeader);
        return false;
    }
}
