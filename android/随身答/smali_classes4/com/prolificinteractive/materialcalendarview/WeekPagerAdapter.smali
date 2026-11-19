.class public Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;
.super La2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La2/c;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La2/c;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic A(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->A(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public C(I)La2/s;
    .locals 4

    .line 1
    new-instance v0, La2/s;

    .line 2
    .line 3
    iget-object v1, p0, La2/c;->b:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;->f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v2, p0, La2/c;->b:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getFirstDayOfWeek()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-boolean v3, p0, La2/c;->s:Z

    .line 16
    .line 17
    invoke-direct {v0, v1, p1, v2, v3}, La2/s;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;IZ)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public D(La2/s;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, La2/d;->getFirstViewDay()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;->g()La2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, La2/f;->a(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)I

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
    invoke-super {p0}, La2/c;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)La2/f;
    .locals 2

    .line 1
    new-instance v0, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter$a;

    .line 2
    .line 3
    iget-object v1, p0, La2/c;->b:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

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

.method public bridge synthetic c(I)La2/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;->C(I)La2/s;

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
    invoke-super {p0, p1, p2, p3}, La2/c;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic e(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->e(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)I

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
    invoke-super {p0, p1}, La2/c;->f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic g()La2/f;
    .locals 1

    .line 1
    invoke-super {p0}, La2/c;->g()La2/f;

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
    invoke-super {p0}, La2/c;->getCount()I

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
    invoke-super {p0, p1}, La2/c;->getItemPosition(Ljava/lang/Object;)I

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
    invoke-super {p0, p1}, La2/c;->getPageTitle(I)Ljava/lang/CharSequence;

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
    invoke-super {p0}, La2/c;->h()Ljava/util/List;

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
    invoke-super {p0}, La2/c;->i()I

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
    invoke-super {p0, p1, p2}, La2/c;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

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
    invoke-super {p0, p1, p2}, La2/c;->isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge synthetic k(La2/d;)I
    .locals 0

    .line 1
    check-cast p1, La2/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/prolificinteractive/materialcalendarview/WeekPagerAdapter;->D(La2/s;)I

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
    invoke-super {p0}, La2/c;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public n(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p1, p1, La2/s;

    .line 2
    .line 3
    return p1
.end method

.method public bridge synthetic o(La2/c;)La2/c;
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->o(La2/c;)La2/c;

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
    invoke-super {p0, p1, p2}, La2/c;->p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic q(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->q(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic r(Lb2/e;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->r(Lb2/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic s(Lb2/e;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->s(Lb2/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic t(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, La2/c;->t(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic u(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->u(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic v(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->v(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic w(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->w(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic x(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->x(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic y(Lb2/g;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->y(Lb2/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic z(Lb2/h;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La2/c;->z(Lb2/h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
