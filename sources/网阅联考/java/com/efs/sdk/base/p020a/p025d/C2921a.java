package com.efs.sdk.base.p020a.p025d;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.core.os.EnvironmentCompat;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p020a.p021a.C2901a;
import com.efs.sdk.base.p020a.p023c.C2913a;
import com.efs.sdk.base.p020a.p023c.C2919b;
import com.efs.sdk.base.p020a.p023c.C2920c;
import com.efs.sdk.base.p020a.p023c.p024a.C2916c;
import com.efs.sdk.base.p020a.p025d.p026a.RunnableC2922a;
import com.efs.sdk.base.p020a.p027e.C2928f;
import com.efs.sdk.base.p020a.p027e.HandlerC2926d;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p029g.C2942d;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.C2958e;
import com.efs.sdk.base.p020a.p031h.C2959f;
import com.efs.sdk.base.p020a.p031h.C2960g;
import com.efs.sdk.base.p020a.p031h.C2961h;
import com.efs.sdk.base.p020a.p031h.p032a.C2944a;
import com.efs.sdk.base.p020a.p031h.p032a.C2947d;
import com.efs.sdk.base.p020a.p035i.C2963b;
import com.efs.sdk.base.p020a.p035i.C2964c;
import com.efs.sdk.base.p020a.p035i.C2967f;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.efs.sdk.base.a.d.a */
/* loaded from: classes2.dex */
public final class C2921a implements Handler.Callback {

    /* renamed from: a */
    public static C2913a f1078a;

    /* renamed from: b */
    private int f1079b = 0;

    /* renamed from: c */
    private final int f1080c = 0;

    /* renamed from: d */
    private final int f1081d = 1;

    /* renamed from: e */
    private final int f1082e = 2;

    /* renamed from: f */
    private final int f1083f = 3;

    /* renamed from: g */
    private volatile boolean f1084g = false;

    /* renamed from: h */
    private RunnableC2922a f1085h;

    /* renamed from: i */
    private Handler f1086i;

    public C2921a(EfsReporter.Builder builder) {
        f1078a = builder.getGlobalEnvStruct();
        Handler handler = new Handler(C2944a.f1135a.getLooper(), this);
        this.f1086i = handler;
        handler.sendEmptyMessage(0);
    }

    @NonNull
    /* renamed from: a */
    public static C2913a m2128a() {
        return f1078a;
    }

    /* renamed from: b */
    private void m2130b() {
        if (this.f1085h == null) {
            this.f1085h = new RunnableC2922a();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f1078a.f1040c.registerReceiver(this.f1085h, intentFilter);
        } catch (Throwable th) {
            C2957d.m2213a("efs.base", "register network change receiver error", th);
            int i4 = this.f1079b + 1;
            this.f1079b = i4;
            if (i4 < 3) {
                this.f1086i.sendEmptyMessageDelayed(3, 6000L);
            }
        }
    }

    /* renamed from: c */
    private void m2132c(final ILogProtocol iLogProtocol) {
        if (iLogProtocol == null) {
            return;
        }
        C2947d.m2177a(new Runnable() { // from class: com.efs.sdk.base.a.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    iLogProtocol.insertGlobal(C2920c.a.f1077a.f1075a);
                    if (!"wa".equalsIgnoreCase(iLogProtocol.getLogType())) {
                        C2921a.m2131b(iLogProtocol);
                    }
                    if (C2921a.m2128a().f1042e) {
                        final C2930b c2930bM2150a = C2930b.m2150a(iLogProtocol);
                        final C2942d c2942d = C2942d.a.f1132a;
                        C2947d.m2177a(new Runnable() { // from class: com.efs.sdk.base.a.g.d.1

                            /* renamed from: a */
                            final /* synthetic */ C2930b f1130a;

                            public AnonymousClass1(final C2930b c2930bM2150a2) {
                                c2930b = c2930bM2150a2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C2942d.this.f1129a.m2161a(c2930b);
                            }
                        });
                    }
                } catch (Throwable th) {
                    C2957d.m2214b("efs.base", "log send error", th);
                }
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            C2920c c2920c = C2920c.a.f1077a;
            C2919b c2919b = new C2919b();
            c2920c.f1075a = c2919b;
            c2919b.m2124a("appid", f1078a.f1038a);
            int iM2221a = C2960g.m2221a();
            c2920c.f1075a.m2124a("pid", Integer.valueOf(iM2221a));
            c2920c.f1075a.m2124a("ps", C2960g.m2222a(iM2221a));
            String strM2225a = C2961h.m2225a(c2920c.f1076b);
            c2920c.f1075a.m2124a("wid", strM2225a);
            if (TextUtils.isEmpty(f1078a.f1045h)) {
                c2920c.f1075a.m2124a("uid", strM2225a);
            } else {
                c2920c.f1075a.m2124a("uid", f1078a.f1045h);
            }
            C2919b c2919b2 = c2920c.f1075a;
            C2901a.m2055a();
            c2919b2.m2124a("stime", Long.valueOf(C2901a.m2058b() - Process.getElapsedCpuTime()));
            c2920c.f1075a.m2124a("pkg", c2920c.f1076b.getPackageName());
            c2920c.f1075a.m2124a("ver", C2959f.m2219a(c2920c.f1076b));
            c2920c.f1075a.m2124a("vcode", C2959f.m2220b(c2920c.f1076b));
            c2920c.f1075a.m2124a("sdk_ver", BuildConfig.VERSION_NAME);
            c2920c.f1075a.m2124a("brand", Build.BRAND.toLowerCase());
            C2919b c2919b3 = c2920c.f1075a;
            String str = Build.MODEL;
            c2919b3.m2124a("model", str == null ? EnvironmentCompat.MEDIA_UNKNOWN : str.replace(" ", "-").replace("_", "-").toLowerCase());
            DisplayMetrics displayMetrics = c2920c.f1076b.getResources().getDisplayMetrics();
            c2920c.f1075a.m2124a("dsp_w", Integer.valueOf(displayMetrics.widthPixels));
            c2920c.f1075a.m2124a("dsp_h", Integer.valueOf(displayMetrics.heightPixels));
            c2920c.f1075a.m2124a("fr", "android");
            c2920c.f1075a.m2124a("rom", Build.VERSION.RELEASE);
            c2920c.f1075a.m2124a("sdk", Integer.valueOf(Build.VERSION.SDK_INT));
            c2920c.f1075a.m2124a("lang", Locale.getDefault().getLanguage());
            c2920c.f1075a.m2124a("tzone", TimeZone.getDefault().getID());
            c2920c.f1075a.m2124a("net", C2958e.m2216b(c2920c.f1076b));
            C2928f unused = C2928f.a.f1111a;
            C2916c.m2097a().m2109b();
            m2130b();
            C2967f c2967f = C2967f.a.f1173a;
            boolean z3 = f1078a.f1046i;
            C2964c c2964c = c2967f.f1169a;
            if (z3) {
                c2964c.f1161a = "https://errlogos.umeng.com/api/crashsdk/logcollect";
                c2964c.f1162b = "4ea4e41a3993";
            } else {
                c2964c.f1161a = "https://errlog.umeng.com/api/crashsdk/logcollect";
                c2964c.f1162b = "28ef1713347d";
            }
            c2967f.f1170b = this;
            c2967f.f1171c.f1156a = this;
            c2967f.f1172d.f1156a = this;
            this.f1084g = true;
            HandlerC2926d.m2144a().sendEmptyMessageDelayed(0, f1078a.f1048k);
            C2967f c2967f2 = C2967f.a.f1173a;
            if (c2967f2.f1170b != null && f1078a.f1041d) {
                c2967f2.f1170b.m2133a(new C2963b("efs_core", "pvuv", c2967f2.f1169a.f1163c));
            }
        } else if (i4 == 1) {
            Object obj = message.obj;
            if (obj != null && (obj instanceof ILogProtocol)) {
                m2132c((ILogProtocol) obj);
            }
        } else if (i4 == 3) {
            m2130b();
        }
        return true;
    }

    /* renamed from: a */
    public final void m2133a(ILogProtocol iLogProtocol) {
        if (this.f1084g) {
            m2132c(iLogProtocol);
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = iLogProtocol;
        this.f1086i.sendMessage(messageObtain);
    }

    @Nullable
    /* renamed from: a */
    public static HttpResponse m2129a(String str, int i4, String str2, boolean z3, File file) {
        C2930b c2930b = new C2930b(str, (byte) 2);
        c2930b.m2156b(1);
        c2930b.f1122d = file;
        c2930b.m2154a(str2);
        c2930b.m2153a(i4);
        c2930b.f1120b.f1124b = z3;
        c2930b.m2159d();
        C2942d.a.f1132a.f1129a.m2161a(c2930b);
        return c2930b.f1120b.f1125c;
    }

    /* renamed from: b */
    public static /* synthetic */ void m2131b(ILogProtocol iLogProtocol) {
        for (ValueCallback<Pair<Message, Message>> valueCallback : f1078a.m2090a(9)) {
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
