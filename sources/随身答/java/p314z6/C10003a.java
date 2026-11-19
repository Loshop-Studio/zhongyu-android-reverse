package p314z6;

import com.blankj.utilcode.util.TimeUtils;
import com.zykj.student.dialogue.bean.resp.CollectSessionRespKt;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.a */
/* loaded from: classes5.dex */
public final class C10003a {

    /* renamed from: a */
    public static final C10003a f18026a = new C10003a();

    /* renamed from: b */
    public static /* synthetic */ String m17359b(C10003a c10003a, SimpleDateFormat simpleDateFormat, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            simpleDateFormat = new SimpleDateFormat(CollectSessionRespKt.SDF_WITH_SECONDS, Locale.CHINA);
        }
        return c10003a.m17361a(simpleDateFormat);
    }

    /* renamed from: d */
    public static /* synthetic */ String m17360d(C10003a c10003a, SimpleDateFormat simpleDateFormat, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            simpleDateFormat = new SimpleDateFormat(CollectSessionRespKt.SDF_WITH_SECONDS, Locale.CHINA);
        }
        return c10003a.m17362c(simpleDateFormat);
    }

    /* renamed from: a */
    public final String m17361a(SimpleDateFormat simpleDateFormat) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "simpleDateFormat");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        String strDate2String = TimeUtils.date2String(m17363e(time), simpleDateFormat);
        Intrinsics.checkNotNullExpressionValue(strDate2String, "date2String(...)");
        return strDate2String;
    }

    /* renamed from: c */
    public final String m17362c(SimpleDateFormat simpleDateFormat) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "simpleDateFormat");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i9 = calendar.get(7);
        if (i9 == 1) {
            i9 += 7;
        }
        calendar.add(5, 2 - i9);
        calendar.set(11, 0);
        calendar.set(12, 0);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        String strDate2String = TimeUtils.date2String(m17363e(time), simpleDateFormat);
        Intrinsics.checkNotNullExpressionValue(strDate2String, "date2String(...)");
        return strDate2String;
    }

    /* renamed from: e */
    public final Date m17363e(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), 0);
        calendar.set(14, 0);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }
}
