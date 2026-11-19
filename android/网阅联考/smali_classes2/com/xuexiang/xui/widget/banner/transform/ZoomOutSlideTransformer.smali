.class public Lcom/xuexiang/xui/widget/banner/transform/ZoomOutSlideTransformer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$PageTransformer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public transformPage(Landroid/view/View;F)V
    .locals 7

    .line 1
    const/high16 v0, -0x40800000    # -1.0f

    .line 2
    .line 3
    cmpl-float v0, p2, v0

    .line 4
    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    cmpg-float v0, p2, v1

    .line 10
    .line 11
    if-gtz v0, :cond_2

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-float v0, v0

    .line 18
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    sub-float v2, v1, v2

    .line 23
    .line 24
    const v3, 0x3f59999a    # 0.85f

    .line 25
    .line 26
    .line 27
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    sub-float/2addr v1, v2

    .line 32
    mul-float v4, v0, v1

    .line 33
    .line 34
    const/high16 v5, 0x40000000    # 2.0f

    .line 35
    .line 36
    div-float/2addr v4, v5

    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    int-to-float v6, v6

    .line 42
    mul-float/2addr v6, v1

    .line 43
    div-float/2addr v6, v5

    .line 44
    const/high16 v1, 0x3f000000    # 0.5f

    .line 45
    .line 46
    mul-float/2addr v0, v1

    .line 47
    invoke-virtual {p1, v0}, Landroid/view/View;->setPivotY(F)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    cmpg-float p2, p2, v0

    .line 52
    .line 53
    if-gez p2, :cond_1

    .line 54
    .line 55
    div-float/2addr v4, v5

    .line 56
    sub-float/2addr v6, v4

    .line 57
    invoke-virtual {p1, v6}, Landroid/view/View;->setTranslationX(F)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    neg-float p2, v6

    .line 62
    div-float/2addr v4, v5

    .line 63
    add-float/2addr p2, v4

    .line 64
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-virtual {p1, v2}, Landroid/view/View;->setScaleX(F)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroid/view/View;->setScaleY(F)V

    .line 71
    .line 72
    .line 73
    sub-float/2addr v2, v3

    .line 74
    const p2, 0x3e199998    # 0.14999998f

    .line 75
    .line 76
    .line 77
    div-float/2addr v2, p2

    .line 78
    const p2, 0x3dccccd0    # 0.100000024f

    .line 79
    .line 80
    .line 81
    mul-float/2addr v2, p2

    .line 82
    const p2, 0x3f666666    # 0.9f

    .line 83
    .line 84
    .line 85
    add-float/2addr v2, p2

    .line 86
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 87
    .line 88
    .line 89
    :cond_2
    return-void
.end method
