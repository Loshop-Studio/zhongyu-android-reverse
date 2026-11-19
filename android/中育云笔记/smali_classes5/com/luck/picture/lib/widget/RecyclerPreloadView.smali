.class public Lcom/luck/picture/lib/widget/RecyclerPreloadView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# instance fields
.field public c:Z

.field public d:Z

.field public e:I

.field public f:I

.field public g:I

.field public h:Lq6/i;

.field public i:Lq6/k;

.field public j:Lq6/j;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->c:Z

    .line 3
    iput-boolean p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->d:Z

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->g:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->c:Z

    .line 7
    iput-boolean p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->d:Z

    const/4 p1, 0x1

    .line 8
    iput p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->g:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->c:Z

    .line 11
    iput-boolean p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->d:Z

    const/4 p1, 0x1

    .line 12
    iput p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->g:I

    return-void
.end method

.method private setLayoutManagerPosition(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V
    .locals 1

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
    move-result v0

    .line 11
    iput v0, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->e:I

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->f:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->e:I

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->f:I

    .line 37
    .line 38
    :cond_1
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public getFirstVisiblePosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public getLastVisiblePosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public onScrollStateChanged(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onScrollStateChanged(I)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {p0, v0}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setLayoutManagerPosition(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->j:Lq6/j;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-interface {v0, p1}, Lq6/j;->a(I)V

    .line 21
    .line 22
    .line 23
    :cond_2
    if-nez p1, :cond_3

    .line 24
    .line 25
    iget-object p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->i:Lq6/k;

    .line 26
    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, Lq6/k;->a()V

    .line 30
    .line 31
    .line 32
    :cond_3
    return-void
.end method

.method public onScrolled(II)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->onScrolled(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_7

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setLayoutManagerPosition(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->h:Lq6/i;

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    iget-boolean v1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->d:Z

    .line 18
    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    instance-of v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    div-int/2addr v1, v2

    .line 43
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    div-int/2addr v2, v0

    .line 52
    iget v0, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->g:I

    .line 53
    .line 54
    sub-int/2addr v1, v0

    .line 55
    if-lt v2, v1, :cond_1

    .line 56
    .line 57
    iget-boolean v0, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->c:Z

    .line 58
    .line 59
    if-nez v0, :cond_0

    .line 60
    .line 61
    iget-object v0, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->h:Lq6/i;

    .line 62
    .line 63
    invoke-interface {v0}, Lq6/i;->h()V

    .line 64
    .line 65
    .line 66
    if-lez p2, :cond_3

    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->c:Z

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    if-nez p2, :cond_3

    .line 73
    .line 74
    iput-boolean v3, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->c:Z

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iput-boolean v3, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->c:Z

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 81
    .line 82
    const-string p2, "Adapter is null,Please check it!"

    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->j:Lq6/j;

    .line 89
    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    invoke-interface {v0, p1, p2}, Lq6/j;->b(II)V

    .line 93
    .line 94
    .line 95
    :cond_4
    iget-object p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->i:Lq6/k;

    .line 96
    .line 97
    if-eqz p1, :cond_6

    .line 98
    .line 99
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    const/16 p2, 0x96

    .line 104
    .line 105
    if-ge p1, p2, :cond_5

    .line 106
    .line 107
    iget-object p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->i:Lq6/k;

    .line 108
    .line 109
    invoke-interface {p1}, Lq6/k;->a()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_5
    iget-object p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->i:Lq6/k;

    .line 114
    .line 115
    invoke-interface {p1}, Lq6/k;->b()V

    .line 116
    .line 117
    .line 118
    :cond_6
    return-void

    .line 119
    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    .line 120
    .line 121
    const-string p2, "LayoutManager is null,Please check it!"

    .line 122
    .line 123
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1
.end method

.method public setEnabledLoadMore(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public setLastVisiblePosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->f:I

    .line 2
    .line 3
    return-void
.end method

.method public setOnRecyclerViewPreloadListener(Lq6/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->h:Lq6/i;

    .line 2
    .line 3
    return-void
.end method

.method public setOnRecyclerViewScrollListener(Lq6/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->j:Lq6/j;

    .line 2
    .line 3
    return-void
.end method

.method public setOnRecyclerViewScrollStateListener(Lq6/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->i:Lq6/k;

    .line 2
    .line 3
    return-void
.end method

.method public setReachBottomRow(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ge p1, v0, :cond_0

    .line 3
    .line 4
    move p1, v0

    .line 5
    :cond_0
    iput p1, p0, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->g:I

    .line 6
    .line 7
    return-void
.end method
