.class Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->doCircularEnterAnimation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 3
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v0

    int-to-double v0, v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    int-to-double v2, v2

    .line 4
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-int v0, v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5100(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5200(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    if-gtz v1, :cond_1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5300(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    if-gtz v1, :cond_1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5400(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    if-lez v1, :cond_2

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5600(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v3

    invoke-static {v1, v3}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5502(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;I)I

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5800(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v3

    invoke-static {v1, v3}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5702(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;I)I

    :cond_2
    const/4 v1, 0x0

    .line 10
    :goto_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 11
    invoke-static {v3}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5500(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v4

    iget-object v5, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v5}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5700(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v5

    int-to-float v1, v1

    int-to-float v0, v0

    .line 12
    invoke-static {v3, v4, v5, v1, v0}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$5900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    move-result v1

    int-to-long v3, v1

    invoke-virtual {v0, v3, v4}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$5;->this$0:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->access$3900(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Landroid/app/Activity;

    move-result-object v1

    const v3, 0x10c0002

    invoke-static {v1, v3}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 15
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return v2
.end method
