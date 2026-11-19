package com.taobao.accs;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
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
import com.taobao.accs.utl.C1780c;
import com.taobao.accs.utl.C1786i;
import com.taobao.accs.utl.C1788k;
import com.taobao.accs.utl.C1789l;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.Utils;
import com.umeng.analytics.pro.C1896c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
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
        DEFAULT_LOG.mo5083d("changeNetworkSdkLoggerToAccs");
        ALog.setLog(new C1788k(new C1789l(), C1786i.m6153a()));
    }

    @Deprecated
    public static void enableChannelProcess(Context context, boolean z3) {
        UtilityImpl.m6110a(context, z3);
    }

    @Deprecated
    public static void enableChannelProcessHeartbeat(Context context, boolean z3) {
    }

    public static synchronized ACCSClient getAccsClient(String str) throws AccsException {
        if (TextUtils.isEmpty(str)) {
            str = AccsClientConfig.DEFAULT_CONFIG_TAG;
            DEFAULT_LOG.mo5090w("getAccsClient with null tag, use default");
        }
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag == null) {
            DEFAULT_LOG.mo5087e("getAccsClient with null config, please init config first", Constants.KEY_CONFIG_TAG, str);
            throw new AccsException("configTag not exist");
        }
        ACCSClient aCCSClient = mACCSClients.get(str);
        if (aCCSClient != null) {
            if (!configByTag.equals(aCCSClient.mConfig)) {
                DEFAULT_LOG.mo5092w("getAccsClient update config", "old", aCCSClient.mConfig, "new", configByTag);
                aCCSClient.updateConfig(configByTag);
            }
            return aCCSClient;
        }
        DEFAULT_LOG.mo5083d("getAccsClient create client");
        ACCSClient aCCSClient2 = new ACCSClient(configByTag);
        mACCSClients.put(str, aCCSClient2);
        aCCSClient2.updateConfig(configByTag);
        return aCCSClient2;
    }

    public static synchronized String init(Context context, AccsClientConfig accsClientConfig) throws AccsException {
        if (context == null || accsClientConfig == null) {
            DEFAULT_LOG.mo5087e("init AccsClient params error", C1896c.f8557R, context, "config", accsClientConfig);
            throw new AccsException("init AccsClient params error");
        }
        GlobalClientInfo.getInstance(context);
        sContext = context.getApplicationContext();
        setCurrentProcessName(context);
        DEFAULT_LOG.mo5084d("init", "config", accsClientConfig);
        AccsState.getInstance().m5815a(AccsState.SDK_VERSION, "4.9.1-emas");
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
            DEFAULT_LOG.mo5086e("setCurrentProcess", th);
        }
        try {
            GlobalAppRuntimeInfo.setTargetProcess(AdapterUtilityImpl.getTargetProcess(context.getApplicationContext()));
        } catch (Throwable th2) {
            DEFAULT_LOG.mo5086e("setCurrentProcess", th2);
        }
    }

    public static synchronized void setEnvironment(Context context, @AccsClientConfig.ENV int i4) {
        if (i4 < 0 || i4 > 2) {
            try {
                DEFAULT_LOG.mo5092w("env invalid, reset to release", "env", Integer.valueOf(i4));
                i4 = 0;
            } finally {
                try {
                } finally {
                }
            }
        }
        int i5 = AccsClientConfig.mEnv;
        AccsClientConfig.mEnv = i4;
        if (i5 != i4 && AdapterUtilityImpl.isTargetProcess(context)) {
            DEFAULT_LOG.mo5089i("setEnvironment", RequestConstant.ENV_PRE, Integer.valueOf(i5), "to", Integer.valueOf(i4));
            Utils.clearAllSharePreferences(context);
            Utils.clearAgooBindCache(context);
            Utils.killService(context);
            if (i4 == 2) {
                SessionCenter.switchEnvironment(ENV.TEST);
            } else if (i4 == 1) {
                SessionCenter.switchEnvironment(ENV.PREPARE);
            }
            Iterator<Map.Entry<String, ACCSClient>> it = mACCSClients.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    getAccsClient(it.next().getKey());
                } catch (AccsException e4) {
                    DEFAULT_LOG.mo5086e("setEnvironment update client", e4);
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
        if (this.mAccsManager != null) {
            Log.d("ACCS_TEST", "start to bindApp");
            this.mAccsManager.bindApp(sContext, this.mConfig.getAppKey(), this.mConfig.getAppSecret(), str, iAppReceiver);
        } else {
            this.mLog.mo5085e("bindApp mAccsManager null");
            Log.d("ACCS_TEST", "bindApp mAccsManager null");
            C1780c.m6140a(AccsErrorCode.ERROR_SHOULD_NEVER_HAPPEN.copy().detail("bindApp accs is null").build(), iAppReceiver, null);
        }
    }

    public void bindService(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("bindService mAccsManager null");
        } else {
            iACCSManager.bindService(sContext, str);
        }
    }

    public void bindUser(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("bindUser mAccsManager null");
        } else {
            iACCSManager.bindUser(sContext, str);
        }
    }

    public boolean cancel(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.cancel(sContext, str);
        }
        this.mLog.mo5085e("cancel mAccsManager null");
        return false;
    }

    public void cleanLocalBindInfo() {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("cleanLocalBindInfo mAccsManager null");
        } else {
            iACCSManager.cleanLocalBindInfo();
        }
    }

    public void clearLoginInfo() {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("clearLoginInfo mAccsManager null");
        } else {
            iACCSManager.clearLoginInfo(sContext);
        }
    }

    public void disconnect() {
        this.mAccsManager.disconnect();
    }

    public Map<String, Boolean> forceReConnectChannel() throws Exception {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.forceReConnectChannel();
        }
        this.mLog.mo5085e("forceReConnectChannel mAccsManager null");
        return null;
    }

    public Map<String, Boolean> getChannelState() throws Exception {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.getChannelState();
        }
        this.mLog.mo5085e("getChannelState mAccsManager null");
        return null;
    }

    public List<ConnectionListener> getConnectionListeners() {
        return new ArrayList(this.mListeners);
    }

    public int getLastConnectErrorCode() {
        return this.mAccsManager.getLastConnectErrorCode();
    }

    public boolean isChannelError(int i4) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.isChannelError(i4);
        }
        this.mLog.mo5085e("isChannelError mAccsManager null");
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
        this.mLog.mo5085e("isNetworkReachable mAccsManager null");
        return false;
    }

    public void reconnect() {
        this.mAccsManager.reconnect();
    }

    public void registerDataListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("registerDataListener mAccsManager null");
        } else {
            iACCSManager.registerDataListener(sContext, str, accsAbstractDataListener);
        }
    }

    public void registerService(String str, String str2) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("registerService mAccsManager null");
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

    public void sendBusinessAck(String str, String str2, String str3, short s3, String str4, Map<Integer, String> map) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("sendBusinessAck mAccsManager null");
        } else {
            iACCSManager.sendBusinessAck(str, str2, str3, s3, str4, map);
        }
    }

    public String sendData(ACCSManager.AccsRequest accsRequest) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.sendData(sContext, accsRequest);
        }
        this.mLog.mo5085e("sendData mAccsManager null");
        return null;
    }

    public String sendPushResponse(ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.sendPushResponse(sContext, accsRequest, extraInfo);
        }
        this.mLog.mo5085e("sendPushResponse mAccsManager null");
        return null;
    }

    public String sendRequest(ACCSManager.AccsRequest accsRequest) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager != null) {
            return iACCSManager.sendRequest(sContext, accsRequest);
        }
        this.mLog.mo5085e("sendRequest mAccsManager null");
        return null;
    }

    public void setLoginInfo(ILoginInfo iLoginInfo) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("setLoginInfo mAccsManager null");
        } else {
            iACCSManager.setLoginInfo(sContext, iLoginInfo);
        }
    }

    public void startInAppConnection(String str, IAppReceiver iAppReceiver) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("startInAppConnection mAccsManager null");
        } else {
            iACCSManager.startInAppConnection(sContext, this.mConfig.getAppKey(), this.mConfig.getAppSecret(), str, iAppReceiver);
        }
    }

    public void unRegisterDataListener(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("unRegisterDataListener mAccsManager null");
        } else {
            iACCSManager.unRegisterDataListener(sContext, str);
        }
    }

    public void unRegisterService(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("unRegisterService mAccsManager null");
        } else {
            iACCSManager.unRegisterService(sContext, str);
        }
    }

    public void unbindService(String str) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("unbindService mAccsManager null");
        } else {
            iACCSManager.unbindService(sContext, str);
        }
    }

    public void unbindUser() {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("unbindUser mAccsManager null");
        } else {
            iACCSManager.unbindUser(sContext);
        }
    }

    public void bindUser(String str, boolean z3) {
        IACCSManager iACCSManager = this.mAccsManager;
        if (iACCSManager == null) {
            this.mLog.mo5085e("bindUser mAccsManager null");
        } else {
            iACCSManager.bindUser(sContext, str, z3);
        }
    }
}
