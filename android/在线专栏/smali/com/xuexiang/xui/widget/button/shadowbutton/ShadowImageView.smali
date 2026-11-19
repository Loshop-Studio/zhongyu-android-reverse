.class public Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# instance fields
.field private mHeight:I

.field private mPaint:Landroid/graphics/Paint;

.field private mPaintAlpha:I

.field private mPressedColor:I

.field private mRadius:I

.field private mRectF:Landroid/graphics/RectF;

.field private mShapeType:I

.field private mWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x30

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaintAlpha:I

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 4
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x30

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaintAlpha:I

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0x30

    .line 8
    iput p3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaintAlpha:I

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->ShadowButton:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->ShadowButton_sb_color_pressed:I

    invoke-virtual {p0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$color;->default_shadow_button_color_pressed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPressedColor:I

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->ShadowButton_sb_alpha_pressed:I

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaintAlpha:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaintAlpha:I

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->ShadowButton_sb_shape_type:I

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mShapeType:I

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->ShadowButton_sb_radius:I

    invoke-virtual {p0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_shadow_button_radius:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mRadius:I

    .line 6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 7
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaint:Landroid/graphics/Paint;

    .line 8
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaint:Landroid/graphics/Paint;

    iget p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPressedColor:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setWillNotDraw(Z)V

    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 13
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setDrawingCacheEnabled(Z)V

    .line 14
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public getPressedColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPressedColor:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaint:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mShapeType:I

    if-nez v1, :cond_1

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mWidth:I

    int-to-float v2, v1

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget v4, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mHeight:I

    int-to-float v4, v4

    div-float/2addr v4, v3

    int-to-float v1, v1

    const v3, 0x4006a4a9    # 2.1038f

    div-float/2addr v1, v3

    invoke-virtual {p1, v2, v4, v1, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mRectF:Landroid/graphics/RectF;

    iget v2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mRadius:I

    int-to-float v3, v2

    int-to-float v2, v2

    invoke-virtual {p1, v1, v3, v2, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mWidth:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mHeight:I

    .line 4
    new-instance p1, Landroid/graphics/RectF;

    iget p2, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mWidth:I

    int-to-float p2, p2

    iget p3, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mHeight:I

    int-to-float p3, p3

    const/4 p4, 0x0

    invoke-direct {p1, p4, p4, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mRectF:Landroid/graphics/RectF;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaintAlpha:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    .line 6
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setPressedColor(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPaint:Landroid/graphics/Paint;

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shadowbutton/ShadowImageView;->mPressedColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method
