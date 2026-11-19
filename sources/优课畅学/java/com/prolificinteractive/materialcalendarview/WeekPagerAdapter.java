package com.prolificinteractive.materialcalendarview;

import android.view.View;
import android.view.ViewGroup;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p094f1.AbstractC8408c;
import p094f1.C8424s;
import p094f1.InterfaceC8411f;
import p106g1.InterfaceC8519e;
import p106g1.InterfaceC8521g;
import p106g1.InterfaceC8522h;

/* loaded from: classes4.dex */
public class WeekPagerAdapter extends AbstractC8408c {

    /* renamed from: com.prolificinteractive.materialcalendarview.WeekPagerAdapter$a */
    public static class C6408a implements InterfaceC8411f {

        /* renamed from: a */
        public final CalendarDay f4294a;

        /* renamed from: b */
        public final int f4295b;

        public C6408a(CalendarDay calendarDay, CalendarDay calendarDay2, int i10) {
            CalendarDay calendarDayM4087b = m4087b(calendarDay, i10);
            this.f4294a = calendarDayM4087b;
            this.f4295b = m4088c(calendarDayM4087b, calendarDay2) + 1;
        }

        @Override // p094f1.InterfaceC8411f
        /* renamed from: a */
        public int mo4086a(CalendarDay calendarDay) {
            return m4088c(this.f4294a, calendarDay);
        }

        /* renamed from: b */
        public final CalendarDay m4087b(CalendarDay calendarDay, int i10) {
            Calendar calendar = Calendar.getInstance();
            calendarDay.m3988a(calendar);
            while (calendar.get(7) != i10) {
                calendar.add(7, -1);
            }
            return CalendarDay.m3984d(calendar);
        }

        /* renamed from: c */
        public final int m4088c(CalendarDay calendarDay, CalendarDay calendarDay2) {
            return (int) (TimeUnit.DAYS.convert(((calendarDay2.m3990i().getTime() - calendarDay.m3990i().getTime()) + calendarDay2.m3989h().get(16)) - calendarDay.m3989h().get(16), TimeUnit.MILLISECONDS) / 7);
        }

        @Override // p094f1.InterfaceC8411f
        public int getCount() {
            return this.f4295b;
        }

        @Override // p094f1.InterfaceC8411f
        public CalendarDay getItem(int i10) {
            return CalendarDay.m3985f(new Date(this.f4294a.m3990i().getTime() + TimeUnit.MILLISECONDS.convert(i10 * 7, TimeUnit.DAYS)));
        }
    }

    public WeekPagerAdapter(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: A */
    public /* bridge */ /* synthetic */ void mo4060A(int i10) {
        super.mo4060A(i10);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C8424s mo4065c(int i10) {
        return new C8424s(this.f15929b, mo4067f(i10), this.f15929b.getFirstDayOfWeek(), this.f15946s);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public int mo4071k(C8424s c8424s) {
        return mo4068g().mo4086a(c8424s.getFirstViewDay());
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo4063a() {
        super.mo4063a();
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: b */
    public InterfaceC8411f mo4064b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new C6408a(calendarDay, calendarDay2, this.f15929b.getFirstDayOfWeek());
    }

    @Override // p094f1.AbstractC8408c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        super.destroyItem(viewGroup, i10, obj);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo4066e(CalendarDay calendarDay) {
        return super.mo4066e(calendarDay);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: f */
    public /* bridge */ /* synthetic */ CalendarDay mo4067f(int i10) {
        return super.mo4067f(i10);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: g */
    public /* bridge */ /* synthetic */ InterfaceC8411f mo4068g() {
        return super.mo4068g();
    }

    @Override // p094f1.AbstractC8408c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // p094f1.AbstractC8408c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ int getItemPosition(Object obj) {
        return super.getItemPosition(obj);
    }

    @Override // p094f1.AbstractC8408c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ CharSequence getPageTitle(int i10) {
        return super.getPageTitle(i10);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: h */
    public /* bridge */ /* synthetic */ List mo4069h() {
        return super.mo4069h();
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: i */
    public /* bridge */ /* synthetic */ int mo4070i() {
        return super.mo4070i();
    }

    @Override // p094f1.AbstractC8408c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i10) {
        return super.instantiateItem(viewGroup, i10);
    }

    @Override // p094f1.AbstractC8408c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ boolean isViewFromObject(View view, Object obj) {
        return super.isViewFromObject(view, obj);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo4072l() {
        super.mo4072l();
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: n */
    public boolean mo4073n(Object obj) {
        return obj instanceof C8424s;
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: o */
    public /* bridge */ /* synthetic */ AbstractC8408c mo4074o(AbstractC8408c abstractC8408c) {
        return super.mo4074o(abstractC8408c);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: p */
    public /* bridge */ /* synthetic */ void mo4075p(CalendarDay calendarDay, boolean z10) {
        super.mo4075p(calendarDay, z10);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: q */
    public /* bridge */ /* synthetic */ void mo4076q(int i10) {
        super.mo4076q(i10);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo4077r(InterfaceC8519e interfaceC8519e) {
        super.mo4077r(interfaceC8519e);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: s */
    public /* bridge */ /* synthetic */ void mo4078s(InterfaceC8519e interfaceC8519e) {
        super.mo4078s(interfaceC8519e);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: t */
    public /* bridge */ /* synthetic */ void mo4079t(CalendarDay calendarDay, CalendarDay calendarDay2) {
        super.mo4079t(calendarDay, calendarDay2);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo4080u(int i10) {
        super.mo4080u(i10);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: v */
    public /* bridge */ /* synthetic */ void mo4081v(boolean z10) {
        super.mo4081v(z10);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: w */
    public /* bridge */ /* synthetic */ void mo4082w(int i10) {
        super.mo4082w(i10);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: x */
    public /* bridge */ /* synthetic */ void mo4083x(boolean z10) {
        super.mo4083x(z10);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: y */
    public /* bridge */ /* synthetic */ void mo4084y(InterfaceC8521g interfaceC8521g) {
        super.mo4084y(interfaceC8521g);
    }

    @Override // p094f1.AbstractC8408c
    /* renamed from: z */
    public /* bridge */ /* synthetic */ void mo4085z(InterfaceC8522h interfaceC8522h) {
        super.mo4085z(interfaceC8522h);
    }
}
