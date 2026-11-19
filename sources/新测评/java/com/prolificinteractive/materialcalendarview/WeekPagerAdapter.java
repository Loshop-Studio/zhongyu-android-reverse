package com.prolificinteractive.materialcalendarview;

import android.view.View;
import android.view.ViewGroup;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p021b2.AbstractC4963c;
import p021b2.C4979s;
import p021b2.InterfaceC4966f;
import p032c2.InterfaceC5110e;
import p032c2.InterfaceC5112g;
import p032c2.InterfaceC5113h;

/* loaded from: classes4.dex */
public class WeekPagerAdapter extends AbstractC4963c {

    /* renamed from: com.prolificinteractive.materialcalendarview.WeekPagerAdapter$a */
    public static class C6339a implements InterfaceC4966f {

        /* renamed from: a */
        public final CalendarDay f4806a;

        /* renamed from: b */
        public final int f4807b;

        public C6339a(CalendarDay calendarDay, CalendarDay calendarDay2, int i10) {
            CalendarDay calendarDayM4492b = m4492b(calendarDay, i10);
            this.f4806a = calendarDayM4492b;
            this.f4807b = m4493c(calendarDayM4492b, calendarDay2) + 1;
        }

        @Override // p021b2.InterfaceC4966f
        /* renamed from: a */
        public int mo2417a(CalendarDay calendarDay) {
            return m4493c(this.f4806a, calendarDay);
        }

        /* renamed from: b */
        public final CalendarDay m4492b(CalendarDay calendarDay, int i10) {
            Calendar calendar = Calendar.getInstance();
            calendarDay.m4418a(calendar);
            while (calendar.get(7) != i10) {
                calendar.add(7, -1);
            }
            return CalendarDay.m4414c(calendar);
        }

        /* renamed from: c */
        public final int m4493c(CalendarDay calendarDay, CalendarDay calendarDay2) {
            return (int) (TimeUnit.DAYS.convert(((calendarDay2.m4420g().getTime() - calendarDay.m4420g().getTime()) + calendarDay2.m4419e().get(16)) - calendarDay.m4419e().get(16), TimeUnit.MILLISECONDS) / 7);
        }

        @Override // p021b2.InterfaceC4966f
        public int getCount() {
            return this.f4807b;
        }

        @Override // p021b2.InterfaceC4966f
        public CalendarDay getItem(int i10) {
            return CalendarDay.m4415d(new Date(this.f4806a.m4420g().getTime() + TimeUnit.MILLISECONDS.convert(i10 * 7, TimeUnit.DAYS)));
        }
    }

    public WeekPagerAdapter(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: A */
    public /* bridge */ /* synthetic */ void mo2373A(int i10) {
        super.mo2373A(i10);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C4979s mo2377c(int i10) {
        return new C4979s(this.f2395b, mo2380f(i10), this.f2395b.getFirstDayOfWeek(), this.f2412s);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public int mo2385k(C4979s c4979s) {
        return mo2381g().mo2417a(c4979s.getFirstViewDay());
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo2375a() {
        super.mo2375a();
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: b */
    public InterfaceC4966f mo2376b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new C6339a(calendarDay, calendarDay2, this.f2395b.getFirstDayOfWeek());
    }

    @Override // p021b2.AbstractC4963c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        super.destroyItem(viewGroup, i10, obj);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo2379e(CalendarDay calendarDay) {
        return super.mo2379e(calendarDay);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: f */
    public /* bridge */ /* synthetic */ CalendarDay mo2380f(int i10) {
        return super.mo2380f(i10);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: g */
    public /* bridge */ /* synthetic */ InterfaceC4966f mo2381g() {
        return super.mo2381g();
    }

    @Override // p021b2.AbstractC4963c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // p021b2.AbstractC4963c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ int getItemPosition(Object obj) {
        return super.getItemPosition(obj);
    }

    @Override // p021b2.AbstractC4963c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ CharSequence getPageTitle(int i10) {
        return super.getPageTitle(i10);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: h */
    public /* bridge */ /* synthetic */ List mo2382h() {
        return super.mo2382h();
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: i */
    public /* bridge */ /* synthetic */ int mo2383i() {
        return super.mo2383i();
    }

    @Override // p021b2.AbstractC4963c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i10) {
        return super.instantiateItem(viewGroup, i10);
    }

    @Override // p021b2.AbstractC4963c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ boolean isViewFromObject(View view, Object obj) {
        return super.isViewFromObject(view, obj);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo2386l() {
        super.mo2386l();
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: n */
    public boolean mo2388n(Object obj) {
        return obj instanceof C4979s;
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: o */
    public /* bridge */ /* synthetic */ AbstractC4963c mo2389o(AbstractC4963c abstractC4963c) {
        return super.mo2389o(abstractC4963c);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: p */
    public /* bridge */ /* synthetic */ void mo2390p(CalendarDay calendarDay, boolean z9) {
        super.mo2390p(calendarDay, z9);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: q */
    public /* bridge */ /* synthetic */ void mo2391q(int i10) {
        super.mo2391q(i10);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo2392r(InterfaceC5110e interfaceC5110e) {
        super.mo2392r(interfaceC5110e);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: s */
    public /* bridge */ /* synthetic */ void mo2393s(InterfaceC5110e interfaceC5110e) {
        super.mo2393s(interfaceC5110e);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: t */
    public /* bridge */ /* synthetic */ void mo2394t(CalendarDay calendarDay, CalendarDay calendarDay2) {
        super.mo2394t(calendarDay, calendarDay2);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo2395u(int i10) {
        super.mo2395u(i10);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: v */
    public /* bridge */ /* synthetic */ void mo2396v(boolean z9) {
        super.mo2396v(z9);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: w */
    public /* bridge */ /* synthetic */ void mo2397w(int i10) {
        super.mo2397w(i10);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: x */
    public /* bridge */ /* synthetic */ void mo2398x(boolean z9) {
        super.mo2398x(z9);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: y */
    public /* bridge */ /* synthetic */ void mo2399y(InterfaceC5112g interfaceC5112g) {
        super.mo2399y(interfaceC5112g);
    }

    @Override // p021b2.AbstractC4963c
    /* renamed from: z */
    public /* bridge */ /* synthetic */ void mo2400z(InterfaceC5113h interfaceC5113h) {
        super.mo2400z(interfaceC5113h);
    }
}
