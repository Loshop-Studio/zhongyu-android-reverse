.class public final Lcom/xuexiang/xui/widget/banner/recycler/layout/b;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/b;->b:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/b;->a:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
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
    move-result-object p1

    .line 8
    check-cast p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    if-nez p2, :cond_4

    .line 14
    .line 15
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/b;->a:Z

    .line 16
    .line 17
    if-eqz p2, :cond_4

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/b;->a:Z

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/b;->b:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    .line 23
    .line 24
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Z

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Z

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->b()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    int-to-float v1, v1

    .line 36
    iget-boolean v2, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->g:Z

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    iget v2, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget v2, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->j:F

    .line 44
    .line 45
    neg-float v2, v2

    .line 46
    :goto_0
    mul-float/2addr v1, v2

    .line 47
    iget p1, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->d:F

    .line 48
    .line 49
    sub-float/2addr v1, p1

    .line 50
    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 51
    .line 52
    .line 53
    mul-float/2addr v1, p1

    .line 54
    float-to-int p1, v1

    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    iput-boolean p2, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Z

    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    const/4 p1, 0x0

    .line 61
    throw p1

    .line 62
    :cond_3
    iput-boolean p2, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Z

    .line 63
    .line 64
    :cond_4
    :goto_1
    return-void
.end method

.method public final onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    return-void

    .line 7
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/b;->a:Z

    .line 9
    .line 10
    return-void
.end method
