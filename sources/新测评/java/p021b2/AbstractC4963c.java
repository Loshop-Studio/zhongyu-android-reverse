package p021b2;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p032c2.InterfaceC5110e;
import p032c2.InterfaceC5112g;
import p032c2.InterfaceC5113h;
import p137k.AbstractC7846r;

/* renamed from: b2.c */
/* loaded from: classes4.dex */
public abstract class AbstractC4963c extends PagerAdapter {

    /* renamed from: a */
    public final ArrayDeque f2394a;

    /* renamed from: b */
    public final MaterialCalendarView f2395b;

    /* renamed from: c */
    public final CalendarDay f2396c;

    /* renamed from: k */
    public InterfaceC4966f f2404k;

    /* renamed from: n */
    public InterfaceC5110e f2407n;

    /* renamed from: o */
    public InterfaceC5110e f2408o;

    /* renamed from: p */
    public List f2409p;

    /* renamed from: q */
    public List f2410q;

    /* renamed from: r */
    public boolean f2411r;

    /* renamed from: s */
    public boolean f2412s;

    /* renamed from: d */
    public InterfaceC5112g f2397d = null;

    /* renamed from: e */
    public Integer f2398e = null;

    /* renamed from: f */
    public Integer f2399f = null;

    /* renamed from: g */
    public Integer f2400g = null;

    /* renamed from: h */
    public int f2401h = 4;

    /* renamed from: i */
    public CalendarDay f2402i = null;

    /* renamed from: j */
    public CalendarDay f2403j = null;

    /* renamed from: l */
    public List f2405l = new ArrayList();

    /* renamed from: m */
    public InterfaceC5113h f2406m = InterfaceC5113h.f2672a;

    public AbstractC4963c(MaterialCalendarView materialCalendarView) {
        InterfaceC5110e interfaceC5110e = InterfaceC5110e.f2670a;
        this.f2407n = interfaceC5110e;
        this.f2408o = interfaceC5110e;
        this.f2409p = new ArrayList();
        this.f2410q = null;
        this.f2411r = true;
        this.f2395b = materialCalendarView;
        this.f2396c = CalendarDay.m4417q();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f2394a = arrayDeque;
        arrayDeque.iterator();
        mo2394t(null, null);
    }

    /* renamed from: A */
    public void mo2373A(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f2400g = Integer.valueOf(i10);
        Iterator it = this.f2394a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC4964d) it.next()).setWeekDayTextAppearance(i10);
        }
    }

    /* renamed from: B */
    public final void m2374B() {
        CalendarDay calendarDay;
        int i10 = 0;
        while (i10 < this.f2405l.size()) {
            CalendarDay calendarDay2 = (CalendarDay) this.f2405l.get(i10);
            CalendarDay calendarDay3 = this.f2402i;
            if ((calendarDay3 != null && calendarDay3.m4424n(calendarDay2)) || ((calendarDay = this.f2403j) != null && calendarDay.m4425o(calendarDay2))) {
                this.f2405l.remove(i10);
                this.f2395b.m4446D(calendarDay2);
                i10--;
            }
            i10++;
        }
    }

    /* renamed from: a */
    public void mo2375a() {
        this.f2405l.clear();
        m2387m();
    }

    /* renamed from: b */
    public abstract InterfaceC4966f mo2376b(CalendarDay calendarDay, CalendarDay calendarDay2);

    /* renamed from: c */
    public abstract AbstractViewOnClickListenerC4964d mo2377c(int i10);

    /* renamed from: d */
    public int m2378d() {
        Integer num = this.f2399f;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        AbstractViewOnClickListenerC4964d abstractViewOnClickListenerC4964d = (AbstractViewOnClickListenerC4964d) obj;
        this.f2394a.remove(abstractViewOnClickListenerC4964d);
        viewGroup.removeView(abstractViewOnClickListenerC4964d);
    }

    /* renamed from: e */
    public int mo2379e(CalendarDay calendarDay) {
        if (calendarDay == null) {
            return getCount() / 2;
        }
        CalendarDay calendarDay2 = this.f2402i;
        if (calendarDay2 != null && calendarDay.m4425o(calendarDay2)) {
            return 0;
        }
        CalendarDay calendarDay3 = this.f2403j;
        return (calendarDay3 == null || !calendarDay.m4424n(calendarDay3)) ? this.f2404k.mo2417a(calendarDay) : getCount() - 1;
    }

    /* renamed from: f */
    public CalendarDay mo2380f(int i10) {
        return this.f2404k.getItem(i10);
    }

    /* renamed from: g */
    public InterfaceC4966f mo2381g() {
        return this.f2404k;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f2404k.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        int iMo2385k;
        if (!mo2388n(obj)) {
            return -2;
        }
        AbstractViewOnClickListenerC4964d abstractViewOnClickListenerC4964d = (AbstractViewOnClickListenerC4964d) obj;
        if (abstractViewOnClickListenerC4964d.getFirstViewDay() != null && (iMo2385k = mo2385k(abstractViewOnClickListenerC4964d)) >= 0) {
            return iMo2385k;
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        InterfaceC5112g interfaceC5112g = this.f2397d;
        return interfaceC5112g == null ? "" : interfaceC5112g.mo2727a(mo2380f(i10));
    }

    /* renamed from: h */
    public List mo2382h() {
        return Collections.unmodifiableList(this.f2405l);
    }

    /* renamed from: i */
    public int mo2383i() {
        return this.f2401h;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        AbstractViewOnClickListenerC4964d abstractViewOnClickListenerC4964dMo2377c = mo2377c(i10);
        abstractViewOnClickListenerC4964dMo2377c.setContentDescription(this.f2395b.getCalendarContentDescription());
        abstractViewOnClickListenerC4964dMo2377c.setAlpha(0.0f);
        abstractViewOnClickListenerC4964dMo2377c.setSelectionEnabled(this.f2411r);
        abstractViewOnClickListenerC4964dMo2377c.setWeekDayFormatter(this.f2406m);
        abstractViewOnClickListenerC4964dMo2377c.setDayFormatter(this.f2407n);
        abstractViewOnClickListenerC4964dMo2377c.setDayFormatterContentDescription(this.f2408o);
        Integer num = this.f2398e;
        if (num != null) {
            abstractViewOnClickListenerC4964dMo2377c.setSelectionColor(num.intValue());
        }
        Integer num2 = this.f2399f;
        if (num2 != null) {
            abstractViewOnClickListenerC4964dMo2377c.setDateTextAppearance(num2.intValue());
        }
        Integer num3 = this.f2400g;
        if (num3 != null) {
            abstractViewOnClickListenerC4964dMo2377c.setWeekDayTextAppearance(num3.intValue());
        }
        abstractViewOnClickListenerC4964dMo2377c.setShowOtherDates(this.f2401h);
        abstractViewOnClickListenerC4964dMo2377c.setMinimumDate(this.f2402i);
        abstractViewOnClickListenerC4964dMo2377c.setMaximumDate(this.f2403j);
        abstractViewOnClickListenerC4964dMo2377c.setSelectedDates(this.f2405l);
        viewGroup.addView(abstractViewOnClickListenerC4964dMo2377c);
        this.f2394a.add(abstractViewOnClickListenerC4964dMo2377c);
        abstractViewOnClickListenerC4964dMo2377c.setDayViewDecorators(this.f2410q);
        return abstractViewOnClickListenerC4964dMo2377c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: j */
    public int m2384j() {
        Integer num = this.f2400g;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: k */
    public abstract int mo2385k(AbstractViewOnClickListenerC4964d abstractViewOnClickListenerC4964d);

    /* renamed from: l */
    public void mo2386l() {
        this.f2410q = new ArrayList();
        Iterator it = this.f2409p.iterator();
        if (it.hasNext()) {
            AbstractC7846r.m13306a(it.next());
            new C4968h();
            throw null;
        }
        Iterator it2 = this.f2394a.iterator();
        while (it2.hasNext()) {
            ((AbstractViewOnClickListenerC4964d) it2.next()).setDayViewDecorators(this.f2410q);
        }
    }

    /* renamed from: m */
    public final void m2387m() {
        m2374B();
        Iterator it = this.f2394a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC4964d) it.next()).setSelectedDates(this.f2405l);
        }
    }

    /* renamed from: n */
    public abstract boolean mo2388n(Object obj);

    /* renamed from: o */
    public AbstractC4963c mo2389o(AbstractC4963c abstractC4963c) {
        abstractC4963c.f2397d = this.f2397d;
        abstractC4963c.f2398e = this.f2398e;
        abstractC4963c.f2399f = this.f2399f;
        abstractC4963c.f2400g = this.f2400g;
        abstractC4963c.f2401h = this.f2401h;
        abstractC4963c.f2402i = this.f2402i;
        abstractC4963c.f2403j = this.f2403j;
        abstractC4963c.f2405l = this.f2405l;
        abstractC4963c.f2406m = this.f2406m;
        abstractC4963c.f2407n = this.f2407n;
        abstractC4963c.f2408o = this.f2408o;
        abstractC4963c.f2409p = this.f2409p;
        abstractC4963c.f2410q = this.f2410q;
        abstractC4963c.f2411r = this.f2411r;
        return abstractC4963c;
    }

    /* renamed from: p */
    public void mo2390p(CalendarDay calendarDay, boolean z9) {
        if (z9) {
            if (this.f2405l.contains(calendarDay)) {
                return;
            }
            this.f2405l.add(calendarDay);
            m2387m();
            return;
        }
        if (this.f2405l.contains(calendarDay)) {
            this.f2405l.remove(calendarDay);
            m2387m();
        }
    }

    /* renamed from: q */
    public void mo2391q(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f2399f = Integer.valueOf(i10);
        Iterator it = this.f2394a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC4964d) it.next()).setDateTextAppearance(i10);
        }
    }

    /* renamed from: r */
    public void mo2392r(InterfaceC5110e interfaceC5110e) {
        InterfaceC5110e interfaceC5110e2 = this.f2408o;
        if (interfaceC5110e2 == this.f2407n) {
            interfaceC5110e2 = interfaceC5110e;
        }
        this.f2408o = interfaceC5110e2;
        this.f2407n = interfaceC5110e;
        Iterator it = this.f2394a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC4964d) it.next()).setDayFormatter(interfaceC5110e);
        }
    }

    /* renamed from: s */
    public void mo2393s(InterfaceC5110e interfaceC5110e) {
        this.f2408o = interfaceC5110e;
        Iterator it = this.f2394a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC4964d) it.next()).setDayFormatterContentDescription(interfaceC5110e);
        }
    }

    /* renamed from: t */
    public void mo2394t(CalendarDay calendarDay, CalendarDay calendarDay2) {
        this.f2402i = calendarDay;
        this.f2403j = calendarDay2;
        Iterator it = this.f2394a.iterator();
        while (it.hasNext()) {
            AbstractViewOnClickListenerC4964d abstractViewOnClickListenerC4964d = (AbstractViewOnClickListenerC4964d) it.next();
            abstractViewOnClickListenerC4964d.setMinimumDate(calendarDay);
            abstractViewOnClickListenerC4964d.setMaximumDate(calendarDay2);
        }
        if (calendarDay == null) {
            calendarDay = CalendarDay.m4413b(this.f2396c.m4423j() - 200, this.f2396c.m4422i(), this.f2396c.m4421h());
        }
        if (calendarDay2 == null) {
            calendarDay2 = CalendarDay.m4413b(this.f2396c.m4423j() + 200, this.f2396c.m4422i(), this.f2396c.m4421h());
        }
        this.f2404k = mo2376b(calendarDay, calendarDay2);
        notifyDataSetChanged();
        m2387m();
    }

    /* renamed from: u */
    public void mo2395u(int i10) {
        this.f2398e = Integer.valueOf(i10);
        Iterator it = this.f2394a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC4964d) it.next()).setSelectionColor(i10);
        }
    }

    /* renamed from: v */
    public void mo2396v(boolean z9) {
        this.f2411r = z9;
        Iterator it = this.f2394a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC4964d) it.next()).setSelectionEnabled(this.f2411r);
        }
    }

    /* renamed from: w */
    public void mo2397w(int i10) {
        this.f2401h = i10;
        Iterator it = this.f2394a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC4964d) it.next()).setShowOtherDates(i10);
        }
    }

    /* renamed from: x */
    public void mo2398x(boolean z9) {
        this.f2412s = z9;
    }

    /* renamed from: y */
    public void mo2399y(InterfaceC5112g interfaceC5112g) {
        this.f2397d = interfaceC5112g;
    }

    /* renamed from: z */
    public void mo2400z(InterfaceC5113h interfaceC5113h) {
        this.f2406m = interfaceC5113h;
        Iterator it = this.f2394a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC4964d) it.next()).setWeekDayFormatter(interfaceC5113h);
        }
    }
}
