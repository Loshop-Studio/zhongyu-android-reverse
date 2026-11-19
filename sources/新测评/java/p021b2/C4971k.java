package p021b2;

import androidx.collection.SparseArrayCompat;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

/* renamed from: b2.k */
/* loaded from: classes4.dex */
public class C4971k extends AbstractC4963c {

    /* renamed from: b2.k$a */
    public static class a implements InterfaceC4966f {

        /* renamed from: a */
        public final CalendarDay f2443a;

        /* renamed from: b */
        public final int f2444b;

        /* renamed from: c */
        public SparseArrayCompat f2445c = new SparseArrayCompat();

        public a(CalendarDay calendarDay, CalendarDay calendarDay2) {
            this.f2443a = CalendarDay.m4413b(calendarDay.m4423j(), calendarDay.m4422i(), 1);
            this.f2444b = mo2417a(CalendarDay.m4413b(calendarDay2.m4423j(), calendarDay2.m4422i(), 1)) + 1;
        }

        @Override // p021b2.InterfaceC4966f
        /* renamed from: a */
        public int mo2417a(CalendarDay calendarDay) {
            return ((calendarDay.m4423j() - this.f2443a.m4423j()) * 12) + (calendarDay.m4422i() - this.f2443a.m4422i());
        }

        @Override // p021b2.InterfaceC4966f
        public int getCount() {
            return this.f2444b;
        }

        @Override // p021b2.InterfaceC4966f
        public CalendarDay getItem(int i10) {
            CalendarDay calendarDay = (CalendarDay) this.f2445c.get(i10);
            if (calendarDay != null) {
                return calendarDay;
            }
            int iM4423j = this.f2443a.m4423j() + (i10 / 12);
            int iM4422i = this.f2443a.m4422i() + (i10 % 12);
            if (iM4422i >= 12) {
                iM4423j++;
                iM4422i -= 12;
            }
            CalendarDay calendarDayM4413b = CalendarDay.m4413b(iM4423j, iM4422i, 1);
            this.f2445c.put(i10, calendarDayM4413b);
            return calendarDayM4413b;
        }
    }

    public C4971k(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C4972l mo2377c(int i10) {
        return new C4972l(this.f2395b, mo2380f(i10), this.f2395b.getFirstDayOfWeek(), this.f2412s);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public int mo2385k(C4972l c4972l) {
        return mo2381g().mo2417a(c4972l.m2444j());
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: b */
    public InterfaceC4966f mo2376b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new a(calendarDay, calendarDay2);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: n */
    public boolean mo2388n(Object obj) {
        return obj instanceof C4972l;
    }
}
