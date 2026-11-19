.class public Lcom/xuexiang/xui/widget/banner/transform/DepthTransformer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$j;


# static fields
.field private static final MIN_SCALE_DEPTH:F = 0.75f


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public transformPage(Landroid/view/View;F)V
    .locals 6

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v2, p2, v0

    if-lez v2, :cond_0

    cmpg-float v2, p2, v1

    if-gez v2, :cond_0

    sub-float v0, v1, p2

    const/high16 v2, 0x3f400000    # 0.75f

    const/high16 v3, 0x3e800000    # 0.25f

    .line 1
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    sub-float/2addr v1, v4

    mul-float v1, v1, v3

    add-float/2addr v1, v2

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    neg-float p2, p2

    mul-float p2, p2, v2

    move v5, v0

    move v0, p2

    move p2, v1

    move v1, v5

    goto :goto_0

    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    .line 3
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleX(F)V

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method
