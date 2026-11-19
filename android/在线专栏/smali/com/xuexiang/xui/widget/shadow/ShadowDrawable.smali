.class public Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;
    }
.end annotation


# static fields
.field public static final SHAPE_RECTANGLE:I = 0x0

.field public static final SHAPE_ROUND:I = 0x1


# instance fields
.field private mBgColor:[I

.field private mBgPaint:Landroid/graphics/Paint;

.field private mOffsetX:I

.field private mOffsetY:I

.field private mRect:Landroid/graphics/RectF;

.field private mShadowPaint:Landroid/graphics/Paint;

.field private mShadowRadius:I

.field private mShape:I

.field private mShapeRadius:I


# direct methods
.method private constructor <init>(I[IIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShape:I

    .line 4
    iput-object p2, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mBgColor:[I

    .line 5
    iput p3, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShapeRadius:I

    .line 6
    iput p5, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShadowRadius:I

    .line 7
    iput p6, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mOffsetX:I

    .line 8
    iput p7, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mOffsetY:I

    .line 9
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShadowPaint:Landroid/graphics/Paint;

    const/4 p2, 0x0

    .line 10
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShadowPaint:Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShadowPaint:Landroid/graphics/Paint;

    int-to-float p3, p5

    int-to-float p5, p6

    int-to-float p6, p7

    invoke-virtual {p1, p3, p5, p6, p4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShadowPaint:Landroid/graphics/Paint;

    new-instance p3, Landroid/graphics/PorterDuffXfermode;

    sget-object p4, Landroid/graphics/PorterDuff$Mode;->DST_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p3, p4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 14
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mBgPaint:Landroid/graphics/Paint;

    .line 15
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method

.method synthetic constructor <init>(I[IIIIIILcom/xuexiang/xui/widget/shadow/ShadowDrawable$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;-><init>(I[IIIIII)V

    return-void
.end method

.method public static fromAttributeSet(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;
    .locals 9

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->ShadowDrawable:[I

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p0

    .line 2
    sget p1, Lcom/xuexiang/xui/R$styleable;->ShadowDrawable_sd_shadowRadius:I

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_sd_shadow_radius:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    .line 3
    sget v0, Lcom/xuexiang/xui/R$styleable;->ShadowDrawable_sd_shadowColor:I

    sget v1, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->DEFAULT_SHADOW_COLOR:I

    invoke-virtual {p0, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    .line 4
    sget v1, Lcom/xuexiang/xui/R$styleable;->ShadowDrawable_sd_shapeType:I

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 5
    sget v3, Lcom/xuexiang/xui/R$styleable;->ShadowDrawable_sd_shapeRadius:I

    sget v4, Lcom/xuexiang/xui/R$dimen;->default_sd_shape_radius:I

    invoke-static {v4}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v4

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 6
    sget v4, Lcom/xuexiang/xui/R$styleable;->ShadowDrawable_sd_offsetX:I

    invoke-virtual {p0, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    .line 7
    sget v5, Lcom/xuexiang/xui/R$styleable;->ShadowDrawable_sd_offsetY:I

    invoke-virtual {p0, v5, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    .line 8
    sget v6, Lcom/xuexiang/xui/R$styleable;->ShadowDrawable_sd_bgColor:I

    sget v7, Lcom/xuexiang/xui/R$color;->xui_config_color_white:I

    invoke-static {v7}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v7

    invoke-virtual {p0, v6, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    .line 9
    sget v7, Lcom/xuexiang/xui/R$styleable;->ShadowDrawable_sd_secondBgColor:I

    const/4 v8, -0x1

    invoke-virtual {p0, v7, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    .line 10
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 11
    new-instance p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;-><init>()V

    .line 12
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShape(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p0

    .line 13
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShapeRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p0

    .line 14
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShadowColor(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p0

    .line 15
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShadowRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p0

    .line 16
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setOffsetX(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p0

    .line 17
    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setOffsetY(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p0

    if-eq v7, v8, :cond_0

    const/4 p1, 0x2

    new-array p1, p1, [I

    aput v6, p1, v2

    const/4 v0, 0x1

    aput v7, p1, v0

    .line 18
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setBgColor([I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setBgColor(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->build()Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;

    move-result-object p0

    return-object p0
.end method

.method public static setShadowDrawable(Landroid/view/View;IIIII)V
    .locals 1

    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;-><init>()V

    .line 4
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShapeRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShadowColor(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShadowRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 7
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setOffsetX(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 8
    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setOffsetY(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->build()Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;

    move-result-object p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    .line 10
    invoke-virtual {p0, p2, p3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 11
    invoke-static {p0, p1}, Landroidx/core/view/u;->t0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static setShadowDrawable(Landroid/view/View;IIIIII)V
    .locals 1

    .line 12
    new-instance v0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;-><init>()V

    .line 13
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setBgColor(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 14
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShapeRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 15
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShadowColor(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 16
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShadowRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 17
    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setOffsetX(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 18
    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setOffsetY(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->build()Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;

    move-result-object p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    .line 20
    invoke-virtual {p0, p2, p3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 21
    invoke-static {p0, p1}, Landroidx/core/view/u;->t0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static setShadowDrawable(Landroid/view/View;IIIIIII)V
    .locals 1

    .line 22
    new-instance v0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;-><init>()V

    .line 23
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShape(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 24
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setBgColor(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 25
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShapeRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 26
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShadowColor(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 27
    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShadowRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 28
    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setOffsetX(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 29
    invoke-virtual {p1, p7}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setOffsetY(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->build()Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;

    move-result-object p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    .line 31
    invoke-virtual {p0, p2, p3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 32
    invoke-static {p0, p1}, Landroidx/core/view/u;->t0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static setShadowDrawable(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 2
    invoke-static {p0, p1}, Landroidx/core/view/u;->t0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static setShadowDrawable(Landroid/view/View;[IIIIII)V
    .locals 1

    .line 33
    new-instance v0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;-><init>()V

    .line 34
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setBgColor([I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 35
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShapeRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 36
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShadowColor(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 37
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setShadowRadius(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 38
    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setOffsetX(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 39
    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->setOffsetY(I)Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;

    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable$Builder;->build()Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;

    move-result-object p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    .line 41
    invoke-virtual {p0, p2, p3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 42
    invoke-static {p0, p1}, Landroidx/core/view/u;->t0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mBgColor:[I

    const/high16 v1, 0x40000000    # 2.0f

    if-eqz v0, :cond_1

    .line 2
    array-length v2, v0

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mBgPaint:Landroid/graphics/Paint;

    const/4 v3, 0x0

    aget v0, v0, v3

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mBgPaint:Landroid/graphics/Paint;

    new-instance v10, Landroid/graphics/LinearGradient;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float v4, v2, v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    iget v5, v2, Landroid/graphics/RectF;->right:F

    .line 5
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float v6, v2, v1

    iget-object v7, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mBgColor:[I

    const/4 v8, 0x0

    sget-object v9, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v2, v10

    invoke-direct/range {v2 .. v9}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 6
    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 7
    :cond_1
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShape:I

    if-nez v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShapeRadius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShadowPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShapeRadius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mBgPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    div-float/2addr v3, v1

    iget-object v4, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShadowPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    div-float/2addr v3, v1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mBgPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :goto_1
    return-void
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShadowPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public setBounds(IIII)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShadowRadius:I

    add-int/2addr p1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mOffsetX:I

    sub-int/2addr p1, v2

    int-to-float p1, p1

    add-int/2addr p2, v1

    iget v3, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mOffsetY:I

    sub-int/2addr p2, v3

    int-to-float p2, p2

    sub-int/2addr p3, v1

    sub-int/2addr p3, v2

    int-to-float p3, p3

    sub-int/2addr p4, v1

    sub-int/2addr p4, v3

    int-to-float p4, p4

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mRect:Landroid/graphics/RectF;

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/shadow/ShadowDrawable;->mShadowPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method
