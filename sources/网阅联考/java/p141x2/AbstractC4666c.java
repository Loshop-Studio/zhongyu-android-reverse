package p141x2;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p121s2.AbstractC4550b;

/* renamed from: x2.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4666c {

    /* renamed from: a */
    public static final a f5963a = new a();

    /* renamed from: b */
    public static final String[] f5964b;

    /* renamed from: c */
    public static final DateFormat[] f5965c;

    /* renamed from: x2.c$a */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(AbstractC4550b.f5706f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f5964b = strArr;
        f5965c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final Date m6563a(String toHttpDateOrNull) {
        Intrinsics.checkNotNullParameter(toHttpDateOrNull, "$this$toHttpDateOrNull");
        if (toHttpDateOrNull.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f5963a.get()).parse(toHttpDateOrNull, parsePosition);
        if (parsePosition.getIndex() == toHttpDateOrNull.length()) {
            return date;
        }
        String[] strArr = f5964b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                DateFormat[] dateFormatArr = f5965c;
                DateFormat simpleDateFormat = dateFormatArr[i4];
                if (simpleDateFormat == null) {
                    simpleDateFormat = new SimpleDateFormat(f5964b[i4], Locale.US);
                    simpleDateFormat.setTimeZone(AbstractC4550b.f5706f);
                    dateFormatArr[i4] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(toHttpDateOrNull, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }

    /* renamed from: b */
    public static final String m6564b(Date toHttpDateString) {
        Intrinsics.checkNotNullParameter(toHttpDateString, "$this$toHttpDateString");
        String str = ((DateFormat) f5963a.get()).format(toHttpDateString);
        Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
