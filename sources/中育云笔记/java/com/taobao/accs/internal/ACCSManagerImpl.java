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
import com.taobao.accs.client.C7612a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C7626g;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.AbstractC7642b;
import com.taobao.accs.net.C7650j;
import com.taobao.accs.p085ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.AccsLogger;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C7677c;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class ACCSManagerImpl implements IACCSManager {

    /* renamed from: a */
    public AbstractC7642b f13010a;

    /* renamed from: b */
    private int f13011b = 0;

    /* renamed from: c */
    private boolean f13012c = false;

    /* renamed from: d */
    private final String f13013d;

    /* renamed from: e */
    private final ILog f13014e;

    public ACCSManagerImpl(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        GlobalClientInfo.f12903a = applicationContext;
        this.f13010a = new C7650j(applicationContext, 1, str);
        this.f13013d = str;
        this.f13014e = AccsLogger.getLogger("ACCSMgrImpl_" + this.f13010a.f13064m);
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC7630a(this, str, context), 64L, TimeUnit.MILLISECONDS);
    }

    @Override // com.taobao.accs.IACCSManager
    public void bindApp(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        bindApp(context, str, "accs", str2, iAppReceiver);
    }

    @Override // com.taobao.accs.IACCSManager
    public void bindService(Context context, String str) {
        this.f13014e.mo3539i("bindService", Constants.KEY_SERVICE_ID, str);
        if (m9982a(context)) {
            m9978a(context, 5, str, (String) null);
            return;
        }
        Intent intentM9977a = m9977a(context, 5);
        String strM10036i = this.f13010a.m10036i();
        if (TextUtils.isEmpty(strM10036i)) {
            this.f13014e.mo3535e("appKey null");
            return;
        }
        intentM9977a.putExtra(Constants.KEY_APP_KEY, strM10036i);
        intentM9977a.putExtra(Constants.KEY_SERVICE_ID, str);
        if (AdapterUtilityImpl.isTargetProcess(context)) {
            Message messageM9894b = Message.m9894b(this.f13010a, intentM9977a);
            if (messageM9894b.m9908e() != null) {
                messageM9894b.m9908e().setDataId(messageM9894b.f12959q);
                messageM9894b.m9908e().setMsgType(3);
                NetPerformanceMonitor netPerformanceMonitorM9908e = messageM9894b.m9908e();
                URL url = messageM9894b.f12948f;
                netPerformanceMonitorM9908e.setHost(url != null ? url.toString() : "");
            }
            m9979a(context, messageM9894b, 5, false);
        } else {
            this.f13014e.mo3540w("bindService not target process, ignored");
        }
        this.f13010a.m10027b(context.getApplicationContext());
    }

    @Override // com.taobao.accs.IACCSManager
    public void bindUser(Context context, String str) {
        bindUser(context, str, false);
    }

    @Override // com.taobao.accs.IACCSManager
    public boolean cancel(Context context, String str) {
        return this.f13010a.mo10023a(str);
    }

    @Override // com.taobao.accs.IACCSManager
    public void cleanLocalBindInfo() {
        this.f13010a.m10037j().m9869a();
    }

    @Override // com.taobao.accs.IACCSManager
    public void clearLoginInfo(Context context) {
        GlobalClientInfo.getInstance(context).clearLoginInfoImpl();
    }

    @Override // com.taobao.accs.IACCSManager
    public void disconnect() {
        this.f13010a.mo10041n();
    }

    @Override // com.taobao.accs.IACCSManager
    public void forceDisableService(Context context) {
    }

    @Override // com.taobao.accs.IACCSManager
    public void forceEnableService(Context context) {
    }

    @Override // com.taobao.accs.IACCSManager
    public Map<String, Boolean> forceReConnectChannel() {
        SessionCenter.getInstance(this.f13010a.f13060i.getAppKey()).forceRecreateAccsSession();
        return getChannelState();
    }

    @Override // com.taobao.accs.IACCSManager
    public Map<String, Boolean> getChannelState() {
        String strMo10024b = this.f13010a.mo10024b((String) null);
        HashMap map = new HashMap();
        map.put(strMo10024b, Boolean.FALSE);
        if (SessionCenter.getInstance(this.f13010a.f13060i.getAppKey()).getThrowsException(strMo10024b, 60000L) != null) {
            map.put(strMo10024b, Boolean.TRUE);
        }
        this.f13014e.mo3539i("getChannelState", map);
        return map;
    }

    @Override // com.taobao.accs.IACCSManager
    public int getLastConnectErrorCode() {
        return this.f13010a.mo10040m();
    }

    @Override // com.taobao.accs.IACCSManager
    public String getUserUnit() {
        return null;
    }

    @Override // com.taobao.accs.IACCSManager
    public boolean isChannelError(int i10) {
        return AccsErrorCode.isChannelError(i10);
    }

    @Override // com.taobao.accs.IACCSManager
    public boolean isConnected() {
        return this.f13010a.mo10039l();
    }

    @Override // com.taobao.accs.IACCSManager
    public boolean isNetworkReachable(Context context) {
        return UtilityImpl.m10156g(context);
    }

    @Override // com.taobao.accs.IACCSManager
    public void reconnect() {
        this.f13010a.mo10042o();
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
        this.f13010a.m10043p();
        try {
            SharedPreferences.Editor editorEdit = GlobalClientInfo.f12903a.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            editorEdit.clear();
            editorEdit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        C7612a.m9863a().m9867b(this.f13013d);
        this.f13012c = false;
    }

    @Override // com.taobao.accs.IACCSManager
    public void sendBusinessAck(String str, String str2, String str3, short s10, String str4, Map<Integer, String> map) {
        this.f13010a.mo10015a();
        this.f13010a.m10028b(Message.m9883a(this.f13010a, str, str2, str3, true, s10, str4, map), true);
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
            this.f13014e.mo3537e("sendPushResponse", Constants.KEY_DATA_ID, accsRequest.dataId, th);
        }
        if (context == null || accsRequest == null) {
            this.f13014e.mo3537e("sendPushResponse input null", context, accsRequest, "extraInfo", extraInfo);
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", "sendPushResponse null");
            return null;
        }
        AppMonitorAdapter.commitAlarmSuccess("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "push response total");
        if (TextUtils.isEmpty(this.f13010a.m10036i())) {
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "sendPushResponse appkey null");
            this.f13014e.mo3537e("sendPushResponse appkey null", "dataid", accsRequest.dataId);
            return null;
        }
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            synchronized (ACCSManagerImpl.class) {
                this.f13011b++;
                accsRequest.dataId = this.f13011b + "";
            }
        }
        if (extraInfo == null) {
            extraInfo = new TaoBaseService.ExtraInfo();
        }
        accsRequest.host = null;
        String packageName = context.getPackageName();
        extraInfo.fromPackage = packageName;
        this.f13014e.mo3539i("sendPushResponse", Constants.KEY_HOST, extraInfo.fromHost, "pkg", packageName, Constants.KEY_DATA_ID, accsRequest.dataId);
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
        GlobalClientInfo.getInstance(context).setLoginInfoImpl(this.f13010a.f13064m, iLoginInfo);
    }

    @Override // com.taobao.accs.IACCSManager
    @Deprecated
    public void setMode(Context context, int i10) {
        ACCSClient.setEnvironment(context, i10);
    }

    @Override // com.taobao.accs.IACCSManager
    public void setProxy(Context context, String str, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
        if (!TextUtils.isEmpty(str)) {
            editorEdit.putString(Constants.KEY_PROXY_HOST, str);
        }
        editorEdit.putInt(Constants.KEY_PROXY_PORT, i10);
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
        this.f13014e.mo3538i("unbindApp");
        this.f13012c = false;
        if (m9982a(context)) {
            m9978a(context, 2, (String) null, (String) null);
            return;
        }
        Intent intentM9977a = m9977a(context, 2);
        if (AdapterUtilityImpl.isTargetProcess(context)) {
            m9979a(context, Message.m9881a(this.f13010a, intentM9977a), 2, false);
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public void unbindService(Context context, String str) {
        this.f13014e.mo3539i("unbindService", Constants.KEY_SERVICE_ID, str);
        if (m9982a(context)) {
            m9978a(context, 6, str, (String) null);
            return;
        }
        Intent intentM9977a = m9977a(context, 6);
        String strM10036i = this.f13010a.m10036i();
        if (TextUtils.isEmpty(strM10036i)) {
            this.f13014e.mo3535e("appKey null");
            return;
        }
        intentM9977a.putExtra(Constants.KEY_APP_KEY, strM10036i);
        intentM9977a.putExtra(Constants.KEY_SERVICE_ID, str);
        if (AdapterUtilityImpl.isTargetProcess(context)) {
            m9979a(context, Message.m9896c(this.f13010a, intentM9977a), 6, false);
        } else {
            this.f13014e.mo3540w("unbindService not target process, ignored");
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public void unbindUser(Context context) {
        this.f13014e.mo3538i("unBindUse");
        if (m9982a(context)) {
            m9978a(context, 4, (String) null, (String) null);
            return;
        }
        Intent intentM9977a = m9977a(context, 4);
        String strM10036i = this.f13010a.m10036i();
        if (TextUtils.isEmpty(strM10036i)) {
            this.f13014e.mo3535e("appKey null");
            return;
        }
        intentM9977a.putExtra(Constants.KEY_APP_KEY, strM10036i);
        if (AdapterUtilityImpl.isTargetProcess(context)) {
            m9979a(context, Message.m9899e(this.f13010a, intentM9977a), 4, false);
        } else {
            this.f13014e.mo3540w("unBindUser not target process, ignored");
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public void updateConfig(AccsClientConfig accsClientConfig) {
        AbstractC7642b abstractC7642b = this.f13010a;
        if (abstractC7642b instanceof C7650j) {
            ((C7650j) abstractC7642b).m10068a(accsClientConfig);
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public void bindApp(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        if (context == null) {
            return;
        }
        this.f13012c = true;
        this.f13014e.mo3534d("bindApp", Constants.KEY_APP_KEY, str);
        Message messageM9885a = Message.m9885a(context.getPackageName(), 1);
        if (this.f13010a.m10038k() && TextUtils.isEmpty(this.f13010a.f13060i.getAppSecret())) {
            this.f13014e.mo3540w("isSecurityOff and null secret");
            this.f13010a.m10017a(messageM9885a, AccsErrorCode.APPSECRET_NULL);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f13014e.mo3540w("appKey is null");
            this.f13010a.m10017a(messageM9885a, AccsErrorCode.APPKEY_NULL);
            return;
        }
        AbstractC7642b abstractC7642b = this.f13010a;
        abstractC7642b.f13052a = str3;
        abstractC7642b.f13053b = str;
        abstractC7642b.f13060i.getAppSecret();
        UtilityImpl.m10152e(context, str);
        if (iAppReceiver != null) {
            C7612a.m9863a().m9865a(this.f13013d, C7677c.m10164a(iAppReceiver));
        }
        m9980a(context, str, str3);
    }

    @Override // com.taobao.accs.IACCSManager
    public void bindUser(Context context, String str, boolean z10) {
        try {
            this.f13014e.mo3539i("bindUser", "userId", str, "force", Boolean.valueOf(z10));
            if (m9982a(context)) {
                m9978a(context, 3, (String) null, (String) null);
                return;
            }
            Intent intentM9977a = m9977a(context, 3);
            String strM10036i = this.f13010a.m10036i();
            if (TextUtils.isEmpty(strM10036i)) {
                this.f13014e.mo3535e("appkey null");
                return;
            }
            if (UtilityImpl.m10145c(context) || z10) {
                this.f13014e.mo3533d("force bind user");
                intentM9977a.putExtra(Constants.KEY_FOUCE_BIND, true);
                z10 = true;
            }
            intentM9977a.putExtra(Constants.KEY_APP_KEY, strM10036i);
            intentM9977a.putExtra(Constants.KEY_USER_ID, str);
            if (AdapterUtilityImpl.isTargetProcess(context)) {
                Message messageM9898d = Message.m9898d(this.f13010a, intentM9977a);
                if (messageM9898d.m9908e() != null) {
                    messageM9898d.m9908e().setDataId(messageM9898d.f12959q);
                    messageM9898d.m9908e().setMsgType(2);
                    NetPerformanceMonitor netPerformanceMonitorM9908e = messageM9898d.m9908e();
                    URL url = messageM9898d.f12948f;
                    netPerformanceMonitorM9908e.setHost(url != null ? url.toString() : "");
                }
                m9979a(context, messageM9898d, 3, z10);
            } else {
                this.f13014e.mo3540w("bindUser not target process, ignored");
            }
            this.f13010a.m10027b(context.getApplicationContext());
        } catch (Throwable th) {
            this.f13014e.mo3536e("bindUser", th);
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
            C7612a.m9863a().m9865a(this.f13013d, C7677c.m10164a(iAppReceiver));
        }
        if (!AdapterUtilityImpl.isTargetProcess(context)) {
            this.f13014e.mo3540w("inapp only init in target process!");
            return;
        }
        this.f13014e.mo3539i("startInAppConnection", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.equals(this.f13010a.m10036i(), str)) {
            AbstractC7642b abstractC7642b = this.f13010a;
            abstractC7642b.f13052a = str3;
            abstractC7642b.f13053b = str;
            abstractC7642b.f13060i.getAppSecret();
            UtilityImpl.m10152e(context, str);
        }
        this.f13010a.mo10015a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9980a(Context context, String str, String str2) {
        Intent intentM9977a = m9977a(context, 1);
        try {
            String str3 = GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
            boolean z10 = UtilityImpl.m10145c(context) || UtilityImpl.utdidChanged(Constants.SP_FILE_NAME, context);
            if (z10) {
                this.f13014e.mo3533d("force bindApp");
                intentM9977a.putExtra(Constants.KEY_FOUCE_BIND, true);
            }
            intentM9977a.putExtra(Constants.KEY_APP_KEY, str);
            intentM9977a.putExtra(Constants.KEY_TTID, str2);
            intentM9977a.putExtra("appVersion", str3);
            intentM9977a.putExtra("app_sercet", this.f13010a.f13060i.getAppSecret());
            if (AdapterUtilityImpl.isTargetProcess(context)) {
                Message messageM9877a = Message.m9877a(this.f13010a, context, intentM9977a);
                if (messageM9877a.m9908e() != null) {
                    messageM9877a.m9908e().setDataId(messageM9877a.f12959q);
                    messageM9877a.m9908e().setMsgType(1);
                    NetPerformanceMonitor netPerformanceMonitorM9908e = messageM9877a.m9908e();
                    URL url = messageM9877a.f12948f;
                    netPerformanceMonitorM9908e.setHost(url != null ? url.toString() : "");
                }
                m9979a(context, messageM9877a, 1, z10);
            } else {
                this.f13014e.mo3540w("bindApp only allow in target process");
            }
            this.f13010a.m10027b(context.getApplicationContext());
        } catch (Throwable th) {
            this.f13014e.mo3536e("bindApp exception", th);
        }
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return sendData(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    @Override // com.taobao.accs.IACCSManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String sendRequest(android.content.Context r10, com.taobao.accs.ACCSManager.AccsRequest r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.sendRequest(android.content.Context, com.taobao.accs.ACCSManager$AccsRequest, java.lang.String, boolean):java.lang.String");
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendData(Context context, ACCSManager.AccsRequest accsRequest) {
        try {
        } catch (Throwable th) {
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "data " + th.toString());
            this.f13014e.mo3537e("sendData", Constants.KEY_DATA_ID, accsRequest.dataId, th);
        }
        if (!AdapterUtilityImpl.isTargetProcess(context)) {
            this.f13014e.mo3535e("sendData not in target process");
            return null;
        }
        if (accsRequest == null) {
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", "data null");
            this.f13014e.mo3535e("sendData dataInfo null");
            return null;
        }
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            synchronized (ACCSManagerImpl.class) {
                this.f13011b++;
                accsRequest.dataId = this.f13011b + "";
            }
        }
        if (TextUtils.isEmpty(this.f13010a.m10036i())) {
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "data appkey null");
            this.f13014e.mo3537e("sendData appkey null", Constants.KEY_DATA_ID, accsRequest.dataId);
            return null;
        }
        this.f13010a.mo10015a();
        Message messageM9878a = Message.m9878a(this.f13010a, context, context.getPackageName(), accsRequest);
        if (messageM9878a.m9908e() != null) {
            messageM9878a.m9908e().onSend();
        }
        this.f13010a.m10028b(messageM9878a, true);
        return accsRequest.dataId;
    }

    /* renamed from: a */
    private void m9979a(Context context, Message message, int i10, boolean z10) {
        this.f13010a.mo10015a();
        if (message == null) {
            this.f13014e.mo3535e("message is null");
            this.f13010a.m10017a(Message.m9885a(context.getPackageName(), i10), AccsErrorCode.PARAMETER_ERROR);
            return;
        }
        if (i10 != 1) {
            if (i10 == 2 && this.f13010a.m10037j().m9874e(message.m9909f())) {
                this.f13014e.mo3538i("unbind app, already unbind");
                this.f13010a.m10017a(message, AccsErrorCode.SUCCESS);
                return;
            }
        } else {
            String strM9909f = message.m9909f();
            if (this.f13010a.m10037j().m9873d(strM9909f) && !z10) {
                this.f13014e.mo3538i("bind app from cache");
                AccsState.getInstance().m9842a(this.f13013d, AccsState.BIND_APP_FROM_CACHE, Boolean.TRUE);
                this.f13010a.m10017a(message, AccsErrorCode.SUCCESS);
                return;
            } else if (this.f13010a.m10037j().m9875f(strM9909f) && !z10) {
                return;
            } else {
                this.f13010a.m10037j().m9872c(strM9909f);
            }
        }
        this.f13014e.mo3539i("sendControlMessage", "command", Integer.valueOf(i10));
        this.f13010a.m10028b(message, true);
    }

    @Override // com.taobao.accs.IACCSManager
    public String sendRequest(Context context, ACCSManager.AccsRequest accsRequest) {
        return sendRequest(context, accsRequest, null, true);
    }

    /* renamed from: a */
    private boolean m9982a(Context context) {
        AbstractC7642b abstractC7642b = this.f13010a;
        return abstractC7642b == null || !abstractC7642b.m10037j().m9873d(context.getPackageName());
    }

    /* renamed from: a */
    private Intent m9977a(Context context, int i10) {
        Intent intent = new Intent();
        intent.setAction(Constants.ACTION_COMMAND);
        intent.setClassName(context.getPackageName(), AdapterUtilityImpl.channelService);
        intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
        intent.putExtra("command", i10);
        intent.putExtra(Constants.KEY_APP_KEY, this.f13010a.f13053b);
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.f13013d);
        return intent;
    }

    /* renamed from: a */
    private void m9978a(Context context, int i10, String str, String str2) {
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", i10);
        intent.putExtra(Constants.KEY_SERVICE_ID, str);
        intent.putExtra(Constants.KEY_DATA_ID, str2);
        intent.putExtra(Constants.KEY_APP_KEY, this.f13010a.f13053b);
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.f13013d);
        intent.putExtra(Constants.KEY_ERROR_OBJ, i10 == 2 ? AccsErrorCode.SUCCESS : AccsErrorCode.APP_NOT_BIND);
        C7626g.m9961a(context, intent);
    }
}
