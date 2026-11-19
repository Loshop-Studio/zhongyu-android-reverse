.class public Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;
.super Landroidx/recyclerview/widget/RecyclerView$s;
.source "SourceFile"


# instance fields
.field private mAutoSet:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$s;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->mAutoSet:Z

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$s;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    check-cast v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->onPageChangeListener:Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$OnPageChangeListener;

    if-eqz v1, :cond_1

    .line 4
    invoke-interface {v1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$OnPageChangeListener;->onPageScrollStateChanged(I)V

    :cond_1
    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez p2, :cond_7

    .line 5
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->mAutoSet:Z

    if-eqz p2, :cond_3

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getCurrentPosition()I

    move-result p1

    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$OnPageChangeListener;->onPageSelected(I)V

    .line 7
    :cond_2
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->mAutoSet:Z

    goto :goto_1

    .line 8
    :cond_3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getOffsetToCenter()I

    move-result p2

    if-eqz p2, :cond_5

    .line 9
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getOrientation()I

    move-result v0

    if-ne v0, v2, :cond_4

    .line 10
    invoke-virtual {p1, v3, p2}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(II)V

    goto :goto_0

    .line 11
    :cond_4
    invoke-virtual {p1, p2, v3}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(II)V

    .line 12
    :goto_0
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->mAutoSet:Z

    goto :goto_1

    :cond_5
    if-eqz v1, :cond_6

    .line 13
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getCurrentPosition()I

    move-result p1

    invoke-interface {v1, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager$OnPageChangeListener;->onPageSelected(I)V

    .line 14
    :cond_6
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->mAutoSet:Z

    goto :goto_1

    :cond_7
    if-eq p2, v2, :cond_8

    const/4 p1, 0x2

    if-ne p2, p1, :cond_9

    .line 15
    :cond_8
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->mAutoSet:Z

    :cond_9
    :goto_1
    return-void
.end method
