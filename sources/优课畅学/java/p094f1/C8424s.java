package p094f1;

import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Calendar;
import java.util.Collection;
import p094f1.AbstractViewOnClickListenerC8409d;
import p106g1.InterfaceC8519e;
import p106g1.InterfaceC8522h;

/* renamed from: f1.s */
/* loaded from: classes4.dex */
public class C8424s extends AbstractViewOnClickListenerC8409d {
    public C8424s(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i10, boolean z10) {
        super(materialCalendarView, calendarDay, i10, z10);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    /* renamed from: b */
    public void mo13706b(Collection collection, Calendar calendar) {
        for (int i10 = 0; i10 < 7; i10++) {
            m13705a(collection, calendar);
        }
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    /* renamed from: e */
    public /* bridge */ /* synthetic */ AbstractViewOnClickListenerC8409d.a generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    /* renamed from: g */
    public boolean mo13711g(CalendarDay calendarDay) {
        return true;
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public int getRows() {
        return this.f15956i ? 2 : 1;
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d, android.view.View.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(View view) throws Resources.NotFoundException {
        super.onClick(view);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d, android.view.View.OnLongClickListener
    public /* bridge */ /* synthetic */ boolean onLongClick(View view) {
        return super.onLongClick(view);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public /* bridge */ /* synthetic */ void setDateTextAppearance(int i10) {
        super.setDateTextAppearance(i10);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public /* bridge */ /* synthetic */ void setDayFormatter(InterfaceC8519e interfaceC8519e) {
        super.setDayFormatter(interfaceC8519e);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public /* bridge */ /* synthetic */ void setDayFormatterContentDescription(InterfaceC8519e interfaceC8519e) {
        super.setDayFormatterContentDescription(interfaceC8519e);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public /* bridge */ /* synthetic */ void setMaximumDate(CalendarDay calendarDay) {
        super.setMaximumDate(calendarDay);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public /* bridge */ /* synthetic */ void setMinimumDate(CalendarDay calendarDay) {
        super.setMinimumDate(calendarDay);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public /* bridge */ /* synthetic */ void setSelectedDates(Collection collection) {
        super.setSelectedDates(collection);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public /* bridge */ /* synthetic */ void setSelectionColor(int i10) {
        super.setSelectionColor(i10);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public /* bridge */ /* synthetic */ void setSelectionEnabled(boolean z10) {
        super.setSelectionEnabled(z10);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public /* bridge */ /* synthetic */ void setShowOtherDates(int i10) {
        super.setShowOtherDates(i10);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public /* bridge */ /* synthetic */ void setWeekDayFormatter(InterfaceC8522h interfaceC8522h) {
        super.setWeekDayFormatter(interfaceC8522h);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d
    public /* bridge */ /* synthetic */ void setWeekDayTextAppearance(int i10) {
        super.setWeekDayTextAppearance(i10);
    }

    @Override // p094f1.AbstractViewOnClickListenerC8409d, android.view.ViewGroup
    public /* bridge */ /* synthetic */ boolean shouldDelayChildPressedState() {
        return super.shouldDelayChildPressedState();
    }
}
