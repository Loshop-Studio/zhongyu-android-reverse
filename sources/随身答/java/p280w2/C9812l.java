package p280w2;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.AbstractC6782a;
import java.io.File;
import java.io.IOException;
import p270v2.AbstractC9753a;
import p270v2.AbstractC9755c;

/* renamed from: w2.l */
/* loaded from: classes4.dex */
public class C9812l extends AbstractC9803c {

    /* renamed from: f */
    public Context f17480f;

    /* renamed from: g */
    public String f17481g;

    /* renamed from: h */
    public String f17482h;

    public C9812l(Context context) {
        super("oldumid");
        this.f17481g = null;
        this.f17482h = null;
        this.f17480f = context;
    }

    @Override // p280w2.AbstractC9803c
    /* renamed from: i */
    public String mo16651i() {
        return this.f17481g;
    }

    /* renamed from: j */
    public boolean m16668j() {
        return m16670l();
    }

    /* renamed from: k */
    public final void m16669k(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* renamed from: l */
    public boolean m16670l() throws IOException {
        String strM6274h = AbstractC6782a.m6274h(this.f17480f, "umid", null);
        this.f17482h = strM6274h;
        if (TextUtils.isEmpty(strM6274h)) {
            return false;
        }
        this.f17482h = AbstractC9753a.m16341g(this.f17482h);
        String strM16395d = AbstractC9755c.m16395d(new File("/sdcard/Android/data/.um/sysid.dat"));
        String strM16395d2 = AbstractC9755c.m16395d(new File("/sdcard/Android/obj/.um/sysid.dat"));
        String strM16395d3 = AbstractC9755c.m16395d(new File("/data/local/tmp/.um/sysid.dat"));
        if (TextUtils.isEmpty(strM16395d)) {
            m16674p();
        } else if (!this.f17482h.equals(strM16395d)) {
            this.f17481g = strM16395d;
            return true;
        }
        if (TextUtils.isEmpty(strM16395d2)) {
            m16673o();
        } else if (!this.f17482h.equals(strM16395d2)) {
            this.f17481g = strM16395d2;
            return true;
        }
        if (TextUtils.isEmpty(strM16395d3)) {
            m16672n();
            return false;
        }
        if (this.f17482h.equals(strM16395d3)) {
            return false;
        }
        this.f17481g = strM16395d3;
        return true;
    }

    /* renamed from: m */
    public void m16671m() {
        try {
            m16674p();
            m16673o();
            m16672n();
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public final void m16672n() {
        try {
            m16669k("/data/local/tmp/.um");
            AbstractC9755c.m16400i(new File("/data/local/tmp/.um/sysid.dat"), this.f17482h);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: o */
    public final void m16673o() {
        try {
            m16669k("/sdcard/Android/obj/.um");
            AbstractC9755c.m16400i(new File("/sdcard/Android/obj/.um/sysid.dat"), this.f17482h);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: p */
    public final void m16674p() {
        try {
            m16669k("/sdcard/Android/data/.um");
            AbstractC9755c.m16400i(new File("/sdcard/Android/data/.um/sysid.dat"), this.f17482h);
        } catch (Throwable unused) {
        }
    }
}
