.class public Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->a:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    check-cast v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez p2, :cond_4

    .line 16
    .line 17
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->a:Z

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->a:Z

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->n()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->getOrientation()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-ne v0, v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1, v2, p2}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(II)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {p1, p2, v2}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(II)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->a:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->a:Z

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    if-eq p2, v1, :cond_5

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    if-ne p2, p1, :cond_6

    .line 53
    .line 54
    :cond_5
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->a:Z

    .line 55
    .line 56
    :cond_6
    :goto_1
    return-void
.end method
