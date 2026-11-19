package p021b2;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p032c2.InterfaceC5110e;
import p032c2.InterfaceC5113h;

/* renamed from: b2.d */
/* loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC4964d extends ViewGroup implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: k */
    public static final Calendar f2413k = AbstractC4965e.m2413d();

    /* renamed from: a */
    public final ArrayList f2414a;

    /* renamed from: b */
    public final ArrayList f2415b;

    /* renamed from: c */
    public int f2416c;

    /* renamed from: d */
    public MaterialCalendarView f2417d;

    /* renamed from: e */
    public CalendarDay f2418e;

    /* renamed from: f */
    public CalendarDay f2419f;

    /* renamed from: g */
    public CalendarDay f2420g;

    /* renamed from: h */
    public int f2421h;

    /* renamed from: i */
    public boolean f2422i;

    /* renamed from: j */
    public final Collection f2423j;

    /* renamed from: b2.d$a */
    public static class a extends ViewGroup.MarginLayoutParams {
        public a() {
            super(-2, -2);
        }
    }

    public AbstractViewOnClickListenerC4964d(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i10, boolean z9) {
        super(materialCalendarView.getContext());
        this.f2414a = new ArrayList();
        this.f2415b = new ArrayList();
        this.f2416c = 4;
        this.f2419f = null;
        this.f2420g = null;
        ArrayList arrayList = new ArrayList();
        this.f2423j = arrayList;
        this.f2417d = materialCalendarView;
        this.f2418e = calendarDay;
        this.f2421h = i10;
        this.f2422i = z9;
        setClipChildren(false);
        setClipToPadding(false);
        if (z9) {
            m2403c(m2408h());
        }
        mo2402b(arrayList, m2408h());
    }

    /* renamed from: a */
    public void m2401a(Collection collection, Calendar calendar) {
        C4967g c4967g = new C4967g(getContext(), CalendarDay.m4414c(calendar));
        c4967g.setOnClickListener(this);
        c4967g.setOnLongClickListener(this);
        collection.add(c4967g);
        addView(c4967g, new a());
        calendar.add(5, 1);
    }

    /* renamed from: b */
    public abstract void mo2402b(Collection collection, Calendar calendar);

    /* renamed from: c */
    public final void m2403c(Calendar calendar) {
        for (int i10 = 0; i10 < 7; i10++) {
            C4978r c4978r = new C4978r(getContext(), AbstractC4965e.m2412c(calendar));
            c4978r.setImportantForAccessibility(2);
            this.f2414a.add(c4978r);
            addView(c4978r);
            calendar.add(5, 1);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a();
    }

    /* renamed from: f */
    public void m2406f() {
        C4968h c4968h = new C4968h();
        for (C4967g c4967g : this.f2423j) {
            c4968h.m2439e();
            Iterator it = this.f2415b.iterator();
            if (it.hasNext()) {
                ((AbstractC4969i) it.next()).getClass();
                c4967g.m2424g();
                throw null;
            }
            c4967g.m2421a(c4968h);
        }
    }

    /* renamed from: g */
    public abstract boolean mo2407g(CalendarDay calendarDay);

    public int getFirstDayOfWeek() {
        return this.f2421h;
    }

    public CalendarDay getFirstViewDay() {
        return this.f2418e;
    }

    public abstract int getRows();

    /* renamed from: h */
    public Calendar m2408h() {
        CalendarDay firstViewDay = getFirstViewDay();
        Calendar calendar = f2413k;
        firstViewDay.m4418a(calendar);
        calendar.setFirstDayOfWeek(getFirstDayOfWeek());
        int firstDayOfWeek = getFirstDayOfWeek() - AbstractC4965e.m2412c(calendar);
        if (!MaterialCalendarView.m4430J(this.f2416c) ? firstDayOfWeek > 0 : firstDayOfWeek >= 0) {
            firstDayOfWeek -= 7;
        }
        calendar.add(5, firstDayOfWeek);
        return calendar;
    }

    /* renamed from: i */
    public void m2409i() {
        for (C4967g c4967g : this.f2423j) {
            CalendarDay calendarDayM2424g = c4967g.m2424g();
            c4967g.m2434q(this.f2416c, calendarDayM2424g.m4426p(this.f2419f, this.f2420g), mo2407g(calendarDayM2424g));
        }
        postInvalidate();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof C4967g) {
            this.f2417d.m4443A((C4967g) view);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbstractViewOnClickListenerC4964d.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbstractViewOnClickListenerC4964d.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            int measuredWidth = childAt.getMeasuredWidth() + i14;
            int measuredHeight = childAt.getMeasuredHeight() + i15;
            childAt.layout(i14, i15, measuredWidth, measuredHeight);
            if (i16 % 7 == 6) {
                i14 = 0;
                i15 = measuredHeight;
            } else {
                i14 = measuredWidth;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (!(view instanceof C4967g)) {
            return false;
        }
        this.f2417d.m4445C((C4967g) view);
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (View.MeasureSpec.getMode(i11) == 0 || mode == 0) {
            throw new IllegalStateException("CalendarPagerView should never be left to decide it's size");
        }
        int i12 = size / 7;
        int rows = size2 / getRows();
        setMeasuredDimension(size, size2);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(rows, 1073741824));
        }
    }

    public void setDateTextAppearance(int i10) {
        Iterator it = this.f2423j.iterator();
        while (it.hasNext()) {
            ((C4967g) it.next()).setTextAppearance(getContext(), i10);
        }
    }

    public void setDayFormatter(InterfaceC5110e interfaceC5110e) {
        Iterator it = this.f2423j.iterator();
        while (it.hasNext()) {
            ((C4967g) it.next()).m2429l(interfaceC5110e);
        }
    }

    public void setDayFormatterContentDescription(InterfaceC5110e interfaceC5110e) {
        Iterator it = this.f2423j.iterator();
        while (it.hasNext()) {
            ((C4967g) it.next()).m2430m(interfaceC5110e);
        }
    }

    public void setDayViewDecorators(List<AbstractC4969i> list) {
        this.f2415b.clear();
        if (list != null) {
            this.f2415b.addAll(list);
        }
        m2406f();
    }

    public void setMaximumDate(CalendarDay calendarDay) {
        this.f2420g = calendarDay;
        m2409i();
    }

    public void setMinimumDate(CalendarDay calendarDay) {
        this.f2419f = calendarDay;
        m2409i();
    }

    public void setSelectedDates(Collection collection) {
        for (C4967g c4967g : this.f2423j) {
            c4967g.setChecked(collection != null && collection.contains(c4967g.m2424g()));
        }
        postInvalidate();
    }

    public void setSelectionColor(int i10) {
        Iterator it = this.f2423j.iterator();
        while (it.hasNext()) {
            ((C4967g) it.next()).m2432o(i10);
        }
    }

    public void setSelectionEnabled(boolean z9) {
        for (C4967g c4967g : this.f2423j) {
            c4967g.setOnClickListener(z9 ? this : null);
            c4967g.setClickable(z9);
        }
    }

    public void setShowOtherDates(int i10) {
        this.f2416c = i10;
        m2409i();
    }

    public void setWeekDayFormatter(InterfaceC5113h interfaceC5113h) {
        ArrayList arrayList = this.f2414a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((C4978r) obj).m2459c(interfaceC5113h);
        }
    }

    public void setWeekDayTextAppearance(int i10) {
        ArrayList arrayList = this.f2414a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((C4978r) obj).setTextAppearance(getContext(), i10);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a();
    }
}
