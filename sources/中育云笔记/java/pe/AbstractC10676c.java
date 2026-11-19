package pe;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* renamed from: pe.c */
/* loaded from: classes6.dex */
public abstract class AbstractC10676c {

    /* renamed from: a */
    public static final a f25728a = new a();

    /* renamed from: b */
    public static final String[] f25729b;

    /* renamed from: c */
    public static final DateFormat[] f25730c;

    /* renamed from: pe.c$a */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(AbstractC9920d.f23246f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f25729b = strArr;
        f25730c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final Date m22603a(String str) {
        AbstractC9979u.m20294g(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f25728a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f25729b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    DateFormat[] dateFormatArr = f25730c;
                    DateFormat simpleDateFormat = dateFormatArr[i10];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f25729b[i10], Locale.US);
                        simpleDateFormat.setTimeZone(AbstractC9920d.f23246f);
                        dateFormatArr[i10] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                C10786q c10786q = C10786q.f26013a;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static final String m22604b(Date date) {
        AbstractC9979u.m20294g(date, "<this>");
        String str = ((DateFormat) f25728a.get()).format(date);
        AbstractC9979u.m20293f(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
