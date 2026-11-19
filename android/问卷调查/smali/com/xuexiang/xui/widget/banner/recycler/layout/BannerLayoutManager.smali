.class public Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$l;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;
    }
.end annotation


# instance fields
.field public A:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;

.field public B:F

.field public C:I

.field public D:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:F

.field public w:La/o/b/t;

.field public x:Z

.field public y:Z

.field public z:I


# virtual methods
.method public B0(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;

    check-cast p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->A:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->L0()V

    :cond_0
    return-void
.end method

.method public C0()Landroid/os/Parcelable;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->A:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;

    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;)V

    return-object v1

    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;-><init>()V

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->z:I

    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;->b:I

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    iput v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;->c:F

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->y:Z

    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;->d:Z

    return-object v0
.end method

.method public M0(ILandroidx/recyclerview/widget/RecyclerView$r;Landroidx/recyclerview/widget/RecyclerView$w;)I
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->f1(ILandroidx/recyclerview/widget/RecyclerView$r;)I

    move-result p1

    return p1
.end method

.method public N0(I)V
    .locals 1

    if-ltz p1, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_1

    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->z:I

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->y:Z

    int-to-float p1, p1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    neg-float v0, v0

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    :goto_0
    mul-float/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->L0()V

    :cond_2
    :goto_1
    return-void
.end method

.method public O0(ILandroidx/recyclerview/widget/RecyclerView$r;Landroidx/recyclerview/widget/RecyclerView$w;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public X0(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$w;I)V
    .locals 1

    int-to-float p2, p3

    .line 1
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->y:Z

    if-nez p3, :cond_0

    iget p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    goto :goto_0

    :cond_0
    iget p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    neg-float p3, p3

    :goto_0
    mul-float/2addr p2, p3

    iget p3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    sub-float/2addr p2, p3

    const p3, 0x7f7fffff    # Float.MAX_VALUE

    mul-float/2addr p2, p3

    float-to-int p2, p2

    const/4 p3, 0x0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->k0(IILandroid/view/animation/Interpolator;)V

    return-void
.end method

.method public final a1()I
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->y()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->y:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->b1()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result v0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->b1()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    return v0
.end method

.method public b1()I
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->c1()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    return v0
.end method

.method public final c1()I
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public d1()F
    .locals 2

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->y:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    mul-float/2addr v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e1()F
    .locals 2

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->y:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    neg-int v0, v0

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    mul-float/2addr v0, v1

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
    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    return-void
.end method

.method public final f1(ILandroidx/recyclerview/widget/RecyclerView$r;)I
    .locals 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->y()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    if-nez p1, :cond_0

    goto :goto_1

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->w:La/o/b/t;

    if-nez v0, :cond_1

    invoke-static {p0, v1}, La/o/b/t;->a(Landroidx/recyclerview/widget/RecyclerView$l;I)La/o/b/t;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->w:La/o/b/t;

    :cond_1
    int-to-float v0, p1

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    div-float v3, v0, v2

    .line 2
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const v5, 0x322bcc77    # 1.0E-8f

    cmpg-float v4, v4, v5

    if-gez v4, :cond_2

    return v1

    :cond_2
    iget v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    add-float/2addr v1, v3

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->e1()F

    move-result v3

    cmpg-float v3, v1, v3

    if-ltz v3, :cond_3

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d1()F

    move-result v0

    cmpl-float v0, v1, v0

    if-lez v0, :cond_4

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d1()F

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    sub-float/2addr p1, v0

    mul-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->e1()F

    move-result p1

    sub-float/2addr v1, p1

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    float-to-int p1, v0

    :cond_4
    :goto_0
    int-to-float p1, p1

    div-float/2addr p1, v2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    .line 3
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$l;->q(Landroidx/recyclerview/widget/RecyclerView$r;)V

    const/4 p1, 0x0

    throw p1

    :cond_5
    :goto_1
    return v1
.end method

.method public g0(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/ArrayList;II)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;II)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->b1()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->t(I)Landroid/view/View;

    const/4 p1, 0x1

    return p1
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

.method public k0(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$r;Landroidx/recyclerview/widget/RecyclerView$w;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public l(Landroidx/recyclerview/widget/RecyclerView$w;)I
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->a1()I

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

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->a1()I

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

.method public t(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->J()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    throw v0
.end method

.method public u()Landroidx/recyclerview/widget/RecyclerView$m;
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$m;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$m;-><init>(II)V

    return-object v0
.end method

.method public w0(Landroidx/recyclerview/widget/RecyclerView$r;Landroidx/recyclerview/widget/RecyclerView$w;)V
    .locals 4

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$w;->b()I

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->G0(Landroidx/recyclerview/widget/RecyclerView$r;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    return-void

    .line 1
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->w:La/o/b/t;

    const/4 v0, 0x0

    if-nez p2, :cond_1

    invoke-static {p0, v0}, La/o/b/t;->a(Landroidx/recyclerview/widget/RecyclerView$l;I)La/o/b/t;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->w:La/o/b/t;

    .line 2
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->K()I

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_2

    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->x:Z

    xor-int/2addr p2, v1

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->x:Z

    .line 3
    :cond_2
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$r;->e(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0, p2, v0, v0}, Landroidx/recyclerview/widget/RecyclerView$l;->c0(Landroid/view/View;II)V

    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->w:La/o/b/t;

    invoke-virtual {v2, p2}, La/o/b/t;->c(Landroid/view/View;)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->r:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->w:La/o/b/t;

    invoke-virtual {v2, p2}, La/o/b/t;->d(Landroid/view/View;)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->s:I

    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->w:La/o/b/t;

    invoke-virtual {p2}, La/o/b/t;->l()I

    move-result p2

    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->r:I

    sub-int/2addr p2, v2

    div-int/lit8 p2, p2, 0x2

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->t:I

    .line 4
    iget p2, p0, Landroidx/recyclerview/widget/RecyclerView$l;->q:I

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->Q()I

    move-result v2

    sub-int/2addr p2, v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->N()I

    move-result v2

    sub-int/2addr p2, v2

    .line 6
    iget v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->s:I

    sub-int/2addr p2, v2

    sub-int/2addr p2, v0

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->u:I

    .line 7
    iget p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->r:I

    int-to-float v2, p2

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v2, v3

    int-to-float v0, v0

    add-float/2addr v2, v0

    .line 8
    iput v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    neg-int p2, p2

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->w:La/o/b/t;

    invoke-virtual {v0}, La/o/b/t;->k()I

    move-result v0

    sub-int/2addr p2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->t:I

    sub-int/2addr p2, v0

    int-to-float p2, p2

    .line 10
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    div-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    float-to-int p2, p2

    add-int/2addr p2, v1

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->C:I

    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->w:La/o/b/t;

    invoke-virtual {p2}, La/o/b/t;->l()I

    move-result p2

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->t:I

    sub-int/2addr p2, v0

    int-to-float p2, p2

    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    div-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    float-to-int p2, p2

    add-int/2addr p2, v1

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->D:I

    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->A:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;

    if-eqz p2, :cond_3

    iget-boolean v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;->d:Z

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->y:Z

    iget v0, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;->b:I

    iput v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->z:I

    iget p2, p2, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;->c:F

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    :cond_3
    iget p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->z:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_5

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->y:Z

    int-to-float p2, p2

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    neg-float v0, v0

    goto :goto_0

    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->B:F

    :goto_0
    mul-float/2addr p2, v0

    iput p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->v:F

    :cond_5
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->q(Landroidx/recyclerview/widget/RecyclerView$r;)V

    .line 13
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->q(Landroidx/recyclerview/widget/RecyclerView$r;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public x0(Landroidx/recyclerview/widget/RecyclerView$w;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->A:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;

    const/4 p1, -0x1

    iput p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->z:I

    return-void
.end method
