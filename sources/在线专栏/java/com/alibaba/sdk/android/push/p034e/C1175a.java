package com.alibaba.sdk.android.push.p034e;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import anet.channel.AwcnConfig;
import anet.channel.util.AppLifecycle;
import anetwork.channel.http.NetworkSdkSetting;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p020a.C1096a;
import com.alibaba.sdk.android.ams.common.p021b.C1100c;
import com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b;
import com.alibaba.sdk.android.ams.common.util.C1107a;
import com.alibaba.sdk.android.ams.common.util.C1109c;
import com.alibaba.sdk.android.ams.common.util.StringUtil;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.PushControlService;
import com.alibaba.sdk.android.push.common.global.C1162b;
import com.alibaba.sdk.android.push.common.global.C1163c;
import com.alibaba.sdk.android.push.common.global.EnumC1161a;
import com.alibaba.sdk.android.push.common.util.AppInfoUtil;
import com.alibaba.sdk.android.push.common.util.C1165a;
import com.alibaba.sdk.android.push.common.util.C1171c;
import com.alibaba.sdk.android.push.common.util.p031a.C1166a;
import com.alibaba.sdk.android.push.common.util.p031a.EnumC1169d;
import com.alibaba.sdk.android.push.notification.C1189e;
import com.alibaba.sdk.android.push.p028a.C1158f;
import com.alibaba.sdk.android.push.p029b.C1159a;
import com.alibaba.sdk.android.push.p030c.C1160a;
import com.alibaba.sdk.android.push.util.C1192c;
import com.aliyun.ams.emas.push.InterfaceC1196d;
import com.p071ut.device.UTDevice;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.AccsState;
import com.taobao.accs.ConnectionListener;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.agoo.IRegister;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.agoo.p066a.p067a.C1808c;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import org.android.agoo.message.MessageService;

/* renamed from: com.alibaba.sdk.android.push.e.a */
/* loaded from: classes.dex */
public class C1175a {

    /* renamed from: e */
    private static final AmsLogger f6782e = AmsLogger.getLogger("MPS:AppRegister");

    /* renamed from: f */
    private static C1175a f6783f = null;

    /* renamed from: g */
    private static final IntentFilter f6784g = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");

    /* renamed from: h */
    private static final IntentFilter f6785h = new IntentFilter("android.intent.action.USER_PRESENT");

    /* renamed from: a */
    volatile a<C1178d> f6786a;

    /* renamed from: i */
    private final b f6790i = new b();

    /* renamed from: b */
    volatile boolean f6787b = false;

    /* renamed from: c */
    volatile boolean f6788c = false;

    /* renamed from: d */
    volatile boolean f6789d = true;

    /* renamed from: com.alibaba.sdk.android.push.e.a$a */
    class a<Token> extends HandlerThread {

        /* renamed from: a */
        Handler f6797a;

        /* renamed from: b */
        Handler f6798b;

        /* renamed from: c */
        InterfaceC1177c<Token> f6799c;

        /* renamed from: d */
        volatile int f6800d;

        /* renamed from: e */
        int f6801e;

        /* renamed from: g */
        private Token f6803g;

        public a() {
            super("ConnectionWorker");
            this.f6800d = 0;
            this.f6801e = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Finally extract failed */
        /* renamed from: a */
        public C1179e m5212a(Token token) {
            C1179e c1179e;
            Context contextM4981a = C1096a.m4981a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    if (!C1171c.m5188a(contextM4981a.getApplicationContext())) {
                        this.f6801e = 2;
                        C1179e c1179e2 = new C1179e(C1163c.f6718a);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        try {
                            C1175a.f6782e.m5024i("connState=" + this.f6801e + ";estimatedTime=" + jCurrentTimeMillis2 + ";response{msg: " + c1179e2.m5222a().getMsg() + ", code: " + c1179e2.m5222a().getCode() + "}", null, 1);
                        } catch (Exception e4) {
                            C1175a.f6782e.m5020e("ut log error", e4);
                        }
                        return c1179e2;
                    }
                    if (this.f6801e == 0) {
                        C1175a.f6782e.m5016d("is debug：" + C1162b.m5172d());
                        if (C1162b.m5172d()) {
                            C1175a.this.m5201j();
                            C1175a.this.m5200i();
                        }
                        m5213a(contextM4981a);
                    }
                    if (C1096a.m4987f() && !C1096a.m4983b() && !C1189e.m5363a(contextM4981a)) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        while (!C1189e.m5363a(contextM4981a) && SystemClock.elapsedRealtime() - jElapsedRealtime < 10000) {
                            Thread.sleep(1000L);
                            C1175a.f6782e.m5016d("wait for app come to foreground");
                        }
                        try {
                            if (!C1189e.m5363a(contextM4981a)) {
                                AwcnConfig.setIpv6Enable(false);
                                C1175a.f6782e.m5016d("APP is background, disable ipv6 test");
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    int i4 = this.f6801e;
                    if (i4 == 1) {
                        C1175a.f6782e.m5016d("accs init.");
                        C1179e c1179eM5214b = m5214b(contextM4981a);
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (c1179eM5214b != null) {
                            try {
                                C1175a.f6782e.m5024i("connState=" + this.f6801e + ";estimatedTime=" + jCurrentTimeMillis3 + ";response{msg: " + c1179eM5214b.m5222a().getMsg() + ", code: " + c1179eM5214b.m5222a().getCode() + "}", null, 1);
                            } catch (Exception e5) {
                                C1175a.f6782e.m5020e("ut log error", e5);
                            }
                        }
                        return c1179eM5214b;
                    }
                    if (i4 == 2) {
                        C1175a.f6782e.m5016d("accs connected.setBindStop.");
                        c1179e = null;
                    } else {
                        C1175a.f6782e.m5019e("cant entry this block...");
                        c1179e = new C1179e(C1163c.f6729l);
                    }
                    long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (c1179e != null) {
                        try {
                            C1175a.f6782e.m5024i("connState=" + this.f6801e + ";estimatedTime=" + jCurrentTimeMillis4 + ";response{msg: " + c1179e.m5222a().getMsg() + ", code: " + c1179e.m5222a().getCode() + "}", null, 1);
                        } catch (Exception e6) {
                            C1175a.f6782e.m5020e("ut log error", e6);
                        }
                    }
                    return c1179e;
                } catch (Throwable th) {
                    System.currentTimeMillis();
                    throw th;
                }
            } catch (C1158f e7) {
                C1175a.f6782e.m5016d("Catch StopProcessException: " + e7.m5155a() + " stack:" + Log.getStackTraceString(e7));
                C1179e c1179e3 = new C1179e(e7.m5155a());
                long jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis;
                try {
                    C1175a.f6782e.m5024i("connState=" + this.f6801e + ";estimatedTime=" + jCurrentTimeMillis5 + ";response{msg: " + c1179e3.m5222a().getMsg() + ", code: " + c1179e3.m5222a().getCode() + "}", null, 1);
                } catch (Exception e8) {
                    C1175a.f6782e.m5020e("ut log error", e8);
                }
                return c1179e3;
            } catch (Throwable th2) {
                C1175a.f6782e.m5016d("Catch RuntimeException: " + th2.getMessage());
                C1179e c1179e4 = new C1179e(C1163c.f6728k.copy().msg(th2.getMessage()).detail(Log.getStackTraceString(th2)).build());
                long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis;
                try {
                    C1175a.f6782e.m5024i("connState=" + this.f6801e + ";estimatedTime=" + jCurrentTimeMillis6 + ";response{msg: " + c1179e4.m5222a().getMsg() + ", code: " + c1179e4.m5222a().getCode() + "}", null, 1);
                } catch (Exception e9) {
                    C1175a.f6782e.m5020e("ut log error", e9);
                }
                return c1179e4;
            }
        }

        /* renamed from: a */
        private void m5213a(Context context) throws C1158f {
            C1175a.f6782e.m5016d("load utdid: " + UTDevice.getUtdid(context));
            InterfaceC1099b interfaceC1099bM5010a = C1100c.m5010a();
            String strMo5004c = interfaceC1099bM5010a.mo5004c();
            C1175a.f6782e.m5016d("vip init.");
            String strMo5002b = interfaceC1099bM5010a.mo5002b();
            if (!StringUtil.isEmpty(strMo5002b) && !StringUtil.isBlank(strMo5004c) && strMo5004c.equals(UTDevice.getUtdid(context))) {
                AmsLogger.getImportantLogger().m5022i("Got deviceId from preference: " + strMo5002b);
                this.f6801e = 1;
                return;
            }
            String strM5215c = m5215c();
            AmsLogger.getImportantLogger().m5022i("Got deviceId from remote server: " + strM5215c);
            if (StringUtil.isEmpty(strM5215c)) {
                throw new C1158f(C1163c.f6724g.copy().msg("获取设备ID失败").detail("getDeviceIdFromServer").build());
            }
            interfaceC1099bM5010a.mo5000a(strM5215c);
            interfaceC1099bM5010a.mo5003b(UTDevice.getUtdid(context));
            this.f6801e = 1;
            AmsLogger.getImportantLogger().m5022i("vip init success");
        }

        /* renamed from: b */
        private C1179e m5214b(Context context) {
            String stateByKey;
            C1175a.f6782e.m5016d("initAccsChannel...");
            NetworkSdkSetting.init(context.getApplicationContext());
            InterfaceC1099b interfaceC1099bM5010a = C1100c.m5010a();
            String strMo4998a = interfaceC1099bM5010a.mo4998a();
            String strMo5006d = interfaceC1099bM5010a.mo5006d();
            AmsLogger.getImportantLogger().m5022i("register agoo appkey:" + strMo4998a);
            final C1192c c1192c = new C1192c();
            final C1179e[] c1179eArr = {null};
            try {
                C1175a.f6782e.m5016d("init aliyun accs. context:" + context.getPackageName() + " -- appkey:" + strMo4998a);
                ACCSClient.getAccsClient("AliyunPush").cleanLocalBindInfo();
                AppLifecycle.onForeground();
                TaobaoRegister.register(context.getApplicationContext(), "AliyunPush", strMo4998a, strMo5006d, "aliyun", new IRegister() { // from class: com.alibaba.sdk.android.push.e.a.a.2
                    @Override // com.taobao.agoo.IRegister, com.taobao.agoo.ICallback
                    public void onFailure(String str, String str2) {
                        AmsLogger.getImportantLogger().m5022i("agoo errorcode:" + str + ";errorMsg:" + str2);
                        c1179eArr[0] = new C1179e(C1163c.m5174a(str, str2).detail(C1808c.JSON_CMD_REGISTER).build());
                        c1192c.m5375a();
                    }

                    @Override // com.taobao.agoo.IRegister
                    public void onSuccess(String str) {
                        AmsLogger.getImportantLogger().m5022i("agoo init success.");
                        a.this.f6801e = 2;
                        c1179eArr[0] = new C1179e(C1163c.f6718a);
                        c1192c.m5375a();
                    }
                });
            } catch (Throwable th) {
                C1175a.f6782e.m5020e("accs config failed", th);
                c1179eArr[0] = new C1179e(C1163c.f6728k.copy().msg(th.getMessage()).detail(Log.getStackTraceString(th)).build());
                c1192c.m5375a();
            }
            if (!C1171c.m5188a(context.getApplicationContext())) {
                C1175a.this.f6789d = true;
                C1175a.f6782e.m5016d("not main process");
                return new C1179e(C1163c.f6731n);
            }
            C1175a.f6782e.m5016d("lock" + c1192c.toString());
            c1192c.m5376a(150);
            if (c1179eArr[0] == null) {
                try {
                    stateByKey = AccsState.getInstance().getStateByKey(AccsState.RECENT_ERRORS);
                } catch (Exception unused) {
                    stateByKey = "accs time out";
                }
                c1179eArr[0] = new C1179e(C1163c.f6732o.copy().msg(stateByKey).detail("connected:" + C1175a.this.m5206c()).build());
            }
            AmsLogger.getImportantLogger().m5016d("register agoo result " + c1179eArr[0].m5222a());
            return c1179eArr[0];
        }

        /* renamed from: c */
        private String m5215c() {
            InterfaceC1099b interfaceC1099bM5010a = C1100c.m5010a();
            String strM4988g = C1096a.m4988g();
            Context contextM4981a = C1096a.m4981a();
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    HashMap map = new HashMap();
                    map.put(Constants.KEY_APP_KEY, interfaceC1099bM5010a.mo4998a());
                    map.put("deviceId", UTDevice.getUtdid(contextM4981a));
                    map.put(Constants.SP_KEY_VERSION, "3.10.1");
                    map.put("utdid", UTDevice.getUtdid(contextM4981a));
                    map.put("os", MessageService.MSG_DB_NOTIFY_CLICK);
                    map.put("package", C1096a.m4990i());
                    try {
                        HttpURLConnection httpURLConnectionM5033a = C1107a.m5033a(strM4988g, C1109c.m5057a(map), "POST");
                        if (httpURLConnectionM5033a == null) {
                            C1175a.f6782e.m5019e("failed to loadConfigFromRemote!");
                            throw new C1166a(C1163c.f6733p.copy().msg("getDeviceId创建请求连接失败").build());
                        }
                        String strM5267a = C1183i.m5267a(EnumC1169d.CONFIG.m5185a(), httpURLConnectionM5033a);
                        httpURLConnectionM5033a.disconnect();
                        return strM5267a;
                    } catch (IOException e4) {
                        throw new C1158f(C1163c.f6733p.copy().msg(e4.getMessage()).detail(Log.getStackTraceString(e4)).build());
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (C1158f e5) {
                throw e5;
            } catch (Throwable th2) {
                C1175a.f6782e.m5026w("loadConfigFromRemote failed! error:", th2);
                throw new C1158f(C1163c.f6728k.copy().msg(th2.getMessage()).detail(Log.getStackTraceString(th2)).build());
            }
        }

        /* renamed from: a */
        public synchronized void m5216a() {
            Handler handler;
            this.f6800d = 0;
            if ((!C1175a.this.f6789d || this.f6801e != 2) && (handler = this.f6797a) != null) {
                handler.sendMessage(handler.obtainMessage(1, this.f6803g));
            }
        }

        /* renamed from: a */
        public void m5217a(InterfaceC1177c<Token> interfaceC1177c) {
            this.f6799c = interfaceC1177c;
        }

        /* renamed from: a */
        public synchronized boolean m5218a(C1179e c1179e) {
            if (this.f6801e == 2 || this.f6800d >= 5) {
                return false;
            }
            C1175a.f6782e.m5016d("init retry:" + this.f6800d);
            this.f6800d = this.f6800d + 1;
            Handler handler = this.f6797a;
            if (handler != null) {
                handler.sendMessageDelayed(handler.obtainMessage(2, this.f6803g), ((int) Math.pow(3.0d, this.f6800d)) * 5000);
            }
            return true;
        }

        /* renamed from: b */
        public void m5219b() {
            this.f6797a.removeMessages(1);
            this.f6797a.removeMessages(2);
        }

        @Override // android.os.HandlerThread
        @SuppressLint({"HandlerLeak"})
        protected void onLooperPrepared() {
            this.f6798b = new Handler(Looper.getMainLooper());
            this.f6797a = new Handler() { // from class: com.alibaba.sdk.android.push.e.a.a.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    final C1179e c1179eM5212a;
                    int i4 = message.what;
                    if (i4 == 1 || i4 == 2) {
                        final Object obj = message.obj;
                        C1175a.f6782e.m5016d("Looping handleMessage: " + message.what);
                        if (message.what == 1) {
                            removeMessages(2);
                        }
                        if (C1175a.this.f6789d || (c1179eM5212a = a.this.m5212a((a) obj)) == null) {
                            return;
                        }
                        if (!a.this.m5218a(c1179eM5212a) || a.this.f6800d <= 1) {
                            a.this.f6798b.post(new Runnable() { // from class: com.alibaba.sdk.android.push.e.a.a.1.1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.lang.Runnable
                                public void run() {
                                    a.this.f6799c.mo5210a(obj, c1179eM5212a);
                                }
                            });
                        }
                    }
                }
            };
            C1175a.f6782e.m5016d("Looping Prepared.");
            C1175a.this.f6787b = true;
            m5216a();
        }
    }

    /* renamed from: com.alibaba.sdk.android.push.e.a$b */
    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (intent.getBooleanExtra("noConnectivity", false)) {
                        C1175a.f6782e.m5019e("Network has lost");
                        return;
                    } else if (C1175a.this.f6789d || !C1175a.this.f6787b) {
                        return;
                    }
                } else if (!"android.intent.action.USER_PRESENT".equals(intent.getAction()) || !C1165a.m5176a(context) || C1175a.this.f6789d || !C1175a.this.f6787b) {
                    return;
                }
                C1175a.this.f6786a.m5216a();
            }
        }
    }

    private C1175a() {
    }

    /* renamed from: a */
    public static C1175a m5194a() {
        if (f6783f == null) {
            synchronized (C1175a.class) {
                if (f6783f == null) {
                    f6783f = new C1175a();
                }
            }
        }
        return f6783f;
    }

    /* renamed from: b */
    private void m5196b(boolean z3, long j4) {
        Context contextM4981a = C1096a.m4981a();
        final InterfaceC1099b interfaceC1099bM5010a = C1100c.m5010a();
        String strMo4998a = interfaceC1099bM5010a.mo4998a();
        AmsLogger.getImportantLogger().m5022i("init agoo config appkey:" + strMo4998a);
        String strMo5006d = interfaceC1099bM5010a.mo5006d();
        if (C1096a.m4987f()) {
            try {
                AwcnConfig.setWifiInfoEnable(false);
            } catch (Throwable unused) {
            }
            try {
                AwcnConfig.setCarrierInfoEnable(false);
            } catch (Throwable unused2) {
            }
        }
        try {
            AwcnConfig.setAccsSessionCreateForbiddenInBg(false);
        } catch (Throwable unused3) {
        }
        try {
            TaobaoRegister.setEnv(contextM4981a, 0);
            AccsClientConfig accsClientConfigBuild = new AccsClientConfig.Builder().setAppKey(strMo4998a).setAppSecret(strMo5006d).setTag("AliyunPush").setInappHost(C1096a.m4985d()).setChannelHost(C1096a.m4986e()).setAccsHeartbeatEnable(true).setConfigEnv(0).loopChannelStart(z3).loopChannelInterval(j4).build();
            TaobaoRegister.setAccsConfigTag(contextM4981a, "AliyunPush");
            ACCSClient.init(contextM4981a, accsClientConfigBuild);
            TaobaoRegister.setReportPushArrive(new InterfaceC1196d() { // from class: com.alibaba.sdk.android.push.e.a.1
                @Override // com.aliyun.ams.emas.push.InterfaceC1196d
                public void reportPushArrive(Context context, String str, int i4) {
                    C1160a c1160aM5160a = C1160a.m5160a(context);
                    if (c1160aM5160a != null) {
                        c1160aM5160a.m5162a(interfaceC1099bM5010a.mo5002b(), str, i4);
                    }
                }
            });
        } catch (AccsException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: h */
    private void m5199h() {
        Context contextM4981a = C1096a.m4981a();
        if (C1171c.m5188a(contextM4981a)) {
            try {
                contextM4981a.registerReceiver(this.f6790i, f6784g);
                contextM4981a.registerReceiver(this.f6790i, f6785h);
            } catch (Exception e4) {
                f6782e.m5020e("Fail to register broad", e4);
            }
        }
        if (AdapterUtilityImpl.isChannelProcess(contextM4981a)) {
            C1159a.m5157a(contextM4981a);
            C1159a.m5156a().m5158b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m5200i() throws C1158f {
        String strMo5008e = C1100c.m5010a().mo5008e();
        if (StringUtil.isEmpty(strMo5008e) || strMo5008e.length() > 32) {
            throw new C1158f(C1163c.f6735r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m5201j() throws C1158f {
        for (EnumC1161a enumC1161a : EnumC1161a.values()) {
            if (!AppInfoUtil.isComponentExists(C1096a.m4981a(), enumC1161a.m5166a(), enumC1161a.m5167b())) {
                if (enumC1161a.m5168c()) {
                    throw new C1158f(C1163c.f6736s.copy().msg(enumC1161a.m5166a() + "未配置").build());
                }
                f6782e.m5025w("未配置" + enumC1161a.m5166a() + "; 建议配置,可有效提高推送到达率");
            }
        }
    }

    /* renamed from: a */
    public synchronized void m5202a(final CommonCallback commonCallback) {
        if (this.f6788c) {
            AmsLogger.getImportantLogger().m5016d("Already startReg, skip.");
            if (commonCallback != null) {
                ErrorCode errorCode = C1163c.f6740w;
                commonCallback.onFailed(errorCode.getCode(), errorCode.getMsg());
            }
            return;
        }
        this.f6788c = true;
        m5199h();
        this.f6789d = false;
        if (this.f6786a != null) {
            try {
                this.f6786a.quitSafely();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        this.f6786a = new a<>();
        this.f6786a.m5217a(new InterfaceC1177c<C1178d>() { // from class: com.alibaba.sdk.android.push.e.a.2
            @Override // com.alibaba.sdk.android.push.p034e.InterfaceC1177c
            /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo5210a(C1178d c1178d, C1179e c1179e) {
                if (c1179e.m5222a().getCode().equals(C1163c.f6718a.getCode())) {
                    synchronized (C1175a.class) {
                        C1175a.this.f6789d = true;
                        C1175a.this.f6787b = false;
                        C1175a.this.f6786a.m5219b();
                        C1175a.this.f6786a.quit();
                        Context contextM4981a = C1096a.m4981a();
                        if (C1171c.m5188a(contextM4981a)) {
                            try {
                                contextM4981a.unregisterReceiver(C1175a.this.f6790i);
                            } catch (Exception e5) {
                                C1175a.f6782e.m5020e("Fail to unregister broad", e5);
                            }
                        }
                    }
                }
                C1176b.m5220a(commonCallback, c1179e);
            }
        });
        this.f6786a.start();
        f6782e.m5016d("getLooper called.");
    }

    /* renamed from: a */
    public void m5203a(final PushControlService.ConnectionChangeListener connectionChangeListener) {
        try {
            ACCSClient.getAccsClient("AliyunPush").addConnectionListener(new ConnectionListener() { // from class: com.alibaba.sdk.android.push.e.a.3
                @Override // com.taobao.accs.ConnectionListener
                public void onConnect() {
                    connectionChangeListener.onConnect();
                }

                @Override // com.taobao.accs.ConnectionListener
                public void onDisconnect(int i4, String str) {
                    ErrorCode errorCodeBuild = C1163c.m5173a(i4, str).build();
                    connectionChangeListener.onDisconnect(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
                }
            });
        } catch (AccsException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m5204a(boolean z3, long j4) {
        m5196b(z3, j4);
    }

    /* renamed from: b */
    public void m5205b() {
        m5196b(false, 0L);
    }

    /* renamed from: c */
    public boolean m5206c() {
        try {
            return ACCSClient.getAccsClient("AliyunPush").isConnected();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public void m5207d() {
        try {
            ACCSClient.getAccsClient("AliyunPush").reconnect();
        } catch (AccsException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m5208e() {
        TaobaoRegister.reset();
        this.f6788c = false;
    }

    /* renamed from: f */
    public void m5209f() {
        try {
            ACCSClient.getAccsClient("AliyunPush").disconnect();
        } catch (AccsException e4) {
            e4.printStackTrace();
        }
    }
}
