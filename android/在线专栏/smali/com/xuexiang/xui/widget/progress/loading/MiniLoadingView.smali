.class public Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static final DEGREE_PER_LINE:I = 0x1e

.field private static final LINE_COUNT:I = 0xc


# instance fields
.field private mAnimateValue:I

.field private mAnimator:Landroid/animation/ValueAnimator;

.field private mPaint:Landroid/graphics/Paint;

.field private mPaintColor:I

.field private mSize:I

.field private mUpdateListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimateValue:I

    .line 10
    new-instance p1, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$1;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$1;-><init>(Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mUpdateListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 11
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mSize:I

    .line 12
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mPaintColor:I

    .line 13
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->initPaint()V

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
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimateValue:I

    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView$1;-><init>(Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mUpdateListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->initPaint()V

    return-void
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimateValue:I

    return p1
.end method

.method private drawLoading(Landroid/graphics/Canvas;I)V
    .locals 12

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mSize:I

    div-int/lit8 v1, v0, 0xc

    div-int/lit8 v0, v0, 0x6

    .line 2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mPaint:Landroid/graphics/Paint;

    int-to-float v1, v1

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    int-to-float p2, p2

    .line 3
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mSize:I

    int-to-float v3, v2

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    int-to-float v2, v2

    div-float/2addr v2, v4

    invoke-virtual {p1, p2, v3, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 4
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mSize:I

    int-to-float v2, p2

    div-float/2addr v2, v4

    int-to-float p2, p2

    div-float/2addr p2, v4

    invoke-virtual {p1, v2, p2}, Landroid/graphics/Canvas;->translate(FF)V

    const/4 p2, 0x0

    :goto_0
    const/16 v2, 0xc

    if-ge p2, v2, :cond_0

    const/high16 v2, 0x41f00000    # 30.0f

    .line 5
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mPaint:Landroid/graphics/Paint;

    const/high16 v3, 0x437f0000    # 255.0f

    add-int/lit8 p2, p2, 0x1

    int-to-float v5, p2

    mul-float v5, v5, v3

    const/high16 v3, 0x41400000    # 12.0f

    div-float/2addr v5, v3

    float-to-int v3, v5

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 7
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mSize:I

    neg-int v2, v2

    int-to-float v2, v2

    div-float/2addr v2, v4

    div-float v3, v1, v4

    add-float/2addr v2, v3

    const/4 v5, 0x0

    invoke-virtual {p1, v5, v2}, Landroid/graphics/Canvas;->translate(FF)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    int-to-float v10, v0

    .line 8
    iget-object v11, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mPaint:Landroid/graphics/Paint;

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 9
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mSize:I

    int-to-float v2, v2

    div-float/2addr v2, v4

    sub-float/2addr v2, v3

    invoke-virtual {p1, v5, v2}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MiniLoadingView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget p3, Lcom/xuexiang/xui/R$styleable;->MiniLoadingView_mlv_loading_view_size:I

    const/high16 v0, 0x42000000    # 32.0f

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mSize:I

    .line 3
    sget p1, Lcom/xuexiang/xui/R$styleable;->MiniLoadingView_mlv_loading_view_color:I

    const/4 p3, -0x1

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mPaintColor:I

    .line 4
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private initPaint()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mPaint:Landroid/graphics/Paint;

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mPaintColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->start()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->stop()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
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

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimateValue:I

    mul-int/lit8 v1, v1, 0x1e

    invoke-direct {p0, p1, v1}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->drawLoading(Landroid/graphics/Canvas;I)V

    .line 4
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    iget p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mSize:I

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    if-nez p2, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->start()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->stop()V

    :goto_0
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mPaintColor:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mSize:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public start()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 2
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mUpdateListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x258

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v0

    if-nez v0, :cond_1

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :cond_1
    :goto_0
    return-void

    :array_0
    .array-data 4
        0x0
        0xb
    .end array-data
.end method

.method public stop()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mUpdateListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/MiniLoadingView;->mAnimator:Landroid/animation/ValueAnimator;

    :cond_0
    return-void
.end method
