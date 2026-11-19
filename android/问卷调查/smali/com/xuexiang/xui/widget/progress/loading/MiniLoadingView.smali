.class public Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;
.super Landroid/view/View;
.source ""


# instance fields
.field public b:I

.field public c:I

.field public d:I

.field public e:Landroid/animation/ValueAnimator;

.field public f:Landroid/graphics/Paint;

.field public g:Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const v0, 0x7f04000c

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v1, 0x0

    iput v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:I

    new-instance v2, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$a;

    invoke-direct {v2, p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$a;-><init>(Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;)V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->g:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lb/c/a/b;->h:[I

    invoke-virtual {v2, p2, v3, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const/high16 v0, 0x42000000    # 32.0f

    invoke-static {p1, v0}, Lb/c/a/a;->h(Landroid/content/Context;F)I

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    const/4 p1, -0x1

    invoke-virtual {p2, v1, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->c:I

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 3
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Landroid/graphics/Paint;

    iget p2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->c:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->g:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x258

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/animation/ValueAnimator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/animation/ValueAnimator;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-void

    :array_0
    .array-data 4
        0x0
        0xb
    .end array-data
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->g:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/animation/ValueAnimator;

    :cond_0
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v4, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v5, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1f

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:I

    mul-int/lit8 v1, v1, 0x1e

    .line 1
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    div-int/lit8 v3, v2, 0xc

    div-int/lit8 v2, v2, 0x6

    iget-object v4, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Landroid/graphics/Paint;

    int-to-float v3, v3

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    int-to-float v1, v1

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    invoke-virtual {p1, v1, v4, v4}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    int-to-float v1, v1

    div-float/2addr v1, v5

    invoke-virtual {p1, v1, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/4 v1, 0x0

    :goto_0
    const/16 v4, 0xc

    if-ge v1, v4, :cond_0

    const/high16 v4, 0x41f00000    # 30.0f

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    iget-object v4, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Landroid/graphics/Paint;

    const/high16 v6, 0x437f0000    # 255.0f

    add-int/lit8 v1, v1, 0x1

    int-to-float v7, v1

    mul-float/2addr v7, v6

    const/high16 v6, 0x41400000    # 12.0f

    div-float/2addr v7, v6

    float-to-int v6, v7

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    neg-int v4, v4

    int-to-float v4, v4

    div-float/2addr v4, v5

    div-float v6, v3, v5

    add-float/2addr v4, v6

    const/4 v7, 0x0

    invoke-virtual {p1, v7, v4}, Landroid/graphics/Canvas;->translate(FF)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    int-to-float v12, v2

    iget-object v13, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Landroid/graphics/Paint;

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    int-to-float v4, v4

    div-float/2addr v4, v5

    sub-float/2addr v4, v6

    invoke-virtual {p1, v7, v4}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    iget p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b()V

    :goto_0
    return-void
.end method

.method public setColor(I)V
    .locals 1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->c:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setSize(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
