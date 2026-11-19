.class public Lcom/xuexiang/xui/widget/behavior/ToolBarBehavior;
.super Lcom/xuexiang/xui/widget/behavior/BaseBehavior;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public B(Landroid/view/View;)V
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->a:Z

    iget-object v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->c:Lb/c/a/e/c/a;

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result p1

    invoke-interface {v0, p1}, Lb/c/a/e/c/a;->a(F)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->c:Lb/c/a/e/c/a;

    const/16 v0, 0xe9

    invoke-interface {p1, v0}, Lb/c/a/e/c/a;->d(I)V

    :cond_0
    return-void
.end method

.method public d(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->b:Z

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    .line 1
    new-instance p1, Lb/c/a/e/c/g;

    invoke-direct {p1, p2}, Lb/c/a/e/c/g;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->c:Lb/c/a/e/c/a;

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->b:Z

    :cond_0
    return p3
.end method
