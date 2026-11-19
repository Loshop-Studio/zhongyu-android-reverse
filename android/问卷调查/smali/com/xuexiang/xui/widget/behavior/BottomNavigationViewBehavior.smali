.class public Lcom/xuexiang/xui/widget/behavior/BottomNavigationViewBehavior;
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
    .locals 0

    return-void
.end method

.method public d(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public g(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->b:Z

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->b:Z

    .line 1
    new-instance p1, Lb/c/a/e/c/g;

    invoke-direct {p1, p2}, Lb/c/a/e/c/g;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->c:Lb/c/a/e/c/a;

    invoke-virtual {p2}, Landroid/view/View;->getY()F

    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->c:Lb/c/a/e/c/a;

    const/16 p2, 0x91d

    invoke-interface {p1, p2}, Lb/c/a/e/c/a;->d(I)V

    :cond_0
    return p3
.end method
