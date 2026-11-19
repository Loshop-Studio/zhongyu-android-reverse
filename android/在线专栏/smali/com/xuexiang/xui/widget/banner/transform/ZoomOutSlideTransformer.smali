.class public Lcom/xuexiang/xui/widget/banner/transform/ZoomOutSlideTransformer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$j;


# static fields
.field private static final MIN_ALPHA:F = 0.9f

.field private static final MIN_SCALE:F = 0.85f


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public transformPage(Landroid/view/View;F)V
    .locals 7

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v1, p2, v1

    if-gez v1, :cond_0

    cmpg-float v1, p2, v0

    if-gtz v1, :cond_2

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    .line 2
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sub-float v2, v0, v2

    const v3, 0x3f59999a    # 0.85f

    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    sub-float/2addr v0, v2

    mul-float v4, v1, v0

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    mul-float v6, v6, v0

    div-float/2addr v6, v5

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float v1, v1, v0

    .line 4
    invoke-virtual {p1, v1}, Landroid/view/View;->setPivotY(F)V

    const/4 v0, 0x0

    cmpg-float p2, p2, v0

    if-gez p2, :cond_1

    div-float/2addr v4, v5

    sub-float/2addr v6, v4

    .line 5
    invoke-virtual {p1, v6}, Landroid/view/View;->setTranslationX(F)V

    goto :goto_0

    :cond_1
    neg-float p2, v6

    div-float/2addr v4, v5

    add-float/2addr p2, v4

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 7
    :goto_0
    invoke-virtual {p1, v2}, Landroid/view/View;->setScaleX(F)V

    .line 8
    invoke-virtual {p1, v2}, Landroid/view/View;->setScaleY(F)V

    const p2, 0x3f666666    # 0.9f

    sub-float/2addr v2, v3

    const v0, 0x3e199998    # 0.14999998f

    div-float/2addr v2, v0

    const v0, 0x3dccccd0    # 0.100000024f

    mul-float v2, v2, v0

    add-float/2addr v2, p2

    .line 9
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_2
    return-void
.end method
