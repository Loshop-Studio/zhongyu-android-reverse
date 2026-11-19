package com.efs.sdk.base.p039a.p044d;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.RetryPolicy;
import androidx.core.os.EnvironmentCompat;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p039a.p040a.C5641a;
import com.efs.sdk.base.p039a.p042c.C5653a;
import com.efs.sdk.base.p039a.p042c.C5659b;
import com.efs.sdk.base.p039a.p042c.C5660c;
import com.efs.sdk.base.p039a.p042c.p043a.C5656c;
import com.efs.sdk.base.p039a.p044d.p045a.RunnableC5662a;
import com.efs.sdk.base.p039a.p046e.C5668f;
import com.efs.sdk.base.p039a.p046e.HandlerC5666d;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p048g.C5682d;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.C5698e;
import com.efs.sdk.base.p039a.p050h.C5699f;
import com.efs.sdk.base.p039a.p050h.C5700g;
import com.efs.sdk.base.p039a.p050h.C5701h;
import com.efs.sdk.base.p039a.p050h.p051a.C5684a;
import com.efs.sdk.base.p039a.p050h.p051a.C5687d;
import com.efs.sdk.base.p039a.p054i.C5703b;
import com.efs.sdk.base.p039a.p054i.C5704c;
import com.efs.sdk.base.p039a.p054i.C5707f;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.efs.sdk.base.a.d.a */
/* loaded from: classes3.dex */
public final class C5661a implements Handler.Callback {

    /* renamed from: a */
    public static C5653a f4682a;

    /* renamed from: b */
    private int f4683b = 0;

    /* renamed from: c */
    private final int f4684c = 0;

    /* renamed from: d */
    private final int f4685d = 1;

    /* renamed from: e */
    private final int f4686e = 2;

    /* renamed from: f */
    private final int f4687f = 3;

    /* renamed from: g */
    private volatile boolean f4688g = false;

    /* renamed from: h */
    private RunnableC5662a f4689h;

    /* renamed from: i */
    private Handler f4690i;

    public C5661a(EfsReporter.Builder builder) {
        f4682a = builder.getGlobalEnvStruct();
        Handler handler = new Handler(C5684a.f4739a.getLooper(), this);
        this.f4690i = handler;
        handler.sendEmptyMessage(0);
    }

    @NonNull
    /* renamed from: a */
    public static C5653a m4097a() {
        return f4682a;
    }

    /* renamed from: b */
    private void m4099b() {
        if (this.f4689h == null) {
            this.f4689h = new RunnableC5662a();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f4682a.f4644c.registerReceiver(this.f4689h, intentFilter);
        } catch (Throwable th) {
            C5697d.m4182a("efs.base", "register network change receiver error", th);
            int i9 = this.f4683b + 1;
            this.f4683b = i9;
            if (i9 < 3) {
                this.f4690i.sendEmptyMessageDelayed(3, RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
            }
        }
    }

    /* renamed from: c */
    private void m4101c(final ILogProtocol iLogProtocol) {
        if (iLogProtocol == null) {
            return;
        }
        C5687d.m4146a(new Runnable() { // from class: com.efs.sdk.base.a.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    iLogProtocol.insertGlobal(C5660c.a.f4681a.f4679a);
                    if (!"wa".equalsIgnoreCase(iLogProtocol.getLogType())) {
                        C5661a.m4100b(iLogProtocol);
                    }
                    if (C5661a.m4097a().f4646e) {
                        final C5670b c5670bM4119a = C5670b.m4119a(iLogProtocol);
                        final C5682d c5682d = C5682d.a.f4736a;
                        C5687d.m4146a(new Runnable() { // from class: com.efs.sdk.base.a.g.d.1

                            /* renamed from: a */
                            final /* synthetic */ C5670b f4734a;

                            public AnonymousClass1(final C5670b c5670bM4119a2) {
                                c5670b = c5670bM4119a2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C5682d.this.f4733a.m4130a(c5670b);
                            }
                        });
                    }
                } catch (Throwable th) {
                    C5697d.m4183b("efs.base", "log send error", th);
                }
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        int i9 = message.what;
        if (i9 == 0) {
            C5660c c5660c = C5660c.a.f4681a;
            C5659b c5659b = new C5659b();
            c5660c.f4679a = c5659b;
            c5659b.m4093a("appid", f4682a.f4642a);
            int iM4190a = C5700g.m4190a();
            c5660c.f4679a.m4093a("pid", Integer.valueOf(iM4190a));
            c5660c.f4679a.m4093a("ps", C5700g.m4191a(iM4190a));
            String strM4194a = C5701h.m4194a(c5660c.f4680b);
            c5660c.f4679a.m4093a("wid", strM4194a);
            if (TextUtils.isEmpty(f4682a.f4649h)) {
                c5660c.f4679a.m4093a("uid", strM4194a);
            } else {
                c5660c.f4679a.m4093a("uid", f4682a.f4649h);
            }
            C5659b c5659b2 = c5660c.f4679a;
            C5641a.m4024a();
            c5659b2.m4093a("stime", Long.valueOf(C5641a.m4027b() - Process.getElapsedCpuTime()));
            c5660c.f4679a.m4093a("pkg", c5660c.f4680b.getPackageName());
            c5660c.f4679a.m4093a("ver", C5699f.m4188a(c5660c.f4680b));
            c5660c.f4679a.m4093a("vcode", C5699f.m4189b(c5660c.f4680b));
            c5660c.f4679a.m4093a("sdk_ver", BuildConfig.VERSION_NAME);
            c5660c.f4679a.m4093a("brand", Build.BRAND.toLowerCase());
            C5659b c5659b3 = c5660c.f4679a;
            String str = Build.MODEL;
            c5659b3.m4093a("model", str == null ? EnvironmentCompat.MEDIA_UNKNOWN : str.replace(" ", "-").replace("_", "-").toLowerCase());
            DisplayMetrics displayMetrics = c5660c.f4680b.getResources().getDisplayMetrics();
            c5660c.f4679a.m4093a("dsp_w", Integer.valueOf(displayMetrics.widthPixels));
            c5660c.f4679a.m4093a("dsp_h", Integer.valueOf(displayMetrics.heightPixels));
            c5660c.f4679a.m4093a("fr", "android");
            c5660c.f4679a.m4093a("rom", Build.VERSION.RELEASE);
            c5660c.f4679a.m4093a("sdk", Integer.valueOf(Build.VERSION.SDK_INT));
            c5660c.f4679a.m4093a("lang", Locale.getDefault().getLanguage());
            c5660c.f4679a.m4093a("tzone", TimeZone.getDefault().getID());
            c5660c.f4679a.m4093a("net", C5698e.m4185b(c5660c.f4680b));
            C5668f unused = C5668f.a.f4715a;
            C5656c.m4066a().m4078b();
            m4099b();
            C5707f c5707f = C5707f.a.f4777a;
            boolean z9 = f4682a.f4650i;
            C5704c c5704c = c5707f.f4773a;
            if (z9) {
                c5704c.f4765a = "https://errlogos.umeng.com/api/crashsdk/logcollect";
                c5704c.f4766b = "4ea4e41a3993";
            } else {
                c5704c.f4765a = "https://errlog.umeng.com/api/crashsdk/logcollect";
                c5704c.f4766b = "28ef1713347d";
            }
            c5707f.f4774b = this;
            c5707f.f4775c.f4760a = this;
            c5707f.f4776d.f4760a = this;
            this.f4688g = true;
            HandlerC5666d.m4113a().sendEmptyMessageDelayed(0, f4682a.f4652k);
            C5707f c5707f2 = C5707f.a.f4777a;
            if (c5707f2.f4774b != null && f4682a.f4645d) {
                c5707f2.f4774b.m4102a(new C5703b("efs_core", "pvuv", c5707f2.f4773a.f4767c));
            }
        } else if (i9 == 1) {
            Object obj = message.obj;
            if (obj != null && (obj instanceof ILogProtocol)) {
                m4101c((ILogProtocol) obj);
            }
        } else if (i9 == 3) {
            m4099b();
        }
        return true;
    }

    /* renamed from: a */
    public final void m4102a(ILogProtocol iLogProtocol) {
        if (this.f4688g) {
            m4101c(iLogProtocol);
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = iLogProtocol;
        this.f4690i.sendMessage(messageObtain);
    }

    @Nullable
    /* renamed from: a */
    public static HttpResponse m4098a(String str, int i9, String str2, boolean z9, File file) {
        C5670b c5670b = new C5670b(str, (byte) 2);
        c5670b.m4125b(1);
        c5670b.f4726d = file;
        c5670b.m4123a(str2);
        c5670b.m4122a(i9);
        c5670b.f4724b.f4728b = z9;
        c5670b.m4128d();
        C5682d.a.f4736a.f4733a.m4130a(c5670b);
        return c5670b.f4724b.f4729c;
    }

    /* renamed from: b */
    public static /* synthetic */ void m4100b(ILogProtocol iLogProtocol) {
        for (ValueCallback<Pair<Message, Message>> valueCallback : f4682a.m4059a(9)) {
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
