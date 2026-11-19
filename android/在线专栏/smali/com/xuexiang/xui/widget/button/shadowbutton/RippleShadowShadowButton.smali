.class public Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;
.super Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;
.source "SourceFile"


# static fields
.field private static final RIPPLE_ALPHA:I = 0x2f


# instance fields
.field private mPath:Landroid/graphics/Path;

.field private mRectF:Landroid/graphics/RectF;

.field private mRippleAlpha:I

.field private mRippleColor:I

.field private mRippleDuration:I

.field private mRipplePaint:Landroid/graphics/Paint;

.field private mRippleRadius:I

.field private mRoundRadius:I

.field private mTask:Ljava/util/TimerTask;

.field private mTimer:Ljava/util/Timer;

.field private pointX:F

.field private pointY:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private drawFillCircle(Landroid/graphics/Canvas;)V
    .locals 6

    if-eqz p1, :cond_3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->pointX:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->pointY:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    .line 2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v2

    .line 4
    iget v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->pointX:F

    int-to-float v4, v0

    sub-float/2addr v4, v3

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    .line 5
    iget v4, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->pointY:F

    int-to-float v5, v2

    sub-float/2addr v5, v4

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    mul-float v3, v3, v3

    mul-float v4, v4, v4

    add-float/2addr v3, v4

    float-to-double v3, v3

    .line 6
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    double-to-float v3, v3

    .line 7
    iget v4, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleRadius:I

    int-to-float v5, v4

    cmpl-float v5, v5, v3

    if-lez v5, :cond_0

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->onCompleteDrawRipple()V

    return-void

    .line 9
    :cond_0
    iget v5, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleDuration:I

    int-to-float v5, v5

    div-float/2addr v3, v5

    const/high16 v5, 0x420c0000    # 35.0f

    mul-float v3, v3, v5

    int-to-float v4, v4

    add-float/2addr v4, v3

    float-to-int v3, v4

    .line 10
    iput v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleRadius:I

    .line 11
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 12
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mPath:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 13
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mPath:Landroid/graphics/Path;

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 14
    iget v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->mShapeType:I

    if-nez v3, :cond_1

    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mPath:Landroid/graphics/Path;

    shr-int/lit8 v0, v0, 0x1

    int-to-float v0, v0

    shr-int/lit8 v2, v2, 0x1

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->mWidth:I

    shr-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    sget-object v4, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v0, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRectF:Landroid/graphics/RectF;

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->mWidth:I

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->mHeight:I

    int-to-float v3, v3

    invoke-virtual {v0, v1, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRectF:Landroid/graphics/RectF;

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRoundRadius:I

    int-to-float v3, v2

    int-to-float v2, v2

    sget-object v4, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 18
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mPath:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    goto :goto_1

    .line 20
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mPath:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->REPLACE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 21
    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->pointX:F

    iget v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->pointY:F

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleRadius:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRipplePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 22
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_3
    return-void
.end method

.method private onCompleteDrawRipple()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mTimer:Ljava/util/Timer;

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mTask:Ljava/util/TimerTask;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_1
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleRadius:I

    return-void
.end method

.method private onStartDrawRipple()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->onCompleteDrawRipple()V

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton$1;-><init>(Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mTask:Ljava/util/TimerTask;

    .line 3
    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mTimer:Ljava/util/Timer;

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mTask:Ljava/util/TimerTask;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x1e

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method


# virtual methods
.method public getRippleAlpha()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleAlpha:I

    return v0
.end method

.method public getRippleColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleColor:I

    return v0
.end method

.method public getRippleDuration()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleDuration:I

    return v0
.end method

.method public getRippleRadius()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleRadius:I

    return v0
.end method

.method public getRoundRadius()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRoundRadius:I

    return v0
.end method

.method protected init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->ShadowButton:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->ShadowButton_sb_ripple_color:I

    invoke-virtual {p0}, Landroid/widget/Button;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$color;->default_shadow_button_ripple_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleColor:I

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->ShadowButton_sb_ripple_alpha:I

    const/16 v0, 0x2f

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleAlpha:I

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->ShadowButton_sb_ripple_duration:I

    const/16 v0, 0x3e8

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleDuration:I

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->ShadowButton_sb_shape_type:I

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->mShapeType:I

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->ShadowButton_sb_radius:I

    invoke-virtual {p0}, Landroid/widget/Button;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_shadow_button_radius:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRoundRadius:I

    .line 8
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 9
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRipplePaint:Landroid/graphics/Paint;

    .line 10
    iget p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleColor:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRipplePaint:Landroid/graphics/Paint;

    iget p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleAlpha:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRipplePaint:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRipplePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 14
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mPath:Landroid/graphics/Path;

    .line 15
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRectF:Landroid/graphics/RectF;

    const/high16 p1, -0x40800000    # -1.0f

    .line 16
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->pointX:F

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->pointY:F

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->onCompleteDrawRipple()V

    .line 2
    invoke-super {p0}, Landroid/widget/Button;->onDetachedFromWindow()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRipplePaint:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->drawFillCircle(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->pointX:F

    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->pointY:F

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->onStartDrawRipple()V

    .line 5
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Button;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setRippleAlpha(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleAlpha:I

    return-void
.end method

.method public setRippleColor(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleColor:I

    return-void
.end method

.method public setRippleDuration(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleDuration:I

    return-void
.end method

.method public setRippleRadius(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRippleRadius:I

    return-void
.end method

.method public setRoundRadius(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/RippleShadowShadowButton;->mRoundRadius:I

    .line 2
    invoke-virtual {p0}, Landroid/widget/Button;->invalidate()V

    return-void
.end method
