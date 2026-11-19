package p118i2;

import android.content.Context;
import android.text.TextUtils;
import com.p041ta.utdid2.device.C6340a;
import com.p041ta.utdid2.device.C6345f;
import p107h2.AbstractC7618a;
import p107h2.AbstractC7619b;
import p129j2.AbstractC7786f;
import p129j2.AbstractC7788h;

/* renamed from: i2.g */
/* loaded from: classes4.dex */
public class RunnableC7659g implements Runnable {

    /* renamed from: b */
    public static volatile boolean f12918b = false;

    /* renamed from: a */
    public Context f12919a;

    public RunnableC7659g(Context context) {
        this.f12919a = context;
    }

    /* renamed from: a */
    public final void m12724a() {
        AbstractC7788h.m13183i();
        if (AbstractC7786f.m13171a(this.f12919a) && !f12918b) {
            f12918b = true;
            try {
                m12726c();
                f12918b = false;
            } catch (Throwable unused) {
                f12918b = false;
            }
        }
    }

    /* renamed from: b */
    public final boolean m12725b(String str) throws Throwable {
        C7653a c7653aM12709a = AbstractC7654b.m12709a("https://mpush-api.aliyun.com/v2.0/a/audid/req/", str, true);
        if (c7653aM12709a == null) {
            return false;
        }
        return C6345f.m4521a(c7653aM12709a);
    }

    /* renamed from: c */
    public final void m12726c() {
        AbstractC7788h.m13183i();
        String strM12727d = m12727d();
        if (TextUtils.isEmpty(strM12727d)) {
            AbstractC7788h.m13179e("postData is empty", new Object[0]);
        } else if (m12725b(strM12727d)) {
            AbstractC7788h.m13179e("", "upload success");
        } else {
            AbstractC7788h.m13179e("", "upload fail");
        }
    }

    /* renamed from: d */
    public final String m12727d() {
        String strM4500r = C6340a.m4496a().m4500r();
        if (TextUtils.isEmpty(strM4500r)) {
            return null;
        }
        String strM12542a = AbstractC7618a.m12542a(strM4500r);
        if (AbstractC7788h.m13182h()) {
            AbstractC7788h.m13181g("", strM12542a);
        }
        return AbstractC7619b.m12544a(strM12542a);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            m12724a();
        } catch (Throwable th) {
            AbstractC7788h.m13178d("", th, new Object[0]);
        }
    }
}
