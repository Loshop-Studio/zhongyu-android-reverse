package com.taobao.accs;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import anet.channel.util.ALog;
import anetwork.channel.util.RequestConstant;
import com.alibaba.sdk.android.logger.ILog;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.AccsLogger;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.C7677c;
import com.taobao.accs.utl.C7683i;
import com.taobao.accs.utl.C7685k;
import com.taobao.accs.utl.C7686l;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.Utils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class ACCSClient {
    private static final ILog DEFAULT_LOG = AccsLogger.getLogger("ACCSClient");
    public static Map<String, ACCSClient> mACCSClients = new ConcurrentHashMap(2);
    private static Context sContext;
    protected IACCSManager mAccsManager;
    private AccsClientConfig mConfig;
    private final HashSet<ConnectionListener> mListeners = new HashSet<>();
    private final ILog mLog;

    public ACCSClient(AccsClientConfig accsClientConfig) {
        this.mConfig = accsClientConfig;
        this.mLog = AccsLogger.getLogger("ACCSClient" + accsClientConfig.getTag());
        this.mAccsManager = ACCSManager.getAccsInstance(sContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
    }

    public static void changeNetworkSdkLoggerToAccs() {
        DEFAULT_LOG.mo3533d("changeNetworkSdkLoggerToAccs");
        ALog.setLog(new C7685k(new C7686l(), C7683i.m10179a()));
    }

    @Deprecated
    public static void enableChannelProcess(Context context, boolean z10) {
        UtilityImpl.m10136a(context, z10);
    }

    @Deprecated
    public static void enableChannelProcessHeartbeat(Context context, boolean z10) {
    }

    public static synchronized ACCSClient getAccsClient(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = AccsClientConfig.DEFAULT_CONFIG_TAG;
                DEFAULT_LOG.mo3540w("getAccsClient with null tag, use default");
            }
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            if (configByTag == null) {
                DEFAULT_LOG.mo3537e("getAccsClient with null config, please init config first", Constants.KEY_CONFIG_TAG, str);
                throw new AccsException("configTag not exist");
            }
            ACCSClient aCCSClient = mACCSClients.get(str);
            if (aCCSClient != null) {
                if (!configByTag.equals(aCCSClient.mConfig)) {
                    DEFAULT_LOG.mo3542w("getAccsClient update config", "old", aCCSClient.mConfig, "new", configByTag);
                    aCCSClient.updateConfig(configByTag);
                }
                return aCCSClient;
            }
            DEFAULT_LOG.mo3533d("getAccsClient create client");
            ACCSClient aCCSClient2 = new ACCSClient(configByTag);
            mACCSClients.put(str, aCCSClient2);
            aCCSClient2.updateConfig(configByTag);
            return aCCSClient2;
        } finally {
        }
    }

    public static synchronized String init(Context context, AccsClientConfig accsClientConfig) {
        if (context == null || accsClientConfig == null) {
            DEFAULT_LOG.mo3537e("init AccsClient params error", "context", context, "config", accsClientConfig);
            throw new AccsException("init AccsClient params error");
        }
        GlobalClientInfo.getInstance(context);
        sContext = context.getApplicationContext();
        setCurrentProcessName(context);
        DEFAULT_LOG.mo3534d("init", "config", accsClientConfig);
        AccsState.getInstance().m9841a(AccsState.SDK_VERSION, "4.8.5-emas");
        changeNetworkSdkLoggerToAccs();
        try {
            AwcnConfig.setAccsSessionCreateForbiddenInBg(false);
        } catch (Throwable unused) {
        }
        return accsClientConfig.getTag();
    }

    public static void setCurrentProcessName(Context context) {
        try {
            GlobalAppRuntimeInfo.setCurrentProcess(AdapterUtilityImpl.getProcessName(context.getApplicationContext()));
        } catch (Throwable th) {
            DEFAULT_LOG.mo3536e("setCurrentProcess", th);
        }
        try {
            GlobalAppRuntimeInfo.setTargetProcess(AdapterUtilityImpl.getTargetProcess(context.getApplicationContext()));
        } catch (Throwable th2) {
            DEFAULT_LOG.mo3536e("setCurrentProcess", th2);
        }
    }

    public static synchronized void setEnvironment(Context context, @AccsClientConfig.ENV int i10) {
        if (i10 < 0 || i10 > 2) {
            try {
                DEFAULT_LOG.mo3542w("env invalid, reset to release", "env", Integer.valueOf(i10));
                i10 = 0;
            } finally {
                try {
                } finally {
                }
            }
        }
        int i11 = AccsClientConfig.mEnv;
        AccsClientConfig.mEnv = i10;
        if (i11 != i10 && AdapterUtilityImpl.isTargetProcess(context)) {
            DEFAULT_LOG.mo3539i("setEnvironment", RequestConstant.ENV_PRE, Integer.valueOf(i11), TypedValues.TransitionType.S_TO, Integer.valueOf(i10));
            Utils.clearAllSharePreferences(context);
            Utils.clearAgooBindCache(context);
            Utils.killService(context);
            if (i10 == 2) {
                SessionCenter.switchEnvironment(ENV.TEST);
            } else if (i10 == 1) {
                SessionCenter.switchEnvironment(ENV.PREPARE);
            }
            Iterator<Map.Entry<String, ACCSClient>> it = mACCSClients.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    getAccsClient(it.next().getKey());
                } catch (AccsException e10) {
                    DEFAULT_LOG.mo3536e("setEnvironment update client", e10);
                }
            }
        }
    }

    private void updateConfig(AccsClientConfig accsClientConfig) {
        this.mConfig = accsClientConfig;
        IACCSManager accsInstance = ACCSManager.getAccsInstance(sContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
        this.mAccsManager = accsInstance;
        if (accsInstance != null) {
            accsInstance.updateConfig(accsClientConfig);
        }
    }

    public void addConnectionListener(ConnectionListener connectionListener) {
        if (connectionListener != null) {
            this.mListeners.add(connectionListener);
        }
    }

    public void bindApp(String str, IAppReceiver iAppReceiver) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            iACCSManager.bindApp(sContext, this.mConfig.getAppKey(), this.mConfig.getAppSecret(), str, iAppReceiver);
        } else {
            this.mLog.mo3535e("bindApp mAccsManager null");
            C7677c.m10166a(AccsErrorCode.ERROR_SHOULD_NEVER_HAPPEN.copy().detail("bindApp accs is null").build(), iAppReceiver, null);
        }
    }

    public void bindService(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("bindService mAccsManager null");
        } else {
            iACCSManager.bindService(sContext, str);
        }
    }

    public void bindUser(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("bindUser mAccsManager null");
        } else {
            iACCSManager.bindUser(sContext, str);
        }
    }

    public boolean cancel(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.cancel(sContext, str);
        }
        this.mLog.mo3535e("cancel mAccsManager null");
        return false;
    }

    public void cleanLocalBindInfo() {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("cleanLocalBindInfo mAccsManager null");
        } else {
            iACCSManager.cleanLocalBindInfo();
        }
    }

    public void clearLoginInfo() {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("clearLoginInfo mAccsManager null");
        } else {
            iACCSManager.clearLoginInfo(sContext);
        }
    }

    public void disconnect() {
        this.mAccsManager.disconnect();
    }

    public Map<String, Boolean> forceReConnectChannel() {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.forceReConnectChannel();
        }
        this.mLog.mo3535e("forceReConnectChannel mAccsManager null");
        return null;
    }

    public Map<String, Boolean> getChannelState() {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.getChannelState();
        }
        this.mLog.mo3535e("getChannelState mAccsManager null");
        return null;
    }

    public List<ConnectionListener> getConnectionListeners() {
        return new ArrayList(this.mListeners);
    }

    public int getLastConnectErrorCode() {
        return this.mAccsManager.getLastConnectErrorCode();
    }

    public boolean isChannelError(int i10) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.isChannelError(i10);
        }
        this.mLog.mo3535e("isChannelError mAccsManager null");
        return true;
    }

    public boolean isConnected() {
        return this.mAccsManager.isConnected();
    }

    public boolean isNetworkReachable() {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.isNetworkReachable(sContext);
        }
        this.mLog.mo3535e("isNetworkReachable mAccsManager null");
        return false;
    }

    public void reconnect() {
        this.mAccsManager.reconnect();
    }

    public void registerDataListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("registerDataListener mAccsManager null");
        } else {
            iACCSManager.registerDataListener(sContext, str, accsAbstractDataListener);
        }
    }

    public void registerService(String str, String str2) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("registerService mAccsManager null");
        } else {
            iACCSManager.registerService(sContext, str, str2);
        }
    }

    public void removeConnectionListener(ConnectionListener connectionListener) {
        if (connectionListener != null) {
            this.mListeners.remove(connectionListener);
        }
    }

    public void reset() {
        this.mAccsManager.reset();
    }

    public void sendBusinessAck(String str, String str2, String str3, short s10, String str4, Map<Integer, String> map) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("sendBusinessAck mAccsManager null");
        } else {
            iACCSManager.sendBusinessAck(str, str2, str3, s10, str4, map);
        }
    }

    public String sendData(ACCSManager.AccsRequest accsRequest) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.sendData(sContext, accsRequest);
        }
        this.mLog.mo3535e("sendData mAccsManager null");
        return null;
    }

    public String sendPushResponse(ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.sendPushResponse(sContext, accsRequest, extraInfo);
        }
        this.mLog.mo3535e("sendPushResponse mAccsManager null");
        return null;
    }

    public String sendRequest(ACCSManager.AccsRequest accsRequest) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.sendRequest(sContext, accsRequest);
        }
        this.mLog.mo3535e("sendRequest mAccsManager null");
        return null;
    }

    public void setLoginInfo(ILoginInfo iLoginInfo) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("setLoginInfo mAccsManager null");
        } else {
            iACCSManager.setLoginInfo(sContext, iLoginInfo);
        }
    }

    public void startInAppConnection(String str, IAppReceiver iAppReceiver) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("startInAppConnection mAccsManager null");
        } else {
            iACCSManager.startInAppConnection(sContext, this.mConfig.getAppKey(), this.mConfig.getAppSecret(), str, iAppReceiver);
        }
    }

    public void unRegisterDataListener(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("unRegisterDataListener mAccsManager null");
        } else {
            iACCSManager.unRegisterDataListener(sContext, str);
        }
    }

    public void unRegisterService(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("unRegisterService mAccsManager null");
        } else {
            iACCSManager.unRegisterService(sContext, str);
        }
    }

    public void unbindService(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("unbindService mAccsManager null");
        } else {
            iACCSManager.unbindService(sContext, str);
        }
    }

    public void unbindUser() {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("unbindUser mAccsManager null");
        } else {
            iACCSManager.unbindUser(sContext);
        }
    }

    public void bindUser(String str, boolean z10) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo3535e("bindUser mAccsManager null");
        } else {
            iACCSManager.bindUser(sContext, str, z10);
        }
    }
}
