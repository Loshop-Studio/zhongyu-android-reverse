package com.prolificinteractive.materialcalendarview;

import android.view.View;
import android.view.ViewGroup;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p003a2.AbstractC0016c;
import p003a2.C0032s;
import p003a2.InterfaceC0019f;
import p020b2.InterfaceC5103e;
import p020b2.InterfaceC5105g;
import p020b2.InterfaceC5106h;

/* loaded from: classes4.dex */
public class WeekPagerAdapter extends AbstractC0016c {

    /* renamed from: com.prolificinteractive.materialcalendarview.WeekPagerAdapter$a */
    public static class C6605a implements InterfaceC0019f {

        /* renamed from: a */
        public final CalendarDay f5414a;

        /* renamed from: b */
        public final int f5415b;

        public C6605a(CalendarDay calendarDay, CalendarDay calendarDay2, int i9) {
            CalendarDay calendarDayM4697b = m4697b(calendarDay, i9);
            this.f5414a = calendarDayM4697b;
            this.f5415b = m4698c(calendarDayM4697b, calendarDay2) + 1;
        }

        @Override // p003a2.InterfaceC0019f
        /* renamed from: a */
        public int mo128a(CalendarDay calendarDay) {
            return m4698c(this.f5414a, calendarDay);
        }

        /* renamed from: b */
        public final CalendarDay m4697b(CalendarDay calendarDay, int i9) {
            Calendar calendar = Calendar.getInstance();
            calendarDay.m4623a(calendar);
            while (calendar.get(7) != i9) {
                calendar.add(7, -1);
            }
            return CalendarDay.m4619c(calendar);
        }

        /* renamed from: c */
        public final int m4698c(CalendarDay calendarDay, CalendarDay calendarDay2) {
            return (int) (TimeUnit.DAYS.convert(((calendarDay2.m4625f().getTime() - calendarDay.m4625f().getTime()) + calendarDay2.m4624e().get(16)) - calendarDay.m4624e().get(16), TimeUnit.MILLISECONDS) / 7);
        }

        @Override // p003a2.InterfaceC0019f
        public int getCount() {
            return this.f5415b;
        }

        @Override // p003a2.InterfaceC0019f
        public CalendarDay getItem(int i9) {
            return CalendarDay.m4620d(new Date(this.f5414a.m4625f().getTime() + TimeUnit.MILLISECONDS.convert(i9 * 7, TimeUnit.DAYS)));
        }
    }

    public WeekPagerAdapter(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: A */
    public /* bridge */ /* synthetic */ void mo84A(int i9) {
        super.mo84A(i9);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C0032s mo88c(int i9) {
        return new C0032s(this.f45b, mo91f(i9), this.f45b.getFirstDayOfWeek(), this.f62s);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public int mo96k(C0032s c0032s) {
        return mo92g().mo128a(c0032s.getFirstViewDay());
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo86a() {
        super.mo86a();
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: b */
    public InterfaceC0019f mo87b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new C6605a(calendarDay, calendarDay2, this.f45b.getFirstDayOfWeek());
    }

    @Override // p003a2.AbstractC0016c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ void destroyItem(ViewGroup viewGroup, int i9, Object obj) {
        super.destroyItem(viewGroup, i9, obj);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo90e(CalendarDay calendarDay) {
        return super.mo90e(calendarDay);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: f */
    public /* bridge */ /* synthetic */ CalendarDay mo91f(int i9) {
        return super.mo91f(i9);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: g */
    public /* bridge */ /* synthetic */ InterfaceC0019f mo92g() {
        return super.mo92g();
    }

    @Override // p003a2.AbstractC0016c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // p003a2.AbstractC0016c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ int getItemPosition(Object obj) {
        return super.getItemPosition(obj);
    }

    @Override // p003a2.AbstractC0016c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ CharSequence getPageTitle(int i9) {
        return super.getPageTitle(i9);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: h */
    public /* bridge */ /* synthetic */ List mo93h() {
        return super.mo93h();
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: i */
    public /* bridge */ /* synthetic */ int mo94i() {
        return super.mo94i();
    }

    @Override // p003a2.AbstractC0016c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i9) {
        return super.instantiateItem(viewGroup, i9);
    }

    @Override // p003a2.AbstractC0016c, androidx.viewpager.widget.PagerAdapter
    public /* bridge */ /* synthetic */ boolean isViewFromObject(View view, Object obj) {
        return super.isViewFromObject(view, obj);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo97l() {
        super.mo97l();
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: n */
    public boolean mo99n(Object obj) {
        return obj instanceof C0032s;
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: o */
    public /* bridge */ /* synthetic */ AbstractC0016c mo100o(AbstractC0016c abstractC0016c) {
        return super.mo100o(abstractC0016c);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: p */
    public /* bridge */ /* synthetic */ void mo101p(CalendarDay calendarDay, boolean z9) {
        super.mo101p(calendarDay, z9);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: q */
    public /* bridge */ /* synthetic */ void mo102q(int i9) {
        super.mo102q(i9);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo103r(InterfaceC5103e interfaceC5103e) {
        super.mo103r(interfaceC5103e);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: s */
    public /* bridge */ /* synthetic */ void mo104s(InterfaceC5103e interfaceC5103e) {
        super.mo104s(interfaceC5103e);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: t */
    public /* bridge */ /* synthetic */ void mo105t(CalendarDay calendarDay, CalendarDay calendarDay2) {
        super.mo105t(calendarDay, calendarDay2);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo106u(int i9) {
        super.mo106u(i9);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: v */
    public /* bridge */ /* synthetic */ void mo107v(boolean z9) {
        super.mo107v(z9);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: w */
    public /* bridge */ /* synthetic */ void mo108w(int i9) {
        super.mo108w(i9);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: x */
    public /* bridge */ /* synthetic */ void mo109x(boolean z9) {
        super.mo109x(z9);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: y */
    public /* bridge */ /* synthetic */ void mo110y(InterfaceC5105g interfaceC5105g) {
        super.mo110y(interfaceC5105g);
    }

    @Override // p003a2.AbstractC0016c
    /* renamed from: z */
    public /* bridge */ /* synthetic */ void mo111z(InterfaceC5106h interfaceC5106h) {
        super.mo111z(interfaceC5106h);
    }
}
