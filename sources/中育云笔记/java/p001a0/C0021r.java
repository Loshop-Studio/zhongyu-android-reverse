package p001a0;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;

/* renamed from: a0.r */
/* loaded from: classes3.dex */
public final class C0021r {

    /* renamed from: a */
    public static final C0021r f9a = new C0021r();

    /* renamed from: a */
    public final String m48a(String str) {
        if (AbstractC10793c0.m23132h0(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        String str2 = (String) AbstractC0022s.f10a.get(lowerCase);
        return str2 == null ? AbstractC0023t.m51a(lowerCase) : str2;
    }

    /* renamed from: b */
    public final String m49b(String str) {
        if (AbstractC10793c0.m23132h0(str)) {
            return null;
        }
        return m48a(AbstractC10793c0.m23107T0(AbstractC10793c0.m23111V0(AbstractC10793c0.m23125c1(AbstractC10793c0.m23125c1(str, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }
}
