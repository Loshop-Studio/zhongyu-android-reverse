package p003a2;

import androidx.collection.SparseArrayCompat;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

/* renamed from: a2.k */
/* loaded from: classes4.dex */
public class C0024k extends AbstractC0016c {

    /* renamed from: a2.k$a */
    public static class a implements InterfaceC0019f {

        /* renamed from: a */
        public final CalendarDay f93a;

        /* renamed from: b */
        public final int f94b;

        /* renamed from: c */
        public SparseArrayCompat f95c = new SparseArrayCompat();

        public a(CalendarDay calendarDay, CalendarDay calendarDay2) {
            this.f93a = CalendarDay.m4618b(calendarDay.m4628j(), calendarDay.m4627i(), 1);
            this.f94b = mo128a(CalendarDay.m4618b(calendarDay2.m4628j(), calendarDay2.m4627i(), 1)) + 1;
        }

        @Override // p003a2.InterfaceC0019f
        /* renamed from: a */
        public int mo128a(CalendarDay calendarDay) {
            return ((calendarDay.m4628j() - this.f93a.m4628j()) * 12) + (calendarDay.m4627i() - this.f93a.m4627i());
        }

        @Override // p003a2.InterfaceC0019f
        public int getCount() {
            return this.f94b;
        }

        @Override // p003a2.InterfaceC0019f
        public CalendarDay getItem(int i9) {
            CalendarDay calendarDay = (CalendarDay) this.f95c.get(i9);
            if (calendarDay != null) {
                return calendarDay;
            }
            int iM4628j = this.f93a.m4628j() + (i9 / 12);
            int iM4627i = this.f93a.m4627i() + (i9 % 12);
            if (iM4627i >= 12) {
                iM4628j++;
                iM4627i -= 12;
            }
            CalendarDay calendarDayM4618b = CalendarDay.m4618b(iM4628j, iM4627i, 1);
            this.f95c.put(i9, calendarDayM4618b);
            return calendarDayM4618b;
        }
    }

    public C0024k(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C0025l mo88c(int i9) {
        return new C0025l(this.f45b, mo91f(i9), this.f45b.getFirstDayOfWeek(), this.f62s);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public int mo96k(C0025l c0025l) {
        return mo92g().mo128a(c0025l.m155j());
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: b */
    public InterfaceC0019f mo87b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new a(calendarDay, calendarDay2);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: n */
    public boolean mo99n(Object obj) {
        return obj instanceof C0025l;
    }
}
