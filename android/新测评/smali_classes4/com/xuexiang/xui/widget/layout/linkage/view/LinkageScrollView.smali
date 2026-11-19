.class public Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;
.super Landroidx/core/widget/NestedScrollView;
.source "SourceFile"

# interfaces
.implements Lm3/b;


# virtual methods
.method public a()Lm3/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$a;-><init>(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public onScrollChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/core/widget/NestedScrollView;->onScrollChanged(IIII)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 6
    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setChildLinkageEvent(Lm3/a;)V
    .locals 0

    .line 1
    return-void
.end method
