package p344t5;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;
import java.net.URISyntaxException;

/* renamed from: t5.n */
/* loaded from: classes5.dex */
public class C11240n extends Thread {

    /* renamed from: c */
    public Context f26978c;

    /* renamed from: d */
    public C11239m f26979d;

    public C11240n(Context context, C11239m c11239m) {
        this.f26978c = context;
        this.f26979d = c11239m;
    }

    /* renamed from: a */
    public static Intent m25066a(Context context, C11239m c11239m) throws URISyntaxException {
        Intent uri;
        if (c11239m == null) {
            return null;
        }
        Intent intentM24998e = AbstractC11231e.m24998e(context, c11239m.m25046g());
        if (c11239m.m25065z() == null) {
            if (c11239m.m25040a() != null) {
                Intent intent = new Intent(c11239m.m25040a());
                if (AbstractC11231e.m24995b(context, c11239m.m25046g(), intent).booleanValue()) {
                    intentM24998e = intent;
                }
            }
            intentM24998e.setPackage(c11239m.m25046g());
            return intentM24998e;
        }
        try {
            uri = Intent.parseUri(c11239m.m25065z(), 0);
            uri.setSelector(null);
            if (uri.getClipData() == null) {
                uri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
            }
            HMSLog.m8722d("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
        } catch (Exception e10) {
            HMSLog.m8728w("PushSelfShowLog", "intentUri error," + e10.toString());
        }
        return AbstractC11231e.m24995b(context, c11239m.m25046g(), uri).booleanValue() ? uri : intentM24998e;
    }

    /* renamed from: b */
    public final boolean m25067b(Context context) {
        return AbstractC11231e.m25001h(context, this.f26979d.m25046g());
    }

    /* renamed from: c */
    public final boolean m25068c(Context context) {
        if ("cosa".equals(this.f26979d.m25056q())) {
            return m25067b(context);
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m25069d(Context context, C11239m c11239m) {
        if (!"cosa".equals(c11239m.m25056q()) || m25066a(context, c11239m) != null) {
            return false;
        }
        HMSLog.m8722d("PushSelfShowLog", "launchCosaApp,intent == null");
        return true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        HMSLog.m8727i("PushSelfShowLog", "enter run()");
        try {
            if (m25068c(this.f26978c) && !m25069d(this.f26978c, this.f26979d)) {
                AbstractC11238l.m25017e(this.f26978c, this.f26979d);
            }
        } catch (Exception e10) {
            HMSLog.m8725e("PushSelfShowLog", e10.toString());
        }
    }
}
