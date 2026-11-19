.class public Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$l;
.source ""

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$v$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;
    }
.end annotation


# instance fields
.field public A:F

.field public B:I

.field public C:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:F

.field public w:La/o/b/t;

.field public x:Z

.field public y:I

.field public z:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;


# virtual methods
.method public B0(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;

    check-cast p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->z:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->L0()V

    :cond_0
    return-void
.end method

.method public C0()Landroid/os/Parcelable;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->z:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;

    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;)V

    return-object v1

    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;-><init>()V

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->y:I

    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;->b:I

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;->c:F

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;->d:Z

    return-object v0
.end method

.method public M0(ILandroidx/recyclerview/widget/RecyclerView$r;Landroidx/recyclerview/widget/RecyclerView$w;)I
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->i1(ILandroidx/recyclerview/widget/RecyclerView$r;)I

    move-result p1

    return p1
.end method

.method public N0(I)V
    .locals 1

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->y:I

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    int-to-float p1, p1

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    neg-float v0, v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    :goto_0
    mul-float/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->L0()V

    return-void
.end method

.method public O0(ILandroidx/recyclerview/widget/RecyclerView$r;Landroidx/recyclerview/widget/RecyclerView$w;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public X0(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$w;I)V
    .locals 0

    new-instance p2, La/o/b/o;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, La/o/b/o;-><init>(Landroid/content/Context;)V

    .line 1
    iput p3, p2, Landroidx/recyclerview/widget/RecyclerView$v;->a:I

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$l;->Y0(Landroidx/recyclerview/widget/RecyclerView$v;)V

    return-void
.end method

.method public a(I)Landroid/graphics/PointF;
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->y()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$l;->x(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$l;->R(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x1

    if-ge p1, v1, :cond_1

    move v0, v2

    :cond_1
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    xor-int/2addr p1, v2

    if-ne v0, p1, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    goto :goto_0

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    new-instance v0, Landroid/graphics/PointF;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public a1(F)I
    .locals 0

    float-to-int p1, p1

    return p1
.end method

.method public b1(F)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final c1()I
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->y()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    if-nez v0, :cond_1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d1()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    goto :goto_0

    .line 2
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result v0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d1()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    return v0
.end method

.method public final d1()I
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final e1()F
    .locals 2

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    mul-float/2addr v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f0(Landroidx/recyclerview/widget/RecyclerView$d;Landroidx/recyclerview/widget/RecyclerView$d;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->y()I

    move-result p1

    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_0

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$l;->a:La/o/b/b;

    invoke-virtual {p2, p1}, La/o/b/b;->l(I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    return-void
.end method

.method public final f1()F
    .locals 2

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    neg-int v0, v0

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    mul-float/2addr v0, v1

    :goto_0
    return v0
.end method

.method public final g1(Landroidx/recyclerview/widget/RecyclerView$r;)V
    .locals 9

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->q(Landroidx/recyclerview/widget/RecyclerView$r;)V

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d1()I

    move-result v0

    neg-int v0, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->d1()I

    move-result v0

    :goto_0
    const/4 v1, 0x0

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result v2

    if-gez v0, :cond_1

    move v0, v1

    :cond_1
    move v3, v0

    if-le v0, v2, :cond_2

    move v0, v2

    :cond_2
    const/4 v4, 0x1

    :goto_1
    if-ge v3, v0, :cond_8

    if-lt v3, v2, :cond_3

    rem-int v5, v3, v2

    goto :goto_2

    :cond_3
    if-gez v3, :cond_5

    neg-int v5, v3

    rem-int/2addr v5, v2

    if-nez v5, :cond_4

    move v5, v2

    :cond_4
    sub-int v5, v2, v5

    goto :goto_2

    :cond_5
    move v5, v3

    :goto_2
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView$r;->e(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {p0, v6, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$l;->c0(Landroid/view/View;II)V

    const/4 v7, 0x0

    .line 1
    invoke-virtual {v6, v7}, Landroid/view/View;->setRotation(F)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setRotationY(F)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setRotationX(F)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v6, v7}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setScaleY(F)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setAlpha(F)V

    .line 2
    iget-boolean v7, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    int-to-float v8, v3

    if-eqz v7, :cond_6

    iget v7, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    neg-float v7, v7

    goto :goto_3

    :cond_6
    iget v7, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    :goto_3
    mul-float/2addr v8, v7

    .line 3
    iget v7, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    sub-float/2addr v8, v7

    invoke-virtual {p0, v6, v8}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h1(Landroid/view/View;F)V

    int-to-float v5, v5

    cmpl-float v4, v5, v4

    if-lez v4, :cond_7

    const/4 v4, -0x1

    .line 4
    invoke-virtual {p0, v6, v4, v1}, Landroidx/recyclerview/widget/RecyclerView$l;->c(Landroid/view/View;IZ)V

    goto :goto_4

    .line 5
    :cond_7
    invoke-virtual {p0, v6, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$l;->c(Landroid/view/View;IZ)V

    :goto_4
    add-int/lit8 v3, v3, 0x1

    move v4, v5

    goto :goto_1

    :cond_8
    return-void
.end method

.method public final h1(Landroid/view/View;F)V
    .locals 9

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->a1(F)I

    move-result v0

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->b1(F)I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->t:I

    add-int v5, v2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->u:I

    add-int v6, v0, v1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->r:I

    add-int v7, v5, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->s:I

    add-int v8, v6, v0

    move-object v3, p0

    move-object v4, p1

    invoke-virtual/range {v3 .. v8}, Landroidx/recyclerview/widget/RecyclerView$l;->a0(Landroid/view/View;IIII)V

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->t:I

    int-to-float v0, v0

    add-float/2addr v0, p2

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w:La/o/b/t;

    invoke-virtual {v1}, La/o/b/t;->l()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->r:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w:La/o/b/t;

    invoke-virtual {v1}, La/o/b/t;->l()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v2

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setElevation(F)V

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    const/high16 v1, -0x80000000

    div-float/2addr v1, v0

    mul-float/2addr v1, p2

    .line 5
    invoke-virtual {p1, v1}, Landroid/view/View;->setRotationY(F)V

    return-void
.end method

.method public final i1(ILandroidx/recyclerview/widget/RecyclerView$r;)I
    .locals 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->y()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    if-nez p1, :cond_0

    goto :goto_2

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w:La/o/b/t;

    if-nez v0, :cond_1

    invoke-static {p0, v1}, La/o/b/t;->a(Landroidx/recyclerview/widget/RecyclerView$l;I)La/o/b/t;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w:La/o/b/t;

    :cond_1
    int-to-float v0, p1

    const/high16 v2, 0x3f800000    # 1.0f

    div-float v3, v0, v2

    .line 2
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const v5, 0x322bcc77    # 1.0E-8f

    cmpg-float v4, v4, v5

    if-gez v4, :cond_2

    return v1

    :cond_2
    iget v4, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    add-float/2addr v4, v3

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f1()F

    move-result v3

    cmpg-float v3, v4, v3

    if-gez v3, :cond_3

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->f1()F

    move-result p1

    sub-float/2addr v4, p1

    mul-float/2addr v4, v2

    sub-float/2addr v0, v4

    float-to-int p1, v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e1()F

    move-result v0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_4

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e1()F

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    sub-float/2addr p1, v0

    mul-float/2addr p1, v2

    float-to-int p1, p1

    :cond_4
    :goto_0
    int-to-float v0, p1

    div-float/2addr v0, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    add-float/2addr v2, v0

    iput v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->y()I

    move-result v2

    if-ge v1, v2, :cond_5

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$l;->x(I)Landroid/view/View;

    move-result-object v2

    .line 3
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->t:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    sub-float/2addr v3, v0

    .line 4
    invoke-virtual {p0, v2, v3}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->h1(Landroid/view/View;F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g1(Landroidx/recyclerview/widget/RecyclerView$r;)V

    return p1

    :cond_6
    :goto_2
    return v1
.end method

.method public j0(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$r;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->i0()V

    return-void
.end method

.method public k(Landroidx/recyclerview/widget/RecyclerView$w;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->y()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public l(Landroidx/recyclerview/widget/RecyclerView$w;)I
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->c1()I

    move-result p1

    return p1
.end method

.method public m(Landroidx/recyclerview/widget/RecyclerView$w;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->y()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result p1

    :goto_0
    return p1
.end method

.method public n(Landroidx/recyclerview/widget/RecyclerView$w;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->y()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public o(Landroidx/recyclerview/widget/RecyclerView$w;)I
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->c1()I

    move-result p1

    return p1
.end method

.method public p(Landroidx/recyclerview/widget/RecyclerView$w;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->y()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result p1

    :goto_0
    return p1
.end method

.method public u()Landroidx/recyclerview/widget/RecyclerView$m;
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$m;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$m;-><init>(II)V

    return-object v0
.end method

.method public w0(Landroidx/recyclerview/widget/RecyclerView$r;Landroidx/recyclerview/widget/RecyclerView$w;)V
    .locals 2

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$w;->b()I

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->G0(Landroidx/recyclerview/widget/RecyclerView$r;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    return-void

    .line 1
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w:La/o/b/t;

    const/4 v0, 0x0

    if-nez p2, :cond_1

    invoke-static {p0, v0}, La/o/b/t;->a(Landroidx/recyclerview/widget/RecyclerView$l;I)La/o/b/t;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w:La/o/b/t;

    .line 2
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->K()I

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_2

    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    xor-int/2addr p2, v1

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    .line 3
    :cond_2
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$r;->e(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0, p2, v0, v0}, Landroidx/recyclerview/widget/RecyclerView$l;->c0(Landroid/view/View;II)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w:La/o/b/t;

    invoke-virtual {v0, p2}, La/o/b/t;->c(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->r:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w:La/o/b/t;

    invoke-virtual {v0, p2}, La/o/b/t;->d(Landroid/view/View;)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->s:I

    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w:La/o/b/t;

    invoke-virtual {p2}, La/o/b/t;->l()I

    move-result p2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->r:I

    sub-int/2addr p2, v0

    div-int/lit8 p2, p2, 0x2

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->t:I

    .line 4
    iget p2, p0, Landroidx/recyclerview/widget/RecyclerView$l;->q:I

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->Q()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->N()I

    move-result v0

    sub-int/2addr p2, v0

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->s:I

    sub-int/2addr p2, v0

    div-int/lit8 p2, p2, 0x2

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->u:I

    .line 7
    iget p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->r:I

    add-int/lit8 v0, p2, 0x0

    int-to-float v0, v0

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    neg-int p2, p2

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w:La/o/b/t;

    invoke-virtual {v0}, La/o/b/t;->k()I

    move-result v0

    sub-int/2addr p2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->t:I

    sub-int/2addr p2, v0

    int-to-float p2, p2

    .line 10
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    div-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    float-to-int p2, p2

    add-int/2addr p2, v1

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->B:I

    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->w:La/o/b/t;

    invoke-virtual {p2}, La/o/b/t;->l()I

    move-result p2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->t:I

    sub-int/2addr p2, v0

    int-to-float p2, p2

    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    div-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    float-to-int p2, p2

    add-int/2addr p2, v1

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->C:I

    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->z:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;

    if-eqz p2, :cond_3

    iget-boolean v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;->d:Z

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    iget v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;->b:I

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->y:I

    iget p2, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;->c:F

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    :cond_3
    iget p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->y:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_5

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->x:Z

    int-to-float p2, p2

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    neg-float v0, v0

    goto :goto_0

    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->A:F

    :goto_0
    mul-float/2addr p2, v0

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->v:F

    :cond_5
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->q(Landroidx/recyclerview/widget/RecyclerView$r;)V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g1(Landroidx/recyclerview/widget/RecyclerView$r;)V

    return-void
.end method

.method public x0(Landroidx/recyclerview/widget/RecyclerView$w;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->z:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$a;

    const/4 p1, -0x1

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->y:I

    return-void
.end method
