package p163u3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import p078i4.AbstractC6533c;

/* renamed from: u3.d */
/* loaded from: classes4.dex */
public abstract class AbstractC7772d {
    /* renamed from: a */
    public static final String m9301a(long j6) {
        String str = new SimpleDateFormat("M月d日", Locale.CHINA).format(Long.valueOf(j6));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* renamed from: b */
    public static final String m9302b(long j6) {
        String str = new SimpleDateFormat("HH:mm", Locale.CHINA).format(Long.valueOf(j6));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* renamed from: c */
    public static final String m9303c(long j6) {
        Calendar.getInstance().setTimeInMillis(j6);
        return AbstractC6533c.f8364a.m7301a()[r0.get(7) - 1];
    }
}
