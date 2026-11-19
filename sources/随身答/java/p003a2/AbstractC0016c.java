package p003a2;

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
import p020b2.InterfaceC5103e;
import p020b2.InterfaceC5105g;
import p020b2.InterfaceC5106h;
import p217q.AbstractC9343a;

/* renamed from: a2.c */
/* loaded from: classes4.dex */
public abstract class AbstractC0016c extends PagerAdapter {

    /* renamed from: a */
    public final ArrayDeque f44a;

    /* renamed from: b */
    public final MaterialCalendarView f45b;

    /* renamed from: c */
    public final CalendarDay f46c;

    /* renamed from: k */
    public InterfaceC0019f f54k;

    /* renamed from: n */
    public InterfaceC5103e f57n;

    /* renamed from: o */
    public InterfaceC5103e f58o;

    /* renamed from: p */
    public List f59p;

    /* renamed from: q */
    public List f60q;

    /* renamed from: r */
    public boolean f61r;

    /* renamed from: s */
    public boolean f62s;

    /* renamed from: d */
    public InterfaceC5105g f47d = null;

    /* renamed from: e */
    public Integer f48e = null;

    /* renamed from: f */
    public Integer f49f = null;

    /* renamed from: g */
    public Integer f50g = null;

    /* renamed from: h */
    public int f51h = 4;

    /* renamed from: i */
    public CalendarDay f52i = null;

    /* renamed from: j */
    public CalendarDay f53j = null;

    /* renamed from: l */
    public List f55l = new ArrayList();

    /* renamed from: m */
    public InterfaceC5106h f56m = InterfaceC5106h.f2213a;

    public AbstractC0016c(MaterialCalendarView materialCalendarView) {
        InterfaceC5103e interfaceC5103e = InterfaceC5103e.f2211a;
        this.f57n = interfaceC5103e;
        this.f58o = interfaceC5103e;
        this.f59p = new ArrayList();
        this.f60q = null;
        this.f61r = true;
        this.f45b = materialCalendarView;
        this.f46c = CalendarDay.m4622p();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f44a = arrayDeque;
        arrayDeque.iterator();
        mo105t(null, null);
    }

    /* renamed from: A */
    public void mo84A(int i9) {
        if (i9 == 0) {
            return;
        }
        this.f50g = Integer.valueOf(i9);
        Iterator it = this.f44a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC0017d) it.next()).setWeekDayTextAppearance(i9);
        }
    }

    /* renamed from: B */
    public final void m85B() {
        CalendarDay calendarDay;
        int i9 = 0;
        while (i9 < this.f55l.size()) {
            CalendarDay calendarDay2 = (CalendarDay) this.f55l.get(i9);
            CalendarDay calendarDay3 = this.f52i;
            if ((calendarDay3 != null && calendarDay3.m4629l(calendarDay2)) || ((calendarDay = this.f53j) != null && calendarDay.m4630m(calendarDay2))) {
                this.f55l.remove(i9);
                this.f45b.m4651D(calendarDay2);
                i9--;
            }
            i9++;
        }
    }

    /* renamed from: a */
    public void mo86a() {
        this.f55l.clear();
        m98m();
    }

    /* renamed from: b */
    public abstract InterfaceC0019f mo87b(CalendarDay calendarDay, CalendarDay calendarDay2);

    /* renamed from: c */
    public abstract AbstractViewOnClickListenerC0017d mo88c(int i9);

    /* renamed from: d */
    public int m89d() {
        Integer num = this.f49f;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i9, Object obj) {
        AbstractViewOnClickListenerC0017d abstractViewOnClickListenerC0017d = (AbstractViewOnClickListenerC0017d) obj;
        this.f44a.remove(abstractViewOnClickListenerC0017d);
        viewGroup.removeView(abstractViewOnClickListenerC0017d);
    }

    /* renamed from: e */
    public int mo90e(CalendarDay calendarDay) {
        if (calendarDay == null) {
            return getCount() / 2;
        }
        CalendarDay calendarDay2 = this.f52i;
        if (calendarDay2 != null && calendarDay.m4630m(calendarDay2)) {
            return 0;
        }
        CalendarDay calendarDay3 = this.f53j;
        return (calendarDay3 == null || !calendarDay.m4629l(calendarDay3)) ? this.f54k.mo128a(calendarDay) : getCount() - 1;
    }

    /* renamed from: f */
    public CalendarDay mo91f(int i9) {
        return this.f54k.getItem(i9);
    }

    /* renamed from: g */
    public InterfaceC0019f mo92g() {
        return this.f54k;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f54k.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        int iMo96k;
        if (!mo99n(obj)) {
            return -2;
        }
        AbstractViewOnClickListenerC0017d abstractViewOnClickListenerC0017d = (AbstractViewOnClickListenerC0017d) obj;
        if (abstractViewOnClickListenerC0017d.getFirstViewDay() != null && (iMo96k = mo96k(abstractViewOnClickListenerC0017d)) >= 0) {
            return iMo96k;
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i9) {
        InterfaceC5105g interfaceC5105g = this.f47d;
        return interfaceC5105g == null ? "" : interfaceC5105g.mo2164a(mo91f(i9));
    }

    /* renamed from: h */
    public List mo93h() {
        return Collections.unmodifiableList(this.f55l);
    }

    /* renamed from: i */
    public int mo94i() {
        return this.f51h;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i9) {
        AbstractViewOnClickListenerC0017d abstractViewOnClickListenerC0017dMo88c = mo88c(i9);
        abstractViewOnClickListenerC0017dMo88c.setContentDescription(this.f45b.getCalendarContentDescription());
        abstractViewOnClickListenerC0017dMo88c.setAlpha(0.0f);
        abstractViewOnClickListenerC0017dMo88c.setSelectionEnabled(this.f61r);
        abstractViewOnClickListenerC0017dMo88c.setWeekDayFormatter(this.f56m);
        abstractViewOnClickListenerC0017dMo88c.setDayFormatter(this.f57n);
        abstractViewOnClickListenerC0017dMo88c.setDayFormatterContentDescription(this.f58o);
        Integer num = this.f48e;
        if (num != null) {
            abstractViewOnClickListenerC0017dMo88c.setSelectionColor(num.intValue());
        }
        Integer num2 = this.f49f;
        if (num2 != null) {
            abstractViewOnClickListenerC0017dMo88c.setDateTextAppearance(num2.intValue());
        }
        Integer num3 = this.f50g;
        if (num3 != null) {
            abstractViewOnClickListenerC0017dMo88c.setWeekDayTextAppearance(num3.intValue());
        }
        abstractViewOnClickListenerC0017dMo88c.setShowOtherDates(this.f51h);
        abstractViewOnClickListenerC0017dMo88c.setMinimumDate(this.f52i);
        abstractViewOnClickListenerC0017dMo88c.setMaximumDate(this.f53j);
        abstractViewOnClickListenerC0017dMo88c.setSelectedDates(this.f55l);
        viewGroup.addView(abstractViewOnClickListenerC0017dMo88c);
        this.f44a.add(abstractViewOnClickListenerC0017dMo88c);
        abstractViewOnClickListenerC0017dMo88c.setDayViewDecorators(this.f60q);
        return abstractViewOnClickListenerC0017dMo88c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: j */
    public int m95j() {
        Integer num = this.f50g;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: k */
    public abstract int mo96k(AbstractViewOnClickListenerC0017d abstractViewOnClickListenerC0017d);

    /* renamed from: l */
    public void mo97l() {
        this.f60q = new ArrayList();
        Iterator it = this.f59p.iterator();
        if (it.hasNext()) {
            AbstractC9343a.m15285a(it.next());
            new C0021h();
            throw null;
        }
        Iterator it2 = this.f44a.iterator();
        while (it2.hasNext()) {
            ((AbstractViewOnClickListenerC0017d) it2.next()).setDayViewDecorators(this.f60q);
        }
    }

    /* renamed from: m */
    public final void m98m() {
        m85B();
        Iterator it = this.f44a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC0017d) it.next()).setSelectedDates(this.f55l);
        }
    }

    /* renamed from: n */
    public abstract boolean mo99n(Object obj);

    /* renamed from: o */
    public AbstractC0016c mo100o(AbstractC0016c abstractC0016c) {
        abstractC0016c.f47d = this.f47d;
        abstractC0016c.f48e = this.f48e;
        abstractC0016c.f49f = this.f49f;
        abstractC0016c.f50g = this.f50g;
        abstractC0016c.f51h = this.f51h;
        abstractC0016c.f52i = this.f52i;
        abstractC0016c.f53j = this.f53j;
        abstractC0016c.f55l = this.f55l;
        abstractC0016c.f56m = this.f56m;
        abstractC0016c.f57n = this.f57n;
        abstractC0016c.f58o = this.f58o;
        abstractC0016c.f59p = this.f59p;
        abstractC0016c.f60q = this.f60q;
        abstractC0016c.f61r = this.f61r;
        return abstractC0016c;
    }

    /* renamed from: p */
    public void mo101p(CalendarDay calendarDay, boolean z9) {
        if (z9) {
            if (this.f55l.contains(calendarDay)) {
                return;
            }
            this.f55l.add(calendarDay);
            m98m();
            return;
        }
        if (this.f55l.contains(calendarDay)) {
            this.f55l.remove(calendarDay);
            m98m();
        }
    }

    /* renamed from: q */
    public void mo102q(int i9) {
        if (i9 == 0) {
            return;
        }
        this.f49f = Integer.valueOf(i9);
        Iterator it = this.f44a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC0017d) it.next()).setDateTextAppearance(i9);
        }
    }

    /* renamed from: r */
    public void mo103r(InterfaceC5103e interfaceC5103e) {
        InterfaceC5103e interfaceC5103e2 = this.f58o;
        if (interfaceC5103e2 == this.f57n) {
            interfaceC5103e2 = interfaceC5103e;
        }
        this.f58o = interfaceC5103e2;
        this.f57n = interfaceC5103e;
        Iterator it = this.f44a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC0017d) it.next()).setDayFormatter(interfaceC5103e);
        }
    }

    /* renamed from: s */
    public void mo104s(InterfaceC5103e interfaceC5103e) {
        this.f58o = interfaceC5103e;
        Iterator it = this.f44a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC0017d) it.next()).setDayFormatterContentDescription(interfaceC5103e);
        }
    }

    /* renamed from: t */
    public void mo105t(CalendarDay calendarDay, CalendarDay calendarDay2) {
        this.f52i = calendarDay;
        this.f53j = calendarDay2;
        Iterator it = this.f44a.iterator();
        while (it.hasNext()) {
            AbstractViewOnClickListenerC0017d abstractViewOnClickListenerC0017d = (AbstractViewOnClickListenerC0017d) it.next();
            abstractViewOnClickListenerC0017d.setMinimumDate(calendarDay);
            abstractViewOnClickListenerC0017d.setMaximumDate(calendarDay2);
        }
        if (calendarDay == null) {
            calendarDay = CalendarDay.m4618b(this.f46c.m4628j() - 200, this.f46c.m4627i(), this.f46c.m4626h());
        }
        if (calendarDay2 == null) {
            calendarDay2 = CalendarDay.m4618b(this.f46c.m4628j() + 200, this.f46c.m4627i(), this.f46c.m4626h());
        }
        this.f54k = mo87b(calendarDay, calendarDay2);
        notifyDataSetChanged();
        m98m();
    }

    /* renamed from: u */
    public void mo106u(int i9) {
        this.f48e = Integer.valueOf(i9);
        Iterator it = this.f44a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC0017d) it.next()).setSelectionColor(i9);
        }
    }

    /* renamed from: v */
    public void mo107v(boolean z9) {
        this.f61r = z9;
        Iterator it = this.f44a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC0017d) it.next()).setSelectionEnabled(this.f61r);
        }
    }

    /* renamed from: w */
    public void mo108w(int i9) {
        this.f51h = i9;
        Iterator it = this.f44a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC0017d) it.next()).setShowOtherDates(i9);
        }
    }

    /* renamed from: x */
    public void mo109x(boolean z9) {
        this.f62s = z9;
    }

    /* renamed from: y */
    public void mo110y(InterfaceC5105g interfaceC5105g) {
        this.f47d = interfaceC5105g;
    }

    /* renamed from: z */
    public void mo111z(InterfaceC5106h interfaceC5106h) {
        this.f56m = interfaceC5106h;
        Iterator it = this.f44a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC0017d) it.next()).setWeekDayFormatter(interfaceC5106h);
        }
    }
}
