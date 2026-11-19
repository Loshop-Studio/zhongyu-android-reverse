.class public Lcom/xuexiang/xui/widget/banner/transform/ZoomOutSlideTransformer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$PageTransformer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
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
    if-gez v0, :cond_1

    .line 8
    .line 9
    cmpg-float v0, p2, v1

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    int-to-float v0, v0

    .line 20
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    sub-float v2, v1, v2

    .line 25
    .line 26
    const v3, 0x3f59999a    # 0.85f

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    sub-float/2addr v1, v2

    .line 34
    mul-float v4, v0, v1

    .line 35
    .line 36
    const/high16 v5, 0x40000000    # 2.0f

    .line 37
    .line 38
    div-float/2addr v4, v5

    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    int-to-float v6, v6

    .line 44
    mul-float/2addr v6, v1

    .line 45
    div-float/2addr v6, v5

    .line 46
    const/high16 v1, 0x3f000000    # 0.5f

    .line 47
    .line 48
    mul-float/2addr v0, v1

    .line 49
    invoke-virtual {p1, v0}, Landroid/view/View;->setPivotY(F)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    cmpg-float p2, p2, v0

    .line 54
    .line 55
    if-gez p2, :cond_2

    .line 56
    .line 57
    div-float/2addr v4, v5

    .line 58
    sub-float/2addr v6, v4

    .line 59
    invoke-virtual {p1, v6}, Landroid/view/View;->setTranslationX(F)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    neg-float p2, v6

    .line 64
    div-float/2addr v4, v5

    .line 65
    add-float/2addr p2, v4

    .line 66
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setScaleX(F)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2}, Landroid/view/View;->setScaleY(F)V

    .line 73
    .line 74
    .line 75
    sub-float/2addr v2, v3

    .line 76
    const p2, 0x3e199998    # 0.14999998f

    .line 77
    .line 78
    .line 79
    div-float/2addr v2, p2

    .line 80
    const p2, 0x3dccccd0    # 0.100000024f

    .line 81
    .line 82
    .line 83
    mul-float/2addr v2, p2

    .line 84
    const p2, 0x3f666666    # 0.9f

    .line 85
    .line 86
    .line 87
    add-float/2addr v2, p2

    .line 88
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 89
    .line 90
    .line 91
    return-void
.end method
