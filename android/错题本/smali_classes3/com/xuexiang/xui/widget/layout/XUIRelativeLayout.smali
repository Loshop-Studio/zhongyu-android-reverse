.class public Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;
.super Lcom/xuexiang/xui/widget/alpha/XUIAlphaRelativeLayout;
.source "SourceFile"


# instance fields
.field public final b:Lz2/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaRelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Lz2/c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2, p0}, Lz2/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 3
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaRelativeLayout;->setChangeAlphaWhenDisable(Z)V

    .line 4
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaRelativeLayout;->setChangeAlphaWhenPress(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    new-instance v0, Lz2/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1, p0}, Lz2/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 7
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaRelativeLayout;->setChangeAlphaWhenDisable(Z)V

    .line 8
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaRelativeLayout;->setChangeAlphaWhenPress(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    new-instance v0, Lz2/c;

    invoke-direct {v0, p1, p2, p3, p0}, Lz2/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaRelativeLayout;->setChangeAlphaWhenDisable(Z)V

    .line 12
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaRelativeLayout;->setChangeAlphaWhenPress(Z)V

    return-void
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 13
    .line 14
    invoke-virtual {v2, p1, v0, v1}, Lz2/c;->b(Landroid/graphics/Canvas;II)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lz2/c;->a(Landroid/graphics/Canvas;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public getHideRadiusSide()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iget v0, v0, Lz2/c;->B:I

    .line 4
    .line 5
    return v0
.end method

.method public getRadius()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iget v0, v0, Lz2/c;->A:I

    .line 4
    .line 5
    return v0
.end method

.method public getShadowAlpha()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iget v0, v0, Lz2/c;->M:F

    .line 4
    .line 5
    return v0
.end method

.method public getShadowColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iget v0, v0, Lz2/c;->N:I

    .line 4
    .line 5
    return v0
.end method

.method public getShadowElevation()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iget v0, v0, Lz2/c;->L:I

    .line 4
    .line 5
    return v0
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz2/c;->d(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lz2/c;->c(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, p1, v1}, Lz2/c;->f(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1, p2, v2}, Lz2/c;->e(II)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-ne p1, v0, :cond_1

    .line 37
    .line 38
    if-eq p2, v1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void

    .line 42
    :cond_1
    :goto_0
    invoke-super {p0, v0, v1}, Landroid/view/View;->onMeasure(II)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public setBorderColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iput p1, v0, Lz2/c;->E:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBorderWidth(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iput p1, v0, Lz2/c;->F:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBottomDividerAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iput p1, v0, Lz2/c;->n:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setHideRadiusSide(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz2/c;->h(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLeftDividerAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iput p1, v0, Lz2/c;->s:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setOuterNormalColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz2/c;->i(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOutlineExcludePadding(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz2/c;->j(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setRadius(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz2/c;->k(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setRightDividerAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iput p1, v0, Lz2/c;->x:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setShadowAlpha(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz2/c;->m(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShadowColor(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iget v1, v0, Lz2/c;->N:I

    .line 4
    .line 5
    if-ne v1, p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iput p1, v0, Lz2/c;->N:I

    .line 9
    .line 10
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x1c

    .line 13
    .line 14
    if-lt v1, v2, :cond_2

    .line 15
    .line 16
    iget-object v0, v0, Lz2/c;->H:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/view/View;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {v0, p1}, Landroidx/activity/j;->B(Landroid/view/View;I)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, p1}, Landroidx/activity/j;->u(Landroid/view/View;I)V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_0
    return-void
.end method

.method public setShadowElevation(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iget v1, v0, Lz2/c;->L:I

    .line 4
    .line 5
    if-ne v1, p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput p1, v0, Lz2/c;->L:I

    .line 9
    .line 10
    invoke-virtual {v0}, Lz2/c;->g()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setShowBorderOnlyBeforeL(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iput-boolean p1, v0, Lz2/c;->K:Z

    .line 4
    .line 5
    invoke-virtual {v0}, Lz2/c;->g()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTopDividerAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIRelativeLayout;->b:Lz2/c;

    .line 2
    .line 3
    iput p1, v0, Lz2/c;->i:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
