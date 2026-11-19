.class public Lcom/xuexiang/xui/widget/banner/transform/DepthTransformer;
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
.method public final transformPage(Landroid/view/View;F)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v1, p2, v0

    .line 3
    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    cmpg-float v1, p2, v2

    .line 9
    .line 10
    if-gez v1, :cond_0

    .line 11
    .line 12
    sub-float v0, v2, p2

    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sub-float/2addr v2, v1

    .line 19
    const/high16 v1, 0x3e800000    # 0.25f

    .line 20
    .line 21
    mul-float/2addr v2, v1

    .line 22
    const/high16 v1, 0x3f400000    # 0.75f

    .line 23
    .line 24
    add-float/2addr v2, v1

    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    int-to-float v1, v1

    .line 30
    neg-float p2, p2

    .line 31
    mul-float/2addr p2, v1

    .line 32
    move v3, v0

    .line 33
    move v0, p2

    .line 34
    move p2, v2

    .line 35
    move v2, v3

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move p2, v2

    .line 38
    :goto_0
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleX(F)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleY(F)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
