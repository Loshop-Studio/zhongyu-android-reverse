package com.taobao.accs;

import android.content.Context;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import java.net.URL;
import java.util.Map;

/* loaded from: classes5.dex */
public interface IACCSManager {
    void bindApp(Context context, String str, String str2, IAppReceiver iAppReceiver);

    void bindApp(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver);

    void bindService(Context context, String str);

    void bindUser(Context context, String str);

    void bindUser(Context context, String str, boolean z10);

    boolean cancel(Context context, String str);

    void cleanLocalBindInfo();

    void clearLoginInfo(Context context);

    void disconnect();

    void forceDisableService(Context context);

    void forceEnableService(Context context);

    Map<String, Boolean> forceReConnectChannel();

    Map<String, Boolean> getChannelState();

    int getLastConnectErrorCode();

    String getUserUnit();

    boolean isChannelError(int i10);

    boolean isConnected();

    boolean isNetworkReachable(Context context);

    void reconnect();

    void registerDataListener(Context context, String str, AccsAbstractDataListener accsAbstractDataListener);

    void registerService(Context context, String str, String str2);

    void reset();

    void sendBusinessAck(String str, String str2, String str3, short s10, String str4, Map<Integer, String> map);

    String sendData(Context context, ACCSManager.AccsRequest accsRequest);

    String sendData(Context context, String str, String str2, byte[] bArr, String str3);

    String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4);

    String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url);

    String sendPushResponse(Context context, ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo);

    String sendRequest(Context context, ACCSManager.AccsRequest accsRequest);

    String sendRequest(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z10);

    String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4);

    String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url);

    void setLoginInfo(Context context, ILoginInfo iLoginInfo);

    @Deprecated
    void setMode(Context context, int i10);

    void setProxy(Context context, String str, int i10);

    void startInAppConnection(Context context, String str, String str2, IAppReceiver iAppReceiver);

    void startInAppConnection(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver);

    void unRegisterDataListener(Context context, String str);

    void unRegisterService(Context context, String str);

    void unbindApp(Context context);

    void unbindService(Context context, String str);

    void unbindUser(Context context);

    void updateConfig(AccsClientConfig accsClientConfig);
}
