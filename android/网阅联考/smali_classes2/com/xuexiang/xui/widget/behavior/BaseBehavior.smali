.class public abstract Lcom/xuexiang/xui/widget/behavior/BaseBehavior;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I

.field public b:Z

.field public c:Z

.field public d:Lq0/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x1

    .line 5
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->b:Z

    .line 6
    .line 7
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->c:Z

    .line 8
    .line 9
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->a:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public abstract a(Landroid/view/View;)V
.end method

.method public onNestedPreScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->a(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 p2, 0x2

    .line 9
    if-le p1, p2, :cond_1

    .line 10
    .line 11
    if-gez p5, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->d:Lq0/a;

    .line 14
    .line 15
    invoke-interface {p1}, Lq0/a;->getState()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->d:Lq0/a;

    .line 22
    .line 23
    invoke-interface {p1}, Lq0/a;->show()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-lez p5, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->d:Lq0/a;

    .line 30
    .line 31
    invoke-interface {p1}, Lq0/a;->getState()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/4 p2, 0x1

    .line 36
    if-ne p1, p2, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->d:Lq0/a;

    .line 39
    .line 40
    invoke-interface {p1}, Lq0/a;->hide()V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void
.end method

.method public onStartNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;I)Z
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
