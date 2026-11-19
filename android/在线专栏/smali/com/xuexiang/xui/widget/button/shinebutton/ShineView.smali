.class public Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;
    }
.end annotation


# static fields
.field private static final FRAME_REFRESH_DELAY:J = 0x19L

.field private static sColorRandom:[I


# instance fields
.field private mAllowRandomColor:Z

.field private mAnimDuration:J

.field private mBigShineColor:I

.field private mBtnHeight:I

.field private mBtnWidth:I

.field private mCenterAnimX:I

.field private mCenterAnimY:I

.field private mClickAnimDuration:J

.field private mClickAnimator:Landroid/animation/ValueAnimator;

.field private mClickValue:F

.field private mColorCount:I

.field private mDistanceOffset:F

.field private mEnableFlashing:Z

.field private mIsAnimating:Z

.field private mPaint:Landroid/graphics/Paint;

.field private mPaint2:Landroid/graphics/Paint;

.field private mPaintSmall:Landroid/graphics/Paint;

.field private mRandom:Ljava/util/Random;

.field private mRectF:Landroid/graphics/RectF;

.field private mShineAnimator:Lcom/xuexiang/xui/widget/button/shinebutton/ShineAnimator;

.field private mShineButton:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;",
            ">;"
        }
    .end annotation
.end field

.field private mShineCount:I

.field private mShineDistanceMultiple:F

.field private mShineSize:I

.field private mSmallOffsetAngle:F

.field private mSmallRectF:Landroid/graphics/RectF;

.field private mSmallShineColor:I

.field private mTurnAngle:F

.field private mValue:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [I

    sput-object v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->sColorRandom:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 p1, 0xa

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mColorCount:I

    .line 3
    sget-object p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->sColorRandom:[I

    const/4 v0, 0x0

    aget v1, p1, v0

    iput v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallShineColor:I

    const/4 v1, 0x1

    .line 4
    aget p1, p1, v1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBigShineColor:I

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineSize:I

    .line 6
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mAllowRandomColor:Z

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mEnableFlashing:Z

    .line 8
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mRectF:Landroid/graphics/RectF;

    .line 9
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallRectF:Landroid/graphics/RectF;

    .line 10
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mRandom:Ljava/util/Random;

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickValue:F

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mIsAnimating:Z

    const p1, 0x3e4ccccd    # 0.2f

    .line 13
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mDistanceOffset:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0xa

    .line 53
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mColorCount:I

    .line 54
    sget-object p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->sColorRandom:[I

    const/4 p2, 0x0

    aget v0, p1, p2

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallShineColor:I

    const/4 v0, 0x1

    .line 55
    aget p1, p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBigShineColor:I

    .line 56
    iput p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineSize:I

    .line 57
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mAllowRandomColor:Z

    .line 58
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mEnableFlashing:Z

    .line 59
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mRectF:Landroid/graphics/RectF;

    .line 60
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallRectF:Landroid/graphics/RectF;

    .line 61
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mRandom:Ljava/util/Random;

    const/4 p1, 0x0

    .line 62
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickValue:F

    .line 63
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mIsAnimating:Z

    const p1, 0x3e4ccccd    # 0.2f

    .line 64
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mDistanceOffset:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0xa

    .line 66
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mColorCount:I

    .line 67
    sget-object p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->sColorRandom:[I

    const/4 p2, 0x0

    aget p3, p1, p2

    iput p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallShineColor:I

    const/4 p3, 0x1

    .line 68
    aget p1, p1, p3

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBigShineColor:I

    .line 69
    iput p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineSize:I

    .line 70
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mAllowRandomColor:Z

    .line 71
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mEnableFlashing:Z

    .line 72
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mRectF:Landroid/graphics/RectF;

    .line 73
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallRectF:Landroid/graphics/RectF;

    .line 74
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mRandom:Ljava/util/Random;

    const/4 p1, 0x0

    .line 75
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickValue:F

    .line 76
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mIsAnimating:Z

    const p1, 0x3e4ccccd    # 0.2f

    .line 77
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mDistanceOffset:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;)V
    .locals 6

    .line 14
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 p1, 0xa

    .line 15
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mColorCount:I

    .line 16
    sget-object p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->sColorRandom:[I

    const/4 v0, 0x0

    aget v1, p1, v0

    iput v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallShineColor:I

    const/4 v1, 0x1

    .line 17
    aget p1, p1, v1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBigShineColor:I

    .line 18
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineSize:I

    .line 19
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mAllowRandomColor:Z

    .line 20
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mEnableFlashing:Z

    .line 21
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mRectF:Landroid/graphics/RectF;

    .line 22
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallRectF:Landroid/graphics/RectF;

    .line 23
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mRandom:Ljava/util/Random;

    const/4 p1, 0x0

    .line 24
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickValue:F

    .line 25
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mIsAnimating:Z

    const p1, 0x3e4ccccd    # 0.2f

    .line 26
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mDistanceOffset:F

    .line 27
    invoke-direct {p0, p3, p2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->initShineParams(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V

    .line 28
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineButton:Ljava/lang/ref/WeakReference;

    .line 29
    new-instance p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineAnimator;

    iget-wide v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mAnimDuration:J

    iget v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineDistanceMultiple:F

    iget-wide v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickAnimDuration:J

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineAnimator;-><init>(JFJ)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineAnimator:Lcom/xuexiang/xui/widget/button/shinebutton/ShineAnimator;

    const-wide/16 p1, 0x19

    .line 30
    invoke-static {p1, p2}, Landroid/animation/ValueAnimator;->setFrameDelay(J)V

    .line 31
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint:Landroid/graphics/Paint;

    .line 32
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBigShineColor:I

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint:Landroid/graphics/Paint;

    const/high16 v0, 0x41a00000    # 20.0f

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 34
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 36
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint2:Landroid/graphics/Paint;

    const/4 v1, -0x1

    .line 37
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint2:Landroid/graphics/Paint;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 39
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint2:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 40
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaintSmall:Landroid/graphics/Paint;

    .line 41
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallShineColor:I

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaintSmall:Landroid/graphics/Paint;

    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 43
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaintSmall:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 44
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaintSmall:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    const/4 p3, 0x2

    new-array p3, p3, [F

    .line 45
    fill-array-data p3, :array_0

    invoke-static {p3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickAnimator:Landroid/animation/ValueAnimator;

    .line 46
    invoke-static {p1, p2}, Landroid/animation/ValueAnimator;->setFrameDelay(J)V

    .line 47
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickAnimator:Landroid/animation/ValueAnimator;

    iget-wide p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickAnimDuration:J

    invoke-virtual {p1, p2, p3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 48
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickAnimator:Landroid/animation/ValueAnimator;

    new-instance p2, Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/EasingInterpolator;

    sget-object p3, Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;->QUART_OUT:Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;

    invoke-direct {p2, p3}, Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/EasingInterpolator;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 49
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickAnimator:Landroid/animation/ValueAnimator;

    new-instance p2, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$1;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$1;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 50
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickAnimator:Landroid/animation/ValueAnimator;

    new-instance p2, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$2;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$2;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 51
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineAnimator:Lcom/xuexiang/xui/widget/button/shinebutton/ShineAnimator;

    new-instance p2, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$3;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$3;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f8ccccd    # 1.1f
    .end array-data
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickValue:F

    return p1
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineButton:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBtnHeight:I

    return p0
.end method

.method static synthetic access$1100(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/RectF;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mRectF:Landroid/graphics/RectF;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mDistanceOffset:F

    return p0
.end method

.method static synthetic access$1300(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/RectF;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallRectF:Landroid/graphics/RectF;

    return-object p0
.end method

.method static synthetic access$1400()[I
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->sColorRandom:[I

    return-object v0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mValue:F

    return p0
.end method

.method static synthetic access$202(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mValue:F

    return p1
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineSize:I

    return p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineDistanceMultiple:F

    return p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/Paint;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint:Landroid/graphics/Paint;

    return-object p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/Paint;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaintSmall:Landroid/graphics/Paint;

    return-object p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBtnWidth:I

    return p0
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimX:I

    return p0
.end method

.method static synthetic access$900(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimY:I

    return p0
.end method

.method private getConfigPaint(Landroid/graphics/Paint;)Landroid/graphics/Paint;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mEnableFlashing:Z

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->sColorRandom:[I

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mRandom:Ljava/util/Random;

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mColorCount:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    aget v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-object p1
.end method

.method private initShineParams(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V
    .locals 2

    .line 1
    iget v0, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineCount:I

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineCount:I

    .line 2
    iget v0, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineTurnAngle:F

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mTurnAngle:F

    .line 3
    iget v0, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->smallShineOffsetAngle:F

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallOffsetAngle:F

    .line 4
    iget-boolean v0, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->enableFlashing:Z

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mEnableFlashing:Z

    .line 5
    iget-boolean v0, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->allowRandomColor:Z

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mAllowRandomColor:Z

    .line 6
    iget v0, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineDistanceMultiple:F

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineDistanceMultiple:F

    .line 7
    iget-wide v0, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->animDuration:J

    iput-wide v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mAnimDuration:J

    .line 8
    iget-wide v0, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->clickAnimDuration:J

    iput-wide v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickAnimDuration:J

    .line 9
    iget v0, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->smallShineColor:I

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallShineColor:I

    .line 10
    iget v1, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->bigShineColor:I

    iput v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBigShineColor:I

    .line 11
    iget p1, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineSize:I

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineSize:I

    if-nez v0, :cond_0

    .line 12
    sget-object p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->sColorRandom:[I

    const/4 v0, 0x6

    aget p1, p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallShineColor:I

    :cond_0
    if-nez v1, :cond_1

    .line 13
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getColor()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBigShineColor:I

    :cond_1
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineCount:I

    const/high16 v3, 0x43b40000    # 360.0f

    const/high16 v4, 0x3f800000    # 1.0f

    if-ge v1, v2, :cond_2

    .line 3
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mAllowRandomColor:Z

    if-eqz v2, :cond_1

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint:Landroid/graphics/Paint;

    sget-object v5, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->sColorRandom:[I

    iget v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mColorCount:I

    div-int/lit8 v6, v6, 0x2

    sub-int/2addr v6, v1

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    iget v7, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mColorCount:I

    if-lt v6, v7, :cond_0

    add-int/lit8 v7, v7, -0x1

    goto :goto_1

    :cond_0
    div-int/lit8 v7, v7, 0x2

    sub-int/2addr v7, v1

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v7

    :goto_1
    aget v5, v5, v7

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 5
    :cond_1
    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mRectF:Landroid/graphics/RectF;

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineCount:I

    int-to-float v2, v2

    div-float/2addr v3, v2

    int-to-float v2, v1

    mul-float v3, v3, v2

    add-float/2addr v3, v4

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mValue:F

    sub-float/2addr v2, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mTurnAngle:F

    mul-float v2, v2, v4

    add-float v8, v3, v2

    const v9, 0x3dcccccd    # 0.1f

    const/4 v10, 0x0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint:Landroid/graphics/Paint;

    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->getConfigPaint(Landroid/graphics/Paint;)Landroid/graphics/Paint;

    move-result-object v11

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_2
    :goto_2
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineCount:I

    if-ge v0, v1, :cond_5

    .line 7
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mAllowRandomColor:Z

    if-eqz v1, :cond_4

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint:Landroid/graphics/Paint;

    sget-object v2, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->sColorRandom:[I

    iget v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mColorCount:I

    div-int/lit8 v5, v5, 0x2

    sub-int/2addr v5, v0

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    iget v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mColorCount:I

    if-lt v5, v6, :cond_3

    add-int/lit8 v6, v6, -0x1

    goto :goto_3

    :cond_3
    div-int/lit8 v6, v6, 0x2

    sub-int/2addr v6, v0

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    :goto_3
    aget v2, v2, v6

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    :cond_4
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallRectF:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineCount:I

    int-to-float v1, v1

    div-float v1, v3, v1

    int-to-float v2, v0

    mul-float v1, v1, v2

    add-float/2addr v1, v4

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mSmallOffsetAngle:F

    sub-float/2addr v1, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mValue:F

    sub-float/2addr v2, v4

    iget v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mTurnAngle:F

    mul-float v2, v2, v5

    add-float v7, v1, v2

    const v8, 0x3dcccccd    # 0.1f

    const/4 v9, 0x0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaintSmall:Landroid/graphics/Paint;

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->getConfigPaint(Landroid/graphics/Paint;)Landroid/graphics/Paint;

    move-result-object v10

    move-object v5, p1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 10
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBtnWidth:I

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickValue:F

    mul-float v1, v1, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineDistanceMultiple:F

    iget v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mDistanceOffset:F

    sub-float/2addr v2, v3

    mul-float v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 11
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickValue:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-eqz v2, :cond_6

    .line 12
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint2:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBtnWidth:I

    int-to-float v2, v2

    mul-float v2, v2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineDistanceMultiple:F

    iget v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mDistanceOffset:F

    sub-float/2addr v0, v3

    mul-float v2, v2, v0

    const/high16 v0, 0x41000000    # 8.0f

    sub-float/2addr v2, v0

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    goto :goto_4

    .line 13
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint2:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 14
    :goto_4
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimX:I

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimY:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    .line 15
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimX:I

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimY:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mPaint2:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineAnimator:Lcom/xuexiang/xui/widget/button/shinebutton/ShineAnimator;

    if-eqz p1, :cond_7

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mIsAnimating:Z

    if-nez p1, :cond_7

    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mIsAnimating:Z

    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineButton:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->showAnimation(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V

    :cond_7
    return-void
.end method

.method public showAnimation(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBtnWidth:I

    .line 2
    invoke-virtual {p1}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mBtnHeight:I

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 3
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->getLocationInWindow([I)V

    const/4 v2, 0x0

    aget v2, v1, v2

    .line 4
    invoke-virtual {p1}, Landroid/widget/ImageView;->getWidth()I

    move-result v3

    div-int/2addr v3, v0

    add-int/2addr v2, v3

    iput v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimX:I

    const/4 v2, 0x1

    aget v1, v1, v2

    .line 5
    invoke-virtual {p1}, Landroid/widget/ImageView;->getHeight()I

    move-result v2

    div-int/2addr v2, v0

    add-int/2addr v1, v2

    iput v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimY:I

    .line 6
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 8
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimX:I

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimX:I

    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimY:I

    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mCenterAnimY:I

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineAnimator:Lcom/xuexiang/xui/widget/button/shinebutton/ShineAnimator;

    new-instance v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mShineAnimator:Lcom/xuexiang/xui/widget/button/shinebutton/ShineAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->mClickAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
