.class public La2/s;
.super La2/d;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, La2/d;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;IZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Ljava/util/Collection;Ljava/util/Calendar;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x7

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La2/d;->a(Ljava/util/Collection;Ljava/util/Calendar;)V

    .line 6
    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    return-void
.end method

.method public bridge synthetic e(Landroid/util/AttributeSet;)La2/d$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->e(Landroid/util/AttributeSet;)La2/d$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public getRows()I
    .locals 1

    .line 1
    iget-boolean v0, p0, La2/d;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    return v0
.end method

.method public bridge synthetic onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->onClick(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic onLongClick(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->onLongClick(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge synthetic setDateTextAppearance(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->setDateTextAppearance(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setDayFormatter(Lb2/e;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->setDayFormatter(Lb2/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setDayFormatterContentDescription(Lb2/e;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->setDayFormatterContentDescription(Lb2/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setMaximumDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->setMaximumDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setMinimumDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->setMinimumDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setSelectedDates(Ljava/util/Collection;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->setSelectedDates(Ljava/util/Collection;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setSelectionColor(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->setSelectionColor(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setSelectionEnabled(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->setSelectionEnabled(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setShowOtherDates(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->setShowOtherDates(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setWeekDayFormatter(Lb2/h;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->setWeekDayFormatter(Lb2/h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setWeekDayTextAppearance(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/d;->setWeekDayTextAppearance(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    invoke-super {p0}, La2/d;->shouldDelayChildPressedState()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
