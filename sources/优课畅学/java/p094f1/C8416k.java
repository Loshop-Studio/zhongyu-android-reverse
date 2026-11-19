package p094f1;

import androidx.collection.SparseArrayCompat;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

/* renamed from: f1.k */
/* loaded from: classes4.dex */
public class C8416k extends AbstractC8408c {

    /* renamed from: f1.k$a */
    public static class a implements InterfaceC8411f {

        /* renamed from: a */
        public final CalendarDay f15977a;

        /* renamed from: b */
        public final int f15978b;

        /* renamed from: c */
        public SparseArrayCompat f15979c = new SparseArrayCompat();

        public a(CalendarDay calendarDay, CalendarDay calendarDay2) {
            this.f15977a = CalendarDay.m3983b(calendarDay.m3993l(), calendarDay.m3992k(), 1);
            this.f15978b = mo4086a(CalendarDay.m3983b(calendarDay2.m3993l(), calendarDay2.m3992k(), 1)) + 1;
        }

        @Override // p094f1.InterfaceC8411f
        /* renamed from: a */
        public int mo4086a(CalendarDay calendarDay) {
            return ((calendarDay.m3993l() - this.f15977a.m3993l()) * 12) + (calendarDay.m3992k() - this.f15977a.m3992k());
        }

        @Override // p094f1.InterfaceC8411f
        public int getCount() {
            return this.f15978b;
        }

        @Override // p094f1.InterfaceC8411f
        public CalendarDay getItem(int i10) {
            CalendarDay calendarDay = (CalendarDay) this.f15979c.get(i10);
            if (calendarDay != null) {
                return calendarDay;
            }
            int iM3993l = this.f15977a.m3993l() + (i10 / 12);
            int iM3992k = this.f15977a.m3992k() + (i10 % 12);
            if (iM3992k >= 12) {
                iM3993l++;
                iM3992k -= 12;
            }
            CalendarDay calendarDayM3983b = CalendarDay.m3983b(iM3993l, iM3992k, 1);
            this.f15979c.put(i10, calendarDayM3983b);
            return calendarDayM3983b;
        }
    }

    public C8416k(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C8417l mo4065c(int i10) {
        return new C8417l(this.f15929b, mo4067f(i10), this.f15929b.getFirstDayOfWeek(), this.f15946s);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public int mo4071k(C8417l c8417l) {
        return mo4068g().mo4086a(c8417l.m13747j());
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: b */
    public InterfaceC8411f mo4064b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new a(calendarDay, calendarDay2);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: n */
    public boolean mo4073n(Object obj) {
        return obj instanceof C8417l;
    }
}
