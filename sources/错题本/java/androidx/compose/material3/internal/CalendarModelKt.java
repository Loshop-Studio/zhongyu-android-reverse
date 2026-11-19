package androidx.compose.material3.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlin.text.C5849j;
import kotlin.text.C5852m;
import kotlin.text.InterfaceC5850k;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m5110d2 = {"DaysInWeek", "", "MillisecondsIn24Hours", "", "datePatternAsInputFormat", "Landroidx/compose/material3/internal/DateInputFormat;", "localeFormat", "", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CalendarModelKt {
    public static final int DaysInWeek = 7;
    public static final long MillisecondsIn24Hours = 86400000;

    @NotNull
    public static final DateInputFormat datePatternAsInputFormat(@NotNull String str) {
        String strM5390X = AbstractC5855p.m5390X(AbstractC5862w.m5407A(new Regex("y{1,4}").replace(new Regex("M{1,2}").replace(new Regex("d{1,2}").replace(new Regex("[^dMy/\\-.]").replace(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y"), ".");
        InterfaceC5850k interfaceC5850kFind$default = Regex.find$default(new Regex("[/\\-.]"), strM5390X, 0, 2, null);
        AbstractC5830k.m5327d(interfaceC5850kFind$default);
        C5849j c5849jM5369a = ((C5852m) interfaceC5850kFind$default).f9266c.m5369a(0);
        AbstractC5830k.m5327d(c5849jM5369a);
        int i = c5849jM5369a.f9262b.f11420a;
        String strSubstring = strM5390X.substring(i, i + 1);
        AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new DateInputFormat(strM5390X, strSubstring.charAt(0));
    }
}
