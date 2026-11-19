.class public final Lu3/a;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/view/animation/Transformation;->getMatrix()Landroid/graphics/Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget p2, Lcom/xuexiang/xui/widget/textview/label/LabelView;->c:I

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-virtual {p1, p2, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2, p2, p2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
