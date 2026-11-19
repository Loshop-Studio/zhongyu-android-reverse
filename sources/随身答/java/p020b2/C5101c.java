package p020b2;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: b2.c */
/* loaded from: classes4.dex */
public class C5101c implements InterfaceC5103e {

    /* renamed from: b */
    public final DateFormat f2209b = new SimpleDateFormat("d", Locale.getDefault());

    @Override // p020b2.InterfaceC5103e
    /* renamed from: a */
    public String mo2163a(CalendarDay calendarDay) {
        return this.f2209b.format(calendarDay.m4625f());
    }
}
