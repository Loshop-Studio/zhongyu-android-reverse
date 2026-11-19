.class Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;->provideScrollHandler()Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$2;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canScrollVertically(I)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$2;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result p1

    return p1
.end method

.method public flingContent(Landroid/view/View;I)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$2;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->fling(II)Z

    return-void
.end method

.method public getVerticalScrollExtent()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$2;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollExtent()I

    move-result v0

    return v0
.end method

.method public getVerticalScrollOffset()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$2;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    move-result v0

    return v0
.end method

.method public getVerticalScrollRange()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$2;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I

    move-result v0

    return v0
.end method

.method public isScrollable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public scrollContentToBottom()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$2;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->getItemCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$2;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_0
    return-void
.end method

.method public scrollContentToTop()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$2;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    return-void
.end method

.method public stopContentScroll(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$2;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->stopScroll()V

    return-void
.end method
