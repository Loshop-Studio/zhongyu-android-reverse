package com.alibaba.sdk.android.push.p064e;

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
import androidx.work.WorkRequest;
import anet.channel.AwcnConfig;
import anet.channel.util.AppLifecycle;
import anetwork.channel.http.NetworkSdkSetting;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p050a.C5571a;
import com.alibaba.sdk.android.ams.common.p051b.C5575c;
import com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b;
import com.alibaba.sdk.android.ams.common.util.C5582a;
import com.alibaba.sdk.android.ams.common.util.C5584c;
import com.alibaba.sdk.android.ams.common.util.StringUtil;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.PushControlService;
import com.alibaba.sdk.android.push.common.global.C5653b;
import com.alibaba.sdk.android.push.common.global.C5654c;
import com.alibaba.sdk.android.push.common.global.EnumC5652a;
import com.alibaba.sdk.android.push.common.util.AppInfoUtil;
import com.alibaba.sdk.android.push.common.util.C5656a;
import com.alibaba.sdk.android.push.common.util.C5662c;
import com.alibaba.sdk.android.push.common.util.p061a.C5657a;
import com.alibaba.sdk.android.push.common.util.p061a.EnumC5660d;
import com.alibaba.sdk.android.push.notification.C5683e;
import com.alibaba.sdk.android.push.p058a.C5649f;
import com.alibaba.sdk.android.push.p059b.C5650a;
import com.alibaba.sdk.android.push.p060c.C5651a;
import com.alibaba.sdk.android.push.util.C5691c;
import com.p101ut.device.UTDevice;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.AccsState;
import com.taobao.accs.ConnectionListener;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.agoo.IRegister;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.agoo.p087a.p088a.C7707c;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
import p038c0.InterfaceC5210f;

/* renamed from: com.alibaba.sdk.android.push.e.a */
/* loaded from: classes3.dex */
public class C5666a {

    /* renamed from: e */
    private static final AmsLogger f4306e = AmsLogger.getLogger("MPS:AppRegister");

    /* renamed from: f */
    private static C5666a f4307f = null;

    /* renamed from: g */
    private static final IntentFilter f4308g = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");

    /* renamed from: h */
    private static final IntentFilter f4309h = new IntentFilter("android.intent.action.USER_PRESENT");

    /* renamed from: a */
    volatile a<C5669d> f4310a;

    /* renamed from: i */
    private final b f4314i = new b();

    /* renamed from: b */
    volatile boolean f4311b = false;

    /* renamed from: c */
    volatile boolean f4312c = false;

    /* renamed from: d */
    volatile boolean f4313d = true;

    /* renamed from: com.alibaba.sdk.android.push.e.a$a */
    public class a<Token> extends HandlerThread {

        /* renamed from: a */
        Handler f4321a;

        /* renamed from: b */
        Handler f4322b;

        /* renamed from: c */
        InterfaceC5668c<Token> f4323c;

        /* renamed from: d */
        volatile int f4324d;

        /* renamed from: e */
        int f4325e;

        /* renamed from: g */
        private Token f4327g;

        public a() {
            super("ConnectionWorker");
            this.f4324d = 0;
            this.f4325e = 0;
        }

        /* renamed from: b */
        private C5670e m3665b(Context context) {
            String stateByKey;
            C5666a.f4306e.m3417d("initAccsChannel...");
            NetworkSdkSetting.init(context.getApplicationContext());
            InterfaceC5574b interfaceC5574bM3411a = C5575c.m3411a();
            String strMo3399a = interfaceC5574bM3411a.mo3399a();
            String strMo3407d = interfaceC5574bM3411a.mo3407d();
            AmsLogger.getImportantLogger().m3423i("register agoo appkey:" + strMo3399a);
            final C5691c c5691c = new C5691c();
            final C5670e[] c5670eArr = {null};
            try {
                C5666a.f4306e.m3417d("init aliyun accs. context:" + context.getPackageName() + " -- appkey:" + strMo3399a);
                ACCSClient.getAccsClient("AliyunPush").cleanLocalBindInfo();
                AppLifecycle.onForeground();
                TaobaoRegister.register(context.getApplicationContext(), "AliyunPush", strMo3399a, strMo3407d, "aliyun", new IRegister() { // from class: com.alibaba.sdk.android.push.e.a.a.2
                    @Override // com.taobao.agoo.IRegister, com.taobao.agoo.ICallback
                    public void onFailure(String str, String str2) {
                        AmsLogger.getImportantLogger().m3423i("agoo errorcode:" + str + ";errorMsg:" + str2);
                        c5670eArr[0] = new C5670e(C5654c.m3625a(str, str2).detail(C7707c.JSON_CMD_REGISTER).build());
                        c5691c.m3827a();
                    }

                    @Override // com.taobao.agoo.IRegister
                    public void onSuccess(String str) {
                        AmsLogger.getImportantLogger().m3423i("agoo init success.");
                        a.this.f4325e = 2;
                        c5670eArr[0] = new C5670e(C5654c.f4242a);
                        c5691c.m3827a();
                    }
                });
            } catch (Throwable th) {
                C5666a.f4306e.m3421e("accs config failed", th);
                c5670eArr[0] = new C5670e(C5654c.f4252k.copy().msg(th.getMessage()).detail(Log.getStackTraceString(th)).build());
                c5691c.m3827a();
            }
            if (!C5662c.m3639a(context.getApplicationContext())) {
                C5666a.this.f4313d = true;
                C5666a.f4306e.m3417d("not main process");
                return new C5670e(C5654c.f4255n);
            }
            C5666a.f4306e.m3417d("lock" + c5691c.toString());
            c5691c.m3828a(150);
            if (c5670eArr[0] == null) {
                try {
                    stateByKey = AccsState.getInstance().getStateByKey(AccsState.RECENT_ERRORS);
                } catch (Exception unused) {
                    stateByKey = "accs time out";
                }
                c5670eArr[0] = new C5670e(C5654c.f4256o.copy().msg(stateByKey).detail("connected:" + C5666a.this.m3657c()).build());
            }
            AmsLogger.getImportantLogger().m3417d("register agoo result " + c5670eArr[0].m3673a());
            return c5670eArr[0];
        }

        /* renamed from: c */
        private String m3666c() {
            InterfaceC5574b interfaceC5574bM3411a = C5575c.m3411a();
            String strM3389g = C5571a.m3389g();
            Context contextM3382a = C5571a.m3382a();
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    try {
                        HashMap map = new HashMap();
                        map.put(Constants.KEY_APP_KEY, interfaceC5574bM3411a.mo3399a());
                        map.put("deviceId", UTDevice.getUtdid(contextM3382a));
                        map.put("version", "3.9.5");
                        map.put("utdid", UTDevice.getUtdid(contextM3382a));
                        map.put(Constants.KEY_OS_VERSION, "2");
                        map.put("package", C5571a.m3391i());
                        try {
                            HttpURLConnection httpURLConnectionM3434a = C5582a.m3434a(strM3389g, C5584c.m3458a(map), "POST");
                            if (httpURLConnectionM3434a == null) {
                                C5666a.f4306e.m3420e("failed to loadConfigFromRemote!");
                                throw new C5657a(C5654c.f4257p.copy().msg("getDeviceId创建请求连接失败").build());
                            }
                            String strM3718a = C5674i.m3718a(EnumC5660d.CONFIG.m3636a(), httpURLConnectionM3434a);
                            httpURLConnectionM3434a.disconnect();
                            return strM3718a;
                        } catch (IOException e10) {
                            throw new C5649f(C5654c.f4257p.copy().msg(e10.getMessage()).detail(Log.getStackTraceString(e10)).build());
                        }
                    } catch (Throwable th) {
                        C5666a.f4306e.m3427w("loadConfigFromRemote failed! error:", th);
                        throw new C5649f(C5654c.f4252k.copy().msg(th.getMessage()).detail(Log.getStackTraceString(th)).build());
                    }
                } catch (C5649f e11) {
                    throw e11;
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th2;
            }
        }

        @Override // android.os.HandlerThread
        @SuppressLint({"HandlerLeak"})
        public void onLooperPrepared() {
            this.f4322b = new Handler(Looper.getMainLooper());
            this.f4321a = new Handler() { // from class: com.alibaba.sdk.android.push.e.a.a.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    final C5670e c5670eM3663a;
                    int i10 = message.what;
                    if (i10 == 1 || i10 == 2) {
                        final Object obj = message.obj;
                        C5666a.f4306e.m3417d("Looping handleMessage: " + message.what);
                        if (message.what == 1) {
                            removeMessages(2);
                        }
                        if (C5666a.this.f4313d || (c5670eM3663a = a.this.m3663a((a) obj)) == null) {
                            return;
                        }
                        if (!a.this.m3669a(c5670eM3663a) || a.this.f4324d <= 1) {
                            a.this.f4322b.post(new Runnable() { // from class: com.alibaba.sdk.android.push.e.a.a.1.1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.lang.Runnable
                                public void run() {
                                    a.this.f4323c.mo3661a(obj, c5670eM3663a);
                                }
                            });
                        }
                    }
                }
            };
            C5666a.f4306e.m3417d("Looping Prepared.");
            C5666a.this.f4311b = true;
            m3667a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Finally extract failed */
        /* renamed from: a */
        public C5670e m3663a(Token token) {
            C5670e c5670e;
            Context contextM3382a = C5571a.m3382a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    if (!C5662c.m3639a(contextM3382a.getApplicationContext())) {
                        this.f4325e = 2;
                        C5670e c5670e2 = new C5670e(C5654c.f4242a);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        try {
                            C5666a.f4306e.m3425i("connState=" + this.f4325e + ";estimatedTime=" + jCurrentTimeMillis2 + ";response{msg: " + c5670e2.m3673a().getMsg() + ", code: " + c5670e2.m3673a().getCode() + "}", null, 1);
                            return c5670e2;
                        } catch (Exception e10) {
                            C5666a.f4306e.m3421e("ut log error", e10);
                            return c5670e2;
                        }
                    }
                    if (this.f4325e == 0) {
                        C5666a.f4306e.m3417d("is debug：" + C5653b.m3623d());
                        if (C5653b.m3623d()) {
                            C5666a.this.m3652j();
                            C5666a.this.m3651i();
                        }
                        m3664a(contextM3382a);
                    }
                    if (C5571a.m3388f() && !C5571a.m3384b() && !C5683e.m3814a(contextM3382a)) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        while (!C5683e.m3814a(contextM3382a) && SystemClock.elapsedRealtime() - jElapsedRealtime < WorkRequest.MIN_BACKOFF_MILLIS) {
                            Thread.sleep(1000L);
                            C5666a.f4306e.m3417d("wait for app come to foreground");
                        }
                        try {
                            if (!C5683e.m3814a(contextM3382a)) {
                                AwcnConfig.setIpv6Enable(false);
                                C5666a.f4306e.m3417d("APP is background, disable ipv6 test");
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    int i10 = this.f4325e;
                    if (i10 == 1) {
                        C5666a.f4306e.m3417d("accs init.");
                        C5670e c5670eM3665b = m3665b(contextM3382a);
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (c5670eM3665b != null) {
                            try {
                                C5666a.f4306e.m3425i("connState=" + this.f4325e + ";estimatedTime=" + jCurrentTimeMillis3 + ";response{msg: " + c5670eM3665b.m3673a().getMsg() + ", code: " + c5670eM3665b.m3673a().getCode() + "}", null, 1);
                            } catch (Exception e11) {
                                C5666a.f4306e.m3421e("ut log error", e11);
                            }
                        }
                        return c5670eM3665b;
                    }
                    if (i10 == 2) {
                        C5666a.f4306e.m3417d("accs connected.setBindStop.");
                        c5670e = null;
                    } else {
                        C5666a.f4306e.m3420e("cant entry this block...");
                        c5670e = new C5670e(C5654c.f4253l);
                    }
                    long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (c5670e != null) {
                        try {
                            C5666a.f4306e.m3425i("connState=" + this.f4325e + ";estimatedTime=" + jCurrentTimeMillis4 + ";response{msg: " + c5670e.m3673a().getMsg() + ", code: " + c5670e.m3673a().getCode() + "}", null, 1);
                        } catch (Exception e12) {
                            C5666a.f4306e.m3421e("ut log error", e12);
                        }
                    }
                    return c5670e;
                } catch (Throwable th) {
                    System.currentTimeMillis();
                    throw th;
                }
            } catch (C5649f e13) {
                C5666a.f4306e.m3417d("Catch StopProcessException: " + e13.m3606a() + " stack:" + Log.getStackTraceString(e13));
                C5670e c5670e3 = new C5670e(e13.m3606a());
                long jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis;
                try {
                    C5666a.f4306e.m3425i("connState=" + this.f4325e + ";estimatedTime=" + jCurrentTimeMillis5 + ";response{msg: " + c5670e3.m3673a().getMsg() + ", code: " + c5670e3.m3673a().getCode() + "}", null, 1);
                } catch (Exception e14) {
                    C5666a.f4306e.m3421e("ut log error", e14);
                }
                return c5670e3;
            } catch (Throwable th2) {
                C5666a.f4306e.m3417d("Catch RuntimeException: " + th2.getMessage());
                C5670e c5670e4 = new C5670e(C5654c.f4252k.copy().msg(th2.getMessage()).detail(Log.getStackTraceString(th2)).build());
                long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis;
                try {
                    C5666a.f4306e.m3425i("connState=" + this.f4325e + ";estimatedTime=" + jCurrentTimeMillis6 + ";response{msg: " + c5670e4.m3673a().getMsg() + ", code: " + c5670e4.m3673a().getCode() + "}", null, 1);
                } catch (Exception e15) {
                    C5666a.f4306e.m3421e("ut log error", e15);
                }
                return c5670e4;
            }
        }

        /* renamed from: b */
        public void m3670b() {
            this.f4321a.removeMessages(1);
            this.f4321a.removeMessages(2);
        }

        /* renamed from: a */
        public synchronized void m3667a() {
            try {
                this.f4324d = 0;
                if (!C5666a.this.f4313d || this.f4325e != 2) {
                    Handler handler = this.f4321a;
                    if (handler != null) {
                        handler.sendMessage(handler.obtainMessage(1, this.f4327g));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* renamed from: a */
        private void m3664a(Context context) throws C5649f {
            C5666a.f4306e.m3417d("load utdid: " + UTDevice.getUtdid(context));
            InterfaceC5574b interfaceC5574bM3411a = C5575c.m3411a();
            String strMo3405c = interfaceC5574bM3411a.mo3405c();
            C5666a.f4306e.m3417d("vip init.");
            String strMo3403b = interfaceC5574bM3411a.mo3403b();
            if (!StringUtil.isEmpty(strMo3403b) && !StringUtil.isBlank(strMo3405c) && strMo3405c.equals(UTDevice.getUtdid(context))) {
                AmsLogger.getImportantLogger().m3423i("Got deviceId from preference: " + strMo3403b);
                this.f4325e = 1;
                return;
            }
            String strM3666c = m3666c();
            AmsLogger.getImportantLogger().m3423i("Got deviceId from remote server: " + strM3666c);
            if (StringUtil.isEmpty(strM3666c)) {
                throw new C5649f(C5654c.f4248g.copy().msg("获取设备ID失败").detail("getDeviceIdFromServer").build());
            }
            interfaceC5574bM3411a.mo3401a(strM3666c);
            interfaceC5574bM3411a.mo3404b(UTDevice.getUtdid(context));
            this.f4325e = 1;
            AmsLogger.getImportantLogger().m3423i("vip init success");
        }

        /* renamed from: a */
        public void m3668a(InterfaceC5668c<Token> interfaceC5668c) {
            this.f4323c = interfaceC5668c;
        }

        /* renamed from: a */
        public synchronized boolean m3669a(C5670e c5670e) {
            if (this.f4325e == 2 || this.f4324d >= 5) {
                return false;
            }
            C5666a.f4306e.m3417d("init retry:" + this.f4324d);
            this.f4324d = this.f4324d + 1;
            Handler handler = this.f4321a;
            if (handler != null) {
                handler.sendMessageDelayed(handler.obtainMessage(2, this.f4327g), ((int) Math.pow(3.0d, this.f4324d)) * DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT);
            }
            return true;
        }
    }

    /* renamed from: com.alibaba.sdk.android.push.e.a$b */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && C5656a.m3627a(context) && !C5666a.this.f4313d && C5666a.this.f4311b) {
                        C5666a.this.f4310a.m3667a();
                        return;
                    }
                    return;
                }
                if (intent.getBooleanExtra("noConnectivity", false)) {
                    C5666a.f4306e.m3420e("Network has lost");
                } else {
                    if (C5666a.this.f4313d || !C5666a.this.f4311b) {
                        return;
                    }
                    C5666a.this.f4310a.m3667a();
                }
            }
        }
    }

    private C5666a() {
    }

    /* renamed from: h */
    private void m3650h() {
        Context contextM3382a = C5571a.m3382a();
        if (C5662c.m3639a(contextM3382a)) {
            try {
                contextM3382a.registerReceiver(this.f4314i, f4308g);
                contextM3382a.registerReceiver(this.f4314i, f4309h);
            } catch (Exception e10) {
                f4306e.m3421e("Fail to register broad", e10);
            }
        }
        if (AdapterUtilityImpl.isChannelProcess(contextM3382a)) {
            C5650a.m3608a(contextM3382a);
            C5650a.m3607a().m3609b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m3651i() throws C5649f {
        String strMo3409e = C5575c.m3411a().mo3409e();
        if (StringUtil.isEmpty(strMo3409e) || strMo3409e.length() > 32) {
            throw new C5649f(C5654c.f4259r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m3652j() throws C5649f {
        for (EnumC5652a enumC5652a : EnumC5652a.values()) {
            if (!AppInfoUtil.isComponentExists(C5571a.m3382a(), enumC5652a.m3617a(), enumC5652a.m3618b())) {
                if (enumC5652a.m3619c()) {
                    throw new C5649f(C5654c.f4260s.copy().msg(enumC5652a.m3617a() + "未配置").build());
                }
                f4306e.m3426w("未配置" + enumC5652a.m3617a() + "; 建议配置,可有效提高推送到达率");
            }
        }
    }

    /* renamed from: b */
    public void m3656b() {
        m3647b(false, 0L);
    }

    /* renamed from: d */
    public void m3658d() {
        try {
            ACCSClient.getAccsClient("AliyunPush").reconnect();
        } catch (AccsException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m3659e() {
        TaobaoRegister.reset();
        this.f4312c = false;
    }

    /* renamed from: f */
    public void m3660f() {
        try {
            ACCSClient.getAccsClient("AliyunPush").disconnect();
        } catch (AccsException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C5666a m3645a() {
        if (f4307f == null) {
            synchronized (C5666a.class) {
                try {
                    if (f4307f == null) {
                        f4307f = new C5666a();
                    }
                } finally {
                }
            }
        }
        return f4307f;
    }

    /* renamed from: c */
    public boolean m3657c() {
        try {
            return ACCSClient.getAccsClient("AliyunPush").isConnected();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private void m3647b(boolean z10, long j10) {
        Context contextM3382a = C5571a.m3382a();
        final InterfaceC5574b interfaceC5574bM3411a = C5575c.m3411a();
        String strMo3399a = interfaceC5574bM3411a.mo3399a();
        AmsLogger.getImportantLogger().m3423i("init agoo config appkey:" + strMo3399a);
        String strMo3407d = interfaceC5574bM3411a.mo3407d();
        if (C5571a.m3388f()) {
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
            TaobaoRegister.setEnv(contextM3382a, 0);
            AccsClientConfig accsClientConfigBuild = new AccsClientConfig.Builder().setAppKey(strMo3399a).setAppSecret(strMo3407d).setTag("AliyunPush").setInappHost(C5571a.m3386d()).setChannelHost(C5571a.m3387e()).setAccsHeartbeatEnable(true).setConfigEnv(0).loopChannelStart(z10).loopChannelInterval(j10).build();
            TaobaoRegister.setAccsConfigTag(contextM3382a, "AliyunPush");
            ACCSClient.init(contextM3382a, accsClientConfigBuild);
            TaobaoRegister.setReportPushArrive(new InterfaceC5210f() { // from class: com.alibaba.sdk.android.push.e.a.1
                @Override // p038c0.InterfaceC5210f
                public void reportPushArrive(Context context, String str, int i10) {
                    C5651a c5651aM3611a = C5651a.m3611a(context);
                    if (c5651aM3611a != null) {
                        c5651aM3611a.m3613a(interfaceC5574bM3411a.mo3403b(), str, i10);
                    }
                }
            });
        } catch (AccsException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public synchronized void m3653a(final CommonCallback commonCallback) {
        if (this.f4312c) {
            AmsLogger.getImportantLogger().m3417d("Already startReg, skip.");
            if (commonCallback != null) {
                ErrorCode errorCode = C5654c.f4264w;
                commonCallback.onFailed(errorCode.getCode(), errorCode.getMsg());
            }
            return;
        }
        this.f4312c = true;
        m3650h();
        this.f4313d = false;
        if (this.f4310a != null) {
            try {
                this.f4310a.quitSafely();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.f4310a = new a<>();
        this.f4310a.m3668a(new InterfaceC5668c<C5669d>() { // from class: com.alibaba.sdk.android.push.e.a.2
            @Override // com.alibaba.sdk.android.push.p064e.InterfaceC5668c
            /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3661a(C5669d c5669d, C5670e c5670e) {
                if (c5670e.m3673a().getCode().equals(C5654c.f4242a.getCode())) {
                    synchronized (C5666a.class) {
                        C5666a.this.f4313d = true;
                        C5666a.this.f4311b = false;
                        C5666a.this.f4310a.m3670b();
                        C5666a.this.f4310a.quit();
                        Context contextM3382a = C5571a.m3382a();
                        if (C5662c.m3639a(contextM3382a)) {
                            try {
                                contextM3382a.unregisterReceiver(C5666a.this.f4314i);
                            } catch (Exception e11) {
                                C5666a.f4306e.m3421e("Fail to unregister broad", e11);
                            }
                        }
                    }
                }
                C5667b.m3671a(commonCallback, c5670e);
            }
        });
        this.f4310a.start();
        f4306e.m3417d("getLooper called.");
    }

    /* renamed from: a */
    public void m3654a(final PushControlService.ConnectionChangeListener connectionChangeListener) {
        try {
            ACCSClient.getAccsClient("AliyunPush").addConnectionListener(new ConnectionListener() { // from class: com.alibaba.sdk.android.push.e.a.3
                @Override // com.taobao.accs.ConnectionListener
                public void onConnect() {
                    connectionChangeListener.onConnect();
                }

                @Override // com.taobao.accs.ConnectionListener
                public void onDisconnect(int i10, String str) {
                    ErrorCode errorCodeBuild = C5654c.m3624a(i10, str).build();
                    connectionChangeListener.onDisconnect(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
                }
            });
        } catch (AccsException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m3655a(boolean z10, long j10) {
        m3647b(z10, j10);
    }
}
