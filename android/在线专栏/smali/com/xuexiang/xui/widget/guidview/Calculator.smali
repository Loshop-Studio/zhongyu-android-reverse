.class Lcom/xuexiang/xui/widget/guidview/Calculator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mBitmapHeight:I

.field private final mBitmapWidth:I

.field private mCircleCenterX:I

.field private mCircleCenterY:I

.field private mCircleRadius:I

.field private mFocusHeight:I

.field private mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

.field private mFocusWidth:I

.field private mHasFocus:Z


# direct methods
.method constructor <init>(Landroid/app/Activity;Lcom/xuexiang/xui/widget/guidview/FocusShape;Landroid/view/View;DZII)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 4
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 5
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 6
    iput v1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mBitmapWidth:I

    const/4 v1, 0x0

    if-eqz p6, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p1}, Lcom/xuexiang/xui/widget/guidview/Utils;->getStatusBarHeight(Landroid/content/Context;)I

    move-result v2

    :goto_0
    sub-int/2addr v0, v2

    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mBitmapHeight:I

    if-eqz p3, :cond_3

    const/4 v0, -0x1

    if-ne p7, v0, :cond_2

    if-eqz p6, :cond_1

    const/4 p7, 0x0

    goto :goto_1

    .line 8
    :cond_1
    invoke-static {p1}, Lcom/xuexiang/xui/widget/guidview/Utils;->getStatusBarHeight(Landroid/content/Context;)I

    move-result p1

    move p7, p1

    :cond_2
    :goto_1
    const/4 p1, 0x2

    new-array p6, p1, [I

    .line 9
    invoke-virtual {p3, p6}, Landroid/view/View;->getLocationInWindow([I)V

    .line 10
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusWidth:I

    .line 11
    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusHeight:I

    .line 12
    iput-object p2, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    aget p2, p6, v1

    .line 13
    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusWidth:I

    div-int/2addr v1, p1

    add-int/2addr p2, v1

    add-int/2addr p2, p8

    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterX:I

    const/4 p2, 0x1

    aget p6, p6, p2

    .line 14
    div-int/2addr v0, p1

    add-int/2addr p6, v0

    sub-int/2addr p6, p7

    iput p6, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterY:I

    .line 15
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-double p6, p1

    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-double v0, p1

    invoke-static {p6, p7, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide p6

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double/2addr p6, v0

    double-to-int p1, p6

    int-to-double p6, p1

    mul-double p6, p6, p4

    double-to-int p1, p6

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleRadius:I

    .line 16
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mHasFocus:Z

    goto :goto_2

    .line 17
    :cond_3
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mHasFocus:Z

    :goto_2
    return-void
.end method


# virtual methods
.method circleRadius(ID)F
    .locals 4

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleRadius:I

    int-to-double v0, v0

    int-to-double v2, p1

    mul-double v2, v2, p2

    add-double/2addr v0, v2

    double-to-float p1, v0

    return p1
.end method

.method getBitmapHeight()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mBitmapHeight:I

    return v0
.end method

.method getBitmapWidth()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mBitmapWidth:I

    return v0
.end method

.method getCircleCenterX()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterX:I

    return v0
.end method

.method getCircleCenterY()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterY:I

    return v0
.end method

.method getFocusHeight()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusHeight:I

    return v0
.end method

.method getFocusShape()Lcom/xuexiang/xui/widget/guidview/FocusShape;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    return-object v0
.end method

.method getFocusWidth()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusWidth:I

    return v0
.end method

.method getViewRadius()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleRadius:I

    return v0
.end method

.method hasFocus()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mHasFocus:Z

    return v0
.end method

.method roundRectBottom(ID)F
    .locals 4

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterY:I

    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusHeight:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    int-to-double v0, v0

    int-to-double v2, p1

    mul-double v2, v2, p2

    add-double/2addr v0, v2

    double-to-float p1, v0

    return p1
.end method

.method roundRectLeft(ID)F
    .locals 4

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterX:I

    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusWidth:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-double v0, v0

    int-to-double v2, p1

    mul-double v2, v2, p2

    sub-double/2addr v0, v2

    double-to-float p1, v0

    return p1
.end method

.method roundRectLeftCircleRadius(ID)F
    .locals 4

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusHeight:I

    div-int/lit8 v0, v0, 0x2

    int-to-double v0, v0

    int-to-double v2, p1

    mul-double v2, v2, p2

    add-double/2addr v0, v2

    double-to-float p1, v0

    return p1
.end method

.method roundRectRight(ID)F
    .locals 4

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterX:I

    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusWidth:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    int-to-double v0, v0

    int-to-double v2, p1

    mul-double v2, v2, p2

    add-double/2addr v0, v2

    double-to-float p1, v0

    return p1
.end method

.method roundRectTop(ID)F
    .locals 4

    iget v0, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterY:I

    iget v1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusHeight:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-double v0, v0

    int-to-double v2, p1

    mul-double v2, v2, p2

    sub-double/2addr v0, v2

    double-to-float p1, v0

    return p1
.end method

.method public setCirclePosition(III)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterX:I

    .line 2
    iput p3, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleRadius:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterY:I

    .line 4
    sget-object p1, Lcom/xuexiang/xui/widget/guidview/FocusShape;->CIRCLE:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mHasFocus:Z

    return-void
.end method

.method public setCircleRadius(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleRadius:I

    return-void
.end method

.method public setRectPosition(IIII)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterX:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mCircleCenterY:I

    .line 3
    iput p3, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusWidth:I

    .line 4
    iput p4, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusHeight:I

    .line 5
    sget-object p1, Lcom/xuexiang/xui/widget/guidview/FocusShape;->ROUNDED_RECTANGLE:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mFocusShape:Lcom/xuexiang/xui/widget/guidview/FocusShape;

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/guidview/Calculator;->mHasFocus:Z

    return-void
.end method
