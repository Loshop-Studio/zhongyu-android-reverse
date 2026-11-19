package anetwork.channel.unified;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C4983a;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.Connection;
import anetwork.channel.aidl.NetworkResponse;
import anetwork.channel.aidl.ParcelableFuture;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.aidl.ParcelableNetworkListener;
import anetwork.channel.aidl.ParcelableRequest;
import anetwork.channel.aidl.RemoteNetwork;
import anetwork.channel.aidl.adapter.ConnectionDelegate;
import anetwork.channel.aidl.adapter.ParcelableFutureResponse;
import anetwork.channel.aidl.adapter.ParcelableNetworkListenerWrapper;
import anetwork.channel.entity.C5117c;
import anetwork.channel.entity.C5121g;
import anetwork.channel.http.NetworkSdkSetting;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public abstract class UnifiedNetworkDelegate extends RemoteNetwork.Stub {
    public static final int DEGRADABLE = 1;
    public static final int HTTP = 0;
    private static final String TAG = "anet.UnifiedNetworkDelegate";
    public int type = 1;

    public UnifiedNetworkDelegate(Context context) {
        NetworkSdkSetting.init(context);
    }

    private NetworkResponse convertToSync(ParcelableRequest parcelableRequest) {
        NetworkResponse networkResponse = new NetworkResponse();
        try {
            ConnectionDelegate connectionDelegate = (ConnectionDelegate) getConnection(parcelableRequest);
            ParcelableInputStream inputStream = connectionDelegate.getInputStream();
            if (inputStream != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.length() > 0 ? inputStream.length() : 1024);
                ByteArray byteArrayM2275a = C4983a.a.f2350a.m2275a(2048);
                while (true) {
                    int i10 = inputStream.read(byteArrayM2275a.getBuffer());
                    if (i10 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(byteArrayM2275a.getBuffer(), 0, i10);
                }
                networkResponse.setBytedata(byteArrayOutputStream.toByteArray());
            }
            int statusCode = connectionDelegate.getStatusCode();
            if (statusCode < 0) {
                networkResponse.setBytedata(null);
            } else {
                networkResponse.setConnHeadFields(connectionDelegate.getConnHeadFields());
            }
            networkResponse.setStatusCode(statusCode);
            networkResponse.setStatisticData(connectionDelegate.getStatisticData());
            return networkResponse;
        } catch (RemoteException e10) {
            networkResponse.setStatusCode(-103);
            String message = e10.getMessage();
            if (!TextUtils.isEmpty(message)) {
                networkResponse.setDesc(StringUtils.concatString(networkResponse.getDesc(), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, message));
            }
            return networkResponse;
        } catch (Exception unused) {
            networkResponse.setStatusCode(ErrorConstant.ERROR_REQUEST_FAIL);
            return networkResponse;
        }
    }

    @Override // anetwork.channel.aidl.RemoteNetwork
    public ParcelableFuture asyncSend(ParcelableRequest parcelableRequest, ParcelableNetworkListener parcelableNetworkListener) throws RemoteException {
        try {
            return asyncSend(new C5121g(parcelableRequest, this.type, false), parcelableNetworkListener);
        } catch (Exception e10) {
            ALog.m2528e(TAG, "asyncSend failed", parcelableRequest.seqNo, e10, new Object[0]);
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // anetwork.channel.aidl.RemoteNetwork
    public Connection getConnection(ParcelableRequest parcelableRequest) throws RemoteException {
        try {
            C5121g c5121g = new C5121g(parcelableRequest, this.type, true);
            ConnectionDelegate connectionDelegate = new ConnectionDelegate(c5121g);
            connectionDelegate.setFuture(asyncSend(c5121g, new ParcelableNetworkListenerWrapper(connectionDelegate, null, null)));
            return connectionDelegate;
        } catch (Exception e10) {
            ALog.m2528e(TAG, "asyncSend failed", parcelableRequest.seqNo, e10, new Object[0]);
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // anetwork.channel.aidl.RemoteNetwork
    public NetworkResponse syncSend(ParcelableRequest parcelableRequest) {
        return convertToSync(parcelableRequest);
    }

    private ParcelableFuture asyncSend(C5121g c5121g, ParcelableNetworkListener parcelableNetworkListener) {
        return new ParcelableFutureResponse(new C5133k(c5121g, new C5117c(parcelableNetworkListener, c5121g)).m2652a());
    }
}
