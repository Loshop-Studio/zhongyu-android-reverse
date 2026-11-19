package p344t5;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;
import java.net.URISyntaxException;

/* renamed from: t5.s */
/* loaded from: classes5.dex */
public class C11245s {

    /* renamed from: c */
    public static final String[] f26987c = {"url", "app", "cosa", "rp"};

    /* renamed from: a */
    public Context f26988a;

    /* renamed from: b */
    public C11239m f26989b;

    public C11245s(Context context, C11239m c11239m) {
        this.f26988a = context;
        this.f26989b = c11239m;
    }

    /* renamed from: b */
    public static boolean m25081b(String str) {
        for (String str2 : f26987c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m25082a() {
        try {
            HMSLog.m8727i("PushSelfShowLog", "enter launchApp, appPackageName =" + this.f26989b.m25046g());
            if (AbstractC11231e.m25001h(this.f26988a, this.f26989b.m25046g())) {
                m25083c();
            }
        } catch (Exception e10) {
            HMSLog.m8725e("PushSelfShowLog", "launchApp error:" + e10.toString());
        }
    }

    /* renamed from: c */
    public final void m25083c() throws URISyntaxException {
        Intent uri;
        HMSLog.m8727i("PushSelfShowLog", "run into launchCosaApp");
        try {
            HMSLog.m8727i("PushSelfShowLog", "enter launchExistApp cosa, appPackageName =" + this.f26989b.m25046g() + ",and msg.intentUri is " + this.f26989b.m25065z());
            Intent intentM24998e = AbstractC11231e.m24998e(this.f26988a, this.f26989b.m25046g());
            boolean zBooleanValue = false;
            if (this.f26989b.m25065z() != null) {
                try {
                    uri = Intent.parseUri(this.f26989b.m25065z(), 0);
                    uri.setSelector(null);
                    if (uri.getClipData() == null) {
                        uri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
                    }
                    HMSLog.m8727i("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
                    zBooleanValue = AbstractC11231e.m24995b(this.f26988a, this.f26989b.m25046g(), uri).booleanValue();
                    if (zBooleanValue) {
                        intentM24998e = uri;
                    }
                } catch (Exception e10) {
                    HMSLog.m8728w("PushSelfShowLog", "intentUri error." + e10.toString());
                }
            } else if (this.f26989b.m25040a() != null) {
                uri = new Intent(this.f26989b.m25040a());
                if (AbstractC11231e.m24995b(this.f26988a, this.f26989b.m25046g(), uri).booleanValue()) {
                    intentM24998e = uri;
                }
            }
            if (intentM24998e == null) {
                HMSLog.m8727i("PushSelfShowLog", "launchCosaApp,intent == null");
                return;
            }
            intentM24998e.setPackage(this.f26989b.m25046g());
            if (zBooleanValue) {
                intentM24998e.addFlags(268435456);
            } else {
                intentM24998e.setFlags(805437440);
            }
            this.f26988a.startActivity(intentM24998e);
        } catch (Exception e11) {
            HMSLog.m8725e("PushSelfShowLog", "launch Cosa App exception." + e11.toString());
        }
    }

    /* renamed from: d */
    public void m25084d() throws URISyntaxException {
        C11239m c11239m;
        HMSLog.m8722d("PushSelfShowLog", "enter launchNotify()");
        if (this.f26988a == null || (c11239m = this.f26989b) == null) {
            HMSLog.m8722d("PushSelfShowLog", "launchNotify  context or msg is null");
            return;
        }
        if ("app".equals(c11239m.m25056q())) {
            m25082a();
            return;
        }
        if ("cosa".equals(this.f26989b.m25056q())) {
            m25083c();
            return;
        }
        if ("rp".equals(this.f26989b.m25056q())) {
            HMSLog.m8728w("PushSelfShowLog", this.f26989b.m25056q() + " not support rich message.");
            return;
        }
        if ("url".equals(this.f26989b.m25056q())) {
            HMSLog.m8728w("PushSelfShowLog", this.f26989b.m25056q() + " not support URL.");
            return;
        }
        HMSLog.m8722d("PushSelfShowLog", this.f26989b.m25056q() + " is not exist in hShowType");
    }
}
