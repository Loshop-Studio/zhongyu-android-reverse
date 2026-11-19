.class public Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Landroid/animation/ValueAnimator;

.field public final e:Landroid/graphics/Paint;

.field public final f:Lcom/xuexiang/xui/widget/button/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->MiniLoadingStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->c:I

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/button/f;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lcom/xuexiang/xui/widget/button/f;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Lcom/xuexiang/xui/widget/button/f;

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/xuexiang/xui/R$styleable;->MiniLoadingView:[I

    invoke-virtual {v1, p2, v2, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 7
    sget p3, Lcom/xuexiang/xui/R$styleable;->MiniLoadingView_mlv_loading_view_size:I

    const/high16 v0, 0x42000000    # 32.0f

    invoke-static {p1, v0}, Lh4/a;->h(Landroid/content/Context;F)I

    move-result p1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 8
    sget p1, Lcom/xuexiang/xui/R$styleable;->MiniLoadingView_mlv_loading_view_color:I

    const/4 p3, -0x1

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    .line 9
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 10
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    .line 11
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->b:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    return-void
.end method


# virtual methods
.method public final a()V
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
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Lcom/xuexiang/xui/widget/button/f;

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
    return-void

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
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Lcom/xuexiang/xui/widget/button/f;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    int-to-float v4, v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v5, v0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/16 v7, 0x1f

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    move-object v1, p1

    .line 20
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    move-object v0, v1

    .line 25
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->c:I

    .line 26
    .line 27
    mul-int/lit8 v1, v1, 0x1e

    .line 28
    .line 29
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 30
    .line 31
    div-int/lit8 v3, v2, 0xc

    .line 32
    .line 33
    div-int/lit8 v6, v2, 0x6

    .line 34
    .line 35
    int-to-float v7, v3

    .line 36
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 39
    .line 40
    .line 41
    int-to-float v1, v1

    .line 42
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 43
    .line 44
    int-to-float v2, v2

    .line 45
    const/high16 v8, 0x40000000    # 2.0f

    .line 46
    .line 47
    div-float/2addr v2, v8

    .line 48
    invoke-virtual {v0, v1, v2, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 49
    .line 50
    .line 51
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 52
    .line 53
    int-to-float v1, v1

    .line 54
    div-float/2addr v1, v8

    .line 55
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    :goto_0
    const/16 v2, 0xc

    .line 60
    .line 61
    if-ge v1, v2, :cond_0

    .line 62
    .line 63
    const/high16 v2, 0x41f00000    # 30.0f

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v9, v1, 0x1

    .line 69
    .line 70
    int-to-float v1, v9

    .line 71
    const/high16 v2, 0x437f0000    # 255.0f

    .line 72
    .line 73
    mul-float/2addr v1, v2

    .line 74
    const/high16 v2, 0x41400000    # 12.0f

    .line 75
    .line 76
    div-float/2addr v1, v2

    .line 77
    float-to-int v1, v1

    .line 78
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    .line 79
    .line 80
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 81
    .line 82
    .line 83
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 84
    .line 85
    neg-int v1, v1

    .line 86
    int-to-float v1, v1

    .line 87
    div-float/2addr v1, v8

    .line 88
    div-float v10, v7, v8

    .line 89
    .line 90
    add-float/2addr v1, v10

    .line 91
    const/4 v11, 0x0

    .line 92
    invoke-virtual {v0, v11, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 93
    .line 94
    .line 95
    int-to-float v4, v6

    .line 96
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->e:Landroid/graphics/Paint;

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    const/4 v2, 0x0

    .line 100
    const/4 v3, 0x0

    .line 101
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 102
    .line 103
    .line 104
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a:I

    .line 105
    .line 106
    int-to-float v1, v1

    .line 107
    div-float/2addr v1, v8

    .line 108
    sub-float/2addr v1, v10

    .line 109
    invoke-virtual {v0, v11, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 110
    .line 111
    .line 112
    move v1, v9

    .line 113
    goto :goto_0

    .line 114
    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final onMeasure(II)V
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

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->a()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->f:Lcom/xuexiang/xui/widget/button/f;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->d:Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    :cond_1
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
