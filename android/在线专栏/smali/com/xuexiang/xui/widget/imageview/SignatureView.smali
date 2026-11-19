.class public Lcom/xuexiang/xui/widget/imageview/SignatureView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final DEFAULT_PEN_SIZE:F = 10.0f


# instance fields
.field private mBackColor:I

.field private mBorderPaint:Landroid/graphics/Paint;

.field private mBorderWidth:I

.field private mCacheBitmap:Landroid/graphics/Bitmap;

.field private mCacheCanvas:Landroid/graphics/Canvas;

.field private mGesturePaint:Landroid/graphics/Paint;

.field private mIsTouched:Z

.field private mPath:Landroid/graphics/Path;

.field private mPenColor:I

.field private mPenSize:F

.field private mX:F

.field private mY:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    .line 3
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPath:Landroid/graphics/Path;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mIsTouched:Z

    const/high16 v1, 0x41200000    # 10.0f

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenSize:F

    const/high16 v1, -0x1000000

    .line 6
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenColor:I

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBackColor:I

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 9
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    .line 11
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPath:Landroid/graphics/Path;

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mIsTouched:Z

    const/high16 v1, 0x41200000    # 10.0f

    .line 13
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenSize:F

    const/high16 v1, -0x1000000

    .line 14
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenColor:I

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBackColor:I

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 17
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    .line 19
    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPath:Landroid/graphics/Path;

    const/4 p3, 0x0

    .line 20
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mIsTouched:Z

    const/high16 v0, 0x41200000    # 10.0f

    .line 21
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenSize:F

    const/high16 v0, -0x1000000

    .line 22
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenColor:I

    .line 23
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBackColor:I

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private drawBorder(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderPaint:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v4, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v5, v0

    iget-object v6, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderPaint:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->SignatureView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->SignatureView_stv_penSize:I

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenSize:F

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenSize:F

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->SignatureView_stv_penColor:I

    const/high16 v0, -0x1000000

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenColor:I

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->SignatureView_stv_backColor:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBackColor:I

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->SignatureView_stv_hasBorder:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 6
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->updateBorderStyle(Z)V

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->initPaint()V

    return-void
.end method

.method private initBorderPaintStyle()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderPaint:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderWidth:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderPaint:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_dark:I

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method private initPaint()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenSize:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method private touchDown(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mX:F

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mY:F

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPath:Landroid/graphics/Path;

    invoke-virtual {v1, v0, p1}, Landroid/graphics/Path;->moveTo(FF)V

    return-void
.end method

.method private touchMove(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mX:F

    .line 4
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mY:F

    sub-float v3, v0, v1

    .line 5
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    sub-float v4, p1, v2

    .line 6
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/high16 v5, 0x40400000    # 3.0f

    cmpl-float v3, v3, v5

    if-gez v3, :cond_0

    cmpl-float v3, v4, v5

    if-ltz v3, :cond_1

    :cond_0
    add-float v3, v0, v1

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float v5, p1, v2

    div-float/2addr v5, v4

    .line 7
    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPath:Landroid/graphics/Path;

    invoke-virtual {v4, v1, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mX:F

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mY:F

    :cond_1
    return-void
.end method

.method private touchUp()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheCanvas:Landroid/graphics/Canvas;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderWidth:I

    neg-int v2, v1

    int-to-float v2, v2

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheCanvas:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPath:Landroid/graphics/Path;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheCanvas:Landroid/graphics/Canvas;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderWidth:I

    int-to-float v2, v1

    int-to-float v1, v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    return-void
.end method

.method private updateBorderStyle(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderPaint:Landroid/graphics/Paint;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 2
    invoke-static {p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderWidth:I

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->initBorderPaintStyle()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderPaint:Landroid/graphics/Paint;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderWidth:I

    :goto_0
    return-void
.end method

.method private updateCacheCanvasSize()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderWidth:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderWidth:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheBitmap:Landroid/graphics/Bitmap;

    .line 3
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheBitmap:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheCanvas:Landroid/graphics/Canvas;

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBackColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mIsTouched:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheCanvas:Landroid/graphics/Canvas;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mIsTouched:Z

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBackColor:I

    if-nez v0, :cond_0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheCanvas:Landroid/graphics/Canvas;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method

.method public enableBorder(Z)Lcom/xuexiang/xui/widget/imageview/SignatureView;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->updateBorderStyle(Z)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->updateCacheCanvasSize()V

    return-object p0
.end method

.method public getSnapshot()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getTouched()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mIsTouched:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->drawBorder(Landroid/graphics/Canvas;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheBitmap:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBorderWidth:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->updateCacheCanvasSize()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mIsTouched:Z

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->touchMove(Landroid/view/MotionEvent;)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->touchUp()V

    goto :goto_0

    .line 5
    :cond_2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/SignatureView;->touchDown(Landroid/view/MotionEvent;)V

    .line 6
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v1
.end method

.method public recycle()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 3
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheBitmap:Landroid/graphics/Bitmap;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheCanvas:Landroid/graphics/Canvas;

    if-eqz v0, :cond_1

    .line 5
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBackColor:I

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 6
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheCanvas:Landroid/graphics/Canvas;

    .line 7
    :cond_1
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    .line 8
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPath:Landroid/graphics/Path;

    return-void
.end method

.method public setBackColor(I)Lcom/xuexiang/xui/widget/imageview/SignatureView;
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mBackColor:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mCacheCanvas:Landroid/graphics/Canvas;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->drawColor(I)V

    :cond_0
    return-object p0
.end method

.method public setPenColor(I)Lcom/xuexiang/xui/widget/imageview/SignatureView;
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenColor:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-object p0
.end method

.method public setPenSize(F)Lcom/xuexiang/xui/widget/imageview/SignatureView;
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 p1, 0x41200000    # 10.0f

    .line 1
    :goto_0
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mPenSize:F

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/SignatureView;->mGesturePaint:Landroid/graphics/Paint;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :cond_1
    return-object p0
.end method

.method public setViewSize(II)Lcom/xuexiang/xui/widget/imageview/SignatureView;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method
