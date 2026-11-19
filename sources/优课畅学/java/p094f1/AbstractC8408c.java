package p094f1;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.blankj.utilcode.util.AbstractC5379p;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p106g1.InterfaceC8519e;
import p106g1.InterfaceC8521g;
import p106g1.InterfaceC8522h;

/* renamed from: f1.c */
/* loaded from: classes4.dex */
public abstract class AbstractC8408c extends PagerAdapter {

    /* renamed from: a */
    public final ArrayDeque f15928a;

    /* renamed from: b */
    public final MaterialCalendarView f15929b;

    /* renamed from: c */
    public final CalendarDay f15930c;

    /* renamed from: k */
    public InterfaceC8411f f15938k;

    /* renamed from: n */
    public InterfaceC8519e f15941n;

    /* renamed from: o */
    public InterfaceC8519e f15942o;

    /* renamed from: p */
    public List f15943p;

    /* renamed from: q */
    public List f15944q;

    /* renamed from: r */
    public boolean f15945r;

    /* renamed from: s */
    public boolean f15946s;

    /* renamed from: d */
    public InterfaceC8521g f15931d = null;

    /* renamed from: e */
    public Integer f15932e = null;

    /* renamed from: f */
    public Integer f15933f = null;

    /* renamed from: g */
    public Integer f15934g = null;

    /* renamed from: h */
    public int f15935h = 4;

    /* renamed from: i */
    public CalendarDay f15936i = null;

    /* renamed from: j */
    public CalendarDay f15937j = null;

    /* renamed from: l */
    public List f15939l = new ArrayList();

    /* renamed from: m */
    public InterfaceC8522h f15940m = InterfaceC8522h.f16106a;

    public AbstractC8408c(MaterialCalendarView materialCalendarView) {
        InterfaceC8519e interfaceC8519e = InterfaceC8519e.f16104a;
        this.f15941n = interfaceC8519e;
        this.f15942o = interfaceC8519e;
        this.f15943p = new ArrayList();
        this.f15944q = null;
        this.f15945r = true;
        this.f15929b = materialCalendarView;
        this.f15930c = CalendarDay.m3987q();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f15928a = arrayDeque;
        arrayDeque.iterator();
        mo4079t(null, null);
    }

    /* renamed from: A */
    public void mo4060A(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f15934g = Integer.valueOf(i10);
        Iterator it = this.f15928a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC8409d) it.next()).setWeekDayTextAppearance(i10);
        }
    }

    /* renamed from: B */
    public final void m13701B() {
        CalendarDay calendarDay;
        int i10 = 0;
        while (i10 < this.f15939l.size()) {
            CalendarDay calendarDay2 = (CalendarDay) this.f15939l.get(i10);
            CalendarDay calendarDay3 = this.f15936i;
            if ((calendarDay3 != null && calendarDay3.m3994n(calendarDay2)) || ((calendarDay = this.f15937j) != null && calendarDay.m3995o(calendarDay2))) {
                this.f15939l.remove(i10);
                this.f15929b.m4016D(calendarDay2);
                i10--;
            }
            i10++;
        }
    }

    /* renamed from: a */
    public void mo4063a() {
        this.f15939l.clear();
        m13704m();
    }

    /* renamed from: b */
    public abstract InterfaceC8411f mo4064b(CalendarDay calendarDay, CalendarDay calendarDay2);

    /* renamed from: c */
    public abstract AbstractViewOnClickListenerC8409d mo4065c(int i10);

    /* renamed from: d */
    public int m13702d() {
        Integer num = this.f15933f;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        AbstractViewOnClickListenerC8409d abstractViewOnClickListenerC8409d = (AbstractViewOnClickListenerC8409d) obj;
        this.f15928a.remove(abstractViewOnClickListenerC8409d);
        viewGroup.removeView(abstractViewOnClickListenerC8409d);
    }

    /* renamed from: e */
    public int mo4066e(CalendarDay calendarDay) {
        if (calendarDay == null) {
            return getCount() / 2;
        }
        CalendarDay calendarDay2 = this.f15936i;
        if (calendarDay2 != null && calendarDay.m3995o(calendarDay2)) {
            return 0;
        }
        CalendarDay calendarDay3 = this.f15937j;
        return (calendarDay3 == null || !calendarDay.m3994n(calendarDay3)) ? this.f15938k.mo4086a(calendarDay) : getCount() - 1;
    }

    /* renamed from: f */
    public CalendarDay mo4067f(int i10) {
        return this.f15938k.getItem(i10);
    }

    /* renamed from: g */
    public InterfaceC8411f mo4068g() {
        return this.f15938k;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f15938k.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        int iMo4071k;
        if (!mo4073n(obj)) {
            return -2;
        }
        AbstractViewOnClickListenerC8409d abstractViewOnClickListenerC8409d = (AbstractViewOnClickListenerC8409d) obj;
        if (abstractViewOnClickListenerC8409d.getFirstViewDay() != null && (iMo4071k = mo4071k(abstractViewOnClickListenerC8409d)) >= 0) {
            return iMo4071k;
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        InterfaceC8521g interfaceC8521g = this.f15931d;
        return interfaceC8521g == null ? "" : interfaceC8521g.mo13885a(mo4067f(i10));
    }

    /* renamed from: h */
    public List mo4069h() {
        return Collections.unmodifiableList(this.f15939l);
    }

    /* renamed from: i */
    public int mo4070i() {
        return this.f15935h;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        AbstractViewOnClickListenerC8409d abstractViewOnClickListenerC8409dMo4065c = mo4065c(i10);
        abstractViewOnClickListenerC8409dMo4065c.setContentDescription(this.f15929b.getCalendarContentDescription());
        abstractViewOnClickListenerC8409dMo4065c.setAlpha(0.0f);
        abstractViewOnClickListenerC8409dMo4065c.setSelectionEnabled(this.f15945r);
        abstractViewOnClickListenerC8409dMo4065c.setWeekDayFormatter(this.f15940m);
        abstractViewOnClickListenerC8409dMo4065c.setDayFormatter(this.f15941n);
        abstractViewOnClickListenerC8409dMo4065c.setDayFormatterContentDescription(this.f15942o);
        Integer num = this.f15932e;
        if (num != null) {
            abstractViewOnClickListenerC8409dMo4065c.setSelectionColor(num.intValue());
        }
        Integer num2 = this.f15933f;
        if (num2 != null) {
            abstractViewOnClickListenerC8409dMo4065c.setDateTextAppearance(num2.intValue());
        }
        Integer num3 = this.f15934g;
        if (num3 != null) {
            abstractViewOnClickListenerC8409dMo4065c.setWeekDayTextAppearance(num3.intValue());
        }
        abstractViewOnClickListenerC8409dMo4065c.setShowOtherDates(this.f15935h);
        abstractViewOnClickListenerC8409dMo4065c.setMinimumDate(this.f15936i);
        abstractViewOnClickListenerC8409dMo4065c.setMaximumDate(this.f15937j);
        abstractViewOnClickListenerC8409dMo4065c.setSelectedDates(this.f15939l);
        viewGroup.addView(abstractViewOnClickListenerC8409dMo4065c);
        this.f15928a.add(abstractViewOnClickListenerC8409dMo4065c);
        abstractViewOnClickListenerC8409dMo4065c.setDayViewDecorators(this.f15944q);
        return abstractViewOnClickListenerC8409dMo4065c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: j */
    public int m13703j() {
        Integer num = this.f15934g;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: k */
    public abstract int mo4071k(AbstractViewOnClickListenerC8409d abstractViewOnClickListenerC8409d);

    /* renamed from: l */
    public void mo4072l() {
        this.f15944q = new ArrayList();
        Iterator it = this.f15943p.iterator();
        if (it.hasNext()) {
            AbstractC5379p.m2596a(it.next());
            new C8413h();
            throw null;
        }
        Iterator it2 = this.f15928a.iterator();
        while (it2.hasNext()) {
            ((AbstractViewOnClickListenerC8409d) it2.next()).setDayViewDecorators(this.f15944q);
        }
    }

    /* renamed from: m */
    public final void m13704m() {
        m13701B();
        Iterator it = this.f15928a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC8409d) it.next()).setSelectedDates(this.f15939l);
        }
    }

    /* renamed from: n */
    public abstract boolean mo4073n(Object obj);

    /* renamed from: o */
    public AbstractC8408c mo4074o(AbstractC8408c abstractC8408c) {
        abstractC8408c.f15931d = this.f15931d;
        abstractC8408c.f15932e = this.f15932e;
        abstractC8408c.f15933f = this.f15933f;
        abstractC8408c.f15934g = this.f15934g;
        abstractC8408c.f15935h = this.f15935h;
        abstractC8408c.f15936i = this.f15936i;
        abstractC8408c.f15937j = this.f15937j;
        abstractC8408c.f15939l = this.f15939l;
        abstractC8408c.f15940m = this.f15940m;
        abstractC8408c.f15941n = this.f15941n;
        abstractC8408c.f15942o = this.f15942o;
        abstractC8408c.f15943p = this.f15943p;
        abstractC8408c.f15944q = this.f15944q;
        abstractC8408c.f15945r = this.f15945r;
        return abstractC8408c;
    }

    /* renamed from: p */
    public void mo4075p(CalendarDay calendarDay, boolean z10) {
        if (z10) {
            if (this.f15939l.contains(calendarDay)) {
                return;
            }
            this.f15939l.add(calendarDay);
            m13704m();
            return;
        }
        if (this.f15939l.contains(calendarDay)) {
            this.f15939l.remove(calendarDay);
            m13704m();
        }
    }

    /* renamed from: q */
    public void mo4076q(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f15933f = Integer.valueOf(i10);
        Iterator it = this.f15928a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC8409d) it.next()).setDateTextAppearance(i10);
        }
    }

    /* renamed from: r */
    public void mo4077r(InterfaceC8519e interfaceC8519e) {
        InterfaceC8519e interfaceC8519e2 = this.f15942o;
        if (interfaceC8519e2 == this.f15941n) {
            interfaceC8519e2 = interfaceC8519e;
        }
        this.f15942o = interfaceC8519e2;
        this.f15941n = interfaceC8519e;
        Iterator it = this.f15928a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC8409d) it.next()).setDayFormatter(interfaceC8519e);
        }
    }

    /* renamed from: s */
    public void mo4078s(InterfaceC8519e interfaceC8519e) {
        this.f15942o = interfaceC8519e;
        Iterator it = this.f15928a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC8409d) it.next()).setDayFormatterContentDescription(interfaceC8519e);
        }
    }

    /* renamed from: t */
    public void mo4079t(CalendarDay calendarDay, CalendarDay calendarDay2) {
        this.f15936i = calendarDay;
        this.f15937j = calendarDay2;
        Iterator it = this.f15928a.iterator();
        while (it.hasNext()) {
            AbstractViewOnClickListenerC8409d abstractViewOnClickListenerC8409d = (AbstractViewOnClickListenerC8409d) it.next();
            abstractViewOnClickListenerC8409d.setMinimumDate(calendarDay);
            abstractViewOnClickListenerC8409d.setMaximumDate(calendarDay2);
        }
        if (calendarDay == null) {
            calendarDay = CalendarDay.m3983b(this.f15930c.m3993l() - 200, this.f15930c.m3992k(), this.f15930c.m3991j());
        }
        if (calendarDay2 == null) {
            calendarDay2 = CalendarDay.m3983b(this.f15930c.m3993l() + 200, this.f15930c.m3992k(), this.f15930c.m3991j());
        }
        this.f15938k = mo4064b(calendarDay, calendarDay2);
        notifyDataSetChanged();
        m13704m();
    }

    /* renamed from: u */
    public void mo4080u(int i10) {
        this.f15932e = Integer.valueOf(i10);
        Iterator it = this.f15928a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC8409d) it.next()).setSelectionColor(i10);
        }
    }

    /* renamed from: v */
    public void mo4081v(boolean z10) {
        this.f15945r = z10;
        Iterator it = this.f15928a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC8409d) it.next()).setSelectionEnabled(this.f15945r);
        }
    }

    /* renamed from: w */
    public void mo4082w(int i10) {
        this.f15935h = i10;
        Iterator it = this.f15928a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC8409d) it.next()).setShowOtherDates(i10);
        }
    }

    /* renamed from: x */
    public void mo4083x(boolean z10) {
        this.f15946s = z10;
    }

    /* renamed from: y */
    public void mo4084y(InterfaceC8521g interfaceC8521g) {
        this.f15931d = interfaceC8521g;
    }

    /* renamed from: z */
    public void mo4085z(InterfaceC8522h interfaceC8522h) {
        this.f15940m = interfaceC8522h;
        Iterator it = this.f15928a.iterator();
        while (it.hasNext()) {
            ((AbstractViewOnClickListenerC8409d) it.next()).setWeekDayFormatter(interfaceC8522h);
        }
    }
}
