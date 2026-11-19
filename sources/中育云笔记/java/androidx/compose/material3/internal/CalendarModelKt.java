package androidx.compose.material3.internal;

import com.alibaba.android.arouter.utils.Consts;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.text.Regex;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p310qd.C10802i;
import p310qd.InterfaceC10804k;

/* loaded from: classes2.dex */
public final class CalendarModelKt {
    public static final int DaysInWeek = 7;
    public static final long MillisecondsIn24Hours = 86400000;

    public static final DateInputFormat datePatternAsInputFormat(String str) {
        String strM23150z0 = AbstractC10793c0.m23150z0(AbstractC10819z.m23238K(new Regex("y{1,4}").m20343m(new Regex("M{1,2}").m20343m(new Regex("d{1,2}").m20343m(new Regex("[^dMy/\\-.]").m20343m(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, null), Consts.DOT);
        InterfaceC10804k interfaceC10804kM20336d = Regex.m20336d(new Regex("[/\\-.]"), strM23150z0, 0, 2, null);
        AbstractC9979u.m20291d(interfaceC10804kM20336d);
        C10802i c10802i = interfaceC10804kM20336d.mo23194b().get(0);
        AbstractC9979u.m20291d(c10802i);
        int iM21733b = c10802i.m23191a().m21733b();
        String strSubstring = strM23150z0.substring(iM21733b, iM21733b + 1);
        AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new DateInputFormat(strM23150z0, strSubstring.charAt(0));
    }
}
