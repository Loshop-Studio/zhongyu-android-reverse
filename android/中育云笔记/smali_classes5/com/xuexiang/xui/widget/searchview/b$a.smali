.class public final Lcom/xuexiang/xui/widget/searchview/b$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/searchview/b;->a(Landroid/view/View;Lcom/xuexiang/xui/widget/searchview/b$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/searchview/b$b;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/searchview/b$b;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/b$a;->a:Lcom/xuexiang/xui/widget/searchview/b$b;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/searchview/b$a;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/b$a;->a:Lcom/xuexiang/xui/widget/searchview/b$b;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/b$a;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/searchview/b$b;->onAnimationCancel(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/b$a;->a:Lcom/xuexiang/xui/widget/searchview/b$b;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/b$a;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/searchview/b$b;->onAnimationEnd(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/b$a;->a:Lcom/xuexiang/xui/widget/searchview/b$b;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/b$a;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/searchview/b$b;->onAnimationStart(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method
