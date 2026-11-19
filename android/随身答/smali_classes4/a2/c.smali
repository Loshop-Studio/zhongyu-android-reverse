.class public abstract La2/c;
.super Landroidx/viewpager/widget/PagerAdapter;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayDeque;

.field public final b:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

.field public final c:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

.field public d:Lb2/g;

.field public e:Ljava/lang/Integer;

.field public f:Ljava/lang/Integer;

.field public g:Ljava/lang/Integer;

.field public h:I

.field public i:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

.field public j:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

.field public k:La2/f;

.field public l:Ljava/util/List;

.field public m:Lb2/h;

.field public n:Lb2/e;

.field public o:Lb2/e;

.field public p:Ljava/util/List;

.field public q:Ljava/util/List;

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/viewpager/widget/PagerAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, La2/c;->d:Lb2/g;

    .line 6
    .line 7
    iput-object v0, p0, La2/c;->e:Ljava/lang/Integer;

    .line 8
    .line 9
    iput-object v0, p0, La2/c;->f:Ljava/lang/Integer;

    .line 10
    .line 11
    iput-object v0, p0, La2/c;->g:Ljava/lang/Integer;

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    iput v1, p0, La2/c;->h:I

    .line 15
    .line 16
    iput-object v0, p0, La2/c;->i:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 17
    .line 18
    iput-object v0, p0, La2/c;->j:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, La2/c;->l:Ljava/util/List;

    .line 26
    .line 27
    sget-object v1, Lb2/h;->a:Lb2/h;

    .line 28
    .line 29
    iput-object v1, p0, La2/c;->m:Lb2/h;

    .line 30
    .line 31
    sget-object v1, Lb2/e;->a:Lb2/e;

    .line 32
    .line 33
    iput-object v1, p0, La2/c;->n:Lb2/e;

    .line 34
    .line 35
    iput-object v1, p0, La2/c;->o:Lb2/e;

    .line 36
    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, La2/c;->p:Ljava/util/List;

    .line 43
    .line 44
    iput-object v0, p0, La2/c;->q:Ljava/util/List;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    iput-boolean v1, p0, La2/c;->r:Z

    .line 48
    .line 49
    iput-object p1, p0, La2/c;->b:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 50
    .line 51
    invoke-static {}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->p()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, La2/c;->c:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 56
    .line 57
    new-instance p1, Ljava/util/ArrayDeque;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v0, v0}, La2/c;->t(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, La2/c;->g:Ljava/lang/Integer;

    .line 9
    .line 10
    iget-object v0, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, La2/d;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, La2/d;->setWeekDayTextAppearance(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    return-void
.end method

.method public final B()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, La2/c;->l:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_3

    .line 9
    .line 10
    iget-object v1, p0, La2/c;->l:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 17
    .line 18
    iget-object v2, p0, La2/c;->i:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->l(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    :cond_0
    iget-object v2, p0, La2/c;->j:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->m(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    :cond_1
    iget-object v2, p0, La2/c;->l:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, La2/c;->b:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->D(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v0, v0, -0x1

    .line 49
    .line 50
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-void
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->l:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La2/c;->m()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public abstract b(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)La2/f;
.end method

.method public abstract c(I)La2/d;
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->f:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p3, La2/d;

    .line 2
    .line 3
    iget-object p2, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {p2, p3}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public e(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)I
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, La2/c;->getCount()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    div-int/lit8 p1, p1, 0x2

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    iget-object v0, p0, La2/c;->i:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->m(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_1
    iget-object v0, p0, La2/c;->j:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->l(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, La2/c;->getCount()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    return p1

    .line 39
    :cond_2
    iget-object v0, p0, La2/c;->k:La2/f;

    .line 40
    .line 41
    invoke-interface {v0, p1}, La2/f;->a(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1
.end method

.method public f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->k:La2/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, La2/f;->getItem(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public g()La2/f;
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->k:La2/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->k:La2/f;

    .line 2
    .line 3
    invoke-interface {v0}, La2/f;->getCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, La2/c;->n(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x2

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    check-cast p1, La2/d;

    .line 10
    .line 11
    invoke-virtual {p1}, La2/d;->getFirstViewDay()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    invoke-virtual {p0, p1}, La2/c;->k(La2/d;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-gez p1, :cond_2

    .line 23
    .line 24
    return v1

    .line 25
    :cond_2
    return p1
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->d:Lb2/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, La2/c;->f(I)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p1}, Lb2/g;->a(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->l:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, La2/c;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, La2/c;->c(I)La2/d;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, La2/c;->b:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getCalendarContentDescription()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p2, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 16
    .line 17
    .line 18
    iget-boolean v0, p0, La2/c;->r:Z

    .line 19
    .line 20
    invoke-virtual {p2, v0}, La2/d;->setSelectionEnabled(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, La2/c;->m:Lb2/h;

    .line 24
    .line 25
    invoke-virtual {p2, v0}, La2/d;->setWeekDayFormatter(Lb2/h;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La2/c;->n:Lb2/e;

    .line 29
    .line 30
    invoke-virtual {p2, v0}, La2/d;->setDayFormatter(Lb2/e;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, La2/c;->o:Lb2/e;

    .line 34
    .line 35
    invoke-virtual {p2, v0}, La2/d;->setDayFormatterContentDescription(Lb2/e;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, La2/c;->e:Ljava/lang/Integer;

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p2, v0}, La2/d;->setSelectionColor(I)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v0, p0, La2/c;->f:Ljava/lang/Integer;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p2, v0}, La2/d;->setDateTextAppearance(I)V

    .line 58
    .line 59
    .line 60
    :cond_1
    iget-object v0, p0, La2/c;->g:Ljava/lang/Integer;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p2, v0}, La2/d;->setWeekDayTextAppearance(I)V

    .line 69
    .line 70
    .line 71
    :cond_2
    iget v0, p0, La2/c;->h:I

    .line 72
    .line 73
    invoke-virtual {p2, v0}, La2/d;->setShowOtherDates(I)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, La2/c;->i:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 77
    .line 78
    invoke-virtual {p2, v0}, La2/d;->setMinimumDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, La2/c;->j:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 82
    .line 83
    invoke-virtual {p2, v0}, La2/d;->setMaximumDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, La2/c;->l:Ljava/util/List;

    .line 87
    .line 88
    invoke-virtual {p2, v0}, La2/d;->setSelectedDates(Ljava/util/Collection;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, La2/c;->q:Ljava/util/List;

    .line 100
    .line 101
    invoke-virtual {p2, p1}, La2/d;->setDayViewDecorators(Ljava/util/List;)V

    .line 102
    .line 103
    .line 104
    return-object p2
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    return p1
.end method

.method public j()I
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->g:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public abstract k(La2/d;)I
.end method

.method public l()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, La2/c;->q:Ljava/util/List;

    .line 7
    .line 8
    iget-object v0, p0, La2/c;->p:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, La2/d;

    .line 37
    .line 38
    iget-object v2, p0, La2/c;->q:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, La2/d;->setDayViewDecorators(Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void

    .line 45
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lq/a;->a(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, La2/h;

    .line 53
    .line 54
    invoke-direct {v0}, La2/h;-><init>()V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    throw v0
.end method

.method public final m()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La2/c;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La2/d;

    .line 21
    .line 22
    iget-object v2, p0, La2/c;->l:Ljava/util/List;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, La2/d;->setSelectedDates(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public abstract n(Ljava/lang/Object;)Z
.end method

.method public o(La2/c;)La2/c;
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->d:Lb2/g;

    .line 2
    .line 3
    iput-object v0, p1, La2/c;->d:Lb2/g;

    .line 4
    .line 5
    iget-object v0, p0, La2/c;->e:Ljava/lang/Integer;

    .line 6
    .line 7
    iput-object v0, p1, La2/c;->e:Ljava/lang/Integer;

    .line 8
    .line 9
    iget-object v0, p0, La2/c;->f:Ljava/lang/Integer;

    .line 10
    .line 11
    iput-object v0, p1, La2/c;->f:Ljava/lang/Integer;

    .line 12
    .line 13
    iget-object v0, p0, La2/c;->g:Ljava/lang/Integer;

    .line 14
    .line 15
    iput-object v0, p1, La2/c;->g:Ljava/lang/Integer;

    .line 16
    .line 17
    iget v0, p0, La2/c;->h:I

    .line 18
    .line 19
    iput v0, p1, La2/c;->h:I

    .line 20
    .line 21
    iget-object v0, p0, La2/c;->i:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 22
    .line 23
    iput-object v0, p1, La2/c;->i:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 24
    .line 25
    iget-object v0, p0, La2/c;->j:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 26
    .line 27
    iput-object v0, p1, La2/c;->j:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 28
    .line 29
    iget-object v0, p0, La2/c;->l:Ljava/util/List;

    .line 30
    .line 31
    iput-object v0, p1, La2/c;->l:Ljava/util/List;

    .line 32
    .line 33
    iget-object v0, p0, La2/c;->m:Lb2/h;

    .line 34
    .line 35
    iput-object v0, p1, La2/c;->m:Lb2/h;

    .line 36
    .line 37
    iget-object v0, p0, La2/c;->n:Lb2/e;

    .line 38
    .line 39
    iput-object v0, p1, La2/c;->n:Lb2/e;

    .line 40
    .line 41
    iget-object v0, p0, La2/c;->o:Lb2/e;

    .line 42
    .line 43
    iput-object v0, p1, La2/c;->o:Lb2/e;

    .line 44
    .line 45
    iget-object v0, p0, La2/c;->p:Ljava/util/List;

    .line 46
    .line 47
    iput-object v0, p1, La2/c;->p:Ljava/util/List;

    .line 48
    .line 49
    iget-object v0, p0, La2/c;->q:Ljava/util/List;

    .line 50
    .line 51
    iput-object v0, p1, La2/c;->q:Ljava/util/List;

    .line 52
    .line 53
    iget-boolean v0, p0, La2/c;->r:Z

    .line 54
    .line 55
    iput-boolean v0, p1, La2/c;->r:Z

    .line 56
    .line 57
    return-object p1
.end method

.method public p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, La2/c;->l:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, La2/c;->l:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La2/c;->m()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object p2, p0, La2/c;->l:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    iget-object p2, p0, La2/c;->l:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La2/c;->m()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public q(I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, La2/c;->f:Ljava/lang/Integer;

    .line 9
    .line 10
    iget-object v0, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, La2/d;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, La2/d;->setDateTextAppearance(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    return-void
.end method

.method public r(Lb2/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, La2/c;->o:Lb2/e;

    .line 2
    .line 3
    iget-object v1, p0, La2/c;->n:Lb2/e;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    :cond_0
    iput-object v0, p0, La2/c;->o:Lb2/e;

    .line 9
    .line 10
    iput-object p1, p0, La2/c;->n:Lb2/e;

    .line 11
    .line 12
    iget-object v0, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La2/d;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, La2/d;->setDayFormatter(Lb2/e;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public s(Lb2/e;)V
    .locals 2

    .line 1
    iput-object p1, p0, La2/c;->o:Lb2/e;

    .line 2
    .line 3
    iget-object v0, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La2/d;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, La2/d;->setDayFormatterContentDescription(Lb2/e;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public t(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V
    .locals 2

    .line 1
    iput-object p1, p0, La2/c;->i:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    iput-object p2, p0, La2/c;->j:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 4
    .line 5
    iget-object v0, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, La2/d;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, La2/d;->setMinimumDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p2}, La2/d;->setMaximumDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    if-nez p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, La2/c;->c:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->j()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    add-int/lit16 p1, p1, -0xc8

    .line 39
    .line 40
    iget-object v0, p0, La2/c;->c:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->i()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v1, p0, La2/c;->c:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->h()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {p1, v0, v1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b(III)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_1
    if-nez p2, :cond_2

    .line 57
    .line 58
    iget-object p2, p0, La2/c;->c:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->j()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    add-int/lit16 p2, p2, 0xc8

    .line 65
    .line 66
    iget-object v0, p0, La2/c;->c:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->i()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object v1, p0, La2/c;->c:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->h()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-static {p2, v0, v1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b(III)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2}, La2/c;->b(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)La2/f;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, La2/c;->k:La2/f;

    .line 87
    .line 88
    invoke-virtual {p0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, La2/c;->m()V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public u(I)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, La2/c;->e:Ljava/lang/Integer;

    .line 6
    .line 7
    iget-object v0, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, La2/d;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, La2/d;->setSelectionColor(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public v(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, La2/c;->r:Z

    .line 2
    .line 3
    iget-object p1, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La2/d;

    .line 20
    .line 21
    iget-boolean v1, p0, La2/c;->r:Z

    .line 22
    .line 23
    invoke-virtual {v0, v1}, La2/d;->setSelectionEnabled(Z)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public w(I)V
    .locals 2

    .line 1
    iput p1, p0, La2/c;->h:I

    .line 2
    .line 3
    iget-object v0, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La2/d;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, La2/d;->setShowOtherDates(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public x(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La2/c;->s:Z

    .line 2
    .line 3
    return-void
.end method

.method public y(Lb2/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, La2/c;->d:Lb2/g;

    .line 2
    .line 3
    return-void
.end method

.method public z(Lb2/h;)V
    .locals 2

    .line 1
    iput-object p1, p0, La2/c;->m:Lb2/h;

    .line 2
    .line 3
    iget-object v0, p0, La2/c;->a:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La2/d;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, La2/d;->setWeekDayFormatter(Lb2/h;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method
