.class final Lcom/xuexiang/xui/widget/searchview/AnimationUtils$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/searchview/AnimationUtils;->fadeInView(Landroid/view/View;ILcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$listener:Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$1;->val$listener:Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$1;->val$listener:Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;->onAnimationEnd(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    :cond_0
    return-void
.end method

.method public onAnimationStart(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$1;->val$listener:Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/searchview/AnimationUtils$AnimationListener;->onAnimationStart(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    :cond_0
    return-void
.end method
