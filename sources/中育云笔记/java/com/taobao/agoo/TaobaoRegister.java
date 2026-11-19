package com.taobao.agoo;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.error.ErrorCode;
import com.aliyun.ams.emas.push.AgooInnerService;
import com.aliyun.ams.emas.push.notification.CPushMessage;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.IACCSManager;
import com.taobao.accs.client.AdapterGlobalClientInfo;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.p087a.C7704a;
import com.taobao.agoo.p087a.C7709b;
import com.taobao.agoo.p087a.p088a.C7705a;
import com.taobao.agoo.p087a.p088a.C7707c;
import com.taobao.agoo.p087a.p088a.C7708d;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.control.AgooFactory;
import p038c0.AbstractC5218n;
import p038c0.InterfaceC5207c;
import p038c0.InterfaceC5210f;
import p108d0.C8899a;

/* loaded from: classes5.dex */
public final class TaobaoRegister {
    private static final int EVENT_ID = 66001;
    static final String PREFERENCES = "Agoo_AppStore";
    static final String PROPERTY_APP_NOTIFICATION_CUSTOM_SOUND = "app_notification_custom_sound";
    static final String PROPERTY_APP_NOTIFICATION_ICON = "app_notification_icon";
    static final String PROPERTY_APP_NOTIFICATION_SOUND = "app_notification_sound";
    static final String PROPERTY_APP_NOTIFICATION_VIBRATE = "app_notification_vibrate";
    private static final String SERVICEID = "agooSend";
    protected static final String TAG = "TaobaoRegister";
    private static C7709b mRequestListener;

    /* renamed from: com.taobao.agoo.TaobaoRegister$a */
    public static class C7695a implements InterfaceC7696b {

        /* renamed from: a */
        private final String f13245a;

        public /* synthetic */ C7695a(String str, C7711c c7711c) {
            this(str);
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC7696b
        /* renamed from: a */
        public byte[] mo10187a(String str, String str2) {
            return C7705a.m10199b(str, str2, this.f13245a);
        }

        private C7695a(String str) {
            this.f13245a = str;
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$b */
    public interface InterfaceC7696b {
        /* renamed from: a */
        byte[] mo10187a(String str, String str2);
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$c */
    public static class C7697c implements InterfaceC7696b {
        private C7697c() {
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC7696b
        /* renamed from: a */
        public byte[] mo10187a(String str, String str2) {
            return C7705a.m10198b(str, str2);
        }

        public /* synthetic */ C7697c(C7711c c7711c) {
            this();
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$d */
    public static class C7698d implements InterfaceC7696b {

        /* renamed from: a */
        private final String f13246a;

        /* renamed from: b */
        private final String f13247b;

        public /* synthetic */ C7698d(String str, String str2, C7711c c7711c) {
            this(str, str2);
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC7696b
        /* renamed from: a */
        public byte[] mo10187a(String str, String str2) {
            return C7705a.m10197a(str, str2, this.f13246a, this.f13247b);
        }

        private C7698d(String str, String str2) {
            this.f13246a = str;
            this.f13247b = str2;
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$e */
    public static class C7699e implements InterfaceC7696b {
        private C7699e() {
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC7696b
        /* renamed from: a */
        public byte[] mo10187a(String str, String str2) {
            return C7705a.m10195a(str, str2);
        }

        public /* synthetic */ C7699e(C7711c c7711c) {
            this();
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$f */
    public static class C7700f implements InterfaceC7696b {

        /* renamed from: a */
        private final String f13248a;

        public C7700f(String str) {
            this.f13248a = str;
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC7696b
        /* renamed from: a */
        public byte[] mo10187a(String str, String str2) {
            return C7705a.m10196a(str, str2, this.f13248a);
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$g */
    public static class C7701g implements InterfaceC7696b {

        /* renamed from: a */
        private final String f13249a;

        public C7701g(String str) {
            this.f13249a = str;
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC7696b
        /* renamed from: a */
        public byte[] mo10187a(String str, String str2) {
            return C7705a.m10201d(str, str2, this.f13249a);
        }
    }

    /* renamed from: com.taobao.agoo.TaobaoRegister$h */
    public static class C7702h implements InterfaceC7696b {

        /* renamed from: a */
        private final String f13250a;

        public C7702h(String str) {
            this.f13250a = str;
        }

        @Override // com.taobao.agoo.TaobaoRegister.InterfaceC7696b
        /* renamed from: a */
        public byte[] mo10187a(String str, String str2) {
            return C7705a.m10200c(str, str2, this.f13250a);
        }
    }

    private TaobaoRegister() {
        throw new UnsupportedOperationException();
    }

    public static synchronized void addAlias(Context context, String str, ICallback iCallback) {
        ALog.m10119i(TAG, "addAlias", "alias", str);
        ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation("addAlias", context, iCallbackCheckNull, new C7695a(str, null));
            return;
        }
        ErrorCode errorCodeBuild = C7703a.INVALID_ARG.copy().detail("addAlias " + context + " " + str).build();
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
        C8899a.m17429a().m17431c(context);
    }

    public static void clickMessage(Context context, String str, String str2) {
        AgooFactory.getInstance(context).clickMessage(context, str, str2);
    }

    public static void dismissMessage(Context context, String str, String str2) {
        AgooFactory.getInstance(context).dismissMessage(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doAliasOperation(String str, Context context, ICallback iCallback, InterfaceC7696b interfaceC7696b) {
        ErrorCode errorCodeBuild;
        ALog.m10119i(TAG, str, new Object[0]);
        String deviceToken = Config.getDeviceToken(context);
        String strM22234b = Config.m22234b(context);
        if (TextUtils.isEmpty(strM22234b) || TextUtils.isEmpty(deviceToken) || context == null) {
            if (iCallback != null) {
                if (context == null) {
                    errorCodeBuild = C7703a.INVALID_ARG.copy().detail(str + " context is null").build();
                } else if (TextUtils.isEmpty(deviceToken)) {
                    errorCodeBuild = C7703a.INVALID_ARG.copy().detail(str + " deviceId is null").build();
                } else {
                    errorCodeBuild = C7703a.INVALID_ARG.copy().detail(str + " appKey is null").build();
                }
                iCallback.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }
            ALog.m10118e(TAG, str + " param null", "appkey", strM22234b, "deviceId", deviceToken, "context", context);
            return;
        }
        try {
            if (mRequestListener == null) {
                mRequestListener = new C7709b(context.getApplicationContext());
            }
            IACCSManager accsInstance = ACCSManager.getAccsInstance(context, strM22234b, Config.m22238d(context));
            if (!C7709b.f13279b.m10194b(context.getPackageName())) {
                if (iCallback != null) {
                    ErrorCode errorCode = C7703a.AGOO_NOT_BIND;
                    iCallback.onFailure(errorCode.getCode(), errorCode.getMsg());
                    return;
                }
                return;
            }
            accsInstance.registerDataListener(context, "AgooDeviceCmd", mRequestListener);
            String strSendRequest = accsInstance.sendRequest(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", interfaceC7696b.mo10187a(strM22234b, deviceToken), null));
            if (!TextUtils.isEmpty(strSendRequest)) {
                if (iCallback != null) {
                    mRequestListener.f13280a.put(strSendRequest, iCallback);
                }
            } else if (iCallback != null) {
                ErrorCode errorCode2 = C7703a.ACCS_CHECK_ERROR;
                iCallback.onFailure(errorCode2.getCode(), errorCode2.getMsg());
            }
        } catch (Throwable th) {
            ALog.m10117e(TAG, str, th, new Object[0]);
        }
    }

    public static boolean isPushApi() {
        return AgooInnerService.class.getName().equals(AdapterGlobalClientInfo.mAgooCustomServiceName);
    }

    public static synchronized void listAlias(Context context, IListAliasCallback iListAliasCallback) {
        ALog.m10119i(TAG, "listAlias", new Object[0]);
        ICallback iCallbackCheckNull = checkNull(iListAliasCallback);
        if (context != null) {
            doAliasOperation("listAlias", context, iCallbackCheckNull, new C7697c(null));
        } else {
            ErrorCode errorCodeBuild = C7703a.INVALID_ARG.copy().detail("listAlias context is null").build();
            iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
    }

    public static void pingApp(Context context, String str, String str2, String str3, int i10) {
        AgooFactory.getInstance(context).getNotifyManager().pingApp(str, str2, str3, i10);
    }

    @Deprecated
    public static synchronized void register(Context context, String str, String str2, String str3, IRegister iRegister) {
        register(context, str, str, str2, str3, iRegister);
    }

    public static synchronized void removeAlias(final Context context, ICallback iCallback) {
        ALog.m10119i(TAG, C7705a.JSON_CMD_REMOVEALIAS, new Object[0]);
        final ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null) {
            doAliasOperation("removeAllAlias", context, new ICallback() { // from class: com.taobao.agoo.TaobaoRegister.5
                @Override // com.taobao.agoo.ICallback
                public void onFailure(String str, String str2) {
                    TaobaoRegister.doAliasOperation("listAlias", context, new IListAliasCallbackInner() { // from class: com.taobao.agoo.TaobaoRegister.5.1
                        @Override // com.taobao.agoo.ICallback
                        public void onFailure(String str3, String str4) {
                            ArrayList<String> arrayListM10210a = C7710b.m10210a(context);
                            if (arrayListM10210a == null || arrayListM10210a.size() <= 0) {
                                ICallback iCallback2 = iCallbackCheckNull;
                                ErrorCode errorCode = C7703a.REMOVE_ALIAS_FAIL_NO_ALIAS;
                                iCallback2.onFailure(errorCode.getCode(), errorCode.getMsg());
                                return;
                            }
                            String str5 = arrayListM10210a.get(0);
                            String strM10208a = C7710b.m10208a(context, str5);
                            if (strM10208a == null || strM10208a.isEmpty() || str5 == null) {
                                ICallback iCallback3 = iCallbackCheckNull;
                                ErrorCode errorCode2 = C7703a.REMOVE_ALIAS_FAIL_NO_TOKEN;
                                iCallback3.onFailure(errorCode2.getCode(), errorCode2.getMsg());
                            } else {
                                C76935 c76935 = C76935.this;
                                ICallback iCallback4 = iCallbackCheckNull;
                                iCallback4.extra = str5;
                                TaobaoRegister.doAliasOperation(C7705a.JSON_CMD_REMOVEALIAS, context, iCallback4, new C7698d(str5, strM10208a, null));
                            }
                        }

                        @Override // com.taobao.agoo.IListAliasCallbackInner
                        public void onSuccess(Map<String, String> map) {
                            C76935 c76935 = C76935.this;
                            TaobaoRegister.removeAliasInList(context, map, iCallbackCheckNull);
                        }
                    }, new C7697c(null));
                }

                @Override // com.taobao.agoo.ICallback
                public void onSuccess() {
                    iCallbackCheckNull.onSuccess();
                }
            }, new C7699e(null));
        } else {
            ErrorCode errorCodeBuild = C7703a.INVALID_ARG.copy().detail("removeAlias before 2.4.x context is null").build();
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
            doAliasOperation(C7705a.JSON_CMD_REMOVEALIAS, context, new ICallback() { // from class: com.taobao.agoo.TaobaoRegister.2
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
            }, new C7698d(str, map.get(str), null));
        }
    }

    public static synchronized void removeAllAliasOnCurrentDevice(Context context, ICallback iCallback) {
        ALog.m10119i(TAG, "removeAllAliasOnCurrentDevice ", new Object[0]);
        ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null) {
            doAliasOperation("removeAllAliasOnCurrentDevice", context, iCallbackCheckNull, new C7699e(null));
            return;
        }
        ErrorCode errorCodeBuild = C7703a.INVALID_ARG.copy().detail("removeAllAliasOnCurrentDevice " + context).build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }

    public static synchronized void removeAllAliasOnCurrentDeviceAndAddThisAlias(Context context, String str, ICallback iCallback) {
        ALog.m10119i(TAG, "removeAllAliasOnCurrentDeviceAndAddThisAlias alias : " + str, new Object[0]);
        ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation("removeAllAliasOnCurrentDeviceAndAddThisAlias", context, iCallbackCheckNull, new C7702h(str));
            return;
        }
        ErrorCode errorCodeBuild = C7703a.INVALID_ARG.copy().detail("removeAllAliasOnCurrentDeviceAndAddThisAlias context is null").build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }

    public static synchronized void removeAllDeviceOnThisAliasAndBindCurrentDevice(Context context, String str, ICallback iCallback) {
        ALog.m10119i(TAG, "removeAllDeviceOnThisAliasAndBindCurrentDevice alias : " + str, new Object[0]);
        ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation("removeAllDeviceOnThisAliasAndBindCurrentDevice", context, iCallbackCheckNull, new C7700f(str));
            return;
        }
        ErrorCode errorCodeBuild = C7703a.INVALID_ARG.copy().detail("removeAllDeviceOnThisAliasAndBindCurrentDevice context is null").build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }

    public static void reset() {
        C7704a c7704a = C7709b.f13279b;
        if (c7704a != null) {
            c7704a.m10192a();
        }
        try {
            ACCSClient.getAccsClient(Config.f25303a).reset();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Config.m22230a(GlobalClientInfo.getContext());
    }

    public static synchronized void resetDeviceAndAliasToOne2One(Context context, String str, ICallback iCallback) {
        ALog.m10119i(TAG, "resetDeviceAndAliasToOne2One alias : " + str, new Object[0]);
        ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation("resetDeviceAndAliasToOne2One", context, iCallbackCheckNull, new C7701g(str));
            return;
        }
        ErrorCode errorCodeBuild = C7703a.INVALID_ARG.copy().detail("resetDeviceAndAliasToOne2One " + context + " " + str).build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }

    private static synchronized void sendSwitch(Context context, ICallback iCallback, boolean z10) {
        String deviceToken;
        String strM22234b;
        String deviceId;
        try {
            deviceToken = Config.getDeviceToken(context);
            strM22234b = Config.m22234b(context);
            deviceId = UtilityImpl.getDeviceId(context);
        } finally {
            return;
        }
        if (!TextUtils.isEmpty(strM22234b) && context != null && (!TextUtils.isEmpty(deviceToken) || !TextUtils.isEmpty(deviceId))) {
            IACCSManager accsInstance = ACCSManager.getAccsInstance(context, strM22234b, Config.m22238d(context));
            if (mRequestListener == null) {
                mRequestListener = new C7709b(context.getApplicationContext());
            }
            accsInstance.registerDataListener(context, "AgooDeviceCmd", mRequestListener);
            String strSendRequest = accsInstance.sendRequest(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", C7708d.m10205a(strM22234b, deviceToken, deviceId, z10), null));
            if (TextUtils.isEmpty(strSendRequest)) {
                if (iCallback != null) {
                    ErrorCode errorCode = C7703a.ACCS_CHECK_ERROR;
                    iCallback.onFailure(errorCode.getCode(), errorCode.getMsg());
                }
            } else if (iCallback != null) {
                mRequestListener.f13280a.put(strSendRequest, iCallback);
            }
            return;
        }
        if (iCallback != null) {
            ErrorCode errorCodeBuild = C7703a.INVALID_ARG.copy().detail("sendSwitch " + context + " " + strM22234b + " " + deviceToken + " " + deviceId).build();
            iCallback.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
        ALog.m10118e(TAG, "sendSwitch param null", "appkey", strM22234b, "deviceId", deviceToken, "context", context, C7708d.JSON_CMD_ENABLEPUSH, Boolean.valueOf(z10));
    }

    public static synchronized void setAccsConfigTag(Context context, String str) {
        try {
            Config.f25303a = str;
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            if (configByTag == null) {
                throw new RuntimeException("accs config not exist!! please set accs config first!!");
            }
            ALog.m10119i(TAG, "setAccsConfigTag", "config", configByTag.toString());
            AdapterGlobalClientInfo.mAuthCode = configByTag.getAuthCode();
            Config.setAgooAppKey(context, configByTag.getAppKey());
            AdapterUtilityImpl.mAgooAppSecret = configByTag.getAppSecret();
            Config.m22233a(context, configByTag.getAppSecret());
            if (!TextUtils.isEmpty(AdapterUtilityImpl.mAgooAppSecret)) {
                AdapterGlobalClientInfo.mSecurityType = 2;
            }
            AbstractC5218n.m2786c(context);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void setAgooMsgReceiveService(String str) {
        AdapterGlobalClientInfo.mAgooCustomServiceName = str;
    }

    public static synchronized void setAlias(final Context context, final String str, ICallback iCallback) {
        ALog.m10119i(TAG, "setAlias " + str, new Object[0]);
        final ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation("listAlias", context, new IListAliasCallbackInner() { // from class: com.taobao.agoo.TaobaoRegister.4
                @Override // com.taobao.agoo.ICallback
                public void onFailure(String str2, String str3) {
                    ICallback iCallback2 = iCallbackCheckNull;
                    String str4 = str;
                    iCallback2.extra = str4;
                    TaobaoRegister.doAliasOperation(C7705a.JSON_CMD_ADDALIAS, context, iCallback2, new C7695a(str4, null));
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
                            C76924 c76924 = C76924.this;
                            TaobaoRegister.doAliasOperation(C7705a.JSON_CMD_ADDALIAS, context, iCallbackCheckNull, new C7695a(str, null));
                        }
                    });
                }
            }, new C7697c(null));
            return;
        }
        ErrorCode errorCodeBuild = C7703a.INVALID_ARG.copy().detail("setAlias " + context + " " + str).build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }

    @Deprecated
    public static void setBuilderSound(Context context, String str) {
    }

    public static void setDoNotDisturb(int i10, int i11, int i12, int i13, InterfaceC5207c interfaceC5207c) {
        AbstractC5218n.m2785b(i10, i11, i12, i13, interfaceC5207c);
    }

    public static void setDoNotDisturbMode(boolean z10) {
        AbstractC5218n.m2791h(z10);
    }

    public static void setEnv(Context context, @AccsClientConfig.ENV int i10) {
        ACCSClient.setEnvironment(context, i10);
    }

    @Deprecated
    public static void setNotificationIcon(Context context, int i10) {
    }

    @Deprecated
    public static void setNotificationSound(Context context, boolean z10) {
    }

    @Deprecated
    public static void setNotificationVibrate(Context context, boolean z10) {
    }

    public static void setPushMsgReceiveService(Class cls) {
        AdapterGlobalClientInfo.mAgooCustomServiceName = AgooInnerService.class.getName();
        AbstractC5218n.m2790g(cls);
    }

    public static void setReportPushArrive(InterfaceC5210f interfaceC5210f) {
        AbstractC5218n.m2788e(interfaceC5210f);
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
        AbstractC5218n.m2789f(cPushMessage);
    }

    public static void dismissMessage(CPushMessage cPushMessage) {
        AbstractC5218n.m2792i(cPushMessage);
    }

    public static synchronized void register(Context context, String str, String str2, String str3, String str4, IRegister iRegister) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                    ALog.m10119i(TAG, C7707c.JSON_CMD_REGISTER, Constants.KEY_APP_KEY, str2, Constants.KEY_CONFIG_TAG, str);
                    Context applicationContext = context.getApplicationContext();
                    Config.f25303a = str;
                    Config.setAgooAppKey(context, str2);
                    AdapterUtilityImpl.mAgooAppSecret = str3;
                    Config.m22233a(context, str3);
                    if (!TextUtils.isEmpty(str3)) {
                        AdapterGlobalClientInfo.mSecurityType = 2;
                    }
                    AbstractC5218n.m2786c(context);
                    AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                    if (configByTag == null) {
                        new AccsClientConfig.Builder().setAppKey(str2).setAppSecret(str3).setTag(str).build();
                    } else {
                        AdapterGlobalClientInfo.mAuthCode = configByTag.getAuthCode();
                    }
                    IACCSManager accsInstance = ACCSManager.getAccsInstance(context, str2, str);
                    accsInstance.bindApp(applicationContext, str2, str3, str4, new C7711c(iRegister, applicationContext, accsInstance, str2, str4));
                    return;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ALog.m10118e(TAG, "register params null", "appkey", str2, Constants.KEY_CONFIG_TAG, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized void removeAlias(final Context context, final String str, ICallback iCallback) {
        ALog.m10119i(TAG, "removeAlias " + str, new Object[0]);
        final ICallback iCallbackCheckNull = checkNull(iCallback);
        if (context != null && str != null) {
            doAliasOperation(C7705a.JSON_CMD_REMOVEALIAS, context, new ICallback() { // from class: com.taobao.agoo.TaobaoRegister.6
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
                                C76946 c76946 = C76946.this;
                                TaobaoRegister.doAliasOperation(C7705a.JSON_CMD_REMOVEALIAS, context, iCallbackCheckNull, new C7698d(str, str4, null));
                            }
                        }
                    }, new C7697c(null));
                }

                @Override // com.taobao.agoo.ICallback
                public void onSuccess() {
                    iCallbackCheckNull.onSuccess();
                }
            }, new C7698d(str, null, 0 == true ? 1 : 0));
            return;
        }
        ErrorCode errorCodeBuild = C7703a.INVALID_ARG.copy().detail("removeAlias " + context + " " + str).build();
        iCallbackCheckNull.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
    }
}
