package p106g1;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: g1.c */
/* loaded from: classes4.dex */
public class C8517c implements InterfaceC8519e {

    /* renamed from: b */
    public final DateFormat f16102b = new SimpleDateFormat("d", Locale.getDefault());

    @Override // p106g1.InterfaceC8519e
    /* renamed from: a */
    public String mo13884a(CalendarDay calendarDay) {
        return this.f16102b.format(calendarDay.m3990i());
    }
}
