.class Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 4

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x3e8

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->access$000(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)I

    move-result p1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->access$100(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/banner/recycler/layout/BannerLayoutManager;->getCurrentPosition()I

    move-result v1

    if-ne p1, v1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->access$004(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)I

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->access$200(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->access$000(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)I

    move-result v1

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    iget-object v1, p1, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->mHandler:Landroid/os/Handler;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->access$300(Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;)I

    move-result p1

    int-to-long v2, p1

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout$1;->this$0:Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/banner/recycler/BannerLayout;->refreshIndicator()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
