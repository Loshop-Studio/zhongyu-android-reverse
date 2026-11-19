.class Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->start(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$1;->this$0:Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$1;->this$0:Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->access$000(Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;)Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;->onAnimationCancel(Landroid/animation/Animator;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$1;->this$0:Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->access$000(Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;)Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;->onAnimationEnd(Landroid/animation/Animator;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$1;->this$0:Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->access$000(Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;)Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;->onAnimationRepeat(Landroid/animation/Animator;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$1;->this$0:Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;->access$000(Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator;)Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/banner/anim/BaseAnimator$AnimatorListener;->onAnimationStart(Landroid/animation/Animator;)V

    return-void
.end method
