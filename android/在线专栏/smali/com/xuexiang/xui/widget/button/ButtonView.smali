.class public Lcom/xuexiang/xui/widget/button/ButtonView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# instance fields
.field private gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

.field private mNormalSolidColor:I

.field private mSelectedSolidColor:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/ButtonView;->setAttributeSet(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/ButtonView;->setAttributeSet(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private setAttributeSet(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 11

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->ButtonView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->ButtonView_textSolidColor:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->mNormalSolidColor:I

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->ButtonView_textSelectedSolidColor:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->mSelectedSolidColor:I

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->ButtonView_textStrokeColor:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    .line 5
    sget v1, Lcom/xuexiang/xui/R$styleable;->ButtonView_textRadius:I

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    .line 6
    sget v2, Lcom/xuexiang/xui/R$styleable;->ButtonView_textLeftTopRadius:I

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 7
    sget v3, Lcom/xuexiang/xui/R$styleable;->ButtonView_textLeftBottomRadius:I

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 8
    sget v4, Lcom/xuexiang/xui/R$styleable;->ButtonView_textRightTopRadius:I

    invoke-virtual {p1, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    .line 9
    sget v5, Lcom/xuexiang/xui/R$styleable;->ButtonView_textRightBottomRadius:I

    invoke-virtual {p1, v5, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    .line 10
    sget v6, Lcom/xuexiang/xui/R$styleable;->ButtonView_textStrokeWidth:I

    invoke-virtual {p1, v6, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    .line 11
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v7

    sget v8, Lcom/xuexiang/xui/R$styleable;->ButtonView_textDrawable:I

    invoke-static {v7, p1, v8}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 12
    sget v8, Lcom/xuexiang/xui/R$styleable;->ButtonView_textNormalTextColor:I

    invoke-virtual {p1, v8, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    .line 13
    sget v9, Lcom/xuexiang/xui/R$styleable;->ButtonView_textSelectedTextColor:I

    invoke-virtual {p1, v9, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v9

    .line 14
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 15
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    .line 16
    invoke-virtual {p1, v6, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 17
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget p2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->mNormalSolidColor:I

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/4 p1, 0x3

    const/4 p2, 0x2

    const/4 v6, 0x1

    if-lez v1, :cond_0

    .line 18
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    int-to-float v1, v1

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    goto :goto_0

    :cond_0
    if-gtz v2, :cond_1

    if-gtz v3, :cond_1

    if-gtz v4, :cond_1

    if-lez v5, :cond_2

    .line 19
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    const/16 v10, 0x8

    new-array v10, v10, [F

    int-to-float v2, v2

    aput v2, v10, v0

    aput v2, v10, v6

    int-to-float v2, v4

    aput v2, v10, p2

    aput v2, v10, p1

    const/4 v2, 0x4

    int-to-float v4, v5

    aput v4, v10, v2

    const/4 v2, 0x5

    aput v4, v10, v2

    const/4 v2, 0x6

    int-to-float v3, v3

    aput v3, v10, v2

    const/4 v2, 0x7

    aput v3, v10, v2

    invoke-virtual {v1, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 20
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v7, :cond_3

    const/16 v1, 0x14

    .line 21
    invoke-virtual {p0, v7, v1}, Lcom/xuexiang/xui/widget/button/ButtonView;->setTextDrawable(Landroid/graphics/drawable/Drawable;I)Lcom/xuexiang/xui/widget/button/ButtonView;

    :cond_3
    if-eqz v8, :cond_4

    if-eqz v9, :cond_4

    new-array v1, p2, [I

    .line 22
    fill-array-data v1, :array_0

    const-class v2, I

    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[I

    new-array v2, v6, [I

    const v3, 0x10100a1

    aput v3, v2, v0

    .line 23
    aput-object v2, v1, v0

    new-array v2, v6, [I

    const v3, 0x10100a7

    aput v3, v2, v0

    .line 24
    aput-object v2, v1, v6

    new-array v2, v0, [I

    .line 25
    aput-object v2, v1, p2

    .line 26
    new-instance v2, Landroid/content/res/ColorStateList;

    new-array p1, p1, [I

    aput v9, p1, v0

    aput v9, p1, v6

    aput v8, p1, p2

    invoke-direct {v2, v1, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 27
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_4
    if-nez v9, :cond_6

    .line 28
    iget p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->mSelectedSolidColor:I

    if-eqz p1, :cond_5

    goto :goto_1

    .line 29
    :cond_5
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setClickable(Z)V

    goto :goto_2

    .line 30
    :cond_6
    :goto_1
    invoke-virtual {p0, v6}, Landroid/widget/TextView;->setClickable(Z)V

    :goto_2
    return-void

    :array_0
    .array-data 4
        0x3
        0x1
    .end array-data
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->mSelectedSolidColor:I

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/widget/TextView;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->mSelectedSolidColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->postInvalidate()V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 8
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->mSelectedSolidColor:I

    if-eqz v0, :cond_2

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->mNormalSolidColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 11
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/TextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setRadius(IIII)Lcom/xuexiang/xui/widget/button/ButtonView;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    const/16 v1, 0x8

    new-array v1, v1, [F

    int-to-float p1, p1

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 v2, 0x1

    aput p1, v1, v2

    int-to-float p1, p3

    const/4 p3, 0x2

    aput p1, v1, p3

    const/4 p3, 0x3

    aput p1, v1, p3

    int-to-float p1, p4

    const/4 p3, 0x4

    aput p1, v1, p3

    const/4 p3, 0x5

    aput p1, v1, p3

    int-to-float p1, p2

    const/4 p2, 0x6

    aput p1, v1, p2

    const/4 p2, 0x7

    aput p1, v1, p2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setSelectedSolidColor(I)Lcom/xuexiang/xui/widget/button/ButtonView;
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setClickable(Z)V

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->mSelectedSolidColor:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setClickable(Z)V

    :goto_0
    return-object p0
.end method

.method public setSelectedTextColor(II)Lcom/xuexiang/xui/widget/button/ButtonView;
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    const/4 v2, 0x2

    new-array v3, v2, [I

    .line 2
    fill-array-data v3, :array_0

    const-class v4, I

    invoke-static {v4, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[I

    new-array v4, v1, [I

    const v5, 0x10100a1

    aput v5, v4, v0

    .line 3
    aput-object v4, v3, v0

    new-array v4, v1, [I

    const v5, 0x10100a7

    aput v5, v4, v0

    .line 4
    aput-object v4, v3, v1

    new-array v4, v0, [I

    .line 5
    aput-object v4, v3, v2

    .line 6
    new-instance v4, Landroid/content/res/ColorStateList;

    const/4 v5, 0x3

    new-array v5, v5, [I

    aput p2, v5, v0

    aput p2, v5, v1

    aput p1, v5, v2

    invoke-direct {v4, v3, v5}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 7
    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setClickable(Z)V

    :goto_0
    return-object p0

    nop

    :array_0
    .array-data 4
        0x3
        0x1
    .end array-data
.end method

.method public setSolidColor(I)Lcom/xuexiang/xui/widget/button/ButtonView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setStrokeColorAndWidth(II)Lcom/xuexiang/xui/widget/button/ButtonView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    return-object p0
.end method

.method public setTextDrawable(II)Lcom/xuexiang/xui/widget/button/ButtonView;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/ButtonView;->setTextDrawable(Landroid/graphics/drawable/Drawable;I)Lcom/xuexiang/xui/widget/button/ButtonView;

    :cond_0
    return-object p0
.end method

.method public setTextDrawable(Landroid/graphics/drawable/Drawable;I)Lcom/xuexiang/xui/widget/button/ButtonView;
    .locals 2

    .line 3
    new-instance v0, Lcom/xuexiang/xui/utils/SpanUtils;

    invoke-direct {v0}, Lcom/xuexiang/xui/utils/SpanUtils;-><init>()V

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, Lcom/xuexiang/xui/utils/SpanUtils;->appendImage(Landroid/graphics/drawable/Drawable;I)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, p2, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->appendSpace(II)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/utils/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    .line 7
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->setBackgroundColor(I)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/xuexiang/xui/utils/SpanUtils;->create()Landroid/text/SpannableStringBuilder;

    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method
