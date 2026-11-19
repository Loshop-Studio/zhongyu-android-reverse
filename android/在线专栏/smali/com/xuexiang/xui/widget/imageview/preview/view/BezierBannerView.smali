.class public Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$i;


# static fields
.field public static DIRECTION_LEFT:I = 0x1

.field public static DIRECTION_RIGHT:I = 0x2

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private MOVE_STEP_ONE:I

.field private MOVE_STEP_TWO:I

.field accelerateinterpolator:Landroid/view/animation/Interpolator;

.field private autoMove:Z

.field controlPointX:F

.field controlPointY:F

.field private count:I

.field private distance:F

.field endPointX:F

.field endPointY:F

.field mCenterPointX:F

.field mCenterPointY:F

.field private mChangeBgRadius:F

.field private mChangeRadius:F

.field private mCirclePaint:Landroid/graphics/Paint;

.field private mCirclePaint2:Landroid/graphics/Paint;

.field private mDrection:I

.field private mNomarlRadius:F

.field private mOriginProgress:F

.field private mPath:Landroid/graphics/Path;

.field private mPath2:Landroid/graphics/Path;

.field private mProgress:F

.field private mProgress2:F

.field private mRadius:F

.field private mSelectedColor:I

.field private mSelectedIndex:I

.field mStartX:F

.field mStartY:F

.field private mSupportChangeRadius:F

.field mSupportCircleX:F

.field mSupportCircleY:F

.field private mSupport_Next_ChangeRadius:F

.field mSupport_next_centerX:F

.field mSupport_next_centerY:F

.field private mUnSelectedColor:I

.field mbgNextPointX:F

.field mbgNextPointY:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    .line 5
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    const/high16 p1, 0x42a00000    # 80.0f

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->distance:F

    const/high16 p1, 0x41f00000    # 30.0f

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    const/high16 p1, 0x41a00000    # 20.0f

    .line 8
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->autoMove:Z

    const/4 p3, 0x0

    .line 10
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mProgress:F

    .line 11
    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mProgress2:F

    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    const/4 p1, 0x1

    .line 13
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_ONE:I

    const/4 p1, 0x2

    .line 14
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_TWO:I

    .line 15
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->accelerateinterpolator:Landroid/view/animation/Interpolator;

    .line 16
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->initAttrs(Landroid/util/AttributeSet;)V

    .line 17
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->initPaint()V

    return-void
.end method

.method private getCenterPointAt(I)F
    .locals 3

    if-nez p1, :cond_0

    .line 1
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    return p1

    :cond_0
    int-to-float p1, p1

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->distance:F

    const/high16 v1, 0x40000000    # 2.0f

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    mul-float v1, v1, v2

    add-float/2addr v0, v1

    mul-float p1, p1, v0

    add-float/2addr p1, v2

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    sub-float/2addr v0, v2

    add-float/2addr p1, v0

    return p1
.end method

.method private initAttrs(Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->BezierBannerView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_selectedColor:I

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedColor:I

    .line 3
    sget v0, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_unSelectedColor:I

    const v1, -0x555556

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mUnSelectedColor:I

    .line 4
    sget v0, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_selectedRadius:I

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    .line 5
    sget v0, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_unSelectedRadius:I

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    .line 6
    sget v0, Lcom/xuexiang/xui/R$styleable;->BezierBannerView_bbv_spacing:I

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->distance:F

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->distance:F

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private initPaint()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 2
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedColor:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCirclePaint:Landroid/graphics/Paint;

    .line 7
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 8
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mUnSelectedColor:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 12
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCirclePaint2:Landroid/graphics/Paint;

    return-void
.end method

.method private moveToNext()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->accelerateinterpolator:Landroid/view/animation/Interpolator;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mOriginProgress:F

    invoke-interface {v0, v1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v2, v2, 0x1

    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_TWO:I

    invoke-virtual {p0, v1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCenterPointX:F

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCenterPointY:F

    const/4 v2, 0x0

    .line 6
    invoke-virtual {p0, v1, v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeRadius:F

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_ONE:I

    const/high16 v3, 0x42340000    # 45.0f

    invoke-virtual {p0, v3, v2, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v1

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    .line 8
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeRadius:F

    float-to-double v8, v1

    mul-double v6, v6, v8

    double-to-float v1, v6

    .line 9
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeRadius:F

    float-to-double v6, v6

    mul-double v4, v4, v6

    double-to-float v4, v4

    .line 10
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    add-float/2addr v5, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v6, v6, 0x1

    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_ONE:I

    invoke-virtual {p0, v5, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportCircleX:F

    .line 11
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportCircleY:F

    .line 12
    invoke-virtual {p0, v2, v5, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFF)F

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportChangeRadius:F

    .line 13
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_TWO:I

    invoke-virtual {p0, v2, v3, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v5

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    .line 14
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v7

    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportChangeRadius:F

    float-to-double v9, v9

    mul-double v7, v7, v9

    double-to-float v7, v7

    .line 15
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportChangeRadius:F

    float-to-double v8, v8

    mul-double v5, v5, v8

    double-to-float v5, v5

    .line 16
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCenterPointX:F

    add-float/2addr v6, v1

    iput v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartX:F

    .line 17
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCenterPointY:F

    sub-float/2addr v1, v4

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartY:F

    .line 18
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportCircleX:F

    sub-float/2addr v1, v7

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->endPointX:F

    .line 19
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    sub-float/2addr v1, v5

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->endPointY:F

    .line 20
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v1

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    add-float/2addr v1, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v6, v6, 0x1

    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    sub-float/2addr v6, v7

    invoke-virtual {p0, v1, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValueForAll(FF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->controlPointX:F

    .line 21
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->controlPointY:F

    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartX:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartY:F

    invoke-virtual {v1, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 23
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->controlPointX:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->controlPointY:F

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->endPointX:F

    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->endPointY:F

    invoke-virtual {v1, v6, v7, v8, v9}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 24
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->endPointX:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    add-float/2addr v7, v5

    invoke-virtual {v1, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 25
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->controlPointX:F

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartX:F

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartY:F

    const/high16 v9, 0x40000000    # 2.0f

    mul-float v4, v4, v9

    add-float/2addr v8, v4

    invoke-virtual {v1, v5, v6, v7, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 26
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartX:F

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartY:F

    invoke-virtual {v1, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 27
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v1

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    add-float/2addr v4, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_TWO:I

    invoke-virtual {p0, v1, v4, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mbgNextPointX:F

    .line 28
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mbgNextPointY:F

    .line 29
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    invoke-virtual {p0, v1, v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeBgRadius:F

    .line 30
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_ONE:I

    invoke-virtual {p0, v3, v2, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v1

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    .line 31
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeBgRadius:F

    float-to-double v10, v1

    mul-double v6, v6, v10

    double-to-float v1, v6

    .line 32
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeBgRadius:F

    float-to-double v6, v6

    mul-double v4, v4, v6

    double-to-float v4, v4

    .line 33
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v5, v5, 0x1

    invoke-direct {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    sub-float/2addr v5, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_ONE:I

    invoke-virtual {p0, v5, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_next_centerX:F

    .line 34
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_next_centerY:F

    .line 35
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    invoke-virtual {p0, v2, v5, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_Next_ChangeRadius:F

    .line 36
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_TWO:I

    invoke-virtual {p0, v2, v3, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v0

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    .line 37
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_Next_ChangeRadius:F

    float-to-double v7, v0

    mul-double v5, v5, v7

    double-to-float v0, v5

    .line 38
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_Next_ChangeRadius:F

    float-to-double v5, v5

    mul-double v2, v2, v5

    double-to-float v2, v2

    .line 39
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mbgNextPointX:F

    sub-float/2addr v3, v1

    .line 40
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mbgNextPointY:F

    sub-float/2addr v1, v4

    .line 41
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_next_centerX:F

    add-float/2addr v5, v0

    .line 42
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_next_centerY:F

    sub-float/2addr v0, v2

    .line 43
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v6, v6, 0x1

    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    sub-float/2addr v6, v7

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v7

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    add-float/2addr v7, v8

    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValueForAll(FF)F

    move-result v6

    .line 44
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    .line 45
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    invoke-virtual {v8, v3, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 46
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    invoke-virtual {v8, v6, v7, v5, v0}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 47
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    add-float/2addr v8, v2

    invoke-virtual {v0, v5, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 48
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    mul-float v4, v4, v9

    add-float/2addr v4, v1

    invoke-virtual {v0, v6, v7, v3, v4}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 49
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    invoke-virtual {v0, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    return-void
.end method

.method private moveToPrivous()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->accelerateinterpolator:Landroid/view/animation/Interpolator;

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mOriginProgress:F

    invoke-interface {v0, v1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v2, v2, -0x1

    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    add-float/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_TWO:I

    invoke-virtual {p0, v1, v2, v3}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCenterPointX:F

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCenterPointY:F

    const/4 v2, 0x0

    .line 6
    invoke-virtual {p0, v1, v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeRadius:F

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_ONE:I

    const/high16 v3, 0x42340000    # 45.0f

    invoke-virtual {p0, v3, v2, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v1

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    .line 8
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeRadius:F

    float-to-double v8, v1

    mul-double v6, v6, v8

    double-to-float v1, v6

    .line 9
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeRadius:F

    float-to-double v6, v6

    mul-double v4, v4, v6

    double-to-float v4, v4

    .line 10
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    sub-float/2addr v5, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v6, v6, -0x1

    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_ONE:I

    invoke-virtual {p0, v5, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportCircleX:F

    .line 11
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportCircleY:F

    .line 12
    invoke-virtual {p0, v2, v5, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFF)F

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportChangeRadius:F

    .line 13
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_TWO:I

    invoke-virtual {p0, v2, v3, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v5

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    .line 14
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v7

    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportChangeRadius:F

    float-to-double v9, v9

    mul-double v7, v7, v9

    double-to-float v7, v7

    .line 15
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportChangeRadius:F

    float-to-double v8, v8

    mul-double v5, v5, v8

    double-to-float v5, v5

    .line 16
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCenterPointX:F

    sub-float/2addr v6, v1

    iput v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartX:F

    .line 17
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCenterPointY:F

    sub-float/2addr v1, v4

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartY:F

    .line 18
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportCircleX:F

    add-float/2addr v1, v7

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->endPointX:F

    .line 19
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    sub-float/2addr v1, v5

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->endPointY:F

    .line 20
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v1

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    sub-float/2addr v1, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v6, v6, -0x1

    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    add-float/2addr v6, v7

    invoke-virtual {p0, v1, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValueForAll(FF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->controlPointX:F

    .line 21
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->controlPointY:F

    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartX:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartY:F

    invoke-virtual {v1, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 23
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->controlPointX:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->controlPointY:F

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->endPointX:F

    iget v9, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->endPointY:F

    invoke-virtual {v1, v6, v7, v8, v9}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 24
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->endPointX:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    add-float/2addr v7, v5

    invoke-virtual {v1, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 25
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->controlPointX:F

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartX:F

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartY:F

    const/high16 v9, 0x40000000    # 2.0f

    mul-float v4, v4, v9

    add-float/2addr v8, v4

    invoke-virtual {v1, v5, v6, v7, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 26
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartX:F

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mStartY:F

    invoke-virtual {v1, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 27
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v1

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v4}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v4

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    sub-float/2addr v4, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_TWO:I

    invoke-virtual {p0, v1, v4, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mbgNextPointX:F

    .line 28
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mbgNextPointY:F

    .line 29
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    invoke-virtual {p0, v1, v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeBgRadius:F

    .line 30
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_ONE:I

    invoke-virtual {p0, v3, v2, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v1

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    .line 31
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeBgRadius:F

    float-to-double v10, v1

    mul-double v6, v6, v10

    double-to-float v1, v6

    .line 32
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeBgRadius:F

    float-to-double v6, v6

    mul-double v4, v4, v6

    double-to-float v4, v4

    .line 33
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v5, v5, -0x1

    invoke-direct {p0, v5}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    add-float/2addr v5, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_ONE:I

    invoke-virtual {p0, v5, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_next_centerX:F

    .line 34
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iput v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_next_centerY:F

    .line 35
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    invoke-virtual {p0, v2, v5, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_Next_ChangeRadius:F

    .line 36
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_TWO:I

    invoke-virtual {p0, v2, v3, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValue(FFI)F

    move-result v0

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    .line 37
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_Next_ChangeRadius:F

    float-to-double v7, v0

    mul-double v5, v5, v7

    double-to-float v0, v5

    .line 38
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_Next_ChangeRadius:F

    float-to-double v5, v5

    mul-double v2, v2, v5

    double-to-float v2, v2

    .line 39
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mbgNextPointX:F

    add-float/2addr v3, v1

    .line 40
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mbgNextPointY:F

    sub-float/2addr v1, v4

    .line 41
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_next_centerX:F

    sub-float/2addr v5, v0

    .line 42
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_next_centerY:F

    sub-float/2addr v0, v2

    .line 43
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    add-int/lit8 v6, v6, -0x1

    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    add-float/2addr v6, v7

    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    invoke-direct {p0, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v7

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    sub-float/2addr v7, v8

    invoke-virtual {p0, v6, v7}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getValueForAll(FF)F

    move-result v6

    .line 44
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    .line 45
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    invoke-virtual {v8, v3, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 46
    iget-object v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    invoke-virtual {v8, v6, v7, v5, v0}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 47
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    add-float/2addr v8, v2

    invoke-virtual {v0, v5, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 48
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    mul-float v4, v4, v9

    add-float/2addr v4, v1

    invoke-virtual {v0, v6, v7, v3, v4}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 49
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    invoke-virtual {v0, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    return-void
.end method


# virtual methods
.method public attachToViewpager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    .line 2
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/viewpager/widget/a;->getCount()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->count:I

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->moveToNext()V

    .line 6
    sget p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->DIRECTION_RIGHT:I

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mDrection:I

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public getValue(FFF)F
    .locals 0

    sub-float/2addr p2, p1

    mul-float p2, p2, p3

    add-float/2addr p1, p2

    return p1
.end method

.method public getValue(FFI)F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->MOVE_STEP_ONE:I

    if-ne p3, v0, :cond_0

    sub-float/2addr p2, p1

    .line 2
    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mProgress:F

    :goto_0
    mul-float p2, p2, p3

    add-float/2addr p1, p2

    return p1

    :cond_0
    sub-float/2addr p2, p1

    .line 3
    iget p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mProgress2:F

    goto :goto_0
.end method

.method public getValueForAll(FF)F
    .locals 1

    sub-float/2addr p2, p1

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mOriginProgress:F

    mul-float p2, p2, v0

    add-float/2addr p1, p2

    return p1
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/4 v0, 0x0

    .line 4
    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->count:I

    if-ge v0, v1, :cond_4

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mDrection:I

    sget v2, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->DIRECTION_RIGHT:I

    if-ne v1, v2, :cond_1

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    if-eq v0, v1, :cond_3

    add-int/lit8 v1, v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 7
    :cond_0
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCirclePaint2:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 8
    :cond_1
    sget v2, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->DIRECTION_LEFT:I

    if-ne v1, v2, :cond_3

    .line 9
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    if-eq v0, v1, :cond_3

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    goto :goto_1

    .line 10
    :cond_2
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->getCenterPointAt(I)F

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCirclePaint2:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 11
    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_next_centerX:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_next_centerY:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupport_Next_ChangeRadius:F

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCirclePaint2:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mbgNextPointX:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mbgNextPointY:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeBgRadius:F

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCirclePaint2:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath2:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCirclePaint2:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 14
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportCircleX:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportCircleY:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSupportChangeRadius:F

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCirclePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 15
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCenterPointX:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCenterPointY:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mChangeRadius:F

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCirclePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mCirclePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 17
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 4
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 5
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mNomarlRadius:F

    const/high16 v3, 0x40000000    # 2.0f

    mul-float v4, v2, v3

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->count:I

    int-to-float v6, v5

    mul-float v4, v4, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    sub-float/2addr v6, v2

    mul-float v6, v6, v3

    add-float/2addr v4, v6

    add-int/lit8 v5, v5, -0x1

    int-to-float v2, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->distance:F

    mul-float v2, v2, v5

    add-float/2addr v4, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v4, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v4, v2

    float-to-int v2, v4

    .line 6
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mRadius:F

    mul-float v4, v4, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v4, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v4, v3

    float-to-int v3, v4

    const/high16 v4, -0x80000000

    const/high16 v5, 0x40000000    # 2.0f

    if-ne v0, v5, :cond_0

    goto :goto_0

    :cond_0
    if-ne v0, v4, :cond_1

    .line 7
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_1
    :goto_0
    if-ne v1, v5, :cond_2

    goto :goto_1

    :cond_2
    if-ne v1, v4, :cond_3

    .line 8
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 9
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 3

    const/4 p3, 0x0

    cmpl-float v0, p2, p3

    if-nez v0, :cond_0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    .line 2
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->TAG:Ljava/lang/String;

    const-string v1, "\u5230\u8fbe"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->resetProgress()V

    :cond_0
    int-to-float v0, p1

    add-float/2addr v0, p2

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    int-to-float v2, v1

    sub-float v2, v0, v2

    cmpl-float v2, v2, p3

    if-lez v2, :cond_2

    .line 5
    sget p3, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->DIRECTION_RIGHT:I

    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mDrection:I

    add-int/lit8 v1, v1, 0x1

    int-to-float p3, v1

    cmpl-float p3, v0, p3

    if-lez p3, :cond_1

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    .line 7
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->TAG:Ljava/lang/String;

    const-string p2, "\u5411\u5de6\u5feb\u901f\u6ed1\u52a8"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->setProgress(F)V

    goto :goto_0

    :cond_2
    int-to-float v2, v1

    sub-float v2, v0, v2

    cmpg-float p3, v2, p3

    if-gez p3, :cond_4

    .line 9
    sget p3, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->DIRECTION_LEFT:I

    iput p3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mDrection:I

    add-int/lit8 v1, v1, -0x1

    int-to-float p3, v1

    cmpg-float p3, v0, p3

    if-gez p3, :cond_3

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mSelectedIndex:I

    .line 11
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->TAG:Ljava/lang/String;

    const-string p2, "\u5411\u53f3\u5feb\u901f\u6ed1\u52a8"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_3
    const/high16 p1, 0x3f800000    # 1.0f

    sub-float/2addr p1, p2

    .line 12
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->setProgress(F)V

    :cond_4
    :goto_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 0

    return-void
.end method

.method public resetProgress()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mProgress:F

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mProgress2:F

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mOriginProgress:F

    return-void
.end method

.method public setDirection(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mDrection:I

    return-void
.end method

.method public setProgress(F)V
    .locals 7

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-nez v1, :cond_0

    return-void

    .line 1
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mOriginProgress:F

    float-to-double v1, p1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    const/high16 v5, 0x3f000000    # 0.5f

    cmpg-double v6, v1, v3

    if-gtz v6, :cond_1

    div-float/2addr p1, v5

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mProgress:F

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mProgress2:F

    goto :goto_0

    :cond_1
    sub-float/2addr p1, v5

    div-float/2addr p1, v5

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mProgress2:F

    const/high16 p1, 0x3f800000    # 1.0f

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mProgress:F

    .line 6
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->mDrection:I

    sget v0, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->DIRECTION_RIGHT:I

    if-ne p1, v0, :cond_2

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->moveToNext()V

    goto :goto_1

    .line 8
    :cond_2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/BezierBannerView;->moveToPrivous()V

    .line 9
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
