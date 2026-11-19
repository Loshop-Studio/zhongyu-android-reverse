package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.j */
/* loaded from: classes2.dex */
public class C3489j extends AbstractC3480a {

    /* renamed from: a */
    private static final String f2828a = "oldumid";

    /* renamed from: b */
    private Context f2829b;

    /* renamed from: c */
    private String f2830c;

    /* renamed from: d */
    private String f2831d;

    public C3489j(Context context) {
        super(f2828a);
        this.f2830c = null;
        this.f2831d = null;
        this.f2829b = context;
    }

    /* renamed from: b */
    private void m3786b(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* renamed from: j */
    private void m3787j() {
        try {
            m3786b("/data/local/tmp/.um");
            HelperUtils.writeFile(new File("/data/local/tmp/.um/sysid.dat"), this.f2831d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: k */
    private void m3788k() {
        try {
            m3786b("/sdcard/Android/obj/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/obj/.um/sysid.dat"), this.f2831d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: l */
    private void m3789l() {
        try {
            m3786b("/sdcard/Android/data/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/data/.um/sysid.dat"), this.f2831d);
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3480a
    /* renamed from: f */
    public String mo3766f() {
        return this.f2830c;
    }

    /* renamed from: g */
    public boolean m3790g() {
        return m3791h();
    }

    /* renamed from: h */
    public boolean m3791h() throws IOException {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f2829b, C3335ai.f1727g, null);
        this.f2831d = strImprintProperty;
        if (TextUtils.isEmpty(strImprintProperty)) {
            return false;
        }
        this.f2831d = DataHelper.encryptBySHA1(this.f2831d);
        String file = HelperUtils.readFile(new File("/sdcard/Android/data/.um/sysid.dat"));
        String file2 = HelperUtils.readFile(new File("/sdcard/Android/obj/.um/sysid.dat"));
        String file3 = HelperUtils.readFile(new File("/data/local/tmp/.um/sysid.dat"));
        if (TextUtils.isEmpty(file)) {
            m3789l();
        } else if (!this.f2831d.equals(file)) {
            this.f2830c = file;
            return true;
        }
        if (TextUtils.isEmpty(file2)) {
            m3788k();
        } else if (!this.f2831d.equals(file2)) {
            this.f2830c = file2;
            return true;
        }
        if (TextUtils.isEmpty(file3)) {
            m3787j();
            return false;
        }
        if (this.f2831d.equals(file3)) {
            return false;
        }
        this.f2830c = file3;
        return true;
    }

    /* renamed from: i */
    public void m3792i() {
        try {
            m3789l();
            m3788k();
            m3787j();
        } catch (Exception unused) {
        }
    }
}
