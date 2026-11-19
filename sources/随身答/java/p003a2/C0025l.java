package p003a2;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Calendar;
import java.util.Collection;

/* renamed from: a2.l */
/* loaded from: classes4.dex */
public class C0025l extends AbstractViewOnClickListenerC0017d {
    public C0025l(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i9, boolean z9) {
        super(materialCalendarView, calendarDay, i9, z9);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    /* renamed from: b */
    public void mo113b(Collection collection, Calendar calendar) {
        for (int i9 = 0; i9 < 6; i9++) {
            for (int i10 = 0; i10 < 7; i10++) {
                m112a(collection, calendar);
            }
        }
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    /* renamed from: g */
    public boolean mo118g(CalendarDay calendarDay) {
        return calendarDay.m4627i() == getFirstViewDay().m4627i();
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public int getRows() {
        return this.f72i ? 7 : 6;
    }

    /* renamed from: j */
    public CalendarDay m155j() {
        return getFirstViewDay();
    }
}
