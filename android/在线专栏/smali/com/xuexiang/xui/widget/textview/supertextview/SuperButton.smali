.class public Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
.super Landroidx/appcompat/widget/AppCompatButton;
.source "SourceFile"


# static fields
.field public static final BL_TR:I = 0x5

.field public static final BOTTOM_TOP:I = 0x4

.field public static final BR_TL:I = 0x3

.field public static final LEFT_RIGHT:I = 0x6

.field public static final LINE:I = 0x2

.field public static final OVAL:I = 0x1

.field public static final RECTANGLE:I = 0x0

.field public static final RIGHT_LEFT:I = 0x2

.field public static final RING:I = 0x3

.field public static final TEXT_GRAVITY_BOTTOM:I = 0x4

.field public static final TEXT_GRAVITY_CENTER:I = 0x0

.field public static final TEXT_GRAVITY_LEFT:I = 0x1

.field public static final TEXT_GRAVITY_RIGHT:I = 0x2

.field public static final TEXT_GRAVITY_TOP:I = 0x3

.field public static final TL_BR:I = 0x7

.field public static final TOP_BOTTOM:I = 0x0

.field public static final TR_BL:I = 0x1

.field private static final linear:I = 0x0

.field private static final radial:I = 0x1

.field private static final sweep:I = 0x2


# instance fields
.field private cornersBottomLeftRadius:F

.field private cornersBottomRightRadius:F

.field private cornersRadius:F

.field private cornersTopLeftRadius:F

.field private cornersTopRightRadius:F

.field private defaultColor:I

.field private defaultSelectorColor:I

.field private gradientAngle:I

.field private gradientCenterColor:I

.field private gradientCenterX:I

.field private gradientCenterY:I

.field private gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

.field private gradientEndColor:I

.field private gradientGradientRadius:I

.field private gradientOrientation:I

.field private gradientStartColor:I

.field private gradientType:I

.field private gradientUseLevel:Z

.field private gravity:I

.field private mAlphaViewHelper:Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

.field private mContext:Landroid/content/Context;

.field private selectorDisableColor:I

.field private selectorNormalColor:I

.field private selectorPressedColor:I

.field private shapeType:I

.field private sizeHeight:I

.field private sizeWidth:I

.field private solidColor:I

.field private strokeColor:I

.field private strokeDashGap:F

.field private strokeDashWidth:F

.field private strokeWidth:I

.field private useSelector:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;)V

    const/high16 v0, 0x20000000

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->defaultColor:I

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->defaultSelectorColor:I

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x20000000

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->defaultColor:I

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->defaultSelectorColor:I

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p3, 0x20000000

    .line 10
    iput p3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->defaultColor:I

    .line 11
    iput p3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->defaultSelectorColor:I

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private dip2px(Landroid/content/Context;F)I
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float p2, p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1
.end method

.method private getAlphaViewHelper()Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mAlphaViewHelper:Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mAlphaViewHelper:Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mAlphaViewHelper:Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    return-object v0
.end method

.method private getAttr(Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->SuperButton:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGravity:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gravity:I

    .line 3
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sShapeType:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->shapeType:I

    .line 4
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSolidColor:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->defaultColor:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->solidColor:I

    .line 5
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSelectorPressedColor:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->defaultSelectorColor:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->selectorPressedColor:I

    .line 6
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSelectorDisableColor:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->defaultSelectorColor:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->selectorDisableColor:I

    .line 7
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSelectorNormalColor:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->defaultSelectorColor:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->selectorNormalColor:I

    .line 8
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sCornersRadius:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersRadius:F

    .line 9
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sCornersTopLeftRadius:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersTopLeftRadius:F

    .line 10
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sCornersTopRightRadius:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersTopRightRadius:F

    .line 11
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sCornersBottomLeftRadius:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersBottomLeftRadius:F

    .line 12
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sCornersBottomRightRadius:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersBottomRightRadius:F

    .line 13
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sStrokeWidth:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeWidth:I

    .line 14
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sStrokeDashWidth:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeDashWidth:F

    .line 15
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sStrokeDashGap:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeDashGap:F

    .line 16
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sStrokeColor:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->defaultColor:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeColor:I

    .line 17
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSizeWidth:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->sizeWidth:I

    .line 18
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSizeHeight:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mContext:Landroid/content/Context;

    const/high16 v3, 0x42400000    # 48.0f

    invoke-direct {p0, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->dip2px(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->sizeHeight:I

    .line 19
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientOrientation:I

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientOrientation:I

    .line 20
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientAngle:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientAngle:I

    .line 21
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientCenterX:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientCenterX:I

    .line 22
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientCenterY:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientCenterY:I

    .line 23
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientGradientRadius:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientGradientRadius:I

    .line 24
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientStartColor:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientStartColor:I

    .line 25
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientCenterColor:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientCenterColor:I

    .line 26
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientEndColor:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientEndColor:I

    .line 27
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientType:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientType:I

    .line 28
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientUseLevel:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientUseLevel:Z

    .line 29
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperButton_sUseSelector:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->useSelector:Z

    .line 30
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private getOrientation(I)Landroid/graphics/drawable/GradientDrawable$Orientation;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :pswitch_0
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TL_BR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    goto :goto_0

    .line 2
    :pswitch_1
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    goto :goto_0

    .line 3
    :pswitch_2
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->BL_TR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    goto :goto_0

    .line 4
    :pswitch_3
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->BOTTOM_TOP:Landroid/graphics/drawable/GradientDrawable$Orientation;

    goto :goto_0

    .line 5
    :pswitch_4
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->BR_TL:Landroid/graphics/drawable/GradientDrawable$Orientation;

    goto :goto_0

    .line 6
    :pswitch_5
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    goto :goto_0

    .line 7
    :pswitch_6
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TR_BL:Landroid/graphics/drawable/GradientDrawable$Orientation;

    goto :goto_0

    .line 8
    :pswitch_7
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private init()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/Button;->setClickable(Z)V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->useSelector:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getSelector()Landroid/graphics/drawable/StateListDrawable;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getDrawable(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->setSGravity()V

    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mContext:Landroid/content/Context;

    .line 2
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAttr(Landroid/util/AttributeSet;)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->init()V

    return-void
.end method

.method private isEnableChangeAlpha()Z
    .locals 2

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->isUseGradientColor()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->selectorNormalColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->selectorPressedColor:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private isUseGradientColor()Z
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientOrientation:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private setBorder()V
    .locals 5

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeWidth:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeColor:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeDashWidth:F

    iget v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeDashGap:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(IIFF)V

    return-void
.end method

.method private setOrientation()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->isUseGradientColor()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientOrientation:I

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getOrientation(I)Landroid/graphics/drawable/GradientDrawable$Orientation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientCenterColor:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    new-array v1, v3, [I

    iget v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientStartColor:I

    aput v5, v1, v2

    iget v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientEndColor:I

    aput v5, v1, v4

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    const/4 v5, 0x3

    new-array v5, v5, [I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientStartColor:I

    aput v6, v5, v2

    aput v0, v5, v4

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientEndColor:I

    aput v0, v5, v3

    invoke-virtual {v1, v5}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 6
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientType:I

    if-eqz v0, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    goto :goto_1

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientGradientRadius:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientRadius(F)V

    goto :goto_1

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 11
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientUseLevel:Z

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setUseLevel(Z)V

    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientCenterX:I

    if-eqz v0, :cond_5

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientCenterY:I

    if-eqz v1, :cond_5

    .line 13
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    int-to-float v0, v0

    int-to-float v1, v1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientCenter(FF)V

    goto :goto_2

    .line 14
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->solidColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :cond_5
    :goto_2
    return-void
.end method

.method private setRadius()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->shapeType:I

    if-nez v0, :cond_1

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersRadius:F

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    const/16 v1, 0x8

    new-array v1, v1, [F

    const/4 v2, 0x0

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersTopLeftRadius:F

    aput v3, v1, v2

    const/4 v2, 0x1

    aput v3, v1, v2

    const/4 v2, 0x2

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersTopRightRadius:F

    aput v3, v1, v2

    const/4 v2, 0x3

    aput v3, v1, v2

    const/4 v2, 0x4

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersBottomRightRadius:F

    aput v3, v1, v2

    const/4 v2, 0x5

    aput v3, v1, v2

    const/4 v2, 0x6

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersBottomLeftRadius:F

    aput v3, v1, v2

    const/4 v2, 0x7

    aput v3, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    :cond_1
    :goto_0
    return-void
.end method

.method private setSGravity()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gravity:I

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x51

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/Button;->setGravity(I)V

    goto :goto_0

    :cond_1
    const/16 v0, 0x31

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/Button;->setGravity(I)V

    goto :goto_0

    :cond_2
    const v0, 0x800015

    .line 4
    invoke-virtual {p0, v0}, Landroid/widget/Button;->setGravity(I)V

    goto :goto_0

    :cond_3
    const v0, 0x800013

    .line 5
    invoke-virtual {p0, v0}, Landroid/widget/Button;->setGravity(I)V

    goto :goto_0

    :cond_4
    const/16 v0, 0x11

    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/Button;->setGravity(I)V

    :goto_0
    return-void
.end method

.method private setSelectorColor(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientOrientation:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    const v0, -0x101009e

    if-eq p1, v0, :cond_2

    const v0, 0x101009e

    if-eq p1, v0, :cond_1

    const v0, 0x10100a7

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->selectorPressedColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->selectorNormalColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->selectorDisableColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method private setShape()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->shapeType:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    goto :goto_0

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    goto :goto_0

    .line 5
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    :goto_0
    return-void
.end method

.method private setSize()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->shapeType:I

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->sizeWidth:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->sizeHeight:I

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getDrawable(I)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->setShape()V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->setOrientation()V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->setSize()V

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->setBorder()V

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->setRadius()V

    .line 7
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->setSelectorColor(I)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    return-object p1
.end method

.method public getSelector()Landroid/graphics/drawable/StateListDrawable;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 2
    fill-array-data v1, :array_0

    const v2, 0x10100a7

    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getDrawable(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    const v3, -0x101009e

    aput v3, v1, v2

    .line 3
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getDrawable(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array v1, v2, [I

    const v2, 0x101009e

    .line 4
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getDrawable(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v0

    :array_0
    .array-data 4
        0x10100a7
        0x101009e
    .end array-data
.end method

.method public setChangeAlphaWhenDisable(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->isEnableChangeAlpha()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;->setChangeAlphaWhenDisable(Z)V

    :cond_0
    return-void
.end method

.method public setChangeAlphaWhenPress(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->isEnableChangeAlpha()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;->setChangeAlphaWhenPress(Z)V

    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->isEnableChangeAlpha()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;->onEnabledChanged(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method public setPressed(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Button;->setPressed(Z)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->isEnableChangeAlpha()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;->onPressedChanged(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method public setShapeCornersBottomLeftRadius(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->dip2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersBottomLeftRadius:F

    return-object p0
.end method

.method public setShapeCornersBottomRightRadius(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->dip2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersBottomRightRadius:F

    return-object p0
.end method

.method public setShapeCornersRadius(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->dip2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersRadius:F

    return-object p0
.end method

.method public setShapeCornersTopLeftRadius(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->dip2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersTopLeftRadius:F

    return-object p0
.end method

.method public setShapeCornersTopRightRadius(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->dip2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->cornersTopRightRadius:F

    return-object p0
.end method

.method public setShapeGradientCenterColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientCenterColor:I

    return-object p0
.end method

.method public setShapeGradientCenterX(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientCenterX:I

    return-object p0
.end method

.method public setShapeGradientCenterY(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientCenterY:I

    return-object p0
.end method

.method public setShapeGradientEndColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientEndColor:I

    return-object p0
.end method

.method public setShapeGradientGradientRadius(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientGradientRadius:I

    return-object p0
.end method

.method public setShapeGradientOrientation(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientOrientation:I

    return-object p0
.end method

.method public setShapeGradientStartColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientStartColor:I

    return-object p0
.end method

.method public setShapeGradientType(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientType:I

    return-object p0
.end method

.method public setShapeGradientUseLevel(Z)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gradientUseLevel:Z

    return-object p0
.end method

.method public setShapeSelectorDisableColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->selectorDisableColor:I

    return-object p0
.end method

.method public setShapeSelectorNormalColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->selectorNormalColor:I

    return-object p0
.end method

.method public setShapeSelectorPressedColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->selectorPressedColor:I

    return-object p0
.end method

.method public setShapeSizeHeight(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->sizeHeight:I

    return-object p0
.end method

.method public setShapeSizeWidth(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->sizeWidth:I

    return-object p0
.end method

.method public setShapeSolidColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->solidColor:I

    return-object p0
.end method

.method public setShapeStrokeColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeColor:I

    return-object p0
.end method

.method public setShapeStrokeDashGap(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->dip2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeDashGap:F

    return-object p0
.end method

.method public setShapeStrokeDashWidth(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->dip2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeDashWidth:F

    return-object p0
.end method

.method public setShapeStrokeWidth(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->mContext:Landroid/content/Context;

    int-to-float p1, p1

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->dip2px(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->strokeWidth:I

    return-object p0
.end method

.method public setShapeType(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->shapeType:I

    return-object p0
.end method

.method public setShapeUseSelector(Z)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->useSelector:Z

    return-object p0
.end method

.method public setTextGravity(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->gravity:I

    return-object p0
.end method

.method public setUseShape()V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->init()V

    return-void
.end method
