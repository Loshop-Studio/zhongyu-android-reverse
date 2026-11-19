.class public Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;
.super Landroidx/recyclerview/widget/RecyclerView$q;
.source "SourceFile"


# instance fields
.field mGravityScroller:Landroid/widget/Scroller;

.field mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private final mScrollListener:Landroidx/recyclerview/widget/RecyclerView$s;

.field private snapToCenter:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$q;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->snapToCenter:Z

    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mScrollListener:Landroidx/recyclerview/widget/RecyclerView$s;

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->snapToCenter:Z

    return p0
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->snapToCenter:Z

    return p1
.end method


# virtual methods
.method public attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->destroyCallbacks()V

    .line 3
    :cond_1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p1

    .line 5
    instance-of v0, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    if-nez v0, :cond_2

    return-void

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->setupCallbacks()V

    .line 7
    new-instance v0, Landroid/widget/Scroller;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-direct {v0, v1, v2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mGravityScroller:Landroid/widget/Scroller;

    .line 8
    check-cast p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    iget-object v0, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->onPageChangeListener:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$OnPageChangeListener;

    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->snapToCenterView(Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$OnPageChangeListener;)V

    :cond_3
    return-void
.end method

.method destroyCallbacks()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mScrollListener:Landroidx/recyclerview/widget/RecyclerView$s;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$s;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Landroidx/recyclerview/widget/RecyclerView$q;)V

    return-void
.end method

.method public onFling(II)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v2

    if-nez v2, :cond_1

    return v1

    .line 3
    :cond_1
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getInfinite()Z

    move-result v2

    if-nez v2, :cond_3

    iget v2, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->mOffset:F

    .line 4
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getMaxOffset()F

    move-result v3

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_2

    iget v2, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->mOffset:F

    .line 5
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getMinOffset()F

    move-result v3

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    :cond_2
    return v1

    .line 6
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getMinFlingVelocity()I

    move-result v1

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mGravityScroller:Landroid/widget/Scroller;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v7, -0x80000000

    const v8, 0x7fffffff

    const/high16 v9, -0x80000000

    const v10, 0x7fffffff

    move v5, p1

    move v6, p2

    invoke-virtual/range {v2 .. v10}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 8
    iget v2, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->mOrientation:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_5

    .line 9
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-le p2, v1, :cond_5

    .line 10
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getCurrentPosition()I

    move-result p1

    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mGravityScroller:Landroid/widget/Scroller;

    invoke-virtual {p2}, Landroid/widget/Scroller;->getFinalY()I

    move-result p2

    int-to-float p2, p2

    iget v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->mInterval:F

    div-float/2addr p2, v1

    .line 12
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getDistanceRatio()F

    move-result v1

    div-float/2addr p2, v1

    float-to-int p2, p2

    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getReverseLayout()Z

    move-result v0

    if-eqz v0, :cond_4

    sub-int/2addr p1, p2

    goto :goto_0

    :cond_4
    add-int/2addr p1, p2

    :goto_0
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    return v3

    .line 14
    :cond_5
    iget p2, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->mOrientation:I

    if-nez p2, :cond_7

    .line 15
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-le p1, v1, :cond_7

    .line 16
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getCurrentPosition()I

    move-result p1

    .line 17
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mGravityScroller:Landroid/widget/Scroller;

    invoke-virtual {p2}, Landroid/widget/Scroller;->getFinalX()I

    move-result p2

    int-to-float p2, p2

    iget v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->mInterval:F

    div-float/2addr p2, v1

    .line 18
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getDistanceRatio()F

    move-result v1

    div-float/2addr p2, v1

    float-to-int p2, p2

    .line 19
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getReverseLayout()Z

    move-result v0

    if-eqz v0, :cond_6

    sub-int/2addr p1, p2

    goto :goto_1

    :cond_6
    add-int/2addr p1, p2

    :goto_1
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    :cond_7
    return v3
.end method

.method setupCallbacks()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getOnFlingListener()Landroidx/recyclerview/widget/RecyclerView$q;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mScrollListener:Landroidx/recyclerview/widget/RecyclerView$s;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$s;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Landroidx/recyclerview/widget/RecyclerView$q;)V

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "An instance of OnFlingListener already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method snapToCenterView(Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$OnPageChangeListener;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getOffsetToCenter()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getOrientation()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(II)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(II)V

    goto :goto_0

    .line 5
    :cond_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->snapToCenter:Z

    :goto_0
    if-eqz p2, :cond_2

    .line 6
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getCurrentPosition()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$OnPageChangeListener;->onPageSelected(I)V

    :cond_2
    return-void
.end method
