package p094f1;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Calendar;
import java.util.Collection;

/* renamed from: f1.l */
/* loaded from: classes4.dex */
public class C8417l extends AbstractViewOnClickListenerC8409d {
    public C8417l(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i10, boolean z10) {
        super(materialCalendarView, calendarDay, i10, z10);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    /* renamed from: b */
    public void mo13706b(Collection collection, Calendar calendar) {
        for (int i10 = 0; i10 < 6; i10++) {
            for (int i11 = 0; i11 < 7; i11++) {
                m13705a(collection, calendar);
            }
        }
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    /* renamed from: g */
    public boolean mo13711g(CalendarDay calendarDay) {
        return calendarDay.m3992k() == getFirstViewDay().m3992k();
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public int getRows() {
        return this.f15956i ? 7 : 6;
    }

    /* renamed from: j */
    public CalendarDay m13747j() {
        return getFirstViewDay();
    }
}
