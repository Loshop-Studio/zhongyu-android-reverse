package p021b2;

import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Calendar;
import java.util.Collection;
import p021b2.AbstractViewOnClickListenerC4964d;
import p032c2.InterfaceC5110e;
import p032c2.InterfaceC5113h;

/* renamed from: b2.s */
/* loaded from: classes4.dex */
public class C4979s extends AbstractViewOnClickListenerC4964d {
    public C4979s(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i10, boolean z9) {
        super(materialCalendarView, calendarDay, i10, z9);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    /* renamed from: b */
    public void mo2402b(Collection collection, Calendar calendar) {
        for (int i10 = 0; i10 < 7; i10++) {
            m2401a(collection, calendar);
        }
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    /* renamed from: e */
    public /* bridge */ /* synthetic */ AbstractViewOnClickListenerC4964d.a generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    /* renamed from: g */
    public boolean mo2407g(CalendarDay calendarDay) {
        return true;
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public int getRows() {
        return this.f2422i ? 2 : 1;
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d, android.view.View.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d, android.view.View.OnLongClickListener
    public /* bridge */ /* synthetic */ boolean onLongClick(View view) {
        return super.onLongClick(view);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public /* bridge */ /* synthetic */ void setDateTextAppearance(int i10) {
        super.setDateTextAppearance(i10);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public /* bridge */ /* synthetic */ void setDayFormatter(InterfaceC5110e interfaceC5110e) {
        super.setDayFormatter(interfaceC5110e);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public /* bridge */ /* synthetic */ void setDayFormatterContentDescription(InterfaceC5110e interfaceC5110e) {
        super.setDayFormatterContentDescription(interfaceC5110e);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public /* bridge */ /* synthetic */ void setMaximumDate(CalendarDay calendarDay) {
        super.setMaximumDate(calendarDay);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public /* bridge */ /* synthetic */ void setMinimumDate(CalendarDay calendarDay) {
        super.setMinimumDate(calendarDay);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public /* bridge */ /* synthetic */ void setSelectedDates(Collection collection) {
        super.setSelectedDates(collection);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public /* bridge */ /* synthetic */ void setSelectionColor(int i10) {
        super.setSelectionColor(i10);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public /* bridge */ /* synthetic */ void setSelectionEnabled(boolean z9) {
        super.setSelectionEnabled(z9);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public /* bridge */ /* synthetic */ void setShowOtherDates(int i10) {
        super.setShowOtherDates(i10);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public /* bridge */ /* synthetic */ void setWeekDayFormatter(InterfaceC5113h interfaceC5113h) {
        super.setWeekDayFormatter(interfaceC5113h);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d
    public /* bridge */ /* synthetic */ void setWeekDayTextAppearance(int i10) {
        super.setWeekDayTextAppearance(i10);
    }

    @Override // p021b2.AbstractViewOnClickListenerC4964d, android.view.ViewGroup
    public /* bridge */ /* synthetic */ boolean shouldDelayChildPressedState() {
        return super.shouldDelayChildPressedState();
    }
}
