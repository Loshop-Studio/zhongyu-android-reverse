package p094f1;

import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p106g1.InterfaceC8519e;
import p106g1.InterfaceC8522h;

/* renamed from: f1.d */
/* loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC8409d extends ViewGroup implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: k */
    public static final Calendar f15947k = AbstractC8410e.m13717d();

    /* renamed from: a */
    public final ArrayList f15948a;

    /* renamed from: b */
    public final ArrayList f15949b;

    /* renamed from: c */
    public int f15950c;

    /* renamed from: d */
    public MaterialCalendarView f15951d;

    /* renamed from: e */
    public CalendarDay f15952e;

    /* renamed from: f */
    public CalendarDay f15953f;

    /* renamed from: g */
    public CalendarDay f15954g;

    /* renamed from: h */
    public int f15955h;

    /* renamed from: i */
    public boolean f15956i;

    /* renamed from: j */
    public final Collection f15957j;

    /* renamed from: f1.d$a */
    public static class a extends ViewGroup.MarginLayoutParams {
        public a() {
            super(-2, -2);
        }
    }

    public AbstractViewOnClickListenerC8409d(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i10, boolean z10) {
        super(materialCalendarView.getContext());
        this.f15948a = new ArrayList();
        this.f15949b = new ArrayList();
        this.f15950c = 4;
        this.f15953f = null;
        this.f15954g = null;
        ArrayList arrayList = new ArrayList();
        this.f15957j = arrayList;
        this.f15951d = materialCalendarView;
        this.f15952e = calendarDay;
        this.f15955h = i10;
        this.f15956i = z10;
        setClipChildren(false);
        setClipToPadding(false);
        if (z10) {
            m13707c(m13712h());
        }
        mo13706b(arrayList, m13712h());
    }

    /* renamed from: a */
    public void m13705a(Collection collection, Calendar calendar) {
        C8412g c8412g = new C8412g(getContext(), CalendarDay.m3984d(calendar));
        c8412g.setOnClickListener(this);
        c8412g.setOnLongClickListener(this);
        collection.add(c8412g);
        addView(c8412g, new a());
        calendar.add(5, 1);
    }

    /* renamed from: b */
    public abstract void mo13706b(Collection collection, Calendar calendar);

    /* renamed from: c */
    public final void m13707c(Calendar calendar) {
        for (int i10 = 0; i10 < 7; i10++) {
            C8423r c8423r = new C8423r(getContext(), AbstractC8410e.m13716c(calendar));
            c8423r.setImportantForAccessibility(2);
            this.f15948a.add(c8423r);
            addView(c8423r);
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
    public void m13710f() {
        C8413h c8413h = new C8413h();
        for (C8412g c8412g : this.f15957j) {
            c8413h.m13742e();
            Iterator it = this.f15949b.iterator();
            if (it.hasNext()) {
                ((AbstractC8414i) it.next()).getClass();
                c8412g.m13727g();
                throw null;
            }
            c8412g.m13724a(c8413h);
        }
    }

    /* renamed from: g */
    public abstract boolean mo13711g(CalendarDay calendarDay);

    public int getFirstDayOfWeek() {
        return this.f15955h;
    }

    public CalendarDay getFirstViewDay() {
        return this.f15952e;
    }

    public abstract int getRows();

    /* renamed from: h */
    public Calendar m13712h() {
        CalendarDay firstViewDay = getFirstViewDay();
        Calendar calendar = f15947k;
        firstViewDay.m3988a(calendar);
        calendar.setFirstDayOfWeek(getFirstDayOfWeek());
        int firstDayOfWeek = getFirstDayOfWeek() - AbstractC8410e.m13716c(calendar);
        if (!MaterialCalendarView.m4000J(this.f15950c) ? firstDayOfWeek > 0 : firstDayOfWeek >= 0) {
            firstDayOfWeek -= 7;
        }
        calendar.add(5, firstDayOfWeek);
        return calendar;
    }

    /* renamed from: i */
    public void m13713i() {
        for (C8412g c8412g : this.f15957j) {
            CalendarDay calendarDayM13727g = c8412g.m13727g();
            c8412g.m13737q(this.f15950c, calendarDayM13727g.m3996p(this.f15953f, this.f15954g), mo13711g(calendarDayM13727g));
        }
        postInvalidate();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        if (view instanceof C8412g) {
            this.f15951d.m4014B((C8412g) view);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbstractViewOnClickListenerC8409d.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbstractViewOnClickListenerC8409d.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
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
        if (!(view instanceof C8412g)) {
            return false;
        }
        this.f15951d.m4015C((C8412g) view);
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
            getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(i12, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(rows, BasicMeasure.EXACTLY));
        }
    }

    public void setDateTextAppearance(int i10) {
        Iterator it = this.f15957j.iterator();
        while (it.hasNext()) {
            ((C8412g) it.next()).setTextAppearance(getContext(), i10);
        }
    }

    public void setDayFormatter(InterfaceC8519e interfaceC8519e) {
        Iterator it = this.f15957j.iterator();
        while (it.hasNext()) {
            ((C8412g) it.next()).m13732l(interfaceC8519e);
        }
    }

    public void setDayFormatterContentDescription(InterfaceC8519e interfaceC8519e) {
        Iterator it = this.f15957j.iterator();
        while (it.hasNext()) {
            ((C8412g) it.next()).m13733m(interfaceC8519e);
        }
    }

    public void setDayViewDecorators(List<AbstractC8414i> list) {
        this.f15949b.clear();
        if (list != null) {
            this.f15949b.addAll(list);
        }
        m13710f();
    }

    public void setMaximumDate(CalendarDay calendarDay) {
        this.f15954g = calendarDay;
        m13713i();
    }

    public void setMinimumDate(CalendarDay calendarDay) {
        this.f15953f = calendarDay;
        m13713i();
    }

    public void setSelectedDates(Collection collection) {
        for (C8412g c8412g : this.f15957j) {
            c8412g.setChecked(collection != null && collection.contains(c8412g.m13727g()));
        }
        postInvalidate();
    }

    public void setSelectionColor(int i10) {
        Iterator it = this.f15957j.iterator();
        while (it.hasNext()) {
            ((C8412g) it.next()).m13735o(i10);
        }
    }

    public void setSelectionEnabled(boolean z10) {
        for (C8412g c8412g : this.f15957j) {
            c8412g.setOnClickListener(z10 ? this : null);
            c8412g.setClickable(z10);
        }
    }

    public void setShowOtherDates(int i10) {
        this.f15950c = i10;
        m13713i();
    }

    public void setWeekDayFormatter(InterfaceC8522h interfaceC8522h) {
        Iterator it = this.f15948a.iterator();
        while (it.hasNext()) {
            ((C8423r) it.next()).m13761c(interfaceC8522h);
        }
    }

    public void setWeekDayTextAppearance(int i10) {
        Iterator it = this.f15948a.iterator();
        while (it.hasNext()) {
            ((C8423r) it.next()).setTextAppearance(getContext(), i10);
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
