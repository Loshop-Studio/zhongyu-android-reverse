.class public Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;


# direct methods
.method public constructor <init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$b;->a:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$b;->a:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->g(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)La2/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$b;->a:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, La2/q;->k(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$b;->a:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->h(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)La2/c;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, p1}, La2/c;->f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v0, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->f(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$b;->a:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->i(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$b;->a:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->e(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->q(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
