.class public Lcom/xuexiang/xui/widget/picker/RulerView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/picker/RulerView$OnChooseResultListener;
    }
.end annotation


# instance fields
.field private mBgColor:I

.field private mBgPaint:Landroid/graphics/Paint;

.field private mBgRect:Landroid/graphics/RectF;

.field private mComputeScale:F

.field public mCurrentScale:F

.field private mDownX:F

.field private mFirstScale:F

.field private mHeight:I

.field private mIsBgRoundRect:Z

.field private mIsUp:Z

.field private mKgRect:Landroid/graphics/Rect;

.field private mLagScaleHeight:I

.field private mLagScalePaint:Landroid/graphics/Paint;

.field private mLargeScaleColor:I

.field private mLargeScaleStroke:I

.field private mLastMoveX:F

.field private mMaxScale:I

.field private mMidScaleColor:I

.field private mMidScaleHeight:I

.field private mMidScalePaint:Landroid/graphics/Paint;

.field private mMidScaleStroke:I

.field private mMinScale:I

.field private mMoveX:F

.field private mOnChooseResultListener:Lcom/xuexiang/xui/widget/picker/RulerView$OnChooseResultListener;

.field private mResultNumColor:I

.field private mResultNumPaint:Landroid/text/TextPaint;

.field private mResultNumRect:Landroid/graphics/Rect;

.field private mResultNumTextSize:I

.field private mResultText:Ljava/lang/String;

.field private mRoundRadius:I

.field private mRulerHeight:I

.field private mRulerToResultGap:I

.field private mScaleCount:I

.field private mScaleGap:I

.field private mScaleLimit:I

.field private mScaleNumColor:I

.field private mScaleNumPaint:Landroid/text/TextPaint;

.field private mScaleNumRect:Landroid/graphics/Rect;

.field private mScaleNumTextSize:I

.field private mShowScaleResult:Z

.field private mSmallScaleColor:I

.field private mSmallScaleHeight:I

.field private mSmallScalePaint:Landroid/graphics/Paint;

.field private mSmallScaleStroke:I

.field private mUnit:Ljava/lang/String;

.field private mUnitColor:I

.field private mUnitPaint:Landroid/text/TextPaint;

.field private mUnitTextSize:I

.field private mValueAnimator:Landroid/animation/ValueAnimator;

.field private mVelocityTracker:Landroid/view/VelocityTracker;

.field private mWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->RulerViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleLimit:I

    const/16 v1, 0x32

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerHeight:I

    .line 6
    div-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerToResultGap:I

    const/16 v1, 0xa

    .line 7
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleCount:I

    .line 8
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    const/4 v2, 0x0

    .line 9
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMinScale:I

    const/high16 v3, 0x42480000    # 50.0f

    .line 10
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mFirstScale:F

    const/16 v4, 0x64

    .line 11
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMaxScale:I

    const-string v4, "kg"

    .line 12
    iput-object v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnit:Ljava/lang/String;

    const/4 v4, 0x2

    .line 13
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScaleStroke:I

    const/4 v4, 0x3

    .line 14
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScaleStroke:I

    const/4 v4, 0x5

    .line 15
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLargeScaleStroke:I

    const/16 v4, 0x14

    .line 16
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumTextSize:I

    const/16 v4, 0x10

    .line 17
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumTextSize:I

    const/16 v4, 0xd

    .line 18
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitTextSize:I

    .line 19
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mShowScaleResult:Z

    .line 20
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mIsBgRoundRect:Z

    .line 21
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRoundRadius:I

    const/high16 v0, -0x40800000    # -1.0f

    .line 22
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mComputeScale:F

    .line 23
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mCurrentScale:F

    .line 24
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 25
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mFirstScale:F

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultText:Ljava/lang/String;

    const/4 v0, 0x0

    .line 26
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    .line 27
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLastMoveX:F

    .line 28
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mIsUp:Z

    .line 29
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/picker/RulerView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/RulerView;->init()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/picker/RulerView;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    return p0
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/picker/RulerView;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    return p1
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/picker/RulerView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mWidth:I

    return p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/picker/RulerView;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMaxScale:I

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/picker/RulerView;F)F
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->getWhichScaleMoveX(F)F

    move-result p0

    return p0
.end method

.method static synthetic access$402(Lcom/xuexiang/xui/widget/picker/RulerView;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLastMoveX:F

    return p1
.end method

.method static synthetic access$502(Lcom/xuexiang/xui/widget/picker/RulerView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mIsUp:Z

    return p1
.end method

.method static synthetic access$602(Lcom/xuexiang/xui/widget/picker/RulerView;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mComputeScale:F

    return p1
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/picker/RulerView;)Lcom/xuexiang/xui/widget/picker/RulerView$OnChooseResultListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mOnChooseResultListener:Lcom/xuexiang/xui/widget/picker/RulerView$OnChooseResultListener;

    return-object p0
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/picker/RulerView;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultText:Ljava/lang/String;

    return-object p0
.end method

.method private autoVelocityScroll(I)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x32

    if-ge v0, v2, :cond_0

    .line 2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mIsUp:Z

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v2, 0x0

    aput v2, v0, v2

    .line 4
    div-int/lit8 v2, p1, 0x14

    aput v2, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    div-int/lit8 p1, p1, 0xa

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    .line 5
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    new-instance v0, Lcom/xuexiang/xui/widget/picker/RulerView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/picker/RulerView$1;-><init>(Lcom/xuexiang/xui/widget/picker/RulerView;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    new-instance v0, Lcom/xuexiang/xui/widget/picker/RulerView$2;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/picker/RulerView$2;-><init>(Lcom/xuexiang/xui/widget/picker/RulerView;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private computeScrollTo(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleLimit:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMinScale:I

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMaxScale:I

    int-to-float v0, v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mComputeScale:F

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1
    :goto_0
    return-void
.end method

.method private drawBg(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgRect:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mWidth:I

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mHeight:I

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mIsBgRoundRect:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgRect:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRoundRadius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgRect:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method private drawResultText(Landroid/graphics/Canvas;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mShowScaleResult:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerToResultGap:I

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumPaint:Landroid/text/TextPaint;

    const/4 v1, 0x0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumRect:Landroid/graphics/Rect;

    invoke-virtual {v0, p2, v1, v2, v4}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mWidth:I

    int-to-float v0, v0

    div-float/2addr v0, v3

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v3

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 5
    iget p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mWidth:I

    div-int/lit8 p2, p2, 0x2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr p2, v0

    add-int/lit8 p2, p2, 0xa

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnit:Ljava/lang/String;

    int-to-float p2, p2

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mKgRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, v0, p2, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method private drawScaleAndNum(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mShowScaleResult:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerToResultGap:I

    add-int/2addr v0, v2

    int-to-float v0, v0

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mFirstScale:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v4, v0, v3

    if-eqz v4, :cond_1

    .line 3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->getWhichScaleMoveX(F)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLastMoveX:F

    .line 5
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mFirstScale:F

    .line 6
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mComputeScale:F

    const/4 v4, 0x2

    const/4 v5, 0x1

    cmpl-float v0, v0, v3

    if-eqz v0, :cond_2

    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLastMoveX:F

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_2

    new-array v0, v4, [F

    .line 9
    iget v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mCurrentScale:F

    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/picker/RulerView;->getWhichScaleMoveX(F)F

    move-result v3

    aput v3, v0, v1

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mComputeScale:F

    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/picker/RulerView;->getWhichScaleMoveX(F)F

    move-result v3

    aput v3, v0, v5

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    .line 10
    new-instance v3, Lcom/xuexiang/xui/widget/picker/RulerView$3;

    invoke-direct {v3, p0}, Lcom/xuexiang/xui/widget/picker/RulerView$3;-><init>(Lcom/xuexiang/xui/widget/picker/RulerView;)V

    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    new-instance v3, Lcom/xuexiang/xui/widget/picker/RulerView$4;

    invoke-direct {v3, p0}, Lcom/xuexiang/xui/widget/picker/RulerView$4;-><init>(Lcom/xuexiang/xui/widget/picker/RulerView;)V

    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mComputeScale:F

    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/picker/RulerView;->getWhichScaleMoveX(F)F

    move-result v3

    iget v6, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mCurrentScale:F

    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/picker/RulerView;->getWhichScaleMoveX(F)F

    move-result v6

    sub-float/2addr v3, v6

    const/high16 v6, 0x42c80000    # 100.0f

    div-float/2addr v3, v6

    float-to-long v6, v3

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 14
    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    int-to-float v6, v3

    div-float v6, v0, v6

    float-to-int v6, v6

    neg-int v6, v6

    int-to-float v3, v3

    rem-float/2addr v0, v3

    .line 15
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 16
    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mIsUp:Z

    const/high16 v7, 0x40000000    # 2.0f

    if-eqz v3, :cond_6

    .line 17
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mWidth:I

    int-to-float v3, v3

    div-float/2addr v3, v7

    iget v6, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    int-to-float v8, v6

    rem-float/2addr v3, v8

    sub-float/2addr v0, v3

    int-to-float v3, v6

    rem-float/2addr v0, v3

    cmpg-float v3, v0, v2

    if-gtz v3, :cond_3

    int-to-float v3, v6

    .line 18
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sub-float v0, v3, v0

    .line 19
    :cond_3
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-int v3, v3

    .line 20
    iget v6, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    int-to-float v6, v6

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v8

    sub-float/2addr v6, v8

    float-to-int v6, v6

    .line 21
    iget v8, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    int-to-float v8, v8

    div-float/2addr v8, v7

    cmpg-float v0, v0, v8

    if-gtz v0, :cond_4

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    int-to-float v3, v3

    sub-float/2addr v0, v3

    goto :goto_1

    :cond_4
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    int-to-float v3, v6

    add-float/2addr v0, v3

    .line 22
    :goto_1
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v3

    if-nez v3, :cond_5

    new-array v3, v4, [F

    .line 23
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    aput v4, v3, v1

    aput v0, v3, v5

    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    .line 24
    new-instance v3, Lcom/xuexiang/xui/widget/picker/RulerView$5;

    invoke-direct {v3, p0}, Lcom/xuexiang/xui/widget/picker/RulerView$5;-><init>(Lcom/xuexiang/xui/widget/picker/RulerView;)V

    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    new-instance v3, Lcom/xuexiang/xui/widget/picker/RulerView$6;

    invoke-direct {v3, p0}, Lcom/xuexiang/xui/widget/picker/RulerView$6;-><init>(Lcom/xuexiang/xui/widget/picker/RulerView;)V

    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v3, 0x12c

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 27
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 28
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mIsUp:Z

    .line 29
    :cond_5
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    int-to-float v4, v3

    div-float v4, v0, v4

    neg-float v4, v4

    float-to-int v6, v4

    int-to-float v3, v3

    rem-float/2addr v0, v3

    .line 30
    :cond_6
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 31
    new-instance v0, Ljava/lang/ref/WeakReference;

    new-instance v3, Ljava/math/BigDecimal;

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mWidth:I

    int-to-float v4, v4

    div-float/2addr v4, v7

    iget v8, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    sub-float/2addr v4, v8

    iget v8, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    iget v9, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleCount:I

    mul-int v8, v8, v9

    int-to-float v8, v8

    div-float/2addr v4, v8

    iget v8, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMinScale:I

    int-to-float v8, v8

    add-float/2addr v4, v8

    iget v8, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleLimit:I

    int-to-float v8, v8

    mul-float v4, v4, v8

    float-to-double v8, v4

    invoke-direct {v3, v8, v9}, Ljava/math/BigDecimal;-><init>(D)V

    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/math/BigDecimal;

    const/4 v3, 0x4

    invoke-virtual {v0, v5, v3}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mCurrentScale:F

    .line 32
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultText:Ljava/lang/String;

    .line 33
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mOnChooseResultListener:Lcom/xuexiang/xui/widget/picker/RulerView$OnChooseResultListener;

    if-eqz v3, :cond_7

    .line 34
    invoke-interface {v3, v0}, Lcom/xuexiang/xui/widget/picker/RulerView$OnChooseResultListener;->onScrollResult(Ljava/lang/String;)V

    :cond_7
    const/4 v0, 0x0

    .line 35
    :goto_2
    iget v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mWidth:I

    if-ge v0, v3, :cond_e

    .line 36
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleCount:I

    rem-int v4, v6, v4

    if-nez v4, :cond_a

    .line 37
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    cmpl-float v8, v4, v2

    if-ltz v8, :cond_8

    int-to-float v8, v0

    iget v9, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    int-to-float v9, v9

    sub-float/2addr v4, v9

    cmpg-float v4, v8, v4

    if-ltz v4, :cond_d

    :cond_8
    int-to-float v3, v3

    div-float/2addr v3, v7

    int-to-float v4, v0

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMaxScale:I

    add-int/2addr v4, v5

    int-to-float v4, v4

    invoke-direct {p0, v4}, Lcom/xuexiang/xui/widget/picker/RulerView;->getWhichScaleMoveX(F)F

    move-result v4

    iget v8, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    sub-float/2addr v4, v8

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_9

    goto/16 :goto_3

    :cond_9
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 38
    iget v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScaleHeight:I

    int-to-float v12, v3

    iget-object v13, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScalePaint:Landroid/graphics/Paint;

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 39
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumPaint:Landroid/text/TextPaint;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget v8, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    div-int v8, v6, v8

    iget v9, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMinScale:I

    add-int/2addr v8, v9

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ""

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget v10, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    div-int v10, v6, v10

    iget v11, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMinScale:I

    add-int/2addr v10, v11

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    iget-object v10, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumRect:Landroid/graphics/Rect;

    invoke-virtual {v3, v4, v1, v9, v10}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleCount:I

    div-int v4, v6, v4

    iget v9, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMinScale:I

    add-int/2addr v4, v9

    iget v9, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleLimit:I

    mul-int v4, v4, v9

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumRect:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    div-float/2addr v4, v7

    iget v8, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLagScaleHeight:I

    int-to-float v9, v8

    iget v10, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerHeight:I

    sub-int/2addr v10, v8

    int-to-float v8, v10

    div-float/2addr v8, v7

    add-float/2addr v9, v8

    iget-object v8, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumRect:Landroid/graphics/Rect;

    .line 41
    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    move-result v8

    int-to-float v8, v8

    add-float/2addr v9, v8

    iget-object v8, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumPaint:Landroid/text/TextPaint;

    .line 42
    invoke-virtual {p1, v3, v4, v9, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_3

    .line 43
    :cond_a
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    cmpl-float v8, v4, v2

    if-ltz v8, :cond_b

    int-to-float v8, v0

    cmpg-float v4, v8, v4

    if-ltz v4, :cond_d

    :cond_b
    int-to-float v3, v3

    div-float/2addr v3, v7

    int-to-float v4, v0

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMaxScale:I

    int-to-float v4, v4

    invoke-direct {p0, v4}, Lcom/xuexiang/xui/widget/picker/RulerView;->getWhichScaleMoveX(F)F

    move-result v4

    iget v8, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    sub-float/2addr v4, v8

    cmpg-float v3, v3, v4

    if-gez v3, :cond_c

    goto :goto_3

    :cond_c
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 44
    iget v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScaleHeight:I

    int-to-float v12, v3

    iget-object v13, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScalePaint:Landroid/graphics/Paint;

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_d
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 45
    iget v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    add-int/2addr v0, v3

    int-to-float v3, v3

    .line 46
    invoke-virtual {p1, v3, v2}, Landroid/graphics/Canvas;->translate(FF)V

    goto/16 :goto_2

    .line 47
    :cond_e
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 48
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mWidth:I

    int-to-float v1, v0

    div-float v9, v1, v7

    const/4 v10, 0x0

    int-to-float v0, v0

    div-float v11, v0, v7

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLagScaleHeight:I

    int-to-float v12, v0

    iget-object v13, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLagScalePaint:Landroid/graphics/Paint;

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private getWhichScaleMoveX(F)F
    .locals 3

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mWidth:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleCount:I

    mul-int v1, v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMinScale:I

    int-to-float v2, v2

    sub-float/2addr p1, v2

    mul-float v1, v1, p1

    sub-float/2addr v0, v1

    return v0
.end method

.method private init()V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgPaint:Landroid/graphics/Paint;

    .line 2
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScalePaint:Landroid/graphics/Paint;

    .line 3
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScalePaint:Landroid/graphics/Paint;

    .line 4
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLagScalePaint:Landroid/graphics/Paint;

    .line 5
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumPaint:Landroid/text/TextPaint;

    .line 6
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumPaint:Landroid/text/TextPaint;

    .line 7
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitPaint:Landroid/text/TextPaint;

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgPaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgColor:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScalePaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScaleColor:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScalePaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScaleColor:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLagScalePaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLargeScaleColor:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumPaint:Landroid/text/TextPaint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumColor:I

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setColor(I)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumPaint:Landroid/text/TextPaint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumColor:I

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setColor(I)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitPaint:Landroid/text/TextPaint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitColor:I

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setColor(I)V

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumPaint:Landroid/text/TextPaint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitPaint:Landroid/text/TextPaint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgPaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScalePaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScalePaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 20
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLagScalePaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLagScalePaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScalePaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScalePaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScalePaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScaleStroke:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScalePaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScaleStroke:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLagScalePaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLargeScaleStroke:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 27
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumPaint:Landroid/text/TextPaint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumTextSize:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitPaint:Landroid/text/TextPaint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitTextSize:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 29
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumPaint:Landroid/text/TextPaint;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumTextSize:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 30
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgRect:Landroid/graphics/RectF;

    .line 31
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumRect:Landroid/graphics/Rect;

    .line 32
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumRect:Landroid/graphics/Rect;

    .line 33
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mKgRect:Landroid/graphics/Rect;

    .line 34
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumPaint:Landroid/text/TextPaint;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultText:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumRect:Landroid/graphics/Rect;

    const/4 v5, 0x0

    invoke-virtual {v0, v2, v5, v3, v4}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 35
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitPaint:Landroid/text/TextPaint;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultText:Ljava/lang/String;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mKgRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v2, v5, v1, v3}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 36
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerHeight:I

    div-int/lit8 v1, v0, 0x4

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScaleHeight:I

    .line 37
    div-int/lit8 v1, v0, 0x2

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScaleHeight:I

    .line 38
    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x5

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLagScaleHeight:I

    .line 39
    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->RulerView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_scaleLimit:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleLimit:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleLimit:I

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_rulerHeight:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerHeight:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerHeight:I

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_rulerToResultGap:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerToResultGap:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v1, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerToResultGap:I

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_scaleCount:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleCount:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleCount:I

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_scaleGap:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v1, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_minScale:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMinScale:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleLimit:I

    div-int/2addr p2, p3

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMinScale:I

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_firstScale:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mFirstScale:F

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleLimit:I

    int-to-float p3, p3

    div-float/2addr p2, p3

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mFirstScale:F

    .line 9
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_maxScale:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMaxScale:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleLimit:I

    div-int/2addr p2, p3

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMaxScale:I

    .line 10
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_bgColor:I

    sget p3, Lcom/xuexiang/xui/R$color;->default_ruler_view_bg_color:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgColor:I

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_smallScaleColor:I

    sget p3, Lcom/xuexiang/xui/R$color;->default_ruler_view_small_scale_color:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScaleColor:I

    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_midScaleColor:I

    sget p3, Lcom/xuexiang/xui/R$color;->default_ruler_view_mid_scale_color:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScaleColor:I

    .line 13
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_largeScaleColor:I

    sget p3, Lcom/xuexiang/xui/R$color;->default_ruler_view_large_scale_color:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLargeScaleColor:I

    .line 14
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_scaleNumColor:I

    sget p3, Lcom/xuexiang/xui/R$color;->default_ruler_view_scale_num_color:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumColor:I

    .line 15
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_resultNumColor:I

    sget p3, Lcom/xuexiang/xui/R$color;->default_ruler_view_result_num_color:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumColor:I

    .line 16
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_unitColor:I

    sget p3, Lcom/xuexiang/xui/R$color;->default_ruler_view_unit_color:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitColor:I

    .line 17
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnit:Ljava/lang/String;

    .line 18
    sget p3, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_unit:I

    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnit:Ljava/lang/String;

    .line 19
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 20
    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnit:Ljava/lang/String;

    .line 21
    :cond_0
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_smallScaleStroke:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScaleStroke:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v1, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScaleStroke:I

    .line 22
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_midScaleStroke:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScaleStroke:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v1, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScaleStroke:I

    .line 23
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_largeScaleStroke:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLargeScaleStroke:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v1, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLargeScaleStroke:I

    .line 24
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_resultNumTextSize:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumTextSize:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v2, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumTextSize:I

    .line 25
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_scaleNumTextSize:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumTextSize:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v2, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumTextSize:I

    .line 26
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_unitTextSize:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitTextSize:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v2, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitTextSize:I

    .line 27
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_showScaleResult:I

    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mShowScaleResult:Z

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mShowScaleResult:Z

    .line 28
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_isBgRoundRect:I

    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mIsBgRoundRect:Z

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mIsBgRoundRect:Z

    .line 29
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_roundRadius:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRoundRadius:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v1, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRoundRadius:I

    .line 30
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public getCurrentValue()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mCurrentScale:F

    return v0
.end method

.method public getSelectValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultText:Ljava/lang/String;

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->drawBg(Landroid/graphics/Canvas;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->drawScaleAndNum(Landroid/graphics/Canvas;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultText:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->drawResultText(Landroid/graphics/Canvas;Ljava/lang/String;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    if-eqz v0, :cond_0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    add-int/2addr p2, v0

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mHeight:I

    goto :goto_1

    .line 6
    :cond_1
    iget p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerHeight:I

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mShowScaleResult:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    add-int/2addr p2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerToResultGap:I

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    add-int/2addr p2, v0

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mHeight:I

    .line 7
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    add-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mWidth:I

    .line 8
    iget p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mHeight:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    const/4 v2, 0x0

    .line 4
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mIsUp:Z

    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mVelocityTracker:Landroid/view/VelocityTracker;

    const/16 v3, 0x1f4

    invoke-virtual {v2, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v2, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-eqz v2, :cond_4

    if-eq v2, v1, :cond_3

    const/4 p1, 0x2

    if-eq v2, p1, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mDownX:F

    sub-float/2addr v0, p1

    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLastMoveX:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    .line 9
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mWidth:I

    int-to-float v2, p1

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    cmpl-float v2, v0, v2

    if-ltz v2, :cond_2

    int-to-float p1, p1

    div-float/2addr p1, v3

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    goto :goto_0

    .line 11
    :cond_2
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMaxScale:I

    int-to-float p1, p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->getWhichScaleMoveX(F)F

    move-result p1

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_6

    .line 12
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMaxScale:I

    int-to-float p1, p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->getWhichScaleMoveX(F)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    goto :goto_0

    .line 13
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMoveX:F

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLastMoveX:F

    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    float-to-int p1, p1

    .line 15
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->autoVelocityScroll(I)V

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    goto :goto_0

    .line 17
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 20
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mDownX:F

    .line 21
    :cond_6
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v1
.end method

.method public setBgColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mBgColor:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setCurrentValue(F)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->computeScrollTo(F)V

    return-void
.end method

.method public setFirstScale(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mFirstScale:F

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setIsBgRoundRect(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mIsBgRoundRect:Z

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setLargeScaleColor(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLargeScaleColor:I

    return-void
.end method

.method public setLargeScaleStroke(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mLargeScaleStroke:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMaxScale(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMaxScale:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMidScaleColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScaleColor:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMidScaleStroke(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMidScaleStroke:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMinScale(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mMinScale:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setOnChooseResultListener(Lcom/xuexiang/xui/widget/picker/RulerView$OnChooseResultListener;)Lcom/xuexiang/xui/widget/picker/RulerView;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mOnChooseResultListener:Lcom/xuexiang/xui/widget/picker/RulerView$OnChooseResultListener;

    return-object p0
.end method

.method public setResultNumColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumColor:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setResultNumTextSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumTextSize:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setRulerHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerHeight:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setRulerToResultGap(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mRulerToResultGap:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setScaleCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleCount:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setScaleGap(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleGap:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setScaleLimit(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleLimit:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setScaleNumColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumColor:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setScaleNumTextSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumTextSize:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setShowScaleResult(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mShowScaleResult:Z

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setSmallScaleColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScaleColor:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setSmallScaleStroke(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mSmallScaleStroke:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mResultNumPaint:Landroid/text/TextPaint;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitPaint:Landroid/text/TextPaint;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mScaleNumPaint:Landroid/text/TextPaint;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_2
    return-void
.end method

.method public setUnit(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnit:Ljava/lang/String;

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setUnitColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitColor:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setUnitTextSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->mUnitTextSize:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
