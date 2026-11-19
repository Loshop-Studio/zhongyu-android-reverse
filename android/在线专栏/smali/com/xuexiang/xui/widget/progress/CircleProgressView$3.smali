.class Lcom/xuexiang/xui/widget/progress/CircleProgressView$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/progress/CircleProgressView;->startProgressAnimation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/progress/CircleProgressView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/progress/CircleProgressView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView$3;->this$0:Lcom/xuexiang/xui/widget/progress/CircleProgressView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView$3;->this$0:Lcom/xuexiang/xui/widget/progress/CircleProgressView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->access$100(Lcom/xuexiang/xui/widget/progress/CircleProgressView;)Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView$3;->this$0:Lcom/xuexiang/xui/widget/progress/CircleProgressView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->access$100(Lcom/xuexiang/xui/widget/progress/CircleProgressView;)Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView$3;->this$0:Lcom/xuexiang/xui/widget/progress/CircleProgressView;

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;->onCircleProgressFinished(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView$3;->this$0:Lcom/xuexiang/xui/widget/progress/CircleProgressView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->access$100(Lcom/xuexiang/xui/widget/progress/CircleProgressView;)Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView$3;->this$0:Lcom/xuexiang/xui/widget/progress/CircleProgressView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->access$100(Lcom/xuexiang/xui/widget/progress/CircleProgressView;)Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView$3;->this$0:Lcom/xuexiang/xui/widget/progress/CircleProgressView;

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;->onCircleProgressStart(Landroid/view/View;)V

    :cond_0
    return-void
.end method
