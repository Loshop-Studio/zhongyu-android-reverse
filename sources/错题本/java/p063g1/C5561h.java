package p063g1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.AbstractC3869p;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.AbstractC3849f;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import p070h1.AbstractC5619a;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.h */
/* loaded from: classes2.dex */
public final class C5561h extends AbstractC3869p {

    /* renamed from: c */
    public static final C5553e f8639c = new C5553e();

    /* renamed from: a */
    public final AbstractC5559g f8640a;

    /* renamed from: b */
    public final ArrayList f8641b;

    public C5561h(AbstractC5559g abstractC5559g, int i, int i8) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f8641b = arrayList;
        Objects.requireNonNull(abstractC5559g);
        this.f8640a = abstractC5559g;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i8, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i8));
        }
        if (AbstractC3849f.f3031a >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Unknown DateFormat style: "));
                }
                str = "M/d/yy";
            }
            sb.append(str);
            sb.append(" ");
            if (i8 == 0 || i8 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i8 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i8 != 3) {
                    throw new IllegalArgumentException(AbstractC0037f.m81f(i8, "Unknown DateFormat style: "));
                }
                str2 = "h:mm a";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        Date dateM4939b;
        if (c6046a.m5764x() == JsonToken.NULL) {
            c6046a.m5760t();
            return null;
        }
        String strM5762v = c6046a.m5762v();
        synchronized (this.f8641b) {
            try {
                ArrayList arrayList = this.f8641b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        try {
                            dateM4939b = AbstractC5619a.m4939b(strM5762v, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder sbM100y = AbstractC0037f.m100y("Failed parsing '", strM5762v, "' as Date; at path ");
                            sbM100y.append(c6046a.m5750h(true));
                            throw new JsonSyntaxException(sbM100y.toString(), e);
                        }
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateM4939b = dateFormat.parse(strM5762v);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f8640a.mo4903a(dateM4939b);
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c6047b.m5775k();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f8641b.get(0);
        synchronized (this.f8641b) {
            str = dateFormat.format(date);
        }
        c6047b.m5783s(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f8641b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
