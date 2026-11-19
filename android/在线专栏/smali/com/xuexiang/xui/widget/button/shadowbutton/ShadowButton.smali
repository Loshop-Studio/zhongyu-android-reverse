.class public Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;
.super Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;
.source "SourceFile"


# instance fields
.field private COVER_ALPHA:I

.field private mPressedColor:I

.field private mPressedPaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x30

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->COVER_ALPHA:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x30

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->COVER_ALPHA:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x30

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->COVER_ALPHA:I

    return-void
.end method


# virtual methods
.method public getPressedColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedColor:I

    return v0
.end method

.method protected init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->ShadowButton:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->ShadowButton_sb_alpha_pressed:I

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->COVER_ALPHA:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->COVER_ALPHA:I

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->ShadowButton_sb_color_pressed:I

    .line 5
    invoke-virtual {p0}, Landroid/widget/Button;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$color;->default_shadow_button_color_pressed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 6
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedColor:I

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 8
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedPaint:Landroid/graphics/Paint;

    .line 9
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedPaint:Landroid/graphics/Paint;

    iget p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedColor:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedPaint:Landroid/graphics/Paint;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedPaint:Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->mShapeType:I

    if-nez v0, :cond_0

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->mWidth:I

    int-to-float v1, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->mHeight:I

    int-to-float v3, v3

    div-float/2addr v3, v2

    int-to-float v0, v0

    const v2, 0x4006a4a9    # 2.1038f

    div-float/2addr v0, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->mRectF:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/BaseShadowButton;->mRadius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 3
    invoke-virtual {p0}, Landroid/widget/Button;->invalidate()V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->COVER_ALPHA:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 5
    invoke-virtual {p0}, Landroid/widget/Button;->invalidate()V

    .line 6
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/Button;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setPressedColor(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowButton;->mPressedColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/Button;->invalidate()V

    return-void
.end method
