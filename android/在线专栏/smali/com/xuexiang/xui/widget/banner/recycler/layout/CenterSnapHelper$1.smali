.class Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;
.super Landroidx/recyclerview/widget/RecyclerView$s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field mScrolled:Z

.field final synthetic this$0:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$s;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;->mScrolled:Z

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$s;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p1, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->onPageChangeListener:Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$OnPageChangeListener;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$OnPageChangeListener;->onPageScrollStateChanged(I)V

    :cond_1
    if-nez p2, :cond_3

    .line 5
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;->mScrolled:Z

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;->mScrolled:Z

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->access$000(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 8
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    const/4 v1, 0x1

    invoke-static {p2, v1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->access$002(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;Z)Z

    .line 9
    iget-object p2, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    invoke-virtual {p2, p1, v0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->snapToCenterView(Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager$OnPageChangeListener;)V

    goto :goto_0

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;

    invoke-static {p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->access$002(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;Z)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    if-nez p2, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper$1;->mScrolled:Z

    :cond_1
    return-void
.end method
