package p300y2;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.AbstractC6782a;
import p270v2.AbstractC9756d;
import p280w2.C9801a;
import p280w2.C9802b;
import p290x2.InterfaceC9873h;

/* renamed from: y2.a */
/* loaded from: classes4.dex */
public class C9945a implements InterfaceC9873h {

    /* renamed from: i */
    public static C9945a f17872i;

    /* renamed from: a */
    public boolean f17873a = false;

    /* renamed from: b */
    public int f17874b = -1;

    /* renamed from: c */
    public int f17875c = -1;

    /* renamed from: d */
    public int f17876d = -1;

    /* renamed from: e */
    public float f17877e = 0.0f;

    /* renamed from: f */
    public float f17878f = 0.0f;

    /* renamed from: g */
    public String f17879g = null;

    /* renamed from: h */
    public Context f17880h;

    public C9945a(Context context, String str, int i9) {
        this.f17880h = context;
        m17142g(str, i9);
    }

    /* renamed from: c */
    public static synchronized C9945a m17137c(Context context) {
        try {
            if (f17872i == null) {
                f17872i = new C9945a(context, AbstractC6782a.m6274h(context, "client_test", null), Integer.valueOf(AbstractC6782a.m6274h(context, "test_report_interval", "0")).intValue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17872i;
    }

    @Override // p290x2.InterfaceC9873h
    /* renamed from: a */
    public void mo16130a(C9802b.a aVar) {
        m17142g(aVar.m16638a("client_test", null), Integer.valueOf(aVar.m16638a("test_report_interval", "0")).intValue());
    }

    /* renamed from: b */
    public String m17138b() {
        return !this.f17873a ? "error" : String.valueOf(this.f17876d);
    }

    /* renamed from: d */
    public String m17139d() {
        return this.f17879g;
    }

    /* renamed from: e */
    public int m17140e() {
        return this.f17874b;
    }

    /* renamed from: f */
    public boolean m17141f() {
        return this.f17873a;
    }

    /* renamed from: g */
    public void m17142g(String str, int i9) {
        this.f17875c = i9;
        String strM16606h = C9801a.m16606h(this.f17880h);
        if (TextUtils.isEmpty(strM16606h) || TextUtils.isEmpty(str)) {
            this.f17873a = false;
            return;
        }
        try {
            this.f17877e = m17145j(strM16606h, 12);
            this.f17878f = m17145j(strM16606h, 6);
            if (str.startsWith("SIG7")) {
                m17144i(str);
            } else if (str.startsWith("FIXED")) {
                m17143h(str);
            }
        } catch (Exception e10) {
            this.f17873a = false;
            AbstractC9756d.m16406e("v:" + str, e10);
        }
    }

    /* renamed from: h */
    public final void m17143h(String str) {
        int[] iArr;
        if (str == null) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        if (this.f17877e > (strArrSplit[2].equals("SIG13") ? Float.valueOf(strArrSplit[3]).floatValue() : 0.0f)) {
            this.f17873a = false;
            return;
        }
        int iIntValue = strArrSplit[0].equals("FIXED") ? Integer.valueOf(strArrSplit[1]).intValue() : -1;
        if (strArrSplit[4].equals("RPT")) {
            this.f17879g = "RPT";
            String[] strArrSplit2 = strArrSplit[5].split(",");
            iArr = new int[strArrSplit2.length];
            for (int i9 = 0; i9 < strArrSplit2.length; i9++) {
                iArr[i9] = Integer.valueOf(strArrSplit2[i9]).intValue();
            }
        } else if (strArrSplit[4].equals("DOM")) {
            this.f17879g = "DOM";
            this.f17873a = true;
            try {
                String[] strArrSplit3 = strArrSplit[5].split(",");
                iArr = new int[strArrSplit3.length];
                for (int i10 = 0; i10 < strArrSplit3.length; i10++) {
                    try {
                        iArr[i10] = Integer.valueOf(strArrSplit3[i10]).intValue();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        } else {
            iArr = null;
        }
        if (iIntValue == -1) {
            this.f17873a = false;
            return;
        }
        this.f17873a = true;
        this.f17876d = iIntValue;
        if (iArr != null) {
            this.f17874b = iArr[iIntValue - 1];
        }
    }

    /* renamed from: i */
    public final void m17144i(String str) {
        float[] fArr;
        if (str == null) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        float f10 = 0.0f;
        if (this.f17877e > (strArrSplit[2].equals("SIG13") ? Float.valueOf(strArrSplit[3]).floatValue() : 0.0f)) {
            this.f17873a = false;
            return;
        }
        int[] iArr = null;
        if (strArrSplit[0].equals("SIG7")) {
            String[] strArrSplit2 = strArrSplit[1].split(",");
            fArr = new float[strArrSplit2.length];
            for (int i9 = 0; i9 < strArrSplit2.length; i9++) {
                fArr[i9] = Float.valueOf(strArrSplit2[i9]).floatValue();
            }
        } else {
            fArr = null;
        }
        if (strArrSplit[4].equals("RPT")) {
            this.f17879g = "RPT";
            String[] strArrSplit3 = strArrSplit[5].split(",");
            iArr = new int[strArrSplit3.length];
            for (int i10 = 0; i10 < strArrSplit3.length; i10++) {
                iArr[i10] = Integer.valueOf(strArrSplit3[i10]).intValue();
            }
        } else if (strArrSplit[4].equals("DOM")) {
            this.f17873a = true;
            this.f17879g = "DOM";
            try {
                String[] strArrSplit4 = strArrSplit[5].split(",");
                iArr = new int[strArrSplit4.length];
                for (int i11 = 0; i11 < strArrSplit4.length; i11++) {
                    iArr[i11] = Integer.valueOf(strArrSplit4[i11]).intValue();
                }
            } catch (Exception unused) {
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 >= fArr.length) {
                i12 = -1;
                break;
            }
            f10 += fArr[i12];
            if (this.f17878f < f10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1) {
            this.f17873a = false;
            return;
        }
        this.f17873a = true;
        this.f17876d = i12 + 1;
        if (iArr != null) {
            this.f17874b = iArr[i12];
        }
    }

    /* renamed from: j */
    public final float m17145j(String str, int i9) {
        int i10 = i9 * 2;
        if (str == null) {
            return 0.0f;
        }
        return Integer.valueOf(str.substring(i10, i10 + 5), 16).intValue() / 1048576.0f;
    }

    public String toString() {
        return " p13:" + this.f17877e + " p07:" + this.f17878f + " policy:" + this.f17874b + " interval:" + this.f17875c;
    }
}
