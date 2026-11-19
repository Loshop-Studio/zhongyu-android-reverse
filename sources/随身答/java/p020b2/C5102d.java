package p020b2;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: b2.d */
/* loaded from: classes4.dex */
public class C5102d implements InterfaceC5105g {

    /* renamed from: a */
    public final DateFormat f2210a = new SimpleDateFormat("LLLL yyyy", Locale.getDefault());

    @Override // p020b2.InterfaceC5105g
    /* renamed from: a */
    public CharSequence mo2164a(CalendarDay calendarDay) {
        return this.f2210a.format(calendarDay.m4625f());
    }
}
