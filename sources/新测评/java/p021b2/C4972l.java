package p021b2;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Calendar;
import java.util.Collection;

/* renamed from: b2.l */
/* loaded from: classes4.dex */
public class C4972l extends AbstractViewOnClickListenerC4964d {
    public C4972l(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i10, boolean z9) {
        super(materialCalendarView, calendarDay, i10, z9);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    /* renamed from: b */
    public void mo2402b(Collection collection, Calendar calendar) {
        for (int i10 = 0; i10 < 6; i10++) {
            for (int i11 = 0; i11 < 7; i11++) {
                m2401a(collection, calendar);
            }
        }
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    /* renamed from: g */
    public boolean mo2407g(CalendarDay calendarDay) {
        return calendarDay.m4422i() == getFirstViewDay().m4422i();
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public int getRows() {
        return this.f2422i ? 7 : 6;
    }

    /* renamed from: j */
    public CalendarDay m2444j() {
        return getFirstViewDay();
    }
}
