.class public Lcom/xuexiang/xui/widget/layout/XUIButton;
.super Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;
.source "SourceFile"


# instance fields
.field public d:Lw8/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/layout/XUIButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/layout/XUIButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/layout/XUIButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 1
    new-instance v0, Lw8/a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p0}, Lw8/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;->setChangeAlphaWhenDisable(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;->setChangeAlphaWhenPress(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {v0, p1, v1, v2}, Lw8/a;->k(Landroid/graphics/Canvas;II)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lw8/a;->j(Landroid/graphics/Canvas;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public getHideRadiusSide()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw8/a;->m()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getRadius()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw8/a;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getShadowAlpha()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw8/a;->q()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getShadowColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw8/a;->r()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getShadowElevation()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw8/a;->s()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public onMeasure(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->o(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lw8/a;->n(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, p1, v1}, Lw8/a;->u(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1, p2, v2}, Lw8/a;->t(II)I

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->x(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setBorderWidth(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->y(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setBottomDividerAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->z(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setHideRadiusSide(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->A(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setLeftDividerAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->B(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOuterNormalColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->C(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOutlineExcludePadding(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->D(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setRadius(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->E(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setRightDividerAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->I(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setShadowAlpha(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->J(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShadowColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->K(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShadowElevation(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->M(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShowBorderOnlyBeforeL(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->N(Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setTopDividerAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/XUIButton;->d:Lw8/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw8/a;->O(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
