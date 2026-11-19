package p318r5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.UUID;
import p418y5.AbstractC11913b;

/* renamed from: r5.b0 */
/* loaded from: classes5.dex */
public class C10848b0 {

    /* renamed from: b */
    public static C10848b0 f26175b;

    /* renamed from: a */
    public Context f26176a;

    /* renamed from: r5.b0$a */
    public static class a extends AbstractC10880m {

        /* renamed from: a */
        public String f26177a;

        /* renamed from: b */
        public String f26178b;

        public a(String str, String str2) {
            this.f26177a = str;
            this.f26178b = str2;
        }

        @Override // p318r5.AbstractC10880m
        /* renamed from: a */
        public String mo23356a() {
            return AbstractC10882m1.m23554d(this.f26177a, this.f26178b);
        }

        @Override // p318r5.AbstractC10880m
        /* renamed from: b */
        public String mo23357b(String str) {
            return AbstractC11913b.m26450b(str);
        }

        @Override // p318r5.AbstractC10880m
        /* renamed from: e */
        public String mo23358e() {
            return AbstractC10882m1.m23557g(this.f26177a, this.f26178b);
        }

        @Override // p318r5.AbstractC10880m
        /* renamed from: g */
        public String mo23359g() {
            return AbstractC10882m1.m23560j(this.f26177a, this.f26178b);
        }

        @Override // p318r5.AbstractC10880m
        /* renamed from: h */
        public int mo23360h() {
            return (AbstractC10882m1.m23561k(this.f26177a, this.f26178b) ? 4 : 0) | (AbstractC10882m1.m23555e(this.f26177a, this.f26178b) ? 2 : 0) | (AbstractC10882m1.m23558h(this.f26177a, this.f26178b) ? 1 : 0);
        }
    }

    /* renamed from: c */
    public static C10848b0 m23347c() {
        C10848b0 c10848b0;
        synchronized (C10848b0.class) {
            try {
                if (f26175b == null) {
                    f26175b = new C10848b0();
                }
                c10848b0 = f26175b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10848b0;
    }

    /* renamed from: a */
    public String m23348a(String str, String str2) {
        return AbstractC10905y.m23703a(this.f26176a, str, str2);
    }

    /* renamed from: b */
    public String m23349b(boolean z10) {
        if (!z10) {
            return "";
        }
        String strM23674i = AbstractC10900v0.m23674i();
        if (TextUtils.isEmpty(strM23674i)) {
            strM23674i = AbstractC10877l.m23518b(this.f26176a, "global_v2", "uuid", "");
            if (TextUtils.isEmpty(strM23674i)) {
                strM23674i = UUID.randomUUID().toString().replace("-", "");
                AbstractC10877l.m23523g(this.f26176a, "global_v2", "uuid", strM23674i);
            }
            AbstractC10900v0.m23681p(strM23674i);
        }
        return strM23674i;
    }

    /* renamed from: d */
    public void m23350d(Context context) {
        if (this.f26176a == null) {
            this.f26176a = context;
        }
    }

    /* renamed from: e */
    public String m23351e(String str, String str2) {
        return AbstractC10905y.m23704b(this.f26176a, str, str2);
    }

    /* renamed from: f */
    public C10845a0 m23352f(String str, String str2) {
        return new a(str, str2).m23543d(this.f26176a);
    }

    /* renamed from: g */
    public String m23353g(String str, String str2) {
        return AbstractC10889q.m23590f(str, str2);
    }

    /* renamed from: h */
    public Pair m23354h(String str, String str2) {
        if (!AbstractC10882m1.m23556f(str, str2)) {
            return new Pair("", "");
        }
        String strM23627F = C10908z0.m23741e().m23746d().m23627F();
        String strM23629H = C10908z0.m23741e().m23746d().m23629H();
        if (!TextUtils.isEmpty(strM23627F) && !TextUtils.isEmpty(strM23629H)) {
            return new Pair(strM23627F, strM23629H);
        }
        Pair pairM23471l = AbstractC10867h1.m23471l(this.f26176a);
        C10908z0.m23741e().m23746d().m23653w((String) pairM23471l.first);
        C10908z0.m23741e().m23746d().m23655y((String) pairM23471l.second);
        return pairM23471l;
    }

    /* renamed from: i */
    public String m23355i(String str, String str2) {
        return AbstractC10889q.m23589e(str, str2);
    }
}
