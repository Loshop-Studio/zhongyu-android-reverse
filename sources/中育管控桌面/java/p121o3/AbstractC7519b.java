package p121o3;

import com.blankj.utilcode.util.AbstractC4653j0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o3.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7519b {
    /* renamed from: a */
    public static final Long m8674a(String str, long j6) throws ParseException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(6, (int) j6);
            Date date2 = simpleDateFormat2.parse(simpleDateFormat2.format(new Date()));
            if (date2 == null) {
                return null;
            }
            return Long.valueOf(TimeUnit.MILLISECONDS.toDays(calendar.getTimeInMillis() - date2.getTime()));
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Long m8675b(String str, long j6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j6 = 30;
        }
        return m8674a(str, j6);
    }

    /* renamed from: c */
    public static final String m8676c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strM2202a = AbstractC4653j0.m2202a(AbstractC4653j0.m2206e(str), "yyyy年MM月dd日");
        Intrinsics.checkNotNullExpressionValue(strM2202a, "date2String(...)");
        return strM2202a;
    }
}
