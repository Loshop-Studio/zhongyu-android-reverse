package p032c2;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: c2.c */
/* loaded from: classes4.dex */
public class C5108c implements InterfaceC5110e {

    /* renamed from: b */
    public final DateFormat f2668b = new SimpleDateFormat("d", Locale.getDefault());

    @Override // p032c2.InterfaceC5110e
    /* renamed from: a */
    public String mo2726a(CalendarDay calendarDay) {
        return this.f2668b.format(calendarDay.m4420g());
    }
}
