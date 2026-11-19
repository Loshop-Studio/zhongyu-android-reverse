package androidx.compose.material3.internal;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.text.Regex;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p113g8.C8670i;
import p113g8.InterfaceC8672k;

/* loaded from: classes2.dex */
public final class CalendarModelKt {
    public static final int DaysInWeek = 7;
    public static final long MillisecondsIn24Hours = 86400000;

    public static final DateInputFormat datePatternAsInputFormat(String str) {
        String strM14011z0 = AbstractC8661c0.m14011z0(AbstractC8687z.m14101I(new Regex("y{1,4}").m16182i(new Regex("M{1,2}").m16182i(new Regex("d{1,2}").m16182i(new Regex("[^dMy/\\-.]").m16182i(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, null), ".");
        InterfaceC8672k interfaceC8672kM16175c = Regex.m16175c(new Regex("[/\\-.]"), strM14011z0, 0, 2, null);
        AbstractC9133u.m16130d(interfaceC8672kM16175c);
        C8670i c8670i = interfaceC8672kM16175c.mo14056c().get(0);
        AbstractC9133u.m16130d(c8670i);
        int iM13496b = c8670i.m14052a().m13496b();
        String strSubstring = strM14011z0.substring(iM13496b, iM13496b + 1);
        AbstractC9133u.m16132f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new DateInputFormat(strM14011z0, strSubstring.charAt(0));
    }
}
