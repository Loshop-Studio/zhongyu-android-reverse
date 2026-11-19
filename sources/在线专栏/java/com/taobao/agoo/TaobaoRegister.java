package com.taobao.agoo;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.error.ErrorCode;
import com.aliyun.ams.emas.push.AgooInnerService;
import com.aliyun.ams.emas.push.C1204l;
import com.aliyun.ams.emas.push.InterfaceC1193a;
import com.aliyun.ams.emas.push.InterfaceC1196d;
import com.aliyun.ams.emas.push.notification.CPushMessage;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.IACCSManager;
import com.taobao.accs.client.AdapterGlobalClientInfo;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.p066a.C1805a;
import com.taobao.agoo.p066a.C1810b;
import com.taobao.agoo.p066a.p067a.C1806a;
import com.taobao.agoo.p066a.p067a.C1808c;
import com.taobao.agoo.p066a.p067a.C1809d;
import com.umeng.analytics.pro.C1896c;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.control.AgooFactory;
import p110k1.C2707a;

/* loaded from: classes.dex */
public final class TaobaoRegister {
    private static final int EVENT_ID = 66001;
    static final String PREFERENCES = "Agoo_AppStore";
    static final String PROPERTY_APP_NOTIFICATION_CUSTOM_SOUND = "app_notification_custom_sound";
    static final String PROPERTY_APP_NOTIFICATION_ICON = "app_notification_icon";
    static final String PROPERTY_APP_NOTIFICATION_SOUND = "app_notification_sound";
    static final String PROPERTY_APP_NOTIFICATION_VIBRATE = "app_notification_vibrate";
    private static final String SERVICEID = "agooSend";
    protected static final String TAG = "TaobaoRegister";
    private static C1810b mRequestListener;

    /* renamed from: com.taobao.agoo.TaobaoRegister$a */
    private static class C1796a implements InterfaceC1797b {

        /* renamed from: a */
        private final String f7847a;

        /* synthetic */ C1796a(String str, C1812c c1812c) {
            this(str);
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC1797b
        /* renamed from: a */
        public byte[] mo6161a(String str, String str2) {
            return C1806a.m6173b(str, str2, this.f7847a);
        }

        private C1796a(String str) {
            this.f7847a = str;
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$b */
    private interface InterfaceC1797b {
        /* renamed from: a */
        byte[] mo6161a(String str, String str2);
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$c */
    private static class C1798c implements InterfaceC1797b {
        private C1798c() {
        }

        /* synthetic */ C1798c(C1812c c1812c) {
            this();
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC1797b
        /* renamed from: a */
        public byte[] mo6161a(String str, String str2) {
            return C1806a.m6172b(str, str2);
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$d */
    private static class C1799d implements InterfaceC1797b {

        /* renamed from: a */
        private final String f7848a;

        /* renamed from: b */
        private final String f7849b;

        /* synthetic */ C1799d(String str, String str2, C1812c c1812c) {
            this(str, str2);
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC1797b
        /* renamed from: a */
        public byte[] mo6161a(String str, String str2) {
            return C1806a.m6171a(str, str2, this.f7848a, this.f7849b);
        }

        private C1799d(String str, String str2) {
            this.f7848a = str;
            this.f7849b = str2;
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$e */
    private static class C1800e implements InterfaceC1797b {
        private C1800e() {
        }

        /* synthetic */ C1800e(C1812c c1812c) {
            this();
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC1797b
        /* renamed from: a */
        public byte[] mo6161a(String str, String str2) {
            return C1806a.m6169a(str, str2);
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$f */
    private static class C1801f implements InterfaceC1797b {

        /* renamed from: a */
        private final String f7850a;

        public C1801f(String str) {
            this.f7850a = str;
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC1797b
        /* renamed from: a */
        public byte[] mo6161a(String str, String str2) {
            return C1806a.m6170a(str, str2, this.f7850a);
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$g */
    private static class C1802g implements InterfaceC1797b {

        /* renamed from: a */
        private final String f7851a;

        public C1802g(String str) {
            this.f7851a = str;
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC1797b
        /* renamed from: a */
        public byte[] mo6161a(String str, String str2) {
            return C1806a.m6175d(str, str2, this.f7851a);
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$h */
    private static class C1803h implements InterfaceC1797b {

        /* renamed from: a */
        private final String f7852a;

        public C1803h(String str) {
            this.f7852a = str;
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC1797b
        /* renamed from: a */
        public byte[] mo6161a(String str, String str2) {
            return C1806a.m6174c(str, str2, this.f7852a);
        }
    }

    private TaobaoRegister() {
        throw new UnsupportedOperationException();
    }

    public static synchronized void addAlias(Context context, String str, ICallback iCallback) {
        ALog.m6093i(TAG, "addAlias", "alias", str);
        ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation("addAlias", context, iCallbackCheckNull, new C1796a(str, null));
            return;
        }
        ErrorCode errorCodeBuild = C1804a.INVALID_ARG.copy().detail("addAlias " + context + " " + str).build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }

    @Deprecated
    public static void bindAgoo(Context context, String str, String str2, CallBack callBack) {
        bindAgoo(context, null);
    }

    private static ICallback checkNull(ICallback iCallback) {
        return iCallback == null ? new ICallback() { // from class: com.taobao.agoo.TaobaoRegister.3
            @Override // com.taobao.agoo.ICallback
            public void onFailure(String str, String str2) {
            }

            @Override // com.taobao.agoo.ICallback
            public void onSuccess() {
            }
        } : iCallback;
    }

    public static void clearNotificationCreatedByAliyun(Context context) {
        C2707a.m9029a().m9032c(context);
    }

    public static void clickMessage(Context context, String str, String str2) {
        AgooFactory.getInstance(context).clickMessage(context, str, str2);
    }

    public static void dismissMessage(Context context, String str, String str2) {
        AgooFactory.getInstance(context).dismissMessage(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doAliasOperation(String str, Context context, ICallback iCallback, InterfaceC1797b interfaceC1797b) {
        ErrorCode errorCodeBuild;
        ALog.m6093i(TAG, str, new Object[0]);
        String deviceToken = Config.getDeviceToken(context);
        String strM10016b = Config.m10016b(context);
        if (TextUtils.isEmpty(strM10016b) || TextUtils.isEmpty(deviceToken) || context == null) {
            if (iCallback != null) {
                if (context == null) {
                    errorCodeBuild = C1804a.INVALID_ARG.copy().detail(str + " context is null").build();
                } else if (TextUtils.isEmpty(deviceToken)) {
                    errorCodeBuild = C1804a.INVALID_ARG.copy().detail(str + " deviceId is null").build();
                } else {
                    errorCodeBuild = C1804a.INVALID_ARG.copy().detail(str + " appKey is null").build();
                }
                iCallback.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }
            ALog.m6092e(TAG, str + " param null", "appkey", strM10016b, "deviceId", deviceToken, C1896c.f8557R, context);
            return;
        }
        try {
            if (mRequestListener == null) {
                mRequestListener = new C1810b(context.getApplicationContext());
            }
            IACCSManager accsInstance = ACCSManager.getAccsInstance(context, strM10016b, Config.m10020d(context));
            if (!C1810b.f7881b.m6168b(context.getPackageName())) {
                if (iCallback != null) {
                    ErrorCode errorCode = C1804a.AGOO_NOT_BIND;
                    iCallback.onFailure(errorCode.getCode(), errorCode.getMsg());
                    return;
                }
                return;
            }
            accsInstance.registerDataListener(context, "AgooDeviceCmd", mRequestListener);
            String strSendRequest = accsInstance.sendRequest(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", interfaceC1797b.mo6161a(strM10016b, deviceToken), null));
            if (!TextUtils.isEmpty(strSendRequest)) {
                if (iCallback != null) {
                    mRequestListener.f7882a.put(strSendRequest, iCallback);
                }
            } else if (iCallback != null) {
                ErrorCode errorCode2 = C1804a.ACCS_CHECK_ERROR;
                iCallback.onFailure(errorCode2.getCode(), errorCode2.getMsg());
            }
        } catch (Throwable th) {
            ALog.m6091e(TAG, str, th, new Object[0]);
        }
    }

    public static boolean isPushApi() {
        return AgooInnerService.class.getName().equals(AdapterGlobalClientInfo.mAgooCustomServiceName);
    }

    public static synchronized void listAlias(Context context, IListAliasCallback iListAliasCallback) {
        ALog.m6093i(TAG, "listAlias", new Object[0]);
        ICallback iCallbackCheckNull = checkNull(iListAliasCallback);
        if (context != null) {
            doAliasOperation("listAlias", context, iCallbackCheckNull, new C1798c(null));
        } else {
            ErrorCode errorCodeBuild = C1804a.INVALID_ARG.copy().detail("listAlias context is null").build();
            iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
    }

    public static void pingApp(Context context, String str, String str2, String str3, int i4) {
        AgooFactory.getInstance(context).getNotifyManager().pingApp(str, str2, str3, i4);
    }

    @Deprecated
    public static synchronized void register(Context context, String str, String str2, String str3, IRegister iRegister) throws AccsException {
        register(context, str, str, str2, str3, iRegister);
    }

    public static synchronized void removeAlias(final Context context, ICallback iCallback) {
        ALog.m6093i(TAG, C1806a.JSON_CMD_REMOVEALIAS, new Object[0]);
        final ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null) {
            doAliasOperation("removeAllAlias", context, new ICallback() { // from class: com.taobao.agoo.TaobaoRegister.5
                @Override // com.taobao.agoo.ICallback
                public void onFailure(String str, String str2) {
                    TaobaoRegister.doAliasOperation("listAlias", context, new IListAliasCallbackInner() { // from class: com.taobao.agoo.TaobaoRegister.5.1
                        @Override // com.taobao.agoo.ICallback
                        public void onFailure(String str3, String str4) {
                            ArrayList<String> arrayListM6184a = C1811b.m6184a(context);
                            if (arrayListM6184a == null || arrayListM6184a.size() <= 0) {
                                ICallback iCallback2 = iCallbackCheckNull;
                                ErrorCode errorCode = C1804a.REMOVE_ALIAS_FAIL_NO_ALIAS;
                                iCallback2.onFailure(errorCode.getCode(), errorCode.getMsg());
                                return;
                            }
                            String str5 = arrayListM6184a.get(0);
                            String strM6182a = C1811b.m6182a(context, str5);
                            if (strM6182a == null || strM6182a.isEmpty() || str5 == null) {
                                ICallback iCallback3 = iCallbackCheckNull;
                                ErrorCode errorCode2 = C1804a.REMOVE_ALIAS_FAIL_NO_TOKEN;
                                iCallback3.onFailure(errorCode2.getCode(), errorCode2.getMsg());
                            } else {
                                C17945 c17945 = C17945.this;
                                ICallback iCallback4 = iCallbackCheckNull;
                                iCallback4.extra = str5;
                                TaobaoRegister.doAliasOperation(C1806a.JSON_CMD_REMOVEALIAS, context, iCallback4, new C1799d(str5, strM6182a, null));
                            }
                        }

                        @Override // com.taobao.agoo.IListAliasCallbackInner
                        public void onSuccess(Map<String, String> map) {
                            C17945 c17945 = C17945.this;
                            TaobaoRegister.removeAliasInList(context, map, iCallbackCheckNull);
                        }
                    }, new C1798c(null));
                }

                @Override // com.taobao.agoo.ICallback
                public void onSuccess() {
                    iCallbackCheckNull.onSuccess();
                }
            }, new C1800e(null));
        } else {
            ErrorCode errorCodeBuild = C1804a.INVALID_ARG.copy().detail("removeAlias before 2.4.x context is null").build();
            iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void removeAliasInList(Context context, Map<String, String> map, final ICallback iCallback) {
        if (map == null || map.size() == 0) {
            iCallback.onSuccess();
            return;
        }
        final ArrayList arrayList = new ArrayList(map.keySet());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (final String str : map.keySet()) {
            doAliasOperation(C1806a.JSON_CMD_REMOVEALIAS, context, new ICallback() { // from class: com.taobao.agoo.TaobaoRegister.2
                @Override // com.taobao.agoo.ICallback
                public void onFailure(String str2, String str3) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        iCallback.onFailure(str2, str3);
                    }
                }

                @Override // com.taobao.agoo.ICallback
                public void onSuccess() {
                    arrayList.remove(str);
                    if (atomicBoolean.get() || arrayList.size() != 0) {
                        return;
                    }
                    iCallback.onSuccess();
                }
            }, new C1799d(str, map.get(str), null));
        }
    }

    public static synchronized void removeAllAliasOnCurrentDevice(Context context, ICallback iCallback) {
        ALog.m6093i(TAG, "removeAllAliasOnCurrentDevice ", new Object[0]);
        ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null) {
            doAliasOperation("removeAllAliasOnCurrentDevice", context, iCallbackCheckNull, new C1800e(null));
            return;
        }
        ErrorCode errorCodeBuild = C1804a.INVALID_ARG.copy().detail("removeAllAliasOnCurrentDevice " + context).build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }

    public static synchronized void removeAllAliasOnCurrentDeviceAndAddThisAlias(Context context, String str, ICallback iCallback) {
        ALog.m6093i(TAG, "removeAllAliasOnCurrentDeviceAndAddThisAlias alias : " + str, new Object[0]);
        ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation("removeAllAliasOnCurrentDeviceAndAddThisAlias", context, iCallbackCheckNull, new C1803h(str));
            return;
        }
        ErrorCode errorCodeBuild = C1804a.INVALID_ARG.copy().detail("removeAllAliasOnCurrentDeviceAndAddThisAlias context is null").build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }

    public static synchronized void removeAllDeviceOnThisAliasAndBindCurrentDevice(Context context, String str, ICallback iCallback) {
        ALog.m6093i(TAG, "removeAllDeviceOnThisAliasAndBindCurrentDevice alias : " + str, new Object[0]);
        ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation("removeAllDeviceOnThisAliasAndBindCurrentDevice", context, iCallbackCheckNull, new C1801f(str));
            return;
        }
        ErrorCode errorCodeBuild = C1804a.INVALID_ARG.copy().detail("removeAllDeviceOnThisAliasAndBindCurrentDevice context is null").build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }

    public static void reset() {
        C1805a c1805a = C1810b.f7881b;
        if (c1805a != null) {
            c1805a.m6166a();
        }
        try {
            ACCSClient.getAccsClient(Config.f11421a).reset();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Config.m10012a(GlobalClientInfo.getContext());
    }

    public static synchronized void resetDeviceAndAliasToOne2One(Context context, String str, ICallback iCallback) {
        ALog.m6093i(TAG, "resetDeviceAndAliasToOne2One alias : " + str, new Object[0]);
        ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation("resetDeviceAndAliasToOne2One", context, iCallbackCheckNull, new C1802g(str));
            return;
        }
        ErrorCode errorCodeBuild = C1804a.INVALID_ARG.copy().detail("resetDeviceAndAliasToOne2One " + context + " " + str).build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }

    private static synchronized void sendSwitch(Context context, ICallback iCallback, boolean z3) {
        String deviceToken;
        String strM10016b;
        String deviceId;
        try {
            deviceToken = Config.getDeviceToken(context);
            strM10016b = Config.m10016b(context);
            deviceId = UtilityImpl.getDeviceId(context);
        } catch (Throwable th) {
            ALog.m6091e(TAG, "sendSwitch", th, new Object[0]);
        }
        if (!TextUtils.isEmpty(strM10016b) && context != null && (!TextUtils.isEmpty(deviceToken) || !TextUtils.isEmpty(deviceId))) {
            IACCSManager accsInstance = ACCSManager.getAccsInstance(context, strM10016b, Config.m10020d(context));
            if (mRequestListener == null) {
                mRequestListener = new C1810b(context.getApplicationContext());
            }
            accsInstance.registerDataListener(context, "AgooDeviceCmd", mRequestListener);
            String strSendRequest = accsInstance.sendRequest(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", C1809d.m6179a(strM10016b, deviceToken, deviceId, z3), null));
            if (TextUtils.isEmpty(strSendRequest)) {
                if (iCallback != null) {
                    ErrorCode errorCode = C1804a.ACCS_CHECK_ERROR;
                    iCallback.onFailure(errorCode.getCode(), errorCode.getMsg());
                }
            } else if (iCallback != null) {
                mRequestListener.f7882a.put(strSendRequest, iCallback);
            }
            return;
        }
        if (iCallback != null) {
            ErrorCode errorCodeBuild = C1804a.INVALID_ARG.copy().detail("sendSwitch " + context + " " + strM10016b + " " + deviceToken + " " + deviceId).build();
            iCallback.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
        ALog.m6092e(TAG, "sendSwitch param null", "appkey", strM10016b, "deviceId", deviceToken, C1896c.f8557R, context, C1809d.JSON_CMD_ENABLEPUSH, Boolean.valueOf(z3));
    }

    public static synchronized void setAccsConfigTag(Context context, String str) {
        Config.f11421a = str;
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag == null) {
            throw new RuntimeException("accs config not exist!! please set accs config first!!");
        }
        ALog.m6093i(TAG, "setAccsConfigTag", "config", configByTag.toString());
        AdapterGlobalClientInfo.mAuthCode = configByTag.getAuthCode();
        Config.setAgooAppKey(context, configByTag.getAppKey());
        AdapterUtilityImpl.mAgooAppSecret = configByTag.getAppSecret();
        Config.m10015a(context, configByTag.getAppSecret());
        if (!TextUtils.isEmpty(AdapterUtilityImpl.mAgooAppSecret)) {
            AdapterGlobalClientInfo.mSecurityType = 2;
        }
        C1204l.m5391c(context);
    }

    public static void setAgooMsgReceiveService(String str) {
        AdapterGlobalClientInfo.mAgooCustomServiceName = str;
    }

    public static synchronized void setAlias(final Context context, final String str, ICallback iCallback) {
        ALog.m6093i(TAG, "setAlias " + str, new Object[0]);
        final ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation("listAlias", context, new IListAliasCallbackInner() { // from class: com.taobao.agoo.TaobaoRegister.4
                @Override // com.taobao.agoo.ICallback
                public void onFailure(String str2, String str3) {
                    ICallback iCallback2 = iCallbackCheckNull;
                    String str4 = str;
                    iCallback2.extra = str4;
                    TaobaoRegister.doAliasOperation(C1806a.JSON_CMD_ADDALIAS, context, iCallback2, new C1796a(str4, null));
                }

                @Override // com.taobao.agoo.IListAliasCallbackInner
                public void onSuccess(Map<String, String> map) {
                    TaobaoRegister.removeAliasInList(context, map, new ICallback() { // from class: com.taobao.agoo.TaobaoRegister.4.1
                        @Override // com.taobao.agoo.ICallback
                        public void onFailure(String str2, String str3) {
                            iCallbackCheckNull.onFailure(str2, str3);
                        }

                        @Override // com.taobao.agoo.ICallback
                        public void onSuccess() {
                            C17934 c17934 = C17934.this;
                            TaobaoRegister.doAliasOperation(C1806a.JSON_CMD_ADDALIAS, context, iCallbackCheckNull, new C1796a(str, null));
                        }
                    });
                }
            }, new C1798c(null));
            return;
        }
        ErrorCode errorCodeBuild = C1804a.INVALID_ARG.copy().detail("setAlias " + context + " " + str).build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }

    @Deprecated
    public static void setBuilderSound(Context context, String str) {
    }

    public static void setDoNotDisturb(int i4, int i5, int i6, int i7, InterfaceC1193a interfaceC1193a) {
        C1204l.m5390b(i4, i5, i6, i7, interfaceC1193a);
    }

    public static void setDoNotDisturbMode(boolean z3) {
        C1204l.m5396h(z3);
    }

    public static void setEnv(Context context, @AccsClientConfig.ENV int i4) {
        ACCSClient.setEnvironment(context, i4);
    }

    @Deprecated
    public static void setNotificationIcon(Context context, int i4) {
    }

    @Deprecated
    public static void setNotificationSound(Context context, boolean z3) {
    }

    @Deprecated
    public static void setNotificationVibrate(Context context, boolean z3) {
    }

    public static void setPushMsgReceiveService(Class cls) {
        AdapterGlobalClientInfo.mAgooCustomServiceName = AgooInnerService.class.getName();
        C1204l.m5395g(cls);
    }

    public static void setReportPushArrive(InterfaceC1196d interfaceC1196d) {
        C1204l.m5393e(interfaceC1196d);
    }

    @Deprecated
    public static void unBindAgoo(Context context, String str, String str2, CallBack callBack) {
        unbindAgoo(context, null);
    }

    public static void unbindAgoo(Context context, ICallback iCallback) {
        sendSwitch(context, iCallback, false);
        UTMini.getInstance().commitEvent(EVENT_ID, "unregister", UtilityImpl.getDeviceId(context));
    }

    @Deprecated
    public static void unregister(Context context, CallBack callBack) {
        unbindAgoo(context, null);
    }

    public static void bindAgoo(Context context, ICallback iCallback) {
        sendSwitch(context, iCallback, true);
        UTMini.getInstance().commitEvent(EVENT_ID, "bindAgoo", UtilityImpl.getDeviceId(context));
    }

    public static void clickMessage(CPushMessage cPushMessage) {
        C1204l.m5394f(cPushMessage);
    }

    public static void dismissMessage(CPushMessage cPushMessage) {
        C1204l.m5397i(cPushMessage);
    }

    public static synchronized void register(Context context, String str, String str2, String str3, String str4, IRegister iRegister) throws AccsException {
        if (context != null) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                ALog.m6093i(TAG, C1808c.JSON_CMD_REGISTER, Constants.KEY_APP_KEY, str2, Constants.KEY_CONFIG_TAG, str);
                Context applicationContext = context.getApplicationContext();
                Config.f11421a = str;
                Config.setAgooAppKey(context, str2);
                AdapterUtilityImpl.mAgooAppSecret = str3;
                Config.m10015a(context, str3);
                if (!TextUtils.isEmpty(str3)) {
                    AdapterGlobalClientInfo.mSecurityType = 2;
                }
                C1204l.m5391c(context);
                AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                if (configByTag == null) {
                    new AccsClientConfig.Builder().setAppKey(str2).setAppSecret(str3).setTag(str).build();
                } else {
                    AdapterGlobalClientInfo.mAuthCode = configByTag.getAuthCode();
                }
                IACCSManager accsInstance = ACCSManager.getAccsInstance(context, str2, str);
                accsInstance.bindApp(applicationContext, str2, str3, str4, new C1812c(iRegister, applicationContext, accsInstance, str2, str4));
                return;
            }
        }
        ALog.m6092e(TAG, "register params null", "appkey", str2, Constants.KEY_CONFIG_TAG, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized void removeAlias(final Context context, final String str, ICallback iCallback) {
        ALog.m6093i(TAG, "removeAlias " + str, new Object[0]);
        final ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation(C1806a.JSON_CMD_REMOVEALIAS, context, new ICallback() { // from class: com.taobao.agoo.TaobaoRegister.6
                @Override // com.taobao.agoo.ICallback
                public void onFailure(final String str2, final String str3) {
                    TaobaoRegister.doAliasOperation("listAlias", context, new IListAliasCallbackInner() { // from class: com.taobao.agoo.TaobaoRegister.6.1
                        @Override // com.taobao.agoo.ICallback
                        public void onFailure(String str4, String str5) {
                            iCallbackCheckNull.onFailure(str4, str5);
                        }

                        @Override // com.taobao.agoo.IListAliasCallbackInner
                        public void onSuccess(Map<String, String> map) {
                            String str4 = map.get(str);
                            if (str4 == null) {
                                iCallbackCheckNull.onFailure(str2, str3);
                            } else {
                                C17956 c17956 = C17956.this;
                                TaobaoRegister.doAliasOperation(C1806a.JSON_CMD_REMOVEALIAS, context, iCallbackCheckNull, new C1799d(str, str4, null));
                            }
                        }
                    }, new C1798c(null));
                }

                @Override // com.taobao.agoo.ICallback
                public void onSuccess() {
                    iCallbackCheckNull.onSuccess();
                }
            }, new C1799d(str, null, 0 == true ? 1 : 0));
            return;
        }
        ErrorCode errorCodeBuild = C1804a.INVALID_ARG.copy().detail("removeAlias " + context + " " + str).build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }
}
