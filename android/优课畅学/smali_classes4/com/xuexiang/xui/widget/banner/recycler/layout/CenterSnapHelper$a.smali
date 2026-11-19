.class public Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;->b:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;->a:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

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
    goto :goto_0

    .line 13
    :cond_0
    if-nez p2, :cond_2

    .line 14
    .line 15
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;->a:Z

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;->a:Z

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;->b:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    .line 23
    .line 24
    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;->b:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-static {p2, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->b(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;Z)Z

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;->b:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p2, p1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->c(Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$a;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;->b:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    .line 44
    .line 45
    invoke-static {p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->b(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;Z)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
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
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$a;->a:Z

    .line 9
    .line 10
    return-void
.end method
