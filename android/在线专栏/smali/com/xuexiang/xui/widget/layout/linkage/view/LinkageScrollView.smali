.class public Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;
.super Landroidx/core/widget/NestedScrollView;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/layout/linkage/ILinkageScroll;


# instance fields
.field private mLinkageChildrenEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected onScrollChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/core/widget/NestedScrollView;->onScrollChanged(IIII)V

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setVerticalScrollBarEnabled(Z)V

    const/4 p1, -0x1

    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;->mLinkageChildrenEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    if-eqz p1, :cond_0

    .line 5
    invoke-interface {p1, p0}, Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;->onContentScrollToTop(Landroid/view/View;)V

    :cond_0
    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;->mLinkageChildrenEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    if-eqz p1, :cond_1

    .line 8
    invoke-interface {p1, p0}, Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;->onContentScrollToBottom(Landroid/view/View;)V

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;->mLinkageChildrenEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    if-eqz p1, :cond_2

    .line 10
    invoke-interface {p1, p0}, Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;->onContentScroll(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView$1;-><init>(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;)V

    return-object v0
.end method

.method public setChildLinkageEvent(Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;->mLinkageChildrenEvent:Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1, p0}, Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;->onContentScroll(Landroid/view/View;)V

    :cond_0
    return-void
.end method
