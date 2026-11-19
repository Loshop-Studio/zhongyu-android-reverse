.class public Lcom/xuexiang/xui/widget/button/SwitchIconView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;
    }
.end annotation


# static fields
.field private static final DASH_THICKNESS_PART:F = 0.083333336f

.field private static final DEFAULT_ANIMATION_DURATION:I = 0x12c

.field private static final DEFAULT_DISABLED_ALPHA:F = 0.5f

.field private static final SIN_45:F


# instance fields
.field private final mAnimationDuration:J

.field private final mClipPath:Landroid/graphics/Path;

.field private final mColorEvaluator:Landroid/animation/ArgbEvaluator;

.field private mColorFilter:Landroid/graphics/PorterDuffColorFilter;

.field private final mDashEnd:Landroid/graphics/Point;

.field private mDashLengthXProjection:I

.field private mDashLengthYProjection:I

.field private final mDashPaint:Landroid/graphics/Paint;

.field private final mDashStart:Landroid/graphics/Point;

.field private mDashThickness:I

.field private final mDashXStart:I

.field private final mDashYStart:I

.field private final mDisabledStateAlpha:F

.field private final mDisabledStateColor:I

.field private mEnabled:Z

.field private mFraction:F

.field private final mIconTintColor:I

.field private final mNoDash:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x4046800000000000L    # 45.0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float v0, v0

    sput v0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->SIN_45:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->SwitchIconViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Landroid/animation/ArgbEvaluator;

    invoke-direct {p3}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mColorEvaluator:Landroid/animation/ArgbEvaluator;

    const/4 p3, 0x0

    .line 5
    iput p3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mFraction:F

    .line 6
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashStart:Landroid/graphics/Point;

    .line 7
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashEnd:Landroid/graphics/Point;

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, v0, v1}, Landroid/widget/ImageView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 9
    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget-object v2, Lcom/xuexiang/xui/R$styleable;->SwitchIconView:[I

    const/4 v3, 0x0

    invoke-virtual {v1, p2, v2, v3, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 10
    :try_start_0
    sget v1, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_tint_color:I

    invoke-static {p1}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {p2, v1, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mIconTintColor:I

    .line 11
    sget v1, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_animation_duration:I

    const/16 v2, 0x12c

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    int-to-long v1, v1

    iput-wide v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mAnimationDuration:J

    .line 12
    sget v1, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_disabled_alpha:I

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDisabledStateAlpha:F

    .line 13
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_disabled_color:I

    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDisabledStateColor:I

    .line 14
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_enabled:I

    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mEnabled:Z

    .line 15
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_no_dash:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mNoDash:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    cmpg-float p2, v1, p3

    if-ltz p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float v2, v1, p2

    if-gtz v2, :cond_1

    .line 17
    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, p1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mColorFilter:Landroid/graphics/PorterDuffColorFilter;

    .line 18
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 19
    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashXStart:I

    .line 20
    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashYStart:I

    .line 21
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashPaint:Landroid/graphics/Paint;

    .line 22
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 23
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mClipPath:Landroid/graphics/Path;

    .line 25
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->initDashCoordinates()V

    .line 26
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mEnabled:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/high16 p3, 0x3f800000    # 1.0f

    :goto_0
    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->setFraction(F)V

    return-void

    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Wrong value for si_disabled_alpha ["

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p3, "]. Must be value from range [0, 1]"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 28
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 29
    throw p1
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/button/SwitchIconView;F)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->setFraction(F)V

    return-void
.end method

.method private animateToFraction(F)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mFraction:F

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    aput p1, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/button/SwitchIconView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView$1;-><init>(Lcom/xuexiang/xui/widget/button/SwitchIconView;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 3
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 4
    iget-wide v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mAnimationDuration:J

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 5
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private drawDash(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mFraction:F

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashEnd:Landroid/graphics/Point;

    iget v2, v1, Landroid/graphics/Point;->x:I

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashStart:Landroid/graphics/Point;

    iget v4, v3, Landroid/graphics/Point;->x:I

    sub-int/2addr v2, v4

    int-to-float v2, v2

    mul-float v2, v2, v0

    int-to-float v5, v4

    add-float v9, v2, v5

    .line 2
    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v2, v3, Landroid/graphics/Point;->y:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    mul-float v0, v0, v1

    int-to-float v1, v2

    add-float v10, v0, v1

    int-to-float v7, v4

    int-to-float v8, v2

    .line 3
    iget-object v11, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashPaint:Landroid/graphics/Paint;

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private initDashCoordinates()V
    .locals 6

    .line 1
    sget v0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->SIN_45:F

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float v1, v1, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashThickness:I

    int-to-float v3, v2

    mul-float v1, v1, v3

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v0, v0, v3

    int-to-float v2, v2

    mul-float v0, v0, v2

    .line 2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashStart:Landroid/graphics/Point;

    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashXStart:I

    int-to-float v4, v3

    add-float/2addr v4, v0

    float-to-int v4, v4

    iput v4, v2, Landroid/graphics/Point;->x:I

    .line 3
    iget v4, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashYStart:I

    float-to-int v5, v1

    add-int/2addr v5, v4

    iput v5, v2, Landroid/graphics/Point;->y:I

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashEnd:Landroid/graphics/Point;

    iget v5, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashLengthXProjection:I

    add-int/2addr v3, v5

    int-to-float v3, v3

    sub-float/2addr v3, v1

    float-to-int v1, v3

    iput v1, v2, Landroid/graphics/Point;->x:I

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashLengthYProjection:I

    add-int/2addr v4, v1

    int-to-float v1, v4

    sub-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, v2, Landroid/graphics/Point;->y:I

    return-void
.end method

.method private postInvalidateOnAnimationCompat()V
    .locals 0

    invoke-virtual {p0}, Landroid/widget/ImageView;->postInvalidateOnAnimation()V

    return-void
.end method

.method private setFraction(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mFraction:F

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->updateColor(F)V

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->updateAlpha(F)V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->updateClipPath()V

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->postInvalidateOnAnimationCompat()V

    return-void
.end method

.method private updateAlpha(F)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDisabledStateAlpha:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float p1, v1, p1

    sub-float/2addr v1, v0

    mul-float p1, p1, v1

    add-float/2addr v0, p1

    const/high16 p1, 0x437f0000    # 255.0f

    mul-float v0, v0, p1

    float-to-int p1, v0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->updateImageAlpha(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method private updateClipPath()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashThickness:I

    int-to-float v0, v0

    sget v1, Lcom/xuexiang/xui/widget/button/SwitchIconView;->SIN_45:F

    div-float/2addr v0, v1

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mClipPath:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mClipPath:Landroid/graphics/Path;

    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashXStart:I

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashYStart:I

    int-to-float v3, v3

    add-float/2addr v3, v0

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mClipPath:Landroid/graphics/Path;

    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashXStart:I

    int-to-float v2, v2

    add-float/2addr v2, v0

    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashYStart:I

    int-to-float v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mClipPath:Landroid/graphics/Path;

    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashXStart:I

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashLengthXProjection:I

    int-to-float v3, v3

    iget v4, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mFraction:F

    mul-float v3, v3, v4

    add-float/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashYStart:I

    int-to-float v3, v3

    iget v5, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashLengthYProjection:I

    int-to-float v5, v5

    mul-float v5, v5, v4

    add-float/2addr v3, v5

    sub-float/2addr v3, v0

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mClipPath:Landroid/graphics/Path;

    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashXStart:I

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashLengthXProjection:I

    int-to-float v3, v3

    iget v4, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mFraction:F

    mul-float v3, v3, v4

    add-float/2addr v2, v3

    sub-float/2addr v2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashYStart:I

    int-to-float v0, v0

    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashLengthYProjection:I

    int-to-float v3, v3

    mul-float v3, v3, v4

    add-float/2addr v0, v3

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    return-void
.end method

.method private updateColor(F)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mIconTintColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDisabledStateColor:I

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mColorEvaluator:Landroid/animation/ArgbEvaluator;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDisabledStateColor:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v0, v2}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->updateImageColor(I)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method private updateImageAlpha(I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageAlpha(I)V

    return-void
.end method

.method private updateImageColor(I)V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, p1, v1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mColorFilter:Landroid/graphics/PorterDuffColorFilter;

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method


# virtual methods
.method public isIconEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mEnabled:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mNoDash:Z

    if-nez v0, :cond_1

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->drawDash(Landroid/graphics/Canvas;)V

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mClipPath:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipOutPath(Landroid/graphics/Path;)Z

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mClipPath:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->XOR:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 6
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 3
    :cond_0
    check-cast p1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;

    .line 4
    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/ImageView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 5
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;->iconEnabled:Z

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mEnabled:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 6
    :goto_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->setFraction(F)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/ImageView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;

    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mEnabled:Z

    iput-boolean v0, v1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;->iconEnabled:Z

    return-object v1
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result p3

    sub-int/2addr p1, p3

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashLengthXProjection:I

    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result p1

    sub-int/2addr p2, p1

    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result p1

    sub-int/2addr p2, p1

    iput p2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashLengthYProjection:I

    .line 4
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashLengthXProjection:I

    add-int/2addr p1, p2

    int-to-float p1, p1

    const p2, 0x3daaaaab

    mul-float p1, p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashThickness:I

    .line 5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mDashPaint:Landroid/graphics/Paint;

    int-to-float p1, p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->initDashCoordinates()V

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->updateClipPath()V

    return-void
.end method

.method public setIconEnabled(Z)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->setIconEnabled(ZZ)V

    return-void
.end method

.method public setIconEnabled(ZZ)V
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mEnabled:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->switchState(Z)V

    return-void
.end method

.method public switchState()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->switchState(Z)V

    return-void
.end method

.method public switchState(Z)V
    .locals 2

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mEnabled:Z

    if-eqz v0, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    xor-int/lit8 v0, v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->mEnabled:Z

    if-eqz p1, :cond_1

    .line 4
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->animateToFraction(F)V

    goto :goto_1

    .line 5
    :cond_1
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->setFraction(F)V

    .line 6
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    :goto_1
    return-void
.end method
