.class Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->moveIndicatorWithAnimator(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

.field final synthetic val$direction:I

.field final synthetic val$targetBottom:F

.field final synthetic val$targetTop:F


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;IFF)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->val$direction:I

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->val$targetBottom:F

    iput p4, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->val$targetTop:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->val$direction:I

    const/4 v1, 0x0

    const-wide/16 v2, 0x64

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-lez v0, :cond_0

    new-array v0, v6, [F

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->access$800(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;)F

    move-result v1

    aput v1, v0, v5

    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->val$targetBottom:F

    aput v1, v0, v4

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 3
    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$1;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;)V

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v0, v6, [F

    .line 5
    iget-object v6, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-static {v6}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->access$900(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;)F

    move-result v6

    aput v6, v0, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->val$targetTop:F

    aput v5, v0, v4

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 6
    new-instance v2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$2;

    invoke-direct {v2, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$2;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;)V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    goto :goto_0

    :cond_0
    if-gez v0, :cond_1

    new-array v0, v6, [F

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->access$900(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;)F

    move-result v1

    aput v1, v0, v5

    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->val$targetTop:F

    aput v1, v0, v4

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 8
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$3;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$3;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;)V

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v0, v6, [F

    .line 9
    iget-object v6, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-static {v6}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->access$800(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;)F

    move-result v6

    aput v6, v0, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->val$targetBottom:F

    aput v5, v0, v4

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 10
    new-instance v2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$4;

    invoke-direct {v2, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$4;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;)V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v1, :cond_2

    .line 11
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-static {v2, v3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->access$1002(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;Landroid/animation/AnimatorSet;)Landroid/animation/AnimatorSet;

    .line 12
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->access$1000(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;)Landroid/animation/AnimatorSet;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->access$1000(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;)Landroid/animation/AnimatorSet;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    :cond_2
    return-void
.end method
