.class public abstract Lcom/xuexiang/xui/widget/behavior/BaseBehavior;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Z

.field public b:Z

.field public c:Lb/c/a/e/c/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->a:Z

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->b:Z

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    return-void
.end method


# virtual methods
.method public abstract B(Landroid/view/View;)V
.end method

.method public o(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[I)V
    .locals 0

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->B(Landroid/view/View;)V

    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    move-result p1

    const/4 p2, 0x2

    if-le p1, p2, :cond_1

    if-gez p5, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->c:Lb/c/a/e/c/a;

    invoke-interface {p1}, Lb/c/a/e/c/a;->getState()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->c:Lb/c/a/e/c/a;

    invoke-interface {p1}, Lb/c/a/e/c/a;->b()V

    goto :goto_0

    :cond_0
    if-lez p5, :cond_1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->c:Lb/c/a/e/c/a;

    invoke-interface {p1}, Lb/c/a/e/c/a;->getState()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->c:Lb/c/a/e/c/a;

    invoke-interface {p1}, Lb/c/a/e/c/a;->c()V

    :cond_1
    :goto_0
    return-void
.end method

.method public w(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
