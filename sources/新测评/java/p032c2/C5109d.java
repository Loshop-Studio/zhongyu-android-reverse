package p032c2;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: c2.d */
/* loaded from: classes4.dex */
public class C5109d implements InterfaceC5112g {

    /* renamed from: a */
    public final DateFormat f2669a = new SimpleDateFormat("LLLL yyyy", Locale.getDefault());

    @Override // p032c2.InterfaceC5112g
    /* renamed from: a */
    public CharSequence mo2727a(CalendarDay calendarDay) {
        return this.f2669a.format(calendarDay.m4420g());
    }
}
