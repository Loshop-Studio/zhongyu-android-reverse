.class public Lb2/k;
.super Lb2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb2/k$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lb2/c;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public C(I)Lb2/l;
    .locals 4

    .line 1
    new-instance v0, Lb2/l;

    .line 2
    .line 3
    iget-object v1, p0, Lb2/c;->b:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lb2/c;->f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v2, p0, Lb2/c;->b:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getFirstDayOfWeek()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-boolean v3, p0, Lb2/c;->s:Z

    .line 16
    .line 17
    invoke-direct {v0, v1, p1, v2, v3}, Lb2/l;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;IZ)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public D(Lb2/l;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lb2/l;->j()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lb2/c;->g()Lb2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Lb2/f;->a(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public b(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Lb2/f;
    .locals 1

    .line 1
    new-instance v0, Lb2/k$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lb2/k$a;-><init>(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic c(I)Lb2/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lb2/k;->C(I)Lb2/l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic k(Lb2/d;)I
    .locals 0

    .line 1
    check-cast p1, Lb2/l;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lb2/k;->D(Lb2/l;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public n(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lb2/l;

    .line 2
    .line 3
    return p1
.end method
