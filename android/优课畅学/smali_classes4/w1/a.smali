.class public Lw1/a;
.super Landroid/animation/ValueAnimator;
.source "SourceFile"


# direct methods
.method public constructor <init>(JFJ)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/animation/ValueAnimator;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    new-array v0, v0, [F

    .line 6
    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput v1, v0, v2

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    aput p3, v0, v1

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p4, p5}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lx1/a;

    .line 25
    .line 26
    sget-object p2, Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;->i:Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;

    .line 27
    .line 28
    invoke-direct {p1, p2}, Lx1/a;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/interpolator/Ease;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
