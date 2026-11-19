.class public Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$LayoutManager;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:F

.field public f:Landroidx/recyclerview/widget/OrientationHelper;

.field public g:Z

.field public h:I

.field public i:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

.field public j:F


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 9
    .line 10
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 11
    .line 12
    div-float/2addr v0, v1

    .line 13
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    neg-int v0, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 20
    .line 21
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 22
    .line 23
    div-float/2addr v0, v1

    .line 24
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    if-gez v0, :cond_1

    .line 36
    .line 37
    move v0, v2

    .line 38
    :cond_1
    move v3, v0

    .line 39
    if-le v0, v1, :cond_2

    .line 40
    .line 41
    move v0, v1

    .line 42
    :cond_2
    const/4 v4, 0x1

    .line 43
    :goto_1
    if-ge v3, v0, :cond_8

    .line 44
    .line 45
    if-lt v3, v1, :cond_3

    .line 46
    .line 47
    rem-int v5, v3, v1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    if-gez v3, :cond_5

    .line 51
    .line 52
    neg-int v5, v3

    .line 53
    rem-int/2addr v5, v1

    .line 54
    if-nez v5, :cond_4

    .line 55
    .line 56
    move v5, v1

    .line 57
    :cond_4
    sub-int v5, v1, v5

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_5
    move v5, v3

    .line 61
    :goto_2
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView$Recycler;->getViewForPosition(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {p0, v6, v2, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    .line 66
    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    invoke-virtual {v6, v7}, Landroid/view/View;->setRotation(F)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6, v7}, Landroid/view/View;->setRotationY(F)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6, v7}, Landroid/view/View;->setRotationX(F)V

    .line 76
    .line 77
    .line 78
    const/high16 v7, 0x3f800000    # 1.0f

    .line 79
    .line 80
    invoke-virtual {v6, v7}, Landroid/view/View;->setScaleX(F)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6, v7}, Landroid/view/View;->setScaleY(F)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v7}, Landroid/view/View;->setAlpha(F)V

    .line 87
    .line 88
    .line 89
    iget-boolean v7, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 90
    .line 91
    if-eqz v7, :cond_6

    .line 92
    .line 93
    int-to-float v7, v3

    .line 94
    iget v8, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 95
    .line 96
    neg-float v8, v8

    .line 97
    :goto_3
    mul-float/2addr v7, v8

    .line 98
    goto :goto_4

    .line 99
    :cond_6
    int-to-float v7, v3

    .line 100
    iget v8, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :goto_4
    iget v8, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 104
    .line 105
    sub-float/2addr v7, v8

    .line 106
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->b(Landroid/view/View;F)V

    .line 107
    .line 108
    .line 109
    int-to-float v5, v5

    .line 110
    cmpl-float v4, v5, v4

    .line 111
    .line 112
    if-lez v4, :cond_7

    .line 113
    .line 114
    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_7
    invoke-virtual {p0, v6, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;I)V

    .line 119
    .line 120
    .line 121
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 122
    .line 123
    move v4, v5

    .line 124
    goto :goto_1

    .line 125
    :cond_8
    return-void
.end method

.method public final b(Landroid/view/View;F)V
    .locals 8

    .line 1
    float-to-int v0, p2

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->c:I

    .line 3
    .line 4
    add-int v4, v1, v0

    .line 5
    .line 6
    iget v5, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d:I

    .line 7
    .line 8
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->a:I

    .line 9
    .line 10
    add-int v6, v4, v0

    .line 11
    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->b:I

    .line 13
    .line 14
    add-int v7, v5, v0

    .line 15
    .line 16
    move-object v2, p0

    .line 17
    move-object v3, p1

    .line 18
    invoke-virtual/range {v2 .. v7}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->layoutDecorated(Landroid/view/View;IIII)V

    .line 19
    .line 20
    .line 21
    iget p1, v2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->c:I

    .line 22
    .line 23
    int-to-float p1, p1

    .line 24
    add-float/2addr p1, p2

    .line 25
    iget-object v0, v2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:Landroidx/recyclerview/widget/OrientationHelper;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v1, v2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->a:I

    .line 32
    .line 33
    sub-int/2addr v0, v1

    .line 34
    int-to-float v0, v0

    .line 35
    const/high16 v1, 0x40000000    # 2.0f

    .line 36
    .line 37
    div-float/2addr v0, v1

    .line 38
    sub-float/2addr p1, v0

    .line 39
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    const/high16 v0, -0x40800000    # -1.0f

    .line 44
    .line 45
    mul-float/2addr p1, v0

    .line 46
    iget-object v0, v2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:Landroidx/recyclerview/widget/OrientationHelper;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    int-to-float v0, v0

    .line 53
    div-float/2addr v0, v1

    .line 54
    div-float/2addr p1, v0

    .line 55
    const/high16 v0, 0x3f800000    # 1.0f

    .line 56
    .line 57
    add-float/2addr p1, v0

    .line 58
    invoke-virtual {v3, p1}, Landroid/view/View;->setScaleX(F)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, p1}, Landroid/view/View;->setScaleY(F)V

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    invoke-virtual {v3, p1}, Landroid/view/View;->setElevation(F)V

    .line 66
    .line 67
    .line 68
    const/high16 p1, -0x80000000

    .line 69
    .line 70
    iget v0, v2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 71
    .line 72
    div-float/2addr p1, v0

    .line 73
    mul-float/2addr p1, p2

    .line 74
    invoke-virtual {v3, p1}, Landroid/view/View;->setRotationY(F)V

    .line 75
    .line 76
    .line 77
    return-void
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
    .locals 2

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
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 14
    .line 15
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 16
    .line 17
    div-float/2addr p1, v0

    .line 18
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 32
    .line 33
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 34
    .line 35
    div-float/2addr v0, v1

    .line 36
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    sub-int/2addr p1, v0

    .line 45
    add-int/lit8 p1, p1, -0x1

    .line 46
    .line 47
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

.method public final computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 3

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
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ge p1, v1, :cond_1

    .line 20
    .line 21
    move v0, v2

    .line 22
    :cond_1
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 23
    .line 24
    xor-int/2addr p1, v2

    .line 25
    if-ne v0, p1, :cond_2

    .line 26
    .line 27
    const/high16 p1, -0x40800000    # -1.0f

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 31
    .line 32
    :goto_0
    new-instance v0, Landroid/graphics/PointF;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, p1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 36
    .line 37
    .line 38
    return-object v0
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
    .locals 2

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
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 14
    .line 15
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 16
    .line 17
    div-float/2addr p1, v0

    .line 18
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 32
    .line 33
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 34
    .line 35
    div-float/2addr v0, v1

    .line 36
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    sub-int/2addr p1, v0

    .line 45
    add-int/lit8 p1, p1, -0x1

    .line 46
    .line 47
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
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 6
    .line 7
    return-void
.end method

.method public final onLayoutChildren(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 2

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
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:Landroidx/recyclerview/widget/OrientationHelper;

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
    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:Landroidx/recyclerview/widget/OrientationHelper;

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
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 33
    .line 34
    xor-int/2addr p2, v1

    .line 35
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:Landroidx/recyclerview/widget/OrientationHelper;

    .line 45
    .line 46
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedMeasurement(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->a:I

    .line 51
    .line 52
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:Landroidx/recyclerview/widget/OrientationHelper;

    .line 53
    .line 54
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedMeasurementInOther(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->b:I

    .line 59
    .line 60
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:Landroidx/recyclerview/widget/OrientationHelper;

    .line 61
    .line 62
    invoke-virtual {p2}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->a:I

    .line 67
    .line 68
    sub-int/2addr p2, v0

    .line 69
    div-int/lit8 p2, p2, 0x2

    .line 70
    .line 71
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->c:I

    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    sub-int/2addr p2, v0

    .line 82
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    sub-int/2addr p2, v0

    .line 87
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->b:I

    .line 88
    .line 89
    sub-int/2addr p2, v0

    .line 90
    div-int/lit8 p2, p2, 0x2

    .line 91
    .line 92
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d:I

    .line 93
    .line 94
    iget p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->a:I

    .line 95
    .line 96
    int-to-float v0, p2

    .line 97
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 98
    .line 99
    neg-int p2, p2

    .line 100
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:Landroidx/recyclerview/widget/OrientationHelper;

    .line 101
    .line 102
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    sub-int/2addr p2, v0

    .line 107
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->c:I

    .line 108
    .line 109
    sub-int/2addr p2, v0

    .line 110
    int-to-float p2, p2

    .line 111
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 112
    .line 113
    div-float/2addr p2, v0

    .line 114
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 115
    .line 116
    .line 117
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:Landroidx/recyclerview/widget/OrientationHelper;

    .line 118
    .line 119
    invoke-virtual {p2}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->c:I

    .line 124
    .line 125
    sub-int/2addr p2, v0

    .line 126
    int-to-float p2, p2

    .line 127
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 128
    .line 129
    div-float/2addr p2, v0

    .line 130
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 131
    .line 132
    .line 133
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 134
    .line 135
    if-eqz p2, :cond_3

    .line 136
    .line 137
    iget-boolean v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->c:Z

    .line 138
    .line 139
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 140
    .line 141
    iget v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->a:I

    .line 142
    .line 143
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 144
    .line 145
    iget p2, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->b:F

    .line 146
    .line 147
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 148
    .line 149
    :cond_3
    iget p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 150
    .line 151
    const/4 v0, -0x1

    .line 152
    if-eq p2, v0, :cond_5

    .line 153
    .line 154
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 155
    .line 156
    int-to-float p2, p2

    .line 157
    if-eqz v0, :cond_4

    .line 158
    .line 159
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 160
    .line 161
    neg-float v0, v0

    .line 162
    :goto_0
    mul-float/2addr p2, v0

    .line 163
    goto :goto_1

    .line 164
    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :goto_1
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 168
    .line 169
    :cond_5
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 173
    .line 174
    .line 175
    return-void
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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 9
    .line 10
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 6
    .line 7
    check-cast p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;)V

    .line 8
    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 17
    .line 18
    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->a:I

    .line 19
    .line 20
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 21
    .line 22
    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->b:F

    .line 23
    .line 24
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 25
    .line 26
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->c:Z

    .line 27
    .line 28
    return-object v0
.end method

.method public final scrollHorizontallyBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p3, :cond_a

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    :cond_0
    iget-object p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:Landroidx/recyclerview/widget/OrientationHelper;

    .line 13
    .line 14
    if-nez p3, :cond_1

    .line 15
    .line 16
    invoke-static {p0, v0}, Landroidx/recyclerview/widget/OrientationHelper;->createOrientationHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;I)Landroidx/recyclerview/widget/OrientationHelper;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    iput-object p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:Landroidx/recyclerview/widget/OrientationHelper;

    .line 21
    .line 22
    :cond_1
    int-to-float p3, p1

    .line 23
    const/high16 v1, 0x3f800000    # 1.0f

    .line 24
    .line 25
    div-float v2, p3, v1

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const v4, 0x322bcc77    # 1.0E-8f

    .line 32
    .line 33
    .line 34
    cmpg-float v3, v3, v4

    .line 35
    .line 36
    if-gez v3, :cond_2

    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_2
    iget v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 41
    .line 42
    add-float/2addr v3, v2

    .line 43
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    move v2, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    add-int/lit8 v2, v2, -0x1

    .line 55
    .line 56
    neg-int v2, v2

    .line 57
    int-to-float v2, v2

    .line 58
    iget v5, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 59
    .line 60
    mul-float/2addr v2, v5

    .line 61
    :goto_0
    cmpg-float v2, v3, v2

    .line 62
    .line 63
    if-gez v2, :cond_5

    .line 64
    .line 65
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 66
    .line 67
    if-nez p1, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    add-int/lit8 p1, p1, -0x1

    .line 75
    .line 76
    neg-int p1, p1

    .line 77
    int-to-float p1, p1

    .line 78
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 79
    .line 80
    mul-float v4, p1, v2

    .line 81
    .line 82
    :goto_1
    sub-float/2addr v3, v4

    .line 83
    mul-float/2addr v3, v1

    .line 84
    sub-float/2addr p3, v3

    .line 85
    float-to-int p1, p3

    .line 86
    goto :goto_3

    .line 87
    :cond_5
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 88
    .line 89
    if-nez p3, :cond_6

    .line 90
    .line 91
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    add-int/lit8 p3, p3, -0x1

    .line 96
    .line 97
    int-to-float p3, p3

    .line 98
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 99
    .line 100
    mul-float/2addr p3, v2

    .line 101
    goto :goto_2

    .line 102
    :cond_6
    move p3, v4

    .line 103
    :goto_2
    cmpl-float p3, v3, p3

    .line 104
    .line 105
    if-lez p3, :cond_8

    .line 106
    .line 107
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 108
    .line 109
    if-nez p1, :cond_7

    .line 110
    .line 111
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    add-int/lit8 p1, p1, -0x1

    .line 116
    .line 117
    int-to-float p1, p1

    .line 118
    iget p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 119
    .line 120
    mul-float v4, p1, p3

    .line 121
    .line 122
    :cond_7
    iget p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 123
    .line 124
    sub-float/2addr v4, p1

    .line 125
    mul-float/2addr v4, v1

    .line 126
    float-to-int p1, v4

    .line 127
    :cond_8
    :goto_3
    int-to-float p3, p1

    .line 128
    div-float/2addr p3, v1

    .line 129
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 130
    .line 131
    add-float/2addr v1, p3

    .line 132
    iput v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 133
    .line 134
    :goto_4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-ge v0, v1, :cond_9

    .line 139
    .line 140
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    iget v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->c:I

    .line 149
    .line 150
    sub-int/2addr v2, v3

    .line 151
    int-to-float v2, v2

    .line 152
    sub-float/2addr v2, p3

    .line 153
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->b(Landroid/view/View;F)V

    .line 154
    .line 155
    .line 156
    add-int/lit8 v0, v0, 0x1

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_9
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 160
    .line 161
    .line 162
    return p1

    .line 163
    :cond_a
    :goto_5
    return v0
.end method

.method public final scrollToPosition(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 4
    .line 5
    int-to-float p1, p1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 9
    .line 10
    neg-float v0, v0

    .line 11
    :goto_0
    mul-float/2addr p1, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final scrollVerticallyBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;I)V
    .locals 0

    .line 1
    new-instance p2, Landroidx/recyclerview/widget/LinearSmoothScroller;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/LinearSmoothScroller;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;->setTargetPosition(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
