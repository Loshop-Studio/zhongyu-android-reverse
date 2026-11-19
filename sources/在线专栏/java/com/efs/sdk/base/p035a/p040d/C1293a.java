package com.efs.sdk.base.p035a.p040d;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.webkit.ValueCallback;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p035a.p036a.C1273a;
import com.efs.sdk.base.p035a.p038c.C1285a;
import com.efs.sdk.base.p035a.p038c.C1291b;
import com.efs.sdk.base.p035a.p038c.C1292c;
import com.efs.sdk.base.p035a.p038c.p039a.C1288c;
import com.efs.sdk.base.p035a.p040d.p041a.RunnableC1294a;
import com.efs.sdk.base.p035a.p042e.C1300f;
import com.efs.sdk.base.p035a.p042e.HandlerC1298d;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p044g.C1314d;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.C1330e;
import com.efs.sdk.base.p035a.p046h.C1331f;
import com.efs.sdk.base.p035a.p046h.C1332g;
import com.efs.sdk.base.p035a.p046h.C1333h;
import com.efs.sdk.base.p035a.p046h.p047a.C1316a;
import com.efs.sdk.base.p035a.p046h.p047a.C1319d;
import com.efs.sdk.base.p035a.p050i.C1335b;
import com.efs.sdk.base.p035a.p050i.C1336c;
import com.efs.sdk.base.p035a.p050i.C1339f;
import com.efs.sdk.base.protocol.ILogProtocol;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UtilityImpl;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.efs.sdk.base.a.d.a */
/* loaded from: classes.dex */
public final class C1293a implements Handler.Callback {

    /* renamed from: a */
    public static C1285a f7048a;

    /* renamed from: b */
    private int f7049b = 0;

    /* renamed from: c */
    private final int f7050c = 0;

    /* renamed from: d */
    private final int f7051d = 1;

    /* renamed from: e */
    private final int f7052e = 2;

    /* renamed from: f */
    private final int f7053f = 3;

    /* renamed from: g */
    private volatile boolean f7054g = false;

    /* renamed from: h */
    private RunnableC1294a f7055h;

    /* renamed from: i */
    private Handler f7056i;

    public C1293a(EfsReporter.Builder builder) {
        f7048a = builder.getGlobalEnvStruct();
        Handler handler = new Handler(C1316a.f7105a.getLooper(), this);
        this.f7056i = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static C1285a m5487a() {
        return f7048a;
    }

    /* renamed from: b */
    private void m5489b() {
        if (this.f7055h == null) {
            this.f7055h = new RunnableC1294a();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f7048a.f7010c.registerReceiver(this.f7055h, intentFilter);
        } catch (Throwable th) {
            C1329d.m5572a("efs.base", "register network change receiver error", th);
            int i4 = this.f7049b + 1;
            this.f7049b = i4;
            if (i4 < 3) {
                this.f7056i.sendEmptyMessageDelayed(3, 6000L);
            }
        }
    }

    /* renamed from: c */
    private void m5491c(final ILogProtocol iLogProtocol) {
        if (iLogProtocol == null) {
            return;
        }
        C1319d.m5536a(new Runnable() { // from class: com.efs.sdk.base.a.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    iLogProtocol.insertGlobal(C1292c.a.f7047a.f7045a);
                    if (!"wa".equalsIgnoreCase(iLogProtocol.getLogType())) {
                        C1293a.m5490b(iLogProtocol);
                    }
                    if (C1293a.m5487a().f7012e) {
                        final C1302b c1302bM5509a = C1302b.m5509a(iLogProtocol);
                        final C1314d c1314d = C1314d.a.f7102a;
                        C1319d.m5536a(new Runnable() { // from class: com.efs.sdk.base.a.g.d.1

                            /* renamed from: a */
                            final /* synthetic */ C1302b f7100a;

                            public AnonymousClass1(final C1302b c1302bM5509a2) {
                                c1302b = c1302bM5509a2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C1314d.this.f7099a.m5520a(c1302b);
                            }
                        });
                    }
                } catch (Throwable th) {
                    C1329d.m5573b("efs.base", "log send error", th);
                }
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            C1292c c1292c = C1292c.a.f7047a;
            C1291b c1291b = new C1291b();
            c1292c.f7045a = c1291b;
            c1291b.m5483a("appid", f7048a.f7008a);
            int iM5580a = C1332g.m5580a();
            c1292c.f7045a.m5483a("pid", Integer.valueOf(iM5580a));
            c1292c.f7045a.m5483a("ps", C1332g.m5581a(iM5580a));
            String strM5584a = C1333h.m5584a(c1292c.f7046b);
            c1292c.f7045a.m5483a("wid", strM5584a);
            if (TextUtils.isEmpty(f7048a.f7015h)) {
                c1292c.f7045a.m5483a("uid", strM5584a);
            } else {
                c1292c.f7045a.m5483a("uid", f7048a.f7015h);
            }
            C1291b c1291b2 = c1292c.f7045a;
            C1273a.m5414a();
            c1291b2.m5483a("stime", Long.valueOf(C1273a.m5417b() - Process.getElapsedCpuTime()));
            c1292c.f7045a.m5483a("pkg", c1292c.f7046b.getPackageName());
            c1292c.f7045a.m5483a("ver", C1331f.m5578a(c1292c.f7046b));
            c1292c.f7045a.m5483a("vcode", C1331f.m5579b(c1292c.f7046b));
            c1292c.f7045a.m5483a("sdk_ver", BuildConfig.VERSION_NAME);
            c1292c.f7045a.m5483a(Constants.KEY_BRAND, Build.BRAND.toLowerCase());
            C1291b c1291b3 = c1292c.f7045a;
            String str = Build.MODEL;
            c1291b3.m5483a(Constants.KEY_MODEL, str == null ? UtilityImpl.NET_TYPE_UNKNOWN : str.replace(" ", "-").replace("_", "-").toLowerCase());
            DisplayMetrics displayMetrics = c1292c.f7046b.getResources().getDisplayMetrics();
            c1292c.f7045a.m5483a("dsp_w", Integer.valueOf(displayMetrics.widthPixels));
            c1292c.f7045a.m5483a("dsp_h", Integer.valueOf(displayMetrics.heightPixels));
            c1292c.f7045a.m5483a("fr", DispatchConstants.ANDROID);
            c1292c.f7045a.m5483a("rom", Build.VERSION.RELEASE);
            c1292c.f7045a.m5483a("sdk", Integer.valueOf(Build.VERSION.SDK_INT));
            c1292c.f7045a.m5483a("lang", Locale.getDefault().getLanguage());
            c1292c.f7045a.m5483a("tzone", TimeZone.getDefault().getID());
            c1292c.f7045a.m5483a("net", C1330e.m5575b(c1292c.f7046b));
            C1300f unused = C1300f.a.f7081a;
            C1288c.m5456a().m5468b();
            m5489b();
            C1339f c1339f = C1339f.a.f7143a;
            boolean z3 = f7048a.f7016i;
            C1336c c1336c = c1339f.f7139a;
            if (z3) {
                c1336c.f7131a = "https://errlogos.umeng.com/api/crashsdk/logcollect";
                c1336c.f7132b = "4ea4e41a3993";
            } else {
                c1336c.f7131a = "https://errlog.umeng.com/api/crashsdk/logcollect";
                c1336c.f7132b = "28ef1713347d";
            }
            c1339f.f7140b = this;
            c1339f.f7141c.f7126a = this;
            c1339f.f7142d.f7126a = this;
            this.f7054g = true;
            HandlerC1298d.m5503a().sendEmptyMessageDelayed(0, f7048a.f7018k);
            C1339f c1339f2 = C1339f.a.f7143a;
            if (c1339f2.f7140b != null && f7048a.f7011d) {
                c1339f2.f7140b.m5492a(new C1335b("efs_core", "pvuv", c1339f2.f7139a.f7133c));
            }
        } else if (i4 == 1) {
            Object obj = message.obj;
            if (obj != null && (obj instanceof ILogProtocol)) {
                m5491c((ILogProtocol) obj);
            }
        } else if (i4 == 3) {
            m5489b();
        }
        return true;
    }

    /* renamed from: a */
    public final void m5492a(ILogProtocol iLogProtocol) {
        if (this.f7054g) {
            m5491c(iLogProtocol);
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = iLogProtocol;
        this.f7056i.sendMessage(messageObtain);
    }

    /* renamed from: a */
    public static HttpResponse m5488a(String str, int i4, String str2, boolean z3, File file) {
        C1302b c1302b = new C1302b(str, (byte) 2);
        c1302b.m5515b(1);
        c1302b.f7092d = file;
        c1302b.m5513a(str2);
        c1302b.m5512a(i4);
        c1302b.f7090b.f7094b = z3;
        c1302b.m5518d();
        C1314d.a.f7102a.f7099a.m5520a(c1302b);
        return c1302b.f7090b.f7095c;
    }

    /* renamed from: b */
    static /* synthetic */ void m5490b(ILogProtocol iLogProtocol) {
        for (ValueCallback<Pair<Message, Message>> valueCallback : f7048a.m5449a(9)) {
            HashMap map = new HashMap(4);
            map.put("log_type", iLogProtocol.getLogType());
            map.put("log_data", iLogProtocol.generateString());
            map.put("link_key", iLogProtocol.getLinkKey());
            map.put("link_id", iLogProtocol.getLinkId());
            Message messageObtain = Message.obtain(null, 9, map);
            Message messageObtain2 = Message.obtain();
            valueCallback.onReceiveValue(new Pair<>(messageObtain, messageObtain2));
            messageObtain.recycle();
            messageObtain2.recycle();
        }
    }
}
