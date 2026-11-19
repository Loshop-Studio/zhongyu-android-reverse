.class Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$2;
.super Landroidx/recyclerview/widget/RecyclerView$s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$2;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$s;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$2;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->access$100(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getCurrentPosition()I

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$2;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->access$000(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$2;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->access$002(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;I)I

    :cond_0
    if-nez p2, :cond_1

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$2;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->setPlaying(Z)V

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$2;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->refreshIndicator()V

    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$2;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->setPlaying(Z)V

    :cond_0
    return-void
.end method
