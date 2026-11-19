package p102l5;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p065g5.AbstractC6427k;

/* renamed from: l5.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7349c {

    /* renamed from: a */
    public static final a f9325a = new a();

    /* renamed from: b */
    public static final String[] f9326b;

    /* renamed from: c */
    public static final DateFormat[] f9327c;

    /* renamed from: l5.c$a */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(AbstractC6427k.f8099a);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f9326b = strArr;
        f9327c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final Date m8319a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f9325a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f9326b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    DateFormat[] dateFormatArr = f9327c;
                    DateFormat simpleDateFormat = dateFormatArr[i6];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f9326b[i6], Locale.US);
                        simpleDateFormat.setTimeZone(AbstractC6427k.f8099a);
                        dateFormatArr[i6] = simpleDateFormat;
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
    public static final String m8320b(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String str = ((DateFormat) f9325a.get()).format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
