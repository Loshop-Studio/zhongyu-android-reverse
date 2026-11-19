.class public Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;
.super Landroid/graphics/drawable/GradientDrawable;
.source "SourceFile"


# instance fields
.field private mFillColors:Landroid/content/res/ColorStateList;

.field private mRadiusAdjustBounds:Z

.field private mStrokeColors:Landroid/content/res/ColorStateList;

.field private mStrokeWidth:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mRadiusAdjustBounds:Z

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mStrokeWidth:I

    return-void
.end method

.method public static fromAttributeSet(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;
    .locals 9

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->RoundButton:[I

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$styleable;->RoundButton_rb_backgroundColor:I

    invoke-static {p0, p1, v0}, Lcom/xuexiang/xui/utils/ResUtils;->getColorStateListAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 3
    sget v1, Lcom/xuexiang/xui/R$styleable;->RoundButton_rb_borderColor:I

    invoke-static {p0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getColorStateListAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    .line 4
    sget v1, Lcom/xuexiang/xui/R$styleable;->RoundButton_rb_borderWidth:I

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_rb_border_width:I

    invoke-static {v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    .line 5
    sget v2, Lcom/xuexiang/xui/R$styleable;->RoundButton_rb_isRadiusAdjustBounds:I

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    .line 6
    sget v4, Lcom/xuexiang/xui/R$styleable;->RoundButton_rb_radius:I

    sget v5, Lcom/xuexiang/xui/R$dimen;->default_rb_radius:I

    invoke-static {v5}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v5

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    .line 7
    sget v5, Lcom/xuexiang/xui/R$styleable;->RoundButton_rb_radiusTopLeft:I

    invoke-virtual {p1, v5, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    .line 8
    sget v6, Lcom/xuexiang/xui/R$styleable;->RoundButton_rb_radiusTopRight:I

    invoke-virtual {p1, v6, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    .line 9
    sget v7, Lcom/xuexiang/xui/R$styleable;->RoundButton_rb_radiusBottomLeft:I

    invoke-virtual {p1, v7, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    .line 10
    sget v8, Lcom/xuexiang/xui/R$styleable;->RoundButton_rb_radiusBottomRight:I

    invoke-virtual {p1, v8, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    .line 11
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 12
    new-instance p1, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;-><init>()V

    .line 13
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->setBgData(Landroid/content/res/ColorStateList;)V

    .line 14
    invoke-virtual {p1, v1, p0}, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->setStrokeData(ILandroid/content/res/ColorStateList;)V

    .line 15
    invoke-virtual {p1, v2}, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->setIsRadiusAdjustBounds(Z)V

    if-gtz v5, :cond_1

    if-gtz v6, :cond_1

    if-gtz v7, :cond_1

    if-lez v8, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p0, v4

    .line 16
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    goto :goto_1

    :cond_1
    :goto_0
    const/16 p0, 0x8

    new-array p0, p0, [F

    int-to-float v0, v5

    aput v0, p0, v3

    const/4 v1, 0x1

    aput v0, p0, v1

    const/4 v0, 0x2

    int-to-float v1, v6

    aput v1, p0, v0

    const/4 v0, 0x3

    aput v1, p0, v0

    const/4 v0, 0x4

    int-to-float v1, v8

    aput v1, p0, v0

    const/4 v0, 0x5

    aput v1, p0, v0

    const/4 v0, 0x6

    int-to-float v1, v7

    aput v1, p0, v0

    const/4 v0, 0x7

    aput v1, p0, v0

    .line 17
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    :goto_1
    return-object p1
.end method

.method private hasNativeStateListAPI()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public isStateful()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mFillColors:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mStrokeColors:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    :cond_1
    invoke-super {p0}, Landroid/graphics/drawable/GradientDrawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mRadiusAdjustBounds:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-float p1, p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    :cond_0
    return-void
.end method

.method protected onStateChange([I)Z
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->onStateChange([I)Z

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mFillColors:Landroid/content/res/ColorStateList;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    .line 4
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/4 v0, 0x1

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mStrokeColors:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mStrokeWidth:I

    invoke-virtual {p0, v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    return v2
.end method

.method public setBgData(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->hasNativeStateListAPI()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    goto :goto_1

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mFillColors:Landroid/content/res/ColorStateList;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/GradientDrawable;->getState()[I

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    .line 5
    :goto_0
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :goto_1
    return-void
.end method

.method public setIsRadiusAdjustBounds(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mRadiusAdjustBounds:Z

    return-void
.end method

.method public setStrokeData(ILandroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->hasNativeStateListAPI()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(ILandroid/content/res/ColorStateList;)V

    goto :goto_1

    .line 3
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mStrokeWidth:I

    .line 4
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/roundbutton/RoundDrawable;->mStrokeColors:Landroid/content/res/ColorStateList;

    const/4 v0, 0x0

    if-nez p2, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/GradientDrawable;->getState()[I

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    .line 6
    :goto_0
    invoke-virtual {p0, p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :goto_1
    return-void
.end method
