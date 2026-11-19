.class public Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:[I

.field public e:Landroidx/recyclerview/widget/RecyclerView$Adapter;

.field public f:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

.field public g:Z

.field public h:Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->c(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->b:I

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->d(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-ltz p1, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->c:I

    .line 18
    .line 19
    if-eq v0, p1, :cond_0

    .line 20
    .line 21
    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->c:I

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final b(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->e:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 6
    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->e:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->c:I

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->h:Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final c(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)I
    .locals 4

    .line 1
    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_1
    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    new-array v0, v0, [I

    .line 35
    .line 36
    iput-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->d:[I

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findFirstVisibleItemPositions([I)[I

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->d:[I

    .line 42
    .line 43
    array-length v0, p1

    .line 44
    const v2, 0x7fffffff

    .line 45
    .line 46
    .line 47
    :goto_0
    if-ge v1, v0, :cond_2

    .line 48
    .line 49
    aget v3, p1, v1

    .line 50
    .line 51
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    return v2

    .line 59
    :cond_3
    return v1
.end method

.method public final d(I)I
    .locals 1

    .line 1
    :goto_0
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->e:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemViewType(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->f(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, -0x1

    .line 20
    return p1
.end method

.method public final e(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, -0x1

    .line 6
    if-ne p1, p2, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return p1

    .line 10
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->e:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemViewType(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->f(I)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public final f(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->a:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->b(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 5
    .line 6
    .line 7
    iget-object p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->e:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 8
    .line 9
    if-eqz p3, :cond_4

    .line 10
    .line 11
    iget-object p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->f:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    .line 12
    .line 13
    if-nez p3, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 17
    .line 18
    .line 19
    iget-boolean p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->g:Z

    .line 20
    .line 21
    if-eqz p3, :cond_3

    .line 22
    .line 23
    iget p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->b:I

    .line 24
    .line 25
    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->c:I

    .line 26
    .line 27
    if-lt p3, v0, :cond_3

    .line 28
    .line 29
    const/4 p3, -0x1

    .line 30
    if-eq v0, p3, :cond_3

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    int-to-float p1, p1

    .line 37
    const/high16 p3, 0x40000000    # 2.0f

    .line 38
    .line 39
    div-float/2addr p1, p3

    .line 40
    iget-object p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->f:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    .line 41
    .line 42
    invoke-virtual {p3}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->getChildHeight()I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    int-to-float p3, p3

    .line 47
    const v0, 0x3c23d70a    # 0.01f

    .line 48
    .line 49
    .line 50
    add-float/2addr p3, v0

    .line 51
    invoke-virtual {p2, p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->f:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    .line 56
    .line 57
    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->c:I

    .line 58
    .line 59
    invoke-virtual {p3, v0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->c(I)V

    .line 60
    .line 61
    .line 62
    const/4 p3, 0x0

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move v0, p3

    .line 71
    :goto_0
    invoke-virtual {p0, p2, p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->e(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    if-ltz v0, :cond_2

    .line 78
    .line 79
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->f:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->getChildHeight()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    sub-int p3, v0, p1

    .line 86
    .line 87
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->f:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    .line 88
    .line 89
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->d(I)V

    .line 90
    .line 91
    .line 92
    const/4 p1, 0x1

    .line 93
    invoke-virtual {p2, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_4

    .line 98
    .line 99
    if-eqz p3, :cond_4

    .line 100
    .line 101
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->f:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->b()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->f:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->a()V

    .line 110
    .line 111
    .line 112
    :cond_4
    :goto_1
    return-void
.end method
