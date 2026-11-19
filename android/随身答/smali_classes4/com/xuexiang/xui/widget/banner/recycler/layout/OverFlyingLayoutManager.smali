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
.field public a:F

.field public b:F

.field public c:I

.field public d:Z

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:F

.field public k:Landroidx/recyclerview/widget/OrientationHelper;

.field public l:Z

.field public m:Z

.field public n:I

.field public o:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

.field public p:F

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:I

.field public u:I

.field public v:I


# direct methods
.method private k()F
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

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
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

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

.method private l()F
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

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
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 16
    .line 17
    mul-float/2addr v0, v1

    .line 18
    return v0
.end method

.method private scrollBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p3, :cond_6

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->ensureLayoutState()V

    .line 13
    .line 14
    .line 15
    int-to-float p3, p1

    .line 16
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    div-float v1, p3, v1

    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const v3, 0x322bcc77    # 1.0E-8f

    .line 27
    .line 28
    .line 29
    cmpg-float v2, v2, v3

    .line 30
    .line 31
    if-gez v2, :cond_1

    .line 32
    .line 33
    return v0

    .line 34
    :cond_1
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 35
    .line 36
    add-float/2addr v2, v1

    .line 37
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d:Z

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l()F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    cmpg-float v1, v2, v1

    .line 46
    .line 47
    if-gez v1, :cond_2

    .line 48
    .line 49
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    sub-float/2addr v2, p1

    .line 54
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j()F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    mul-float/2addr v2, p1

    .line 59
    sub-float/2addr p3, v2

    .line 60
    float-to-int p1, p3

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d:Z

    .line 63
    .line 64
    if-nez p3, :cond_3

    .line 65
    .line 66
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->k()F

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    cmpl-float p3, v2, p3

    .line 71
    .line 72
    if-lez p3, :cond_3

    .line 73
    .line 74
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->k()F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iget p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 79
    .line 80
    sub-float/2addr p1, p3

    .line 81
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j()F

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    mul-float/2addr p1, p3

    .line 86
    float-to-int p1, p1

    .line 87
    :cond_3
    :goto_0
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->s:Z

    .line 88
    .line 89
    if-eqz p3, :cond_4

    .line 90
    .line 91
    int-to-float p3, p1

    .line 92
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j()F

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    div-float/2addr p3, v1

    .line 97
    float-to-int p3, p3

    .line 98
    int-to-float p3, p3

    .line 99
    goto :goto_1

    .line 100
    :cond_4
    int-to-float p3, p1

    .line 101
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j()F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    div-float/2addr p3, v1

    .line 106
    :goto_1
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 107
    .line 108
    add-float/2addr v1, p3

    .line 109
    iput v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 110
    .line 111
    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-ge v0, v1, :cond_5

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->u(Landroid/view/View;)F

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    sub-float/2addr v2, p3

    .line 126
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->r(Landroid/view/View;F)V

    .line 127
    .line 128
    .line 129
    add-int/lit8 v0, v0, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->q(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 133
    .line 134
    .line 135
    return p1

    .line 136
    :cond_6
    :goto_3
    return v0
.end method


# virtual methods
.method public A(Landroid/view/View;F)F
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getScaleX()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/high16 p2, 0x40a00000    # 5.0f

    .line 6
    .line 7
    mul-float/2addr p1, p2

    .line 8
    return p1
.end method

.method public final B()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public a(Landroid/view/View;F)I
    .locals 1

    .line 1
    iget p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1

    .line 8
    :cond_0
    float-to-int p1, p2

    .line 9
    return p1
.end method

.method public b(Landroid/view/View;F)I
    .locals 1

    .line 1
    iget p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    float-to-int p1, p2

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method

.method public final c(F)F
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->b:F

    .line 2
    .line 3
    neg-float v0, v0

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 5
    .line 6
    div-float/2addr v0, v1

    .line 7
    mul-float/2addr v0, p1

    .line 8
    return v0
.end method

.method public canScrollHorizontally()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public canScrollVertically()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public computeHorizontalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public computeHorizontalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public computeHorizontalScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public computeScrollVectorForPosition(I)Landroid/graphics/PointF;
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
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

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
    :goto_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    div-float/2addr p1, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    new-instance v0, Landroid/graphics/PointF;

    .line 44
    .line 45
    invoke-direct {v0, p1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_3
    new-instance v0, Landroid/graphics/PointF;

    .line 50
    .line 51
    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public computeVerticalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public computeVerticalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public computeVerticalScrollRange(Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final d(F)F
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->k:Landroidx/recyclerview/widget/OrientationHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    int-to-float v0, v0

    .line 11
    const/high16 v1, 0x40000000    # 2.0f

    .line 12
    .line 13
    div-float/2addr v0, v1

    .line 14
    sub-float/2addr p1, v0

    .line 15
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->a:F

    .line 20
    .line 21
    const/high16 v2, 0x3f800000    # 1.0f

    .line 22
    .line 23
    sub-float/2addr v0, v2

    .line 24
    mul-float/2addr v0, p1

    .line 25
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->k:Landroidx/recyclerview/widget/OrientationHelper;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    int-to-float p1, p1

    .line 32
    div-float/2addr p1, v1

    .line 33
    div-float/2addr v0, p1

    .line 34
    add-float/2addr v0, v2

    .line 35
    return v0
.end method

.method public final e()I
    .locals 1

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
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->m:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 16
    .line 17
    float-to-int v0, v0

    .line 18
    return v0
.end method

.method public ensureLayoutState()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->k:Landroidx/recyclerview/widget/OrientationHelper;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 6
    .line 7
    invoke-static {p0, v0}, Landroidx/recyclerview/widget/OrientationHelper;->createOrientationHelper(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;I)Landroidx/recyclerview/widget/OrientationHelper;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->k:Landroidx/recyclerview/widget/OrientationHelper;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final f()I
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
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->m:Z

    .line 10
    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    sub-int/2addr v0, v1

    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->m()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 39
    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    float-to-int v0, v0

    .line 43
    return v0

    .line 44
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/lit8 v1, v1, -0x1

    .line 49
    .line 50
    int-to-float v1, v1

    .line 51
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 52
    .line 53
    mul-float/2addr v1, v2

    .line 54
    add-float/2addr v1, v0

    .line 55
    float-to-int v0, v1

    .line 56
    return v0
.end method

.method public final g()I
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
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->m:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

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
    int-to-float v0, v0

    .line 23
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 24
    .line 25
    mul-float/2addr v0, v1

    .line 26
    float-to-int v0, v0

    .line 27
    return v0
.end method

.method public generateDefaultLayoutParams()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
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

.method public getOrientation()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public h()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 15
    .line 16
    if-nez v1, :cond_2

    .line 17
    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    rem-int/2addr v0, v1

    .line 25
    return v0

    .line 26
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    rem-int/2addr v0, v2

    .line 35
    add-int/2addr v1, v0

    .line 36
    return v1

    .line 37
    :cond_2
    if-lez v0, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    rem-int/2addr v0, v2

    .line 48
    sub-int/2addr v1, v0

    .line 49
    return v1

    .line 50
    :cond_3
    neg-int v0, v0

    .line 51
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    rem-int/2addr v0, v1

    .line 56
    return v0
.end method

.method public final i()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 4
    .line 5
    div-float/2addr v0, v1

    .line 6
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public j()F
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final m()F
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 11
    .line 12
    cmpg-float v1, v0, v1

    .line 13
    .line 14
    if-gtz v1, :cond_0

    .line 15
    .line 16
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    int-to-float v2, v2

    .line 23
    mul-float/2addr v1, v2

    .line 24
    rem-float/2addr v0, v1

    .line 25
    return v0

    .line 26
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 32
    .line 33
    neg-float v2, v1

    .line 34
    mul-float/2addr v0, v2

    .line 35
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    int-to-float v3, v3

    .line 42
    mul-float/2addr v1, v3

    .line 43
    rem-float/2addr v2, v1

    .line 44
    add-float/2addr v0, v2

    .line 45
    return v0

    .line 46
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 47
    .line 48
    return v0

    .line 49
    :cond_2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d:Z

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 54
    .line 55
    cmpl-float v1, v0, v1

    .line 56
    .line 57
    if-ltz v1, :cond_3

    .line 58
    .line 59
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    int-to-float v2, v2

    .line 66
    mul-float/2addr v1, v2

    .line 67
    rem-float/2addr v0, v1

    .line 68
    return v0

    .line 69
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    int-to-float v0, v0

    .line 74
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 75
    .line 76
    mul-float/2addr v0, v1

    .line 77
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 78
    .line 79
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    int-to-float v3, v3

    .line 84
    mul-float/2addr v1, v3

    .line 85
    rem-float/2addr v2, v1

    .line 86
    add-float/2addr v0, v2

    .line 87
    return v0

    .line 88
    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 89
    .line 90
    return v0
.end method

.method public n()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 11
    .line 12
    mul-float/2addr v0, v1

    .line 13
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 14
    .line 15
    sub-float/2addr v0, v1

    .line 16
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    mul-float/2addr v0, v1

    .line 21
    float-to-int v0, v0

    .line 22
    return v0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-float v0, v0

    .line 28
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 36
    .line 37
    neg-float v1, v1

    .line 38
    :goto_1
    mul-float/2addr v0, v1

    .line 39
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 40
    .line 41
    sub-float/2addr v0, v1

    .line 42
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j()F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_0
.end method

.method public final o(I)F
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 2
    .line 3
    int-to-float p1, p1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 7
    .line 8
    neg-float v0, v0

    .line 9
    :goto_0
    mul-float/2addr p1, v0

    .line 10
    return p1

    .line 11
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 12
    .line 13
    goto :goto_0
.end method

.method public onAdapterChanged(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 6
    .line 7
    return-void
.end method

.method public onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$Recycler;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->q:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->removeAndRecycleAllViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$Recycler;->clear()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public onLayoutChildren(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 1

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
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->ensureLayoutState()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->resolveShouldLayoutReverse()V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Recycler;->getViewForPosition(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0, p2, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->k:Landroidx/recyclerview/widget/OrientationHelper;

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedMeasurement(Landroid/view/View;)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:I

    .line 35
    .line 36
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->k:Landroidx/recyclerview/widget/OrientationHelper;

    .line 37
    .line 38
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/OrientationHelper;->getDecoratedMeasurementInOther(Landroid/view/View;)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:I

    .line 43
    .line 44
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->k:Landroidx/recyclerview/widget/OrientationHelper;

    .line 45
    .line 46
    invoke-virtual {p2}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:I

    .line 51
    .line 52
    sub-int/2addr p2, v0

    .line 53
    div-int/lit8 p2, p2, 0x2

    .line 54
    .line 55
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:I

    .line 62
    .line 63
    sub-int/2addr p2, v0

    .line 64
    div-int/lit8 p2, p2, 0x2

    .line 65
    .line 66
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i:I

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x()F

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->z()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->t()F

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 82
    .line 83
    div-float/2addr p2, v0

    .line 84
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    float-to-int p2, p2

    .line 89
    add-int/lit8 p2, p2, 0x1

    .line 90
    .line 91
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->t:I

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->s()F

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 98
    .line 99
    div-float/2addr p2, v0

    .line 100
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    float-to-int p2, p2

    .line 105
    add-int/lit8 p2, p2, 0x1

    .line 106
    .line 107
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->u:I

    .line 108
    .line 109
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->o:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 110
    .line 111
    if-eqz p2, :cond_1

    .line 112
    .line 113
    iget-boolean v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->c:Z

    .line 114
    .line 115
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 116
    .line 117
    iget v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->a:I

    .line 118
    .line 119
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->n:I

    .line 120
    .line 121
    iget p2, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->b:F

    .line 122
    .line 123
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 124
    .line 125
    :cond_1
    iget p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->n:I

    .line 126
    .line 127
    const/4 v0, -0x1

    .line 128
    if-eq p2, v0, :cond_3

    .line 129
    .line 130
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 131
    .line 132
    int-to-float p2, p2

    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 136
    .line 137
    neg-float v0, v0

    .line 138
    :goto_0
    mul-float/2addr p2, v0

    .line 139
    goto :goto_1

    .line 140
    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :goto_1
    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 144
    .line 145
    :cond_3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->q(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$State;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->o:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->n:I

    .line 9
    .line 10
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
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
    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->o:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->o:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->o:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;-><init>()V

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->n:I

    .line 19
    .line 20
    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->a:I

    .line 21
    .line 22
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 23
    .line 24
    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->b:F

    .line 25
    .line 26
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 27
    .line 28
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$SavedState;->c:Z

    .line 29
    .line 30
    return-object v0
.end method

.method public p()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    :goto_0
    sub-int/2addr v0, v1

    .line 19
    return v0

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingLeft()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    sub-int/2addr v0, v1

    .line 29
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingRight()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    goto :goto_0
.end method

.method public final q(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$Recycler;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    neg-int v0, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->t:I

    .line 19
    .line 20
    sub-int v1, v0, v1

    .line 21
    .line 22
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->u:I

    .line 23
    .line 24
    add-int/2addr v2, v0

    .line 25
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->B()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:I

    .line 32
    .line 33
    rem-int/lit8 v2, v1, 0x2

    .line 34
    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    div-int/lit8 v1, v1, 0x2

    .line 38
    .line 39
    sub-int v2, v0, v1

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    :goto_1
    add-int/2addr v0, v1

    .line 44
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    move v1, v2

    .line 47
    move v2, v0

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    add-int/lit8 v1, v1, -0x1

    .line 50
    .line 51
    div-int/lit8 v1, v1, 0x2

    .line 52
    .line 53
    sub-int v2, v0, v1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d:Z

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    if-nez v3, :cond_5

    .line 64
    .line 65
    if-gez v1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->B()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:I

    .line 74
    .line 75
    :cond_3
    move v1, v4

    .line 76
    :cond_4
    if-le v2, v0, :cond_5

    .line 77
    .line 78
    move v2, v0

    .line 79
    :cond_5
    const/4 v3, 0x1

    .line 80
    :goto_3
    if-ge v1, v2, :cond_d

    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->B()Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-nez v5, :cond_6

    .line 87
    .line 88
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->o(I)F

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    iget v6, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 93
    .line 94
    sub-float/2addr v5, v6

    .line 95
    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v(F)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-nez v5, :cond_c

    .line 100
    .line 101
    :cond_6
    if-lt v1, v0, :cond_7

    .line 102
    .line 103
    rem-int v5, v1, v0

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_7
    if-gez v1, :cond_9

    .line 107
    .line 108
    neg-int v5, v1

    .line 109
    rem-int/2addr v5, v0

    .line 110
    if-nez v5, :cond_8

    .line 111
    .line 112
    move v5, v0

    .line 113
    :cond_8
    sub-int v5, v0, v5

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_9
    move v5, v1

    .line 117
    :goto_4
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView$Recycler;->getViewForPosition(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {p0, v6, v4, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w(Landroid/view/View;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->o(I)F

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    iget v8, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 132
    .line 133
    sub-float/2addr v7, v8

    .line 134
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->r(Landroid/view/View;F)V

    .line 135
    .line 136
    .line 137
    iget-boolean v8, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->r:Z

    .line 138
    .line 139
    if-eqz v8, :cond_a

    .line 140
    .line 141
    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A(Landroid/view/View;F)F

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    goto :goto_5

    .line 146
    :cond_a
    int-to-float v5, v5

    .line 147
    :goto_5
    cmpl-float v3, v5, v3

    .line 148
    .line 149
    if-lez v3, :cond_b

    .line 150
    .line 151
    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_b
    invoke-virtual {p0, v6, v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->addView(Landroid/view/View;I)V

    .line 156
    .line 157
    .line 158
    :goto_6
    move v3, v5

    .line 159
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_d
    return-void
.end method

.method public final r(Landroid/view/View;F)V
    .locals 7

    .line 1
    invoke-virtual/range {p0 .. p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->a(Landroid/view/View;F)I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    invoke-virtual/range {p0 .. p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->b(Landroid/view/View;F)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-ne v3, v4, :cond_0

    .line 13
    .line 14
    iget v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i:I

    .line 15
    .line 16
    move v4, v2

    .line 17
    add-int v2, v3, v1

    .line 18
    .line 19
    iget v5, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 20
    .line 21
    move v6, v3

    .line 22
    add-int v3, v5, v4

    .line 23
    .line 24
    add-int/2addr v1, v6

    .line 25
    iget v6, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:I

    .line 26
    .line 27
    add-int/2addr v1, v6

    .line 28
    add-int/2addr v5, v4

    .line 29
    iget v4, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:I

    .line 30
    .line 31
    add-int/2addr v5, v4

    .line 32
    move-object v0, p0

    .line 33
    move v4, v1

    .line 34
    move-object v1, p1

    .line 35
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->layoutDecorated(Landroid/view/View;IIII)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v4, v2

    .line 40
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 41
    .line 42
    move v3, v2

    .line 43
    add-int v2, v3, v1

    .line 44
    .line 45
    iget v5, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i:I

    .line 46
    .line 47
    move v6, v3

    .line 48
    add-int v3, v5, v4

    .line 49
    .line 50
    add-int/2addr v1, v6

    .line 51
    iget v6, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:I

    .line 52
    .line 53
    add-int/2addr v1, v6

    .line 54
    add-int/2addr v5, v4

    .line 55
    iget v4, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f:I

    .line 56
    .line 57
    add-int/2addr v5, v4

    .line 58
    move-object v0, p0

    .line 59
    move v4, v1

    .line 60
    move-object v1, p1

    .line 61
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->layoutDecorated(Landroid/view/View;IIII)V

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-virtual/range {p0 .. p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->y(Landroid/view/View;F)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final resolveShouldLayoutReverse()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getLayoutDirection()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 13
    .line 14
    xor-int/2addr v0, v1

    .line 15
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public s()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->k:Landroidx/recyclerview/widget/OrientationHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/OrientationHelper;->getTotalSpace()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    int-to-float v0, v0

    .line 11
    return v0
.end method

.method public scrollHorizontallyBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public scrollToPosition(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->n:I

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->l:Z

    .line 4
    .line 5
    int-to-float p1, p1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

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
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->p:F

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->requestLayout()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public scrollVerticallyBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;I)V
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

.method public t()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:I

    .line 2
    .line 3
    neg-int v0, v0

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->k:Landroidx/recyclerview/widget/OrientationHelper;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/recyclerview/widget/OrientationHelper;->getStartAfterPadding()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    sub-int/2addr v0, v1

    .line 11
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 12
    .line 13
    sub-int/2addr v0, v1

    .line 14
    int-to-float v0, v0

    .line 15
    return v0
.end method

.method public u(Landroid/view/View;)F
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 11
    .line 12
    :goto_0
    sub-int/2addr p1, v0

    .line 13
    int-to-float p1, p1

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 20
    .line 21
    goto :goto_0
.end method

.method public final v(F)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->s()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    cmpl-float v0, p1, v0

    .line 6
    .line 7
    if-gtz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->t()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    cmpg-float p1, p1, v0

    .line 14
    .line 15
    if-gez p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    return p1
.end method

.method public final w(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotation(F)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotationY(F)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotationX(F)V

    .line 9
    .line 10
    .line 11
    const/high16 v0, 0x3f800000    # 1.0f

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public x()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:I

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->c:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    int-to-float v0, v0

    .line 7
    return v0
.end method

.method public y(Landroid/view/View;F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    add-float/2addr v0, p2

    .line 5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d(F)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setElevation(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->c(F)F

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getOrientation()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/view/View;->setRotationY(F)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    neg-float p2, p2

    .line 34
    invoke-virtual {p1, p2}, Landroid/view/View;->setRotationX(F)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public z()V
    .locals 0

    .line 1
    return-void
.end method
