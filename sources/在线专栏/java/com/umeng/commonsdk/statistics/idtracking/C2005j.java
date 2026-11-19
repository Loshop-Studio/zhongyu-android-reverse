package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C1851ai;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.j */
/* loaded from: classes.dex */
public class C2005j extends AbstractC1996a {

    /* renamed from: a */
    private static final String f9420a = "oldumid";

    /* renamed from: b */
    private Context f9421b;

    /* renamed from: c */
    private String f9422c;

    /* renamed from: d */
    private String f9423d;

    public C2005j(Context context) {
        super(f9420a);
        this.f9422c = null;
        this.f9423d = null;
        this.f9421b = context;
    }

    /* renamed from: b */
    private void m7709b(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* renamed from: j */
    private void m7710j() {
        try {
            m7709b("/data/local/tmp/.um");
            HelperUtils.writeFile(new File("/data/local/tmp/.um/sysid.dat"), this.f9423d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: k */
    private void m7711k() {
        try {
            m7709b("/sdcard/Android/obj/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/obj/.um/sysid.dat"), this.f9423d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: l */
    private void m7712l() {
        try {
            m7709b("/sdcard/Android/data/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/data/.um/sysid.dat"), this.f9423d);
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC1996a
    /* renamed from: f */
    public String mo7689f() {
        return this.f9422c;
    }

    /* renamed from: g */
    public boolean m7713g() {
        return m7714h();
    }

    /* renamed from: h */
    public boolean m7714h() throws IOException {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f9421b, C1851ai.f8319g, null);
        this.f9423d = strImprintProperty;
        if (TextUtils.isEmpty(strImprintProperty)) {
            return false;
        }
        this.f9423d = DataHelper.encryptBySHA1(this.f9423d);
        String file = HelperUtils.readFile(new File("/sdcard/Android/data/.um/sysid.dat"));
        String file2 = HelperUtils.readFile(new File("/sdcard/Android/obj/.um/sysid.dat"));
        String file3 = HelperUtils.readFile(new File("/data/local/tmp/.um/sysid.dat"));
        if (TextUtils.isEmpty(file)) {
            m7712l();
        } else if (!this.f9423d.equals(file)) {
            this.f9422c = file;
            return true;
        }
        if (TextUtils.isEmpty(file2)) {
            m7711k();
        } else if (!this.f9423d.equals(file2)) {
            this.f9422c = file2;
            return true;
        }
        if (TextUtils.isEmpty(file3)) {
            m7710j();
            return false;
        }
        if (this.f9423d.equals(file3)) {
            return false;
        }
        this.f9422c = file3;
        return true;
    }

    /* renamed from: i */
    public void m7715i() {
        try {
            m7712l();
            m7711k();
            m7710j();
        } catch (Exception unused) {
        }
    }
}
