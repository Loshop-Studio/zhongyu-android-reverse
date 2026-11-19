package p318r5;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.hatool.AbstractC7317o;
import com.huawei.hms.hatool.EnumC7316d0;

/* renamed from: r5.m */
/* loaded from: classes5.dex */
public abstract class AbstractC10880m {
    /* renamed from: a */
    public abstract String mo23356a();

    /* renamed from: b */
    public abstract String mo23357b(String str);

    /* renamed from: c */
    public final C10845a0 m23542c(int i10) {
        String strM23546j;
        if (i10 != 0) {
            strM23546j = m23546j();
            if (!TextUtils.isEmpty(strM23546j)) {
                return new C10845a0(EnumC7316d0.UDID, strM23546j);
            }
        } else {
            strM23546j = "";
        }
        return new C10845a0(EnumC7316d0.EMPTY, strM23546j);
    }

    /* renamed from: d */
    public C10845a0 m23543d(Context context) {
        String strMo23359g = mo23359g();
        if (!TextUtils.isEmpty(strMo23359g)) {
            return new C10845a0(EnumC7316d0.UDID, strMo23359g);
        }
        String strMo23356a = mo23356a();
        if (!TextUtils.isEmpty(strMo23356a)) {
            return new C10845a0(EnumC7316d0.IMEI, strMo23356a);
        }
        boolean zM23545i = m23545i();
        String strMo23358e = mo23358e();
        return !TextUtils.isEmpty(strMo23358e) ? zM23545i ? new C10845a0(EnumC7316d0.SN, strMo23358e) : new C10845a0(EnumC7316d0.UDID, mo23357b(strMo23358e)) : zM23545i ? m23542c(mo23360h()) : m23544f(mo23360h());
    }

    /* renamed from: e */
    public abstract String mo23358e();

    /* renamed from: f */
    public final C10845a0 m23544f(int i10) {
        String strM23546j;
        if ((i10 & 4) != 0) {
            strM23546j = m23546j();
            if (!TextUtils.isEmpty(strM23546j)) {
                return new C10845a0(EnumC7316d0.UDID, strM23546j);
            }
        } else {
            strM23546j = "";
        }
        return new C10845a0(EnumC7316d0.EMPTY, strM23546j);
    }

    /* renamed from: g */
    public abstract String mo23359g();

    /* renamed from: h */
    public abstract int mo23360h();

    /* renamed from: i */
    public final boolean m23545i() {
        C10895t c10895tM23746d = C10908z0.m23741e().m23746d();
        if (TextUtils.isEmpty(c10895tM23746d.m23654x())) {
            c10895tM23746d.m23647q(AbstractC7317o.m8636c());
        }
        return !TextUtils.isEmpty(c10895tM23746d.m23654x());
    }

    /* renamed from: j */
    public final String m23546j() {
        C10895t c10895tM23746d = C10908z0.m23741e().m23746d();
        if (TextUtils.isEmpty(c10895tM23746d.m23648r())) {
            c10895tM23746d.m23641k(AbstractC10867h1.m23470k());
        }
        return c10895tM23746d.m23648r();
    }
}
