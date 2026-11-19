.class Lcom/xuexiang/xui/widget/searchview/AnimationUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;
    }
.end annotation


# static fields
.field public static ANIMATION_DURATION_LONG:I = 0x320

.field public static ANIMATION_DURATION_MEDIUM:I = 0x190

.field public static ANIMATION_DURATION_SHORT:I = 0x96


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "u can\'t instantiate me..."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static crossFadeViews(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->ANIMATION_DURATION_SHORT:I

    invoke-static {p0, p1, v0}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->crossFadeViews(Landroid/view/View;Landroid/view/View;I)V

    return-void
.end method

.method static crossFadeViews(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 2
    invoke-static {p0, p2}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->fadeInView(Landroid/view/View;I)V

    .line 3
    invoke-static {p1, p2}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->fadeOutView(Landroid/view/View;I)V

    return-void
.end method

.method static fadeInView(Landroid/view/View;)V
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->ANIMATION_DURATION_SHORT:I

    invoke-static {p0, v0}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->fadeInView(Landroid/view/View;I)V

    return-void
.end method

.method static fadeInView(Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->fadeInView(Landroid/view/View;ILcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;)V

    return-void
.end method

.method static fadeInView(Landroid/view/View;ILcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    if-eqz p2, :cond_0

    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$1;

    invoke-direct {v0, p2}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$1;-><init>(Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-static {p0}, Landroidx/core/view/u;->c(Landroid/view/View;)Landroidx/core/view/y;

    move-result-object p0

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p0, p2}, Landroidx/core/view/y;->a(F)Landroidx/core/view/y;

    move-result-object p0

    int-to-long p1, p1

    invoke-virtual {p0, p1, p2}, Landroidx/core/view/y;->d(J)Landroidx/core/view/y;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroidx/core/view/y;->f(Landroidx/core/view/z;)Landroidx/core/view/y;

    return-void
.end method

.method static fadeOutView(Landroid/view/View;)V
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->ANIMATION_DURATION_SHORT:I

    invoke-static {p0, v0}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->fadeOutView(Landroid/view/View;I)V

    return-void
.end method

.method static fadeOutView(Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->fadeOutView(Landroid/view/View;ILcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;)V

    return-void
.end method

.method static fadeOutView(Landroid/view/View;ILcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;)V
    .locals 2

    .line 3
    invoke-static {p0}, Landroidx/core/view/u;->c(Landroid/view/View;)Landroidx/core/view/y;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/core/view/y;->a(F)Landroidx/core/view/y;

    move-result-object p0

    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Landroidx/core/view/y;->d(J)Landroidx/core/view/y;

    move-result-object p0

    new-instance p1, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$3;

    invoke-direct {p1, p2}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$3;-><init>(Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;)V

    invoke-virtual {p0, p1}, Landroidx/core/view/y;->f(Landroidx/core/view/z;)Landroidx/core/view/y;

    return-void
.end method

.method static reveal(Landroid/view/View;Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/4 v2, 0x1

    const/high16 v3, 0x41c00000    # 24.0f

    .line 3
    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    sub-int/2addr v0, v1

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    .line 6
    invoke-static {p0, v0, v1, v3, v2}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    move-result-object v0

    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$2;

    invoke-direct {v1, p1, p0}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$2;-><init>(Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 9
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return-void
.end method
