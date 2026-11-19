package p003a2;

import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Calendar;
import java.util.Collection;
import p003a2.AbstractViewOnClickListenerC0017d;
import p020b2.InterfaceC5103e;
import p020b2.InterfaceC5106h;

/* renamed from: a2.s */
/* loaded from: classes4.dex */
public class C0032s extends AbstractViewOnClickListenerC0017d {
    public C0032s(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, int i9, boolean z9) {
        super(materialCalendarView, calendarDay, i9, z9);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    /* renamed from: b */
    public void mo113b(Collection collection, Calendar calendar) {
        for (int i9 = 0; i9 < 7; i9++) {
            m112a(collection, calendar);
        }
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    /* renamed from: e */
    public /* bridge */ /* synthetic */ AbstractViewOnClickListenerC0017d.a generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    /* renamed from: g */
    public boolean mo118g(CalendarDay calendarDay) {
        return true;
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public int getRows() {
        return this.f72i ? 2 : 1;
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d, android.view.View.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d, android.view.View.OnLongClickListener
    public /* bridge */ /* synthetic */ boolean onLongClick(View view) {
        return super.onLongClick(view);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public /* bridge */ /* synthetic */ void setDateTextAppearance(int i9) {
        super.setDateTextAppearance(i9);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public /* bridge */ /* synthetic */ void setDayFormatter(InterfaceC5103e interfaceC5103e) {
        super.setDayFormatter(interfaceC5103e);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public /* bridge */ /* synthetic */ void setDayFormatterContentDescription(InterfaceC5103e interfaceC5103e) {
        super.setDayFormatterContentDescription(interfaceC5103e);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public /* bridge */ /* synthetic */ void setMaximumDate(CalendarDay calendarDay) {
        super.setMaximumDate(calendarDay);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public /* bridge */ /* synthetic */ void setMinimumDate(CalendarDay calendarDay) {
        super.setMinimumDate(calendarDay);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public /* bridge */ /* synthetic */ void setSelectedDates(Collection collection) {
        super.setSelectedDates(collection);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public /* bridge */ /* synthetic */ void setSelectionColor(int i9) {
        super.setSelectionColor(i9);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public /* bridge */ /* synthetic */ void setSelectionEnabled(boolean z9) {
        super.setSelectionEnabled(z9);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public /* bridge */ /* synthetic */ void setShowOtherDates(int i9) {
        super.setShowOtherDates(i9);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public /* bridge */ /* synthetic */ void setWeekDayFormatter(InterfaceC5106h interfaceC5106h) {
        super.setWeekDayFormatter(interfaceC5106h);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d
    public /* bridge */ /* synthetic */ void setWeekDayTextAppearance(int i9) {
        super.setWeekDayTextAppearance(i9);
    }

    @Override // p003a2.AbstractViewOnClickListenerC0017d, android.view.ViewGroup
    public /* bridge */ /* synthetic */ boolean shouldDelayChildPressedState() {
        return super.shouldDelayChildPressedState();
    }
}
