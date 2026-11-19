.class public Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static final DEFAULT_ARC_DEGREE:I = 0x13b

.field private static final DEFAULT_ARC_WIDTH:I = 0x6

.field private static final DEFAULT_SPEED_OF_DEGREE:I = 0x5


# instance fields
.field private mArcColor:I

.field private mArcDegree:F

.field private mArcPaint:Landroid/graphics/Paint;

.field private mArcRectF:Landroid/graphics/RectF;

.field private mArcWidth:I

.field private mGradientColors:[I

.field private mIconBitmap:Landroid/graphics/Bitmap;

.field private mIconPaint:Landroid/graphics/Paint;

.field private mIconScale:F

.field private mIsAutoMode:Z

.field private mIsDraw:Z

.field private mSpeedOfDegree:I

.field private mStartDegree:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIsAutoMode:Z

    const/16 v0, 0xa

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mStartDegree:I

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIsAutoMode:Z

    const/16 v0, 0xa

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mStartDegree:I

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x1

    .line 10
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIsAutoMode:Z

    const/16 p3, 0xa

    .line 11
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mStartDegree:I

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private drawArc(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->getIconBitmapRectF(Landroid/graphics/Bitmap;)Landroid/graphics/RectF;

    move-result-object v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcPaint:Landroid/graphics/Paint;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->getSweepGradient(Landroid/graphics/Canvas;)Landroid/graphics/SweepGradient;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 4
    iget-object v3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcRectF:Landroid/graphics/RectF;

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mStartDegree:I

    int-to-float v4, v0

    iget v5, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcDegree:F

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcPaint:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mStartDegree:I

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mSpeedOfDegree:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mStartDegree:I

    const/16 v0, 0x168

    if-le p1, v0, :cond_1

    sub-int/2addr p1, v0

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mStartDegree:I

    :cond_1
    return-void
.end method

.method private getSweepGradient(Landroid/graphics/Canvas;)Landroid/graphics/SweepGradient;
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/SweepGradient;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    shr-int/lit8 v1, v1, 0x1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v2

    shr-int/lit8 v2, v2, 0x1

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mGradientColors:[I

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    .line 2
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 3
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mStartDegree:I

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v3

    shr-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result p1

    shr-int/lit8 p1, p1, 0x1

    int-to-float p1, p1

    invoke-virtual {v1, v2, v3, p1}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 4
    invoke-virtual {v0, v1}, Landroid/graphics/SweepGradient;->setLocalMatrix(Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->LoadingView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget v0, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_color:I

    invoke-static {p1}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcColor:I

    .line 3
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_arc_degree:I

    const/16 v0, 0x13b

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcDegree:F

    const/4 p1, 0x2

    new-array p1, p1, [I

    const/4 v0, 0x0

    aput v0, p1, v0

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcColor:I

    const/4 v1, 0x1

    aput v0, p1, v1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mGradientColors:[I

    .line 5
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_width:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {v0, v2}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcWidth:I

    .line 6
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_speed:I

    const/4 v0, 0x5

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mSpeedOfDegree:I

    .line 7
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_auto:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIsAutoMode:Z

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIsDraw:Z

    .line 8
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_has_icon:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_icon:I

    invoke-static {p1, p2, v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 10
    invoke-static {p1}, Lcom/xuexiang/xui/utils/Utils;->getBitmapFromDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconBitmap:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xuexiang/xui/UIConfig;->getAppIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 12
    invoke-static {p1}, Lcom/xuexiang/xui/utils/Utils;->getBitmapFromDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconBitmap:Landroid/graphics/Bitmap;

    .line 13
    :cond_1
    :goto_0
    sget p1, Lcom/xuexiang/xui/R$styleable;->LoadingView_lv_icon_scale:I

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconScale:F

    .line 14
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 15
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->initPaint()V

    return-void
.end method

.method private initPaint()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcPaint:Landroid/graphics/Paint;

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcPaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcPaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcWidth:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconPaint:Landroid/graphics/Paint;

    .line 7
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcColor:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    return-void
.end method

.method private pause()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIsDraw:Z

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public getIconBitmapRectF(Landroid/graphics/Bitmap;)Landroid/graphics/RectF;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-float p1, p1

    cmpl-float v1, v0, p1

    if-ltz v1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v0

    mul-float v1, v1, p1

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, p1

    mul-float p1, v1, v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v1, v0

    .line 6
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconScale:F

    mul-float p1, p1, v2

    sub-float/2addr v0, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr v0, p1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconScale:F

    mul-float v1, v1, v3

    sub-float/2addr v2, v1

    div-float/2addr v2, p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    sub-float/2addr p1, v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v2

    .line 10
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3, v0, v2, p1, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v3
.end method

.method public getIconScale()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconScale:F

    return v0
.end method

.method public getLoadingColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcColor:I

    return v0
.end method

.method public isStart()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIsDraw:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIsDraw:Z

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->drawArc(Landroid/graphics/Canvas;)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    new-instance p3, Landroid/graphics/RectF;

    iget p4, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcWidth:I

    mul-int/lit8 v0, p4, 0x2

    int-to-float v0, v0

    mul-int/lit8 v1, p4, 0x2

    int-to-float v1, v1

    mul-int/lit8 v2, p4, 0x2

    sub-int/2addr p1, v2

    int-to-float p1, p1

    mul-int/lit8 p4, p4, 0x2

    sub-int/2addr p2, p4

    int-to-float p2, p2

    invoke-direct {p3, v0, v1, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcRectF:Landroid/graphics/RectF;

    return-void
.end method

.method public recycle()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->pause()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 4
    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconBitmap:Landroid/graphics/Bitmap;

    .line 5
    :cond_0
    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcRectF:Landroid/graphics/RectF;

    .line 6
    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcPaint:Landroid/graphics/Paint;

    .line 7
    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconPaint:Landroid/graphics/Paint;

    .line 8
    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mGradientColors:[I

    return-void
.end method

.method public setIconScale(F)Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconScale:F

    return-object p0
.end method

.method public setLoadingColor(I)Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mArcColor:I

    return-object p0
.end method

.method public setLoadingIcon(Landroid/graphics/Bitmap;)Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconBitmap:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public setLoadingIcon(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-static {p1}, Lcom/xuexiang/xui/utils/Utils;->getBitmapFromDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIconBitmap:Landroid/graphics/Bitmap;

    :cond_0
    return-object p0
.end method

.method public setSpeedOfDegree(I)Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mSpeedOfDegree:I

    return-object p0
.end method

.method public start()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIsAutoMode:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIsDraw:Z

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public stop()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->mIsAutoMode:Z

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->pause()V

    :cond_0
    return-void
.end method
