package com.taobao.accs.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import anet.channel.SessionCenter;
import com.alibaba.sdk.android.logger.ILog;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.AccsState;
import com.taobao.accs.IACCSManager;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.C1715a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C1729g;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.AbstractC1745b;
import com.taobao.accs.net.C1753j;
import com.taobao.accs.p064ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.AccsLogger;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C1780c;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ACCSManagerImpl implements IACCSManager {

    /* renamed from: a */
    public AbstractC1745b f7612a;

    /* renamed from: b */
    private int f7613b = 0;

    /* renamed from: c */
    private boolean f7614c = false;

    /* renamed from: d */
    private final String f7615d;

    /* renamed from: e */
    private final ILog f7616e;

    public ACCSManagerImpl(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        GlobalClientInfo.f7505a = applicationContext;
        this.f7612a = new C1753j(applicationContext, 1, str);
        this.f7615d = str;
        this.f7616e = AccsLogger.getLogger("ACCSMgrImpl_" + this.f7612a.f7666m);
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC1733a(this, str, context), 64L, TimeUnit.MILLISECONDS);
    }

    @Override // com.taobao.accs.IACCSManager
    public void bindApp(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        bindApp(context, str, "accs", str2, iAppReceiver);
    }

    @Override // com.taobao.accs.IACCSManager
    public void bindService(Context context, String str) {
        this.f7616e.mo5089i("bindService", Constants.KEY_SERVICE_ID, str);
        if (m5956a(context)) {
            m5952a(context, 5, str, (String) null);
            return;
        }
        Intent intentM5951a = m5951a(context, 5);
        String strM6010i = this.f7612a.m6010i();
        if (TextUtils.isEmpty(strM6010i)) {
            this.f7616e.mo5085e("appKey null");
            return;
        }
        intentM5951a.putExtra(Constants.KEY_APP_KEY, strM6010i);
        intentM5951a.putExtra(Constants.KEY_SERVICE_ID, str);
        if (AdapterUtilityImpl.isTargetProcess(context)) {
            Message messageM5868b = Message.m5868b(this.f7612a, intentM5951a);
            if (messageM5868b.m5882e() != null) {
                messageM5868b.m5882e().setDataId(messageM5868b.f7561q);
                messageM5868b.m5882e().setMsgType(3);
                NetPerformanceMonitor netPerformanceMonitorM5882e = messageM5868b.m5882e();
                URL url = messageM5868b.f7550f;
                netPerformanceMonitorM5882e.setHost(url != null ? url.toString() : "");
            }
            m5953a(context, messageM5868b, 5, false);
        } else {
            this.f7616e.mo5090w("bindService not target process, ignored");
        }
        this.f7612a.m6001b(context.getApplicationContext());
    }

    @Override // com.taobao.accs.IACCSManager
    public void bindUser(Context context, String str) {
        bindUser(context, str, false);
    }

    @Override // com.taobao.accs.IACCSManager
    public boolean cancel(Context context, String str) {
        return this.f7612a.mo5997a(str);
    }

    @Override // com.taobao.accs.IACCSManager
    public void cleanLocalBindInfo() {
        this.f7612a.m6011j().m5843a();
    }

    @Override // com.taobao.accs.IACCSManager
    public void clearLoginInfo(Context context) {
        GlobalClientInfo.getInstance(context).clearLoginInfoImpl();
    }

    @Override // com.taobao.accs.IACCSManager
    public void disconnect() {
        this.f7612a.mo6015n();
    }

    @Override // com.taobao.accs.IACCSManager
    public void forceDisableService(Context context) {
    }

    @Override // com.taobao.accs.IACCSManager
    public void forceEnableService(Context context) {
    }

    @Override // com.taobao.accs.IACCSManager
    public Map<String, Boolean> forceReConnectChannel() throws Exception {
        SessionCenter.getInstance(this.f7612a.f7662i.getAppKey()).forceRecreateAccsSession();
        return getChannelState();
    }

    @Override // com.taobao.accs.IACCSManager
    public Map<String, Boolean> getChannelState() throws Exception {
        String strMo5998b = this.f7612a.mo5998b((String) null);
        HashMap map = new HashMap();
        map.put(strMo5998b, Boolean.FALSE);
        if (SessionCenter.getInstance(this.f7612a.f7662i.getAppKey()).getThrowsException(strMo5998b, 60000L) != null) {
            map.put(strMo5998b, Boolean.TRUE);
        }
        this.f7616e.mo5089i("getChannelState", map);
        return map;
    }

    @Override // com.taobao.accs.IACCSManager
    public int getLastConnectErrorCode() {
        return this.f7612a.mo6014m();
    }

    @Override // com.taobao.accs.IACCSManager
    public String getUserUnit() {
        return null;
    }

    @Override // com.taobao.accs.IACCSManager
    public boolean isChannelError(int i4) {
        return AccsErrorCode.isChannelError(i4);
    }

    @Override // com.taobao.accs.IACCSManager
    public boolean isConnected() {
        return this.f7612a.mo6013l();
    }

    @Override // com.taobao.accs.IACCSManager
    public boolean isNetworkReachable(Context context) {
        return UtilityImpl.m6130g(context);
    }

    @Override // com.taobao.accs.IACCSManager
    public void reconnect() {
        this.f7612a.mo6016o();
    }

    @Override // com.taobao.accs.IACCSManager
    public void registerDataListener(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        GlobalClientInfo.getInstance(context).registerListener(str, accsAbstractDataListener);
    }

    @Override // com.taobao.accs.IACCSManager
    public void registerService(Context context, String str, String str2) {
        GlobalClientInfo.getInstance(context).registerService(str, str2);
    }

    @Override // com.taobao.accs.IACCSManager
    public void reset() {
        this.f7612a.m6017p();
        try {
            SharedPreferences.Editor editorEdit = GlobalClientInfo.f7505a.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            editorEdit.clear();
            editorEdit.apply();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        C1715a.m5837a().m5841b(this.f7615d);
        this.f7614c = false;
    }

    @Override // com.taobao.accs.IACCSManager
    public void sendBusinessAck(String str, String str2, String str3, short s3, String str4, Map<Integer, String> map) {
        this.f7612a.mo5989a();
        this.f7612a.m6002b(Message.m5857a(this.f7612a, str, str2, str3, true, s3, str4, map), true);
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendData(Context context, String str, String str2, byte[] bArr, String str3) {
        return sendData(context, str, str2, bArr, str3, null);
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendPushResponse(Context context, ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        try {
        } catch (Throwable th) {
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "push response " + th.toString());
            this.f7616e.mo5087e("sendPushResponse", Constants.KEY_DATA_ID, accsRequest.dataId, th);
        }
        if (context == null || accsRequest == null) {
            this.f7616e.mo5087e("sendPushResponse input null", context, accsRequest, "extraInfo", extraInfo);
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", "sendPushResponse null");
            return null;
        }
        AppMonitorAdapter.commitAlarmSuccess("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "push response total");
        if (TextUtils.isEmpty(this.f7612a.m6010i())) {
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "sendPushResponse appkey null");
            this.f7616e.mo5087e("sendPushResponse appkey null", "dataid", accsRequest.dataId);
            return null;
        }
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            synchronized (ACCSManagerImpl.class) {
                this.f7613b++;
                accsRequest.dataId = this.f7613b + "";
            }
        }
        if (extraInfo == null) {
            extraInfo = new TaoBaseService.ExtraInfo();
        }
        accsRequest.host = null;
        String packageName = context.getPackageName();
        extraInfo.fromPackage = packageName;
        this.f7616e.mo5089i("sendPushResponse", Constants.KEY_HOST, extraInfo.fromHost, "pkg", packageName, Constants.KEY_DATA_ID, accsRequest.dataId);
        if (context.getPackageName().equals(extraInfo.fromPackage) && AdapterUtilityImpl.isTargetProcess(context)) {
            sendRequest(context, accsRequest, context.getPackageName(), true);
        }
        return null;
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return sendRequest(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.IACCSManager
    public void setLoginInfo(Context context, ILoginInfo iLoginInfo) {
        GlobalClientInfo.getInstance(context).setLoginInfoImpl(this.f7612a.f7666m, iLoginInfo);
    }

    @Override // com.taobao.accs.IACCSManager
    @Deprecated
    public void setMode(Context context, int i4) {
        ACCSClient.setEnvironment(context, i4);
    }

    @Override // com.taobao.accs.IACCSManager
    public void setProxy(Context context, String str, int i4) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
        if (!TextUtils.isEmpty(str)) {
            editorEdit.putString(Constants.KEY_PROXY_HOST, str);
        }
        editorEdit.putInt(Constants.KEY_PROXY_PORT, i4);
        editorEdit.apply();
    }

    @Override // com.taobao.accs.IACCSManager
    public void startInAppConnection(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        startInAppConnection(context, str, null, str2, iAppReceiver);
    }

    @Override // com.taobao.accs.IACCSManager
    public void unRegisterDataListener(Context context, String str) {
        GlobalClientInfo.getInstance(context).unregisterListener(str);
    }

    @Override // com.taobao.accs.IACCSManager
    public void unRegisterService(Context context, String str) {
        GlobalClientInfo.getInstance(context).unRegisterService(str);
    }

    @Override // com.taobao.accs.IACCSManager
    public void unbindApp(Context context) {
        this.f7616e.mo5088i("unbindApp");
        this.f7614c = false;
        if (m5956a(context)) {
            m5952a(context, 2, (String) null, (String) null);
            return;
        }
        Intent intentM5951a = m5951a(context, 2);
        if (AdapterUtilityImpl.isTargetProcess(context)) {
            m5953a(context, Message.m5855a(this.f7612a, intentM5951a), 2, false);
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public void unbindService(Context context, String str) {
        this.f7616e.mo5089i("unbindService", Constants.KEY_SERVICE_ID, str);
        if (m5956a(context)) {
            m5952a(context, 6, str, (String) null);
            return;
        }
        Intent intentM5951a = m5951a(context, 6);
        String strM6010i = this.f7612a.m6010i();
        if (TextUtils.isEmpty(strM6010i)) {
            this.f7616e.mo5085e("appKey null");
            return;
        }
        intentM5951a.putExtra(Constants.KEY_APP_KEY, strM6010i);
        intentM5951a.putExtra(Constants.KEY_SERVICE_ID, str);
        if (AdapterUtilityImpl.isTargetProcess(context)) {
            m5953a(context, Message.m5870c(this.f7612a, intentM5951a), 6, false);
        } else {
            this.f7616e.mo5090w("unbindService not target process, ignored");
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public void unbindUser(Context context) {
        this.f7616e.mo5088i("unBindUse");
        if (m5956a(context)) {
            m5952a(context, 4, (String) null, (String) null);
            return;
        }
        Intent intentM5951a = m5951a(context, 4);
        String strM6010i = this.f7612a.m6010i();
        if (TextUtils.isEmpty(strM6010i)) {
            this.f7616e.mo5085e("appKey null");
            return;
        }
        intentM5951a.putExtra(Constants.KEY_APP_KEY, strM6010i);
        if (AdapterUtilityImpl.isTargetProcess(context)) {
            m5953a(context, Message.m5873e(this.f7612a, intentM5951a), 4, false);
        } else {
            this.f7616e.mo5090w("unBindUser not target process, ignored");
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public void updateConfig(AccsClientConfig accsClientConfig) {
        AbstractC1745b abstractC1745b = this.f7612a;
        if (abstractC1745b instanceof C1753j) {
            ((C1753j) abstractC1745b).m6042a(accsClientConfig);
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public void bindApp(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        if (context == null) {
            return;
        }
        this.f7614c = true;
        this.f7616e.mo5084d("bindApp", Constants.KEY_APP_KEY, str);
        Message messageM5859a = Message.m5859a(context.getPackageName(), 1);
        if (this.f7612a.m6012k() && TextUtils.isEmpty(this.f7612a.f7662i.getAppSecret())) {
            this.f7616e.mo5090w("isSecurityOff and null secret");
            this.f7612a.m5991a(messageM5859a, AccsErrorCode.APPSECRET_NULL);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f7616e.mo5090w("appKey is null");
            this.f7612a.m5991a(messageM5859a, AccsErrorCode.APPKEY_NULL);
            return;
        }
        AbstractC1745b abstractC1745b = this.f7612a;
        abstractC1745b.f7654a = str3;
        abstractC1745b.f7655b = str;
        abstractC1745b.f7662i.getAppSecret();
        UtilityImpl.m6126e(context, str);
        if (iAppReceiver != null) {
            C1715a.m5837a().m5839a(this.f7615d, C1780c.m6138a(iAppReceiver));
        }
        m5954a(context, str, str3);
    }

    @Override // com.taobao.accs.IACCSManager
    public void bindUser(Context context, String str, boolean z3) {
        try {
            this.f7616e.mo5089i("bindUser", "userId", str, "force", Boolean.valueOf(z3));
            if (m5956a(context)) {
                m5952a(context, 3, (String) null, (String) null);
                return;
            }
            Intent intentM5951a = m5951a(context, 3);
            String strM6010i = this.f7612a.m6010i();
            if (TextUtils.isEmpty(strM6010i)) {
                this.f7616e.mo5085e("appkey null");
                return;
            }
            if (UtilityImpl.m6119c(context) || z3) {
                this.f7616e.mo5083d("force bind user");
                intentM5951a.putExtra(Constants.KEY_FOUCE_BIND, true);
                z3 = true;
            }
            intentM5951a.putExtra(Constants.KEY_APP_KEY, strM6010i);
            intentM5951a.putExtra(Constants.KEY_USER_ID, str);
            if (AdapterUtilityImpl.isTargetProcess(context)) {
                Message messageM5872d = Message.m5872d(this.f7612a, intentM5951a);
                if (messageM5872d.m5882e() != null) {
                    messageM5872d.m5882e().setDataId(messageM5872d.f7561q);
                    messageM5872d.m5882e().setMsgType(2);
                    NetPerformanceMonitor netPerformanceMonitorM5882e = messageM5872d.m5882e();
                    URL url = messageM5872d.f7550f;
                    netPerformanceMonitorM5882e.setHost(url != null ? url.toString() : "");
                }
                m5953a(context, messageM5872d, 3, z3);
            } else {
                this.f7616e.mo5090w("bindUser not target process, ignored");
            }
            this.f7612a.m6001b(context.getApplicationContext());
        } catch (Throwable th) {
            this.f7616e.mo5086e("bindUser", th);
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return sendData(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return sendRequest(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    @Override // com.taobao.accs.IACCSManager
    public void startInAppConnection(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        if (iAppReceiver != null) {
            C1715a.m5837a().m5839a(this.f7615d, C1780c.m6138a(iAppReceiver));
        }
        if (!AdapterUtilityImpl.isTargetProcess(context)) {
            this.f7616e.mo5090w("inapp only init in target process!");
            return;
        }
        this.f7616e.mo5089i("startInAppConnection", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.equals(this.f7612a.m6010i(), str)) {
            AbstractC1745b abstractC1745b = this.f7612a;
            abstractC1745b.f7654a = str3;
            abstractC1745b.f7655b = str;
            abstractC1745b.f7662i.getAppSecret();
            UtilityImpl.m6126e(context, str);
        }
        this.f7612a.mo5989a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5954a(Context context, String str, String str2) {
        Intent intentM5951a = m5951a(context, 1);
        try {
            String str3 = GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
            boolean z3 = UtilityImpl.m6119c(context) || UtilityImpl.utdidChanged(Constants.SP_FILE_NAME, context);
            if (z3) {
                this.f7616e.mo5083d("force bindApp");
                intentM5951a.putExtra(Constants.KEY_FOUCE_BIND, true);
            }
            intentM5951a.putExtra(Constants.KEY_APP_KEY, str);
            intentM5951a.putExtra(Constants.KEY_TTID, str2);
            intentM5951a.putExtra("appVersion", str3);
            intentM5951a.putExtra("app_sercet", this.f7612a.f7662i.getAppSecret());
            if (AdapterUtilityImpl.isTargetProcess(context)) {
                Message messageM5851a = Message.m5851a(this.f7612a, context, intentM5951a);
                if (messageM5851a.m5882e() != null) {
                    messageM5851a.m5882e().setDataId(messageM5851a.f7561q);
                    messageM5851a.m5882e().setMsgType(1);
                    NetPerformanceMonitor netPerformanceMonitorM5882e = messageM5851a.m5882e();
                    URL url = messageM5851a.f7550f;
                    netPerformanceMonitorM5882e.setHost(url != null ? url.toString() : "");
                }
                m5953a(context, messageM5851a, 1, z3);
            } else {
                this.f7616e.mo5090w("bindApp only allow in target process");
            }
            this.f7612a.m6001b(context.getApplicationContext());
        } catch (Throwable th) {
            this.f7616e.mo5086e("bindApp exception", th);
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return sendData(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendRequest(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z3) {
        try {
        } catch (Throwable th) {
            if (accsRequest != null) {
                AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "request " + th.toString());
                this.f7616e.mo5087e("sendRequest", Constants.KEY_DATA_ID, accsRequest.dataId, th);
            }
        }
        if (accsRequest == null) {
            this.f7616e.mo5085e("sendRequest request null");
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, null, "1", "request null");
            return null;
        }
        if (!AdapterUtilityImpl.isTargetProcess(context)) {
            this.f7616e.mo5085e("sendRequest not in target process");
            return null;
        }
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            synchronized (ACCSManagerImpl.class) {
                this.f7613b++;
                accsRequest.dataId = this.f7613b + "";
            }
        }
        if (TextUtils.isEmpty(this.f7612a.m6010i())) {
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "request appkey null");
            this.f7616e.mo5087e("sendRequest appkey null", Constants.KEY_DATA_ID, accsRequest.dataId);
            return null;
        }
        this.f7612a.mo5989a();
        if (str == null) {
            str = context.getPackageName();
        }
        Message messageM5854a = Message.m5854a(this.f7612a, context, str, Constants.TARGET_SERVICE_PRE, accsRequest, z3);
        if (messageM5854a.m5882e() != null) {
            messageM5854a.m5882e().onSend();
        }
        this.f7612a.m6002b(messageM5854a, true);
        return accsRequest.dataId;
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendData(Context context, ACCSManager.AccsRequest accsRequest) {
        try {
        } catch (Throwable th) {
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "data " + th.toString());
            this.f7616e.mo5087e("sendData", Constants.KEY_DATA_ID, accsRequest.dataId, th);
        }
        if (!AdapterUtilityImpl.isTargetProcess(context)) {
            this.f7616e.mo5085e("sendData not in target process");
            return null;
        }
        if (accsRequest == null) {
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", "data null");
            this.f7616e.mo5085e("sendData dataInfo null");
            return null;
        }
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            synchronized (ACCSManagerImpl.class) {
                this.f7613b++;
                accsRequest.dataId = this.f7613b + "";
            }
        }
        if (TextUtils.isEmpty(this.f7612a.m6010i())) {
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "data appkey null");
            this.f7616e.mo5087e("sendData appkey null", Constants.KEY_DATA_ID, accsRequest.dataId);
            return null;
        }
        this.f7612a.mo5989a();
        Message messageM5852a = Message.m5852a(this.f7612a, context, context.getPackageName(), accsRequest);
        if (messageM5852a.m5882e() != null) {
            messageM5852a.m5882e().onSend();
        }
        this.f7612a.m6002b(messageM5852a, true);
        return accsRequest.dataId;
    }

    /* renamed from: a */
    private void m5953a(Context context, Message message, int i4, boolean z3) {
        boolean z4;
        this.f7612a.mo5989a();
        if (message == null) {
            this.f7616e.mo5085e("message is null");
            this.f7612a.m5991a(Message.m5859a(context.getPackageName(), i4), AccsErrorCode.PARAMETER_ERROR);
            return;
        }
        if (i4 != 1) {
            if (i4 == 2 && this.f7612a.m6011j().m5848e(message.m5883f())) {
                this.f7616e.mo5088i("unbind app, already unbind");
                this.f7612a.m5991a(message, AccsErrorCode.SUCCESS);
                z4 = false;
            }
            z4 = true;
        } else {
            String strM5883f = message.m5883f();
            if (this.f7612a.m6011j().m5847d(strM5883f) && !z3) {
                this.f7616e.mo5088i("bind app from cache");
                AccsState.getInstance().m5816a(this.f7615d, AccsState.BIND_APP_FROM_CACHE, Boolean.TRUE);
                this.f7612a.m5991a(message, AccsErrorCode.SUCCESS);
            } else if (!this.f7612a.m6011j().m5849f(strM5883f) || z3) {
                this.f7612a.m6011j().m5846c(strM5883f);
                z4 = true;
            }
            z4 = false;
        }
        if (z4) {
            this.f7616e.mo5089i("sendControlMessage", "command", Integer.valueOf(i4));
            this.f7612a.m6002b(message, true);
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendRequest(Context context, ACCSManager.AccsRequest accsRequest) {
        return sendRequest(context, accsRequest, null, true);
    }

    /* renamed from: a */
    private boolean m5956a(Context context) {
        AbstractC1745b abstractC1745b = this.f7612a;
        return abstractC1745b == null || !abstractC1745b.m6011j().m5847d(context.getPackageName());
    }

    /* renamed from: a */
    private Intent m5951a(Context context, int i4) {
        Intent intent = new Intent();
        intent.setAction(Constants.ACTION_COMMAND);
        intent.setClassName(context.getPackageName(), AdapterUtilityImpl.channelService);
        intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
        intent.putExtra("command", i4);
        intent.putExtra(Constants.KEY_APP_KEY, this.f7612a.f7655b);
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.f7615d);
        return intent;
    }

    /* renamed from: a */
    private void m5952a(Context context, int i4, String str, String str2) {
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", i4);
        intent.putExtra(Constants.KEY_SERVICE_ID, str);
        intent.putExtra(Constants.KEY_DATA_ID, str2);
        intent.putExtra(Constants.KEY_APP_KEY, this.f7612a.f7655b);
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.f7615d);
        intent.putExtra(Constants.KEY_ERROR_OBJ, i4 == 2 ? AccsErrorCode.SUCCESS : AccsErrorCode.APP_NOT_BIND);
        C1729g.m5935a(context, intent);
    }
}
