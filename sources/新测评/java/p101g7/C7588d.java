package p101g7;

import com.blankj.utilcode.util.TimeUtils;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g7.d */
/* loaded from: classes4.dex */
public final class C7588d {

    /* renamed from: a */
    public static final C7588d f12716a = new C7588d();

    /* renamed from: a */
    public final String m12451a() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        String strDate2String = TimeUtils.date2String(m12453c(time));
        Intrinsics.checkNotNullExpressionValue(strDate2String, "date2String(...)");
        return strDate2String;
    }

    /* renamed from: b */
    public final String m12452b() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i10 = calendar.get(7);
        if (i10 == 1) {
            i10 += 7;
        }
        calendar.add(5, 2 - i10);
        calendar.set(11, 0);
        calendar.set(12, 0);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        String strDate2String = TimeUtils.date2String(m12453c(time));
        Intrinsics.checkNotNullExpressionValue(strDate2String, "date2String(...)");
        return strDate2String;
    }

    /* renamed from: c */
    public final Date m12453c(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), 0);
        calendar.set(14, 0);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }
}
