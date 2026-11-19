package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.s0 */
/* loaded from: classes2.dex */
public class C5584s0 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException, NumberFormatException {
        int iM5756p;
        if (c6046a.m5764x() == JsonToken.NULL) {
            c6046a.m5760t();
            return null;
        }
        c6046a.m5744b();
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (c6046a.m5764x() != JsonToken.END_OBJECT) {
            String strM5758r = c6046a.m5758r();
            iM5756p = c6046a.m5756p();
            strM5758r.getClass();
            switch (strM5758r) {
                case "dayOfMonth":
                    i9 = iM5756p;
                    break;
                case "minute":
                    i11 = iM5756p;
                    break;
                case "second":
                    i12 = iM5756p;
                    break;
                case "year":
                    i = iM5756p;
                    break;
                case "month":
                    i8 = iM5756p;
                    break;
                case "hourOfDay":
                    i10 = iM5756p;
                    break;
            }
        }
        c6046a.m5748f();
        return new GregorianCalendar(i, i8, i9, i10, i11, i12);
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            c6047b.m5775k();
            return;
        }
        c6047b.m5769c();
        c6047b.m5773g("year");
        c6047b.m5781q(r4.get(1));
        c6047b.m5773g("month");
        c6047b.m5781q(r4.get(2));
        c6047b.m5773g("dayOfMonth");
        c6047b.m5781q(r4.get(5));
        c6047b.m5773g("hourOfDay");
        c6047b.m5781q(r4.get(11));
        c6047b.m5773g("minute");
        c6047b.m5781q(r4.get(12));
        c6047b.m5773g("second");
        c6047b.m5781q(r4.get(13));
        c6047b.m5772f();
    }
}
