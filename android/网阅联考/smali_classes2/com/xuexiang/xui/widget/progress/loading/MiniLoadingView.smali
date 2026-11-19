.class public Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Landroid/animation/ValueAnimator;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/R$attr;->MiniLoadingStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->c:I

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$a;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$a;-><init>(Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->c(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d()V

    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->c:I

    .line 2
    .line 3
    return p1
.end method


# virtual methods
.method public final b(Landroid/graphics/Canvas;I)V
    .locals 12

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 2
    .line 3
    div-int/lit8 v1, v0, 0xc

    .line 4
    .line 5
    div-int/lit8 v0, v0, 0x6

    .line 6
    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    .line 8
    .line 9
    int-to-float v1, v1

    .line 10
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 11
    .line 12
    .line 13
    int-to-float p2, p2

    .line 14
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 15
    .line 16
    int-to-float v3, v2

    .line 17
    const/high16 v4, 0x40000000    # 2.0f

    .line 18
    .line 19
    div-float/2addr v3, v4

    .line 20
    int-to-float v2, v2

    .line 21
    div-float/2addr v2, v4

    .line 22
    invoke-virtual {p1, p2, v3, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 23
    .line 24
    .line 25
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 26
    .line 27
    int-to-float v2, p2

    .line 28
    div-float/2addr v2, v4

    .line 29
    int-to-float p2, p2

    .line 30
    div-float/2addr p2, v4

    .line 31
    invoke-virtual {p1, v2, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 32
    .line 33
    .line 34
    const/4 p2, 0x0

    .line 35
    :goto_0
    const/16 v2, 0xc

    .line 36
    .line 37
    if-ge p2, v2, :cond_0

    .line 38
    .line 39
    const/high16 v2, 0x41f00000    # 30.0f

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    .line 45
    .line 46
    add-int/lit8 p2, p2, 0x1

    .line 47
    .line 48
    int-to-float v3, p2

    .line 49
    const/high16 v5, 0x437f0000    # 255.0f

    .line 50
    .line 51
    mul-float/2addr v3, v5

    .line 52
    const/high16 v5, 0x41400000    # 12.0f

    .line 53
    .line 54
    div-float/2addr v3, v5

    .line 55
    float-to-int v3, v3

    .line 56
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 57
    .line 58
    .line 59
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 60
    .line 61
    neg-int v2, v2

    .line 62
    int-to-float v2, v2

    .line 63
    div-float/2addr v2, v4

    .line 64
    div-float v3, v1, v4

    .line 65
    .line 66
    add-float/2addr v2, v3

    .line 67
    const/4 v5, 0x0

    .line 68
    invoke-virtual {p1, v5, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 69
    .line 70
    .line 71
    const/4 v7, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v9, 0x0

    .line 74
    int-to-float v10, v0

    .line 75
    iget-object v11, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    .line 76
    .line 77
    move-object v6, p1

    .line 78
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 79
    .line 80
    .line 81
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 82
    .line 83
    int-to-float v2, v2

    .line 84
    div-float/2addr v2, v4

    .line 85
    sub-float/2addr v2, v3

    .line 86
    invoke-virtual {p1, v5, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    return-void
.end method

.method public final c(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MiniLoadingView:[I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    sget p3, Lcom/xuexiang/xui/R$styleable;->MiniLoadingView_mlv_loading_view_size:I

    .line 13
    .line 14
    const/high16 v0, 0x42000000    # 32.0f

    .line 15
    .line 16
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/b;->b(Landroid/content/Context;F)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 25
    .line 26
    sget p1, Lcom/xuexiang/xui/R$styleable;->MiniLoadingView_mlv_loading_view_color:I

    .line 27
    .line 28
    const/4 p3, -0x1

    .line 29
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    .line 34
    .line 35
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    .line 7
    .line 8
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    .line 20
    .line 21
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/16 v1, 0xb

    .line 7
    .line 8
    filled-new-array {v0, v1}, [I

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    const-wide/16 v1, 0x258

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 37
    .line 38
    const/4 v1, -0x1

    .line 39
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 43
    .line 44
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 45
    .line 46
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    int-to-float v3, v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    int-to-float v4, v0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/16 v6, 0x1f

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->c:I

    .line 25
    .line 26
    mul-int/lit8 v1, v1, 0x1e

    .line 27
    .line 28
    invoke-virtual {p0, p1, v1}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b(Landroid/graphics/Canvas;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 2
    .line 3
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f()V

    .line 11
    .line 12
    .line 13
    :goto_0
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
