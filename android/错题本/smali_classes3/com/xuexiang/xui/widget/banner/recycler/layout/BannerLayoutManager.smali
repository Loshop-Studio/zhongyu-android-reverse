.class public Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$LayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:F

.field public e:Landroidx/recyclerview/widget/OrientationHelper;

.field public f:Z

.field public g:Z

.field public h:I

.field public i:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;

.field public j:F


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->b()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0

    .line 18
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->b()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    sub-int/2addr v0, v1

    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    return v0
.end method

.method public final b()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 10
    .line 11
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 12
    .line 13
    div-float/2addr v0, v1

    .line 14
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public final c()F
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 13
    .line 14
    mul-float/2addr v0, v1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public final canScrollHorizontally()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final canScrollVertically()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final computeHorizontalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x1

    .line 10
    return p1
.end method

.method public final computeHorizontalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->a()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final computeHorizontalScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final computeVerticalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x1

    .line 10
    return p1
.end method

.method public final computeVerticalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->a()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final computeVerticalScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final d()F
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g:Z

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
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    neg-int v0, v0

    .line 14
    int-to-float v0, v0

    .line 15
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 16
    .line 17
    mul-float/2addr v0, v1

    .line 18
    return v0
.end method

.method public final findViewByPosition(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    throw v0
.end method

.method public final generateDefaultLayoutParams()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final onAdapterChanged(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 6
    .line 7
    return-void
.end method

.method public final onAddFocusables(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/ArrayList;II)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->b()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->findViewByPosition(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1
.end method

.method public final onFocusSearchFailed(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onLayoutChildren(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$State;->getItemCount()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAndRecycleAllViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->e:Landroidx/recyclerview/widget/OrientationHelper;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    invoke-static {p0, v0}, Landroidx/recyclerview/widget/OrientationHelper;->createOrientationHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;I)Landroidx/recyclerview/widget/OrientationHelper;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->e:Landroidx/recyclerview/widget/OrientationHelper;

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getLayoutDirection()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    const/4 v1, 0x1

    .line 30
    if-ne p2, v1, :cond_2

    .line 31
    .line 32
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->f:Z

    .line 33
    .line 34
    xor-int/2addr p2, v1

    .line 35
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->f:Z

    .line 36
    .line 37
    :cond_2
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Recycler;->getViewForPosition(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p0, p2, v0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->e:Landroidx/recyclerview/widget/OrientationHelper;

    .line 45
    .line 46
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedMeasurement(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iput v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->a:I

    .line 51
    .line 52
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->e:Landroidx/recyclerview/widget/OrientationHelper;

    .line 53
    .line 54
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedMeasurementInOther(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->b:I

    .line 59
    .line 60
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->e:Landroidx/recyclerview/widget/OrientationHelper;

    .line 61
    .line 62
    invoke-virtual {p2}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->a:I

    .line 67
    .line 68
    sub-int/2addr p2, v1

    .line 69
    div-int/lit8 p2, p2, 0x2

    .line 70
    .line 71
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->c:I

    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 80
    .line 81
    .line 82
    iget p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->a:I

    .line 83
    .line 84
    int-to-float v1, p2

    .line 85
    const/high16 v2, 0x3f000000    # 0.5f

    .line 86
    .line 87
    mul-float/2addr v2, v1

    .line 88
    int-to-float v0, v0

    .line 89
    add-float/2addr v2, v0

    .line 90
    iput v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 91
    .line 92
    neg-int p2, p2

    .line 93
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->e:Landroidx/recyclerview/widget/OrientationHelper;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    sub-int/2addr p2, v0

    .line 100
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->c:I

    .line 101
    .line 102
    sub-int/2addr p2, v0

    .line 103
    int-to-float p2, p2

    .line 104
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 105
    .line 106
    div-float/2addr p2, v0

    .line 107
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 108
    .line 109
    .line 110
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->e:Landroidx/recyclerview/widget/OrientationHelper;

    .line 111
    .line 112
    invoke-virtual {p2}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->c:I

    .line 117
    .line 118
    sub-int/2addr p2, v0

    .line 119
    int-to-float p2, p2

    .line 120
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 121
    .line 122
    div-float/2addr p2, v0

    .line 123
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 124
    .line 125
    .line 126
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->i:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;

    .line 127
    .line 128
    if-eqz p2, :cond_3

    .line 129
    .line 130
    iget-boolean v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;->c:Z

    .line 131
    .line 132
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g:Z

    .line 133
    .line 134
    iget v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;->a:I

    .line 135
    .line 136
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->h:I

    .line 137
    .line 138
    iget p2, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;->b:F

    .line 139
    .line 140
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 141
    .line 142
    :cond_3
    iget p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->h:I

    .line 143
    .line 144
    const/4 v0, -0x1

    .line 145
    if-eq p2, v0, :cond_5

    .line 146
    .line 147
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g:Z

    .line 148
    .line 149
    int-to-float p2, p2

    .line 150
    if-eqz v0, :cond_4

    .line 151
    .line 152
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 153
    .line 154
    neg-float v0, v0

    .line 155
    :goto_0
    mul-float/2addr p2, v0

    .line 156
    goto :goto_1

    .line 157
    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :goto_1
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 161
    .line 162
    :cond_5
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 166
    .line 167
    .line 168
    const/4 p1, 0x0

    .line 169
    throw p1
.end method

.method public final onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->i:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->h:I

    .line 9
    .line 10
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;

    .line 6
    .line 7
    check-cast p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->i:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->i:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;)V

    .line 8
    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->h:I

    .line 17
    .line 18
    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;->a:I

    .line 19
    .line 20
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 21
    .line 22
    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;->b:F

    .line 23
    .line 24
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g:Z

    .line 25
    .line 26
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$SavedState;->c:Z

    .line 27
    .line 28
    return-object v0
.end method

.method public final scrollHorizontallyBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_5

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->e:Landroidx/recyclerview/widget/OrientationHelper;

    .line 11
    .line 12
    if-nez p3, :cond_1

    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    invoke-static {p0, p3}, Landroidx/recyclerview/widget/OrientationHelper;->createOrientationHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;I)Landroidx/recyclerview/widget/OrientationHelper;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->e:Landroidx/recyclerview/widget/OrientationHelper;

    .line 20
    .line 21
    :cond_1
    int-to-float p3, p1

    .line 22
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 23
    .line 24
    .line 25
    div-float v1, p3, v0

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const v3, 0x322bcc77    # 1.0E-8f

    .line 32
    .line 33
    .line 34
    cmpg-float v2, v2, v3

    .line 35
    .line 36
    if-gez v2, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 40
    .line 41
    add-float/2addr v2, v1

    .line 42
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d()F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    cmpg-float v1, v2, v1

    .line 47
    .line 48
    if-ltz v1, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->c()F

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    cmpl-float p3, v2, p3

    .line 55
    .line 56
    if-lez p3, :cond_4

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->c()F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iget p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 63
    .line 64
    sub-float/2addr p1, p3

    .line 65
    mul-float/2addr p1, v0

    .line 66
    float-to-int p1, p1

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d()F

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    sub-float/2addr v2, p1

    .line 73
    mul-float/2addr v2, v0

    .line 74
    sub-float/2addr p3, v2

    .line 75
    float-to-int p1, p3

    .line 76
    :cond_4
    :goto_0
    int-to-float p1, p1

    .line 77
    div-float/2addr p1, v0

    .line 78
    iget p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 79
    .line 80
    add-float/2addr p3, p1

    .line 81
    iput p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 82
    .line 83
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    throw p1

    .line 88
    :cond_5
    :goto_1
    const/4 p1, 0x0

    .line 89
    return p1
.end method

.method public final scrollToPosition(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->h:I

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g:Z

    .line 13
    .line 14
    int-to-float p1, p1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 18
    .line 19
    neg-float v0, v0

    .line 20
    :goto_0
    mul-float/2addr p1, v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_2
    return-void
.end method

.method public final scrollVerticallyBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;I)V
    .locals 1

    .line 1
    int-to-float p2, p3

    .line 2
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g:Z

    .line 3
    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    iget p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 10
    .line 11
    neg-float p3, p3

    .line 12
    :goto_0
    mul-float/2addr p2, p3

    .line 13
    iget p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 14
    .line 15
    sub-float/2addr p2, p3

    .line 16
    const p3, 0x7f7fffff    # Float.MAX_VALUE

    .line 17
    .line 18
    .line 19
    mul-float/2addr p2, p3

    .line 20
    float-to-int p2, p2

    .line 21
    const/4 p3, 0x0

    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(IILandroid/view/animation/Interpolator;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
