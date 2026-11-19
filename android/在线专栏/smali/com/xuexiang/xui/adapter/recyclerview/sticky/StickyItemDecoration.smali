.class public Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$n;
.source "SourceFile"


# instance fields
.field private mAdapter:Landroidx/recyclerview/widget/RecyclerView$g;

.field private mAdapterDataObserver:Landroidx/recyclerview/widget/RecyclerView$i;

.field private mEnableStickyHead:Z

.field private mFirstVisiblePosition:I

.field private mInto:[I

.field private mOnStickyChangedListener:Lcom/xuexiang/xui/adapter/recyclerview/sticky/OnStickyChangedListener;

.field private mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

.field private mStickyHeadPosition:I

.field private mStickyHeadType:I


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$n;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mEnableStickyHead:Z

    .line 3
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration$1;-><init>(Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;)V

    iput-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mAdapterDataObserver:Landroidx/recyclerview/widget/RecyclerView$i;

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    .line 5
    iput p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadType:I

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->reset()V

    return-void
.end method

.method private calculateStickyHeadPosition(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p1

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->findFirstVisiblePosition(Landroidx/recyclerview/widget/RecyclerView$o;)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mFirstVisiblePosition:I

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->findStickyHeadPosition(I)I

    move-result p1

    if-ltz p1, :cond_0

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadPosition:I

    if-eq v0, p1, :cond_0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadPosition:I

    :cond_0
    return-void
.end method

.method private checkCache(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mAdapter:Landroidx/recyclerview/widget/RecyclerView$g;

    if-eq v0, p1, :cond_0

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mAdapter:Landroidx/recyclerview/widget/RecyclerView$g;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadPosition:I

    if-eqz p1, :cond_0

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mAdapterDataObserver:Landroidx/recyclerview/widget/RecyclerView$i;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$g;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method private findFirstCompletelyVisiblePosition(Landroidx/recyclerview/widget/RecyclerView$o;)I
    .locals 4

    .line 1
    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v1

    goto :goto_1

    .line 3
    :cond_0
    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_1

    .line 4
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v1

    goto :goto_1

    .line 5
    :cond_1
    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v0, :cond_3

    .line 6
    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v0

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mInto:[I

    .line 7
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m([I)[I

    const p1, 0x7fffffff

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mInto:[I

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_2

    aget v3, v0, v1

    .line 9
    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move v1, p1

    :cond_3
    :goto_1
    return v1
.end method

.method private findFirstVisiblePosition(Landroidx/recyclerview/widget/RecyclerView$o;)I
    .locals 4

    .line 1
    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v1

    goto :goto_1

    .line 3
    :cond_0
    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_1

    .line 4
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v1

    goto :goto_1

    .line 5
    :cond_1
    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v0, :cond_3

    .line 6
    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v0

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mInto:[I

    .line 7
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r([I)[I

    const p1, 0x7fffffff

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mInto:[I

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_2

    aget v3, v0, v1

    .line 9
    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move v1, p1

    :cond_3
    :goto_1
    return v1
.end method

.method private findStickyHeadPosition(I)I
    .locals 1

    :goto_0
    if-ltz p1, :cond_1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mAdapter:Landroidx/recyclerview/widget/RecyclerView$g;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->getItemViewType(I)I

    move-result v0

    .line 2
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->isStickyHeadType(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method private isStickyHead(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mAdapter:Landroidx/recyclerview/widget/RecyclerView$g;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->getItemViewType(I)I

    move-result p1

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->isStickyHeadType(I)Z

    move-result p1

    return p1
.end method

.method private isStickyHeadType(I)Z
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadType:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->reset()V

    :cond_0
    return-void
.end method


# virtual methods
.method public enableStickyHead(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mEnableStickyHead:Z

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$y;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$n;->onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$y;)V

    .line 2
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->checkCache(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 3
    iget-object p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mAdapter:Landroidx/recyclerview/widget/RecyclerView$g;

    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    if-nez p3, :cond_0

    goto/16 :goto_2

    .line 4
    :cond_0
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->calculateStickyHeadPosition(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 5
    iget-boolean p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mEnableStickyHead:Z

    if-eqz p3, :cond_5

    iget p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mFirstVisiblePosition:I

    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadPosition:I

    if-lt p3, v0, :cond_5

    const/4 p3, -0x1

    if-eq v0, p3, :cond_5

    .line 6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result p1

    int-to-float p1, p1

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p1, p3

    iget-object p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    invoke-virtual {p3}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->getChildHeight()I

    move-result p3

    int-to-float p3, p3

    const v0, 0x3c23d70a    # 0.01f

    add-float/2addr p3, v0

    invoke-virtual {p2, p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    move-result-object p1

    .line 7
    iget-object p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadPosition:I

    invoke-virtual {p3, v0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->onPositionChanged(I)V

    const/4 p3, 0x0

    if-eqz p1, :cond_1

    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, p2, p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->isStickyHead(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-ltz v0, :cond_2

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->getChildHeight()I

    move-result p1

    sub-int p3, v0, p1

    .line 11
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mOnStickyChangedListener:Lcom/xuexiang/xui/adapter/recyclerview/sticky/OnStickyChangedListener;

    if-nez p1, :cond_3

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->onScrolling(I)V

    goto :goto_1

    .line 13
    :cond_3
    invoke-interface {p1, p3}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/OnStickyChangedListener;->onScrolling(I)V

    :goto_1
    const/4 p1, 0x1

    .line 14
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_7

    if-eqz p3, :cond_7

    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mOnStickyChangedListener:Lcom/xuexiang/xui/adapter/recyclerview/sticky/OnStickyChangedListener;

    if-nez p1, :cond_4

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->onNotEnoughHighScroll()V

    goto :goto_2

    .line 17
    :cond_4
    invoke-interface {p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/OnStickyChangedListener;->onNotEnoughHighScroll()V

    goto :goto_2

    .line 18
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mOnStickyChangedListener:Lcom/xuexiang/xui/adapter/recyclerview/sticky/OnStickyChangedListener;

    if-nez p1, :cond_6

    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    invoke-virtual {p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->onInVisible()V

    goto :goto_2

    .line 20
    :cond_6
    invoke-interface {p1}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/OnStickyChangedListener;->onInVisible()V

    :cond_7
    :goto_2
    return-void
.end method

.method public recycle()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mStickyHeadContainer:Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyHeadContainer;->recycle()V

    .line 3
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mAdapter:Landroidx/recyclerview/widget/RecyclerView$g;

    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mAdapterDataObserver:Landroidx/recyclerview/widget/RecyclerView$i;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$g;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mOnStickyChangedListener:Lcom/xuexiang/xui/adapter/recyclerview/sticky/OnStickyChangedListener;

    return-void
.end method

.method public setOnStickyChangedListener(Lcom/xuexiang/xui/adapter/recyclerview/sticky/OnStickyChangedListener;)Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/StickyItemDecoration;->mOnStickyChangedListener:Lcom/xuexiang/xui/adapter/recyclerview/sticky/OnStickyChangedListener;

    return-object p0
.end method
