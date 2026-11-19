.class public Lcom/xuexiang/xui/widget/banner/transform/RotateDownTransformer;
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
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-float v1, v1

    .line 11
    const/high16 v2, -0x3e900000    # -15.0f

    .line 12
    .line 13
    mul-float/2addr p2, v2

    .line 14
    const/high16 v2, -0x40600000    # -1.25f

    .line 15
    .line 16
    mul-float/2addr p2, v2

    .line 17
    const/high16 v2, 0x3f000000    # 0.5f

    .line 18
    .line 19
    mul-float/2addr v0, v2

    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setPivotX(F)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/view/View;->setPivotY(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/view/View;->setRotation(F)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
