package p003a2;

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
import p020b2.InterfaceC5103e;
import p020b2.InterfaceC5106h;

/* renamed from: a2.d */
/* loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC0017d extends ViewGroup implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: k */
    public static final Calendar f63k = AbstractC0018e.m124d();

    /* renamed from: a */
    public final ArrayList f64a;

    /* renamed from: b */
    public final ArrayList f65b;

    /* renamed from: c */
    public int f66c;

    /* renamed from: d */
    public MaterialCalendarView f67d;

    /* renamed from: e */
    public CalendarDay f68e;

    /* renamed from: f */
    public CalendarDay f69f;

    /* renamed from: g */
    public CalendarDay f70g;

    /* renamed from: h */
    public int f71h;

    /* renamed from: i */
    public boolean f72i;

    /* renamed from: j */
    public final Collection f73j;

    /* renamed from: a2.d$a */
    public static class a extends ViewGroup.MarginLayoutParams {
        public a() {
            super(-2, -2);
        }
    }

    public AbstractViewOnClickListenerC0017d(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i9, boolean z9) {
        super(materialCalendarView.getContext());
        this.f64a = new ArrayList();
        this.f65b = new ArrayList();
        this.f66c = 4;
        this.f69f = null;
        this.f70g = null;
        ArrayList arrayList = new ArrayList();
        this.f73j = arrayList;
        this.f67d = materialCalendarView;
        this.f68e = calendarDay;
        this.f71h = i9;
        this.f72i = z9;
        setClipChildren(false);
        setClipToPadding(false);
        if (z9) {
            m114c(m119h());
        }
        mo113b(arrayList, m119h());
    }

    /* renamed from: a */
    public void m112a(Collection collection, Calendar calendar) {
        C0020g c0020g = new C0020g(getContext(), CalendarDay.m4619c(calendar));
        c0020g.setOnClickListener(this);
        c0020g.setOnLongClickListener(this);
        collection.add(c0020g);
        addView(c0020g, new a());
        calendar.add(5, 1);
    }

    /* renamed from: b */
    public abstract void mo113b(Collection collection, Calendar calendar);

    /* renamed from: c */
    public final void m114c(Calendar calendar) {
        for (int i9 = 0; i9 < 7; i9++) {
            C0031r c0031r = new C0031r(getContext(), AbstractC0018e.m123c(calendar));
            c0031r.setImportantForAccessibility(2);
            this.f64a.add(c0031r);
            addView(c0031r);
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
    public void m117f() {
        C0021h c0021h = new C0021h();
        for (C0020g c0020g : this.f73j) {
            c0021h.m150e();
            Iterator it = this.f65b.iterator();
            if (it.hasNext()) {
                ((AbstractC0022i) it.next()).getClass();
                c0020g.m135g();
                throw null;
            }
            c0020g.m132a(c0021h);
        }
    }

    /* renamed from: g */
    public abstract boolean mo118g(CalendarDay calendarDay);

    public int getFirstDayOfWeek() {
        return this.f71h;
    }

    public CalendarDay getFirstViewDay() {
        return this.f68e;
    }

    public abstract int getRows();

    /* renamed from: h */
    public Calendar m119h() {
        CalendarDay firstViewDay = getFirstViewDay();
        Calendar calendar = f63k;
        firstViewDay.m4623a(calendar);
        calendar.setFirstDayOfWeek(getFirstDayOfWeek());
        int firstDayOfWeek = getFirstDayOfWeek() - AbstractC0018e.m123c(calendar);
        if (!MaterialCalendarView.m4635J(this.f66c) ? firstDayOfWeek > 0 : firstDayOfWeek >= 0) {
            firstDayOfWeek -= 7;
        }
        calendar.add(5, firstDayOfWeek);
        return calendar;
    }

    /* renamed from: i */
    public void m120i() {
        for (C0020g c0020g : this.f73j) {
            CalendarDay calendarDayM135g = c0020g.m135g();
            c0020g.m145q(this.f66c, calendarDayM135g.m4631o(this.f69f, this.f70g), mo118g(calendarDayM135g));
        }
        postInvalidate();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof C0020g) {
            this.f67d.m4648A((C0020g) view);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbstractViewOnClickListenerC0017d.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbstractViewOnClickListenerC0017d.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            int measuredWidth = childAt.getMeasuredWidth() + i13;
            int measuredHeight = childAt.getMeasuredHeight() + i14;
            childAt.layout(i13, i14, measuredWidth, measuredHeight);
            if (i15 % 7 == 6) {
                i13 = 0;
                i14 = measuredHeight;
            } else {
                i13 = measuredWidth;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (!(view instanceof C0020g)) {
            return false;
        }
        this.f67d.m4650C((C0020g) view);
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == 0 || mode == 0) {
            throw new IllegalStateException("CalendarPagerView should never be left to decide it's size");
        }
        int i11 = size / 7;
        int rows = size2 / getRows();
        setMeasuredDimension(size, size2);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(rows, 1073741824));
        }
    }

    public void setDateTextAppearance(int i9) {
        Iterator it = this.f73j.iterator();
        while (it.hasNext()) {
            ((C0020g) it.next()).setTextAppearance(getContext(), i9);
        }
    }

    public void setDayFormatter(InterfaceC5103e interfaceC5103e) {
        Iterator it = this.f73j.iterator();
        while (it.hasNext()) {
            ((C0020g) it.next()).m140l(interfaceC5103e);
        }
    }

    public void setDayFormatterContentDescription(InterfaceC5103e interfaceC5103e) {
        Iterator it = this.f73j.iterator();
        while (it.hasNext()) {
            ((C0020g) it.next()).m141m(interfaceC5103e);
        }
    }

    public void setDayViewDecorators(List<AbstractC0022i> list) {
        this.f65b.clear();
        if (list != null) {
            this.f65b.addAll(list);
        }
        m117f();
    }

    public void setMaximumDate(CalendarDay calendarDay) {
        this.f70g = calendarDay;
        m120i();
    }

    public void setMinimumDate(CalendarDay calendarDay) {
        this.f69f = calendarDay;
        m120i();
    }

    public void setSelectedDates(Collection collection) {
        for (C0020g c0020g : this.f73j) {
            c0020g.setChecked(collection != null && collection.contains(c0020g.m135g()));
        }
        postInvalidate();
    }

    public void setSelectionColor(int i9) {
        Iterator it = this.f73j.iterator();
        while (it.hasNext()) {
            ((C0020g) it.next()).m143o(i9);
        }
    }

    public void setSelectionEnabled(boolean z9) {
        for (C0020g c0020g : this.f73j) {
            c0020g.setOnClickListener(z9 ? this : null);
            c0020g.setClickable(z9);
        }
    }

    public void setShowOtherDates(int i9) {
        this.f66c = i9;
        m120i();
    }

    public void setWeekDayFormatter(InterfaceC5106h interfaceC5106h) {
        ArrayList arrayList = this.f64a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((C0031r) obj).m170c(interfaceC5106h);
        }
    }

    public void setWeekDayTextAppearance(int i9) {
        ArrayList arrayList = this.f64a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((C0031r) obj).setTextAppearance(getContext(), i9);
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
