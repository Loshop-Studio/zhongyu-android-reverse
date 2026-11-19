package p236r8;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p182m8.AbstractC9045d;

/* renamed from: r8.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9441c {

    /* renamed from: a */
    public static final a f16455a = new a();

    /* renamed from: b */
    public static final String[] f16456b;

    /* renamed from: c */
    public static final DateFormat[] f16457c;

    /* renamed from: r8.c$a */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(AbstractC9045d.f15229f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f16456b = strArr;
        f16457c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final Date m15577a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f16455a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f16456b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    DateFormat[] dateFormatArr = f16457c;
                    DateFormat simpleDateFormat = dateFormatArr[i9];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f16456b[i9], Locale.US);
                        simpleDateFormat.setTimeZone(AbstractC9045d.f15229f);
                        dateFormatArr[i9] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                Unit unit = Unit.INSTANCE;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static final String m15578b(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String str = ((DateFormat) f16455a.get()).format(date);
        Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
