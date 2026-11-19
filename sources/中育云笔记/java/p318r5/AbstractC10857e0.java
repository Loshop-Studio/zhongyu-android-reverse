package p318r5;

import android.util.Pair;
import com.huawei.hms.hatool.AbstractC7317o;
import com.huawei.hms.hatool.EnumC7316d0;
import java.util.List;
import java.util.Map;
import p418y5.AbstractC11913b;

/* renamed from: r5.e0 */
/* loaded from: classes5.dex */
public abstract class AbstractC10857e0 extends AbstractC10852c1 {

    /* renamed from: r5.e0$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26204a;

        static {
            int[] iArr = new int[EnumC7316d0.values().length];
            f26204a = iArr;
            try {
                iArr[EnumC7316d0.SN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26204a[EnumC7316d0.IMEI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26204a[EnumC7316d0.UDID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public static C10887p m23406a(String str, String str2, String str3, String str4) {
        C10887p c10887pM23389a = AbstractC10852c1.m23389a(str, str2, str3, str4);
        String strM23349b = C10848b0.m23347c().m23349b(AbstractC10850c.m23365d(str2, str3));
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM26450b = AbstractC11913b.m26450b(AbstractC10900v0.m23676k() + strM23349b + jCurrentTimeMillis);
        c10887pM23389a.m23428f(String.valueOf(jCurrentTimeMillis));
        c10887pM23389a.m23584g(strM26450b);
        return c10887pM23389a;
    }

    /* renamed from: b */
    public static C10872j0 m23407b(String str, String str2) {
        C10872j0 c10872j0M23390b = AbstractC10852c1.m23390b(str, str2);
        C10845a0 c10845a0M23352f = C10848b0.m23347c().m23352f(str, str2);
        c10872j0M23390b.m23503g(C10848b0.m23347c().m23349b(AbstractC10850c.m23365d(str, str2)));
        c10872j0M23390b.m23502f(AbstractC10850c.m23377p(str, str2));
        c10872j0M23390b.m23499c(C10848b0.m23347c().m23355i(str, str2));
        int i10 = a.f26204a[c10845a0M23352f.m23340a().ordinal()];
        if (i10 == 1) {
            c10872j0M23390b.m23500d(c10845a0M23352f.m23341b());
            return c10872j0M23390b;
        }
        if (i10 == 2) {
            c10872j0M23390b.m23498b(c10845a0M23352f.m23341b());
            return c10872j0M23390b;
        }
        if (i10 != 3) {
            return c10872j0M23390b;
        }
        c10872j0M23390b.m23501e(c10845a0M23352f.m23341b());
        return c10872j0M23390b;
    }

    /* renamed from: c */
    public static C10873j1 m23408c(String str, String str2, String str3) {
        C10873j1 c10873j1M23391c = AbstractC10852c1.m23391c(str, str2, str3);
        Pair pairM23354h = C10848b0.m23347c().m23354h(str2, str);
        c10873j1M23391c.m23504f((String) pairM23354h.first);
        c10873j1M23391c.m23505g((String) pairM23354h.second);
        c10873j1M23391c.m23506h(AbstractC7317o.m8640g());
        c10873j1M23391c.m23345d(C10848b0.m23347c().m23353g(str2, str));
        return c10873j1M23391c;
    }

    /* renamed from: f */
    public static C10901w m23409f(List list, String str, String str2, String str3, String str4) {
        C10901w c10901wM23392d = AbstractC10852c1.m23392d(str, str2);
        if (c10901wM23392d == null) {
            return null;
        }
        c10901wM23392d.m23691d(m23406a(C10878l0.m23526f().m23527a(), str, str2, str3));
        c10901wM23392d.m23692e(m23407b(str, str2));
        c10901wM23392d.m23693f(m23408c(str2, str, str4));
        c10901wM23392d.m23689b(AbstractC10850c.m23369h(str, str2));
        c10901wM23392d.m23690c(list);
        return c10901wM23392d;
    }

    /* renamed from: g */
    public static Map m23410g(String str, String str2, String str3) {
        Map mapM23393e = AbstractC10852c1.m23393e(str, str3);
        Map mapM23371j = AbstractC10850c.m23371j(str, str2);
        if (mapM23371j == null) {
            return mapM23393e;
        }
        mapM23393e.putAll(mapM23371j);
        return mapM23393e;
    }
}
