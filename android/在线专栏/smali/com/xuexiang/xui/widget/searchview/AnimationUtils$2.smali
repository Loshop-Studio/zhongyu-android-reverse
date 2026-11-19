.class final Lcom/xuexiang/xui/widget/searchview/AnimationUtils$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->reveal(Landroid/view/View;Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$listener:Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$2;->val$listener:Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$2;->val$view:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$2;->val$listener:Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$2;->val$view:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;->onAnimationCancel(Landroid/view/View;)Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$2;->val$listener:Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$2;->val$view:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;->onAnimationEnd(Landroid/view/View;)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$2;->val$listener:Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$2;->val$view:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;->onAnimationStart(Landroid/view/View;)Z

    return-void
.end method
