package p106g1;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: g1.d */
/* loaded from: classes4.dex */
public class C8518d implements InterfaceC8521g {

    /* renamed from: a */
    public final DateFormat f16103a = new SimpleDateFormat("LLLL yyyy", Locale.getDefault());

    @Override // p106g1.InterfaceC8521g
    /* renamed from: a */
    public CharSequence mo13885a(CalendarDay calendarDay) {
        return this.f16103a.format(calendarDay.m3990i());
    }
}
