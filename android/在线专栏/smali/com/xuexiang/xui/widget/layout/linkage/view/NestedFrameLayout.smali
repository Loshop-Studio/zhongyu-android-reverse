.class public Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/k;


# instance fields
.field private mChildHelper:Landroidx/core/view/l;

.field private mParentHelper:Landroidx/core/view/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p1, Landroidx/core/view/l;

    invoke-direct {p1, p0}, Landroidx/core/view/l;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mChildHelper:Landroidx/core/view/l;

    .line 5
    new-instance p1, Landroidx/core/view/o;

    invoke-direct {p1, p0}, Landroidx/core/view/o;-><init>(Landroid/view/ViewGroup;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mParentHelper:Landroidx/core/view/o;

    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->setNestedScrollingEnabled(Z)V

    return-void
.end method


# virtual methods
.method public dispatchNestedFling(FFZ)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/l;->a(FFZ)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/l;->b(FF)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/core/view/l;->c(II[I[I)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 6

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mChildHelper:Landroidx/core/view/l;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/core/view/l;->f(IIII[I)Z

    move-result p1

    return p1
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->startNestedScroll(I)Z

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public getNestedScrollAxes()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mParentHelper:Landroidx/core/view/o;

    invoke-virtual {v0}, Landroidx/core/view/o;->a()I

    move-result v0

    return v0
.end method

.method public hasNestedScrollingParent()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0}, Landroidx/core/view/l;->k()Z

    move-result v0

    return v0
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0}, Landroidx/core/view/l;->m()Z

    move-result v0

    return v0
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    invoke-virtual {p0, p2, p3, p4}, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->dispatchNestedFling(FFZ)Z

    move-result p1

    return p1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->dispatchNestedPreFling(FF)Z

    move-result p1

    return p1
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p3, p4, p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->dispatchNestedPreScroll(II[I[I)Z

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->dispatchNestedScroll(IIII[I)Z

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mParentHelper:Landroidx/core/view/o;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/o;->b(Landroid/view/View;Landroid/view/View;I)V

    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mParentHelper:Landroidx/core/view/o;

    invoke-virtual {v0, p1}, Landroidx/core/view/o;->d(Landroid/view/View;)V

    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0, p1}, Landroidx/core/view/l;->n(Z)V

    return-void
.end method

.method public startNestedScroll(I)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0, p1}, Landroidx/core/view/l;->p(I)Z

    move-result p1

    return p1
.end method

.method public stopNestedScroll()V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/NestedFrameLayout;->mChildHelper:Landroidx/core/view/l;

    invoke-virtual {v0}, Landroidx/core/view/l;->r()V

    return-void
.end method
