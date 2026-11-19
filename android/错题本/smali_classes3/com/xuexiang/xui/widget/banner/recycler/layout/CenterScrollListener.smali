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
.method public final onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 4

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
    goto :goto_1

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
    return-void

    .line 24
    :cond_1
    iget p2, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 25
    .line 26
    iget v3, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 27
    .line 28
    div-float/2addr p2, v3

    .line 29
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    int-to-float p2, p2

    .line 38
    iget-boolean v3, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->g:Z

    .line 39
    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    iget v3, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iget v3, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->j:F

    .line 46
    .line 47
    neg-float v3, v3

    .line 48
    :goto_0
    mul-float/2addr p2, v3

    .line 49
    iget v0, v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/OverFlyingLayoutManager;->e:F

    .line 50
    .line 51
    sub-float/2addr p2, v0

    .line 52
    const/high16 v0, 0x3f800000    # 1.0f

    .line 53
    .line 54
    mul-float/2addr p2, v0

    .line 55
    float-to-int p2, p2

    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    invoke-virtual {p1, p2, v2}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(II)V

    .line 59
    .line 60
    .line 61
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->a:Z

    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->a:Z

    .line 65
    .line 66
    return-void

    .line 67
    :cond_4
    if-eq p2, v1, :cond_6

    .line 68
    .line 69
    const/4 p1, 0x2

    .line 70
    if-ne p2, p1, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    :goto_1
    return-void

    .line 74
    :cond_6
    :goto_2
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterScrollListener;->a:Z

    .line 75
    .line 76
    return-void
.end method
