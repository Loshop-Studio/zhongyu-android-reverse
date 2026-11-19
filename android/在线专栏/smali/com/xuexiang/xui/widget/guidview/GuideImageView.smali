.class Lcom/xuexiang/xui/widget/guidview/GuideImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# static fields
.field private static final DEFAULT_ANIM_COUNTER:I = 0x14


# instance fields
.field private mAnimCounter:I

.field private mAnimMoveFactor:D

.field private mAnimationEnabled:Z

.field private mBackgroundColor:I

.field private mBackgroundPaint:Landroid/graphics/Paint;

.field private mBitmap:Landroid/graphics/Bitmap;

.field private mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

.field private mCircleBorderPaint:Landroid/graphics/Paint;

.field private mErasePaint:Landroid/graphics/Paint;

.field private mFocusAnimationMaxValue:I

.field private mFocusAnimationStep:I

.field private mFocusBorderSize:I

.field private mPath:Landroid/graphics/Path;

.field private mRoundRectRadius:I

.field private mStep:I

.field private rectF:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBackgroundColor:I

    const/16 p1, 0x14

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mRoundRectRadius:I

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mStep:I

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 5
    iput-wide v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimMoveFactor:D

    .line 6
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimationEnabled:Z

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 8
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBackgroundColor:I

    const/16 p1, 0x14

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mRoundRectRadius:I

    const/4 p1, 0x1

    .line 11
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mStep:I

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 12
    iput-wide v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimMoveFactor:D

    .line 13
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimationEnabled:Z

    .line 14
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBackgroundColor:I

    const/16 p1, 0x14

    .line 17
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mRoundRectRadius:I

    const/4 p1, 0x1

    .line 18
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mStep:I

    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    .line 19
    iput-wide p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimMoveFactor:D

    .line 20
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimationEnabled:Z

    .line 21
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->init()V

    return-void
.end method

.method private drawCircle(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterX()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterY()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    iget v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimCounter:I

    iget-wide v4, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimMoveFactor:D

    .line 2
    invoke-virtual {v2, v3, v4, v5}, Lcom/xuexiang/xui/widget/guidview/Calculator;->circleRadius(ID)F

    move-result v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mErasePaint:Landroid/graphics/Paint;

    .line 3
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mFocusBorderSize:I

    if-lez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterX()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterY()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterX()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterY()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    iget v4, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimCounter:I

    iget-wide v5, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimMoveFactor:D

    .line 8
    invoke-virtual {v3, v4, v5, v6}, Lcom/xuexiang/xui/widget/guidview/Calculator;->circleRadius(ID)F

    move-result v3

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 9
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCircleBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method private drawRoundedRectangle(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimCounter:I

    iget-wide v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimMoveFactor:D

    invoke-virtual {v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/guidview/Calculator;->roundRectLeft(ID)F

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    iget v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimCounter:I

    iget-wide v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimMoveFactor:D

    invoke-virtual {v1, v2, v3, v4}, Lcom/xuexiang/xui/widget/guidview/Calculator;->roundRectTop(ID)F

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    iget v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimCounter:I

    iget-wide v4, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimMoveFactor:D

    invoke-virtual {v2, v3, v4, v5}, Lcom/xuexiang/xui/widget/guidview/Calculator;->roundRectRight(ID)F

    move-result v2

    .line 4
    iget-object v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    iget v4, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimCounter:I

    iget-wide v5, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimMoveFactor:D

    invoke-virtual {v3, v4, v5, v6}, Lcom/xuexiang/xui/widget/guidview/Calculator;->roundRectBottom(ID)F

    move-result v3

    .line 5
    iget-object v4, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->rectF:Landroid/graphics/RectF;

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->rectF:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mRoundRectRadius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mErasePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mFocusBorderSize:I

    if-lez v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterX()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getCircleCenterY()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->rectF:Landroid/graphics/RectF;

    iget v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mRoundRectRadius:I

    int-to-float v3, v2

    int-to-float v2, v2

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCircleBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method private init()V
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/widget/ImageView;->setLayerType(ILandroid/graphics/Paint;)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setWillNotDraw(Z)V

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 4
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBackgroundPaint:Landroid/graphics/Paint;

    const/4 v2, 0x1

    .line 5
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBackgroundPaint:Landroid/graphics/Paint;

    iget v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBackgroundColor:I

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBackgroundPaint:Landroid/graphics/Paint;

    const/16 v3, 0xff

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 8
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mErasePaint:Landroid/graphics/Paint;

    .line 9
    new-instance v4, Landroid/graphics/PorterDuffXfermode;

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v5}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mErasePaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mErasePaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 12
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mPath:Landroid/graphics/Path;

    .line 13
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCircleBorderPaint:Landroid/graphics/Paint;

    .line 14
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCircleBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCircleBorderPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mFocusBorderSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCircleBorderPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->rectF:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBitmap:Landroid/graphics/Bitmap;

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBackgroundColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBitmap:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBackgroundPaint:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/guidview/Calculator;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/guidview/Calculator;->getFocusShape()Lcom/xuexiang/xui/widget/guidview/FocusShape;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/widget/guidview/FocusShape;->CIRCLE:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->drawCircle(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->drawRoundedRectangle(Landroid/graphics/Canvas;)V

    .line 10
    :goto_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimationEnabled:Z

    if-eqz p1, :cond_4

    .line 11
    iget p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimCounter:I

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mFocusAnimationMaxValue:I

    if-ne p1, v0, :cond_2

    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mFocusAnimationStep:I

    mul-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mStep:I

    goto :goto_1

    :cond_2
    if-nez p1, :cond_3

    .line 13
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mFocusAnimationStep:I

    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mStep:I

    .line 14
    :cond_3
    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mStep:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimCounter:I

    .line 15
    invoke-virtual {p0}, Landroid/widget/ImageView;->postInvalidate()V

    :cond_4
    return-void
.end method

.method public setAnimationEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimationEnabled:Z

    if-eqz p1, :cond_0

    const/16 p1, 0x14

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimCounter:I

    return-void
.end method

.method public setBorderParameters(II)V
    .locals 1

    .line 1
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mFocusBorderSize:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCircleBorderPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCircleBorderPaint:Landroid/graphics/Paint;

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setFocusAnimationParameters(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mFocusAnimationMaxValue:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mFocusAnimationStep:I

    return-void
.end method

.method public setParameters(ILcom/xuexiang/xui/widget/guidview/Calculator;)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mBackgroundColor:I

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 2
    iput-wide v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mAnimMoveFactor:D

    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mCalculator:Lcom/xuexiang/xui/widget/guidview/Calculator;

    return-void
.end method

.method public setRoundRectRadius(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideImageView;->mRoundRectRadius:I

    return-void
.end method
