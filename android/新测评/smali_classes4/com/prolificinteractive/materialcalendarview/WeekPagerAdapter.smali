.class public Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;
.super Lb2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb2/c;"
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
.method public bridge synthetic A(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->A(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public C(I)Lb2/s;
    .locals 4

    .line 1
    new-instance v0, Lb2/s;

    .line 2
    .line 3
    iget-object v1, p0, Lb2/c;->b:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;->f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

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
    invoke-direct {v0, v1, p1, v2, v3}, Lb2/s;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;IZ)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public D(Lb2/s;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lb2/d;->getFirstViewDay()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;->g()Lb2/f;

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

.method public bridge synthetic a()V
    .locals 0

    .line 1
    invoke-super {p0}, Lb2/c;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Lb2/f;
    .locals 2

    .line 1
    new-instance v0, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter$a;

    .line 2
    .line 3
    iget-object v1, p0, Lb2/c;->b:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getFirstDayOfWeek()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, p1, p2, v1}, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter$a;-><init>(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic c(I)Lb2/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;->C(I)Lb2/s;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lb2/c;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic e(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->e(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge synthetic f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic g()Lb2/f;
    .locals 1

    .line 1
    invoke-super {p0}, Lb2/c;->g()Lb2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getCount()I
    .locals 1

    .line 1
    invoke-super {p0}, Lb2/c;->getCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic getItemPosition(Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->getItemPosition(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge synthetic getPageTitle(I)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->getPageTitle(I)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic h()Ljava/util/List;
    .locals 1

    .line 1
    invoke-super {p0}, Lb2/c;->h()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic i()I
    .locals 1

    .line 1
    invoke-super {p0}, Lb2/c;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lb2/c;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lb2/c;->isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge synthetic k(Lb2/d;)I
    .locals 0

    .line 1
    check-cast p1, Lb2/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;->D(Lb2/s;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic l()V
    .locals 0

    .line 1
    invoke-super {p0}, Lb2/c;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public n(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lb2/s;

    .line 2
    .line 3
    return p1
.end method

.method public bridge synthetic o(Lb2/c;)Lb2/c;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->o(Lb2/c;)Lb2/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lb2/c;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic q(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->q(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic r(Lc2/e;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->r(Lc2/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic s(Lc2/e;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->s(Lc2/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic t(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lb2/c;->t(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic u(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->u(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic v(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->v(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic w(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->w(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic x(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->x(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic y(Lc2/g;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->y(Lc2/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic z(Lc2/h;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lb2/c;->z(Lc2/h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
