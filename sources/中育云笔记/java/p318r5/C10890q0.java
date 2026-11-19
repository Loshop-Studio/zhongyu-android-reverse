package p318r5;

import android.text.TextUtils;
import p007a6.AbstractC0063c;
import p433z5.AbstractC12022a;

/* renamed from: r5.q0 */
/* loaded from: classes5.dex */
public class C10890q0 {

    /* renamed from: c */
    public static C10890q0 f26271c;

    /* renamed from: a */
    public String f26272a;

    /* renamed from: b */
    public String f26273b;

    /* renamed from: g */
    public static C10890q0 m23591g() {
        if (f26271c == null) {
            m23592j();
        }
        return f26271c;
    }

    /* renamed from: j */
    public static synchronized void m23592j() {
        if (f26271c == null) {
            f26271c = new C10890q0();
        }
    }

    /* renamed from: a */
    public String m23593a() {
        if (TextUtils.isEmpty(this.f26272a)) {
            this.f26272a = m23597e();
        }
        return this.f26272a;
    }

    /* renamed from: b */
    public final String m23594b(String str) {
        String strM26619f = m23600i() ? AbstractC12022a.m26619f("analytics_keystore", str) : "";
        if (!TextUtils.isEmpty(strM26619f)) {
            return strM26619f;
        }
        AbstractC10861f1.m23436h("hmsSdk", "deCrypt work key first");
        String strM23586b = AbstractC10888p0.m23586b(str, m23599h());
        if (!TextUtils.isEmpty(strM23586b)) {
            if (m23600i()) {
                m23598f(m23595c(strM23586b));
                C10870i1.m23487i();
            }
            return strM23586b;
        }
        String strM125e = AbstractC0063c.m125e(16);
        m23598f(m23595c(strM125e));
        if (m23600i()) {
            C10870i1.m23487i();
        }
        return strM125e;
    }

    /* renamed from: c */
    public final String m23595c(String str) {
        return m23600i() ? AbstractC12022a.m26622i("analytics_keystore", str) : AbstractC10888p0.m23588d(str, m23599h());
    }

    /* renamed from: d */
    public void m23596d() {
        String strM125e = AbstractC0063c.m125e(16);
        if (m23598f(m23595c(strM125e))) {
            this.f26272a = strM125e;
        }
    }

    /* renamed from: e */
    public final String m23597e() {
        String strM23518b = AbstractC10877l.m23518b(AbstractC10900v0.m23682q(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(strM23518b)) {
            return m23594b(strM23518b);
        }
        String strM125e = AbstractC0063c.m125e(16);
        m23598f(m23595c(strM125e));
        return strM125e;
    }

    /* renamed from: f */
    public final boolean m23598f(String str) {
        AbstractC10861f1.m23436h("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            AbstractC10861f1.m23436h("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        AbstractC10877l.m23523g(AbstractC10900v0.m23682q(), "Privacy_MY", "PrivacyData", str);
        AbstractC10877l.m23522f(AbstractC10900v0.m23682q(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    /* renamed from: h */
    public final String m23599h() {
        if (TextUtils.isEmpty(this.f26273b)) {
            this.f26273b = new C10870i1().m23488a();
        }
        return this.f26273b;
    }

    /* renamed from: i */
    public final boolean m23600i() {
        return true;
    }
}
